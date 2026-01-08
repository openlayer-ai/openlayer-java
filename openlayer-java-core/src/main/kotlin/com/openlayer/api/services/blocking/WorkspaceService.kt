// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.WorkspaceRetrieveParams
import com.openlayer.api.models.workspaces.WorkspaceRetrieveResponse
import com.openlayer.api.models.workspaces.WorkspaceUpdateParams
import com.openlayer.api.models.workspaces.WorkspaceUpdateResponse
import com.openlayer.api.services.blocking.workspaces.ApiKeyService
import com.openlayer.api.services.blocking.workspaces.InviteService
import java.util.function.Consumer

interface WorkspaceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService

    fun invites(): InviteService

    fun apiKeys(): ApiKeyService

    /** Retrieve a workspace by its ID. */
    fun retrieve(workspaceId: String): WorkspaceRetrieveResponse =
        retrieve(workspaceId, WorkspaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceRetrieveResponse =
        retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        workspaceId: String,
        params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
    ): WorkspaceRetrieveResponse = retrieve(workspaceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkspaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: WorkspaceRetrieveParams): WorkspaceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(workspaceId: String, requestOptions: RequestOptions): WorkspaceRetrieveResponse =
        retrieve(workspaceId, WorkspaceRetrieveParams.none(), requestOptions)

    /** Update a workspace. */
    fun update(workspaceId: String): WorkspaceUpdateResponse =
        update(workspaceId, WorkspaceUpdateParams.none())

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceUpdateResponse =
        update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see update */
    fun update(
        workspaceId: String,
        params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
    ): WorkspaceUpdateResponse = update(workspaceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspaceUpdateResponse

    /** @see update */
    fun update(params: WorkspaceUpdateParams): WorkspaceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(workspaceId: String, requestOptions: RequestOptions): WorkspaceUpdateResponse =
        update(workspaceId, WorkspaceUpdateParams.none(), requestOptions)

    /** A view of [WorkspaceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService.WithRawResponse

        fun invites(): InviteService.WithRawResponse

        fun apiKeys(): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}`, but is otherwise the
         * same as [WorkspaceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(workspaceId: String): HttpResponseFor<WorkspaceRetrieveResponse> =
            retrieve(workspaceId, WorkspaceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceRetrieveResponse> =
            retrieve(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            params: WorkspaceRetrieveParams = WorkspaceRetrieveParams.none(),
        ): HttpResponseFor<WorkspaceRetrieveResponse> =
            retrieve(workspaceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WorkspaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WorkspaceRetrieveParams): HttpResponseFor<WorkspaceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceRetrieveResponse> =
            retrieve(workspaceId, WorkspaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /workspaces/{workspaceId}`, but is otherwise the
         * same as [WorkspaceService.update].
         */
        @MustBeClosed
        fun update(workspaceId: String): HttpResponseFor<WorkspaceUpdateResponse> =
            update(workspaceId, WorkspaceUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceUpdateResponse> =
            update(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            workspaceId: String,
            params: WorkspaceUpdateParams = WorkspaceUpdateParams.none(),
        ): HttpResponseFor<WorkspaceUpdateResponse> =
            update(workspaceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspaceUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: WorkspaceUpdateParams): HttpResponseFor<WorkspaceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceUpdateResponse> =
            update(workspaceId, WorkspaceUpdateParams.none(), requestOptions)
    }
}
