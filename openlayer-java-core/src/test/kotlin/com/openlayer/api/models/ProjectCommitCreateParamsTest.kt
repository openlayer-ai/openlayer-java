// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCommitCreateParamsTest {

    @Test
    fun createProjectCommitCreateParams() {
        ProjectCommitCreateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .commit(
                ProjectCommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .fileSize(123L)
                    .message("Updated the prompt.")
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .storageUri("s3://...")
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .gitCommitRef("main")
                    .gitCommitSha(123L)
                    .gitCommitUrl("gitCommitUrl")
                    .build()
            )
            .storageUri("s3://...")
            .archived(true)
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
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .fileSize(123L)
                        .message("Updated the prompt.")
                        .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .storageUri("s3://...")
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .gitCommitRef("main")
                        .gitCommitSha(123L)
                        .gitCommitUrl("gitCommitUrl")
                        .build()
                )
                .storageUri("s3://...")
                .archived(true)
                .deploymentStatus("Deployed")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.commit())
            .isEqualTo(
                ProjectCommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .fileSize(123L)
                    .message("Updated the prompt.")
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .storageUri("s3://...")
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .gitCommitRef("main")
                    .gitCommitSha(123L)
                    .gitCommitUrl("gitCommitUrl")
                    .build()
            )
        assertThat(body.storageUri()).isEqualTo("s3://...")
        assertThat(body.archived()).isEqualTo(true)
        assertThat(body.deploymentStatus()).isEqualTo("Deployed")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProjectCommitCreateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .commit(
                    ProjectCommitCreateParams.Commit.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .message("Updated the prompt.")
                        .storageUri("s3://...")
                        .build()
                )
                .storageUri("s3://...")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.commit())
            .isEqualTo(
                ProjectCommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .message("Updated the prompt.")
                    .storageUri("s3://...")
                    .build()
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
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .message("Updated the prompt.")
                        .storageUri("s3://...")
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
