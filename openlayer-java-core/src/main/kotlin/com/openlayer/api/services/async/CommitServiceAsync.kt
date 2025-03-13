// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async

import com.openlayer.api.core.RequestOptions
import com.openlayer.api.models.CommitRetrieveParams
import com.openlayer.api.models.CommitRetrieveResponse
import com.openlayer.api.services.async.commits.TestResultServiceAsync
import java.util.concurrent.CompletableFuture

interface CommitServiceAsync {

    fun testResults(): TestResultServiceAsync

    /** Retrieve a project version (commit) by its id. */
    @JvmOverloads
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse>
}
