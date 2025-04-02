// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowUpdateResponseTest {

    @Test
    fun create() {
        val rowUpdateResponse =
            RowUpdateResponse.builder().success(RowUpdateResponse.Success.TRUE).build()

        assertThat(rowUpdateResponse.success()).isEqualTo(RowUpdateResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rowUpdateResponse =
            RowUpdateResponse.builder().success(RowUpdateResponse.Success.TRUE).build()

        val roundtrippedRowUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rowUpdateResponse),
                jacksonTypeRef<RowUpdateResponse>(),
            )

        assertThat(roundtrippedRowUpdateResponse).isEqualTo(rowUpdateResponse)
    }
}
