// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.rulestats.RuleStatRetrieveParams
import com.openlayer.api.models.governance.rulestats.RuleStatRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleStatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleStatServiceAsync

    /** Get compliance statistics for a workspace. */
    fun retrieve(workspaceId: String): CompletableFuture<RuleStatRetrieveResponse> =
        retrieve(workspaceId, RuleStatRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleStatRetrieveResponse> =
        retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
    ): CompletableFuture<RuleStatRetrieveResponse> =
        retrieve(workspaceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleStatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleStatRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RuleStatRetrieveParams): CompletableFuture<RuleStatRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleStatRetrieveResponse> =
        retrieve(workspaceId, RuleStatRetrieveParams.none(), requestOptions)

    /**
     * A view of [RuleStatServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleStatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-stats`, but is
         * otherwise the same as [RuleStatServiceAsync.retrieve].
         */
        fun retrieve(
            workspaceId: String
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>> =
            retrieve(workspaceId, RuleStatRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>> =
            retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            params: RuleStatRetrieveParams = RuleStatRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>> =
            retrieve(workspaceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RuleStatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RuleStatRetrieveParams
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleStatRetrieveResponse>> =
            retrieve(workspaceId, RuleStatRetrieveParams.none(), requestOptions)
    }
}
