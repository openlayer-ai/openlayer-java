// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("name", "name")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("taskType", "llm-base")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProjectListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
