// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import com.openlayer.api.models.InferencePipelineRowUpdateResponse

interface RowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update an inference data point in an inference pipeline. */
    fun update(params: InferencePipelineRowUpdateParams): InferencePipelineRowUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: InferencePipelineRowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferencePipelineRowUpdateResponse

    /** A view of [RowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowService.update].
         */
        @MustBeClosed
        fun update(
            params: InferencePipelineRowUpdateParams
        ): HttpResponseFor<InferencePipelineRowUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InferencePipelineRowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferencePipelineRowUpdateResponse>
    }
}
