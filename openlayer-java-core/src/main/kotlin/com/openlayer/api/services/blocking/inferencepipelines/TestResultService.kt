// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListParams
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListResponse

interface TestResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the latest test results for an inference pipeline. */
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
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}/results`,
         * but is otherwise the same as [TestResultService.list].
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
