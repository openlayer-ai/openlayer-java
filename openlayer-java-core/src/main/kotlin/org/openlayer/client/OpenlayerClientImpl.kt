// File generated from our OpenAPI spec by Stainless.

package org.openlayer.client

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.*
import org.openlayer.services.blocking.*
import org.openlayer.services.errorHandler

class OpenlayerClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OpenlayerClient {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val async: OpenlayerClientAsync by lazy { OpenlayerClientAsyncImpl(clientOptions) }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptions) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptions)
    }

    override fun async(): OpenlayerClientAsync = async

    override fun projects(): ProjectService = projects

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines
}
