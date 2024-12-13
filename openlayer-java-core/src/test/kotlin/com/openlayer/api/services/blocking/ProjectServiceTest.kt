// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProjectServiceTest {

    @Test
    fun callCreate() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.projects()
        val projectCreateResponse =
            projectService.create(
                ProjectCreateParams.builder()
                    .name("My Project")
                    .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                    .description("My project description.")
                    .build()
            )
        println(projectCreateResponse)
        projectCreateResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.projects()
        val projectListResponse =
            projectService.list(
                ProjectListParams.builder()
                    .name("name")
                    .page(1L)
                    .perPage(1L)
                    .taskType(ProjectListParams.TaskType.LLM_BASE)
                    .build()
            )
        println(projectListResponse)
        projectListResponse.validate()
    }
}
