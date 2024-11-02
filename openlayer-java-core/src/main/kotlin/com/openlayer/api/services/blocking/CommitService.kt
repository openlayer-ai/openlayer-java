// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.services.blocking.commits.TestResultService

interface CommitService {

    fun testResults(): TestResultService
}
