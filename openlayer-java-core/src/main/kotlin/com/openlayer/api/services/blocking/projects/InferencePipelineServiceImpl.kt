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
import com.openlayer.api.core.json
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineCreateResponse
import com.openlayer.api.models.ProjectInferencePipelineListParams
import com.openlayer.api.models.ProjectInferencePipelineListResponse

class InferencePipelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InferencePipelineService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProjectInferencePipelineCreateResponse> =
        jsonHandler<ProjectInferencePipelineCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create an inference pipeline in a project. */
    override fun create(
        params: ProjectInferencePipelineCreateParams,
        requestOptions: RequestOptions,
    ): ProjectInferencePipelineCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("projects", params.getPathParam(0), "inference-pipelines")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ProjectInferencePipelineListResponse> =
        jsonHandler<ProjectInferencePipelineListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the inference pipelines in a project. */
    override fun list(
        params: ProjectInferencePipelineListParams,
        requestOptions: RequestOptions,
    ): ProjectInferencePipelineListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("projects", params.getPathParam(0), "inference-pipelines")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
