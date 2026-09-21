// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.backgroundtasks.BackgroundTaskRetrieveParams
import com.openlayer.api.models.backgroundtasks.BackgroundTaskRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BackgroundTaskServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BackgroundTaskServiceAsync

    /**
     * Retrieve a background task's status, progress and results.
     *
     * Endpoints that cannot answer within one request queue a task and hand back its id -- for
     * example `POST /frameworks/{frameworkId}/export`. Poll this endpoint until `complete` is
     * `true`, then read what the task produced from `outputs`.
     */
    fun retrieve(taskId: String): CompletableFuture<BackgroundTaskRetrieveResponse> =
        retrieve(taskId, BackgroundTaskRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BackgroundTaskRetrieveResponse> =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
    ): CompletableFuture<BackgroundTaskRetrieveResponse> =
        retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BackgroundTaskRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BackgroundTaskRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BackgroundTaskRetrieveParams
    ): CompletableFuture<BackgroundTaskRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BackgroundTaskRetrieveResponse> =
        retrieve(taskId, BackgroundTaskRetrieveParams.none(), requestOptions)

    /**
     * A view of [BackgroundTaskServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BackgroundTaskServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /background-tasks/{taskId}`, but is otherwise the
         * same as [BackgroundTaskServiceAsync.retrieve].
         */
        fun retrieve(
            taskId: String
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>> =
            retrieve(taskId, BackgroundTaskRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: BackgroundTaskRetrieveParams = BackgroundTaskRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BackgroundTaskRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BackgroundTaskRetrieveParams
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BackgroundTaskRetrieveResponse>> =
            retrieve(taskId, BackgroundTaskRetrieveParams.none(), requestOptions)
    }
}
