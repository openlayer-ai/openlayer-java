// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.getPackageVersion
import com.openlayer.api.services.blocking.CommitService
import com.openlayer.api.services.blocking.CommitServiceImpl
import com.openlayer.api.services.blocking.InferencePipelineService
import com.openlayer.api.services.blocking.InferencePipelineServiceImpl
import com.openlayer.api.services.blocking.ProjectService
import com.openlayer.api.services.blocking.ProjectServiceImpl
import com.openlayer.api.services.blocking.StorageService
import com.openlayer.api.services.blocking.StorageServiceImpl
import java.util.function.Consumer

class OpenlayerClientImpl(private val clientOptions: ClientOptions) : OpenlayerClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OpenlayerClientAsync by lazy { OpenlayerClientAsyncImpl(clientOptions) }

    private val withRawResponse: OpenlayerClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptionsWithUserAgent) }

    private val commits: CommitService by lazy { CommitServiceImpl(clientOptionsWithUserAgent) }

    private val inferencePipelines: InferencePipelineService by lazy {
        InferencePipelineServiceImpl(clientOptionsWithUserAgent)
    }

    private val storage: StorageService by lazy { StorageServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): OpenlayerClientAsync = async

    override fun withRawResponse(): OpenlayerClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenlayerClient =
        OpenlayerClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun projects(): ProjectService = projects

    override fun commits(): CommitService = commits

    override fun inferencePipelines(): InferencePipelineService = inferencePipelines

    override fun storage(): StorageService = storage

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenlayerClient.WithRawResponse {

        private val projects: ProjectService.WithRawResponse by lazy {
            ProjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitService.WithRawResponse by lazy {
            CommitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inferencePipelines: InferencePipelineService.WithRawResponse by lazy {
            InferencePipelineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val storage: StorageService.WithRawResponse by lazy {
            StorageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenlayerClient.WithRawResponse =
            OpenlayerClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun projects(): ProjectService.WithRawResponse = projects

        override fun commits(): CommitService.WithRawResponse = commits

        override fun inferencePipelines(): InferencePipelineService.WithRawResponse =
            inferencePipelines

        override fun storage(): StorageService.WithRawResponse = storage
    }
}
