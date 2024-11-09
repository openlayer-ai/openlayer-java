// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

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
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import com.openlayer.api.models.InferencePipelineRowUpdateResponse

class RowServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RowService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<InferencePipelineRowUpdateResponse> =
        jsonHandler<InferencePipelineRowUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update an inference data point in an inference pipeline. */
    override fun update(
        params: InferencePipelineRowUpdateParams,
        requestOptions: RequestOptions
    ): InferencePipelineRowUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("inference-pipelines", params.getPathParam(0), "rows")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
