// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

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
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TestResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TestResultServiceAsync {

    private val withRawResponse: TestResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestResultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestResultServiceAsync =
        TestResultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestResultListResponse> =
        // get /versions/{projectVersionId}/results
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestResultServiceAsync.WithRawResponse =
            TestResultServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<TestResultListResponse> =
            jsonHandler<TestResultListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectVersionId", params.projectVersionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("versions", params._pathParam(0), "results")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
