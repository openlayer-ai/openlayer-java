// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.tests.TestEvaluateParams
import com.openlayer.api.models.tests.TestEvaluateResponse
import java.util.function.Consumer

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService

    /**
     * Triggers one-off evaluation of a specific monitoring test for a custom timestamp range. This
     * allows evaluating tests for historical data or custom time periods outside the regular
     * evaluation window schedule. It also allows overwriting the existing test results.
     */
    fun evaluate(testId: String, params: TestEvaluateParams): TestEvaluateResponse =
        evaluate(testId, params, RequestOptions.none())

    /** @see evaluate */
    fun evaluate(
        testId: String,
        params: TestEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestEvaluateResponse = evaluate(params.toBuilder().testId(testId).build(), requestOptions)

    /** @see evaluate */
    fun evaluate(params: TestEvaluateParams): TestEvaluateResponse =
        evaluate(params, RequestOptions.none())

    /** @see evaluate */
    fun evaluate(
        params: TestEvaluateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestEvaluateResponse

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tests/{testId}/evaluate`, but is otherwise the
         * same as [TestService.evaluate].
         */
        @MustBeClosed
        fun evaluate(
            testId: String,
            params: TestEvaluateParams,
        ): HttpResponseFor<TestEvaluateResponse> = evaluate(testId, params, RequestOptions.none())

        /** @see evaluate */
        @MustBeClosed
        fun evaluate(
            testId: String,
            params: TestEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestEvaluateResponse> =
            evaluate(params.toBuilder().testId(testId).build(), requestOptions)

        /** @see evaluate */
        @MustBeClosed
        fun evaluate(params: TestEvaluateParams): HttpResponseFor<TestEvaluateResponse> =
            evaluate(params, RequestOptions.none())

        /** @see evaluate */
        @MustBeClosed
        fun evaluate(
            params: TestEvaluateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestEvaluateResponse>
    }
}
