// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRowUpdateResponseTest {

    @Test
    fun createInferencePipelineRowUpdateResponse() {
        val inferencePipelineRowUpdateResponse =
            InferencePipelineRowUpdateResponse.builder()
                .success(InferencePipelineRowUpdateResponse.Success.TRUE)
                .build()
        assertThat(inferencePipelineRowUpdateResponse).isNotNull
        assertThat(inferencePipelineRowUpdateResponse.success())
            .isEqualTo(InferencePipelineRowUpdateResponse.Success.TRUE)
    }
}
