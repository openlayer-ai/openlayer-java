// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.commits

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.CommitTestResultListParams
import com.openlayer.api.models.CommitTestResultListResponse

interface TestResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the test results for a project commit (project version). */
    fun list(params: CommitTestResultListParams): CommitTestResultListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitTestResultListResponse

    /** A view of [TestResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}/results`, but is
         * otherwise the same as [TestResultService.list].
         */
        @MustBeClosed
        fun list(
            params: CommitTestResultListParams
        ): HttpResponseFor<CommitTestResultListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitTestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitTestResultListResponse>
    }
}
