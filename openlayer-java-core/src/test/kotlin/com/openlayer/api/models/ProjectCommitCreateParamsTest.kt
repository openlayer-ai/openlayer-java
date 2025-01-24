// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCommitCreateParamsTest {

    @Test
    fun createProjectCommitCreateParams() {
        ProjectCommitCreateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .commit(
                ProjectCommitCreateParams.Commit.builder().message("Updated the prompt.").build()
            )
            .storageUri("s3://...")
            .archived(false)
            .deploymentStatus("Deployed")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProjectCommitCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commit(
                    ProjectCommitCreateParams.Commit.builder()
                        .message("Updated the prompt.")
                        .build()
                )
                .storageUri("s3://...")
                .archived(false)
                .deploymentStatus("Deployed")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.commit())
            .isEqualTo(
                ProjectCommitCreateParams.Commit.builder().message("Updated the prompt.").build()
            )
        assertThat(body.storageUri()).isEqualTo("s3://...")
        assertThat(body.archived()).contains(false)
        assertThat(body.deploymentStatus()).contains("Deployed")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectCommitCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commit(
                    ProjectCommitCreateParams.Commit.builder()
                        .message("Updated the prompt.")
                        .build()
                )
                .storageUri("s3://...")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.commit())
            .isEqualTo(
                ProjectCommitCreateParams.Commit.builder().message("Updated the prompt.").build()
            )
        assertThat(body.storageUri()).isEqualTo("s3://...")
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectCommitCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commit(
                    ProjectCommitCreateParams.Commit.builder()
                        .message("Updated the prompt.")
                        .build()
                )
                .storageUri("s3://...")
                .build()
        assertThat(params).isNotNull
        // path param "projectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
