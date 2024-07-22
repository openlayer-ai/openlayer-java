// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.services.blocking.ProjectService
import com.openlayer.api.models.*

@ExtendWith(TestServerExtension::class)
class ProjectServiceTest {

    @Test
    fun callCreate() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()
      val projectCreateResponse = projectService.create(ProjectCreateParams.builder()
          .name("My Project")
          .taskType(ProjectCreateParams.TaskType.LLM_BASE)
          .description("My project description.")
          .build())
      println(projectCreateResponse)
      projectCreateResponse.validate()
    }

    @Test
    fun callList() {
      val client = OpenlayerOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val projectService = client.projects()
      val projectListResponse = projectService.list(ProjectListParams.builder()
          .name("name")
          .page(123L)
          .perPage(100L)
          .taskType(ProjectListParams.TaskType.LLM_BASE)
          .build())
      println(projectListResponse)
      projectListResponse.validate()
    }
}
