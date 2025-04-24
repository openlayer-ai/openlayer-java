// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestCreateResponse
import com.openlayer.api.models.projects.tests.TestListParams
import com.openlayer.api.models.projects.tests.TestListResponse

interface TestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a test. */
    fun create(params: TestCreateParams): TestCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestCreateResponse

    /** List tests under a project. */
    fun list(params: TestListParams): TestListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestListResponse

    /** A view of [TestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /projects/{projectId}/tests`, but is otherwise the
         * same as [TestService.create].
         */
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
         * Returns a raw HTTP response for `get /projects/{projectId}/tests`, but is otherwise the
         * same as [TestService.list].
         */
        @MustBeClosed
        fun list(params: TestListParams): HttpResponseFor<TestListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TestListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestListResponse>
    }
}
