// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowDeleteParams
import com.openlayer.api.models.inferencepipelines.rows.RowListParams
import com.openlayer.api.models.inferencepipelines.rows.RowListResponse
import com.openlayer.api.models.inferencepipelines.rows.RowRetrieveParams
import com.openlayer.api.models.inferencepipelines.rows.RowRetrieveResponse
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

    /** Fetch a single inference pipeline row by inference ID, including OTel steps. */
    fun retrieve(
        inferenceId: String,
        params: RowRetrieveParams,
    ): CompletableFuture<RowRetrieveResponse> = retrieve(inferenceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inferenceId: String,
        params: RowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowRetrieveResponse> =
        retrieve(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RowRetrieveParams): CompletableFuture<RowRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowRetrieveResponse>

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

    /** A list of rows for an inference pipeline. */
    fun list(inferencePipelineId: String): CompletableFuture<RowListResponse> =
        list(inferencePipelineId, RowListParams.none())

    /** @see list */
    fun list(
        inferencePipelineId: String,
        params: RowListParams = RowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListResponse> =
        list(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see list */
    fun list(
        inferencePipelineId: String,
        params: RowListParams = RowListParams.none(),
    ): CompletableFuture<RowListResponse> = list(inferencePipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowListResponse>

    /** @see list */
    fun list(params: RowListParams): CompletableFuture<RowListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowListResponse> =
        list(inferencePipelineId, RowListParams.none(), requestOptions)

    /**
     * Delete a single inference pipeline row by inference ID. Only project admins can perform this
     * action.
     */
    fun delete(inferenceId: String, params: RowDeleteParams): CompletableFuture<Void?> =
        delete(inferenceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        inferenceId: String,
        params: RowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: RowDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [RowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inference-pipelines/{inferencePipelineId}/rows/{inferenceId}`, but is otherwise the same
         * as [RowServiceAsync.retrieve].
         */
        fun retrieve(
            inferenceId: String,
            params: RowRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RowRetrieveResponse>> =
            retrieve(inferenceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inferenceId: String,
            params: RowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowRetrieveResponse>> =
            retrieve(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RowRetrieveParams
        ): CompletableFuture<HttpResponseFor<RowRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowRetrieveResponse>>

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

        /**
         * Returns a raw HTTP response for `post /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowServiceAsync.list].
         */
        fun list(inferencePipelineId: String): CompletableFuture<HttpResponseFor<RowListResponse>> =
            list(inferencePipelineId, RowListParams.none())

        /** @see list */
        fun list(
            inferencePipelineId: String,
            params: RowListParams = RowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListResponse>> =
            list(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            inferencePipelineId: String,
            params: RowListParams = RowListParams.none(),
        ): CompletableFuture<HttpResponseFor<RowListResponse>> =
            list(inferencePipelineId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowListResponse>>

        /** @see list */
        fun list(params: RowListParams): CompletableFuture<HttpResponseFor<RowListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowListResponse>> =
            list(inferencePipelineId, RowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /inference-pipelines/{inferencePipelineId}/rows/{inferenceId}`, but is otherwise the same
         * as [RowServiceAsync.delete].
         */
        fun delete(inferenceId: String, params: RowDeleteParams): CompletableFuture<HttpResponse> =
            delete(inferenceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            inferenceId: String,
            params: RowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

        /** @see delete */
        fun delete(params: RowDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
