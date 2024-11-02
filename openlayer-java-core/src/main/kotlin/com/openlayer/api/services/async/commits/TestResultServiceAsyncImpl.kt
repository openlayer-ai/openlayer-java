// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.CommitTestResultListParams
import com.openlayer.api.models.CommitTestResultListResponse
import java.util.concurrent.CompletableFuture

class TestResultServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CommitTestResultListResponse> =
        jsonHandler<CommitTestResultListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the test results for a project commit (project version). */
    override fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CommitTestResultListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("versions", params.getPathParam(0), "results")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
