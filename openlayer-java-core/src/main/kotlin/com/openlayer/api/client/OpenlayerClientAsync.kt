// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.client

import com.openlayer.api.models.*
import com.openlayer.api.services.async.*

interface OpenlayerClientAsync {

    fun sync(): OpenlayerClient

    fun projects(): ProjectServiceAsync

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync
}
