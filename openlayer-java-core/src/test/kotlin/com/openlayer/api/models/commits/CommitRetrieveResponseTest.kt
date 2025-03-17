// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.commits

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitRetrieveResponseTest {

    @Test
    fun createCommitRetrieveResponse() {
        val commitRetrieveResponse =
            CommitRetrieveResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitRetrieveResponse.Commit.builder()
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
                .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(CommitRetrieveResponse.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(false)
                .deploymentStatus("Deployed")
                .links(
                    CommitRetrieveResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()
        assertThat(commitRetrieveResponse).isNotNull
        assertThat(commitRetrieveResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitRetrieveResponse.commit())
            .isEqualTo(
                CommitRetrieveResponse.Commit.builder()
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
        assertThat(commitRetrieveResponse.dateArchived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitRetrieveResponse.failingGoalCount()).isEqualTo(1L)
        assertThat(commitRetrieveResponse.mlModelId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitRetrieveResponse.passingGoalCount()).isEqualTo(5L)
        assertThat(commitRetrieveResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitRetrieveResponse.status()).isEqualTo(CommitRetrieveResponse.Status.QUEUED)
        assertThat(commitRetrieveResponse.statusMessage())
            .contains("Commit successfully processed.")
        assertThat(commitRetrieveResponse.totalGoalCount()).isEqualTo(6L)
        assertThat(commitRetrieveResponse.trainingDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitRetrieveResponse.validationDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitRetrieveResponse.archived()).contains(false)
        assertThat(commitRetrieveResponse.deploymentStatus()).contains("Deployed")
        assertThat(commitRetrieveResponse.links())
            .contains(
                CommitRetrieveResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
    }
}
