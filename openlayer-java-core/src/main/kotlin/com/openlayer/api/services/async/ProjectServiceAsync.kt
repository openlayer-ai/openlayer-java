// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectCreateResponse
import com.openlayer.api.models.ProjectListParams
import com.openlayer.api.models.ProjectListResponse
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import java.util.concurrent.CompletableFuture

interface ProjectServiceAsync {

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    /** Create a project in your workspace. */
    @JvmOverloads
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateResponse>

    /** List your workspace's projects. */
    @JvmOverloads
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListResponse>

    /** List your workspace's projects. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListResponse> =
        list(ProjectListParams.none(), requestOptions)
}
