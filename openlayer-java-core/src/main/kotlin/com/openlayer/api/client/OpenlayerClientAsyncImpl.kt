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
import com.openlayer.api.services.async.*
import com.openlayer.api.services.emptyHandler
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.stringHandler
import com.openlayer.api.services.binaryHandler
import com.openlayer.api.services.withErrorHandler

class OpenlayerClientAsyncImpl constructor(private val clientOptions: ClientOptions, ) : OpenlayerClientAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val sync: OpenlayerClient by lazy { OpenlayerClientImpl(clientOptions) }

    private val projects: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy { InferencePipelineServiceAsyncImpl(clientOptions) }

    private val storage: StorageServiceAsync by lazy { StorageServiceAsyncImpl(clientOptions) }

    override fun sync(): OpenlayerClient = sync

    override fun projects(): ProjectServiceAsync = projects

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines

    override fun storage(): StorageServiceAsync = storage
}
