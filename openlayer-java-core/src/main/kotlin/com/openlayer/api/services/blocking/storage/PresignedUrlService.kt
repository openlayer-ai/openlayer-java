// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateResponse
import com.openlayer.api.models.storage.presignedurl.PresignedUrlRetrieveParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlRetrieveResponse
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
     * Exchange a `storageUri` for a short-lived presigned url you can download the object from.
     *
     * Use it to collect anything the platform stored on your behalf -- for example the archive a
     * framework export leaves behind, whose `storageUri` comes back in the background task's
     * `outputs`.
     *
     * The workspace is taken from the API key, so there is nothing else to send. The url is only
     * issued for objects your workspace owns, and `404` covers both "no such object" and "not
     * yours".
     */
    fun retrieve(params: PresignedUrlRetrieveParams): PresignedUrlRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PresignedUrlRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PresignedUrlRetrieveResponse

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

        /**
         * Returns a raw HTTP response for `get /storage/presigned-url`, but is otherwise the same
         * as [PresignedUrlService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PresignedUrlRetrieveParams
        ): HttpResponseFor<PresignedUrlRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PresignedUrlRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PresignedUrlRetrieveResponse>
    }
}
