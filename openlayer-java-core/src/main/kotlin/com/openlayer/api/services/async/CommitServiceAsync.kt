// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.CommitRetrieveParams
import com.openlayer.api.models.commits.CommitRetrieveResponse
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitServiceAsync

    fun testResults(): TestResultServiceAsync

    /** Retrieve a project version (commit) by its id. */
    fun retrieve(projectVersionId: String): CompletableFuture<CommitRetrieveResponse> =
        retrieve(projectVersionId, CommitRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        projectVersionId: String,
        params: CommitRetrieveParams = CommitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse> =
        retrieve(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        projectVersionId: String,
        params: CommitRetrieveParams = CommitRetrieveParams.none(),
    ): CompletableFuture<CommitRetrieveResponse> =
        retrieve(projectVersionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: CommitRetrieveParams): CompletableFuture<CommitRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        projectVersionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitRetrieveResponse> =
        retrieve(projectVersionId, CommitRetrieveParams.none(), requestOptions)

    /**
     * A view of [CommitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitServiceAsync.WithRawResponse

        fun testResults(): TestResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}`, but is otherwise the
         * same as [CommitServiceAsync.retrieve].
         */
        fun retrieve(
            projectVersionId: String
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(projectVersionId, CommitRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            projectVersionId: String,
            params: CommitRetrieveParams = CommitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            projectVersionId: String,
            params: CommitRetrieveParams = CommitRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(projectVersionId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: CommitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            projectVersionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(projectVersionId, CommitRetrieveParams.none(), requestOptions)
    }
}
