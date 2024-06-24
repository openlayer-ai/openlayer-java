// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.async.inferencePipelines

import java.util.concurrent.CompletableFuture
import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.InferencePipelineTestResultListParams
import org.openlayer.models.InferencePipelineTestResultListResponse
import org.openlayer.services.errorHandler
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

class TestResultServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<InferencePipelineTestResultListResponse> =
        jsonHandler<InferencePipelineTestResultListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the test results under an inference pipeline. */
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
