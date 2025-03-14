// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.services.blocking.storage.PresignedUrlService

interface StorageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun presignedUrl(): PresignedUrlService

    /** A view of [StorageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun presignedUrl(): PresignedUrlService.WithRawResponse
    }
}
