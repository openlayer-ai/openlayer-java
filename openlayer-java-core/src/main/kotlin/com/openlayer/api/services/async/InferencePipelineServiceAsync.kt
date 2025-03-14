// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

interface InferencePipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun data(): DataServiceAsync

    fun rows(): RowServiceAsync

    fun testResults(): TestResultServiceAsync

    /** Retrieve inference pipeline. */
    fun retrieve(
        params: InferencePipelineRetrieveParams
    ): CompletableFuture<InferencePipelineRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineRetrieveResponse>

    /** Update inference pipeline. */
    fun update(
        params: InferencePipelineUpdateParams
    ): CompletableFuture<InferencePipelineUpdateResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineUpdateResponse>

    /** Delete inference pipeline. */
    fun delete(params: InferencePipelineDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [InferencePipelineServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun data(): DataServiceAsync.WithRawResponse

        fun rows(): RowServiceAsync.WithRawResponse

        fun testResults(): TestResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /inference-pipelines/{inferencePipelineId}`, but
         * is otherwise the same as [InferencePipelineServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: InferencePipelineDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
