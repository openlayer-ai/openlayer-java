// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.commits

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.CommitTestResultListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TestResultServiceAsyncTest {

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testResultServiceAsync = client.commits().testResults()

        val testResultFuture =
            testResultServiceAsync.list(
                CommitTestResultListParams.builder()
                    .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeArchived(true)
                    .page(1L)
                    .perPage(1L)
                    .status(CommitTestResultListParams.Status.RUNNING)
                    .type(CommitTestResultListParams.Type.INTEGRITY)
                    .build()
            )

        val testResult = testResultFuture.get()
        testResult.validate()
    }
}
