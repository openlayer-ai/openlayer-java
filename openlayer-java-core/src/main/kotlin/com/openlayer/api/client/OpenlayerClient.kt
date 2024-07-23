// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.client

import com.openlayer.api.models.*
import com.openlayer.api.services.blocking.*

interface OpenlayerClient {

    fun async(): OpenlayerClientAsync

    fun projects(): ProjectService

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    fun storage(): StorageService
}
