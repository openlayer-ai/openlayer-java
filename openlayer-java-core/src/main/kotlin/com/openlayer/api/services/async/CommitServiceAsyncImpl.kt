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
import com.openlayer.api.core.json
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.CommitCreateParams
import com.openlayer.api.models.CommitCreateResponse
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import com.openlayer.api.services.async.commits.TestResultServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class CommitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun testResults(): TestResultServiceAsync = testResults

    private val createHandler: Handler<CommitCreateResponse> =
        jsonHandler<CommitCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new commit (project version) in a project. */
    override fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CommitCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("projects", params.getPathParam(0), "versions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
