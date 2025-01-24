// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectInferencePipelineCreateParamsTest {

    @Test
    fun createProjectInferencePipelineCreateParams() {
        ProjectInferencePipelineCreateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("This pipeline is used for production.")
            .name("production")
            .project(
                ProjectInferencePipelineCreateParams.Project.builder()
                    .name("My Project")
                    .taskType(ProjectInferencePipelineCreateParams.Project.TaskType.LLM_BASE)
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
    }

    @Test
    fun getBody() {
        val params =
            ProjectInferencePipelineCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("This pipeline is used for production.")
                .name("production")
                .project(
                    ProjectInferencePipelineCreateParams.Project.builder()
                        .name("My Project")
                        .taskType(ProjectInferencePipelineCreateParams.Project.TaskType.LLM_BASE)
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).contains("This pipeline is used for production.")
        assertThat(body.name()).isEqualTo("production")
        assertThat(body.project())
            .contains(
                ProjectInferencePipelineCreateParams.Project.builder()
                    .name("My Project")
                    .taskType(ProjectInferencePipelineCreateParams.Project.TaskType.LLM_BASE)
                    .description("My project description.")
                    .build()
            )
        assertThat(body.workspace())
            .contains(
                ProjectInferencePipelineCreateParams.Workspace.builder()
                    .name("Openlayer")
                    .slug("openlayer")
                    .inviteCode("inviteCode")
                    .samlOnlyAccess(true)
                    .addWildcardDomain("string")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectInferencePipelineCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("This pipeline is used for production.")
                .name("production")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).contains("This pipeline is used for production.")
        assertThat(body.name()).isEqualTo("production")
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectInferencePipelineCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("This pipeline is used for production.")
                .name("production")
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
