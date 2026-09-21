// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.rulestats.RuleStatRetrieveParams
import com.openlayer.api.models.governance.rulestats.RuleStatRetrieveResponse
import java.util.function.Consumer

interface RuleStatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleStatService

    /**
     * Get a compliance roll-up for a workspace: how many rules exist, and how many of their results
     * are passing, failing, pending, or due for renewal.
     *
     * Counts respect the filters you pass, so `frameworkId` gives you a single framework's overall
     * compliance and `projectId` gives you a single project's.
     */
    fun retrieve(workspaceId: String): RuleStatRetrieveResponse =
        retrieve(workspaceId, RuleStatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleStatRetrieveResponse =
        retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
    ): RuleStatRetrieveResponse = retrieve(workspaceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleStatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleStatRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RuleStatRetrieveParams): RuleStatRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(workspaceId: String, requestOptions: RequestOptions): RuleStatRetrieveResponse =
        retrieve(workspaceId, RuleStatRetrieveParams.none(), requestOptions)

    /** A view of [RuleStatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleStatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-stats`, but is
         * otherwise the same as [RuleStatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(workspaceId: String): HttpResponseFor<RuleStatRetrieveResponse> =
            retrieve(workspaceId, RuleStatRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleStatRetrieveResponse> =
            retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
        ): HttpResponseFor<RuleStatRetrieveResponse> =
            retrieve(workspaceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleStatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleStatRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RuleStatRetrieveParams): HttpResponseFor<RuleStatRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleStatRetrieveResponse> =
            retrieve(workspaceId, RuleStatRetrieveParams.none(), requestOptions)
    }
}
