// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
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
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.errors.OpenlayerException
import com.openlayer.api.errors.PermissionDeniedException
import com.openlayer.api.errors.RateLimitException
import com.openlayer.api.errors.UnauthorizedException
import com.openlayer.api.errors.UnexpectedStatusCodeException
import com.openlayer.api.errors.UnprocessableEntityException
import com.openlayer.api.models.InferencePipelineDataStreamParams
import com.openlayer.api.models.InferencePipelineDataStreamResponse
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val OPENLAYER_ERROR: OpenlayerError =
        OpenlayerError.builder().putAdditionalProperty("key", JsonValue.from("value")).build()

    private lateinit var client: OpenlayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun dataStream200() {
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

        val expected =
            InferencePipelineDataStreamResponse.builder()
                .success(InferencePipelineDataStreamResponse.Success.TRUE)
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.inferencePipelines().data().stream(params)).isEqualTo(expected)
    }

    @Test
    fun dataStream400() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream401() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream403() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    OPENLAYER_ERROR
                )
            })
    }

    @Test
    fun dataStream404() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream422() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    OPENLAYER_ERROR
                )
            })
    }

    @Test
    fun dataStream429() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream500() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    OPENLAYER_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(OPENLAYER_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OpenlayerException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
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

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), OpenlayerError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: OpenlayerError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: OpenlayerError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: OpenlayerError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: OpenlayerError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
