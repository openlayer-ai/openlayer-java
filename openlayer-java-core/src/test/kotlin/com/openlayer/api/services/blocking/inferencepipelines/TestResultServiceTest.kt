// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.inferencepipelines.testresults.TestResultListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestResultServiceTest {

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testResultService = client.inferencePipelines().testResults()

        val testResults =
            testResultService.list(
                TestResultListParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .status(TestResultListParams.Status.PASSING)
                    .type(TestResultListParams.Type.INTEGRITY)
                    .build()
            )

        testResults.validate()
    }
}
