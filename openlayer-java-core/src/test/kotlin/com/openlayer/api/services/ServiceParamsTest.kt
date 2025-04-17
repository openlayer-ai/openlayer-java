// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

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
    fun stream() {
        val dataService = client.inferencePipelines().data()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
