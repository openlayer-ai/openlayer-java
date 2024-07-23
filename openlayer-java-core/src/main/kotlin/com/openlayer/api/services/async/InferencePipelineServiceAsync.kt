// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.InferencePipelineDeleteParams
import com.openlayer.api.models.InferencePipelineRetrieveParams
import com.openlayer.api.models.InferencePipelineRetrieveResponse
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencePipelines.RowServiceAsync
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsync
import java.util.concurrent.CompletableFuture

interface InferencePipelineServiceAsync {

    fun data(): DataServiceAsync

    fun rows(): RowServiceAsync

    fun testResults(): TestResultServiceAsync

    /** Retrieve inference pipeline. */
    @JvmOverloads
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InferencePipelineRetrieveResponse>

    /** Delete inference pipeline. */
    @JvmOverloads
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
