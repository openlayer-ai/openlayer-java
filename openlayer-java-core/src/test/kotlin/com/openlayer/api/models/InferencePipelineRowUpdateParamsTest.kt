// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRowUpdateParamsTest {

    @Test
    fun createInferencePipelineRowUpdateParams() {
        InferencePipelineRowUpdateParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inferenceId("inferenceId")
            .row(JsonValue.from(mapOf<String, Any>()))
            .config(
                InferencePipelineRowUpdateParams.Config.builder()
                    .groundTruthColumnName("ground_truth")
                    .humanFeedbackColumnName("human_feedback")
                    .inferenceIdColumnName("id")
                    .latencyColumnName("latency")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .inferenceIdColumnName("id")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("inferenceId", "inferenceId")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()
        val expected = QueryParams.builder()
        expected.put("inferenceId", "inferenceId")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .config(
                    InferencePipelineRowUpdateParams.Config.builder()
                        .groundTruthColumnName("ground_truth")
                        .humanFeedbackColumnName("human_feedback")
                        .inferenceIdColumnName("id")
                        .latencyColumnName("latency")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.config())
            .isEqualTo(
                InferencePipelineRowUpdateParams.Config.builder()
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
            InferencePipelineRowUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .row(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
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
