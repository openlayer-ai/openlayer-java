// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.emptyHandler
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.inferencepipelines.InferencePipelineDeleteParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveResponse
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateResponse
import com.openlayer.api.services.async.inferencepipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencepipelines.DataServiceAsyncImpl
import com.openlayer.api.services.async.inferencepipelines.RowServiceAsync
import com.openlayer.api.services.async.inferencepipelines.RowServiceAsyncImpl
import com.openlayer.api.services.async.inferencepipelines.TestResultServiceAsync
import com.openlayer.api.services.async.inferencepipelines.TestResultServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class InferencePipelineServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InferencePipelineServiceAsync {

    private val withRawResponse: InferencePipelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptions) }

    private val rows: RowServiceAsync by lazy { RowServiceAsyncImpl(clientOptions) }

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): InferencePipelineServiceAsync.WithRawResponse = withRawResponse

    override fun data(): DataServiceAsync = data

    override fun rows(): RowServiceAsync = rows

    override fun testResults(): TestResultServiceAsync = testResults

    override fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        // get /inference-pipelines/{inferencePipelineId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineUpdateResponse> =
        // put /inference-pipelines/{inferencePipelineId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /inference-pipelines/{inferencePipelineId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InferencePipelineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val data: DataServiceAsync.WithRawResponse by lazy {
            DataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rows: RowServiceAsync.WithRawResponse by lazy {
            RowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val testResults: TestResultServiceAsync.WithRawResponse by lazy {
            TestResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun data(): DataServiceAsync.WithRawResponse = data

        override fun rows(): RowServiceAsync.WithRawResponse = rows

        override fun testResults(): TestResultServiceAsync.WithRawResponse = testResults

        private val retrieveHandler: Handler<InferencePipelineRetrieveResponse> =
            jsonHandler<InferencePipelineRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inference-pipelines", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<InferencePipelineUpdateResponse> =
            jsonHandler<InferencePipelineUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: InferencePipelineUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inference-pipelines", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inference-pipelines", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }
    }
}
