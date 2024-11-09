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
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import com.openlayer.api.models.InferencePipelineRowUpdateResponse
import java.util.concurrent.CompletableFuture

class RowServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RowServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val updateHandler: Handler<InferencePipelineRowUpdateResponse> =
        jsonHandler<InferencePipelineRowUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update an inference data point in an inference pipeline. */
    override fun update(
        params: InferencePipelineRowUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InferencePipelineRowUpdateResponse> {
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
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
