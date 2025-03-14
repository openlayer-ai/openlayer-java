// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.storage

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateResponse
import java.util.concurrent.CompletableFuture

interface PresignedUrlServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a presigned url to post storage artifacts. */
    fun create(params: PresignedUrlCreateParams): CompletableFuture<PresignedUrlCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PresignedUrlCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PresignedUrlCreateResponse>

    /**
     * A view of [PresignedUrlServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /storage/presigned-url`, but is otherwise the same
         * as [PresignedUrlServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PresignedUrlCreateParams
        ): CompletableFuture<HttpResponseFor<PresignedUrlCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PresignedUrlCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PresignedUrlCreateResponse>>
    }
}
