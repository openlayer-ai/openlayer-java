// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

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
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse
import java.util.concurrent.CompletableFuture

class TestResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestResultServiceAsync {

    private val withRawResponse: TestResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestResultServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestResultListResponse> =
        // get /versions/{projectVersionId}/results
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<TestResultListResponse> =
            jsonHandler<TestResultListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("versions", params._pathParam(0), "results")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
