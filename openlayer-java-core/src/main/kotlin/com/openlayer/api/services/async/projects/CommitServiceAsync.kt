// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.commits.CommitCreateParams
import com.openlayer.api.models.projects.commits.CommitCreateResponse
import com.openlayer.api.models.projects.commits.CommitListParams
import com.openlayer.api.models.projects.commits.CommitListResponse
import java.util.concurrent.CompletableFuture

interface CommitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new commit (project version) in a project. */
    fun create(
        pathProjectId: String,
        params: CommitCreateParams,
    ): CompletableFuture<CommitCreateResponse> =
        create(pathProjectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        pathProjectId: String,
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitCreateResponse> =
        create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

    /** @see [create] */
    fun create(params: CommitCreateParams): CompletableFuture<CommitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitCreateResponse>

    /** List the commits (project versions) in a project. */
    fun list(projectId: String): CompletableFuture<CommitListResponse> =
        list(projectId, CommitListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: CommitListParams = CommitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitListResponse> =
        list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectId: String,
        params: CommitListParams = CommitListParams.none(),
    ): CompletableFuture<CommitListResponse> = list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitListResponse>

    /** @see [list] */
    fun list(params: CommitListParams): CompletableFuture<CommitListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitListResponse> =
        list(projectId, CommitListParams.none(), requestOptions)

    /**
     * A view of [CommitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitServiceAsync.create].
         */
        fun create(
            pathProjectId: String,
            params: CommitCreateParams,
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(pathProjectId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            pathProjectId: String,
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: CommitCreateParams
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitServiceAsync.list].
         */
        fun list(projectId: String): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(projectId, CommitListParams.none())

        /** @see [list] */
        fun list(
            projectId: String,
            params: CommitListParams = CommitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        fun list(
            projectId: String,
            params: CommitListParams = CommitListParams.none(),
        ): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(projectId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitListResponse>>

        /** @see [list] */
        fun list(params: CommitListParams): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(projectId, CommitListParams.none(), requestOptions)
    }
}
