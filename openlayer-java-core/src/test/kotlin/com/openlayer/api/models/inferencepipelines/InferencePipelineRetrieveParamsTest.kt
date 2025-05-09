// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferencePipelineRetrieveParamsTest {

    @Test
    fun create() {
        InferencePipelineRetrieveParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("expand", listOf("project").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRetrieveParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
