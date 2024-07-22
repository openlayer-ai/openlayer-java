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
import com.openlayer.api.models.ProjectInferencePipelineCreateParams
import com.openlayer.api.models.ProjectInferencePipelineCreateParams.ProjectInferencePipelineCreateBody

class ProjectInferencePipelineCreateParamsTest {

    @Test
    fun createProjectInferencePipelineCreateParams() {
      ProjectInferencePipelineCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("This pipeline is used for production.")
          .name("production")
          .build()
    }

    @Test
    fun getBody() {
      val params = ProjectInferencePipelineCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .description("This pipeline is used for production.")
          .name("production")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("This pipeline is used for production.")
      assertThat(body.name()).isEqualTo("production")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = ProjectInferencePipelineCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("production")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.name()).isEqualTo("production")
    }

    @Test
    fun getPathParam() {
      val params = ProjectInferencePipelineCreateParams.builder()
          .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
          .name("production")
          .build()
      assertThat(params).isNotNull
      // path param "projectId"
      assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
