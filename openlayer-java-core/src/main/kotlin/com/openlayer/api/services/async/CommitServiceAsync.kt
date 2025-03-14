// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.CommitRetrieveParams
import com.openlayer.api.models.CommitRetrieveResponse
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import java.util.concurrent.CompletableFuture

interface CommitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun testResults(): TestResultServiceAsync

    /** Retrieve a project version (commit) by its id. */
    fun retrieve(params: CommitRetrieveParams): CompletableFuture<CommitRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse>

    /**
     * A view of [CommitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun testResults(): TestResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}`, but is otherwise the
         * same as [CommitServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>>
    }
}
