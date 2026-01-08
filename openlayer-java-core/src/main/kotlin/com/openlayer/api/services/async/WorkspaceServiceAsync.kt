// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.WorkspaceRetrieveParams
import com.openlayer.api.models.workspaces.WorkspaceRetrieveResponse
import com.openlayer.api.models.workspaces.WorkspaceUpdateParams
import com.openlayer.api.models.workspaces.WorkspaceUpdateResponse
import com.openlayer.api.services.async.workspaces.ApiKeyServiceAsync
import com.openlayer.api.services.async.workspaces.InviteServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkspaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceServiceAsync

    fun invites(): InviteServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    /** Retrieve a workspace by its ID. */
    fun retrieve(workspaceId: String): CompletableFuture<WorkspaceRetrieveResponse> =
        retrieve(workspaceId, WorkspaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceRetrieveResponse> =
        retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
    ): CompletableFuture<WorkspaceRetrieveResponse> =
        retrieve(workspaceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkspaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: WorkspaceRetrieveParams): CompletableFuture<WorkspaceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceRetrieveResponse> =
        retrieve(workspaceId, WorkspaceRetrieveParams.none(), requestOptions)

    /** Update a workspace. */
    fun update(workspaceId: String): CompletableFuture<WorkspaceUpdateResponse> =
        update(workspaceId, WorkspaceUpdateParams.none())

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceUpdateResponse> =
        update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
    ): CompletableFuture<WorkspaceUpdateResponse> =
        update(workspaceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspaceUpdateResponse>

    /** @see update */
    fun update(params: WorkspaceUpdateParams): CompletableFuture<WorkspaceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceUpdateResponse> =
        update(workspaceId, WorkspaceUpdateParams.none(), requestOptions)

    /**
     * A view of [WorkspaceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceServiceAsync.WithRawResponse

        fun invites(): InviteServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}`, but is otherwise the
         * same as [WorkspaceServiceAsync.retrieve].
         */
        fun retrieve(
            workspaceId: String
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> =
            retrieve(workspaceId, WorkspaceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> =
            retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> =
            retrieve(workspaceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WorkspaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WorkspaceRetrieveParams
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> =
            retrieve(workspaceId, WorkspaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /workspaces/{workspaceId}`, but is otherwise the
         * same as [WorkspaceServiceAsync.update].
         */
        fun update(
            workspaceId: String
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> =
            update(workspaceId, WorkspaceUpdateParams.none())

        /** @see update */
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> =
            update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see update */
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> =
            update(workspaceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>>

        /** @see update */
        fun update(
            params: WorkspaceUpdateParams
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> =
            update(workspaceId, WorkspaceUpdateParams.none(), requestOptions)
    }
}
