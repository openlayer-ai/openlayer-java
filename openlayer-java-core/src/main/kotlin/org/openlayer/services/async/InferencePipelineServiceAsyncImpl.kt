// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.async

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.services.async.inferencePipelines.DataServiceAsync
import org.openlayer.services.async.inferencePipelines.DataServiceAsyncImpl
import org.openlayer.services.async.inferencePipelines.TestResultServiceAsync
import org.openlayer.services.async.inferencePipelines.TestResultServiceAsyncImpl
import org.openlayer.services.errorHandler

class InferencePipelineServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InferencePipelineServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptions) }

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun data(): DataServiceAsync = data

    override fun testResults(): TestResultServiceAsync = testResults
}
