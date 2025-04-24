// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestListParamsTest {

    @Test
    fun create() {
        TestListParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(true)
            .originVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .page(1L)
            .perPage(1L)
            .suggested(true)
            .type(TestListParams.Type.INTEGRITY)
            .usesProductionData(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestListParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TestListParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(true)
                .originVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .page(1L)
                .perPage(1L)
                .suggested(true)
                .type(TestListParams.Type.INTEGRITY)
                .usesProductionData(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("includeArchived", "true")
                    .put("originVersionId", "3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("suggested", "true")
                    .put("type", "integrity")
                    .put("usesProductionData", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TestListParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
