// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.ProjectCommitListParams
import com.openlayer.api.models.ProjectCommitListResponse
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CommitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ProjectCommitListResponse> =
        jsonHandler<ProjectCommitListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the commits (project versions) under a project. */
    override fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProjectCommitListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("projects", params.getPathParam(0), "versions")
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
