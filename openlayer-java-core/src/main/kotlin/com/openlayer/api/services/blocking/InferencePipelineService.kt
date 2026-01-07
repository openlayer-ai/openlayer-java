// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.InferencePipelineDeleteParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveResponse
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateResponse
import com.openlayer.api.services.blocking.inferencepipelines.DataService
import com.openlayer.api.services.blocking.inferencepipelines.RowService
import com.openlayer.api.services.blocking.inferencepipelines.TestResultService
import java.util.function.Consumer

interface InferencePipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InferencePipelineService

    fun data(): DataService

    fun rows(): RowService

    fun testResults(): TestResultService

    /** Retrieve inference pipeline. */
    fun retrieve(inferencePipelineId: String): InferencePipelineRetrieveResponse =
        retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineRetrieveResponse =
        retrieve(
            params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
    ): InferencePipelineRetrieveResponse =
        retrieve(inferencePipelineId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: InferencePipelineRetrieveParams): InferencePipelineRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): InferencePipelineRetrieveResponse =
        retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none(), requestOptions)

    /** Update inference pipeline. */
    fun update(inferencePipelineId: String): InferencePipelineUpdateResponse =
        update(inferencePipelineId, InferencePipelineUpdateParams.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineUpdateResponse =
        update(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
    ): InferencePipelineUpdateResponse = update(inferencePipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineUpdateResponse

    /** @see update */
    fun update(params: InferencePipelineUpdateParams): InferencePipelineUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): InferencePipelineUpdateResponse =
        update(inferencePipelineId, InferencePipelineUpdateParams.none(), requestOptions)

    /** Delete inference pipeline. */
    fun delete(inferencePipelineId: String) =
        delete(inferencePipelineId, InferencePipelineDeleteParams.none())

    /** @see delete */
    fun delete(
        inferencePipelineId: String,
        params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(
        inferencePipelineId: String,
        params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
    ) = delete(inferencePipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: InferencePipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(inferencePipelineId: String, requestOptions: RequestOptions) =
        delete(inferencePipelineId, InferencePipelineDeleteParams.none(), requestOptions)

    /**
     * A view of [InferencePipelineService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InferencePipelineService.WithRawResponse

        fun data(): DataService.WithRawResponse

        fun rows(): RowService.WithRawResponse

        fun testResults(): TestResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inferencePipelineId: String
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inferencePipelineId: String,
            params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inferencePipelineId: String,
            params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(inferencePipelineId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineService.update].
         */
        @MustBeClosed
        fun update(inferencePipelineId: String): HttpResponseFor<InferencePipelineUpdateResponse> =
            update(inferencePipelineId, InferencePipelineUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            inferencePipelineId: String,
            params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineUpdateResponse> =
            update(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            inferencePipelineId: String,
            params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
        ): HttpResponseFor<InferencePipelineUpdateResponse> =
            update(inferencePipelineId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams
        ): HttpResponseFor<InferencePipelineUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferencePipelineUpdateResponse> =
            update(inferencePipelineId, InferencePipelineUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /inference-pipelines/{inferencePipelineId}`, but
         * is otherwise the same as [InferencePipelineService.delete].
         */
        @MustBeClosed
        fun delete(inferencePipelineId: String): HttpResponse =
            delete(inferencePipelineId, InferencePipelineDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            inferencePipelineId: String,
            params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            inferencePipelineId: String,
            params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
        ): HttpResponse = delete(inferencePipelineId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InferencePipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(inferencePipelineId: String, requestOptions: RequestOptions): HttpResponse =
            delete(inferencePipelineId, InferencePipelineDeleteParams.none(), requestOptions)
    }
}
