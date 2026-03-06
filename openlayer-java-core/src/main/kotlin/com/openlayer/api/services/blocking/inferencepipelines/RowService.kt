// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowCreateParams
import com.openlayer.api.models.inferencepipelines.rows.RowCreateResponse
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

    /** A list of rows for an inference pipeline. */
    fun create(inferencePipelineId: String): RowCreateResponse =
        create(inferencePipelineId, RowCreateParams.none())

    /** @see create */
    fun create(
        inferencePipelineId: String,
        params: RowCreateParams = RowCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowCreateResponse =
        create(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see create */
    fun create(
        inferencePipelineId: String,
        params: RowCreateParams = RowCreateParams.none(),
    ): RowCreateResponse = create(inferencePipelineId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RowCreateResponse

    /** @see create */
    fun create(params: RowCreateParams): RowCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(inferencePipelineId: String, requestOptions: RequestOptions): RowCreateResponse =
        create(inferencePipelineId, RowCreateParams.none(), requestOptions)

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

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowService.create].
         */
        @MustBeClosed
        fun create(inferencePipelineId: String): HttpResponseFor<RowCreateResponse> =
            create(inferencePipelineId, RowCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            inferencePipelineId: String,
            params: RowCreateParams = RowCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowCreateResponse> =
            create(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            inferencePipelineId: String,
            params: RowCreateParams = RowCreateParams.none(),
        ): HttpResponseFor<RowCreateResponse> =
            create(inferencePipelineId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RowCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: RowCreateParams): HttpResponseFor<RowCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RowCreateResponse> =
            create(inferencePipelineId, RowCreateParams.none(), requestOptions)

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
    }
}
