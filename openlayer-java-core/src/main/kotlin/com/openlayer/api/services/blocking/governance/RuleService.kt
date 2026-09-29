// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService

    /** Create a rule in a workspace. */
    fun create(workspaceId: String, params: RuleCreateParams): RuleCreateResponse =
        create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(params: RuleCreateParams): RuleCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleCreateResponse

    /** Retrieve a rule with its frameworks and tags. */
    fun retrieve(ruleId: String): RuleRetrieveResponse = retrieve(ruleId, RuleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ruleId: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleRetrieveResponse = retrieve(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ruleId: String,
        params: RuleRetrieveParams = RuleRetrieveParams.none(),
    ): RuleRetrieveResponse = retrieve(ruleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RuleRetrieveParams): RuleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(ruleId: String, requestOptions: RequestOptions): RuleRetrieveResponse =
        retrieve(ruleId, RuleRetrieveParams.none(), requestOptions)

    /** Update a rule. */
    fun update(ruleId: String): RuleUpdateResponse = update(ruleId, RuleUpdateParams.none())

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse = update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleId: String,
        params: RuleUpdateParams = RuleUpdateParams.none(),
    ): RuleUpdateResponse = update(ruleId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleUpdateResponse

    /** @see update */
    fun update(params: RuleUpdateParams): RuleUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(ruleId: String, requestOptions: RequestOptions): RuleUpdateResponse =
        update(ruleId, RuleUpdateParams.none(), requestOptions)

    /** List the rules in a workspace. */
    fun list(workspaceId: String): RuleListResponse = list(workspaceId, RuleListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleListParams = RuleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleListResponse = list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleListParams = RuleListParams.none(),
    ): RuleListResponse = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleListResponse

    /** @see list */
    fun list(params: RuleListParams): RuleListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): RuleListResponse =
        list(workspaceId, RuleListParams.none(), requestOptions)

    /** Delete a rule and its results. */
    fun delete(ruleId: String) = delete(ruleId, RuleDeleteParams.none())

    /** @see delete */
    fun delete(
        ruleId: String,
        params: RuleDeleteParams = RuleDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

    /** @see delete */
    fun delete(ruleId: String, params: RuleDeleteParams = RuleDeleteParams.none()) =
        delete(ruleId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: RuleDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RuleDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(ruleId: String, requestOptions: RequestOptions) =
        delete(ruleId, RuleDeleteParams.none(), requestOptions)

    /** A view of [RuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/rules`, but is otherwise
         * the same as [RuleService.create].
         */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: RuleCreateParams,
        ): HttpResponseFor<RuleCreateResponse> = create(workspaceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RuleCreateParams): HttpResponseFor<RuleCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RuleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleCreateResponse>

        /**
         * Returns a raw HTTP response for `get /rules/{ruleId}`, but is otherwise the same as
         * [RuleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(ruleId: String): HttpResponseFor<RuleRetrieveResponse> =
            retrieve(ruleId, RuleRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleId: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleRetrieveResponse> =
            retrieve(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleId: String,
            params: RuleRetrieveParams = RuleRetrieveParams.none(),
        ): HttpResponseFor<RuleRetrieveResponse> = retrieve(ruleId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RuleRetrieveParams): HttpResponseFor<RuleRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleRetrieveResponse> =
            retrieve(ruleId, RuleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /rules/{ruleId}`, but is otherwise the same as
         * [RuleService.update].
         */
        @MustBeClosed
        fun update(ruleId: String): HttpResponseFor<RuleUpdateResponse> =
            update(ruleId, RuleUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse> =
            update(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            params: RuleUpdateParams = RuleUpdateParams.none(),
        ): HttpResponseFor<RuleUpdateResponse> = update(ruleId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RuleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: RuleUpdateParams): HttpResponseFor<RuleUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleUpdateResponse> =
            update(ruleId, RuleUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rules`, but is otherwise
         * the same as [RuleService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<RuleListResponse> =
            list(workspaceId, RuleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleListParams = RuleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleListResponse> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleListParams = RuleListParams.none(),
        ): HttpResponseFor<RuleListResponse> = list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RuleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RuleListParams): HttpResponseFor<RuleListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleListResponse> =
            list(workspaceId, RuleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rules/{ruleId}`, but is otherwise the same as
         * [RuleService.delete].
         */
        @MustBeClosed
        fun delete(ruleId: String): HttpResponse = delete(ruleId, RuleDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().ruleId(ruleId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            ruleId: String,
            params: RuleDeleteParams = RuleDeleteParams.none(),
        ): HttpResponse = delete(ruleId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RuleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RuleDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(ruleId: String, requestOptions: RequestOptions): HttpResponse =
            delete(ruleId, RuleDeleteParams.none(), requestOptions)
    }
}
