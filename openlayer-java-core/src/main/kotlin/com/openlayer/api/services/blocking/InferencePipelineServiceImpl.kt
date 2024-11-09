// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.emptyHandler
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.json
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.InferencePipelineDeleteParams
import com.openlayer.api.models.InferencePipelineRetrieveParams
import com.openlayer.api.models.InferencePipelineRetrieveResponse
import com.openlayer.api.models.InferencePipelineUpdateParams
import com.openlayer.api.models.InferencePipelineUpdateResponse
import com.openlayer.api.services.blocking.inferencePipelines.DataService
import com.openlayer.api.services.blocking.inferencePipelines.DataServiceImpl
import com.openlayer.api.services.blocking.inferencePipelines.RowService
import com.openlayer.api.services.blocking.inferencePipelines.RowServiceImpl
import com.openlayer.api.services.blocking.inferencePipelines.TestResultService
import com.openlayer.api.services.blocking.inferencePipelines.TestResultServiceImpl

class InferencePipelineServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InferencePipelineService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataService by lazy { DataServiceImpl(clientOptions) }

    private val rows: RowService by lazy { RowServiceImpl(clientOptions) }

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun data(): DataService = data

    override fun rows(): RowService = rows

    override fun testResults(): TestResultService = testResults

    private val retrieveHandler: Handler<InferencePipelineRetrieveResponse> =
        jsonHandler<InferencePipelineRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve inference pipeline. */
    override fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions
    ): InferencePipelineRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<InferencePipelineUpdateResponse> =
        jsonHandler<InferencePipelineUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update inference pipeline. */
    override fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions
    ): InferencePipelineUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
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

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete inference pipeline. */
    override fun delete(params: InferencePipelineDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
