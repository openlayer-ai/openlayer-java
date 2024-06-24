// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.projects

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openlayer.TestServerExtension
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.models.*

@ExtendWith(TestServerExtension::class)
class InferencePipelineServiceTest {

    @Test
    fun callList() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.projects().inferencePipelines()
        val projectInferencePipelineListResponse =
            inferencePipelineService.list(
                ProjectInferencePipelineListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .page(123L)
                    .perPage(100L)
                    .build()
            )
        println(projectInferencePipelineListResponse)
        projectInferencePipelineListResponse.validate()
    }
}
