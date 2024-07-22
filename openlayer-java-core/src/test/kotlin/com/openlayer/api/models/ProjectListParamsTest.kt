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
import com.openlayer.api.models.ProjectListParams

class ProjectListParamsTest {

    @Test
    fun createProjectListParams() {
      ProjectListParams.builder()
          .name("name")
          .page(123L)
          .perPage(100L)
          .taskType(ProjectListParams.TaskType.LLM_BASE)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ProjectListParams.builder()
          .name("name")
          .page(123L)
          .perPage(100L)
          .taskType(ProjectListParams.TaskType.LLM_BASE)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("name", listOf("name"))
      expected.put("page", listOf("123"))
      expected.put("perPage", listOf("100"))
      expected.put("taskType", listOf(ProjectListParams.TaskType.LLM_BASE.toString()))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ProjectListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
