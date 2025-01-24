// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCreateParamsTest {

    @Test
    fun createProjectCreateParams() {
        ProjectCreateParams.builder()
            .name("My Project")
            .taskType(ProjectCreateParams.TaskType.LLM_BASE)
            .description("My project description.")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectCreateParams.builder()
                .name("My Project")
                .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                .description("My project description.")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("My Project")
        assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
        assertThat(body.description()).contains("My project description.")
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
