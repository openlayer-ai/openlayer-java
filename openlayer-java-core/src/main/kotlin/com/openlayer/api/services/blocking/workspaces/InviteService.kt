// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.invites.InviteCreateParams
import com.openlayer.api.models.workspaces.invites.InviteCreateResponse
import com.openlayer.api.models.workspaces.invites.InviteListParams
import com.openlayer.api.models.workspaces.invites.InviteListResponse
import java.util.function.Consumer

interface InviteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService

    /** Invite users to a workspace. */
    fun create(workspaceId: String): InviteCreateResponse =
        create(workspaceId, InviteCreateParams.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: InviteCreateParams = InviteCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteCreateResponse =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(
        workspaceId: String,
        params: InviteCreateParams = InviteCreateParams.none(),
    ): InviteCreateResponse = create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InviteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteCreateResponse

    /** @see create */
    fun create(params: InviteCreateParams): InviteCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(workspaceId: String, requestOptions: RequestOptions): InviteCreateResponse =
        create(workspaceId, InviteCreateParams.none(), requestOptions)

    /** Retrieve a list of invites in a workspace. */
    fun list(workspaceId: String): InviteListResponse = list(workspaceId, InviteListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: InviteListParams = InviteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteListResponse =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: InviteListParams = InviteListParams.none(),
    ): InviteListResponse = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InviteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InviteListResponse

    /** @see list */
    fun list(params: InviteListParams): InviteListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): InviteListResponse =
        list(workspaceId, InviteListParams.none(), requestOptions)

    /** A view of [InviteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/invites`, but is
         * otherwise the same as [InviteService.create].
         */
        @MustBeClosed
        fun create(workspaceId: String): HttpResponseFor<InviteCreateResponse> =
            create(workspaceId, InviteCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: InviteCreateParams = InviteCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteCreateResponse> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: InviteCreateParams = InviteCreateParams.none(),
        ): HttpResponseFor<InviteCreateResponse> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InviteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: InviteCreateParams): HttpResponseFor<InviteCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteCreateResponse> =
            create(workspaceId, InviteCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/invites`, but is otherwise
         * the same as [InviteService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<InviteListResponse> =
            list(workspaceId, InviteListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: InviteListParams = InviteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteListResponse> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: InviteListParams = InviteListParams.none(),
        ): HttpResponseFor<InviteListResponse> = list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InviteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InviteListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: InviteListParams): HttpResponseFor<InviteListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteListResponse> =
            list(workspaceId, InviteListParams.none(), requestOptions)
    }
}
