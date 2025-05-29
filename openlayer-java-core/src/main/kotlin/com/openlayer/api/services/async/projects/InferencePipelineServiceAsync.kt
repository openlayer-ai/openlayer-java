// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateResponse
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListResponse
import java.util.concurrent.CompletableFuture

interface InferencePipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an inference pipeline in a project. */
    fun create(
        pathProjectId: String,
        params: InferencePipelineCreateParams,
    ): CompletableFuture<InferencePipelineCreateResponse> =
        create(pathProjectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        pathProjectId: String,
        params: InferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineCreateResponse> =
        create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: InferencePipelineCreateParams
    ): CompletableFuture<InferencePipelineCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineCreateResponse>

    /** List the inference pipelines in a project. */
    fun list(projectId: String): CompletableFuture<InferencePipelineListResponse> =
        list(projectId, InferencePipelineListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: InferencePipelineListParams = InferencePipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineListResponse> =
        list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectId: String,
        params: InferencePipelineListParams = InferencePipelineListParams.none(),
    ): CompletableFuture<InferencePipelineListResponse> =
        list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: InferencePipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferencePipelineListResponse>

    /** @see [list] */
    fun list(
        params: InferencePipelineListParams
    ): CompletableFuture<InferencePipelineListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineListResponse> =
        list(projectId, InferencePipelineListParams.none(), requestOptions)

    /**
     * A view of [InferencePipelineServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineServiceAsync.create].
         */
        fun create(
            pathProjectId: String,
            params: InferencePipelineCreateParams,
        ): CompletableFuture<HttpResponseFor<InferencePipelineCreateResponse>> =
            create(pathProjectId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            pathProjectId: String,
            params: InferencePipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineCreateResponse>> =
            create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: InferencePipelineCreateParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: InferencePipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineServiceAsync.list].
         */
        fun list(
            projectId: String
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> =
            list(projectId, InferencePipelineListParams.none())

        /** @see [list] */
        fun list(
            projectId: String,
            params: InferencePipelineListParams = InferencePipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        fun list(
            projectId: String,
            params: InferencePipelineListParams = InferencePipelineListParams.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> =
            list(projectId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: InferencePipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>>

        /** @see [list] */
        fun list(
            params: InferencePipelineListParams
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> =
            list(projectId, InferencePipelineListParams.none(), requestOptions)
    }
}
