// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.openlayer.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestUpdateParamsTest {

    @Test
    fun create() {
        TestUpdateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPayload(
                TestUpdateParams.Payload.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .archived(false)
                    .description(
                        JsonValue.from("This test checks for duplicate rows in the dataset.")
                    )
                    .name("No duplicate rows")
                    .suggested(TestUpdateParams.Payload.Suggested.FALSE)
                    .addThreshold(
                        TestUpdateParams.Payload.Threshold.builder()
                            .insightName(
                                TestUpdateParams.Payload.Threshold.InsightName.DUPLICATE_ROW_COUNT
                            )
                            .addInsightParameter(
                                TestUpdateParams.Payload.Threshold.InsightParameter.builder()
                                    .name("column_name")
                                    .value(JsonValue.from("Age"))
                                    .build()
                            )
                            .measurement("duplicateRowCount")
                            .operator(TestUpdateParams.Payload.Threshold.Operator.LESS_OR_EQUALS)
                            .thresholdMode(
                                TestUpdateParams.Payload.Threshold.ThresholdMode.AUTOMATIC
                            )
                            .value(0.0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPayload(
                    TestUpdateParams.Payload.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TestUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPayload(
                    TestUpdateParams.Payload.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .archived(false)
                        .description(
                            JsonValue.from("This test checks for duplicate rows in the dataset.")
                        )
                        .name("No duplicate rows")
                        .suggested(TestUpdateParams.Payload.Suggested.FALSE)
                        .addThreshold(
                            TestUpdateParams.Payload.Threshold.builder()
                                .insightName(
                                    TestUpdateParams.Payload.Threshold.InsightName
                                        .DUPLICATE_ROW_COUNT
                                )
                                .addInsightParameter(
                                    TestUpdateParams.Payload.Threshold.InsightParameter.builder()
                                        .name("column_name")
                                        .value(JsonValue.from("Age"))
                                        .build()
                                )
                                .measurement("duplicateRowCount")
                                .operator(
                                    TestUpdateParams.Payload.Threshold.Operator.LESS_OR_EQUALS
                                )
                                .thresholdMode(
                                    TestUpdateParams.Payload.Threshold.ThresholdMode.AUTOMATIC
                                )
                                .value(0.0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.payloads())
            .containsExactly(
                TestUpdateParams.Payload.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .archived(false)
                    .description(
                        JsonValue.from("This test checks for duplicate rows in the dataset.")
                    )
                    .name("No duplicate rows")
                    .suggested(TestUpdateParams.Payload.Suggested.FALSE)
                    .addThreshold(
                        TestUpdateParams.Payload.Threshold.builder()
                            .insightName(
                                TestUpdateParams.Payload.Threshold.InsightName.DUPLICATE_ROW_COUNT
                            )
                            .addInsightParameter(
                                TestUpdateParams.Payload.Threshold.InsightParameter.builder()
                                    .name("column_name")
                                    .value(JsonValue.from("Age"))
                                    .build()
                            )
                            .measurement("duplicateRowCount")
                            .operator(TestUpdateParams.Payload.Threshold.Operator.LESS_OR_EQUALS)
                            .thresholdMode(
                                TestUpdateParams.Payload.Threshold.ThresholdMode.AUTOMATIC
                            )
                            .value(0.0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TestUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPayload(
                    TestUpdateParams.Payload.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.payloads())
            .containsExactly(
                TestUpdateParams.Payload.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
