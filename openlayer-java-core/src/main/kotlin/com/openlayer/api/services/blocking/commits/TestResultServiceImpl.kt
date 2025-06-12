// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.commits

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepare
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse
import kotlin.jvm.optionals.getOrNull

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
        // get /versions/{projectVersionId}/results
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestResultService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<TestResultListResponse> =
            jsonHandler<TestResultListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestResultListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectVersionId", params.projectVersionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("versions", params._pathParam(0), "results")
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
