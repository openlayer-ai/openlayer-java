// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.async

import java.util.concurrent.CompletableFuture
import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.ProjectListParams
import org.openlayer.models.ProjectListResponse
import org.openlayer.services.async.projects.CommitServiceAsync
import org.openlayer.services.async.projects.CommitServiceAsyncImpl
import org.openlayer.services.async.projects.InferencePipelineServiceAsync
import org.openlayer.services.async.projects.InferencePipelineServiceAsyncImpl
import org.openlayer.services.errorHandler
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

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
