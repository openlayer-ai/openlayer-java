// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async.inferencePipelines

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.InferencePipelineDataStreamParams
import com.openlayer.api.models.InferencePipelineDataStreamResponse
import java.util.concurrent.CompletableFuture

interface DataServiceAsync {

    /** Publish an inference data point to an inference pipeline. */
    @JvmOverloads
    fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InferencePipelineDataStreamResponse>
}
