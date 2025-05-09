// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.CommitRetrieveParams
import com.openlayer.api.models.commits.CommitRetrieveResponse
import com.openlayer.api.services.blocking.commits.TestResultService

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun testResults(): TestResultService

    /** Retrieve a project version (commit) by its id. */
    fun retrieve(params: CommitRetrieveParams): CommitRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitRetrieveResponse

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun testResults(): TestResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}`, but is otherwise the
         * same as [CommitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CommitRetrieveParams): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitRetrieveResponse>
    }
}
