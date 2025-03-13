// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.CommitRetrieveParams
import com.openlayer.api.models.CommitRetrieveResponse
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import com.openlayer.api.services.async.commits.TestResultServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CommitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun testResults(): TestResultServiceAsync = testResults

    private val retrieveHandler: Handler<CommitRetrieveResponse> =
        jsonHandler<CommitRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a project version (commit) by its id. */
    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("versions", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
