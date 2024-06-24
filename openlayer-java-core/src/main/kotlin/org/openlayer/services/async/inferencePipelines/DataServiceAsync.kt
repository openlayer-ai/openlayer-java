// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async.inferencePipelines

import java.util.concurrent.CompletableFuture
import org.openlayer.core.RequestOptions
import org.openlayer.models.InferencePipelineDataStreamParams
import org.openlayer.models.InferencePipelineDataStreamResponse

interface DataServiceAsync {

    /** Stream production data to an inference pipeline in Openlayer. */
    @JvmOverloads
    fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InferencePipelineDataStreamResponse>
}
