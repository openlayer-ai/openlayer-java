// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

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
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.InferencePipelineDeleteParams
import com.openlayer.api.models.InferencePipelineRetrieveParams
import com.openlayer.api.models.InferencePipelineRetrieveResponse
import com.openlayer.api.models.InferencePipelineUpdateParams
import com.openlayer.api.models.InferencePipelineUpdateResponse
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsyncImpl
import com.openlayer.api.services.async.inferencePipelines.RowServiceAsync
import com.openlayer.api.services.async.inferencePipelines.RowServiceAsyncImpl
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsync
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class InferencePipelineServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InferencePipelineServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptions) }

    private val rows: RowServiceAsync by lazy { RowServiceAsyncImpl(clientOptions) }

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun data(): DataServiceAsync = data

    override fun rows(): RowServiceAsync = rows

    override fun testResults(): TestResultServiceAsync = testResults

    private val retrieveHandler: Handler<InferencePipelineRetrieveResponse> =
        jsonHandler<InferencePipelineRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve inference pipeline. */
    override fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete inference pipeline. */
    override fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("inference-pipelines", params.getPathParam(0))
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { deleteHandler.handle(it) } }
    }
}
