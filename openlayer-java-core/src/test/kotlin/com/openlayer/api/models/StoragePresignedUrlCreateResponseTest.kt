// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.StoragePresignedUrlCreateResponse

class StoragePresignedUrlCreateResponseTest {

    @Test
    fun createStoragePresignedUrlCreateResponse() {
      val storagePresignedUrlCreateResponse = StoragePresignedUrlCreateResponse.builder()
          .storageUri("storageUri")
          .url("url")
          .fields(JsonValue.from(mapOf<String, Any>()))
          .build()
      assertThat(storagePresignedUrlCreateResponse).isNotNull
      assertThat(storagePresignedUrlCreateResponse.storageUri()).isEqualTo("storageUri")
      assertThat(storagePresignedUrlCreateResponse.url()).isEqualTo("url")
      assertThat(storagePresignedUrlCreateResponse._fields()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
