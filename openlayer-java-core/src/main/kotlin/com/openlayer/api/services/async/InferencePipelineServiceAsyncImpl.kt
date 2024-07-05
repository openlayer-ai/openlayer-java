// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencePipelines.DataServiceAsyncImpl
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsync
import com.openlayer.api.services.async.inferencePipelines.TestResultServiceAsyncImpl
import com.openlayer.api.services.errorHandler

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
