// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.openlayer.models.*

class ProjectListParamsTest {

    @Test
    fun createProjectListParams() {
        ProjectListParams.builder()
            .name("string")
            .page(123L)
            .perPage(100L)
            .taskType(ProjectListParams.TaskType.LLM_BASE)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ProjectListParams.builder()
                .name("string")
                .page(123L)
                .perPage(100L)
                .taskType(ProjectListParams.TaskType.LLM_BASE)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("name", listOf("string"))
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
