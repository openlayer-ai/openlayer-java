// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsync
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsyncImpl

class StorageServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StorageServiceAsync {

    private val presignedUrl: PresignedUrlServiceAsync by lazy {
        PresignedUrlServiceAsyncImpl(clientOptions)
    }

    override fun presignedUrl(): PresignedUrlServiceAsync = presignedUrl
}
