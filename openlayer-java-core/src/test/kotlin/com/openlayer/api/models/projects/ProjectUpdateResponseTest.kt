// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectUpdateResponseTest {

    @Test
    fun create() {
        val projectUpdateResponse =
            ProjectUpdateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(5L)
                .goalCount(10L)
                .inferencePipelineCount(1L)
                .links(
                    ProjectUpdateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(5L)
                .name("My Project")
                .source(ProjectUpdateResponse.Source.WEB)
                .taskType(ProjectUpdateResponse.TaskType.LLM_BASE)
                .versionCount(2L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .dataRetentionDays(30L)
                .description("My project description.")
                .gitRepo(
                    ProjectUpdateResponse.GitRepo.builder()
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
                .modelDeveloper("Acme AI")
                .addModelType("llm")
                .purpose("Answer customer billing questions.")
                .build()

        assertThat(projectUpdateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectUpdateResponse.creatorId())
            .contains("589ece63-49a2-41b4-98e1-10547761d4b0")
        assertThat(projectUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectUpdateResponse.developmentGoalCount()).isEqualTo(5L)
        assertThat(projectUpdateResponse.goalCount()).isEqualTo(10L)
        assertThat(projectUpdateResponse.inferencePipelineCount()).isEqualTo(1L)
        assertThat(projectUpdateResponse.links())
            .isEqualTo(
                ProjectUpdateResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(projectUpdateResponse.monitoringGoalCount()).isEqualTo(5L)
        assertThat(projectUpdateResponse.name()).isEqualTo("My Project")
        assertThat(projectUpdateResponse.source()).contains(ProjectUpdateResponse.Source.WEB)
        assertThat(projectUpdateResponse.taskType())
            .isEqualTo(ProjectUpdateResponse.TaskType.LLM_BASE)
        assertThat(projectUpdateResponse.versionCount()).isEqualTo(2L)
        assertThat(projectUpdateResponse.workspaceId())
            .contains("055fddb1-261f-4654-8598-f6347ee46a09")
        assertThat(projectUpdateResponse.dataRetentionDays()).contains(30L)
        assertThat(projectUpdateResponse.description()).contains("My project description.")
        assertThat(projectUpdateResponse.gitRepo())
            .contains(
                ProjectUpdateResponse.GitRepo.builder()
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
        assertThat(projectUpdateResponse.modelDeveloper()).contains("Acme AI")
        assertThat(projectUpdateResponse.modelTypes().getOrNull()).containsExactly("llm")
        assertThat(projectUpdateResponse.purpose()).contains("Answer customer billing questions.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectUpdateResponse =
            ProjectUpdateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(5L)
                .goalCount(10L)
                .inferencePipelineCount(1L)
                .links(
                    ProjectUpdateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(5L)
                .name("My Project")
                .source(ProjectUpdateResponse.Source.WEB)
                .taskType(ProjectUpdateResponse.TaskType.LLM_BASE)
                .versionCount(2L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .dataRetentionDays(30L)
                .description("My project description.")
                .gitRepo(
                    ProjectUpdateResponse.GitRepo.builder()
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
                .modelDeveloper("Acme AI")
                .addModelType("llm")
                .purpose("Answer customer billing questions.")
                .build()

        val roundtrippedProjectUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectUpdateResponse),
                jacksonTypeRef<ProjectUpdateResponse>(),
            )

        assertThat(roundtrippedProjectUpdateResponse).isEqualTo(projectUpdateResponse)
    }
}
