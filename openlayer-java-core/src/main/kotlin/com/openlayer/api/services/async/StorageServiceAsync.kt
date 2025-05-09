// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.services.async.storage.PresignedUrlServiceAsync

interface StorageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun presignedUrl(): PresignedUrlServiceAsync

    /**
     * A view of [StorageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun presignedUrl(): PresignedUrlServiceAsync.WithRawResponse
    }
}
