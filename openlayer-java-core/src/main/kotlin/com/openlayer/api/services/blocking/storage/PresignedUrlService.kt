// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking.storage

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import com.openlayer.api.models.StoragePresignedUrlCreateResponse

interface PresignedUrlService {

    /** Retrieve a presigned url to post storage artifacts. */
    @JvmOverloads
    fun create(
        params: StoragePresignedUrlCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoragePresignedUrlCreateResponse
}
