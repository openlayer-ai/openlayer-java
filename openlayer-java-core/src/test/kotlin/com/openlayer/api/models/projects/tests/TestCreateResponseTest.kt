// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestCreateResponseTest {

    @Test
    fun create() {
        val testCreateResponse =
            TestCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commentCount(0L)
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .description(JsonValue.from("This test checks for duplicate rows in the dataset."))
                .name("No duplicate rows")
                .number(1L)
                .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .subtype(TestCreateResponse.Subtype.DUPLICATE_ROW_COUNT)
                .suggested(false)
                .addThreshold(
                    TestCreateResponse.Threshold.builder()
                        .insightName(TestCreateResponse.Threshold.InsightName.DUPLICATE_ROW_COUNT)
                        .addInsightParameter(
                            TestCreateResponse.Threshold.InsightParameter.builder()
                                .name("column_name")
                                .value(JsonValue.from("Age"))
                                .build()
                        )
                        .measurement("duplicateRowCount")
                        .operator(TestCreateResponse.Threshold.Operator.LESS_OR_EQUALS)
                        .thresholdMode(TestCreateResponse.Threshold.ThresholdMode.AUTOMATIC)
                        .value(0.0)
                        .build()
                )
                .type(TestCreateResponse.Type.INTEGRITY)
                .archived(false)
                .defaultToAllPipelines(true)
                .delayWindow(0.0)
                .evaluationWindow(3600.0)
                .addExcludePipeline("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeHistoricalData(true)
                .addIncludePipeline("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .usesMlModel(false)
                .usesProductionData(false)
                .usesReferenceDataset(false)
                .usesTrainingDataset(false)
                .usesValidationDataset(true)
                .build()

        assertThat(testCreateResponse.id()).isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(testCreateResponse.commentCount()).isEqualTo(0L)
        assertThat(testCreateResponse.creatorId()).contains("589ece63-49a2-41b4-98e1-10547761d4b0")
        assertThat(testCreateResponse.dateArchived())
            .contains(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(testCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(testCreateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
        assertThat(testCreateResponse._description())
            .isEqualTo(JsonValue.from("This test checks for duplicate rows in the dataset."))
        assertThat(testCreateResponse.name()).isEqualTo("No duplicate rows")
        assertThat(testCreateResponse.number()).isEqualTo(1L)
        assertThat(testCreateResponse.originProjectVersionId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(testCreateResponse.subtype())
            .isEqualTo(TestCreateResponse.Subtype.DUPLICATE_ROW_COUNT)
        assertThat(testCreateResponse.suggested()).isEqualTo(false)
        assertThat(testCreateResponse.thresholds())
            .containsExactly(
                TestCreateResponse.Threshold.builder()
                    .insightName(TestCreateResponse.Threshold.InsightName.DUPLICATE_ROW_COUNT)
                    .addInsightParameter(
                        TestCreateResponse.Threshold.InsightParameter.builder()
                            .name("column_name")
                            .value(JsonValue.from("Age"))
                            .build()
                    )
                    .measurement("duplicateRowCount")
                    .operator(TestCreateResponse.Threshold.Operator.LESS_OR_EQUALS)
                    .thresholdMode(TestCreateResponse.Threshold.ThresholdMode.AUTOMATIC)
                    .value(0.0)
                    .build()
            )
        assertThat(testCreateResponse.type()).isEqualTo(TestCreateResponse.Type.INTEGRITY)
        assertThat(testCreateResponse.archived()).contains(false)
        assertThat(testCreateResponse.defaultToAllPipelines()).contains(true)
        assertThat(testCreateResponse.delayWindow()).contains(0.0)
        assertThat(testCreateResponse.evaluationWindow()).contains(3600.0)
        assertThat(testCreateResponse.excludePipelines().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(testCreateResponse.includeHistoricalData()).contains(true)
        assertThat(testCreateResponse.includePipelines().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(testCreateResponse.usesMlModel()).contains(false)
        assertThat(testCreateResponse.usesProductionData()).contains(false)
        assertThat(testCreateResponse.usesReferenceDataset()).contains(false)
        assertThat(testCreateResponse.usesTrainingDataset()).contains(false)
        assertThat(testCreateResponse.usesValidationDataset()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testCreateResponse =
            TestCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .commentCount(0L)
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .description(JsonValue.from("This test checks for duplicate rows in the dataset."))
                .name("No duplicate rows")
                .number(1L)
                .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .subtype(TestCreateResponse.Subtype.DUPLICATE_ROW_COUNT)
                .suggested(false)
                .addThreshold(
                    TestCreateResponse.Threshold.builder()
                        .insightName(TestCreateResponse.Threshold.InsightName.DUPLICATE_ROW_COUNT)
                        .addInsightParameter(
                            TestCreateResponse.Threshold.InsightParameter.builder()
                                .name("column_name")
                                .value(JsonValue.from("Age"))
                                .build()
                        )
                        .measurement("duplicateRowCount")
                        .operator(TestCreateResponse.Threshold.Operator.LESS_OR_EQUALS)
                        .thresholdMode(TestCreateResponse.Threshold.ThresholdMode.AUTOMATIC)
                        .value(0.0)
                        .build()
                )
                .type(TestCreateResponse.Type.INTEGRITY)
                .archived(false)
                .defaultToAllPipelines(true)
                .delayWindow(0.0)
                .evaluationWindow(3600.0)
                .addExcludePipeline("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeHistoricalData(true)
                .addIncludePipeline("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .usesMlModel(false)
                .usesProductionData(false)
                .usesReferenceDataset(false)
                .usesTrainingDataset(false)
                .usesValidationDataset(true)
                .build()

        val roundtrippedTestCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testCreateResponse),
                jacksonTypeRef<TestCreateResponse>(),
            )

        assertThat(roundtrippedTestCreateResponse).isEqualTo(testCreateResponse)
    }
}
