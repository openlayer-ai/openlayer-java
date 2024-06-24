// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async

import java.util.concurrent.CompletableFuture
import org.openlayer.core.RequestOptions
import org.openlayer.models.ProjectListParams
import org.openlayer.models.ProjectListResponse
import org.openlayer.services.async.projects.CommitServiceAsync
import org.openlayer.services.async.projects.InferencePipelineServiceAsync

interface ProjectServiceAsync {

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    /** List the projects in a user's workspace. */
    @JvmOverloads
    fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectListResponse>
}
