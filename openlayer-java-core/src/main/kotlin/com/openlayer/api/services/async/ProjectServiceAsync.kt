// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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

interface ProjectServiceAsync {

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    /** Create a project in your workspace. */
    @JvmOverloads
    fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectCreateResponse>

    /** List your workspace's projects. */
    @JvmOverloads
    fun list(params: ProjectListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ProjectListResponse>
}
