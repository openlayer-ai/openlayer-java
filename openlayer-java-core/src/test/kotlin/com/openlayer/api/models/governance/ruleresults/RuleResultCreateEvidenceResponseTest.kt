// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultCreateEvidenceResponseTest {

    @Test
    fun create() {
        val ruleResultCreateEvidenceResponse =
            RuleResultCreateEvidenceResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .description("description")
                .name("Model risk assessment 2026")
                .storageUri("s3://openlayer-evidence/evidence.pdf")
                .text("text")
                .url("https://openlayer.com/evidence")
                .build()

        assertThat(ruleResultCreateEvidenceResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultCreateEvidenceResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultCreateEvidenceResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultCreateEvidenceResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultCreateEvidenceResponse.description()).contains("description")
        assertThat(ruleResultCreateEvidenceResponse.name()).contains("Model risk assessment 2026")
        assertThat(ruleResultCreateEvidenceResponse.storageUri())
            .contains("s3://openlayer-evidence/evidence.pdf")
        assertThat(ruleResultCreateEvidenceResponse.text()).contains("text")
        assertThat(ruleResultCreateEvidenceResponse.url())
            .contains("https://openlayer.com/evidence")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleResultCreateEvidenceResponse =
            RuleResultCreateEvidenceResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .description("description")
                .name("Model risk assessment 2026")
                .storageUri("s3://openlayer-evidence/evidence.pdf")
                .text("text")
                .url("https://openlayer.com/evidence")
                .build()

        val roundtrippedRuleResultCreateEvidenceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleResultCreateEvidenceResponse),
                jacksonTypeRef<RuleResultCreateEvidenceResponse>(),
            )

        assertThat(roundtrippedRuleResultCreateEvidenceResponse)
            .isEqualTo(ruleResultCreateEvidenceResponse)
    }
}
