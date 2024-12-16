// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineListParams
import java.time.LocalDate
import java.time.OffsetDateTime
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
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .developmentGoalCount(5L)
                            .goalCount(10L)
                            .inferencePipelineCount(1L)
                            .links(
                                ProjectInferencePipelineCreateParams.Project.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .monitoringGoalCount(5L)
                            .name("My Project")
                            .source(ProjectInferencePipelineCreateParams.Project.Source.WEB)
                            .taskType(
                                ProjectInferencePipelineCreateParams.Project.TaskType.LLM_BASE
                            )
                            .versionCount(2L)
                            .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                            .description("My project description.")
                            .gitRepo(
                                ProjectInferencePipelineCreateParams.Project.GitRepo.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .dateConnected(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .gitAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .gitId(0L)
                                    .name("name")
                                    .private_(true)
                                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .slug("slug")
                                    .url("url")
                                    .branch("branch")
                                    .rootDir("rootDir")
                                    .build()
                            )
                            .build()
                    )
                    .workspace(
                        ProjectInferencePipelineCreateParams.Workspace.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .inviteCount(0L)
                            .memberCount(0L)
                            .name("Openlayer")
                            .periodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .projectCount(0L)
                            .slug("openlayer")
                            .status(ProjectInferencePipelineCreateParams.Workspace.Status.ACTIVE)
                            .inviteCode("inviteCode")
                            .monthlyUsage(
                                listOf(
                                    ProjectInferencePipelineCreateParams.Workspace.MonthlyUsage
                                        .builder()
                                        .executionTimeMs(0L)
                                        .monthYear(LocalDate.parse("2019-12-27"))
                                        .predictionCount(0L)
                                        .build()
                                )
                            )
                            .samlOnlyAccess(true)
                            .wildcardDomains(listOf("string"))
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
