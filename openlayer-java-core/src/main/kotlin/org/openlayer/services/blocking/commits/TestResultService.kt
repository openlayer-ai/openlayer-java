// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.blocking.commits

import org.openlayer.core.RequestOptions
import org.openlayer.models.CommitTestResultListParams
import org.openlayer.models.CommitTestResultListResponse

interface TestResultService {

    /** List the test results for a commit (project version). */
    @JvmOverloads
    fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CommitTestResultListResponse
}
