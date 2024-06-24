// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking

import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.ProjectListParams
import org.openlayer.models.ProjectListResponse
import org.openlayer.services.blocking.projects.CommitService
import org.openlayer.services.blocking.projects.CommitServiceImpl
import org.openlayer.services.blocking.projects.InferencePipelineService
import org.openlayer.services.blocking.projects.InferencePipelineServiceImpl
import org.openlayer.services.errorHandler
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

class ProjectServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ProjectService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptions)
    }

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    private val listHandler: Handler<ProjectListResponse> =
        jsonHandler<ProjectListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List the projects in a user's workspace. */
    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions
    ): ProjectListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("projects")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
