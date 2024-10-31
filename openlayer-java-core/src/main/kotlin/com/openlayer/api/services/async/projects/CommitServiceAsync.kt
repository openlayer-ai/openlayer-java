// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitCreateResponse
import com.openlayer.api.models.ProjectCommitListParams
import com.openlayer.api.models.ProjectCommitListResponse
import java.util.concurrent.CompletableFuture

interface CommitServiceAsync {

    /** Create a new commit (project version) in a project. */
    @JvmOverloads
    fun create(
        params: ProjectCommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectCommitCreateResponse>

    /** List the commits (project versions) in a project. */
    @JvmOverloads
    fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectCommitListResponse>
}
