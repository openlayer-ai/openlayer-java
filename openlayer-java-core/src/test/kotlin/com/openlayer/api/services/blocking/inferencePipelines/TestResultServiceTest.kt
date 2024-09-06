// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

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
        val testResultService = client.inferencePipelines().testResults()
        val inferencePipelineTestResultListResponse =
            testResultService.list(
                InferencePipelineTestResultListParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(123L)
                    .perPage(100L)
                    .status(InferencePipelineTestResultListParams.Status.RUNNING)
                    .type(InferencePipelineTestResultListParams.Type.INTEGRITY)
                    .build()
            )
        println(inferencePipelineTestResultListResponse)
        inferencePipelineTestResultListResponse.validate()
    }
}
