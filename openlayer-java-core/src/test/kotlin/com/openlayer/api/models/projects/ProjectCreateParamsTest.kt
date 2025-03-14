// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCreateParamsTest {

    @Test
    fun create() {
        ProjectCreateParams.builder()
            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
            .developmentGoalCount(5L)
            .goalCount(10L)
            .inferencePipelineCount(1L)
            .links(
                ProjectCreateParams.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
            .monitoringGoalCount(5L)
            .name("My Project")
            .source(ProjectCreateParams.Source.WEB)
            .taskType(ProjectCreateParams.TaskType.LLM_BASE)
            .versionCount(2L)
            .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
            .description("My project description.")
            .gitRepo(
                ProjectCreateParams.GitRepo.builder()
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
    }

    @Test
    fun body() {
        val params =
            ProjectCreateParams.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(5L)
                .goalCount(10L)
                .inferencePipelineCount(1L)
                .links(
                    ProjectCreateParams.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(5L)
                .name("My Project")
                .source(ProjectCreateParams.Source.WEB)
                .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                .versionCount(2L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .description("My project description.")
                .gitRepo(
                    ProjectCreateParams.GitRepo.builder()
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

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.creatorId()).contains("589ece63-49a2-41b4-98e1-10547761d4b0")
        assertThat(body.dateCreated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.dateUpdated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.developmentGoalCount()).isEqualTo(5L)
        assertThat(body.goalCount()).isEqualTo(10L)
        assertThat(body.inferencePipelineCount()).isEqualTo(1L)
        assertThat(body.links())
            .isEqualTo(
                ProjectCreateParams.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(body.monitoringGoalCount()).isEqualTo(5L)
        assertThat(body.name()).isEqualTo("My Project")
        assertThat(body.source()).contains(ProjectCreateParams.Source.WEB)
        assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
        assertThat(body.versionCount()).isEqualTo(2L)
        assertThat(body.workspaceId()).contains("055fddb1-261f-4654-8598-f6347ee46a09")
        assertThat(body.description()).contains("My project description.")
        assertThat(body.gitRepo())
            .contains(
                ProjectCreateParams.GitRepo.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectCreateParams.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(5L)
                .goalCount(10L)
                .inferencePipelineCount(1L)
                .links(
                    ProjectCreateParams.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(5L)
                .name("My Project")
                .source(ProjectCreateParams.Source.WEB)
                .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                .versionCount(2L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.creatorId()).contains("589ece63-49a2-41b4-98e1-10547761d4b0")
        assertThat(body.dateCreated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.dateUpdated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.developmentGoalCount()).isEqualTo(5L)
        assertThat(body.goalCount()).isEqualTo(10L)
        assertThat(body.inferencePipelineCount()).isEqualTo(1L)
        assertThat(body.links())
            .isEqualTo(
                ProjectCreateParams.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(body.monitoringGoalCount()).isEqualTo(5L)
        assertThat(body.name()).isEqualTo("My Project")
        assertThat(body.source()).contains(ProjectCreateParams.Source.WEB)
        assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
        assertThat(body.versionCount()).isEqualTo(2L)
        assertThat(body.workspaceId()).contains("055fddb1-261f-4654-8598-f6347ee46a09")
    }
}
