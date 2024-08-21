// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.blocking.commits.TestResultService
import com.openlayer.api.services.blocking.commits.TestResultServiceImpl
import com.openlayer.api.services.errorHandler

class CommitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CommitService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val testResults: TestResultService by lazy { TestResultServiceImpl(clientOptions) }

    override fun testResults(): TestResultService = testResults
}
