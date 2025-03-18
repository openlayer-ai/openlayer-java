// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.commits.testresults

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestResultListParamsTest {

    @Test
    fun create() {
        TestResultListParams.builder()
            .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(true)
            .page(1L)
            .perPage(1L)
            .status(TestResultListParams.Status.RUNNING)
            .type(TestResultListParams.Type.INTEGRITY)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(true)
                .page(1L)
                .perPage(1L)
                .status(TestResultListParams.Status.RUNNING)
                .type(TestResultListParams.Type.INTEGRITY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeArchived", "true")
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
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
