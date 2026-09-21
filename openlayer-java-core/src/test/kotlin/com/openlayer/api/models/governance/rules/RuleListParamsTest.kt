// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleListParamsTest {

    @Test
    fun create() {
        RuleListParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asc(true)
            .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .deactivated(true)
            .enabledFrameworkOnly(true)
            .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .group(RuleListParams.Group.OPEN)
            .includeResults(true)
            .includeUnframed(true)
            .page(1L)
            .perPage(1L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scope(RuleListParams.Scope.PROJECT)
            .searchQuery("searchQuery")
            .sortBy(RuleListParams.SortBy.NAME)
            .status(RuleListParams.Status.PASSING)
            .addTag("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(RuleListParams.Type.PLATFORM)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleListParams.builder().workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RuleListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asc(true)
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deactivated(true)
                .enabledFrameworkOnly(true)
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .group(RuleListParams.Group.OPEN)
                .includeResults(true)
                .includeUnframed(true)
                .page(1L)
                .perPage(1L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scope(RuleListParams.Scope.PROJECT)
                .searchQuery("searchQuery")
                .sortBy(RuleListParams.SortBy.NAME)
                .status(RuleListParams.Status.PASSING)
                .addTag("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(RuleListParams.Type.PLATFORM)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("asc", "true")
                    .put("assigneeId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("deactivated", "true")
                    .put("enabledFrameworkOnly", "true")
                    .put("frameworkId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("group", "open")
                    .put("includeResults", "true")
                    .put("includeUnframed", "true")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("projectId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("scope", "project")
                    .put("searchQuery", "searchQuery")
                    .put("sortBy", "name")
                    .put("status", "passing")
                    .put("tags", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("type", "platform")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RuleListParams.builder().workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
