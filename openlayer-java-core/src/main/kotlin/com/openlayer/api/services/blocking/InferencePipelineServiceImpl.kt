// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.core.prepare
import com.openlayer.api.models.inferencepipelines.InferencePipelineDeleteParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveResponse
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateResponse
import com.openlayer.api.services.blocking.inferencepipelines.DataService
import com.openlayer.api.services.blocking.inferencepipelines.DataServiceImpl
import com.openlayer.api.services.blocking.inferencepipelines.RowService
import com.openlayer.api.services.blocking.inferencepipelines.RowServiceImpl
import com.openlayer.api.services.blocking.inferencepipelines.TestResultService
import com.openlayer.api.services.blocking.inferencepipelines.TestResultServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InferencePipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InferencePipelineService {

    private val withRawResponse: InferencePipelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val data: DataService by lazy { DataServiceImpl(clientOptions) }

    private val rows: RowService by lazy { RowServiceImpl(clientOptions) }

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun withRawResponse(): InferencePipelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InferencePipelineService =
        InferencePipelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun data(): DataService = data

    override fun rows(): RowService = rows

    override fun testResults(): TestResultService = testResults

    override fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions,
    ): InferencePipelineRetrieveResponse =
        // get /inference-pipelines/{inferencePipelineId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions,
    ): InferencePipelineUpdateResponse =
        // put /inference-pipelines/{inferencePipelineId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: InferencePipelineDeleteParams, requestOptions: RequestOptions) {
        // delete /inference-pipelines/{inferencePipelineId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InferencePipelineService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val data: DataService.WithRawResponse by lazy {
            DataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rows: RowService.WithRawResponse by lazy {
            RowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val testResults: TestResultService.WithRawResponse by lazy {
            TestResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InferencePipelineService.WithRawResponse =
            InferencePipelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun data(): DataService.WithRawResponse = data

        override fun rows(): RowService.WithRawResponse = rows

        override fun testResults(): TestResultService.WithRawResponse = testResults

        private val retrieveHandler: Handler<InferencePipelineRetrieveResponse> =
            jsonHandler<InferencePipelineRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferencePipelineRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inference-pipelines", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InferencePipelineUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
