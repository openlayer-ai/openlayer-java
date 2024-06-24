// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.blocking.projects

import org.openlayer.core.RequestOptions
import org.openlayer.models.ProjectInferencePipelineListParams
import org.openlayer.models.ProjectInferencePipelineListResponse

interface InferencePipelineService {

    /** List the inference pipelines in a project. */
    @JvmOverloads
    fun list(
        params: ProjectInferencePipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ProjectInferencePipelineListResponse
}
