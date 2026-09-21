// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultListEvidenceResponseTest {

    @Test
    fun create() {
        val ruleResultListEvidenceResponse =
            RuleResultListEvidenceResponse.builder()
                .addItem(
                    RuleResultListEvidenceResponse.Item.builder()
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
                )
                .build()

        assertThat(ruleResultListEvidenceResponse.items())
            .containsExactly(
                RuleResultListEvidenceResponse.Item.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleResultListEvidenceResponse =
            RuleResultListEvidenceResponse.builder()
                .addItem(
                    RuleResultListEvidenceResponse.Item.builder()
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
                )
                .build()

        val roundtrippedRuleResultListEvidenceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleResultListEvidenceResponse),
                jacksonTypeRef<RuleResultListEvidenceResponse>(),
            )

        assertThat(roundtrippedRuleResultListEvidenceResponse)
            .isEqualTo(ruleResultListEvidenceResponse)
    }
}
