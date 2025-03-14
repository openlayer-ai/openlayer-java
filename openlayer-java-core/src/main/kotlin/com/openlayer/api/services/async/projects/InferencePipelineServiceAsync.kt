// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineCreateResponse
import com.openlayer.api.models.ProjectInferencePipelineListParams
import com.openlayer.api.models.ProjectInferencePipelineListResponse
import java.util.concurrent.CompletableFuture

interface InferencePipelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an inference pipeline in a project. */
    fun create(
        params: ProjectInferencePipelineCreateParams
    ): CompletableFuture<ProjectInferencePipelineCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProjectInferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectInferencePipelineCreateResponse>

    /** List the inference pipelines in a project. */
    fun list(
        params: ProjectInferencePipelineListParams
    ): CompletableFuture<ProjectInferencePipelineListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ProjectInferencePipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectInferencePipelineListResponse>

    /**
     * A view of [InferencePipelineServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ProjectInferencePipelineCreateParams
        ): CompletableFuture<HttpResponseFor<ProjectInferencePipelineCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProjectInferencePipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectInferencePipelineCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ProjectInferencePipelineListParams
        ): CompletableFuture<HttpResponseFor<ProjectInferencePipelineListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProjectInferencePipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectInferencePipelineListResponse>>
    }
}
