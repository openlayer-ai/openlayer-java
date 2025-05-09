// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateResponse
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListResponse

interface InferencePipelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an inference pipeline in a project. */
    fun create(
        pathProjectId: String,
        params: InferencePipelineCreateParams,
    ): InferencePipelineCreateResponse = create(pathProjectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        pathProjectId: String,
        params: InferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineCreateResponse =
        create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

    /** @see [create] */
    fun create(params: InferencePipelineCreateParams): InferencePipelineCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InferencePipelineCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineCreateResponse

    /** List the inference pipelines in a project. */
    fun list(projectId: String): InferencePipelineListResponse =
        list(projectId, InferencePipelineListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: InferencePipelineListParams = InferencePipelineListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineListResponse =
        list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectId: String,
        params: InferencePipelineListParams = InferencePipelineListParams.none(),
    ): InferencePipelineListResponse = list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: InferencePipelineListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineListResponse

    /** @see [list] */
    fun list(params: InferencePipelineListParams): InferencePipelineListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(projectId: String, requestOptions: RequestOptions): InferencePipelineListResponse =
        list(projectId, InferencePipelineListParams.none(), requestOptions)

    /**
     * A view of [InferencePipelineService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineService.create].
         */
        @MustBeClosed
        fun create(
            pathProjectId: String,
            params: InferencePipelineCreateParams,
        ): HttpResponseFor<InferencePipelineCreateResponse> =
            create(pathProjectId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            pathProjectId: String,
            params: InferencePipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineCreateResponse> =
            create(params.toBuilder().pathProjectId(pathProjectId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InferencePipelineCreateParams
        ): HttpResponseFor<InferencePipelineCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InferencePipelineCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineCreateResponse>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/inference-pipelines`, but is
         * otherwise the same as [InferencePipelineService.list].
         */
        @MustBeClosed
        fun list(projectId: String): HttpResponseFor<InferencePipelineListResponse> =
            list(projectId, InferencePipelineListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: InferencePipelineListParams = InferencePipelineListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineListResponse> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: InferencePipelineListParams = InferencePipelineListParams.none(),
        ): HttpResponseFor<InferencePipelineListResponse> =
            list(projectId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InferencePipelineListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InferencePipelineListParams
        ): HttpResponseFor<InferencePipelineListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferencePipelineListResponse> =
            list(projectId, InferencePipelineListParams.none(), requestOptions)
    }
}
