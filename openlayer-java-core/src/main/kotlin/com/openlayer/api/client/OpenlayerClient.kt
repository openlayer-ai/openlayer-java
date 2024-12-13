// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.services.blocking.CommitService
import com.openlayer.api.services.blocking.InferencePipelineService
import com.openlayer.api.services.blocking.ProjectService
import com.openlayer.api.services.blocking.StorageService

interface OpenlayerClient {

    fun async(): OpenlayerClientAsync

    fun projects(): ProjectService

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    fun storage(): StorageService
}
