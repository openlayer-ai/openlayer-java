// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async

import org.openlayer.services.async.inferencePipelines.DataServiceAsync
import org.openlayer.services.async.inferencePipelines.TestResultServiceAsync

interface InferencePipelineServiceAsync {

    fun data(): DataServiceAsync

    fun testResults(): TestResultServiceAsync
}
