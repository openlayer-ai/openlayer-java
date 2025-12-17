// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.tests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestEvaluateParamsTest {

    @Test
    fun create() {
        TestEvaluateParams.builder()
            .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .endTimestamp(1700006400L)
            .startTimestamp(1699920000L)
            .inferencePipelineId("123e4567-e89b-12d3-a456-426614174000")
            .overwriteResults(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TestEvaluateParams.builder()
                .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTimestamp(1700006400L)
                .startTimestamp(1699920000L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TestEvaluateParams.builder()
                .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTimestamp(1700006400L)
                .startTimestamp(1699920000L)
                .inferencePipelineId("123e4567-e89b-12d3-a456-426614174000")
                .overwriteResults(false)
                .build()

        val body = params._body()

        assertThat(body.endTimestamp()).isEqualTo(1700006400L)
        assertThat(body.startTimestamp()).isEqualTo(1699920000L)
        assertThat(body.inferencePipelineId()).contains("123e4567-e89b-12d3-a456-426614174000")
        assertThat(body.overwriteResults()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TestEvaluateParams.builder()
                .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTimestamp(1700006400L)
                .startTimestamp(1699920000L)
                .build()

        val body = params._body()

        assertThat(body.endTimestamp()).isEqualTo(1700006400L)
        assertThat(body.startTimestamp()).isEqualTo(1699920000L)
    }
}
