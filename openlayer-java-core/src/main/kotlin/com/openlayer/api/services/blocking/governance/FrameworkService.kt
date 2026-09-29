// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.google.errorprone.annotations.MustBeClosed
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
import com.openlayer.api.services.blocking.governance.frameworks.DocumentService
import com.openlayer.api.services.blocking.governance.frameworks.SectionService
import com.openlayer.api.services.blocking.governance.frameworks.SubsectionService
import java.util.function.Consumer

interface FrameworkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FrameworkService

    fun documents(): DocumentService

    fun sections(): SectionService

    fun subsections(): SubsectionService

    /** Create a custom framework in a workspace. */
    fun create(workspaceId: String, params: FrameworkCreateParams): FrameworkCreateResponse =
        create(workspaceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        workspaceId: String,
        params: FrameworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkCreateResponse =
        create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see create */
    fun create(params: FrameworkCreateParams): FrameworkCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FrameworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkCreateResponse

    /** Retrieve a framework. */
    fun retrieve(frameworkId: String): FrameworkRetrieveResponse =
        retrieve(frameworkId, FrameworkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        frameworkId: String,
        params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkRetrieveResponse =
        retrieve(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        frameworkId: String,
        params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
    ): FrameworkRetrieveResponse = retrieve(frameworkId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FrameworkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FrameworkRetrieveParams): FrameworkRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(frameworkId: String, requestOptions: RequestOptions): FrameworkRetrieveResponse =
        retrieve(frameworkId, FrameworkRetrieveParams.none(), requestOptions)

    /** Update a framework. */
    fun update(frameworkId: String): FrameworkUpdateResponse =
        update(frameworkId, FrameworkUpdateParams.none())

    /** @see update */
    fun update(
        frameworkId: String,
        params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkUpdateResponse =
        update(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see update */
    fun update(
        frameworkId: String,
        params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
    ): FrameworkUpdateResponse = update(frameworkId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FrameworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkUpdateResponse

    /** @see update */
    fun update(params: FrameworkUpdateParams): FrameworkUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(frameworkId: String, requestOptions: RequestOptions): FrameworkUpdateResponse =
        update(frameworkId, FrameworkUpdateParams.none(), requestOptions)

    /** List the frameworks in a workspace. */
    fun list(workspaceId: String): FrameworkListResponse =
        list(workspaceId, FrameworkListParams.none())

    /** @see list */
    fun list(
        workspaceId: String,
        params: FrameworkListParams = FrameworkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListResponse =
        list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

    /** @see list */
    fun list(
        workspaceId: String,
        params: FrameworkListParams = FrameworkListParams.none(),
    ): FrameworkListResponse = list(workspaceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FrameworkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListResponse

    /** @see list */
    fun list(params: FrameworkListParams): FrameworkListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(workspaceId: String, requestOptions: RequestOptions): FrameworkListResponse =
        list(workspaceId, FrameworkListParams.none(), requestOptions)

    /** Export a framework as an audit-ready zip archive. */
    fun export(frameworkId: String): FrameworkExportResponse =
        export(frameworkId, FrameworkExportParams.none())

    /** @see export */
    fun export(
        frameworkId: String,
        params: FrameworkExportParams = FrameworkExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkExportResponse =
        export(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see export */
    fun export(
        frameworkId: String,
        params: FrameworkExportParams = FrameworkExportParams.none(),
    ): FrameworkExportResponse = export(frameworkId, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: FrameworkExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkExportResponse

    /** @see export */
    fun export(params: FrameworkExportParams): FrameworkExportResponse =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(frameworkId: String, requestOptions: RequestOptions): FrameworkExportResponse =
        export(frameworkId, FrameworkExportParams.none(), requestOptions)

    /** List a framework's compliance stats per project. */
    fun listProjectRuleStats(frameworkId: String): FrameworkListProjectRuleStatsResponse =
        listProjectRuleStats(frameworkId, FrameworkListProjectRuleStatsParams.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListProjectRuleStatsResponse =
        listProjectRuleStats(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
    ): FrameworkListProjectRuleStatsResponse =
        listProjectRuleStats(frameworkId, params, RequestOptions.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListProjectRuleStatsResponse

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams
    ): FrameworkListProjectRuleStatsResponse = listProjectRuleStats(params, RequestOptions.none())

    /** @see listProjectRuleStats */
    fun listProjectRuleStats(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): FrameworkListProjectRuleStatsResponse =
        listProjectRuleStats(
            frameworkId,
            FrameworkListProjectRuleStatsParams.none(),
            requestOptions,
        )

    /** List the projects a framework applies to. */
    fun listProjects(frameworkId: String): FrameworkListProjectsResponse =
        listProjects(frameworkId, FrameworkListProjectsParams.none())

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListProjectsResponse =
        listProjects(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
    ): FrameworkListProjectsResponse = listProjects(frameworkId, params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        params: FrameworkListProjectsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListProjectsResponse

    /** @see listProjects */
    fun listProjects(params: FrameworkListProjectsParams): FrameworkListProjectsResponse =
        listProjects(params, RequestOptions.none())

    /** @see listProjects */
    fun listProjects(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): FrameworkListProjectsResponse =
        listProjects(frameworkId, FrameworkListProjectsParams.none(), requestOptions)

    /** List the rules in a framework. */
    fun listRules(frameworkId: String): FrameworkListRulesResponse =
        listRules(frameworkId, FrameworkListRulesParams.none())

    /** @see listRules */
    fun listRules(
        frameworkId: String,
        params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListRulesResponse =
        listRules(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see listRules */
    fun listRules(
        frameworkId: String,
        params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
    ): FrameworkListRulesResponse = listRules(frameworkId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: FrameworkListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FrameworkListRulesResponse

    /** @see listRules */
    fun listRules(params: FrameworkListRulesParams): FrameworkListRulesResponse =
        listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(frameworkId: String, requestOptions: RequestOptions): FrameworkListRulesResponse =
        listRules(frameworkId, FrameworkListRulesParams.none(), requestOptions)

    /** A view of [FrameworkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FrameworkService.WithRawResponse

        fun documents(): DocumentService.WithRawResponse

        fun sections(): SectionService.WithRawResponse

        fun subsections(): SubsectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workspaces/{workspaceId}/frameworks`, but is
         * otherwise the same as [FrameworkService.create].
         */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: FrameworkCreateParams,
        ): HttpResponseFor<FrameworkCreateResponse> =
            create(workspaceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            workspaceId: String,
            params: FrameworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkCreateResponse> =
            create(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: FrameworkCreateParams): HttpResponseFor<FrameworkCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FrameworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkCreateResponse>

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}`, but is otherwise the
         * same as [FrameworkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(frameworkId: String): HttpResponseFor<FrameworkRetrieveResponse> =
            retrieve(frameworkId, FrameworkRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            frameworkId: String,
            params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkRetrieveResponse> =
            retrieve(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            frameworkId: String,
            params: FrameworkRetrieveParams = FrameworkRetrieveParams.none(),
        ): HttpResponseFor<FrameworkRetrieveResponse> =
            retrieve(frameworkId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FrameworkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FrameworkRetrieveParams): HttpResponseFor<FrameworkRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkRetrieveResponse> =
            retrieve(frameworkId, FrameworkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /frameworks/{frameworkId}`, but is otherwise the
         * same as [FrameworkService.update].
         */
        @MustBeClosed
        fun update(frameworkId: String): HttpResponseFor<FrameworkUpdateResponse> =
            update(frameworkId, FrameworkUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            frameworkId: String,
            params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkUpdateResponse> =
            update(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            frameworkId: String,
            params: FrameworkUpdateParams = FrameworkUpdateParams.none(),
        ): HttpResponseFor<FrameworkUpdateResponse> =
            update(frameworkId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FrameworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: FrameworkUpdateParams): HttpResponseFor<FrameworkUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkUpdateResponse> =
            update(frameworkId, FrameworkUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workspaces/{workspaceId}/frameworks`, but is
         * otherwise the same as [FrameworkService.list].
         */
        @MustBeClosed
        fun list(workspaceId: String): HttpResponseFor<FrameworkListResponse> =
            list(workspaceId, FrameworkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: FrameworkListParams = FrameworkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListResponse> =
            list(params.toBuilder().workspaceId(workspaceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            params: FrameworkListParams = FrameworkListParams.none(),
        ): HttpResponseFor<FrameworkListResponse> = list(workspaceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FrameworkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: FrameworkListParams): HttpResponseFor<FrameworkListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            workspaceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListResponse> =
            list(workspaceId, FrameworkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /frameworks/{frameworkId}/export`, but is otherwise
         * the same as [FrameworkService.export].
         */
        @MustBeClosed
        fun export(frameworkId: String): HttpResponseFor<FrameworkExportResponse> =
            export(frameworkId, FrameworkExportParams.none())

        /** @see export */
        @MustBeClosed
        fun export(
            frameworkId: String,
            params: FrameworkExportParams = FrameworkExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkExportResponse> =
            export(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        fun export(
            frameworkId: String,
            params: FrameworkExportParams = FrameworkExportParams.none(),
        ): HttpResponseFor<FrameworkExportResponse> =
            export(frameworkId, params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            params: FrameworkExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkExportResponse>

        /** @see export */
        @MustBeClosed
        fun export(params: FrameworkExportParams): HttpResponseFor<FrameworkExportResponse> =
            export(params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkExportResponse> =
            export(frameworkId, FrameworkExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/project-rule-stats`, but
         * is otherwise the same as [FrameworkService.listProjectRuleStats].
         */
        @MustBeClosed
        fun listProjectRuleStats(
            frameworkId: String
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> =
            listProjectRuleStats(frameworkId, FrameworkListProjectRuleStatsParams.none())

        /** @see listProjectRuleStats */
        @MustBeClosed
        fun listProjectRuleStats(
            frameworkId: String,
            params: FrameworkListProjectRuleStatsParams =
                FrameworkListProjectRuleStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> =
            listProjectRuleStats(
                params.toBuilder().frameworkId(frameworkId).build(),
                requestOptions,
            )

        /** @see listProjectRuleStats */
        @MustBeClosed
        fun listProjectRuleStats(
            frameworkId: String,
            params: FrameworkListProjectRuleStatsParams = FrameworkListProjectRuleStatsParams.none(),
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> =
            listProjectRuleStats(frameworkId, params, RequestOptions.none())

        /** @see listProjectRuleStats */
        @MustBeClosed
        fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse>

        /** @see listProjectRuleStats */
        @MustBeClosed
        fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> =
            listProjectRuleStats(params, RequestOptions.none())

        /** @see listProjectRuleStats */
        @MustBeClosed
        fun listProjectRuleStats(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> =
            listProjectRuleStats(
                frameworkId,
                FrameworkListProjectRuleStatsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/projects`, but is
         * otherwise the same as [FrameworkService.listProjects].
         */
        @MustBeClosed
        fun listProjects(frameworkId: String): HttpResponseFor<FrameworkListProjectsResponse> =
            listProjects(frameworkId, FrameworkListProjectsParams.none())

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            frameworkId: String,
            params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListProjectsResponse> =
            listProjects(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            frameworkId: String,
            params: FrameworkListProjectsParams = FrameworkListProjectsParams.none(),
        ): HttpResponseFor<FrameworkListProjectsResponse> =
            listProjects(frameworkId, params, RequestOptions.none())

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            params: FrameworkListProjectsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListProjectsResponse>

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            params: FrameworkListProjectsParams
        ): HttpResponseFor<FrameworkListProjectsResponse> =
            listProjects(params, RequestOptions.none())

        /** @see listProjects */
        @MustBeClosed
        fun listProjects(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListProjectsResponse> =
            listProjects(frameworkId, FrameworkListProjectsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/rules`, but is otherwise
         * the same as [FrameworkService.listRules].
         */
        @MustBeClosed
        fun listRules(frameworkId: String): HttpResponseFor<FrameworkListRulesResponse> =
            listRules(frameworkId, FrameworkListRulesParams.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            frameworkId: String,
            params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListRulesResponse> =
            listRules(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            frameworkId: String,
            params: FrameworkListRulesParams = FrameworkListRulesParams.none(),
        ): HttpResponseFor<FrameworkListRulesResponse> =
            listRules(frameworkId, params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: FrameworkListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FrameworkListRulesResponse>

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: FrameworkListRulesParams
        ): HttpResponseFor<FrameworkListRulesResponse> = listRules(params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListRulesResponse> =
            listRules(frameworkId, FrameworkListRulesParams.none(), requestOptions)
    }
}
