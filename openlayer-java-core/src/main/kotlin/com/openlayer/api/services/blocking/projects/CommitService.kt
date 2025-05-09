// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.commits.CommitCreateParams
import com.openlayer.api.models.projects.commits.CommitCreateResponse
import com.openlayer.api.models.projects.commits.CommitListParams
import com.openlayer.api.models.projects.commits.CommitListResponse

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new commit (project version) in a project. */
    fun create(params: CommitCreateParams): CommitCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitCreateResponse

    /** List the commits (project versions) in a project. */
    fun list(params: CommitListParams): CommitListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListResponse

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitService.create].
         */
        @MustBeClosed
        fun create(params: CommitCreateParams): HttpResponseFor<CommitCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitService.list].
         */
        @MustBeClosed
        fun list(params: CommitListParams): HttpResponseFor<CommitListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListResponse>
    }
}
