// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitCreateResponseTest {

    @Test
    fun createCommitCreateResponse() {
        val commitCreateResponse =
            CommitCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateResponse.Commit.builder()
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
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .failingGoalCount(123L)
                .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .passingGoalCount(123L)
                .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(CommitCreateResponse.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(123L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(true)
                .deploymentStatus("Deployed")
                .links(
                    CommitCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()
        assertThat(commitCreateResponse).isNotNull
        assertThat(commitCreateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.commit())
            .isEqualTo(
                CommitCreateResponse.Commit.builder()
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
        assertThat(commitCreateResponse.dateArchived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitCreateResponse.failingGoalCount()).isEqualTo(123L)
        assertThat(commitCreateResponse.mlModelId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.passingGoalCount()).isEqualTo(123L)
        assertThat(commitCreateResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.status()).isEqualTo(CommitCreateResponse.Status.QUEUED)
        assertThat(commitCreateResponse.statusMessage()).contains("Commit successfully processed.")
        assertThat(commitCreateResponse.storageUri()).isEqualTo("s3://...")
        assertThat(commitCreateResponse.totalGoalCount()).isEqualTo(123L)
        assertThat(commitCreateResponse.trainingDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.validationDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.archived()).contains(true)
        assertThat(commitCreateResponse.deploymentStatus()).contains("Deployed")
        assertThat(commitCreateResponse.links())
            .contains(
                CommitCreateResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
    }
}
