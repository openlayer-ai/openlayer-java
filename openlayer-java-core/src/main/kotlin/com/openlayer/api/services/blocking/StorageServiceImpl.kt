// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.blocking.storage.PresignedUrlService
import com.openlayer.api.services.blocking.storage.PresignedUrlServiceImpl

class StorageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StorageService {

    private val presignedUrl: PresignedUrlService by lazy { PresignedUrlServiceImpl(clientOptions) }

    override fun presignedUrl(): PresignedUrlService = presignedUrl
}
