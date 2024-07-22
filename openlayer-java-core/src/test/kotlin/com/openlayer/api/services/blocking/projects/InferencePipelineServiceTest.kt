// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

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
import com.openlayer.api.services.blocking.projects.InferencePipelineService
import com.openlayer.api.models.*

@ExtendWith(TestServerExtension::class)
class InferencePipelineServiceTest {

    @Test
    fun callCreate() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inferencePipelineService = client.projects().inferencePipelines()
      val projectInferencePipelineCreateResponse = inferencePipelineService.create(ProjectInferencePipelineCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("This pipeline is used for production.")
          .name("production")
          .build())
      println(projectInferencePipelineCreateResponse)
      projectInferencePipelineCreateResponse.validate()
    }

    @Test
    fun callList() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val inferencePipelineService = client.projects().inferencePipelines()
      val projectInferencePipelineListResponse = inferencePipelineService.list(ProjectInferencePipelineListParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("name")
          .page(123L)
          .perPage(100L)
          .build())
      println(projectInferencePipelineListResponse)
      projectInferencePipelineListResponse.validate()
    }
}
