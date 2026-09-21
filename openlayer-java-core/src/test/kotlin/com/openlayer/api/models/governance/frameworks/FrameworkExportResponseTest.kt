// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkExportResponseTest {

    @Test
    fun create() {
        val frameworkExportResponse =
            FrameworkExportResponse.builder()
                .taskResultId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .taskResultUrl("/v1/background-tasks/3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        assertThat(frameworkExportResponse.taskResultId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(frameworkExportResponse.taskResultUrl())
            .isEqualTo("/v1/background-tasks/3fa85f64-5717-4562-b3fc-2c963f66afa6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val frameworkExportResponse =
            FrameworkExportResponse.builder()
                .taskResultId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .taskResultUrl("/v1/background-tasks/3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .build()

        val roundtrippedFrameworkExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkExportResponse),
                jacksonTypeRef<FrameworkExportResponse>(),
            )

        assertThat(roundtrippedFrameworkExportResponse).isEqualTo(frameworkExportResponse)
    }
}
