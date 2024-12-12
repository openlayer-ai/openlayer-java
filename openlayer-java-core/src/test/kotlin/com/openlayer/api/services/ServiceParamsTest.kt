// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

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
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import com.openlayer.api.models.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

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
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .config(
                    InferencePipelineDataStreamParams.Config.ofLlmData(
                        InferencePipelineDataStreamParams.Config.LlmData.builder()
                            .outputColumnName("output")
                            .contextColumnName("context")
                            .costColumnName("cost")
                            .groundTruthColumnName("ground_truth")
                            .inferenceIdColumnName("id")
                            .inputVariableNames(listOf("user_query"))
                            .latencyColumnName("latency")
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .numOfTokenColumnName("tokens")
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
                .rows(
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
