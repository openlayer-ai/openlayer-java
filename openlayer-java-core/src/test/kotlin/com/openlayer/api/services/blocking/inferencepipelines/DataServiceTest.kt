// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataServiceTest {

    @Test
    fun stream() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val dataService = client.inferencePipelines().data()

        val response =
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

        response.validate()
    }
}
