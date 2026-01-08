// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiKeyServiceAsync

    /** Create a new API key in a workspace. */
    fun create(workspaceId: String): CompletableFuture<ApiKeyCreateResponse> =
        create(workspaceId, ApiKeyCreateParams.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse> =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(
        workspaceId: String,
        params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
    ): CompletableFuture<ApiKeyCreateResponse> = create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ApiKeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyCreateResponse>

    /** @see create */
    fun create(params: ApiKeyCreateParams): CompletableFuture<ApiKeyCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiKeyCreateResponse> =
        create(workspaceId, ApiKeyCreateParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/api-keys`, but is
         * otherwise the same as [ApiKeyServiceAsync.create].
         */
        fun create(workspaceId: String): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(workspaceId, ApiKeyCreateParams.none())

        /** @see create */
        fun create(
            workspaceId: String,
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        fun create(
            workspaceId: String,
            params: ApiKeyCreateParams = ApiKeyCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ApiKeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>>

        /** @see create */
        fun create(
            params: ApiKeyCreateParams
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiKeyCreateResponse>> =
            create(workspaceId, ApiKeyCreateParams.none(), requestOptions)
    }
}
