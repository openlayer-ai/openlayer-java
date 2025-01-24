// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineListParams
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
                    .project(
                        ProjectInferencePipelineCreateParams.Project.builder()
                            .name("My Project")
                            .taskType(
                                ProjectInferencePipelineCreateParams.Project.TaskType.LLM_BASE
                            )
                            .description("My project description.")
                            .build()
                    )
                    .workspace(
                        ProjectInferencePipelineCreateParams.Workspace.builder()
                            .name("Openlayer")
                            .slug("openlayer")
                            .inviteCode("inviteCode")
                            .samlOnlyAccess(true)
                            .addWildcardDomain("string")
                            .build()
                    )
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
                    .name("name")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )
        println(projectInferencePipelineListResponse)
        projectInferencePipelineListResponse.validate()
    }
}
