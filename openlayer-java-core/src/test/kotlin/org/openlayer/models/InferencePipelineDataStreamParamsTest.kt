// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.openlayer.core.JsonValue
import org.openlayer.models.*

class InferencePipelineDataStreamParamsTest {

    @Test
    fun createInferencePipelineDataStreamParams() {
        InferencePipelineDataStreamParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .config(
                InferencePipelineDataStreamParams.Config.ofLlmData(
                    InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .contextColumnName("context")
                        .costColumnName("cost")
                        .groundTruthColumnName("ground_truth")
                        .inferenceIdColumnName("id")
                        .inputVariableNames(listOf("string"))
                        .latencyColumnName("latency")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .numOfTokenColumnName("num_tokens")
                        .prompt(
                            listOf(
                                InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                                    .content("{{ user_query }}")
                                    .role("user")
                                    .build()
                            )
                        )
                        .questionColumnName("question")
                        .timestampColumnName("timestamp")
                        .build()
                )
            )
            .rows(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.ofLlmData(
                        InferencePipelineDataStreamParams.Config.LlmData.builder()
                            .outputColumnName("output")
                            .contextColumnName("context")
                            .costColumnName("cost")
                            .groundTruthColumnName("ground_truth")
                            .inferenceIdColumnName("id")
                            .inputVariableNames(listOf("string"))
                            .latencyColumnName("latency")
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .numOfTokenColumnName("num_tokens")
                            .prompt(
                                listOf(
                                    InferencePipelineDataStreamParams.Config.LlmData.Prompt
                                        .builder()
                                        .content("{{ user_query }}")
                                        .role("user")
                                        .build()
                                )
                            )
                            .questionColumnName("question")
                            .timestampColumnName("timestamp")
                            .build()
                    )
                )
                .rows(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
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
                        .inputVariableNames(listOf("string"))
                        .latencyColumnName("latency")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .numOfTokenColumnName("num_tokens")
                        .prompt(
                            listOf(
                                InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                                    .content("{{ user_query }}")
                                    .role("user")
                                    .build()
                            )
                        )
                        .questionColumnName("question")
                        .timestampColumnName("timestamp")
                        .build()
                )
            )
        assertThat(body.rows())
            .isEqualTo(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.ofLlmData(
                        InferencePipelineDataStreamParams.Config.LlmData.builder()
                            .outputColumnName("output")
                            .build()
                    )
                )
                .rows(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
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
            .isEqualTo(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineDataStreamParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.ofLlmData(
                        InferencePipelineDataStreamParams.Config.LlmData.builder()
                            .outputColumnName("output")
                            .build()
                    )
                )
                .rows(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
