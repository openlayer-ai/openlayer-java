// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import com.openlayer.api.models.StoragePresignedUrlCreateResponse

interface PresignedUrlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a presigned url to post storage artifacts. */
    fun create(params: StoragePresignedUrlCreateParams): StoragePresignedUrlCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: StoragePresignedUrlCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoragePresignedUrlCreateResponse

    /**
     * A view of [PresignedUrlService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /storage/presigned-url`, but is otherwise the same
         * as [PresignedUrlService.create].
         */
        @MustBeClosed
        fun create(
            params: StoragePresignedUrlCreateParams
        ): HttpResponseFor<StoragePresignedUrlCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: StoragePresignedUrlCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoragePresignedUrlCreateResponse>
    }
}
