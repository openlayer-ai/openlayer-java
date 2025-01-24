// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineDataStreamParamsTest {

    @Test
    fun createInferencePipelineDataStreamParams() {
        InferencePipelineDataStreamParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .config(
                InferencePipelineDataStreamParams.Config.LlmData.builder()
                    .outputColumnName("output")
                    .contextColumnName("context")
                    .costColumnName("cost")
                    .groundTruthColumnName("ground_truth")
                    .inferenceIdColumnName("id")
                    .addInputVariableName("user_query")
                    .latencyColumnName("latency")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .numOfTokenColumnName("tokens")
                    .addPrompt(
                        InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                            .content("{{ user_query }}")
                            .role("user")
                            .build()
                    )
                    .questionColumnName("question")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .addRow(
                InferencePipelineDataStreamParams.Row.builder()
                    .putAdditionalProperty("user_query", JsonValue.from("bar"))
                    .putAdditionalProperty("output", JsonValue.from("bar"))
                    .putAdditionalProperty("tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .contextColumnName("context")
                        .costColumnName("cost")
                        .groundTruthColumnName("ground_truth")
                        .inferenceIdColumnName("id")
                        .addInputVariableName("user_query")
                        .latencyColumnName("latency")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .numOfTokenColumnName("tokens")
                        .addPrompt(
                            InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                                .content("{{ user_query }}")
                                .role("user")
                                .build()
                        )
                        .questionColumnName("question")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .addRow(
                    InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.config())
            .isEqualTo(
                InferencePipelineDataStreamParams.Config.ofLlmData(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .contextColumnName("context")
                        .costColumnName("cost")
                        .groundTruthColumnName("ground_truth")
                        .inferenceIdColumnName("id")
                        .addInputVariableName("user_query")
                        .latencyColumnName("latency")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .numOfTokenColumnName("tokens")
                        .addPrompt(
                            InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                                .content("{{ user_query }}")
                                .role("user")
                                .build()
                        )
                        .questionColumnName("question")
                        .timestampColumnName("timestamp")
                        .build()
                )
            )
        assertThat(body.rows())
            .isEqualTo(
                listOf(
                    InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .build()
                )
                .addRow(
                    InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.config())
            .isEqualTo(
                InferencePipelineDataStreamParams.Config.ofLlmData(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .build()
                )
            )
        assertThat(body.rows())
            .isEqualTo(
                listOf(
                    InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .build()
                )
                .addRow(
                    InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
