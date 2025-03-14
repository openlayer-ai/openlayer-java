// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.commits

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse

interface TestResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the test results for a project commit (project version). */
    fun list(params: TestResultListParams): TestResultListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestResultListResponse

    /** A view of [TestResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}/results`, but is
         * otherwise the same as [TestResultService.list].
         */
        @MustBeClosed
        fun list(params: TestResultListParams): HttpResponseFor<TestResultListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestResultListResponse>
    }
}
