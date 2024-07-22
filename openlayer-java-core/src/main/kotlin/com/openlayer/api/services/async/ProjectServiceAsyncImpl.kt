// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

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
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectCreateResponse
import com.openlayer.api.models.ProjectListParams
import com.openlayer.api.models.ProjectListResponse
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
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.CommitServiceAsyncImpl
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsyncImpl

class ProjectServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : ProjectServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy { InferencePipelineServiceAsyncImpl(clientOptions) }

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines

    private val createHandler: Handler<ProjectCreateResponse> =
    jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create a project in your workspace. */
    override fun create(params: ProjectCreateParams, requestOptions: RequestOptions): CompletableFuture<ProjectCreateResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("projects")
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

    private val listHandler: Handler<ProjectListResponse> =
    jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List your workspace's projects. */
    override fun list(params: ProjectListParams, requestOptions: RequestOptions): CompletableFuture<ProjectListResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("projects")
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
