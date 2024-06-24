// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.blocking.inferencePipelines

import org.openlayer.core.RequestOptions
import org.openlayer.models.InferencePipelineDataStreamParams
import org.openlayer.models.InferencePipelineDataStreamResponse

interface DataService {

    /** Stream production data to an inference pipeline in Openlayer. */
    @JvmOverloads
    fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferencePipelineDataStreamResponse
}
