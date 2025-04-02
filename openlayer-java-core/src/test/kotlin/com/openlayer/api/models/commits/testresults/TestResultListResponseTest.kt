// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.commits.testresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestResultListResponseTest {

    @Test
    fun create() {
        val testResultListResponse =
            TestResultListResponse.builder()
                .addItem(
                    TestResultListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .status(TestResultListResponse.Item.Status.RUNNING)
                        .statusMessage("Test successfully processed.")
                        .goal(
                            TestResultListResponse.Item.Goal.builder()
                                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .commentCount(0L)
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
                                .number(1L)
                                .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .subtype("duplicateRowCount")
                                .suggested(false)
                                .addThreshold(
                                    TestResultListResponse.Item.Goal.Threshold.builder()
                                        .insightName("duplicateRowCount")
                                        .addInsightParameter(JsonValue.from(mapOf<String, Any>()))
                                        .measurement("duplicateRowCount")
                                        .operator("<=")
                                        .value(0.0)
                                        .build()
                                )
                                .type("integrity")
                                .archived(false)
                                .delayWindow(0.0)
                                .evaluationWindow(3600.0)
                                .usesMlModel(false)
                                .usesProductionData(false)
                                .usesReferenceDataset(false)
                                .usesTrainingDataset(false)
                                .usesValidationDataset(true)
                                .build()
                        )
                        .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .build()
                )
                .build()

        assertThat(testResultListResponse.items())
            .containsExactly(
                TestResultListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(TestResultListResponse.Item.Status.RUNNING)
                    .statusMessage("Test successfully processed.")
                    .goal(
                        TestResultListResponse.Item.Goal.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .commentCount(0L)
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
                            .number(1L)
                            .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .subtype("duplicateRowCount")
                            .suggested(false)
                            .addThreshold(
                                TestResultListResponse.Item.Goal.Threshold.builder()
                                    .insightName("duplicateRowCount")
                                    .addInsightParameter(JsonValue.from(mapOf<String, Any>()))
                                    .measurement("duplicateRowCount")
                                    .operator("<=")
                                    .value(0.0)
                                    .build()
                            )
                            .type("integrity")
                            .archived(false)
                            .delayWindow(0.0)
                            .evaluationWindow(3600.0)
                            .usesMlModel(false)
                            .usesProductionData(false)
                            .usesReferenceDataset(false)
                            .usesTrainingDataset(false)
                            .usesValidationDataset(true)
                            .build()
                    )
                    .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testResultListResponse =
            TestResultListResponse.builder()
                .addItem(
                    TestResultListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateDataEnds(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateDataStarts(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .inferencePipelineId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .projectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .status(TestResultListResponse.Item.Status.RUNNING)
                        .statusMessage("Test successfully processed.")
                        .goal(
                            TestResultListResponse.Item.Goal.builder()
                                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .commentCount(0L)
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
                                .number(1L)
                                .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                                .subtype("duplicateRowCount")
                                .suggested(false)
                                .addThreshold(
                                    TestResultListResponse.Item.Goal.Threshold.builder()
                                        .insightName("duplicateRowCount")
                                        .addInsightParameter(JsonValue.from(mapOf<String, Any>()))
                                        .measurement("duplicateRowCount")
                                        .operator("<=")
                                        .value(0.0)
                                        .build()
                                )
                                .type("integrity")
                                .archived(false)
                                .delayWindow(0.0)
                                .evaluationWindow(3600.0)
                                .usesMlModel(false)
                                .usesProductionData(false)
                                .usesReferenceDataset(false)
                                .usesTrainingDataset(false)
                                .usesValidationDataset(true)
                                .build()
                        )
                        .goalId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .build()
                )
                .build()

        val roundtrippedTestResultListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testResultListResponse),
                jacksonTypeRef<TestResultListResponse>(),
            )

        assertThat(roundtrippedTestResultListResponse).isEqualTo(testResultListResponse)
    }
}
