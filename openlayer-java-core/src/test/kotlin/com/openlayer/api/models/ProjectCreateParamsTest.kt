// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCreateParamsTest {

    @Test
    fun createProjectCreateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("My Project")
        assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
        assertThat(body.description()).isEqualTo("My project description.")
        assertThat(body.gitRepo())
            .isEqualTo(
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectCreateParams.builder()
                .name("My Project")
                .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("My Project")
        assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
    }
}
