// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.getPackageVersion
import com.openlayer.api.models.*
import com.openlayer.api.services.blocking.*

class OpenlayerClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OpenlayerClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OpenlayerClientAsync by lazy { OpenlayerClientAsyncImpl(clientOptions) }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptionsWithUserAgent) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptionsWithUserAgent) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptionsWithUserAgent)
    }

    private val storage: StorageService by lazy { StorageServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): OpenlayerClientAsync = async

    override fun projects(): ProjectService = projects

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    override fun storage(): StorageService = storage
}
