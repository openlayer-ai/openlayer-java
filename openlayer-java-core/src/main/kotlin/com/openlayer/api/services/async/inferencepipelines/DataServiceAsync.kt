// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import com.openlayer.api.models.inferencepipelines.data.DataStreamResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataServiceAsync

    /** Publish an inference data point to an inference pipeline. */
    fun stream(
        inferencePipelineId: String,
        params: DataStreamParams,
    ): CompletableFuture<DataStreamResponse> =
        stream(inferencePipelineId, params, RequestOptions.none())

    /** @see [stream] */
    fun stream(
        inferencePipelineId: String,
        params: DataStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataStreamResponse> =
        stream(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see [stream] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /inference-pipelines/{inferencePipelineId}/data-stream`, but is otherwise the same as
         * [DataServiceAsync.stream].
         */
        fun stream(
            inferencePipelineId: String,
            params: DataStreamParams,
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>> =
            stream(inferencePipelineId, params, RequestOptions.none())

        /** @see [stream] */
        fun stream(
            inferencePipelineId: String,
            params: DataStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>> =
            stream(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see [stream] */
        fun stream(
            params: DataStreamParams
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>> =
            stream(params, RequestOptions.none())

        /** @see [stream] */
        fun stream(
            params: DataStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataStreamResponse>>
    }
}
