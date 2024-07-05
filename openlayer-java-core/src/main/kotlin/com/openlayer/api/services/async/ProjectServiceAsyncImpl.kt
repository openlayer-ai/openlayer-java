// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectCreateResponse
import com.openlayer.api.models.ProjectListParams
import com.openlayer.api.models.ProjectListResponse
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.CommitServiceAsyncImpl
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsyncImpl
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ProjectServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProjectServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy {
        InferencePipelineServiceAsyncImpl(clientOptions)
    }

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines

    private val createHandler: Handler<ProjectCreateResponse> =
        jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a project under the current workspace. */
    override fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProjectCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("projects")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ProjectListResponse> =
        jsonHandler<ProjectListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the projects in a user's workspace. */
    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProjectListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("projects")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}