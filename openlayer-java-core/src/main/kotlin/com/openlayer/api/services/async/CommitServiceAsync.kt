// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.async

import com.openlayer.api.services.async.commits.TestResultServiceAsync

interface CommitServiceAsync {

    fun testResults(): TestResultServiceAsync
}
