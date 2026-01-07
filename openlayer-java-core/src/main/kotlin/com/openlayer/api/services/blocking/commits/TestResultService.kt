// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.commits

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse
import java.util.function.Consumer

interface TestResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestResultService

    /** List the test results for a project commit (project version). */
    fun list(projectVersionId: String): TestResultListResponse =
        list(projectVersionId, TestResultListParams.none())

    /** @see list */
    fun list(
        projectVersionId: String,
        params: TestResultListParams = TestResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestResultListResponse =
        list(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

    /** @see list */
    fun list(
        projectVersionId: String,
        params: TestResultListParams = TestResultListParams.none(),
    ): TestResultListResponse = list(projectVersionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestResultListResponse

    /** @see list */
    fun list(params: TestResultListParams): TestResultListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(projectVersionId: String, requestOptions: RequestOptions): TestResultListResponse =
        list(projectVersionId, TestResultListParams.none(), requestOptions)

    /** A view of [TestResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /versions/{projectVersionId}/results`, but is
         * otherwise the same as [TestResultService.list].
         */
        @MustBeClosed
        fun list(projectVersionId: String): HttpResponseFor<TestResultListResponse> =
            list(projectVersionId, TestResultListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            params: TestResultListParams = TestResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestResultListResponse> =
            list(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            params: TestResultListParams = TestResultListParams.none(),
        ): HttpResponseFor<TestResultListResponse> =
            list(projectVersionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestResultListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TestResultListParams): HttpResponseFor<TestResultListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestResultListResponse> =
            list(projectVersionId, TestResultListParams.none(), requestOptions)
    }
}
