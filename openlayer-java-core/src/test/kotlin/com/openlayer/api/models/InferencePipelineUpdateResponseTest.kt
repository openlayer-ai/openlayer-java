// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineUpdateResponseTest {

    @Test
    fun createInferencePipelineUpdateResponse() {
        val inferencePipelineUpdateResponse =
            InferencePipelineUpdateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .description("This pipeline is used for production.")
                .failingGoalCount(123L)
                .links(
                    InferencePipelineUpdateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .name("production")
                .passingGoalCount(123L)
                .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(InferencePipelineUpdateResponse.Status.QUEUED)
                .statusMessage("Tests successfully evaluated")
                .totalGoalCount(123L)
                .build()
        assertThat(inferencePipelineUpdateResponse).isNotNull
        assertThat(inferencePipelineUpdateResponse.id())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(inferencePipelineUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineUpdateResponse.dateLastEvaluated())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineUpdateResponse.dateLastSampleReceived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineUpdateResponse.dateOfNextEvaluation())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(inferencePipelineUpdateResponse.description())
            .contains("This pipeline is used for production.")
        assertThat(inferencePipelineUpdateResponse.failingGoalCount()).isEqualTo(123L)
        assertThat(inferencePipelineUpdateResponse.links())
            .isEqualTo(
                InferencePipelineUpdateResponse.Links.builder()
                    .app(
                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                    )
                    .build()
            )
        assertThat(inferencePipelineUpdateResponse.name()).isEqualTo("production")
        assertThat(inferencePipelineUpdateResponse.passingGoalCount()).isEqualTo(123L)
        assertThat(inferencePipelineUpdateResponse.projectId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(inferencePipelineUpdateResponse.status())
            .isEqualTo(InferencePipelineUpdateResponse.Status.QUEUED)
        assertThat(inferencePipelineUpdateResponse.statusMessage())
            .contains("Tests successfully evaluated")
        assertThat(inferencePipelineUpdateResponse.totalGoalCount()).isEqualTo(123L)
    }
}
