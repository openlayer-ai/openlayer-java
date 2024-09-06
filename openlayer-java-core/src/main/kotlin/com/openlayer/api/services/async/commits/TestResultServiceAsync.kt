// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async.commits

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.CommitTestResultListParams
import com.openlayer.api.models.CommitTestResultListResponse
import java.util.concurrent.CompletableFuture

interface TestResultServiceAsync {

    /** List the test results for a project commit (project version). */
    @JvmOverloads
    fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CommitTestResultListResponse>
}
