// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.errorHandler

class TestResultServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)
}
