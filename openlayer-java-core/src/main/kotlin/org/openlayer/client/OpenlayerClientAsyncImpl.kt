// File generated from our OpenAPI spec by Stainless.

package org.openlayer.client

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.*
import org.openlayer.services.async.*
import org.openlayer.services.errorHandler

class OpenlayerClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OpenlayerClientAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val sync: OpenlayerClient by lazy { OpenlayerClientImpl(clientOptions) }

    private val projects: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val commits: CommitServiceAsync by lazy { CommitServiceAsyncImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy {
        InferencePipelineServiceAsyncImpl(clientOptions)
    }

    override fun sync(): OpenlayerClient = sync

    override fun projects(): ProjectServiceAsync = projects

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines
}
