// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRowStreamParamsTest {

    @Test
    fun createInferencePipelineRowStreamParams() {
        InferencePipelineRowStreamParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .row(JsonValue.from(mapOf<String, Any>()))
            .config(
                InferencePipelineRowStreamParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .inferenceIdColumnName("id")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .inferenceId("inferenceId")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InferencePipelineRowStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowStreamParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .inferenceIdColumnName("id")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .inferenceId("inferenceId")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("inferenceId", listOf("inferenceId"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRowStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .row(JsonValue.from(mapOf<String, Any>()))
                .inferenceId("inferenceId")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("inferenceId", listOf("inferenceId"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            InferencePipelineRowStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowStreamParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .inferenceIdColumnName("id")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .inferenceId("inferenceId")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.config())
            .isEqualTo(
                InferencePipelineRowStreamParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .inferenceIdColumnName("id")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferencePipelineRowStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .row(JsonValue.from(mapOf<String, Any>()))
                .inferenceId("inferenceId")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineRowStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .row(JsonValue.from(mapOf<String, Any>()))
                .inferenceId("inferenceId")
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
