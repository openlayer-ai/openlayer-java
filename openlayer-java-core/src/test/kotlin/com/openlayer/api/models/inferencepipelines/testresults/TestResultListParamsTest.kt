// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.testresults

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestResultListParamsTest {

    @Test
    fun create() {
        TestResultListParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(1L)
            .perPage(1L)
            .status(TestResultListParams.Status.RUNNING)
            .type(TestResultListParams.Type.INTEGRITY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(1L)
                .perPage(1L)
                .status(TestResultListParams.Status.RUNNING)
                .type(TestResultListParams.Type.INTEGRITY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("status", "running")
                    .put("type", "integrity")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            TestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
