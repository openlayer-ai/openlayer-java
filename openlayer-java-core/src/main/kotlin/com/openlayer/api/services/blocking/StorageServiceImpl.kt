// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.blocking.storage.PresignedUrlService
import com.openlayer.api.services.blocking.storage.PresignedUrlServiceImpl
import com.openlayer.api.services.errorHandler

class StorageServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StorageService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val presignedUrl: PresignedUrlService by lazy { PresignedUrlServiceImpl(clientOptions) }

    override fun presignedUrl(): PresignedUrlService = presignedUrl
}
