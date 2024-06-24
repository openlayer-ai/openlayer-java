// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.blocking

import org.openlayer.core.RequestOptions
import org.openlayer.models.ProjectListParams
import org.openlayer.models.ProjectListResponse
import org.openlayer.services.blocking.projects.CommitService
import org.openlayer.services.blocking.projects.InferencePipelineService

interface ProjectService {

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    /** List the projects in a user's workspace. */
    @JvmOverloads
    fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectListResponse
}
