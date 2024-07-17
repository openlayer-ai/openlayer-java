// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.InferencePipelineRowStreamParams
import com.openlayer.api.models.InferencePipelineRowStreamResponse
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.withErrorHandler

class RowServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RowService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val streamHandler: Handler<InferencePipelineRowStreamResponse> =
        jsonHandler<InferencePipelineRowStreamResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update an inference data point in an inference pipeline. */
    override fun stream(
        params: InferencePipelineRowStreamParams,
        requestOptions: RequestOptions
    ): InferencePipelineRowStreamResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("inference-pipelines", params.getPathParam(0), "rows")
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
