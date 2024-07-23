// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineCreateResponse
import com.openlayer.api.models.ProjectInferencePipelineListParams
import com.openlayer.api.models.ProjectInferencePipelineListResponse
import java.util.concurrent.CompletableFuture

interface InferencePipelineServiceAsync {

    /** Create an inference pipeline in a project. */
    @JvmOverloads
    fun create(
        params: ProjectInferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectInferencePipelineCreateResponse>

    /** List the inference pipelines in a project. */
    @JvmOverloads
    fun list(
        params: ProjectInferencePipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectInferencePipelineListResponse>
}
