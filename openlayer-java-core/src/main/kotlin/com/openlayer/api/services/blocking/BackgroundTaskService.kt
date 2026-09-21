// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.backgroundtasks.BackgroundTaskRetrieveParams
import com.openlayer.api.models.backgroundtasks.BackgroundTaskRetrieveResponse
import java.util.function.Consumer

interface BackgroundTaskService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BackgroundTaskService

    /**
     * Retrieve a background task's status, progress and results.
     *
     * Endpoints that cannot answer within one request queue a task and hand back its id -- for
     * example `POST /frameworks/{frameworkId}/export`. Poll this endpoint until `complete` is
     * `true`, then read what the task produced from `outputs`.
     */
    fun retrieve(taskId: String): BackgroundTaskRetrieveResponse =
        retrieve(taskId, BackgroundTaskRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BackgroundTaskRetrieveResponse =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
    ): BackgroundTaskRetrieveResponse = retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BackgroundTaskRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BackgroundTaskRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BackgroundTaskRetrieveParams): BackgroundTaskRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(taskId: String, requestOptions: RequestOptions): BackgroundTaskRetrieveResponse =
        retrieve(taskId, BackgroundTaskRetrieveParams.none(), requestOptions)

    /**
     * A view of [BackgroundTaskService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BackgroundTaskService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /background-tasks/{taskId}`, but is otherwise the
         * same as [BackgroundTaskService.retrieve].
         */
        @MustBeClosed
        fun retrieve(taskId: String): HttpResponseFor<BackgroundTaskRetrieveResponse> =
            retrieve(taskId, BackgroundTaskRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BackgroundTaskRetrieveResponse> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
        ): HttpResponseFor<BackgroundTaskRetrieveResponse> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BackgroundTaskRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BackgroundTaskRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BackgroundTaskRetrieveParams
        ): HttpResponseFor<BackgroundTaskRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BackgroundTaskRetrieveResponse> =
            retrieve(taskId, BackgroundTaskRetrieveParams.none(), requestOptions)
    }
}
