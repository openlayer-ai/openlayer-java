// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.tests

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListResultsParamsTest {

    @Test
    fun create() {
        TestListResultsParams.builder()
            .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .endTimestamp(0.0)
            .includeInsights(true)
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(1L)
            .perPage(1L)
            .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startTimestamp(0.0)
            .addStatus("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestListResultsParams.builder().testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TestListResultsParams.builder()
                .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTimestamp(0.0)
                .includeInsights(true)
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(1L)
                .perPage(1L)
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTimestamp(0.0)
                .addStatus("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endTimestamp", "0.0")
                    .put("includeInsights", "true")
                    .put("inferencePipelineId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("projectVersionId", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("startTimestamp", "0.0")
                    .put("status", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TestListResultsParams.builder().testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
