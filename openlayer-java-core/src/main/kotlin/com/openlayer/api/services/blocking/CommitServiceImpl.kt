// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.CommitRetrieveParams
import com.openlayer.api.models.CommitRetrieveResponse
import com.openlayer.api.services.blocking.commits.TestResultService
import com.openlayer.api.services.blocking.commits.TestResultServiceImpl

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun testResults(): TestResultService = testResults

    private val retrieveHandler: Handler<CommitRetrieveResponse> =
        jsonHandler<CommitRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a project version (commit) by its id. */
    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CommitRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("versions", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
