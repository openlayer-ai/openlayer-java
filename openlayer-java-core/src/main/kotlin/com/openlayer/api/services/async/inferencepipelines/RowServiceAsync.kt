// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync

    /** Update an inference data point in an inference pipeline. */
    fun update(
        inferencePipelineId: String,
        params: RowUpdateParams,
    ): CompletableFuture<RowUpdateResponse> =
        update(inferencePipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: RowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowUpdateResponse> =
        update(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see update */
    fun update(params: RowUpdateParams): CompletableFuture<RowUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowUpdateResponse>

    /** A view of [RowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowServiceAsync.update].
         */
        fun update(
            inferencePipelineId: String,
            params: RowUpdateParams,
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>> =
            update(inferencePipelineId, params, RequestOptions.none())

        /** @see update */
        fun update(
            inferencePipelineId: String,
            params: RowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>> =
            update(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(params: RowUpdateParams): CompletableFuture<HttpResponseFor<RowUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>>
    }
}
