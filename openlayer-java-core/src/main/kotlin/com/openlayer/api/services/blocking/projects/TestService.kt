// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import com.openlayer.api.models.projects.tests.TestListParams
import com.openlayer.api.models.projects.tests.TestListResponse
import com.openlayer.api.models.projects.tests.TestUpdateParams
import com.openlayer.api.models.projects.tests.TestUpdateResponse

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a test. */
    fun create(projectId: String, params: TestCreateParams): TestCreateResponse =
        create(projectId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        projectId: String,
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestCreateResponse = create(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [create] */
    fun create(params: TestCreateParams): TestCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestCreateResponse

    /** Update tests. */
    fun update(projectId: String, params: TestUpdateParams): TestUpdateResponse =
        update(projectId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        projectId: String,
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestUpdateResponse = update(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [update] */
    fun update(params: TestUpdateParams): TestUpdateResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TestUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestUpdateResponse

    /** List tests under a project. */
    fun list(projectId: String): TestListResponse = list(projectId, TestListParams.none())

    /** @see [list] */
    fun list(
        projectId: String,
        params: TestListParams = TestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestListResponse = list(params.toBuilder().projectId(projectId).build(), requestOptions)

    /** @see [list] */
    fun list(projectId: String, params: TestListParams = TestListParams.none()): TestListResponse =
        list(projectId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestListResponse

    /** @see [list] */
    fun list(params: TestListParams): TestListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(projectId: String, requestOptions: RequestOptions): TestListResponse =
        list(projectId, TestListParams.none(), requestOptions)

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/tests`, but is otherwise the
         * same as [TestService.create].
         */
        @MustBeClosed
        fun create(
            projectId: String,
            params: TestCreateParams,
        ): HttpResponseFor<TestCreateResponse> = create(projectId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            projectId: String,
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestCreateResponse> =
            create(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(params: TestCreateParams): HttpResponseFor<TestCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestCreateResponse>

        /**
         * Returns a raw HTTP response for `put /projects/{projectId}/tests`, but is otherwise the
         * same as [TestService.update].
         */
        @MustBeClosed
        fun update(
            projectId: String,
            params: TestUpdateParams,
        ): HttpResponseFor<TestUpdateResponse> = update(projectId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            projectId: String,
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestUpdateResponse> =
            update(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: TestUpdateParams): HttpResponseFor<TestUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TestUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /projects/{projectId}/tests`, but is otherwise the
         * same as [TestService.list].
         */
        @MustBeClosed
        fun list(projectId: String): HttpResponseFor<TestListResponse> =
            list(projectId, TestListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: TestListParams = TestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestListResponse> =
            list(params.toBuilder().projectId(projectId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            params: TestListParams = TestListParams.none(),
        ): HttpResponseFor<TestListResponse> = list(projectId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(params: TestListParams): HttpResponseFor<TestListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            projectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestListResponse> =
            list(projectId, TestListParams.none(), requestOptions)
    }
}
