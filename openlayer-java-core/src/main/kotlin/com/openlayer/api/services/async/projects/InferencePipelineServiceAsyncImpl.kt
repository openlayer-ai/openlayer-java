// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.openlayer.api.core.Enum
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineCreateResponse
import com.openlayer.api.models.ProjectInferencePipelineListParams
import com.openlayer.api.models.ProjectInferencePipelineListResponse
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.BinaryResponseContent
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.emptyHandler
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.multipartFormData
import com.openlayer.api.services.stringHandler
import com.openlayer.api.services.binaryHandler
import com.openlayer.api.services.withErrorHandler

class InferencePipelineServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : InferencePipelineServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ProjectInferencePipelineCreateResponse> =
    jsonHandler<ProjectInferencePipelineCreateResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an inference pipeline in a project. */
    override fun create(params: ProjectInferencePipelineCreateParams, requestOptions: RequestOptions): CompletableFuture<ProjectInferencePipelineCreateResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("projects", params.getPathParam(0), "inference-pipelines")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<ProjectInferencePipelineListResponse> =
    jsonHandler<ProjectInferencePipelineListResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List the inference pipelines in a project. */
    override fun list(params: ProjectInferencePipelineListParams, requestOptions: RequestOptions): CompletableFuture<ProjectInferencePipelineListResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("projects", params.getPathParam(0), "inference-pipelines")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
