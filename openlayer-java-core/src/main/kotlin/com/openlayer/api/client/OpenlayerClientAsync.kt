// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.services.async.CommitServiceAsync
import com.openlayer.api.services.async.InferencePipelineServiceAsync
import com.openlayer.api.services.async.ProjectServiceAsync
import com.openlayer.api.services.async.StorageServiceAsync

interface OpenlayerClientAsync {

    fun sync(): OpenlayerClient

    fun projects(): ProjectServiceAsync

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    fun storage(): StorageServiceAsync
}
