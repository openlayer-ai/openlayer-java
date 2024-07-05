// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCreateResponseTest {

    @Test
    fun createProjectCreateResponse() {
        val projectCreateResponse =
            ProjectCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(123L)
                .goalCount(123L)
                .inferencePipelineCount(123L)
                .links(
                    ProjectCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(123L)
                .name("My Project")
                .sample(true)
                .source(ProjectCreateResponse.Source.WEB)
                .taskType(ProjectCreateResponse.TaskType.LLM_BASE)
                .versionCount(123L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .description("My project description.")
                .gitRepo(
                    ProjectCreateResponse.GitRepo.builder()
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
                .slackChannelId("C01B2PZQX1Z")
                .slackChannelName("#my-project")
                .slackChannelNotificationsEnabled(true)
                .unreadNotificationCount(123L)
                .build()
        assertThat(projectCreateResponse).isNotNull
        assertThat(projectCreateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCreateResponse.creatorId())
            .contains("589ece63-49a2-41b4-98e1-10547761d4b0")
        assertThat(projectCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectCreateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectCreateResponse.developmentGoalCount()).isEqualTo(123L)
        assertThat(projectCreateResponse.goalCount()).isEqualTo(123L)
        assertThat(projectCreateResponse.inferencePipelineCount()).isEqualTo(123L)
        assertThat(projectCreateResponse.links())
            .isEqualTo(
                ProjectCreateResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(projectCreateResponse.monitoringGoalCount()).isEqualTo(123L)
        assertThat(projectCreateResponse.name()).isEqualTo("My Project")
        assertThat(projectCreateResponse.sample()).isEqualTo(true)
        assertThat(projectCreateResponse.source()).contains(ProjectCreateResponse.Source.WEB)
        assertThat(projectCreateResponse.taskType())
            .isEqualTo(ProjectCreateResponse.TaskType.LLM_BASE)
        assertThat(projectCreateResponse.versionCount()).isEqualTo(123L)
        assertThat(projectCreateResponse.workspaceId())
            .contains("055fddb1-261f-4654-8598-f6347ee46a09")
        assertThat(projectCreateResponse.description()).contains("My project description.")
        assertThat(projectCreateResponse.gitRepo())
            .contains(
                ProjectCreateResponse.GitRepo.builder()
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
        assertThat(projectCreateResponse.slackChannelId()).contains("C01B2PZQX1Z")
        assertThat(projectCreateResponse.slackChannelName()).contains("#my-project")
        assertThat(projectCreateResponse.slackChannelNotificationsEnabled()).contains(true)
        assertThat(projectCreateResponse.unreadNotificationCount()).contains(123L)
    }
}
