// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateResponse
import com.openlayer.api.models.workspaces.apikeys.ApiKeyDeleteParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyListParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyListResponse
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRetrieveParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRetrieveResponse
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRotateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRotateResponse
import com.openlayer.api.models.workspaces.apikeys.ApiKeyUpdateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyUpdateResponse
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

    /**
     * Create a new API key in a workspace. The full secret is returned in `secret`, only in this
     * response. Optionally set `expiresAt`. When you authenticate with an API key that expires, the
     * new key can't outlive it: omit `expiresAt` to inherit that expiry, and a later expiry (or
     * `null`) is rejected with 400.
     */
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
     * Retrieve one of your API keys, with its lifecycle status. The secret is never returned;
     * `secureKey` is an obfuscated hint.
     */
    fun retrieve(
        apiKeyId: String,
        params: ApiKeyRetrieveParams,
    ): CompletableFuture<ApiKeyRetrieveResponse> = retrieve(apiKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        apiKeyId: String,
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRetrieveResponse> =
        retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ApiKeyRetrieveParams): CompletableFuture<ApiKeyRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRetrieveResponse>

    /**
     * Rename one of your API keys. A key's expiry can't be updated; rotate the key with a new
     * `expiresAt` instead, so extending a key's life always issues a new secret.
     */
    fun update(
        apiKeyId: String,
        params: ApiKeyUpdateParams,
    ): CompletableFuture<ApiKeyUpdateResponse> = update(apiKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        apiKeyId: String,
        params: ApiKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyUpdateResponse> =
        update(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see update */
    fun update(params: ApiKeyUpdateParams): CompletableFuture<ApiKeyUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ApiKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyUpdateResponse>

    /**
     * List the API keys you own in a workspace, with their lifecycle status. Secrets are never
     * returned; `secureKey` is an obfuscated hint.
     */
    fun list(workspaceId: String): CompletableFuture<List<ApiKeyListResponse>> =
        list(workspaceId, ApiKeyListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyListResponse>> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
    ): CompletableFuture<List<ApiKeyListResponse>> =
        list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ApiKeyListResponse>>

    /** @see list */
    fun list(params: ApiKeyListParams): CompletableFuture<List<ApiKeyListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ApiKeyListResponse>> =
        list(workspaceId, ApiKeyListParams.none(), requestOptions)

    /**
     * Delete one of your API keys. Every secret for the key stops working immediately, including a
     * previous secret still in its rotation grace period.
     */
    fun delete(apiKeyId: String, params: ApiKeyDeleteParams): CompletableFuture<Void?> =
        delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Replace an API key's secret now. The new secret is returned in `secret`, only in this
     * response. Send `expiresAt` to change the key's expiry (`null` for never); omit it to keep the
     * current one. The previous secret keeps authenticating for `gracePeriodHours` (default 0, so
     * it stops working immediately), and never past `expiresAt`. The key keeps its id and name.
     * Expired keys cannot be rotated. Only one previous secret is kept, so rotating again during a
     * grace period retires the older one immediately.
     */
    fun rotate(
        apiKeyId: String,
        params: ApiKeyRotateParams,
    ): CompletableFuture<ApiKeyRotateResponse> = rotate(apiKeyId, params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        apiKeyId: String,
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRotateResponse> =
        rotate(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see rotate */
    fun rotate(params: ApiKeyRotateParams): CompletableFuture<ApiKeyRotateResponse> =
        rotate(params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiKeyRotateResponse>

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

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/api-keys/{apiKeyId}`, but
         * is otherwise the same as [ApiKeyServiceAsync.retrieve].
         */
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ApiKeyRetrieveResponse>> =
            retrieve(apiKeyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRetrieveResponse>> =
            retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ApiKeyRetrieveParams
        ): CompletableFuture<HttpResponseFor<ApiKeyRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put /workspaces/{workspaceId}/api-keys/{apiKeyId}`, but
         * is otherwise the same as [ApiKeyServiceAsync.update].
         */
        fun update(
            apiKeyId: String,
            params: ApiKeyUpdateParams,
        ): CompletableFuture<HttpResponseFor<ApiKeyUpdateResponse>> =
            update(apiKeyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            apiKeyId: String,
            params: ApiKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyUpdateResponse>> =
            update(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ApiKeyUpdateParams
        ): CompletableFuture<HttpResponseFor<ApiKeyUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ApiKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/api-keys`, but is
         * otherwise the same as [ApiKeyServiceAsync.list].
         */
        fun list(
            workspaceId: String
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>> =
            list(workspaceId, ApiKeyListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>>

        /** @see list */
        fun list(
            params: ApiKeyListParams
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ApiKeyListResponse>>> =
            list(workspaceId, ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /workspaces/{workspaceId}/api-keys/{apiKeyId}`,
         * but is otherwise the same as [ApiKeyServiceAsync.delete].
         */
        fun delete(apiKeyId: String, params: ApiKeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ApiKeyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /workspaces/{workspaceId}/api-keys/{apiKeyId}/rotate`, but is otherwise the same as
         * [ApiKeyServiceAsync.rotate].
         */
        fun rotate(
            apiKeyId: String,
            params: ApiKeyRotateParams,
        ): CompletableFuture<HttpResponseFor<ApiKeyRotateResponse>> =
            rotate(apiKeyId, params, RequestOptions.none())

        /** @see rotate */
        fun rotate(
            apiKeyId: String,
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRotateResponse>> =
            rotate(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see rotate */
        fun rotate(
            params: ApiKeyRotateParams
        ): CompletableFuture<HttpResponseFor<ApiKeyRotateResponse>> =
            rotate(params, RequestOptions.none())

        /** @see rotate */
        fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiKeyRotateResponse>>
    }
}
