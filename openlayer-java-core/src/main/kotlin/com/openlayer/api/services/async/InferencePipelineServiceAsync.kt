// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.InferencePipelineDeleteParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveResponse
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateResponse
import com.openlayer.api.services.async.inferencepipelines.DataServiceAsync
import com.openlayer.api.services.async.inferencepipelines.RowServiceAsync
import com.openlayer.api.services.async.inferencepipelines.TestResultServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InferencePipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InferencePipelineServiceAsync

    fun data(): DataServiceAsync

    fun rows(): RowServiceAsync

    fun testResults(): TestResultServiceAsync

    /** Retrieve inference pipeline. */
    fun retrieve(
        inferencePipelineId: String
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(
            params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(inferencePipelineId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: InferencePipelineRetrieveParams
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none(), requestOptions)

    /** Update inference pipeline. */
    fun update(inferencePipelineId: String): CompletableFuture<InferencePipelineUpdateResponse> =
        update(inferencePipelineId, InferencePipelineUpdateParams.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineUpdateResponse> =
        update(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see update */
    fun update(
        inferencePipelineId: String,
        params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
    ): CompletableFuture<InferencePipelineUpdateResponse> =
        update(inferencePipelineId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineUpdateResponse>

    /** @see update */
    fun update(
        params: InferencePipelineUpdateParams
    ): CompletableFuture<InferencePipelineUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineUpdateResponse> =
        update(inferencePipelineId, InferencePipelineUpdateParams.none(), requestOptions)

    /** Delete inference pipeline. */
    fun delete(inferencePipelineId: String): CompletableFuture<Void?> =
        delete(inferencePipelineId, InferencePipelineDeleteParams.none())

    /** @see delete */
    fun delete(
        inferencePipelineId: String,
        params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().inferencePipelineId(inferencePipelineId).build(), requestOptions)

    /** @see delete */
    fun delete(
        inferencePipelineId: String,
        params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(inferencePipelineId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: InferencePipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        inferencePipelineId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        delete(inferencePipelineId, InferencePipelineDeleteParams.none(), requestOptions)

    /**
     * A view of [InferencePipelineServiceAsync] that provides access to raw HTTP responses for each
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
        ): InferencePipelineServiceAsync.WithRawResponse

        fun data(): DataServiceAsync.WithRawResponse

        fun rows(): RowServiceAsync.WithRawResponse

        fun testResults(): TestResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineServiceAsync.retrieve].
         */
        fun retrieve(
            inferencePipelineId: String
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inferencePipelineId: String,
            params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inferencePipelineId: String,
            params: InferencePipelineRetrieveParams = InferencePipelineRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(inferencePipelineId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InferencePipelineRetrieveParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(inferencePipelineId, InferencePipelineRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineServiceAsync.update].
         */
        fun update(
            inferencePipelineId: String
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(inferencePipelineId, InferencePipelineUpdateParams.none())

        /** @see update */
        fun update(
            inferencePipelineId: String,
            params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            inferencePipelineId: String,
            params: InferencePipelineUpdateParams = InferencePipelineUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(inferencePipelineId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InferencePipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>>

        /** @see update */
        fun update(
            params: InferencePipelineUpdateParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(inferencePipelineId, InferencePipelineUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /inference-pipelines/{inferencePipelineId}`, but
         * is otherwise the same as [InferencePipelineServiceAsync.delete].
         */
        fun delete(inferencePipelineId: String): CompletableFuture<HttpResponse> =
            delete(inferencePipelineId, InferencePipelineDeleteParams.none())

        /** @see delete */
        fun delete(
            inferencePipelineId: String,
            params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                params.toBuilder().inferencePipelineId(inferencePipelineId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            inferencePipelineId: String,
            params: InferencePipelineDeleteParams = InferencePipelineDeleteParams.none(),
        ): CompletableFuture<HttpResponse> =
            delete(inferencePipelineId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: InferencePipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            inferencePipelineId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(inferencePipelineId, InferencePipelineDeleteParams.none(), requestOptions)
    }
}
