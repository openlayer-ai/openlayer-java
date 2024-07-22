// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.ProjectInferencePipelineCreateResponse

class ProjectInferencePipelineCreateResponseTest {

    @Test
    fun createProjectInferencePipelineCreateResponse() {
      val projectInferencePipelineCreateResponse = ProjectInferencePipelineCreateResponse.builder()
          .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
          .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
          .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
          .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
          .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
          .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
          .description("This pipeline is used for production.")
          .failingGoalCount(123L)
          .links(ProjectInferencePipelineCreateResponse.Links.builder()
              .app("https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6")
              .build())
          .name("production")
          .passingGoalCount(123L)
          .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
          .status(ProjectInferencePipelineCreateResponse.Status.QUEUED)
          .statusMessage("Tests successfully evaluated")
          .totalGoalCount(123L)
          .build()
      assertThat(projectInferencePipelineCreateResponse).isNotNull
      assertThat(projectInferencePipelineCreateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
      assertThat(projectInferencePipelineCreateResponse.dateCreated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
      assertThat(projectInferencePipelineCreateResponse.dateLastEvaluated()).contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
      assertThat(projectInferencePipelineCreateResponse.dateLastSampleReceived()).contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
      assertThat(projectInferencePipelineCreateResponse.dateOfNextEvaluation()).contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
      assertThat(projectInferencePipelineCreateResponse.dateUpdated()).isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
      assertThat(projectInferencePipelineCreateResponse.description()).contains("This pipeline is used for production.")
      assertThat(projectInferencePipelineCreateResponse.failingGoalCount()).isEqualTo(123L)
      assertThat(projectInferencePipelineCreateResponse.links()).isEqualTo(ProjectInferencePipelineCreateResponse.Links.builder()
          .app("https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6")
          .build())
      assertThat(projectInferencePipelineCreateResponse.name()).isEqualTo("production")
      assertThat(projectInferencePipelineCreateResponse.passingGoalCount()).isEqualTo(123L)
      assertThat(projectInferencePipelineCreateResponse.projectId()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
      assertThat(projectInferencePipelineCreateResponse.status()).isEqualTo(ProjectInferencePipelineCreateResponse.Status.QUEUED)
      assertThat(projectInferencePipelineCreateResponse.statusMessage()).contains("Tests successfully evaluated")
      assertThat(projectInferencePipelineCreateResponse.totalGoalCount()).isEqualTo(123L)
    }
}
