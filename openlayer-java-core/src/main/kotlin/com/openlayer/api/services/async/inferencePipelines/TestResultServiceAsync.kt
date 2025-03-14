// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.InferencePipelineTestResultListParams
import com.openlayer.api.models.InferencePipelineTestResultListResponse
import java.util.concurrent.CompletableFuture

interface TestResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the latest test results for an inference pipeline. */
    fun list(
        params: InferencePipelineTestResultListParams
    ): CompletableFuture<InferencePipelineTestResultListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: InferencePipelineTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineTestResultListResponse>

    /**
     * A view of [TestResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}/results`,
         * but is otherwise the same as [TestResultServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: InferencePipelineTestResultListParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineTestResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InferencePipelineTestResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineTestResultListResponse>>
    }
}
