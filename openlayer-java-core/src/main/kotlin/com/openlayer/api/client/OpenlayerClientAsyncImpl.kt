// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.getPackageVersion
import com.openlayer.api.services.async.CommitServiceAsync
import com.openlayer.api.services.async.CommitServiceAsyncImpl
import com.openlayer.api.services.async.InferencePipelineServiceAsync
import com.openlayer.api.services.async.InferencePipelineServiceAsyncImpl
import com.openlayer.api.services.async.ProjectServiceAsync
import com.openlayer.api.services.async.ProjectServiceAsyncImpl
import com.openlayer.api.services.async.StorageServiceAsync
import com.openlayer.api.services.async.StorageServiceAsyncImpl
import java.util.function.Consumer

class OpenlayerClientAsyncImpl(private val clientOptions: ClientOptions) : OpenlayerClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OpenlayerClient by lazy { OpenlayerClientImpl(clientOptions) }

    private val withRawResponse: OpenlayerClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val projects: ProjectServiceAsync by lazy {
        ProjectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val commits: CommitServiceAsync by lazy {
        CommitServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inferencePipelines: InferencePipelineServiceAsync by lazy {
        InferencePipelineServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val storage: StorageServiceAsync by lazy {
        StorageServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OpenlayerClient = sync

    override fun withRawResponse(): OpenlayerClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenlayerClientAsync =
        OpenlayerClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun projects(): ProjectServiceAsync = projects

    override fun commits(): CommitServiceAsync = commits

    override fun inferencePipelines(): InferencePipelineServiceAsync = inferencePipelines

    override fun storage(): StorageServiceAsync = storage

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenlayerClientAsync.WithRawResponse {

        private val projects: ProjectServiceAsync.WithRawResponse by lazy {
            ProjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commits: CommitServiceAsync.WithRawResponse by lazy {
            CommitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inferencePipelines: InferencePipelineServiceAsync.WithRawResponse by lazy {
            InferencePipelineServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val storage: StorageServiceAsync.WithRawResponse by lazy {
            StorageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenlayerClientAsync.WithRawResponse =
            OpenlayerClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun projects(): ProjectServiceAsync.WithRawResponse = projects

        override fun commits(): CommitServiceAsync.WithRawResponse = commits

        override fun inferencePipelines(): InferencePipelineServiceAsync.WithRawResponse =
            inferencePipelines

        override fun storage(): StorageServiceAsync.WithRawResponse = storage
    }
}
