// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StoragePresignedUrlCreateResponseTest {

    @Test
    fun createStoragePresignedUrlCreateResponse() {
        val storagePresignedUrlCreateResponse =
            StoragePresignedUrlCreateResponse.builder()
                .storageUri("storageUri")
                .url("url")
                .fields(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(storagePresignedUrlCreateResponse).isNotNull
        assertThat(storagePresignedUrlCreateResponse.storageUri()).isEqualTo("storageUri")
        assertThat(storagePresignedUrlCreateResponse.url()).isEqualTo("url")
        assertThat(storagePresignedUrlCreateResponse._fields())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
