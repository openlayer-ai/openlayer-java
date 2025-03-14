// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import com.openlayer.api.models.inferencepipelines.data.DataStreamResponse
import java.util.concurrent.CompletableFuture

interface DataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Publish an inference data point to an inference pipeline. */
    fun stream(params: DataStreamParams): CompletableFuture<DataStreamResponse> =
        stream(params, RequestOptions.none())

    /** @see [stream] */
    fun stream(
        params: DataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataStreamResponse>

    /** A view of [DataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /inference-pipelines/{inferencePipelineId}/data-stream`, but is otherwise the same as
         * [DataServiceAsync.stream].
         */
        @MustBeClosed
        fun stream(
            params: DataStreamParams
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see [stream] */
        @MustBeClosed
        fun stream(
            params: DataStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>>
    }
}
