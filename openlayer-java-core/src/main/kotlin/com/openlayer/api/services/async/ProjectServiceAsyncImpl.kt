// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

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
import com.openlayer.api.models.projects.ProjectCreateParams
import com.openlayer.api.models.projects.ProjectCreateResponse
import com.openlayer.api.models.projects.ProjectListParams
import com.openlayer.api.models.projects.ProjectListResponse
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.CommitServiceAsyncImpl
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsyncImpl
import com.openlayer.api.services.async.projects.TestServiceAsync
import com.openlayer.api.services.async.projects.TestServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class ProjectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectServiceAsync {

    private val withRawResponse: ProjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy {
        InferencePipelineServiceAsyncImpl(clientOptions)
    }

    private val tests: TestServiceAsync by lazy { TestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProjectServiceAsync.WithRawResponse = withRawResponse

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines

    override fun tests(): TestServiceAsync = tests

    override fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectCreateResponse> =
        // post /projects
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectListResponse> =
        // get /projects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val commits: CommitServiceAsync.WithRawResponse by lazy {
            CommitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inferencePipelines: InferencePipelineServiceAsync.WithRawResponse by lazy {
            InferencePipelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tests: TestServiceAsync.WithRawResponse by lazy {
            TestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        override fun inferencePipelines(): InferencePipelineServiceAsync.WithRawResponse =
            inferencePipelines

        override fun tests(): TestServiceAsync.WithRawResponse = tests

        private val createHandler: Handler<ProjectCreateResponse> =
            jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects")
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

        private val listHandler: Handler<ProjectListResponse> =
            jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProjectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects")
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
