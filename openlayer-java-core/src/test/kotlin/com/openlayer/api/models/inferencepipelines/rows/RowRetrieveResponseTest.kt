// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowRetrieveResponseTest {

    @Test
    fun create() {
        val rowRetrieveResponse =
            RowRetrieveResponse.builder()
                .row(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .build()

        assertThat(rowRetrieveResponse._row()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(rowRetrieveResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rowRetrieveResponse =
            RowRetrieveResponse.builder()
                .row(JsonValue.from(mapOf<String, Any>()))
                .success(true)
                .build()

        val roundtrippedRowRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rowRetrieveResponse),
                jacksonTypeRef<RowRetrieveResponse>(),
            )

        assertThat(roundtrippedRowRetrieveResponse).isEqualTo(rowRetrieveResponse)
    }
}
