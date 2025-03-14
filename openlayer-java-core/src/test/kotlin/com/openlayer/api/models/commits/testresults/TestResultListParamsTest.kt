// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.commits.testresults

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestResultListParamsTest {

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
        val expected = QueryParams.builder()
        expected.put("includeArchived", "true")
        expected.put("page", "1")
        expected.put("perPage", "1")
        expected.put("status", TestResultListParams.Status.RUNNING.toString())
        expected.put("type", TestResultListParams.Type.INTEGRITY.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            TestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "projectVersionId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
