// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks.sections

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SectionListRulesParamsTest {

    @Test
    fun create() {
        SectionListRulesParams.builder()
            .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeResults(true)
            .includeSubsectionRules(true)
            .page(1L)
            .perPage(1L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .status(SectionListRulesParams.Status.PASSING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SectionListRulesParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SectionListRulesParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeResults(true)
                .includeSubsectionRules(true)
                .page(1L)
                .perPage(1L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(SectionListRulesParams.Status.PASSING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeResults", "true")
                    .put("includeSubsectionRules", "true")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("projectId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("status", "passing")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SectionListRulesParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
