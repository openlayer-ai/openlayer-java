// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListParams
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListResponse

class TestResultServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TestResultService {

    private val withRawResponse: TestResultService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestResultService.WithRawResponse = withRawResponse

    override fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions,
    ): TestResultListResponse =
        // get /inference-pipelines/{inferencePipelineId}/results
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestResultService.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<TestResultListResponse> =
            jsonHandler<TestResultListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestResultListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inference-pipelines", params.getPathParam(0), "results")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
