// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.errorHandler

class TestResultServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)
}
