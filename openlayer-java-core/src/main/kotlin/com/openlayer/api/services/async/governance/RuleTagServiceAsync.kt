// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.ruletags.RuleTagListParams
import com.openlayer.api.models.governance.ruletags.RuleTagListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleTagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleTagServiceAsync

    /** List the rule tags in a workspace. */
    fun list(workspaceId: String): CompletableFuture<RuleTagListResponse> =
        list(workspaceId, RuleTagListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleTagListParams = RuleTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleTagListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleTagListParams = RuleTagListParams.none(),
    ): CompletableFuture<RuleTagListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleTagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleTagListResponse>

    /** @see list */
    fun list(params: RuleTagListParams): CompletableFuture<RuleTagListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleTagListResponse> =
        list(workspaceId, RuleTagListParams.none(), requestOptions)

    /**
     * A view of [RuleTagServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleTagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-tags`, but is
         * otherwise the same as [RuleTagServiceAsync.list].
         */
        fun list(workspaceId: String): CompletableFuture<HttpResponseFor<RuleTagListResponse>> =
            list(workspaceId, RuleTagListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleTagListParams = RuleTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleTagListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleTagListParams = RuleTagListParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleTagListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RuleTagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleTagListResponse>>

        /** @see list */
        fun list(
            params: RuleTagListParams
        ): CompletableFuture<HttpResponseFor<RuleTagListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleTagListResponse>> =
            list(workspaceId, RuleTagListParams.none(), requestOptions)
    }
}
