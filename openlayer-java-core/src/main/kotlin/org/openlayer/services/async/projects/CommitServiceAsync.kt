// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async.projects

import java.util.concurrent.CompletableFuture
import org.openlayer.core.RequestOptions
import org.openlayer.models.ProjectCommitListParams
import org.openlayer.models.ProjectCommitListResponse

interface CommitServiceAsync {

    /** List the commits (project versions) under a project. */
    @JvmOverloads
    fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ProjectCommitListResponse>
}
