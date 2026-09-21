// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.storage.presignedurl

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PresignedUrlRetrieveResponseTest {

    @Test
    fun create() {
        val presignedUrlRetrieveResponse = PresignedUrlRetrieveResponse.builder().url("url").build()

        assertThat(presignedUrlRetrieveResponse.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val presignedUrlRetrieveResponse = PresignedUrlRetrieveResponse.builder().url("url").build()

        val roundtrippedPresignedUrlRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(presignedUrlRetrieveResponse),
                jacksonTypeRef<PresignedUrlRetrieveResponse>(),
            )

        assertThat(roundtrippedPresignedUrlRetrieveResponse).isEqualTo(presignedUrlRetrieveResponse)
    }
}
