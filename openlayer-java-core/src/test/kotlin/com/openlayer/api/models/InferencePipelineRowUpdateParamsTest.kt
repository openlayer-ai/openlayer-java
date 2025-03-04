// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.QueryParams
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRowUpdateParamsTest {

    @Test
    fun create() {
        InferencePipelineRowUpdateParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inferenceId("inferenceId")
            .row(JsonValue.from(mapOf<String, Any>()))
            .config(
                InferencePipelineRowUpdateParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("inferenceId", "inferenceId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()
        val expected = QueryParams.builder()
        expected.put("inferenceId", "inferenceId")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body._row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.config())
            .contains(
                InferencePipelineRowUpdateParams.Config.builder()
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
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body._row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
