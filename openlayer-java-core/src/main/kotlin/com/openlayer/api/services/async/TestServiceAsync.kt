// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.tests.TestEvaluateParams
import com.openlayer.api.models.tests.TestEvaluateResponse
import com.openlayer.api.models.tests.TestListResultsParams
import com.openlayer.api.models.tests.TestListResultsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync

    /**
     * Triggers one-off evaluation of a specific monitoring test for a custom timestamp range. This
     * allows evaluating tests for historical data or custom time periods outside the regular
     * evaluation window schedule. It also allows overwriting the existing test results.
     */
    fun evaluate(
        testId: String,
        params: TestEvaluateParams,
    ): CompletableFuture<TestEvaluateResponse> = evaluate(testId, params, RequestOptions.none())

    /** @see evaluate */
    fun evaluate(
        testId: String,
        params: TestEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestEvaluateResponse> =
        evaluate(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see evaluate */
    fun evaluate(params: TestEvaluateParams): CompletableFuture<TestEvaluateResponse> =
        evaluate(params, RequestOptions.none())

    /** @see evaluate */
    fun evaluate(
        params: TestEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestEvaluateResponse>

    /** List the test results for a test. */
    fun listResults(testId: String): CompletableFuture<TestListResultsResponse> =
        listResults(testId, TestListResultsParams.none())

    /** @see listResults */
    fun listResults(
        testId: String,
        params: TestListResultsParams = TestListResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListResultsResponse> =
        listResults(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see listResults */
    fun listResults(
        testId: String,
        params: TestListResultsParams = TestListResultsParams.none(),
    ): CompletableFuture<TestListResultsResponse> =
        listResults(testId, params, RequestOptions.none())

    /** @see listResults */
    fun listResults(
        params: TestListResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListResultsResponse>

    /** @see listResults */
    fun listResults(params: TestListResultsParams): CompletableFuture<TestListResultsResponse> =
        listResults(params, RequestOptions.none())

    /** @see listResults */
    fun listResults(
        testId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestListResultsResponse> =
        listResults(testId, TestListResultsParams.none(), requestOptions)

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tests/{testId}/evaluate`, but is otherwise the
         * same as [TestServiceAsync.evaluate].
         */
        fun evaluate(
            testId: String,
            params: TestEvaluateParams,
        ): CompletableFuture<HttpResponseFor<TestEvaluateResponse>> =
            evaluate(testId, params, RequestOptions.none())

        /** @see evaluate */
        fun evaluate(
            testId: String,
            params: TestEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestEvaluateResponse>> =
            evaluate(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see evaluate */
        fun evaluate(
            params: TestEvaluateParams
        ): CompletableFuture<HttpResponseFor<TestEvaluateResponse>> =
            evaluate(params, RequestOptions.none())

        /** @see evaluate */
        fun evaluate(
            params: TestEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestEvaluateResponse>>

        /**
         * Returns a raw HTTP response for `get /tests/{testId}/results`, but is otherwise the same
         * as [TestServiceAsync.listResults].
         */
        fun listResults(
            testId: String
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>> =
            listResults(testId, TestListResultsParams.none())

        /** @see listResults */
        fun listResults(
            testId: String,
            params: TestListResultsParams = TestListResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>> =
            listResults(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see listResults */
        fun listResults(
            testId: String,
            params: TestListResultsParams = TestListResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>> =
            listResults(testId, params, RequestOptions.none())

        /** @see listResults */
        fun listResults(
            params: TestListResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>>

        /** @see listResults */
        fun listResults(
            params: TestListResultsParams
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>> =
            listResults(params, RequestOptions.none())

        /** @see listResults */
        fun listResults(
            testId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestListResultsResponse>> =
            listResults(testId, TestListResultsParams.none(), requestOptions)
    }
}
