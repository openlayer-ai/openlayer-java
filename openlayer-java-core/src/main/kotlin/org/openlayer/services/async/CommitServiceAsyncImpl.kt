// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.async

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.services.async.commits.TestResultServiceAsync
import org.openlayer.services.async.commits.TestResultServiceAsyncImpl
import org.openlayer.services.errorHandler

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
