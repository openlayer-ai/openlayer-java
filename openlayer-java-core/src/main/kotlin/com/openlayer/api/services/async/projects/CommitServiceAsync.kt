// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitCreateResponse
import com.openlayer.api.models.ProjectCommitListParams
import com.openlayer.api.models.ProjectCommitListResponse
import java.util.concurrent.CompletableFuture

interface CommitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new commit (project version) in a project. */
    fun create(params: ProjectCommitCreateParams): CompletableFuture<ProjectCommitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectCommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCommitCreateResponse>

    /** List the commits (project versions) in a project. */
    fun list(params: ProjectCommitListParams): CompletableFuture<ProjectCommitListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCommitListResponse>

    /**
     * A view of [CommitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ProjectCommitCreateParams
        ): CompletableFuture<HttpResponseFor<ProjectCommitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectCommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCommitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ProjectCommitListParams
        ): CompletableFuture<HttpResponseFor<ProjectCommitListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectCommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCommitListResponse>>
    }
}
