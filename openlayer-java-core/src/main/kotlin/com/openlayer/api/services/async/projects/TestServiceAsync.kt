// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import com.openlayer.api.models.projects.tests.TestListParams
import com.openlayer.api.models.projects.tests.TestListResponse
import com.openlayer.api.models.projects.tests.TestUpdateParams
import com.openlayer.api.models.projects.tests.TestUpdateResponse
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

    /** Update tests. */
    fun update(params: TestUpdateParams): CompletableFuture<TestUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestUpdateResponse>

    /** List tests under a project. */
    fun list(params: TestListParams): CompletableFuture<TestListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListResponse>

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

        /**
         * Returns a raw HTTP response for `put /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: TestUpdateParams
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: TestListParams): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListResponse>>
    }
}
