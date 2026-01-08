// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateResponse
import java.util.function.Consumer

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService

    /** Create a new API key in a workspace. */
    fun create(workspaceId: String): ApiKeyCreateResponse =
        create(workspaceId, ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(
        workspaceId: String,
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
    ): ApiKeyCreateResponse = create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyCreateResponse

    /** @see create */
    fun create(params: ApiKeyCreateParams): ApiKeyCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(workspaceId: String, requestOptions: RequestOptions): ApiKeyCreateResponse =
        create(workspaceId, ApiKeyCreateParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/api-keys`, but is
         * otherwise the same as [ApiKeyService.create].
         */
        @MustBeClosed
        fun create(workspaceId: String): HttpResponseFor<ApiKeyCreateResponse> =
            create(workspaceId, ApiKeyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: ApiKeyCreateParams): HttpResponseFor<ApiKeyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyCreateResponse> =
            create(workspaceId, ApiKeyCreateParams.none(), requestOptions)
    }
}
