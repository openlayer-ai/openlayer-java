// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.CommitCreateParams
import com.openlayer.api.models.CommitCreateResponse
import com.openlayer.api.services.blocking.commits.TestResultService

interface CommitService {

    fun testResults(): TestResultService

    /** Create a new commit (project version) in a project. */
    @JvmOverloads
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CommitCreateResponse
}
