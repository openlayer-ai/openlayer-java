// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowCreateParams
import com.openlayer.api.models.inferencepipelines.rows.RowCreateResponse
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

    /** A list of rows for an inference pipeline. */
    fun create(inferencePipelineId: String): CompletableFuture<RowCreateResponse> =
        create(inferencePipelineId, RowCreateParams.none())

    /** @see create */
    fun create(
        inferencePipelineId: String,
        params: RowCreateParams = RowCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowCreateResponse> =
        create(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see create */
    fun create(
        inferencePipelineId: String,
        params: RowCreateParams = RowCreateParams.none(),
    ): CompletableFuture<RowCreateResponse> =
        create(inferencePipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowCreateResponse>

    /** @see create */
    fun create(params: RowCreateParams): CompletableFuture<RowCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowCreateResponse> =
        create(inferencePipelineId, RowCreateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowServiceAsync.create].
         */
        fun create(
            inferencePipelineId: String
        ): CompletableFuture<HttpResponseFor<RowCreateResponse>> =
            create(inferencePipelineId, RowCreateParams.none())

        /** @see create */
        fun create(
            inferencePipelineId: String,
            params: RowCreateParams = RowCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowCreateResponse>> =
            create(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            inferencePipelineId: String,
            params: RowCreateParams = RowCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<RowCreateResponse>> =
            create(inferencePipelineId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowCreateResponse>>

        /** @see create */
        fun create(params: RowCreateParams): CompletableFuture<HttpResponseFor<RowCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowCreateResponse>> =
            create(inferencePipelineId, RowCreateParams.none(), requestOptions)

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
