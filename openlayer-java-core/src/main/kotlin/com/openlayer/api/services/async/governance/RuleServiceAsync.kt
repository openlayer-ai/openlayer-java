// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.rules.RuleCreateParams
import com.openlayer.api.models.governance.rules.RuleCreateResponse
import com.openlayer.api.models.governance.rules.RuleDeleteParams
import com.openlayer.api.models.governance.rules.RuleListParams
import com.openlayer.api.models.governance.rules.RuleListResponse
import com.openlayer.api.models.governance.rules.RuleRetrieveParams
import com.openlayer.api.models.governance.rules.RuleRetrieveResponse
import com.openlayer.api.models.governance.rules.RuleUpdateParams
import com.openlayer.api.models.governance.rules.RuleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync

    /** Create a rule in a workspace. */
    fun create(
        workspaceId: String,
        params: RuleCreateParams,
    ): CompletableFuture<RuleCreateResponse> = create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleCreateResponse> =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(params: RuleCreateParams): CompletableFuture<RuleCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleCreateResponse>

    /** Retrieve a rule with its frameworks and tags. */
    fun retrieve(ruleId: String): CompletableFuture<RuleRetrieveResponse> =
        retrieve(ruleId, RuleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ruleId: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleRetrieveResponse> =
        retrieve(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ruleId: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
    ): CompletableFuture<RuleRetrieveResponse> = retrieve(ruleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RuleRetrieveParams): CompletableFuture<RuleRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleRetrieveResponse> =
        retrieve(ruleId, RuleRetrieveParams.none(), requestOptions)

    /** Update a rule. */
    fun update(ruleId: String): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, RuleUpdateParams.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse> =
        update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
    ): CompletableFuture<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleUpdateResponse>

    /** @see update */
    fun update(params: RuleUpdateParams): CompletableFuture<RuleUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleUpdateResponse> =
        update(ruleId, RuleUpdateParams.none(), requestOptions)

    /** List the rules in a workspace. */
    fun list(workspaceId: String): CompletableFuture<RuleListResponse> =
        list(workspaceId, RuleListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleListParams = RuleListParams.none(),
    ): CompletableFuture<RuleListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleListResponse>

    /** @see list */
    fun list(params: RuleListParams): CompletableFuture<RuleListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleListResponse> =
        list(workspaceId, RuleListParams.none(), requestOptions)

    /** Delete a rule and its results. */
    fun delete(ruleId: String): CompletableFuture<Void?> = delete(ruleId, RuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RuleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RuleDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ruleId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(ruleId, RuleDeleteParams.none(), requestOptions)

    /** A view of [RuleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/rules`, but is otherwise
         * the same as [RuleServiceAsync.create].
         */
        fun create(
            workspaceId: String,
            params: RuleCreateParams,
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            workspaceId: String,
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: RuleCreateParams
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /rules/{ruleId}`, but is otherwise the same as
         * [RuleServiceAsync.retrieve].
         */
        fun retrieve(ruleId: String): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>> =
            retrieve(ruleId, RuleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            ruleId: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>> =
            retrieve(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            ruleId: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>> =
            retrieve(ruleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RuleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RuleRetrieveParams
        ): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleRetrieveResponse>> =
            retrieve(ruleId, RuleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /rules/{ruleId}`, but is otherwise the same as
         * [RuleServiceAsync.update].
         */
        fun update(ruleId: String): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, RuleUpdateParams.none())

        /** @see update */
        fun update(
            ruleId: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        fun update(
            ruleId: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>>

        /** @see update */
        fun update(
            params: RuleUpdateParams
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleUpdateResponse>> =
            update(ruleId, RuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rules`, but is otherwise
         * the same as [RuleServiceAsync.list].
         */
        fun list(workspaceId: String): CompletableFuture<HttpResponseFor<RuleListResponse>> =
            list(workspaceId, RuleListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleListParams = RuleListParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RuleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleListResponse>>

        /** @see list */
        fun list(params: RuleListParams): CompletableFuture<HttpResponseFor<RuleListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleListResponse>> =
            list(workspaceId, RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rules/{ruleId}`, but is otherwise the same as
         * [RuleServiceAsync.delete].
         */
        fun delete(ruleId: String): CompletableFuture<HttpResponse> =
            delete(ruleId, RuleDeleteParams.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RuleDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            ruleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(ruleId, RuleDeleteParams.none(), requestOptions)
    }
}
