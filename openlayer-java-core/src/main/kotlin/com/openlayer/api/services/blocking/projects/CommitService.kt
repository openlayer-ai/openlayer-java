// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitCreateResponse
import com.openlayer.api.models.ProjectCommitListParams
import com.openlayer.api.models.ProjectCommitListResponse

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new commit (project version) in a project. */
    fun create(params: ProjectCommitCreateParams): ProjectCommitCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectCommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCommitCreateResponse

    /** List the commits (project versions) in a project. */
    fun list(params: ProjectCommitListParams): ProjectCommitListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ProjectCommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCommitListResponse

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitService.create].
         */
        @MustBeClosed
        fun create(
            params: ProjectCommitCreateParams
        ): HttpResponseFor<ProjectCommitCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectCommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCommitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitService.list].
         */
        @MustBeClosed
        fun list(params: ProjectCommitListParams): HttpResponseFor<ProjectCommitListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectCommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCommitListResponse>
    }
}
