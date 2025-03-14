// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.InferencePipelineDataStreamParams
import com.openlayer.api.models.InferencePipelineDataStreamResponse
import java.util.concurrent.CompletableFuture

interface DataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Publish an inference data point to an inference pipeline. */
    fun stream(
        params: InferencePipelineDataStreamParams
    ): CompletableFuture<InferencePipelineDataStreamResponse> =
        stream(params, RequestOptions.none())

    /** @see [stream] */
    fun stream(
        params: InferencePipelineDataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineDataStreamResponse>

    /** A view of [DataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /inference-pipelines/{inferencePipelineId}/data-stream`, but is otherwise the same as
         * [DataServiceAsync.stream].
         */
        @MustBeClosed
        fun stream(
            params: InferencePipelineDataStreamParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineDataStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see [stream] */
        @MustBeClosed
        fun stream(
            params: InferencePipelineDataStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineDataStreamResponse>>
    }
}
