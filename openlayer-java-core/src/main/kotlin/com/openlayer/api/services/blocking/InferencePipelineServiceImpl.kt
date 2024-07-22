// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.services.blocking.inferencePipelines.DataService
import com.openlayer.api.services.blocking.inferencePipelines.DataServiceImpl
import com.openlayer.api.services.blocking.inferencePipelines.RowService
import com.openlayer.api.services.blocking.inferencePipelines.RowServiceImpl
import com.openlayer.api.services.blocking.inferencePipelines.TestResultService
import com.openlayer.api.services.blocking.inferencePipelines.TestResultServiceImpl

class InferencePipelineServiceImpl constructor(private val clientOptions: ClientOptions, ) : InferencePipelineService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataService by lazy { DataServiceImpl(clientOptions) }

    private val rows: RowService by lazy { RowServiceImpl(clientOptions) }

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun data(): DataService = data

    override fun rows(): RowService = rows

    override fun testResults(): TestResultService = testResults
}
