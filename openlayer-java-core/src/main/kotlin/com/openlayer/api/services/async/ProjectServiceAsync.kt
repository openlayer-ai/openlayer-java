// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.ProjectCreateParams
import com.openlayer.api.models.projects.ProjectCreateResponse
import com.openlayer.api.models.projects.ProjectListParams
import com.openlayer.api.models.projects.ProjectListResponse
import com.openlayer.api.services.async.projects.CommitServiceAsync
import com.openlayer.api.services.async.projects.InferencePipelineServiceAsync
import com.openlayer.api.services.async.projects.TestServiceAsync
import java.util.concurrent.CompletableFuture

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    fun tests(): TestServiceAsync

    /** Create a project in your workspace. */
    fun create(params: ProjectCreateParams): CompletableFuture<ProjectCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateResponse>

    /** List your workspace's projects. */
    fun list(): CompletableFuture<ProjectListResponse> = list(ProjectListParams.none())

    /** @see [list] */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListResponse>

    /** @see [list] */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<ProjectListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListResponse> =
        list(ProjectListParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

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

        /** @see [create] */
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none())

        /** @see [list] */
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>>

        /** @see [list] */
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none(), requestOptions)
    }
}
