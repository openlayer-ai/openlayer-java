// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineUpdateParamsTest {

    @Test
    fun createInferencePipelineUpdateParams() {
        InferencePipelineUpdateParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("This pipeline is used for production.")
            .name("production")
            .referenceDatasetUri("referenceDatasetUri")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferencePipelineUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("This pipeline is used for production.")
                .name("production")
                .referenceDatasetUri("referenceDatasetUri")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("This pipeline is used for production.")
        assertThat(body.name()).isEqualTo("production")
        assertThat(body.referenceDatasetUri()).isEqualTo("referenceDatasetUri")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferencePipelineUpdateParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
