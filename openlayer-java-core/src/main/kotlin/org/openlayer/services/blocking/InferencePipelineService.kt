// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.blocking

import org.openlayer.services.blocking.inferencePipelines.DataService
import org.openlayer.services.blocking.inferencePipelines.TestResultService

interface InferencePipelineService {

    fun data(): DataService

    fun testResults(): TestResultService
}
