// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

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
    fun create(projectId: String, params: TestCreateParams): CompletableFuture<TestCreateResponse> =
        create(projectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        projectId: String,
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestCreateResponse> =
        create(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [create] */
    fun create(params: TestCreateParams): CompletableFuture<TestCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestCreateResponse>

    /** Update tests. */
    fun update(projectId: String, params: TestUpdateParams): CompletableFuture<TestUpdateResponse> =
        update(projectId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        projectId: String,
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestUpdateResponse> =
        update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [update] */
    fun update(params: TestUpdateParams): CompletableFuture<TestUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestUpdateResponse>

    /** List tests under a project. */
    fun list(projectId: String): CompletableFuture<TestListResponse> =
        list(projectId, TestListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: TestListParams = TestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListResponse> =
        list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(
        projectId: String,
        params: TestListParams = TestListParams.none(),
    ): CompletableFuture<TestListResponse> = list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestListResponse>

    /** @see [list] */
    fun list(params: TestListParams): CompletableFuture<TestListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        projectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TestListResponse> = list(projectId, TestListParams.none(), requestOptions)

    /** A view of [TestServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.create].
         */
        fun create(
            projectId: String,
            params: TestCreateParams,
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>> =
            create(projectId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            projectId: String,
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>> =
            create(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: TestCreateParams
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.update].
         */
        fun update(
            projectId: String,
            params: TestUpdateParams,
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>> =
            update(projectId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            projectId: String,
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: TestUpdateParams
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/tests`, but is otherwise the
         * same as [TestServiceAsync.list].
         */
        fun list(projectId: String): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(projectId, TestListParams.none())

        /** @see [list] */
        fun list(
            projectId: String,
            params: TestListParams = TestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        fun list(
            projectId: String,
            params: TestListParams = TestListParams.none(),
        ): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(projectId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: TestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestListResponse>>

        /** @see [list] */
        fun list(params: TestListParams): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TestListResponse>> =
            list(projectId, TestListParams.none(), requestOptions)
    }
}
