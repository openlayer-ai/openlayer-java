// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.commits

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TestResultServiceTest {

    @Test
    fun callList() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testResultService = client.commits().testResults()
        val commitTestResultListResponse =
            testResultService.list(
                CommitTestResultListParams.builder()
                    .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeArchived(true)
                    .page(123L)
                    .perPage(100L)
                    .status(CommitTestResultListParams.Status.RUNNING)
                    .type(CommitTestResultListParams.Type.INTEGRITY)
                    .build()
            )
        println(commitTestResultListResponse)
        commitTestResultListResponse.validate()
    }
}
