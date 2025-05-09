// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface InferencePipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun data(): DataService

    fun rows(): RowService

    fun testResults(): TestResultService

    /** Retrieve inference pipeline. */
    fun retrieve(params: InferencePipelineRetrieveParams): InferencePipelineRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InferencePipelineRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineRetrieveResponse

    /** Update inference pipeline. */
    fun update(params: InferencePipelineUpdateParams): InferencePipelineUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InferencePipelineUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineUpdateResponse

    /** Delete inference pipeline. */
    fun delete(params: InferencePipelineDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: InferencePipelineDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [InferencePipelineService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun data(): DataService.WithRawResponse

        fun rows(): RowService.WithRawResponse

        fun testResults(): TestResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams
        ): HttpResponseFor<InferencePipelineRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InferencePipelineRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}`, but is
         * otherwise the same as [InferencePipelineService.update].
         */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams
        ): HttpResponseFor<InferencePipelineUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InferencePipelineUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /inference-pipelines/{inferencePipelineId}`, but
         * is otherwise the same as [InferencePipelineService.delete].
         */
        @MustBeClosed
        fun delete(params: InferencePipelineDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: InferencePipelineDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
