// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferencePipelineRetrieveParamsTest {

    @Test
    fun create() {
        InferencePipelineRetrieveParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
                .build()
        val expected = QueryParams.builder()
        expected.put("expand", InferencePipelineRetrieveParams.Expand.PROJECT.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "inferencePipelineId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
