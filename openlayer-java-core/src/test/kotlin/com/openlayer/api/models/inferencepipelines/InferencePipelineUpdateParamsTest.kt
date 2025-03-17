// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferencePipelineUpdateParamsTest {

    @Test
    fun create() {
        InferencePipelineUpdateParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("This pipeline is used for production.")
            .name("production")
            .referenceDatasetUri("referenceDatasetUri")
            .build()
    }

    @Test
    fun body() {
        val params =
            InferencePipelineUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("This pipeline is used for production.")
                .name("production")
                .referenceDatasetUri("referenceDatasetUri")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.description()).contains("This pipeline is used for production.")
        assertThat(body.name()).contains("production")
        assertThat(body.referenceDatasetUri()).contains("referenceDatasetUri")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferencePipelineUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
