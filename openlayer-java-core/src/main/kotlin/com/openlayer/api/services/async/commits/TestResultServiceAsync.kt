// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.CommitTestResultListParams
import com.openlayer.api.models.CommitTestResultListResponse
import java.util.concurrent.CompletableFuture

interface TestResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the test results for a project commit (project version). */
    fun list(params: CommitTestResultListParams): CompletableFuture<CommitTestResultListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitTestResultListResponse>

    /**
     * A view of [TestResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}/results`, but is
         * otherwise the same as [TestResultServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: CommitTestResultListParams
        ): CompletableFuture<HttpResponseFor<CommitTestResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitTestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitTestResultListResponse>>
    }
}
