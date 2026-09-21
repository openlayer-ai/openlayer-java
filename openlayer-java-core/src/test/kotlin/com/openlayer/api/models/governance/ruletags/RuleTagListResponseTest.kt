// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruletags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleTagListResponseTest {

    @Test
    fun create() {
        val ruleTagListResponse =
            RuleTagListResponse.builder()
                .addItem(
                    RuleTagListResponse.Item.builder()
                        .id("6e8a0c2d-4f5b-4a3c-9d7e-8f0a1b2c3d4e")
                        .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .immutable(true)
                        .name("Evaluation")
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .color("color")
                        .build()
                )
                .build()

        assertThat(ruleTagListResponse.items())
            .containsExactly(
                RuleTagListResponse.Item.builder()
                    .id("6e8a0c2d-4f5b-4a3c-9d7e-8f0a1b2c3d4e")
                    .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .immutable(true)
                    .name("Evaluation")
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .color("color")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleTagListResponse =
            RuleTagListResponse.builder()
                .addItem(
                    RuleTagListResponse.Item.builder()
                        .id("6e8a0c2d-4f5b-4a3c-9d7e-8f0a1b2c3d4e")
                        .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .immutable(true)
                        .name("Evaluation")
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .color("color")
                        .build()
                )
                .build()

        val roundtrippedRuleTagListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleTagListResponse),
                jacksonTypeRef<RuleTagListResponse>(),
            )

        assertThat(roundtrippedRuleTagListResponse).isEqualTo(ruleTagListResponse)
    }
}
