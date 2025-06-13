// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListParams
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TestResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestResultServiceAsync

    /** List the latest test results for an inference pipeline. */
    fun list(inferencePipelineId: String): CompletableFuture<TestResultListResponse> =
        list(inferencePipelineId, TestResultListParams.none())

    /** @see [list] */
    fun list(
        inferencePipelineId: String,
        params: TestResultListParams = TestResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestResultListResponse> =
        list(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see [list] */
    fun list(
        inferencePipelineId: String,
        params: TestResultListParams = TestResultListParams.none(),
    ): CompletableFuture<TestResultListResponse> =
        list(inferencePipelineId, params, RequestOptions.none())

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
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestResultListResponse> =
        list(inferencePipelineId, TestResultListParams.none(), requestOptions)

    /**
     * A view of [TestResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}/results`,
         * but is otherwise the same as [TestResultServiceAsync.list].
         */
        fun list(
            inferencePipelineId: String
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(inferencePipelineId, TestResultListParams.none())

        /** @see [list] */
        fun list(
            inferencePipelineId: String,
            params: TestResultListParams = TestResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see [list] */
        fun list(
            inferencePipelineId: String,
            params: TestResultListParams = TestResultListParams.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(inferencePipelineId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: TestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>>

        /** @see [list] */
        fun list(
            params: TestResultListParams
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestResultListResponse>> =
            list(inferencePipelineId, TestResultListParams.none(), requestOptions)
    }
}
