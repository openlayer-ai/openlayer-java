// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking

import org.openlayer.core.ClientOptions
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.services.blocking.commits.TestResultService
import org.openlayer.services.blocking.commits.TestResultServiceImpl
import org.openlayer.services.errorHandler

class CommitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun testResults(): TestResultService = testResults
}
