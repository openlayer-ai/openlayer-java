// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async.inferencePipelines

import java.util.concurrent.CompletableFuture
import org.openlayer.core.RequestOptions
import org.openlayer.models.InferencePipelineTestResultListParams
import org.openlayer.models.InferencePipelineTestResultListResponse

interface TestResultServiceAsync {

    /** List the test results under an inference pipeline. */
    @JvmOverloads
    fun list(
        params: InferencePipelineTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InferencePipelineTestResultListResponse>
}
