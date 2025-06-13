// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.commits.CommitCreateParams
import com.openlayer.api.models.projects.commits.CommitCreateResponse
import com.openlayer.api.models.projects.commits.CommitListParams
import com.openlayer.api.models.projects.commits.CommitListResponse
import java.util.function.Consumer

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService

    /** Create a new commit (project version) in a project. */
    fun create(pathProjectId: String, params: CommitCreateParams): CommitCreateResponse =
        create(pathProjectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        pathProjectId: String,
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitCreateResponse =
        create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

    /** @see [create] */
    fun create(params: CommitCreateParams): CommitCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitCreateResponse

    /** List the commits (project versions) in a project. */
    fun list(projectId: String): CommitListResponse = list(projectId, CommitListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: CommitListParams = CommitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListResponse = list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectId: String,
        params: CommitListParams = CommitListParams.none(),
    ): CommitListResponse = list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListResponse

    /** @see [list] */
    fun list(params: CommitListParams): CommitListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(projectId: String, requestOptions: RequestOptions): CommitListResponse =
        list(projectId, CommitListParams.none(), requestOptions)

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitService.create].
         */
        @MustBeClosed
        fun create(
            pathProjectId: String,
            params: CommitCreateParams,
        ): HttpResponseFor<CommitCreateResponse> =
            create(pathProjectId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            pathProjectId: String,
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitCreateResponse> =
            create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

        /** @see [create] */
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
        fun list(projectId: String): HttpResponseFor<CommitListResponse> =
            list(projectId, CommitListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: CommitListParams = CommitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListResponse> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: CommitListParams = CommitListParams.none(),
        ): HttpResponseFor<CommitListResponse> = list(projectId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: CommitListParams): HttpResponseFor<CommitListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CommitListResponse> =
            list(projectId, CommitListParams.none(), requestOptions)
    }
}
