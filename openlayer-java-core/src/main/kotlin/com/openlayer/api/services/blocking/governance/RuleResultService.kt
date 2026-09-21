// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface RuleResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleResultService

    /**
     * Retrieve a rule result by its id.
     *
     * Alongside the status, the response carries the evaluation and renewal dates that explain it:
     * `dateLastEvaluated` and `dateOfNextEvaluation` for platform rules, `dateOfLatestEvidence` and
     * `dateOfRenewal` for evidence rules.
     */
    fun retrieve(ruleResultId: String): RuleResultRetrieveResponse =
        retrieve(ruleResultId, RuleResultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        ruleResultId: String,
        params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultRetrieveResponse =
        retrieve(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        ruleResultId: String,
        params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
    ): RuleResultRetrieveResponse = retrieve(ruleResultId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RuleResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RuleResultRetrieveParams): RuleResultRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(ruleResultId: String, requestOptions: RequestOptions): RuleResultRetrieveResponse =
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
    fun update(ruleResultId: String): RuleResultUpdateResponse =
        update(ruleResultId, RuleResultUpdateParams.none())

    /** @see update */
    fun update(
        ruleResultId: String,
        params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultUpdateResponse =
        update(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see update */
    fun update(
        ruleResultId: String,
        params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
    ): RuleResultUpdateResponse = update(ruleResultId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RuleResultUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultUpdateResponse

    /** @see update */
    fun update(params: RuleResultUpdateParams): RuleResultUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(ruleResultId: String, requestOptions: RequestOptions): RuleResultUpdateResponse =
        update(ruleResultId, RuleResultUpdateParams.none(), requestOptions)

    /**
     * List rule results across a workspace.
     *
     * A rule result is the compliance status of one rule for one entity: a project for
     * project-scoped rules, or the workspace itself for workspace-scoped rules. This is the
     * endpoint to poll or export when you want your current compliance state, filtered to a
     * framework, a project, or a status.
     */
    fun list(workspaceId: String): RuleResultListResponse =
        list(workspaceId, RuleResultListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleResultListParams = RuleResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultListResponse =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: RuleResultListParams = RuleResultListParams.none(),
    ): RuleResultListResponse = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RuleResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultListResponse

    /** @see list */
    fun list(params: RuleResultListParams): RuleResultListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): RuleResultListResponse =
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
    fun createEvidence(ruleResultId: String): RuleResultCreateEvidenceResponse =
        createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none())

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultCreateEvidenceResponse =
        createEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
    ): RuleResultCreateEvidenceResponse =
        createEvidence(ruleResultId, params, RequestOptions.none())

    /** @see createEvidence */
    fun createEvidence(
        params: RuleResultCreateEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultCreateEvidenceResponse

    /** @see createEvidence */
    fun createEvidence(params: RuleResultCreateEvidenceParams): RuleResultCreateEvidenceResponse =
        createEvidence(params, RequestOptions.none())

    /** @see createEvidence */
    fun createEvidence(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): RuleResultCreateEvidenceResponse =
        createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none(), requestOptions)

    /**
     * List the evidence attached to a rule result.
     *
     * Which field carries the evidence depends on the rule's `evidenceType`: `storageUri` for
     * uploaded documents, `text` for written statements, and `url` for links.
     */
    fun listEvidence(ruleResultId: String): RuleResultListEvidenceResponse =
        listEvidence(ruleResultId, RuleResultListEvidenceParams.none())

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultListEvidenceResponse =
        listEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
    ): RuleResultListEvidenceResponse = listEvidence(ruleResultId, params, RequestOptions.none())

    /** @see listEvidence */
    fun listEvidence(
        params: RuleResultListEvidenceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuleResultListEvidenceResponse

    /** @see listEvidence */
    fun listEvidence(params: RuleResultListEvidenceParams): RuleResultListEvidenceResponse =
        listEvidence(params, RequestOptions.none())

    /** @see listEvidence */
    fun listEvidence(
        ruleResultId: String,
        requestOptions: RequestOptions,
    ): RuleResultListEvidenceResponse =
        listEvidence(ruleResultId, RuleResultListEvidenceParams.none(), requestOptions)

    /** A view of [RuleResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /rule-results/{ruleResultId}`, but is otherwise the
         * same as [RuleResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(ruleResultId: String): HttpResponseFor<RuleResultRetrieveResponse> =
            retrieve(ruleResultId, RuleResultRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleResultId: String,
            params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultRetrieveResponse> =
            retrieve(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleResultId: String,
            params: RuleResultRetrieveParams = RuleResultRetrieveParams.none(),
        ): HttpResponseFor<RuleResultRetrieveResponse> =
            retrieve(ruleResultId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RuleResultRetrieveParams
        ): HttpResponseFor<RuleResultRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleResultRetrieveResponse> =
            retrieve(ruleResultId, RuleResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rule-results/{ruleResultId}`, but is otherwise
         * the same as [RuleResultService.update].
         */
        @MustBeClosed
        fun update(ruleResultId: String): HttpResponseFor<RuleResultUpdateResponse> =
            update(ruleResultId, RuleResultUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleResultId: String,
            params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultUpdateResponse> =
            update(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            ruleResultId: String,
            params: RuleResultUpdateParams = RuleResultUpdateParams.none(),
        ): HttpResponseFor<RuleResultUpdateResponse> =
            update(ruleResultId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RuleResultUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: RuleResultUpdateParams): HttpResponseFor<RuleResultUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleResultUpdateResponse> =
            update(ruleResultId, RuleResultUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/rule-results`, but is
         * otherwise the same as [RuleResultService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<RuleResultListResponse> =
            list(workspaceId, RuleResultListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleResultListParams = RuleResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultListResponse> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: RuleResultListParams = RuleResultListParams.none(),
        ): HttpResponseFor<RuleResultListResponse> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RuleResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RuleResultListParams): HttpResponseFor<RuleResultListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleResultListResponse> =
            list(workspaceId, RuleResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rule-results/{ruleResultId}/evidence`, but is
         * otherwise the same as [RuleResultService.createEvidence].
         */
        @MustBeClosed
        fun createEvidence(
            ruleResultId: String
        ): HttpResponseFor<RuleResultCreateEvidenceResponse> =
            createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none())

        /** @see createEvidence */
        @MustBeClosed
        fun createEvidence(
            ruleResultId: String,
            params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultCreateEvidenceResponse> =
            createEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see createEvidence */
        @MustBeClosed
        fun createEvidence(
            ruleResultId: String,
            params: RuleResultCreateEvidenceParams = RuleResultCreateEvidenceParams.none(),
        ): HttpResponseFor<RuleResultCreateEvidenceResponse> =
            createEvidence(ruleResultId, params, RequestOptions.none())

        /** @see createEvidence */
        @MustBeClosed
        fun createEvidence(
            params: RuleResultCreateEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultCreateEvidenceResponse>

        /** @see createEvidence */
        @MustBeClosed
        fun createEvidence(
            params: RuleResultCreateEvidenceParams
        ): HttpResponseFor<RuleResultCreateEvidenceResponse> =
            createEvidence(params, RequestOptions.none())

        /** @see createEvidence */
        @MustBeClosed
        fun createEvidence(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleResultCreateEvidenceResponse> =
            createEvidence(ruleResultId, RuleResultCreateEvidenceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rule-results/{ruleResultId}/evidence`, but is
         * otherwise the same as [RuleResultService.listEvidence].
         */
        @MustBeClosed
        fun listEvidence(ruleResultId: String): HttpResponseFor<RuleResultListEvidenceResponse> =
            listEvidence(ruleResultId, RuleResultListEvidenceParams.none())

        /** @see listEvidence */
        @MustBeClosed
        fun listEvidence(
            ruleResultId: String,
            params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultListEvidenceResponse> =
            listEvidence(params.toBuilder().ruleResultId(ruleResultId).build(), requestOptions)

        /** @see listEvidence */
        @MustBeClosed
        fun listEvidence(
            ruleResultId: String,
            params: RuleResultListEvidenceParams = RuleResultListEvidenceParams.none(),
        ): HttpResponseFor<RuleResultListEvidenceResponse> =
            listEvidence(ruleResultId, params, RequestOptions.none())

        /** @see listEvidence */
        @MustBeClosed
        fun listEvidence(
            params: RuleResultListEvidenceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuleResultListEvidenceResponse>

        /** @see listEvidence */
        @MustBeClosed
        fun listEvidence(
            params: RuleResultListEvidenceParams
        ): HttpResponseFor<RuleResultListEvidenceResponse> =
            listEvidence(params, RequestOptions.none())

        /** @see listEvidence */
        @MustBeClosed
        fun listEvidence(
            ruleResultId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuleResultListEvidenceResponse> =
            listEvidence(ruleResultId, RuleResultListEvidenceParams.none(), requestOptions)
    }
}
