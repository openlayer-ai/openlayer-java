// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

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
import com.openlayer.api.models.InferencePipelineDataStreamParams
import com.openlayer.api.models.InferencePipelineDataStreamResponse
import java.util.concurrent.CompletableFuture

class DataServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DataServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val streamHandler: Handler<InferencePipelineDataStreamResponse> =
        jsonHandler<InferencePipelineDataStreamResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Publish an inference data point to an inference pipeline. */
    override fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InferencePipelineDataStreamResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inference-pipelines", params.getPathParam(0), "data-stream")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { streamHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
