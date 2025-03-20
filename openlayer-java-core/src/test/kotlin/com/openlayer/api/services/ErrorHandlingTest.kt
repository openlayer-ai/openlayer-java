// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.jsonMapper
import com.openlayer.api.errors.BadRequestException
import com.openlayer.api.errors.InternalServerException
import com.openlayer.api.errors.NotFoundException
import com.openlayer.api.errors.OpenlayerException
import com.openlayer.api.errors.PermissionDeniedException
import com.openlayer.api.errors.RateLimitException
import com.openlayer.api.errors.UnauthorizedException
import com.openlayer.api.errors.UnexpectedStatusCodeException
import com.openlayer.api.errors.UnprocessableEntityException
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: OpenlayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun dataStream400() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream401() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream403() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream404() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream422() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream429() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream500() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStream999() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                dataService.stream(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun dataStreamInvalidJsonBody() {
        val dataService = client.inferencePipelines().data()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<OpenlayerException> {
                dataService.stream(
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
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
