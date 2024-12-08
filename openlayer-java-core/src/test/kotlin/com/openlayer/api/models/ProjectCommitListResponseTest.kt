// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCommitListResponseTest {

    @Test
    fun createProjectCommitListResponse() {
        val projectCommitListResponse =
            ProjectCommitListResponse.builder()
                .items(
                    listOf(
                        ProjectCommitListResponse.Item.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .commit(
                                ProjectCommitListResponse.Item.Commit.builder()
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
                            .status(ProjectCommitListResponse.Item.Status.QUEUED)
                            .statusMessage("Commit successfully processed.")
                            .storageUri("s3://...")
                            .totalGoalCount(6L)
                            .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .archived(false)
                            .deploymentStatus("Deployed")
                            .links(
                                ProjectCommitListResponse.Item.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .build()
        assertThat(projectCommitListResponse).isNotNull
        assertThat(projectCommitListResponse.items())
            .containsExactly(
                ProjectCommitListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .commit(
                        ProjectCommitListResponse.Item.Commit.builder()
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
                    .status(ProjectCommitListResponse.Item.Status.QUEUED)
                    .statusMessage("Commit successfully processed.")
                    .storageUri("s3://...")
                    .totalGoalCount(6L)
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .archived(false)
                    .deploymentStatus("Deployed")
                    .links(
                        ProjectCommitListResponse.Item.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .build()
            )
    }
}
