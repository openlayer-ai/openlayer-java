// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import java.util.concurrent.CompletableFuture

class TestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestServiceAsync {

    private val withRawResponse: TestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestCreateResponse> =
        // post /projects/{projectId}/tests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TestCreateResponse> =
            jsonHandler<TestCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("projects", params._pathParam(0), "tests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
