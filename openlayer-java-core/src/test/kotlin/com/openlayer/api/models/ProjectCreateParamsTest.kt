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
import com.openlayer.api.models.ProjectCreateParams
import com.openlayer.api.models.ProjectCreateParams.ProjectCreateBody

class ProjectCreateParamsTest {

    @Test
    fun createProjectCreateParams() {
      ProjectCreateParams.builder()
          .name("My Project")
          .taskType(ProjectCreateParams.TaskType.LLM_BASE)
          .description("My project description.")
          .build()
    }

    @Test
    fun getBody() {
      val params = ProjectCreateParams.builder()
          .name("My Project")
          .taskType(ProjectCreateParams.TaskType.LLM_BASE)
          .description("My project description.")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("My Project")
      assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
      assertThat(body.description()).isEqualTo("My project description.")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProjectCreateParams.builder()
          .name("My Project")
          .taskType(ProjectCreateParams.TaskType.LLM_BASE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("My Project")
      assertThat(body.taskType()).isEqualTo(ProjectCreateParams.TaskType.LLM_BASE)
    }
}
