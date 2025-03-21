// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowUpdateParamsTest {

    @Test
    fun create() {
        RowUpdateParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inferenceId("inferenceId")
            .row(JsonValue.from(mapOf<String, Any>()))
            .config(
                RowUpdateParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    RowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("inferenceId", "inferenceId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("inferenceId", "inferenceId").build())
    }

    @Test
    fun body() {
        val params =
            RowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    RowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body._row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.config())
            .contains(
                RowUpdateParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
