// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultListParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultRetrieveParams
import com.openlayer.api.models.governance.ruleresults.RuleResultRetrieveResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateParams
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuleResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleResultServiceAsync

    /**
     * Retrieve a rule result by its id.
     *
     * Alongside the status, the response carries the evaluation and renewal dates that explain it:
     * `dateLastEvaluated` and `dateOfNextEvaluation` for platform rules, `dateOfLatestEvidence` and
     * `dateOfRenewal` for evidence rules.
     */
    fun retrieve(ruleResultId: String): CompletableFuture<RuleResultRetrieveResponse> =
        retrieve(ruleResultId, RuleResultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ruleResultId: String,
        params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultRetrieveResponse> =
        retrieve(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ruleResultId: String,
        params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
    ): CompletableFuture<RuleResultRetrieveResponse> =
        retrieve(ruleResultId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RuleResultRetrieveParams): CompletableFuture<RuleResultRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultRetrieveResponse> =
        retrieve(ruleResultId, RuleResultRetrieveParams.none(), requestOptions)

    /**
     * Update a rule result. Only the fields you send are changed.
     *
     * Use this to assign an owner, or to exclude a single result from compliance without
     * deactivating the rule everywhere. `deactivatedReason` is required when setting `deactivated`
     * to `true`.
     *
     * A result's `status` is computed by Openlayer and cannot be set directly.
     */
    fun update(ruleResultId: String): CompletableFuture<RuleResultUpdateResponse> =
        update(ruleResultId, RuleResultUpdateParams.none())

    /** @see update */
    fun update(
        ruleResultId: String,
        params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultUpdateResponse> =
        update(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleResultId: String,
        params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
    ): CompletableFuture<RuleResultUpdateResponse> =
        update(ruleResultId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleResultUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultUpdateResponse>

    /** @see update */
    fun update(params: RuleResultUpdateParams): CompletableFuture<RuleResultUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultUpdateResponse> =
        update(ruleResultId, RuleResultUpdateParams.none(), requestOptions)

    /**
     * List rule results across a workspace.
     *
     * A rule result is the compliance status of one rule for one entity: a project for
     * project-scoped rules, or the workspace itself for workspace-scoped rules. This is the
     * endpoint to poll or export when you want your current compliance state, filtered to a
     * framework, a project, or a status.
     */
    fun list(workspaceId: String): CompletableFuture<RuleResultListResponse> =
        list(workspaceId, RuleResultListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleResultListParams = RuleResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleResultListParams = RuleResultListParams.none(),
    ): CompletableFuture<RuleResultListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultListResponse>

    /** @see list */
    fun list(params: RuleResultListParams): CompletableFuture<RuleResultListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultListResponse> =
        list(workspaceId, RuleResultListParams.none(), requestOptions)

    /**
     * Attach evidence to a rule result, satisfying an evidence rule.
     *
     * Send the field that matches the rule's `evidenceType`: `storageUri` for an uploaded document,
     * `text` for a written statement, or `url` for a link.
     *
     * For a document, upload the file first with `POST /storage/presigned-url` and send the
     * resulting storage URI as `storageUri`.
     *
     * Attaching evidence re-evaluates the rule result. If the rule sets `renewalCadenceDays`, the
     * renewal window restarts from this evidence.
     */
    fun createEvidence(ruleResultId: String): CompletableFuture<RuleResultCreateEvidenceResponse> =
        createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none())

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultCreateEvidenceResponse> =
        createEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
    ): CompletableFuture<RuleResultCreateEvidenceResponse> =
        createEvidence(ruleResultId, params, RequestOptions.none())

    /** @see createEvidence */
    fun createEvidence(
        params: RuleResultCreateEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultCreateEvidenceResponse>

    /** @see createEvidence */
    fun createEvidence(
        params: RuleResultCreateEvidenceParams
    ): CompletableFuture<RuleResultCreateEvidenceResponse> =
        createEvidence(params, RequestOptions.none())

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultCreateEvidenceResponse> =
        createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none(), requestOptions)

    /**
     * List the evidence attached to a rule result.
     *
     * Which field carries the evidence depends on the rule's `evidenceType`: `storageUri` for
     * uploaded documents, `text` for written statements, and `url` for links.
     */
    fun listEvidence(ruleResultId: String): CompletableFuture<RuleResultListEvidenceResponse> =
        listEvidence(ruleResultId, RuleResultListEvidenceParams.none())

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultListEvidenceResponse> =
        listEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
    ): CompletableFuture<RuleResultListEvidenceResponse> =
        listEvidence(ruleResultId, params, RequestOptions.none())

    /** @see listEvidence */
    fun listEvidence(
        params: RuleResultListEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuleResultListEvidenceResponse>

    /** @see listEvidence */
    fun listEvidence(
        params: RuleResultListEvidenceParams
    ): CompletableFuture<RuleResultListEvidenceResponse> =
        listEvidence(params, RequestOptions.none())

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultListEvidenceResponse> =
        listEvidence(ruleResultId, RuleResultListEvidenceParams.none(), requestOptions)

    /**
     * A view of [RuleResultServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /rule-results/{ruleResultId}`, but is otherwise the
         * same as [RuleResultServiceAsync.retrieve].
         */
        fun retrieve(
            ruleResultId: String
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> =
            retrieve(ruleResultId, RuleResultRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            ruleResultId: String,
            params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> =
            retrieve(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            ruleResultId: String,
            params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> =
            retrieve(ruleResultId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RuleResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RuleResultRetrieveParams
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> =
            retrieve(ruleResultId, RuleResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rule-results/{ruleResultId}`, but is otherwise
         * the same as [RuleResultServiceAsync.update].
         */
        fun update(
            ruleResultId: String
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> =
            update(ruleResultId, RuleResultUpdateParams.none())

        /** @see update */
        fun update(
            ruleResultId: String,
            params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> =
            update(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see update */
        fun update(
            ruleResultId: String,
            params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> =
            update(ruleResultId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RuleResultUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>>

        /** @see update */
        fun update(
            params: RuleResultUpdateParams
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> =
            update(ruleResultId, RuleResultUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-results`, but is
         * otherwise the same as [RuleResultServiceAsync.list].
         */
        fun list(workspaceId: String): CompletableFuture<HttpResponseFor<RuleResultListResponse>> =
            list(workspaceId, RuleResultListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleResultListParams = RuleResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: RuleResultListParams = RuleResultListParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RuleResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>>

        /** @see list */
        fun list(
            params: RuleResultListParams
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>> =
            list(workspaceId, RuleResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rule-results/{ruleResultId}/evidence`, but is
         * otherwise the same as [RuleResultServiceAsync.createEvidence].
         */
        fun createEvidence(
            ruleResultId: String
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> =
            createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none())

        /** @see createEvidence */
        fun createEvidence(
            ruleResultId: String,
            params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> =
            createEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see createEvidence */
        fun createEvidence(
            ruleResultId: String,
            params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> =
            createEvidence(ruleResultId, params, RequestOptions.none())

        /** @see createEvidence */
        fun createEvidence(
            params: RuleResultCreateEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>>

        /** @see createEvidence */
        fun createEvidence(
            params: RuleResultCreateEvidenceParams
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> =
            createEvidence(params, RequestOptions.none())

        /** @see createEvidence */
        fun createEvidence(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> =
            createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rule-results/{ruleResultId}/evidence`, but is
         * otherwise the same as [RuleResultServiceAsync.listEvidence].
         */
        fun listEvidence(
            ruleResultId: String
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> =
            listEvidence(ruleResultId, RuleResultListEvidenceParams.none())

        /** @see listEvidence */
        fun listEvidence(
            ruleResultId: String,
            params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> =
            listEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see listEvidence */
        fun listEvidence(
            ruleResultId: String,
            params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> =
            listEvidence(ruleResultId, params, RequestOptions.none())

        /** @see listEvidence */
        fun listEvidence(
            params: RuleResultListEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>>

        /** @see listEvidence */
        fun listEvidence(
            params: RuleResultListEvidenceParams
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> =
            listEvidence(params, RequestOptions.none())

        /** @see listEvidence */
        fun listEvidence(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> =
            listEvidence(ruleResultId, RuleResultListEvidenceParams.none(), requestOptions)
    }
}
