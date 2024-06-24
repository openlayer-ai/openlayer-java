// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.openlayer.models.*

class ProjectInferencePipelineListParamsTest {

    @Test
    fun createProjectInferencePipelineListParams() {
        ProjectInferencePipelineListParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("string")
            .page(123L)
            .perPage(100L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ProjectInferencePipelineListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .page(123L)
                .perPage(100L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("name", listOf("string"))
        expected.put("page", listOf("123"))
        expected.put("perPage", listOf("100"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ProjectInferencePipelineListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            ProjectInferencePipelineListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
