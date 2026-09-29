// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.ruletags.RuleTagListParams
import com.openlayer.api.models.governance.ruletags.RuleTagListResponse
import java.util.function.Consumer

interface RuleTagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleTagService

    /** List the rule tags in a workspace. */
    fun list(workspaceId: String): RuleTagListResponse = list(workspaceId, RuleTagListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleTagListParams = RuleTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleTagListResponse =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleTagListParams = RuleTagListParams.none(),
    ): RuleTagListResponse = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleTagListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleTagListResponse

    /** @see list */
    fun list(params: RuleTagListParams): RuleTagListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): RuleTagListResponse =
        list(workspaceId, RuleTagListParams.none(), requestOptions)

    /** A view of [RuleTagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleTagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-tags`, but is
         * otherwise the same as [RuleTagService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<RuleTagListResponse> =
            list(workspaceId, RuleTagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleTagListParams = RuleTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleTagListResponse> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleTagListParams = RuleTagListParams.none(),
        ): HttpResponseFor<RuleTagListResponse> = list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RuleTagListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleTagListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RuleTagListParams): HttpResponseFor<RuleTagListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleTagListResponse> =
            list(workspaceId, RuleTagListParams.none(), requestOptions)
    }
}
