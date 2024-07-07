// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.InferencePipelineTestResultListParams
import com.openlayer.api.models.InferencePipelineTestResultListResponse
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class TestResultServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<InferencePipelineTestResultListResponse> =
        jsonHandler<InferencePipelineTestResultListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the latest test results for an inference pipeline. */
    override fun list(
        params: InferencePipelineTestResultListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InferencePipelineTestResultListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inference-pipelines", params.getPathParam(0), "results")
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
