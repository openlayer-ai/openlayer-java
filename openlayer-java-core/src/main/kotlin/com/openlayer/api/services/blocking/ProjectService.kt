// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.ProjectCreateParams
import com.openlayer.api.models.projects.ProjectCreateResponse
import com.openlayer.api.models.projects.ProjectDeleteParams
import com.openlayer.api.models.projects.ProjectListParams
import com.openlayer.api.models.projects.ProjectListResponse
import com.openlayer.api.models.projects.ProjectUpdateParams
import com.openlayer.api.models.projects.ProjectUpdateResponse
import com.openlayer.api.services.blocking.projects.CommitService
import com.openlayer.api.services.blocking.projects.InferencePipelineService
import com.openlayer.api.services.blocking.projects.TestService
import java.util.function.Consumer

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    fun tests(): TestService

    /** Create a project in your workspace. */
    fun create(params: ProjectCreateParams): ProjectCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCreateResponse

    /** Update a project's metadata. */
    fun update(projectId: String): ProjectUpdateResponse =
        update(projectId, ProjectUpdateParams.none())

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectUpdateResponse =
        update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
    ): ProjectUpdateResponse = update(projectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectUpdateResponse

    /** @see update */
    fun update(params: ProjectUpdateParams): ProjectUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(projectId: String, requestOptions: RequestOptions): ProjectUpdateResponse =
        update(projectId, ProjectUpdateParams.none(), requestOptions)

    /** List your workspace's projects. */
    fun list(): ProjectListResponse = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListResponse

    /** @see list */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProjectListResponse =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project by its ID. */
    fun delete(projectId: String) = delete(projectId, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see delete */
    fun delete(projectId: String, params: ProjectDeleteParams = ProjectDeleteParams.none()) =
        delete(projectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(projectId: String, requestOptions: RequestOptions) =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        fun commits(): CommitService.WithRawResponse

        fun inferencePipelines(): InferencePipelineService.WithRawResponse

        fun tests(): TestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /projects`, but is otherwise the same as
         * [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<ProjectCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /projects/{projectId}`, but is otherwise the same
         * as [ProjectService.update].
         */
        @MustBeClosed
        fun update(projectId: String): HttpResponseFor<ProjectUpdateResponse> =
            update(projectId, ProjectUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectUpdateResponse> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
        ): HttpResponseFor<ProjectUpdateResponse> = update(projectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ProjectUpdateParams): HttpResponseFor<ProjectUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectUpdateResponse> =
            update(projectId, ProjectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /projects`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProjectListResponse> = list(ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<ProjectListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListResponse> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /projects/{projectId}`, but is otherwise the same
         * as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(projectId: String): HttpResponse = delete(projectId, ProjectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponse = delete(projectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(projectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)
    }
}
