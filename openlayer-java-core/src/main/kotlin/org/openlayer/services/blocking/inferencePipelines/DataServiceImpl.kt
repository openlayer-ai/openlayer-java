// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.inferencePipelines

import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.InferencePipelineDataStreamParams
import org.openlayer.models.InferencePipelineDataStreamResponse
import org.openlayer.services.errorHandler
import org.openlayer.services.json
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

class DataServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DataService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val streamHandler: Handler<InferencePipelineDataStreamResponse> =
        jsonHandler<InferencePipelineDataStreamResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Stream production data to an inference pipeline in Openlayer. */
    override fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions
    ): InferencePipelineDataStreamResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inference-pipelines", params.getPathParam(0), "data-stream")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
