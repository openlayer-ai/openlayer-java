// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.commits

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitCreateParamsTest {

    @Test
    fun create() {
        CommitCreateParams.builder()
            .pathProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .commit(
                CommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .fileSize(1024L)
                    .message("Updated the prompt.")
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .storageUri("s3://...")
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .gitCommitRef("main")
                    .gitCommitSha(0L)
                    .gitCommitUrl("gitCommitUrl")
                    .build()
            )
            .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
            .failingGoalCount(1L)
            .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .passingGoalCount(5L)
            .bodyProjectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .status(CommitCreateParams.Status.QUEUED)
            .statusMessage("Commit successfully processed.")
            .storageUri("s3://...")
            .totalGoalCount(6L)
            .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .archived(false)
            .deploymentStatus("Deployed")
            .links(
                CommitCreateParams.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CommitCreateParams.builder()
                .pathProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateParams.Commit.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .fileSize(1024L)
                        .message("Updated the prompt.")
                        .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .storageUri("s3://...")
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .gitCommitRef("main")
                        .gitCommitSha(0L)
                        .gitCommitUrl("gitCommitUrl")
                        .build()
                )
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .failingGoalCount(1L)
                .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .passingGoalCount(5L)
                .bodyProjectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(CommitCreateParams.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(false)
                .deploymentStatus("Deployed")
                .links(
                    CommitCreateParams.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.commit())
            .isEqualTo(
                CommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .fileSize(1024L)
                    .message("Updated the prompt.")
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .storageUri("s3://...")
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .gitCommitRef("main")
                    .gitCommitSha(0L)
                    .gitCommitUrl("gitCommitUrl")
                    .build()
            )
        assertThat(body.dateArchived()).contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.dateCreated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.failingGoalCount()).isEqualTo(1L)
        assertThat(body.mlModelId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.passingGoalCount()).isEqualTo(5L)
        assertThat(body.bodyProjectId()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.status()).isEqualTo(CommitCreateParams.Status.QUEUED)
        assertThat(body.statusMessage()).contains("Commit successfully processed.")
        assertThat(body.storageUri()).isEqualTo("s3://...")
        assertThat(body.totalGoalCount()).isEqualTo(6L)
        assertThat(body.trainingDatasetId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.validationDatasetId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.archived()).contains(false)
        assertThat(body.deploymentStatus()).contains("Deployed")
        assertThat(body.links())
            .contains(
                CommitCreateParams.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CommitCreateParams.builder()
                .pathProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateParams.Commit.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .fileSize(1024L)
                        .message("Updated the prompt.")
                        .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .storageUri("s3://...")
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .build()
                )
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .failingGoalCount(1L)
                .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .passingGoalCount(5L)
                .bodyProjectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(CommitCreateParams.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.commit())
            .isEqualTo(
                CommitCreateParams.Commit.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .fileSize(1024L)
                    .message("Updated the prompt.")
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .storageUri("s3://...")
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
        assertThat(body.dateArchived()).contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.dateCreated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(body.failingGoalCount()).isEqualTo(1L)
        assertThat(body.mlModelId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.passingGoalCount()).isEqualTo(5L)
        assertThat(body.bodyProjectId()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.status()).isEqualTo(CommitCreateParams.Status.QUEUED)
        assertThat(body.statusMessage()).contains("Commit successfully processed.")
        assertThat(body.storageUri()).isEqualTo("s3://...")
        assertThat(body.totalGoalCount()).isEqualTo(6L)
        assertThat(body.trainingDatasetId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(body.validationDatasetId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun getPathParam() {
        val params =
            CommitCreateParams.builder()
                .pathProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateParams.Commit.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .fileSize(1024L)
                        .message("Updated the prompt.")
                        .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .storageUri("s3://...")
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .build()
                )
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .failingGoalCount(1L)
                .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .passingGoalCount(5L)
                .bodyProjectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(CommitCreateParams.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()
        assertThat(params).isNotNull
        // path param "pathProjectId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
