// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InferencePipelineServiceTest {

    @Test
    fun callCreate() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.projects().inferencePipelines()
        val projectInferencePipelineCreateResponse =
            inferencePipelineService.create(
                ProjectInferencePipelineCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("This pipeline is used for production.")
                    .name("production")
                    .build()
            )
        println(projectInferencePipelineCreateResponse)
        projectInferencePipelineCreateResponse.validate()
    }

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
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .page(123L)
                    .perPage(100L)
                    .build()
            )
        println(projectInferencePipelineListResponse)
        projectInferencePipelineListResponse.validate()
    }
}
