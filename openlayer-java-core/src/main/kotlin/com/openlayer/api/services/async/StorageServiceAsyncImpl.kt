// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsync
import com.openlayer.api.services.async.storage.PresignedUrlServiceAsyncImpl
import java.util.function.Consumer

class StorageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StorageServiceAsync {

    private val withRawResponse: StorageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val presignedUrl: PresignedUrlServiceAsync by lazy {
        PresignedUrlServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): StorageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageServiceAsync =
        StorageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun presignedUrl(): PresignedUrlServiceAsync = presignedUrl

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StorageServiceAsync.WithRawResponse {

        private val presignedUrl: PresignedUrlServiceAsync.WithRawResponse by lazy {
            PresignedUrlServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StorageServiceAsync.WithRawResponse =
            StorageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun presignedUrl(): PresignedUrlServiceAsync.WithRawResponse = presignedUrl
    }
}
