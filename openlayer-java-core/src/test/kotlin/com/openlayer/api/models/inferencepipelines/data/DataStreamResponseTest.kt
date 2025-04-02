// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.data

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataStreamResponseTest {

    @Test
    fun create() {
        val dataStreamResponse =
            DataStreamResponse.builder().success(DataStreamResponse.Success.TRUE).build()

        assertThat(dataStreamResponse.success()).isEqualTo(DataStreamResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataStreamResponse =
            DataStreamResponse.builder().success(DataStreamResponse.Success.TRUE).build()

        val roundtrippedDataStreamResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataStreamResponse),
                jacksonTypeRef<DataStreamResponse>(),
            )

        assertThat(roundtrippedDataStreamResponse).isEqualTo(dataStreamResponse)
    }
}
