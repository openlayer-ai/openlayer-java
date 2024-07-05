// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectInferencePipelineListResponseTest {

    @Test
    fun createProjectInferencePipelineListResponse() {
        val projectInferencePipelineListResponse =
            ProjectInferencePipelineListResponse.builder()
                ._meta(
                    ProjectInferencePipelineListResponse._Meta
                        .builder()
                        .page(123L)
                        .perPage(100L)
                        .totalItems(123L)
                        .totalPages(123L)
                        .build()
                )
                .items(
                    listOf(
                        ProjectInferencePipelineListResponse.Item.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateLastSampleReceived(
                                OffsetDateTime.parse("2024-03-22T11:31:01.185Z")
                            )
                            .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .description("This pipeline is used for production.")
                            .failingGoalCount(123L)
                            .links(
                                ProjectInferencePipelineListResponse.Item.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .name("production")
                            .passingGoalCount(123L)
                            .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .status(ProjectInferencePipelineListResponse.Item.Status.QUEUED)
                            .statusMessage("Tests successfully evaluated")
                            .totalGoalCount(123L)
                            .referenceDatasetUri("s3://...")
                            .storageType(
                                ProjectInferencePipelineListResponse.Item.StorageType.LOCAL
                            )
                            .build()
                    )
                )
                .build()
        assertThat(projectInferencePipelineListResponse).isNotNull
        assertThat(projectInferencePipelineListResponse._meta())
            .isEqualTo(
                ProjectInferencePipelineListResponse._Meta
                    .builder()
                    .page(123L)
                    .perPage(100L)
                    .totalItems(123L)
                    .totalPages(123L)
                    .build()
            )
        assertThat(projectInferencePipelineListResponse.items())
            .containsExactly(
                ProjectInferencePipelineListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .description("This pipeline is used for production.")
                    .failingGoalCount(123L)
                    .links(
                        ProjectInferencePipelineListResponse.Item.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .name("production")
                    .passingGoalCount(123L)
                    .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(ProjectInferencePipelineListResponse.Item.Status.QUEUED)
                    .statusMessage("Tests successfully evaluated")
                    .totalGoalCount(123L)
                    .referenceDatasetUri("s3://...")
                    .storageType(ProjectInferencePipelineListResponse.Item.StorageType.LOCAL)
                    .build()
            )
    }
}
