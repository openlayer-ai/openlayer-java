// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRetrieveResponseTest {

    @Test
    fun createInferencePipelineRetrieveResponse() {
        val inferencePipelineRetrieveResponse =
            InferencePipelineRetrieveResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .description("This pipeline is used for production.")
                .failingGoalCount(123L)
                .links(
                    InferencePipelineRetrieveResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .name("production")
                .passingGoalCount(123L)
                .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(InferencePipelineRetrieveResponse.Status.QUEUED)
                .statusMessage("Tests successfully evaluated")
                .totalGoalCount(123L)
                .build()
        assertThat(inferencePipelineRetrieveResponse).isNotNull
        assertThat(inferencePipelineRetrieveResponse.id())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(inferencePipelineRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineRetrieveResponse.dateLastEvaluated())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineRetrieveResponse.dateLastSampleReceived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineRetrieveResponse.dateOfNextEvaluation())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineRetrieveResponse.description())
            .contains("This pipeline is used for production.")
        assertThat(inferencePipelineRetrieveResponse.failingGoalCount()).isEqualTo(123L)
        assertThat(inferencePipelineRetrieveResponse.links())
            .isEqualTo(
                InferencePipelineRetrieveResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(inferencePipelineRetrieveResponse.name()).isEqualTo("production")
        assertThat(inferencePipelineRetrieveResponse.passingGoalCount()).isEqualTo(123L)
        assertThat(inferencePipelineRetrieveResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(inferencePipelineRetrieveResponse.status())
            .isEqualTo(InferencePipelineRetrieveResponse.Status.QUEUED)
        assertThat(inferencePipelineRetrieveResponse.statusMessage())
            .contains("Tests successfully evaluated")
        assertThat(inferencePipelineRetrieveResponse.totalGoalCount()).isEqualTo(123L)
    }
}
