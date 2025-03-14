// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateResponse
import java.util.concurrent.CompletableFuture

interface RowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Update an inference data point in an inference pipeline. */
    fun update(params: RowUpdateParams): CompletableFuture<RowUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: RowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RowUpdateResponse>

    /** A view of [RowServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `put /inference-pipelines/{inferencePipelineId}/rows`,
         * but is otherwise the same as [RowServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: RowUpdateParams): CompletableFuture<HttpResponseFor<RowUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: RowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>>
    }
}
