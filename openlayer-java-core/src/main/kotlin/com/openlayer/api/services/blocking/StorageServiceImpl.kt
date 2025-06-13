// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.blocking.storage.PresignedUrlService
import com.openlayer.api.services.blocking.storage.PresignedUrlServiceImpl
import java.util.function.Consumer

class StorageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StorageService {

    private val withRawResponse: StorageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val presignedUrl: PresignedUrlService by lazy { PresignedUrlServiceImpl(clientOptions) }

    override fun withRawResponse(): StorageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageService =
        StorageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun presignedUrl(): PresignedUrlService = presignedUrl

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StorageService.WithRawResponse {

        private val presignedUrl: PresignedUrlService.WithRawResponse by lazy {
            PresignedUrlServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StorageService.WithRawResponse =
            StorageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun presignedUrl(): PresignedUrlService.WithRawResponse = presignedUrl
    }
}
