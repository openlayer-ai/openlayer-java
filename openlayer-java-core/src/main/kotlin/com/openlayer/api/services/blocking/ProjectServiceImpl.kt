// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.emptyHandler
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
import com.openlayer.api.models.projects.ProjectCreateParams
import com.openlayer.api.models.projects.ProjectCreateResponse
import com.openlayer.api.models.projects.ProjectDeleteParams
import com.openlayer.api.models.projects.ProjectListParams
import com.openlayer.api.models.projects.ProjectListResponse
import com.openlayer.api.services.blocking.projects.CommitService
import com.openlayer.api.services.blocking.projects.CommitServiceImpl
import com.openlayer.api.services.blocking.projects.InferencePipelineService
import com.openlayer.api.services.blocking.projects.InferencePipelineServiceImpl
import com.openlayer.api.services.blocking.projects.TestService
import com.openlayer.api.services.blocking.projects.TestServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectService {

    private val withRawResponse: ProjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptions)
    }

    private val tests: TestService by lazy { TestServiceImpl(clientOptions) }

    override fun withRawResponse(): ProjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService =
        ProjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    override fun tests(): TestService = tests

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

    override fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions) {
        // delete /projects/{projectId}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val commits: CommitService.WithRawResponse by lazy {
            CommitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inferencePipelines: InferencePipelineService.WithRawResponse by lazy {
            InferencePipelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tests: TestService.WithRawResponse by lazy {
            TestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectService.WithRawResponse =
            ProjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun commits(): CommitService.WithRawResponse = commits

        override fun inferencePipelines(): InferencePipelineService.WithRawResponse =
            inferencePipelines

        override fun tests(): TestService.WithRawResponse = tests

        private val createHandler: Handler<ProjectCreateResponse> =
            jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects")
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

        private val listHandler: Handler<ProjectListResponse> =
            jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
