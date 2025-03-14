// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.models.commits.CommitRetrieveParams
import com.openlayer.api.models.commits.CommitRetrieveResponse
import com.openlayer.api.services.blocking.commits.TestResultService
import com.openlayer.api.services.blocking.commits.TestResultServiceImpl

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val withRawResponse: CommitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun withRawResponse(): CommitService.WithRawResponse = withRawResponse

    override fun testResults(): TestResultService = testResults

    override fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions,
    ): CommitRetrieveResponse =
        // get /versions/{projectVersionId}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitService.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val testResults: TestResultService.WithRawResponse by lazy {
            TestResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun testResults(): TestResultService.WithRawResponse = testResults

        private val retrieveHandler: Handler<CommitRetrieveResponse> =
            jsonHandler<CommitRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("versions", params.getPathParam(0))
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
    }
}
