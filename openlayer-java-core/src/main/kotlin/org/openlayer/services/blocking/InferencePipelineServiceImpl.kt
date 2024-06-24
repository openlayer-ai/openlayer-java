// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.services.blocking.inferencePipelines.DataService
import org.openlayer.services.blocking.inferencePipelines.DataServiceImpl
import org.openlayer.services.blocking.inferencePipelines.TestResultService
import org.openlayer.services.blocking.inferencePipelines.TestResultServiceImpl
import org.openlayer.services.errorHandler

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
