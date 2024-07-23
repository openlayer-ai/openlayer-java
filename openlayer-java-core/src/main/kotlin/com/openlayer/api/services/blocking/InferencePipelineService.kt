// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.InferencePipelineDeleteParams
import com.openlayer.api.models.InferencePipelineRetrieveParams
import com.openlayer.api.models.InferencePipelineRetrieveResponse
import com.openlayer.api.models.InferencePipelineUpdateParams
import com.openlayer.api.models.InferencePipelineUpdateResponse
import com.openlayer.api.services.blocking.inferencePipelines.DataService
import com.openlayer.api.services.blocking.inferencePipelines.RowService
import com.openlayer.api.services.blocking.inferencePipelines.TestResultService

interface InferencePipelineService {

    fun data(): DataService

    fun rows(): RowService

    fun testResults(): TestResultService

    /** Retrieve inference pipeline. */
    @JvmOverloads
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferencePipelineRetrieveResponse

    /** Update inference pipeline. */
    @JvmOverloads
    fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferencePipelineUpdateResponse

    /** Delete inference pipeline. */
    @JvmOverloads
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
