// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultCreateEvidenceParamsTest {

    @Test
    fun create() {
        RuleResultCreateEvidenceParams.builder()
            .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .name("Model risk assessment 2026")
            .storageUri("s3://openlayer-evidence/evidence.pdf")
            .text("text")
            .url("https://openlayer.com/evidence")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleResultCreateEvidenceParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RuleResultCreateEvidenceParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .name("Model risk assessment 2026")
                .storageUri("s3://openlayer-evidence/evidence.pdf")
                .text("text")
                .url("https://openlayer.com/evidence")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("Model risk assessment 2026")
        assertThat(body.storageUri()).contains("s3://openlayer-evidence/evidence.pdf")
        assertThat(body.text()).contains("text")
        assertThat(body.url()).contains("https://openlayer.com/evidence")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleResultCreateEvidenceParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
