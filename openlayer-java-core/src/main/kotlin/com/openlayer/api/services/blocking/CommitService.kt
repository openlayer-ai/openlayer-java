// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.CommitRetrieveParams
import com.openlayer.api.models.commits.CommitRetrieveResponse
import com.openlayer.api.services.blocking.commits.TestResultService
import java.util.function.Consumer

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService

    fun testResults(): TestResultService

    /** Retrieve a project version (commit) by its id. */
    fun retrieve(projectVersionId: String): CommitRetrieveResponse =
        retrieve(projectVersionId, CommitRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        projectVersionId: String,
        params: CommitRetrieveParams = CommitRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitRetrieveResponse =
        retrieve(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        projectVersionId: String,
        params: CommitRetrieveParams = CommitRetrieveParams.none(),
    ): CommitRetrieveResponse = retrieve(projectVersionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: CommitRetrieveParams): CommitRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(projectVersionId: String, requestOptions: RequestOptions): CommitRetrieveResponse =
        retrieve(projectVersionId, CommitRetrieveParams.none(), requestOptions)

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService.WithRawResponse

        fun testResults(): TestResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}`, but is otherwise the
         * same as [CommitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(projectVersionId: String): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(projectVersionId, CommitRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            projectVersionId: String,
            params: CommitRetrieveParams = CommitRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            projectVersionId: String,
            params: CommitRetrieveParams = CommitRetrieveParams.none(),
        ): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(projectVersionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommitRetrieveParams): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            projectVersionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(projectVersionId, CommitRetrieveParams.none(), requestOptions)
    }
}
