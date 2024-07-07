// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectCreateResponse
import com.openlayer.api.models.ProjectListParams
import com.openlayer.api.models.ProjectListResponse
import com.openlayer.api.services.blocking.projects.CommitService
import com.openlayer.api.services.blocking.projects.InferencePipelineService

interface ProjectService {

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    /** Create a project in your workspace. */
    @JvmOverloads
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectCreateResponse

    /** List your workspace's projects. */
    @JvmOverloads
    fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectListResponse
}
