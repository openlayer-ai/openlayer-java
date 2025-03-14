// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.core.ClientOptions
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
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitCreateResponse
import com.openlayer.api.models.ProjectCommitListParams
import com.openlayer.api.models.ProjectCommitListResponse

class CommitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitService {

    private val withRawResponse: CommitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitService.WithRawResponse = withRawResponse

    override fun create(
        params: ProjectCommitCreateParams,
        requestOptions: RequestOptions,
    ): ProjectCommitCreateResponse =
        // post /projects/{projectId}/versions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions,
    ): ProjectCommitListResponse =
        // get /projects/{projectId}/versions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitService.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProjectCommitCreateResponse> =
            jsonHandler<ProjectCommitCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ProjectCommitCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCommitCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("projects", params.getPathParam(0), "versions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ProjectCommitListResponse> =
            jsonHandler<ProjectCommitListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProjectCommitListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCommitListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("projects", params.getPathParam(0), "versions")
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
