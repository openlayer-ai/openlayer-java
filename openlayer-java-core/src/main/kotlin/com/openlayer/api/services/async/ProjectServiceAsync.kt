// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

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
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import com.openlayer.api.services.async.projects.TestServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectServiceAsync

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    fun tests(): TestServiceAsync

    /** Create a project in your workspace. */
    fun create(params: ProjectCreateParams): CompletableFuture<ProjectCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateResponse>

    /** Update a project's metadata. */
    fun update(projectId: String): CompletableFuture<ProjectUpdateResponse> =
        update(projectId, ProjectUpdateParams.none())

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectUpdateResponse> =
        update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see update */
    fun update(
        projectId: String,
        params: ProjectUpdateParams = ProjectUpdateParams.none(),
    ): CompletableFuture<ProjectUpdateResponse> = update(projectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectUpdateResponse>

    /** @see update */
    fun update(params: ProjectUpdateParams): CompletableFuture<ProjectUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectUpdateResponse> =
        update(projectId, ProjectUpdateParams.none(), requestOptions)

    /** List your workspace's projects. */
    fun list(): CompletableFuture<ProjectListResponse> = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListResponse>

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<ProjectListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListResponse> =
        list(ProjectListParams.none(), requestOptions)

    /** Delete a project by its ID. */
    fun delete(projectId: String): CompletableFuture<Void?> =
        delete(projectId, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        projectId: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(projectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProjectDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(projectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(projectId, ProjectDeleteParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectServiceAsync.WithRawResponse

        fun commits(): CommitServiceAsync.WithRawResponse

        fun inferencePipelines(): InferencePipelineServiceAsync.WithRawResponse

        fun tests(): TestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /projects`, but is otherwise the same as
         * [ProjectServiceAsync.create].
         */
        fun create(
            params: ProjectCreateParams
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /projects/{projectId}`, but is otherwise the same
         * as [ProjectServiceAsync.update].
         */
        fun update(projectId: String): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>> =
            update(projectId, ProjectUpdateParams.none())

        /** @see update */
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see update */
        fun update(
            projectId: String,
            params: ProjectUpdateParams = ProjectUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>> =
            update(projectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>>

        /** @see update */
        fun update(
            params: ProjectUpdateParams
        ): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectUpdateResponse>> =
            update(projectId, ProjectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /projects`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none())

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>>

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /projects/{projectId}`, but is otherwise the same
         * as [ProjectServiceAsync.delete].
         */
        fun delete(projectId: String): CompletableFuture<HttpResponse> =
            delete(projectId, ProjectDeleteParams.none())

        /** @see delete */
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            projectId: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(projectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProjectDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(projectId, ProjectDeleteParams.none(), requestOptions)
    }
}
