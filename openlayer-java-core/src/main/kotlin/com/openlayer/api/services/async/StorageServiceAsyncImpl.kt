// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsync
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsyncImpl
import com.openlayer.api.services.errorHandler

class StorageServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StorageServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val presignedUrl: PresignedUrlServiceAsync by lazy {
        PresignedUrlServiceAsyncImpl(clientOptions)
    }

    override fun presignedUrl(): PresignedUrlServiceAsync = presignedUrl
}
