// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.google.errorprone.annotations.MustBeClosed
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
    fun create(params: CommitCreateParams): CompletableFuture<CommitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitCreateResponse>

    /** List the commits (project versions) in a project. */
    fun list(params: CommitListParams): CompletableFuture<CommitListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitListResponse>

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
            params: CommitCreateParams
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/versions`, but is otherwise
         * the same as [CommitServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: CommitListParams): CompletableFuture<HttpResponseFor<CommitListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitListResponse>>
    }
}
