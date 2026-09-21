// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkExportParamsTest {

    @Test
    fun create() {
        FrameworkExportParams.builder()
            .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FrameworkExportParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FrameworkExportParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val body = params._body()

        assertThat(body.projectId()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FrameworkExportParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
