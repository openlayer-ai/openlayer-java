// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.*
import java.time.OffsetDateTime
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
                    .gitRepo(
                        ProjectCreateParams.GitRepo.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dateConnected(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .gitAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .gitId(123L)
                            .name("string")
                            .private_(true)
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .slug("string")
                            .url("string")
                            .branch("string")
                            .rootDir("string")
                            .build()
                    )
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
                    .name("string")
                    .page(123L)
                    .perPage(100L)
                    .taskType(ProjectListParams.TaskType.LLM_BASE)
                    .build()
            )
        println(projectListResponse)
        projectListResponse.validate()
    }
}
