// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListParams
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
        val testResultServiceAsync = client.inferencePipelines().testResults()

        val testResultFuture =
            testResultServiceAsync.list(
                TestResultListParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .status(TestResultListParams.Status.RUNNING)
                    .type(TestResultListParams.Type.INTEGRITY)
                    .build()
            )

        val testResult = testResultFuture.get()
        testResult.validate()
    }
}
