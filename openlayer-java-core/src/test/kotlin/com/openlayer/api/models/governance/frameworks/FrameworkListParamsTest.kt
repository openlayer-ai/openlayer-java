// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkListParamsTest {

    @Test
    fun create() {
        FrameworkListParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asc(true)
            .completionOperator(FrameworkListParams.CompletionOperator.IS)
            .completionValue(0L)
            .enabled(true)
            .includeRuleStats(true)
            .page(1L)
            .perPage(1L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .searchQuery("searchQuery")
            .sortColumn(FrameworkListParams.SortColumn.NAME)
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FrameworkListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FrameworkListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asc(true)
                .completionOperator(FrameworkListParams.CompletionOperator.IS)
                .completionValue(0L)
                .enabled(true)
                .includeRuleStats(true)
                .page(1L)
                .perPage(1L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .searchQuery("searchQuery")
                .sortColumn(FrameworkListParams.SortColumn.NAME)
                .addTag("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("asc", "true")
                    .put("completionOperator", "is")
                    .put("completionValue", "0")
                    .put("enabled", "true")
                    .put("includeRuleStats", "true")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("projectId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("searchQuery", "searchQuery")
                    .put("sortColumn", "name")
                    .put("tags", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FrameworkListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
