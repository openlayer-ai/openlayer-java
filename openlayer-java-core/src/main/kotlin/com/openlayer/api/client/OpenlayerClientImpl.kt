// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import com.openlayer.api.services.blocking.*
import com.openlayer.api.services.emptyHandler
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.stringHandler
import com.openlayer.api.services.binaryHandler
import com.openlayer.api.services.withErrorHandler

class OpenlayerClientImpl constructor(private val clientOptions: ClientOptions, ) : OpenlayerClient {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val async: OpenlayerClientAsync by lazy { OpenlayerClientAsyncImpl(clientOptions) }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineService by lazy { InferencePipelineServiceImpl(clientOptions) }

    private val storage: StorageService by lazy { StorageServiceImpl(clientOptions) }

    override fun async(): OpenlayerClientAsync = async

    override fun projects(): ProjectService = projects

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    override fun storage(): StorageService = storage
}
