// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.data

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataStreamResponseTest {

    @Test
    fun createDataStreamResponse() {
        val dataStreamResponse =
            DataStreamResponse.builder().success(DataStreamResponse.Success.TRUE).build()
        assertThat(dataStreamResponse).isNotNull
        assertThat(dataStreamResponse.success()).isEqualTo(DataStreamResponse.Success.TRUE)
    }
}
