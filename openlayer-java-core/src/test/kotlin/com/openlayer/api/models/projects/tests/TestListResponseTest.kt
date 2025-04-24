// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListResponseTest {

    @Test
    fun create() {
        val testListResponse =
            TestListResponse.builder()
                .addItem(
                    TestListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .commentCount(0L)
                        .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .description(
                            JsonValue.from("This test checks for duplicate rows in the dataset.")
                        )
                        .name("No duplicate rows")
                        .number(1L)
                        .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .subtype(TestListResponse.Item.Subtype.DUPLICATE_ROW_COUNT)
                        .suggested(false)
                        .addThreshold(
                            TestListResponse.Item.Threshold.builder()
                                .insightName("duplicateRowCount")
                                .addInsightParameter(
                                    TestListResponse.Item.Threshold.InsightParameter.builder()
                                        .name("column_name")
                                        .value(JsonValue.from("Age"))
                                        .build()
                                )
                                .measurement("duplicateRowCount")
                                .operator(TestListResponse.Item.Threshold.Operator.LESS_OR_EQUALS)
                                .thresholdMode(
                                    TestListResponse.Item.Threshold.ThresholdMode.AUTOMATIC
                                )
                                .value(0.0)
                                .build()
                        )
                        .type(TestListResponse.Item.Type.INTEGRITY)
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
                .build()

        assertThat(testListResponse.items())
            .containsExactly(
                TestListResponse.Item.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .commentCount(0L)
                    .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .description(
                        JsonValue.from("This test checks for duplicate rows in the dataset.")
                    )
                    .name("No duplicate rows")
                    .number(1L)
                    .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .subtype(TestListResponse.Item.Subtype.DUPLICATE_ROW_COUNT)
                    .suggested(false)
                    .addThreshold(
                        TestListResponse.Item.Threshold.builder()
                            .insightName("duplicateRowCount")
                            .addInsightParameter(
                                TestListResponse.Item.Threshold.InsightParameter.builder()
                                    .name("column_name")
                                    .value(JsonValue.from("Age"))
                                    .build()
                            )
                            .measurement("duplicateRowCount")
                            .operator(TestListResponse.Item.Threshold.Operator.LESS_OR_EQUALS)
                            .thresholdMode(TestListResponse.Item.Threshold.ThresholdMode.AUTOMATIC)
                            .value(0.0)
                            .build()
                    )
                    .type(TestListResponse.Item.Type.INTEGRITY)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testListResponse =
            TestListResponse.builder()
                .addItem(
                    TestListResponse.Item.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .commentCount(0L)
                        .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                        .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                        .description(
                            JsonValue.from("This test checks for duplicate rows in the dataset.")
                        )
                        .name("No duplicate rows")
                        .number(1L)
                        .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .subtype(TestListResponse.Item.Subtype.DUPLICATE_ROW_COUNT)
                        .suggested(false)
                        .addThreshold(
                            TestListResponse.Item.Threshold.builder()
                                .insightName("duplicateRowCount")
                                .addInsightParameter(
                                    TestListResponse.Item.Threshold.InsightParameter.builder()
                                        .name("column_name")
                                        .value(JsonValue.from("Age"))
                                        .build()
                                )
                                .measurement("duplicateRowCount")
                                .operator(TestListResponse.Item.Threshold.Operator.LESS_OR_EQUALS)
                                .thresholdMode(
                                    TestListResponse.Item.Threshold.ThresholdMode.AUTOMATIC
                                )
                                .value(0.0)
                                .build()
                        )
                        .type(TestListResponse.Item.Type.INTEGRITY)
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
                .build()

        val roundtrippedTestListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testListResponse),
                jacksonTypeRef<TestListResponse>(),
            )

        assertThat(roundtrippedTestListResponse).isEqualTo(testListResponse)
    }
}
