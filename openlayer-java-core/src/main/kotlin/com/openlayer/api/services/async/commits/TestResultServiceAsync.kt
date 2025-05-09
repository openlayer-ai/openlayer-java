// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.commits.testresults.TestResultListParams
import com.openlayer.api.models.commits.testresults.TestResultListResponse
import java.util.concurrent.CompletableFuture

interface TestResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the test results for a project commit (project version). */
    fun list(projectVersionId: String): CompletableFuture<TestResultListResponse> =
        list(projectVersionId, TestResultListParams.none())

    /** @see [list] */
    fun list(
        projectVersionId: String,
        params: TestResultListParams = TestResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestResultListResponse> =
        list(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectVersionId: String,
        params: TestResultListParams = TestResultListParams.none(),
    ): CompletableFuture<TestResultListResponse> =
        list(projectVersionId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestResultListResponse>

    /** @see [list] */
    fun list(params: TestResultListParams): CompletableFuture<TestResultListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        projectVersionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestResultListResponse> =
        list(projectVersionId, TestResultListParams.none(), requestOptions)

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
            projectVersionId: String
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(projectVersionId, TestResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            params: TestResultListParams = TestResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(params.toBuilder().projectVersionId(projectVersionId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            params: TestResultListParams = TestResultListParams.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(projectVersionId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestResultListParams
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectVersionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(projectVersionId, TestResultListParams.none(), requestOptions)
    }
}
