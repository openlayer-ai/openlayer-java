// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking.inferencePipelines

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.InferencePipelineTestResultListParams
import com.openlayer.api.models.InferencePipelineTestResultListResponse

interface TestResultService {

    /** List the test results under an inference pipeline. */
    @JvmOverloads
    fun list(
        params: InferencePipelineTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferencePipelineTestResultListResponse
}
