// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.openlayer.models.*

class InferencePipelineTestResultListParamsTest {

    @Test
    fun createInferencePipelineTestResultListParams() {
        InferencePipelineTestResultListParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(true)
            .page(123L)
            .perPage(100L)
            .status(InferencePipelineTestResultListParams.Status.RUNNING)
            .type(InferencePipelineTestResultListParams.Type.INTEGRITY)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(true)
                .page(123L)
                .perPage(100L)
                .status(InferencePipelineTestResultListParams.Status.RUNNING)
                .type(InferencePipelineTestResultListParams.Type.INTEGRITY)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("includeArchived", listOf("true"))
        expected.put("page", listOf("123"))
        expected.put("perPage", listOf("100"))
        expected.put(
            "status",
            listOf(InferencePipelineTestResultListParams.Status.RUNNING.toString())
        )
        expected.put(
            "type",
            listOf(InferencePipelineTestResultListParams.Type.INTEGRITY.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
