// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectInferencePipelineListResponseTest {

    @Test
    fun createProjectInferencePipelineListResponse() {
        val projectInferencePipelineListResponse =
            ProjectInferencePipelineListResponse.builder()
                .items(
                    listOf(
                        ProjectInferencePipelineListResponse.Item.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateLastSampleReceived(
                                OffsetDateTime.parse("2024-03-22T11:31:01.185Z")
                            )
                            .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .description("This pipeline is used for production.")
                            .failingGoalCount(1L)
                            .links(
                                ProjectInferencePipelineListResponse.Item.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .name("production")
                            .passingGoalCount(5L)
                            .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .status(ProjectInferencePipelineListResponse.Item.Status.QUEUED)
                            .statusMessage("Tests successfully evaluated")
                            .totalGoalCount(6L)
                            .project(
                                ProjectInferencePipelineListResponse.Item.Project.builder()
                                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .developmentGoalCount(5L)
                                    .goalCount(10L)
                                    .inferencePipelineCount(1L)
                                    .links(
                                        ProjectInferencePipelineListResponse.Item.Project.Links
                                            .builder()
                                            .app(
                                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                            )
                                            .build()
                                    )
                                    .monitoringGoalCount(5L)
                                    .name("My Project")
                                    .source(
                                        ProjectInferencePipelineListResponse.Item.Project.Source.WEB
                                    )
                                    .taskType(
                                        ProjectInferencePipelineListResponse.Item.Project.TaskType
                                            .LLM_BASE
                                    )
                                    .versionCount(2L)
                                    .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                                    .description("My project description.")
                                    .gitRepo(
                                        ProjectInferencePipelineListResponse.Item.Project.GitRepo
                                            .builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .dateConnected(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .dateUpdated(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
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
                                ProjectInferencePipelineListResponse.Item.Workspace.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .inviteCount(0L)
                                    .memberCount(0L)
                                    .name("Openlayer")
                                    .periodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .periodStartDate(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .projectCount(0L)
                                    .slug("openlayer")
                                    .status(
                                        ProjectInferencePipelineListResponse.Item.Workspace.Status
                                            .ACTIVE
                                    )
                                    .inviteCode("inviteCode")
                                    .monthlyUsage(
                                        listOf(
                                            ProjectInferencePipelineListResponse.Item.Workspace
                                                .MonthlyUsage
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
                            .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                            .build()
                    )
                )
                .build()
        assertThat(projectInferencePipelineListResponse).isNotNull
        assertThat(projectInferencePipelineListResponse.items())
            .containsExactly(
                ProjectInferencePipelineListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .description("This pipeline is used for production.")
                    .failingGoalCount(1L)
                    .links(
                        ProjectInferencePipelineListResponse.Item.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .name("production")
                    .passingGoalCount(5L)
                    .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(ProjectInferencePipelineListResponse.Item.Status.QUEUED)
                    .statusMessage("Tests successfully evaluated")
                    .totalGoalCount(6L)
                    .project(
                        ProjectInferencePipelineListResponse.Item.Project.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .developmentGoalCount(5L)
                            .goalCount(10L)
                            .inferencePipelineCount(1L)
                            .links(
                                ProjectInferencePipelineListResponse.Item.Project.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .monitoringGoalCount(5L)
                            .name("My Project")
                            .source(ProjectInferencePipelineListResponse.Item.Project.Source.WEB)
                            .taskType(
                                ProjectInferencePipelineListResponse.Item.Project.TaskType.LLM_BASE
                            )
                            .versionCount(2L)
                            .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                            .description("My project description.")
                            .gitRepo(
                                ProjectInferencePipelineListResponse.Item.Project.GitRepo.builder()
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
                        ProjectInferencePipelineListResponse.Item.Workspace.builder()
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
                            .status(
                                ProjectInferencePipelineListResponse.Item.Workspace.Status.ACTIVE
                            )
                            .inviteCode("inviteCode")
                            .monthlyUsage(
                                listOf(
                                    ProjectInferencePipelineListResponse.Item.Workspace.MonthlyUsage
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
                    .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                    .build()
            )
    }
}
