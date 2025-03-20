// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.core.prepare
import com.openlayer.api.models.projects.ProjectCreateParams
import com.openlayer.api.models.projects.ProjectCreateResponse
import com.openlayer.api.models.projects.ProjectListParams
import com.openlayer.api.models.projects.ProjectListResponse
import com.openlayer.api.services.blocking.projects.CommitService
import com.openlayer.api.services.blocking.projects.CommitServiceImpl
import com.openlayer.api.services.blocking.projects.InferencePipelineService
import com.openlayer.api.services.blocking.projects.InferencePipelineServiceImpl

class ProjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectService {

    private val withRawResponse: ProjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectService.WithRawResponse = withRawResponse

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    override fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions,
    ): ProjectCreateResponse =
        // post /projects
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): ProjectListResponse =
        // get /projects
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val commits: CommitService.WithRawResponse by lazy {
            CommitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inferencePipelines: InferencePipelineService.WithRawResponse by lazy {
            InferencePipelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun commits(): CommitService.WithRawResponse = commits

        override fun inferencePipelines(): InferencePipelineService.WithRawResponse =
            inferencePipelines

        private val createHandler: Handler<ProjectCreateResponse> =
            jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("projects")
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

        private val listHandler: Handler<ProjectListResponse> =
            jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("projects")
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
