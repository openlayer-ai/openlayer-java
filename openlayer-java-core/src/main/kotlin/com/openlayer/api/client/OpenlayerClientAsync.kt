// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.models.*
import com.openlayer.api.services.async.*

interface OpenlayerClientAsync {

    fun sync(): OpenlayerClient

    fun projects(): ProjectServiceAsync

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    fun storage(): StorageServiceAsync
}
