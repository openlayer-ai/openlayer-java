// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRowStreamResponseTest {

    @Test
    fun createInferencePipelineRowStreamResponse() {
        val inferencePipelineRowStreamResponse =
            InferencePipelineRowStreamResponse.builder()
                .success(InferencePipelineRowStreamResponse.Success.TRUE)
                .build()
        assertThat(inferencePipelineRowStreamResponse).isNotNull
        assertThat(inferencePipelineRowStreamResponse.success())
            .isEqualTo(InferencePipelineRowStreamResponse.Success.TRUE)
    }
}
