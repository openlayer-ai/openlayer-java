// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.commits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitListResponseTest {

    @Test
    fun create() {
        val commitListResponse =
            CommitListResponse.builder()
                .addItem(
                    CommitListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .commit(
                            CommitListResponse.Item.Commit.builder()
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
                        .status(CommitListResponse.Item.Status.COMPLETED)
                        .statusMessage("Commit successfully processed.")
                        .storageUri("s3://...")
                        .totalGoalCount(6L)
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .archived(false)
                        .deploymentStatus("Deployed")
                        .links(
                            CommitListResponse.Item.Links.builder()
                                .app(
                                    "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(commitListResponse.items())
            .containsExactly(
                CommitListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .commit(
                        CommitListResponse.Item.Commit.builder()
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
                    .status(CommitListResponse.Item.Status.COMPLETED)
                    .statusMessage("Commit successfully processed.")
                    .storageUri("s3://...")
                    .totalGoalCount(6L)
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .archived(false)
                    .deploymentStatus("Deployed")
                    .links(
                        CommitListResponse.Item.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitListResponse =
            CommitListResponse.builder()
                .addItem(
                    CommitListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .commit(
                            CommitListResponse.Item.Commit.builder()
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
                        .status(CommitListResponse.Item.Status.COMPLETED)
                        .statusMessage("Commit successfully processed.")
                        .storageUri("s3://...")
                        .totalGoalCount(6L)
                        .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .archived(false)
                        .deploymentStatus("Deployed")
                        .links(
                            CommitListResponse.Item.Links.builder()
                                .app(
                                    "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedCommitListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitListResponse),
                jacksonTypeRef<CommitListResponse>(),
            )

        assertThat(roundtrippedCommitListResponse).isEqualTo(commitListResponse)
    }
}
