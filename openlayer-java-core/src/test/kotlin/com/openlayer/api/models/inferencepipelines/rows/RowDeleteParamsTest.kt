// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowDeleteParamsTest {

    @Test
    fun create() {
        RowDeleteParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inferenceId("inferenceId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowDeleteParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inferenceId("inferenceId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("inferenceId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
