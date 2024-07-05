// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import com.openlayer.api.services.async.commits.TestResultServiceAsyncImpl
import com.openlayer.api.services.errorHandler

class CommitServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultServiceAsync by lazy {
        TestResultServiceAsyncImpl(clientOptions)
    }

    override fun testResults(): TestResultServiceAsync = testResults
}