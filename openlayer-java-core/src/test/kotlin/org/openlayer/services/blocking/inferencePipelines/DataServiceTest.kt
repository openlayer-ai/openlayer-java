// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.inferencePipelines

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openlayer.TestServerExtension
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.core.JsonValue
import org.openlayer.models.*

@ExtendWith(TestServerExtension::class)
class DataServiceTest {

    @Test
    fun callStream() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dataService = client.inferencePipelines().data()
        val inferencePipelineDataStreamResponse =
            dataService.stream(
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
            )
        println(inferencePipelineDataStreamResponse)
        inferencePipelineDataStreamResponse.validate()
    }
}
