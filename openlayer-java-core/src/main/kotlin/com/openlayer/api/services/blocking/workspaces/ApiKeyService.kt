// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.google.errorprone.annotations.MustBeClosed
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

    /** Create a new API key. */
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

    /** Retrieve an API key. */
    fun retrieve(apiKeyId: String, params: ApiKeyRetrieveParams): ApiKeyRetrieveResponse =
        retrieve(apiKeyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        apiKeyId: String,
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRetrieveResponse =
        retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ApiKeyRetrieveParams): ApiKeyRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ApiKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRetrieveResponse

    /** Rename an API key. */
    fun update(apiKeyId: String, params: ApiKeyUpdateParams): ApiKeyUpdateResponse =
        update(apiKeyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        apiKeyId: String,
        params: ApiKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyUpdateResponse = update(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see update */
    fun update(params: ApiKeyUpdateParams): ApiKeyUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ApiKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyUpdateResponse

    /** List your API keys in a workspace. */
    fun list(workspaceId: String): List<ApiKeyListResponse> =
        list(workspaceId, ApiKeyListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: ApiKeyListParams = ApiKeyListParams.none(),
    ): List<ApiKeyListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyListResponse>

    /** @see list */
    fun list(params: ApiKeyListParams): List<ApiKeyListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): List<ApiKeyListResponse> =
        list(workspaceId, ApiKeyListParams.none(), requestOptions)

    /** Delete an API key. */
    fun delete(apiKeyId: String, params: ApiKeyDeleteParams) =
        delete(apiKeyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        apiKeyId: String,
        params: ApiKeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ApiKeyDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Replace an API key's secret. */
    fun rotate(apiKeyId: String, params: ApiKeyRotateParams): ApiKeyRotateResponse =
        rotate(apiKeyId, params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        apiKeyId: String,
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse = rotate(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

    /** @see rotate */
    fun rotate(params: ApiKeyRotateParams): ApiKeyRotateResponse =
        rotate(params, RequestOptions.none())

    /** @see rotate */
    fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse

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

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/api-keys/{apiKeyId}`, but
         * is otherwise the same as [ApiKeyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams,
        ): HttpResponseFor<ApiKeyRetrieveResponse> =
            retrieve(apiKeyId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            apiKeyId: String,
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRetrieveResponse> =
            retrieve(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ApiKeyRetrieveParams): HttpResponseFor<ApiKeyRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ApiKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /workspaces/{workspaceId}/api-keys/{apiKeyId}`, but
         * is otherwise the same as [ApiKeyService.update].
         */
        @MustBeClosed
        fun update(
            apiKeyId: String,
            params: ApiKeyUpdateParams,
        ): HttpResponseFor<ApiKeyUpdateResponse> = update(apiKeyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            apiKeyId: String,
            params: ApiKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyUpdateResponse> =
            update(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ApiKeyUpdateParams): HttpResponseFor<ApiKeyUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ApiKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/api-keys`, but is
         * otherwise the same as [ApiKeyService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<List<ApiKeyListResponse>> =
            list(workspaceId, ApiKeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: ApiKeyListParams = ApiKeyListParams.none(),
        ): HttpResponseFor<List<ApiKeyListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(params: ApiKeyListParams): HttpResponseFor<List<ApiKeyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ApiKeyListResponse>> =
            list(workspaceId, ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /workspaces/{workspaceId}/api-keys/{apiKeyId}`,
         * but is otherwise the same as [ApiKeyService.delete].
         */
        @MustBeClosed
        fun delete(apiKeyId: String, params: ApiKeyDeleteParams): HttpResponse =
            delete(apiKeyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            apiKeyId: String,
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ApiKeyDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ApiKeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /workspaces/{workspaceId}/api-keys/{apiKeyId}/rotate`, but is otherwise the same as
         * [ApiKeyService.rotate].
         */
        @MustBeClosed
        fun rotate(
            apiKeyId: String,
            params: ApiKeyRotateParams,
        ): HttpResponseFor<ApiKeyRotateResponse> = rotate(apiKeyId, params, RequestOptions.none())

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            apiKeyId: String,
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(params.toBuilder().apiKeyId(apiKeyId).build(), requestOptions)

        /** @see rotate */
        @MustBeClosed
        fun rotate(params: ApiKeyRotateParams): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(params, RequestOptions.none())

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse>
    }
}
