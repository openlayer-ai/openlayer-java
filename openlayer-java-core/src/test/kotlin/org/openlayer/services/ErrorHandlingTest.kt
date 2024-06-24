// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.openlayer.client.OpenlayerClient
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.core.JsonString
import org.openlayer.core.JsonValue
import org.openlayer.core.jsonMapper
import org.openlayer.errors.BadRequestException
import org.openlayer.errors.InternalServerException
import org.openlayer.errors.NotFoundException
import org.openlayer.errors.OpenlayerError
import org.openlayer.errors.OpenlayerException
import org.openlayer.errors.PermissionDeniedException
import org.openlayer.errors.RateLimitException
import org.openlayer.errors.UnauthorizedException
import org.openlayer.errors.UnexpectedStatusCodeException
import org.openlayer.errors.UnprocessableEntityException
import org.openlayer.models.*

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val OPENLAYER_ERROR: OpenlayerError =
        OpenlayerError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

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

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream401() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream403() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream404() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream422() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    OPENLAYER_ERROR
                )
            })
    }

    @Test
    fun dataStream429() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun dataStream500() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(OPENLAYER_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.inferencePipelines().data().stream(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), OpenlayerError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
