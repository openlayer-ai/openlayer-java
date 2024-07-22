// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.InferencePipelineDataStreamResponse

class InferencePipelineDataStreamResponseTest {

    @Test
    fun createInferencePipelineDataStreamResponse() {
      val inferencePipelineDataStreamResponse = InferencePipelineDataStreamResponse.builder()
          .success(InferencePipelineDataStreamResponse.Success.TRUE)
          .build()
      assertThat(inferencePipelineDataStreamResponse).isNotNull
      assertThat(inferencePipelineDataStreamResponse.success()).isEqualTo(InferencePipelineDataStreamResponse.Success.TRUE)
    }
}
