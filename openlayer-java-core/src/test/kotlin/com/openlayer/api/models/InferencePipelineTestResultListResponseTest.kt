// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineTestResultListResponseTest {

    @Test
    fun createInferencePipelineTestResultListResponse() {
        val inferencePipelineTestResultListResponse =
            InferencePipelineTestResultListResponse.builder()
                .items(
                    listOf(
                        InferencePipelineTestResultListResponse.Item.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .status(InferencePipelineTestResultListResponse.Item.Status.RUNNING)
                            .statusMessage("Test successfully processed.")
                            .goal(
                                InferencePipelineTestResultListResponse.Item.Goal.builder()
                                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .commentCount(123L)
                                    .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                                    .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                                    .description(
                                        JsonValue.from(
                                            "This test checks for duplicate rows in the dataset."
                                        )
                                    )
                                    .name("No duplicate rows")
                                    .number(123L)
                                    .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                    .subtype("duplicateRowCount")
                                    .suggested(true)
                                    .thresholds(
                                        listOf(
                                            InferencePipelineTestResultListResponse.Item.Goal
                                                .Threshold
                                                .builder()
                                                .insightName("duplicateRowCount")
                                                .insightParameters(
                                                    listOf(JsonValue.from(mapOf<String, Any>()))
                                                )
                                                .measurement("duplicateRowCount")
                                                .operator("<=")
                                                .value(
                                                    InferencePipelineTestResultListResponse.Item
                                                        .Goal
                                                        .Threshold
                                                        .Value
                                                        .ofDouble(42.23)
                                                )
                                                .build()
                                        )
                                    )
                                    .type("integrity")
                                    .archived(true)
                                    .delayWindow(42.23)
                                    .evaluationWindow(42.23)
                                    .usesMlModel(true)
                                    .usesProductionData(true)
                                    .usesReferenceDataset(true)
                                    .usesTrainingDataset(true)
                                    .usesValidationDataset(true)
                                    .build()
                            )
                            .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .build()
                    )
                )
                .build()
        assertThat(inferencePipelineTestResultListResponse).isNotNull
        assertThat(inferencePipelineTestResultListResponse.items())
            .containsExactly(
                InferencePipelineTestResultListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(InferencePipelineTestResultListResponse.Item.Status.RUNNING)
                    .statusMessage("Test successfully processed.")
                    .goal(
                        InferencePipelineTestResultListResponse.Item.Goal.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .commentCount(123L)
                            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .description(
                                JsonValue.from(
                                    "This test checks for duplicate rows in the dataset."
                                )
                            )
                            .name("No duplicate rows")
                            .number(123L)
                            .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .subtype("duplicateRowCount")
                            .suggested(true)
                            .thresholds(
                                listOf(
                                    InferencePipelineTestResultListResponse.Item.Goal.Threshold
                                        .builder()
                                        .insightName("duplicateRowCount")
                                        .insightParameters(
                                            listOf(JsonValue.from(mapOf<String, Any>()))
                                        )
                                        .measurement("duplicateRowCount")
                                        .operator("<=")
                                        .value(
                                            InferencePipelineTestResultListResponse.Item.Goal
                                                .Threshold
                                                .Value
                                                .ofDouble(42.23)
                                        )
                                        .build()
                                )
                            )
                            .type("integrity")
                            .archived(true)
                            .delayWindow(42.23)
                            .evaluationWindow(42.23)
                            .usesMlModel(true)
                            .usesProductionData(true)
                            .usesReferenceDataset(true)
                            .usesTrainingDataset(true)
                            .usesValidationDataset(true)
                            .build()
                    )
                    .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
    }
}
