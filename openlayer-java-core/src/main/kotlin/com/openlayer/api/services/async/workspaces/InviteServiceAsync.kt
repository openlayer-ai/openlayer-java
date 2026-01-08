// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.invites.InviteCreateParams
import com.openlayer.api.models.workspaces.invites.InviteCreateResponse
import com.openlayer.api.models.workspaces.invites.InviteListParams
import com.openlayer.api.models.workspaces.invites.InviteListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InviteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteServiceAsync

    /** Invite users to a workspace. */
    fun create(workspaceId: String): CompletableFuture<InviteCreateResponse> =
        create(workspaceId, InviteCreateParams.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: InviteCreateParams = InviteCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteCreateResponse> =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(
        workspaceId: String,
        params: InviteCreateParams = InviteCreateParams.none(),
    ): CompletableFuture<InviteCreateResponse> = create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InviteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteCreateResponse>

    /** @see create */
    fun create(params: InviteCreateParams): CompletableFuture<InviteCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InviteCreateResponse> =
        create(workspaceId, InviteCreateParams.none(), requestOptions)

    /** Retrieve a list of invites in a workspace. */
    fun list(workspaceId: String): CompletableFuture<InviteListResponse> =
        list(workspaceId, InviteListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: InviteListParams = InviteListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: InviteListParams = InviteListParams.none(),
    ): CompletableFuture<InviteListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InviteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InviteListResponse>

    /** @see list */
    fun list(params: InviteListParams): CompletableFuture<InviteListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InviteListResponse> =
        list(workspaceId, InviteListParams.none(), requestOptions)

    /**
     * A view of [InviteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InviteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/invites`, but is
         * otherwise the same as [InviteServiceAsync.create].
         */
        fun create(workspaceId: String): CompletableFuture<HttpResponseFor<InviteCreateResponse>> =
            create(workspaceId, InviteCreateParams.none())

        /** @see create */
        fun create(
            workspaceId: String,
            params: InviteCreateParams = InviteCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteCreateResponse>> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        fun create(
            workspaceId: String,
            params: InviteCreateParams = InviteCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<InviteCreateResponse>> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InviteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteCreateResponse>>

        /** @see create */
        fun create(
            params: InviteCreateParams
        ): CompletableFuture<HttpResponseFor<InviteCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InviteCreateResponse>> =
            create(workspaceId, InviteCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/invites`, but is otherwise
         * the same as [InviteServiceAsync.list].
         */
        fun list(workspaceId: String): CompletableFuture<HttpResponseFor<InviteListResponse>> =
            list(workspaceId, InviteListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: InviteListParams = InviteListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: InviteListParams = InviteListParams.none(),
        ): CompletableFuture<HttpResponseFor<InviteListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: InviteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InviteListResponse>>

        /** @see list */
        fun list(params: InviteListParams): CompletableFuture<HttpResponseFor<InviteListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InviteListResponse>> =
            list(workspaceId, InviteListParams.none(), requestOptions)
    }
}
