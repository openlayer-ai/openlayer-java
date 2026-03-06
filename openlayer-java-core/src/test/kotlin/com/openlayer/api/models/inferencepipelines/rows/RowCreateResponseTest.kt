// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowCreateResponseTest {

    @Test
    fun create() {
        val rowCreateResponse =
            RowCreateResponse.builder()
                .addItem(RowCreateResponse.Item.builder().openlayerRowId(0L).build())
                .build()

        assertThat(rowCreateResponse.items())
            .containsExactly(RowCreateResponse.Item.builder().openlayerRowId(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rowCreateResponse =
            RowCreateResponse.builder()
                .addItem(RowCreateResponse.Item.builder().openlayerRowId(0L).build())
                .build()

        val roundtrippedRowCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rowCreateResponse),
                jacksonTypeRef<RowCreateResponse>(),
            )

        assertThat(roundtrippedRowCreateResponse).isEqualTo(rowCreateResponse)
    }
}
