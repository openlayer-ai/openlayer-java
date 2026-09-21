// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.FrameworkCreateParams
import com.openlayer.api.models.governance.frameworks.FrameworkCreateResponse
import com.openlayer.api.models.governance.frameworks.FrameworkExportParams
import com.openlayer.api.models.governance.frameworks.FrameworkExportResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectRuleStatsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectRuleStatsResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectsResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListRulesParams
import com.openlayer.api.models.governance.frameworks.FrameworkListRulesResponse
import com.openlayer.api.models.governance.frameworks.FrameworkRetrieveParams
import com.openlayer.api.models.governance.frameworks.FrameworkRetrieveResponse
import com.openlayer.api.models.governance.frameworks.FrameworkUpdateParams
import com.openlayer.api.models.governance.frameworks.FrameworkUpdateResponse
import com.openlayer.api.services.async.governance.frameworks.DocumentServiceAsync
import com.openlayer.api.services.async.governance.frameworks.SectionServiceAsync
import com.openlayer.api.services.async.governance.frameworks.SubsectionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FrameworkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FrameworkServiceAsync

    fun documents(): DocumentServiceAsync

    fun sections(): SectionServiceAsync

    fun subsections(): SubsectionServiceAsync

    /**
     * Create a custom governance framework in a workspace.
     *
     * Use this to track compliance against an internal policy, or against a standard Openlayer does
     * not ship as a built-in framework. A new framework starts with no rules -- add them from the
     * Openlayer app, or map an existing rule to it.
     *
     * A framework is created disabled unless you pass `enabled: true`. While it is disabled its
     * rules are not evaluated and do not count towards compliance.
     */
    fun create(
        workspaceId: String,
        params: FrameworkCreateParams,
    ): CompletableFuture<FrameworkCreateResponse> =
        create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: FrameworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkCreateResponse> =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(params: FrameworkCreateParams): CompletableFuture<FrameworkCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FrameworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkCreateResponse>

    /** Retrieve a governance framework by its id. */
    fun retrieve(frameworkId: String): CompletableFuture<FrameworkRetrieveResponse> =
        retrieve(frameworkId, FrameworkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        frameworkId: String,
        params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkRetrieveResponse> =
        retrieve(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        frameworkId: String,
        params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
    ): CompletableFuture<FrameworkRetrieveResponse> =
        retrieve(frameworkId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FrameworkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FrameworkRetrieveParams): CompletableFuture<FrameworkRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkRetrieveResponse> =
        retrieve(frameworkId, FrameworkRetrieveParams.none(), requestOptions)

    /**
     * Update a governance framework.
     *
     * The most common use is activating or deactivating a framework for the workspace by setting
     * `enabled`. Rules of a disabled framework are not evaluated and do not count towards
     * compliance.
     *
     * Frameworks that ship with Openlayer report `immutable: true`. For those, only `enabled`,
     * `tags`, and `projectSelector` can be changed -- their name and definition are managed by
     * Openlayer.
     *
     * Only the fields you send are changed.
     */
    fun update(frameworkId: String): CompletableFuture<FrameworkUpdateResponse> =
        update(frameworkId, FrameworkUpdateParams.none())

    /** @see update */
    fun update(
        frameworkId: String,
        params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkUpdateResponse> =
        update(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see update */
    fun update(
        frameworkId: String,
        params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
    ): CompletableFuture<FrameworkUpdateResponse> =
        update(frameworkId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FrameworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkUpdateResponse>

    /** @see update */
    fun update(params: FrameworkUpdateParams): CompletableFuture<FrameworkUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkUpdateResponse> =
        update(frameworkId, FrameworkUpdateParams.none(), requestOptions)

    /**
     * List the governance frameworks in a workspace.
     *
     * A framework is a set of rules -- drawn from a regulation, a standard, or your own internal
     * policy -- that Openlayer tracks compliance against. Use this endpoint to find the framework
     * you want to report on, then read its rules and rule results.
     */
    fun list(workspaceId: String): CompletableFuture<FrameworkListResponse> =
        list(workspaceId, FrameworkListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: FrameworkListParams = FrameworkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListResponse> =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: FrameworkListParams = FrameworkListParams.none(),
    ): CompletableFuture<FrameworkListResponse> = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FrameworkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListResponse>

    /** @see list */
    fun list(params: FrameworkListParams): CompletableFuture<FrameworkListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        workspaceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListResponse> =
        list(workspaceId, FrameworkListParams.none(), requestOptions)

    /**
     * Export a framework's evidence and progress as an audit-ready zip archive.
     *
     * The archive holds every evidence file uploaded against the framework's evidence-based rules,
     * a markdown report of the framework's progress and the status of all its rules (broken down by
     * documentation section when the framework has documents), and CSV manifests of rules and
     * evidence with SHA-256 checksums.
     *
     * Send `projectId` to export one project's compliance with the framework. Omit it for the
     * workspace-wide view across every project in the framework, including workspace-scoped rules.
     *
     * The export runs as a background task, so this returns `202` immediately. To collect the
     * archive:
     * 1. Poll `GET /background-tasks/{taskId}` with the returned `taskResultId` until `complete` is
     *    `true`.
     * 2. Read `outputs.storageUri` off that task.
     * 3. Exchange it for a download link at `GET /storage/presigned-url?storageUri=<uri>`.
     *
     * Rate limited to 2 requests per minute per framework. Asking for an export while an identical
     * one is still queued returns that task rather than starting a second one.
     */
    fun export(frameworkId: String): CompletableFuture<FrameworkExportResponse> =
        export(frameworkId, FrameworkExportParams.none())

    /** @see export */
    fun export(
        frameworkId: String,
        params: FrameworkExportParams = FrameworkExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkExportResponse> =
        export(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see export */
    fun export(
        frameworkId: String,
        params: FrameworkExportParams = FrameworkExportParams.none(),
    ): CompletableFuture<FrameworkExportResponse> =
        export(frameworkId, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: FrameworkExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkExportResponse>

    /** @see export */
    fun export(params: FrameworkExportParams): CompletableFuture<FrameworkExportResponse> =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkExportResponse> =
        export(frameworkId, FrameworkExportParams.none(), requestOptions)

    /**
     * Get a compliance roll-up for a framework, one row per project it applies to.
     *
     * Each row counts the project's rule results by status, so you can report on where a framework
     * is complete and where it is not without fetching every individual rule result.
     */
    fun listProjectRuleStats(
        frameworkId: String
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        listProjectRuleStats(frameworkId, FrameworkListProjectRuleStatsParams.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        listProjectRuleStats(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        listProjectRuleStats(frameworkId, params, RequestOptions.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse>

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        listProjectRuleStats(params, RequestOptions.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        listProjectRuleStats(
            frameworkId,
            FrameworkListProjectRuleStatsParams.none(),
            requestOptions,
        )

    /**
     * List the projects a framework applies to.
     *
     * Which projects a framework covers is determined by its `projectSelector`. A framework with an
     * empty selector applies to every project in the workspace.
     */
    fun listProjects(frameworkId: String): CompletableFuture<FrameworkListProjectsResponse> =
        listProjects(frameworkId, FrameworkListProjectsParams.none())

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListProjectsResponse> =
        listProjects(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
    ): CompletableFuture<FrameworkListProjectsResponse> =
        listProjects(frameworkId, params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        params: FrameworkListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListProjectsResponse>

    /** @see listProjects */
    fun listProjects(
        params: FrameworkListProjectsParams
    ): CompletableFuture<FrameworkListProjectsResponse> =
        listProjects(params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListProjectsResponse> =
        listProjects(frameworkId, FrameworkListProjectsParams.none(), requestOptions)

    /**
     * List the rules that belong to a framework.
     *
     * To read the compliance status of these rules, use
     * [List rule results](/api-reference/rest/governance/list-rule-results) with the `frameworkId`
     * filter, or fetch the results of an individual rule.
     */
    fun listRules(frameworkId: String): CompletableFuture<FrameworkListRulesResponse> =
        listRules(frameworkId, FrameworkListRulesParams.none())

    /** @see listRules */
    fun listRules(
        frameworkId: String,
        params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListRulesResponse> =
        listRules(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listRules */
    fun listRules(
        frameworkId: String,
        params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
    ): CompletableFuture<FrameworkListRulesResponse> =
        listRules(frameworkId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: FrameworkListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FrameworkListRulesResponse>

    /** @see listRules */
    fun listRules(params: FrameworkListRulesParams): CompletableFuture<FrameworkListRulesResponse> =
        listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListRulesResponse> =
        listRules(frameworkId, FrameworkListRulesParams.none(), requestOptions)

    /**
     * A view of [FrameworkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FrameworkServiceAsync.WithRawResponse

        fun documents(): DocumentServiceAsync.WithRawResponse

        fun sections(): SectionServiceAsync.WithRawResponse

        fun subsections(): SubsectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/frameworks`, but is
         * otherwise the same as [FrameworkServiceAsync.create].
         */
        fun create(
            workspaceId: String,
            params: FrameworkCreateParams,
        ): CompletableFuture<HttpResponseFor<FrameworkCreateResponse>> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            workspaceId: String,
            params: FrameworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkCreateResponse>> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: FrameworkCreateParams
        ): CompletableFuture<HttpResponseFor<FrameworkCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FrameworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}`, but is otherwise the
         * same as [FrameworkServiceAsync.retrieve].
         */
        fun retrieve(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> =
            retrieve(frameworkId, FrameworkRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            frameworkId: String,
            params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> =
            retrieve(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            frameworkId: String,
            params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> =
            retrieve(frameworkId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FrameworkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FrameworkRetrieveParams
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> =
            retrieve(frameworkId, FrameworkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /frameworks/{frameworkId}`, but is otherwise the
         * same as [FrameworkServiceAsync.update].
         */
        fun update(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> =
            update(frameworkId, FrameworkUpdateParams.none())

        /** @see update */
        fun update(
            frameworkId: String,
            params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> =
            update(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see update */
        fun update(
            frameworkId: String,
            params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> =
            update(frameworkId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FrameworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>>

        /** @see update */
        fun update(
            params: FrameworkUpdateParams
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> =
            update(frameworkId, FrameworkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/frameworks`, but is
         * otherwise the same as [FrameworkServiceAsync.list].
         */
        fun list(workspaceId: String): CompletableFuture<HttpResponseFor<FrameworkListResponse>> =
            list(workspaceId, FrameworkListParams.none())

        /** @see list */
        fun list(
            workspaceId: String,
            params: FrameworkListParams = FrameworkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        fun list(
            workspaceId: String,
            params: FrameworkListParams = FrameworkListParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>> =
            list(workspaceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FrameworkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>>

        /** @see list */
        fun list(
            params: FrameworkListParams
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>> =
            list(workspaceId, FrameworkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /frameworks/{frameworkId}/export`, but is otherwise
         * the same as [FrameworkServiceAsync.export].
         */
        fun export(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> =
            export(frameworkId, FrameworkExportParams.none())

        /** @see export */
        fun export(
            frameworkId: String,
            params: FrameworkExportParams = FrameworkExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> =
            export(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see export */
        fun export(
            frameworkId: String,
            params: FrameworkExportParams = FrameworkExportParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> =
            export(frameworkId, params, RequestOptions.none())

        /** @see export */
        fun export(
            params: FrameworkExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>>

        /** @see export */
        fun export(
            params: FrameworkExportParams
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> =
            export(params, RequestOptions.none())

        /** @see export */
        fun export(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> =
            export(frameworkId, FrameworkExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/project-rule-stats`, but
         * is otherwise the same as [FrameworkServiceAsync.listProjectRuleStats].
         */
        fun listProjectRuleStats(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> =
            listProjectRuleStats(frameworkId, FrameworkListProjectRuleStatsParams.none())

        /** @see listProjectRuleStats */
        fun listProjectRuleStats(
            frameworkId: String,
            params: FrameworkListProjectRuleStatsParams =
                FrameworkListProjectRuleStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> =
            listProjectRuleStats(
                params.toBuilder().frameworkId(frameworkId).build(),
                requestOptions,
            )

        /** @see listProjectRuleStats */
        fun listProjectRuleStats(
            frameworkId: String,
            params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> =
            listProjectRuleStats(frameworkId, params, RequestOptions.none())

        /** @see listProjectRuleStats */
        fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>>

        /** @see listProjectRuleStats */
        fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> =
            listProjectRuleStats(params, RequestOptions.none())

        /** @see listProjectRuleStats */
        fun listProjectRuleStats(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> =
            listProjectRuleStats(
                frameworkId,
                FrameworkListProjectRuleStatsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/projects`, but is
         * otherwise the same as [FrameworkServiceAsync.listProjects].
         */
        fun listProjects(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> =
            listProjects(frameworkId, FrameworkListProjectsParams.none())

        /** @see listProjects */
        fun listProjects(
            frameworkId: String,
            params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> =
            listProjects(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see listProjects */
        fun listProjects(
            frameworkId: String,
            params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> =
            listProjects(frameworkId, params, RequestOptions.none())

        /** @see listProjects */
        fun listProjects(
            params: FrameworkListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>>

        /** @see listProjects */
        fun listProjects(
            params: FrameworkListProjectsParams
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> =
            listProjects(params, RequestOptions.none())

        /** @see listProjects */
        fun listProjects(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> =
            listProjects(frameworkId, FrameworkListProjectsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/rules`, but is otherwise
         * the same as [FrameworkServiceAsync.listRules].
         */
        fun listRules(
            frameworkId: String
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> =
            listRules(frameworkId, FrameworkListRulesParams.none())

        /** @see listRules */
        fun listRules(
            frameworkId: String,
            params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> =
            listRules(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see listRules */
        fun listRules(
            frameworkId: String,
            params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> =
            listRules(frameworkId, params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            params: FrameworkListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>>

        /** @see listRules */
        fun listRules(
            params: FrameworkListRulesParams
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> =
            listRules(params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> =
            listRules(frameworkId, FrameworkListRulesParams.none(), requestOptions)
    }
}
