// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.commits.testresults.TestResultListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestResultServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testResultServiceAsync = client.commits().testResults()

        val testResultsFuture =
            testResultServiceAsync.list(
                TestResultListParams.builder()
                    .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeArchived(true)
                    .page(1L)
                    .perPage(1L)
                    .status(TestResultListParams.Status.RUNNING)
                    .type(TestResultListParams.Type.INTEGRITY)
                    .build()
            )

        val testResults = testResultsFuture.get()
        testResults.validate()
    }
}
