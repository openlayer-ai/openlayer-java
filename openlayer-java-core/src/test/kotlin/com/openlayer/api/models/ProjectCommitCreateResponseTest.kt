// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectCommitCreateResponseTest {

    @Test
    fun createProjectCommitCreateResponse() {
        val projectCommitCreateResponse =
            ProjectCommitCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commit(
                    ProjectCommitCreateResponse.Commit.builder()
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
                .status(ProjectCommitCreateResponse.Status.QUEUED)
                .statusMessage("Commit successfully processed.")
                .totalGoalCount(6L)
                .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .archived(false)
                .deploymentStatus("Deployed")
                .links(
                    ProjectCommitCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .build()
        assertThat(projectCommitCreateResponse).isNotNull
        assertThat(projectCommitCreateResponse.id())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCommitCreateResponse.commit())
            .isEqualTo(
                ProjectCommitCreateResponse.Commit.builder()
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
        assertThat(projectCommitCreateResponse.dateArchived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectCommitCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(projectCommitCreateResponse.failingGoalCount()).isEqualTo(1L)
        assertThat(projectCommitCreateResponse.mlModelId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCommitCreateResponse.passingGoalCount()).isEqualTo(5L)
        assertThat(projectCommitCreateResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCommitCreateResponse.status())
            .isEqualTo(ProjectCommitCreateResponse.Status.QUEUED)
        assertThat(projectCommitCreateResponse.statusMessage())
            .contains("Commit successfully processed.")
        assertThat(projectCommitCreateResponse.totalGoalCount()).isEqualTo(6L)
        assertThat(projectCommitCreateResponse.trainingDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCommitCreateResponse.validationDatasetId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(projectCommitCreateResponse.archived()).contains(false)
        assertThat(projectCommitCreateResponse.deploymentStatus()).contains("Deployed")
        assertThat(projectCommitCreateResponse.links())
            .contains(
                ProjectCommitCreateResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
    }
}
