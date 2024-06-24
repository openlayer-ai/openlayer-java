// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.openlayer.client.OpenlayerClient
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.core.JsonString
import org.openlayer.core.JsonValue
import org.openlayer.core.jsonMapper
import org.openlayer.models.*

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OpenlayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OpenlayerOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun dataStreamWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

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
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            InferencePipelineDataStreamResponse.builder()
                .success(InferencePipelineDataStreamResponse.Success.TRUE)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.inferencePipelines().data().stream(params)

        verify(postRequestedFor(anyUrl()))
    }
}
