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
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsyncImpl
import com.openlayer.api.services.async.inferencePipelines.RowServiceAsync
import com.openlayer.api.services.async.inferencePipelines.RowServiceAsyncImpl
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsync
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsyncImpl

class InferencePipelineServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : InferencePipelineServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptions) }

    private val rows: RowServiceAsync by lazy { RowServiceAsyncImpl(clientOptions) }

    private val testResults: TestResultServiceAsync by lazy { TestResultServiceAsyncImpl(clientOptions) }

    override fun data(): DataServiceAsync = data

    override fun rows(): RowServiceAsync = rows

    override fun testResults(): TestResultServiceAsync = testResults
}
