// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.projects

import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.ProjectCommitListParams
import org.openlayer.models.ProjectCommitListResponse
import org.openlayer.services.errorHandler
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

class CommitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ProjectCommitListResponse> =
        jsonHandler<ProjectCommitListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the commits (project versions) under a project. */
    override fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions
    ): ProjectCommitListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("projects", params.getPathParam(0), "versions")
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
