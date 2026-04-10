// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService

    /** Fetch a single inference pipeline row by inference ID, including OTel steps. */
    fun retrieve(inferenceId: String, params: RowRetrieveParams): RowRetrieveResponse =
        retrieve(inferenceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inferenceId: String,
        params: RowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowRetrieveResponse =
        retrieve(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RowRetrieveParams): RowRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowRetrieveResponse

    /** Update an inference data point in an inference pipeline. */
    fun update(inferencePipelineId: String, params: RowUpdateParams): RowUpdateResponse =
        update(inferencePipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: RowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowUpdateResponse =
        update(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see update */
    fun update(params: RowUpdateParams): RowUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowUpdateResponse

    /** A list of rows for an inference pipeline. */
    fun list(inferencePipelineId: String): RowListResponse =
        list(inferencePipelineId, RowListParams.none())

    /** @see list */
    fun list(
        inferencePipelineId: String,
        params: RowListParams = RowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListResponse =
        list(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see list */
    fun list(
        inferencePipelineId: String,
        params: RowListParams = RowListParams.none(),
    ): RowListResponse = list(inferencePipelineId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RowListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowListResponse

    /** @see list */
    fun list(params: RowListParams): RowListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(inferencePipelineId: String, requestOptions: RequestOptions): RowListResponse =
        list(inferencePipelineId, RowListParams.none(), requestOptions)

    /**
     * Delete a single inference pipeline row by inference ID. Only project admins can perform this
     * action.
     */
    fun delete(inferenceId: String, params: RowDeleteParams) =
        delete(inferenceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        inferenceId: String,
        params: RowDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: RowDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: RowDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inference-pipelines/{inferencePipelineId}/rows/{inferenceId}`, but is otherwise the same
         * as [RowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inferenceId: String,
            params: RowRetrieveParams,
        ): HttpResponseFor<RowRetrieveResponse> =
            retrieve(inferenceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inferenceId: String,
            params: RowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowRetrieveResponse> =
            retrieve(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RowRetrieveParams): HttpResponseFor<RowRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowService.update].
         */
        @MustBeClosed
        fun update(
            inferencePipelineId: String,
            params: RowUpdateParams,
        ): HttpResponseFor<RowUpdateResponse> =
            update(inferencePipelineId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            inferencePipelineId: String,
            params: RowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowUpdateResponse> =
            update(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(params: RowUpdateParams): HttpResponseFor<RowUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowService.list].
         */
        @MustBeClosed
        fun list(inferencePipelineId: String): HttpResponseFor<RowListResponse> =
            list(inferencePipelineId, RowListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            params: RowListParams = RowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListResponse> =
            list(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            params: RowListParams = RowListParams.none(),
        ): HttpResponseFor<RowListResponse> =
            list(inferencePipelineId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RowListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RowListParams): HttpResponseFor<RowListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RowListResponse> =
            list(inferencePipelineId, RowListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /inference-pipelines/{inferencePipelineId}/rows/{inferenceId}`, but is otherwise the same
         * as [RowService.delete].
         */
        @MustBeClosed
        fun delete(inferenceId: String, params: RowDeleteParams): HttpResponse =
            delete(inferenceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            inferenceId: String,
            params: RowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().inferenceId(inferenceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RowDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RowDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
