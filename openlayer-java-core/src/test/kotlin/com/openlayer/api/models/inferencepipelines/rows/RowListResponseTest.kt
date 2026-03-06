// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowListResponseTest {

    @Test
    fun create() {
        val rowListResponse =
            RowListResponse.builder()
                .addItem(RowListResponse.Item.builder().openlayerRowId(0L).build())
                .build()

        assertThat(rowListResponse.items())
            .containsExactly(RowListResponse.Item.builder().openlayerRowId(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rowListResponse =
            RowListResponse.builder()
                .addItem(RowListResponse.Item.builder().openlayerRowId(0L).build())
                .build()

        val roundtrippedRowListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rowListResponse),
                jacksonTypeRef<RowListResponse>(),
            )

        assertThat(roundtrippedRowListResponse).isEqualTo(rowListResponse)
    }
}
