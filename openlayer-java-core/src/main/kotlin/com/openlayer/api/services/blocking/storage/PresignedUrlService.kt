// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateResponse
import java.util.function.Consumer

interface PresignedUrlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PresignedUrlService

    /** Retrieve a presigned url to post storage artifacts. */
    fun create(params: PresignedUrlCreateParams): PresignedUrlCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PresignedUrlCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrlCreateResponse

    /**
     * A view of [PresignedUrlService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PresignedUrlService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /storage/presigned-url`, but is otherwise the same
         * as [PresignedUrlService.create].
         */
        @MustBeClosed
        fun create(params: PresignedUrlCreateParams): HttpResponseFor<PresignedUrlCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PresignedUrlCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrlCreateResponse>
    }
}
