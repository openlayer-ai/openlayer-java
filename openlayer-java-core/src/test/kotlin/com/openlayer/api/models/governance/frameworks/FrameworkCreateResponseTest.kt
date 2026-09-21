// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkCreateResponseTest {

    @Test
    fun create() {
        val frameworkCreateResponse =
            FrameworkCreateResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkCreateResponse.Avatar.builder()
                        .type(FrameworkCreateResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkCreateResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkCreateResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkCreateResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkCreateResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkCreateResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkCreateResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkCreateResponse.RuleStats.RuleResults.builder()
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

        assertThat(frameworkCreateResponse.id()).isEqualTo("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
        assertThat(frameworkCreateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkCreateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkCreateResponse.enabled()).isEqualTo(true)
        assertThat(frameworkCreateResponse.name()).isEqualTo("EU AI Act")
        assertThat(frameworkCreateResponse.tags()).containsExactly("regulation", "eu")
        assertThat(frameworkCreateResponse.workspaceId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(frameworkCreateResponse.avatar())
            .contains(
                FrameworkCreateResponse.Avatar.builder()
                    .type(FrameworkCreateResponse.Avatar.Type.EMOJI)
                    .value("🧭")
                    .build()
            )
        assertThat(frameworkCreateResponse.builtInSlug()).contains("eu_ai_act")
        assertThat(frameworkCreateResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(frameworkCreateResponse.description())
            .contains("Requirements for high-risk AI systems under the EU AI Act.")
        assertThat(frameworkCreateResponse.extendedDescription())
            .contains(
                FrameworkCreateResponse.ExtendedDescription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(frameworkCreateResponse.href()).contains("href")
        assertThat(frameworkCreateResponse.immutable()).contains(true)
        assertThat(frameworkCreateResponse.projectSelector())
            .contains(
                FrameworkCreateResponse.ProjectSelector.builder()
                    .addMatch(
                        FrameworkCreateResponse.ProjectSelector.Match.builder()
                            .property(
                                FrameworkCreateResponse.ProjectSelector.Match.Property.RISK_LEVEL
                            )
                            .value(JsonValue.from(listOf("high", "critical")))
                            .operator("operator")
                            .build()
                    )
                    .build()
            )
        assertThat(frameworkCreateResponse.ruleStats())
            .contains(
                FrameworkCreateResponse.RuleStats.builder()
                    .projectCompletion(
                        FrameworkCreateResponse.RuleStats.ProjectCompletion.builder()
                            .high(0L)
                            .low(0L)
                            .mid(0L)
                            .build()
                    )
                    .ruleResults(
                        FrameworkCreateResponse.RuleStats.RuleResults.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val frameworkCreateResponse =
            FrameworkCreateResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkCreateResponse.Avatar.builder()
                        .type(FrameworkCreateResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkCreateResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkCreateResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkCreateResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkCreateResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkCreateResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkCreateResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkCreateResponse.RuleStats.RuleResults.builder()
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

        val roundtrippedFrameworkCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkCreateResponse),
                jacksonTypeRef<FrameworkCreateResponse>(),
            )

        assertThat(roundtrippedFrameworkCreateResponse).isEqualTo(frameworkCreateResponse)
    }
}
