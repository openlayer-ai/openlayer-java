// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineTestResultListParamsTest {

    @Test
    fun createInferencePipelineTestResultListParams() {
        InferencePipelineTestResultListParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .page(1L)
            .perPage(1L)
            .status(InferencePipelineTestResultListParams.Status.RUNNING)
            .type(InferencePipelineTestResultListParams.Type.INTEGRITY)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .page(1L)
                .perPage(1L)
                .status(InferencePipelineTestResultListParams.Status.RUNNING)
                .type(InferencePipelineTestResultListParams.Type.INTEGRITY)
                .build()
        val expected = QueryParams.builder()
        expected.put("page", "1")
        expected.put("perPage", "1")
        expected.put("status", InferencePipelineTestResultListParams.Status.RUNNING.toString())
        expected.put("type", InferencePipelineTestResultListParams.Type.INTEGRITY.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineTestResultListParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
