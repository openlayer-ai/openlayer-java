// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultListParamsTest {

    @Test
    fun create() {
        RuleResultListParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .enabledFrameworkOnly(true)
            .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeUnframed(true)
            .page(1L)
            .perPage(1L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scope(RuleResultListParams.Scope.PROJECT)
            .searchQuery("searchQuery")
            .status(RuleResultListParams.Status.PASSING)
            .type(RuleResultListParams.Type.PLATFORM)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleResultListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RuleResultListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .enabledFrameworkOnly(true)
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeUnframed(true)
                .page(1L)
                .perPage(1L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scope(RuleResultListParams.Scope.PROJECT)
                .searchQuery("searchQuery")
                .status(RuleResultListParams.Status.PASSING)
                .type(RuleResultListParams.Type.PLATFORM)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("enabledFrameworkOnly", "true")
                    .put("frameworkId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("includeUnframed", "true")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("projectId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("ruleId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("scope", "project")
                    .put("searchQuery", "searchQuery")
                    .put("status", "passing")
                    .put("type", "platform")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RuleResultListParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
