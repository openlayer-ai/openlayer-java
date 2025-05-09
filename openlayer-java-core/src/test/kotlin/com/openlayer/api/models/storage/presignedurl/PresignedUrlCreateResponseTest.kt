// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.storage.presignedurl

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PresignedUrlCreateResponseTest {

    @Test
    fun create() {
        val presignedUrlCreateResponse =
            PresignedUrlCreateResponse.builder()
                .storageUri("storageUri")
                .url("url")
                .fields(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(presignedUrlCreateResponse.storageUri()).isEqualTo("storageUri")
        assertThat(presignedUrlCreateResponse.url()).isEqualTo("url")
        assertThat(presignedUrlCreateResponse._fields())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val presignedUrlCreateResponse =
            PresignedUrlCreateResponse.builder()
                .storageUri("storageUri")
                .url("url")
                .fields(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedPresignedUrlCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(presignedUrlCreateResponse),
                jacksonTypeRef<PresignedUrlCreateResponse>(),
            )

        assertThat(roundtrippedPresignedUrlCreateResponse).isEqualTo(presignedUrlCreateResponse)
    }
}
