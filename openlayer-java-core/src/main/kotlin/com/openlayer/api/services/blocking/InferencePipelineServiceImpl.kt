// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.blocking.inferencePipelines.DataService
import com.openlayer.api.services.blocking.inferencePipelines.DataServiceImpl
import com.openlayer.api.services.blocking.inferencePipelines.TestResultService
import com.openlayer.api.services.blocking.inferencePipelines.TestResultServiceImpl
import com.openlayer.api.services.errorHandler

class InferencePipelineServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InferencePipelineService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataService by lazy { DataServiceImpl(clientOptions) }

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun data(): DataService = data

    override fun testResults(): TestResultService = testResults
}
