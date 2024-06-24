// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package org.openlayer.services.async

import org.openlayer.services.async.commits.TestResultServiceAsync

interface CommitServiceAsync {

    fun testResults(): TestResultServiceAsync
}
