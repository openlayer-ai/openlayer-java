// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineDataStreamResponseTest {

    @Test
    fun createInferencePipelineDataStreamResponse() {
        val inferencePipelineDataStreamResponse =
            InferencePipelineDataStreamResponse.builder()
                .success(InferencePipelineDataStreamResponse.Success.TRUE)
                .build()
        assertThat(inferencePipelineDataStreamResponse).isNotNull
        assertThat(inferencePipelineDataStreamResponse.success())
            .isEqualTo(InferencePipelineDataStreamResponse.Success.TRUE)
    }
}
