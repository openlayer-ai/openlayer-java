// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking.inferencePipelines

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import com.openlayer.api.models.InferencePipelineRowUpdateResponse

interface RowService {

    /** Update an inference data point in an inference pipeline. */
    @JvmOverloads
    fun update(
        params: InferencePipelineRowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferencePipelineRowUpdateResponse
}
