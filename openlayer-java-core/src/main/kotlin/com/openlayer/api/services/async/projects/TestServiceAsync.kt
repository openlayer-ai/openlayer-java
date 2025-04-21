// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import java.util.concurrent.CompletableFuture

interface TestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a test. */
    fun create(params: TestCreateParams): CompletableFuture<TestCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestCreateResponse>

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: TestCreateParams
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>>
    }
}
