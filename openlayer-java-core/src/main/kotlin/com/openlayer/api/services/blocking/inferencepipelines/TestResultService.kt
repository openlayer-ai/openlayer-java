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
    fun list(inferencePipelineId: String): TestResultListResponse =
        list(inferencePipelineId, TestResultListParams.none())

    /** @see [list] */
    fun list(
        inferencePipelineId: String,
        params: TestResultListParams = TestResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestResultListResponse =
        list(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see [list] */
    fun list(
        inferencePipelineId: String,
        params: TestResultListParams = TestResultListParams.none(),
    ): TestResultListResponse = list(inferencePipelineId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestResultListResponse

    /** @see [list] */
    fun list(params: TestResultListParams): TestResultListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(inferencePipelineId: String, requestOptions: RequestOptions): TestResultListResponse =
        list(inferencePipelineId, TestResultListParams.none(), requestOptions)

    /** A view of [TestResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}/results`,
         * but is otherwise the same as [TestResultService.list].
         */
        @MustBeClosed
        fun list(inferencePipelineId: String): HttpResponseFor<TestResultListResponse> =
            list(inferencePipelineId, TestResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            params: TestResultListParams = TestResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestResultListResponse> =
            list(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            params: TestResultListParams = TestResultListParams.none(),
        ): HttpResponseFor<TestResultListResponse> =
            list(inferencePipelineId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestResultListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TestResultListParams): HttpResponseFor<TestResultListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestResultListResponse> =
            list(inferencePipelineId, TestResultListParams.none(), requestOptions)
    }
}
