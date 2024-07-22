// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.BinaryResponseContent
import com.openlayer.api.services.blocking.inferencePipelines.DataService
import com.openlayer.api.models.*

@ExtendWith(TestServerExtension::class)
class DataServiceTest {

    @Test
    fun callStream() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val dataService = client.inferencePipelines().data()
      val inferencePipelineDataStreamResponse = dataService.stream(InferencePipelineDataStreamParams.builder()
          .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .config(InferencePipelineDataStreamParams.Config.ofLlmData(InferencePipelineDataStreamParams.Config.LlmData.builder()
              .outputColumnName("output")
              .contextColumnName("context")
              .costColumnName("cost")
              .groundTruthColumnName("ground_truth")
              .inferenceIdColumnName("id")
              .inputVariableNames(listOf("string"))
              .latencyColumnName("latency")
              .metadata(JsonValue.from(mapOf<String, Any>()))
              .numOfTokenColumnName("num_tokens")
              .prompt(listOf(InferencePipelineDataStreamParams.Config.LlmData.Prompt.builder()
                  .content("{{ user_query }}")
                  .role("user")
                  .build()))
              .questionColumnName("question")
              .timestampColumnName("timestamp")
              .build()))
          .rows(listOf(InferencePipelineDataStreamParams.Row.builder().build()))
          .build())
      println(inferencePipelineDataStreamResponse)
      inferencePipelineDataStreamResponse.validate()
    }
}
