// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowListParams
import com.openlayer.api.models.inferencepipelines.rows.RowListResponse
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

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService.WithRawResponse

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
    }
}
