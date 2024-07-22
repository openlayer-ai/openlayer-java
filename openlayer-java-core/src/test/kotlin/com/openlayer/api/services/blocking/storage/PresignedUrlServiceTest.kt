// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.BinaryResponseContent
import com.openlayer.api.services.blocking.storage.PresignedUrlService
import com.openlayer.api.models.*

@ExtendWith(TestServerExtension::class)
class PresignedUrlServiceTest {

    @Test
    fun callCreate() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val presignedUrlService = client.storage().presignedUrl()
      val storagePresignedUrlCreateResponse = presignedUrlService.create(StoragePresignedUrlCreateParams.builder()
          .objectName("objectName")
          .build())
      println(storagePresignedUrlCreateResponse)
      storagePresignedUrlCreateResponse.validate()
    }
}
