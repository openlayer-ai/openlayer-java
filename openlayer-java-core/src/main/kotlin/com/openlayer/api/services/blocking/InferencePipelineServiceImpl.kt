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
import com.openlayer.api.core.prepare
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

class InferencePipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InferencePipelineService {

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
        requestOptions: RequestOptions,
    ): InferencePipelineRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
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

    private val updateHandler: Handler<InferencePipelineUpdateResponse> =
        jsonHandler<InferencePipelineUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update inference pipeline. */
    override fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions,
    ): InferencePipelineUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
