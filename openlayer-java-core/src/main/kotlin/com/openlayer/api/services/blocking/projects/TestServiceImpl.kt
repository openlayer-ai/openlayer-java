// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.errorBodyHandler
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepare
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import com.openlayer.api.models.projects.tests.TestListParams
import com.openlayer.api.models.projects.tests.TestListResponse
import com.openlayer.api.models.projects.tests.TestUpdateParams
import com.openlayer.api.models.projects.tests.TestUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TestServiceImpl internal constructor(private val clientOptions: ClientOptions) : TestService {

    private val withRawResponse: TestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService =
        TestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions,
    ): TestCreateResponse =
        // post /projects/{projectId}/tests
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions,
    ): TestUpdateResponse =
        // put /projects/{projectId}/tests
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TestListParams, requestOptions: RequestOptions): TestListResponse =
        // get /projects/{projectId}/tests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestService.WithRawResponse =
            TestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TestCreateResponse> =
            jsonHandler<TestCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0), "tests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<TestUpdateResponse> =
            jsonHandler<TestUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0), "tests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TestListResponse> =
            jsonHandler<TestListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0), "tests")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
