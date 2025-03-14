// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectListParamsTest {

    @Test
    fun create() {
        ProjectListParams.builder()
            .name("name")
            .page(1L)
            .perPage(1L)
            .taskType(ProjectListParams.TaskType.LLM_BASE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProjectListParams.builder()
                .name("name")
                .page(1L)
                .perPage(1L)
                .taskType(ProjectListParams.TaskType.LLM_BASE)
                .build()
        val expected = QueryParams.builder()
        expected.put("name", "name")
        expected.put("page", "1")
        expected.put("perPage", "1")
        expected.put("taskType", ProjectListParams.TaskType.LLM_BASE.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProjectListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
