// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.storage.presignedurl

import com.openlayer.api.core.JsonValue
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
}
