// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.openlayer.api.core.ContentTypes
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.MultipartFormValue
import com.openlayer.api.models.*
import com.openlayer.api.models.StoragePresignedUrlCreateParams

class StoragePresignedUrlCreateParamsTest {

    @Test
    fun createStoragePresignedUrlCreateParams() {
      StoragePresignedUrlCreateParams.builder()
          .objectName("objectName")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = StoragePresignedUrlCreateParams.builder()
          .objectName("objectName")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("objectName", listOf("objectName"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = StoragePresignedUrlCreateParams.builder()
          .objectName("objectName")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("objectName", listOf("objectName"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
