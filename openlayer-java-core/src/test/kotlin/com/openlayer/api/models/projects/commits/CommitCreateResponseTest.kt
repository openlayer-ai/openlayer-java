// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitCreateResponseTest {

    @Test
    fun create() {
        val commitCreateResponse =
            CommitCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateResponse.Commit.builder()
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
                .status(CommitCreateResponse.Status.COMPLETED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(false)
                .deploymentStatus("Deployed")
                .links(
                    CommitCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()

        assertThat(commitCreateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.commit())
            .isEqualTo(
                CommitCreateResponse.Commit.builder()
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
        assertThat(commitCreateResponse.dateArchived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(commitCreateResponse.failingGoalCount()).isEqualTo(1L)
        assertThat(commitCreateResponse.mlModelId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.passingGoalCount()).isEqualTo(5L)
        assertThat(commitCreateResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.status()).isEqualTo(CommitCreateResponse.Status.COMPLETED)
        assertThat(commitCreateResponse.statusMessage()).contains("Commit successfully processed.")
        assertThat(commitCreateResponse.storageUri()).isEqualTo("s3://...")
        assertThat(commitCreateResponse.totalGoalCount()).isEqualTo(6L)
        assertThat(commitCreateResponse.trainingDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.validationDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(commitCreateResponse.archived()).contains(false)
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitCreateResponse =
            CommitCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    CommitCreateResponse.Commit.builder()
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
                .status(CommitCreateResponse.Status.COMPLETED)
                .statusMessage("Commit successfully processed.")
                .storageUri("s3://...")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(false)
                .deploymentStatus("Deployed")
                .links(
                    CommitCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()

        val roundtrippedCommitCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitCreateResponse),
                jacksonTypeRef<CommitCreateResponse>(),
            )

        assertThat(roundtrippedCommitCreateResponse).isEqualTo(commitCreateResponse)
    }
}
