// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkListResponseTest {

    @Test
    fun create() {
        val frameworkListResponse =
            FrameworkListResponse.builder()
                .addItem(
                    FrameworkListResponse.Item.builder()
                        .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .enabled(true)
                        .name("EU AI Act")
                        .addTag("regulation")
                        .addTag("eu")
                        .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .avatar(
                            FrameworkListResponse.Item.Avatar.builder()
                                .type(FrameworkListResponse.Item.Avatar.Type.EMOJI)
                                .value("🧭")
                                .build()
                        )
                        .builtInSlug("eu_ai_act")
                        .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("Requirements for high-risk AI systems under the EU AI Act.")
                        .extendedDescription(
                            FrameworkListResponse.Item.ExtendedDescription.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .href("href")
                        .immutable(true)
                        .projectSelector(
                            FrameworkListResponse.Item.ProjectSelector.builder()
                                .addMatch(
                                    FrameworkListResponse.Item.ProjectSelector.Match.builder()
                                        .property(
                                            FrameworkListResponse.Item.ProjectSelector.Match
                                                .Property
                                                .RISK_LEVEL
                                        )
                                        .value(JsonValue.from(listOf("high", "critical")))
                                        .operator("operator")
                                        .build()
                                )
                                .build()
                        )
                        .ruleStats(
                            FrameworkListResponse.Item.RuleStats.builder()
                                .projectCompletion(
                                    FrameworkListResponse.Item.RuleStats.ProjectCompletion.builder()
                                        .high(0L)
                                        .low(0L)
                                        .mid(0L)
                                        .build()
                                )
                                .ruleResults(
                                    FrameworkListResponse.Item.RuleStats.RuleResults.builder()
                                        .total(0L)
                                        .totalDueSoon(0L)
                                        .totalError(0L)
                                        .totalFailing(0L)
                                        .totalPassing(0L)
                                        .totalPending(0L)
                                        .totalRunning(0L)
                                        .totalSkipped(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(frameworkListResponse.items())
            .containsExactly(
                FrameworkListResponse.Item.builder()
                    .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .enabled(true)
                    .name("EU AI Act")
                    .addTag("regulation")
                    .addTag("eu")
                    .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .avatar(
                        FrameworkListResponse.Item.Avatar.builder()
                            .type(FrameworkListResponse.Item.Avatar.Type.EMOJI)
                            .value("🧭")
                            .build()
                    )
                    .builtInSlug("eu_ai_act")
                    .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("Requirements for high-risk AI systems under the EU AI Act.")
                    .extendedDescription(
                        FrameworkListResponse.Item.ExtendedDescription.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .href("href")
                    .immutable(true)
                    .projectSelector(
                        FrameworkListResponse.Item.ProjectSelector.builder()
                            .addMatch(
                                FrameworkListResponse.Item.ProjectSelector.Match.builder()
                                    .property(
                                        FrameworkListResponse.Item.ProjectSelector.Match.Property
                                            .RISK_LEVEL
                                    )
                                    .value(JsonValue.from(listOf("high", "critical")))
                                    .operator("operator")
                                    .build()
                            )
                            .build()
                    )
                    .ruleStats(
                        FrameworkListResponse.Item.RuleStats.builder()
                            .projectCompletion(
                                FrameworkListResponse.Item.RuleStats.ProjectCompletion.builder()
                                    .high(0L)
                                    .low(0L)
                                    .mid(0L)
                                    .build()
                            )
                            .ruleResults(
                                FrameworkListResponse.Item.RuleStats.RuleResults.builder()
                                    .total(0L)
                                    .totalDueSoon(0L)
                                    .totalError(0L)
                                    .totalFailing(0L)
                                    .totalPassing(0L)
                                    .totalPending(0L)
                                    .totalRunning(0L)
                                    .totalSkipped(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val frameworkListResponse =
            FrameworkListResponse.builder()
                .addItem(
                    FrameworkListResponse.Item.builder()
                        .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .enabled(true)
                        .name("EU AI Act")
                        .addTag("regulation")
                        .addTag("eu")
                        .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .avatar(
                            FrameworkListResponse.Item.Avatar.builder()
                                .type(FrameworkListResponse.Item.Avatar.Type.EMOJI)
                                .value("🧭")
                                .build()
                        )
                        .builtInSlug("eu_ai_act")
                        .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("Requirements for high-risk AI systems under the EU AI Act.")
                        .extendedDescription(
                            FrameworkListResponse.Item.ExtendedDescription.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .href("href")
                        .immutable(true)
                        .projectSelector(
                            FrameworkListResponse.Item.ProjectSelector.builder()
                                .addMatch(
                                    FrameworkListResponse.Item.ProjectSelector.Match.builder()
                                        .property(
                                            FrameworkListResponse.Item.ProjectSelector.Match
                                                .Property
                                                .RISK_LEVEL
                                        )
                                        .value(JsonValue.from(listOf("high", "critical")))
                                        .operator("operator")
                                        .build()
                                )
                                .build()
                        )
                        .ruleStats(
                            FrameworkListResponse.Item.RuleStats.builder()
                                .projectCompletion(
                                    FrameworkListResponse.Item.RuleStats.ProjectCompletion.builder()
                                        .high(0L)
                                        .low(0L)
                                        .mid(0L)
                                        .build()
                                )
                                .ruleResults(
                                    FrameworkListResponse.Item.RuleStats.RuleResults.builder()
                                        .total(0L)
                                        .totalDueSoon(0L)
                                        .totalError(0L)
                                        .totalFailing(0L)
                                        .totalPassing(0L)
                                        .totalPending(0L)
                                        .totalRunning(0L)
                                        .totalSkipped(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedFrameworkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkListResponse),
                jacksonTypeRef<FrameworkListResponse>(),
            )

        assertThat(roundtrippedFrameworkListResponse).isEqualTo(frameworkListResponse)
    }
}
