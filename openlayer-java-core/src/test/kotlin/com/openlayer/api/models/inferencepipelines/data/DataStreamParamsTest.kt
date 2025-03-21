// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.data

import com.openlayer.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataStreamParamsTest {

    @Test
    fun create() {
        DataStreamParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .config(
                DataStreamParams.Config.LlmData.builder()
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
                        DataStreamParams.Config.LlmData.Prompt.builder()
                            .content("{{ user_query }}")
                            .role("user")
                            .build()
                    )
                    .questionColumnName("question")
                    .timestampColumnName("timestamp")
                    .build()
            )
            .addRow(
                DataStreamParams.Row.builder()
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
    fun pathParams() {
        val params =
            DataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    DataStreamParams.Config.LlmData.builder().outputColumnName("output").build()
                )
                .addRow(
                    DataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
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
            DataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    DataStreamParams.Config.LlmData.builder()
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
                            DataStreamParams.Config.LlmData.Prompt.builder()
                                .content("{{ user_query }}")
                                .role("user")
                                .build()
                        )
                        .questionColumnName("question")
                        .timestampColumnName("timestamp")
                        .build()
                )
                .addRow(
                    DataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                DataStreamParams.Config.ofLlmData(
                    DataStreamParams.Config.LlmData.builder()
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
                            DataStreamParams.Config.LlmData.Prompt.builder()
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
            .containsExactly(
                DataStreamParams.Row.builder()
                    .putAdditionalProperty("user_query", JsonValue.from("bar"))
                    .putAdditionalProperty("output", JsonValue.from("bar"))
                    .putAdditionalProperty("tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DataStreamParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    DataStreamParams.Config.LlmData.builder().outputColumnName("output").build()
                )
                .addRow(
                    DataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("bar"))
                        .putAdditionalProperty("output", JsonValue.from("bar"))
                        .putAdditionalProperty("tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("cost", JsonValue.from("bar"))
                        .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.config())
            .isEqualTo(
                DataStreamParams.Config.ofLlmData(
                    DataStreamParams.Config.LlmData.builder().outputColumnName("output").build()
                )
            )
        assertThat(body.rows())
            .containsExactly(
                DataStreamParams.Row.builder()
                    .putAdditionalProperty("user_query", JsonValue.from("bar"))
                    .putAdditionalProperty("output", JsonValue.from("bar"))
                    .putAdditionalProperty("tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("cost", JsonValue.from("bar"))
                    .putAdditionalProperty("timestamp", JsonValue.from("bar"))
                    .build()
            )
    }
}
