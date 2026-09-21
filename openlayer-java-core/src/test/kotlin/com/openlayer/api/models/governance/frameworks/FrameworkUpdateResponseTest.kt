// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkUpdateResponseTest {

    @Test
    fun create() {
        val frameworkUpdateResponse =
            FrameworkUpdateResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkUpdateResponse.Avatar.builder()
                        .type(FrameworkUpdateResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkUpdateResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkUpdateResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkUpdateResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkUpdateResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkUpdateResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkUpdateResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkUpdateResponse.RuleStats.RuleResults.builder()
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

        assertThat(frameworkUpdateResponse.id()).isEqualTo("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
        assertThat(frameworkUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkUpdateResponse.enabled()).isEqualTo(true)
        assertThat(frameworkUpdateResponse.name()).isEqualTo("EU AI Act")
        assertThat(frameworkUpdateResponse.tags()).containsExactly("regulation", "eu")
        assertThat(frameworkUpdateResponse.workspaceId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(frameworkUpdateResponse.avatar())
            .contains(
                FrameworkUpdateResponse.Avatar.builder()
                    .type(FrameworkUpdateResponse.Avatar.Type.EMOJI)
                    .value("🧭")
                    .build()
            )
        assertThat(frameworkUpdateResponse.builtInSlug()).contains("eu_ai_act")
        assertThat(frameworkUpdateResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(frameworkUpdateResponse.description())
            .contains("Requirements for high-risk AI systems under the EU AI Act.")
        assertThat(frameworkUpdateResponse.extendedDescription())
            .contains(
                FrameworkUpdateResponse.ExtendedDescription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(frameworkUpdateResponse.href()).contains("href")
        assertThat(frameworkUpdateResponse.immutable()).contains(true)
        assertThat(frameworkUpdateResponse.projectSelector())
            .contains(
                FrameworkUpdateResponse.ProjectSelector.builder()
                    .addMatch(
                        FrameworkUpdateResponse.ProjectSelector.Match.builder()
                            .property(
                                FrameworkUpdateResponse.ProjectSelector.Match.Property.RISK_LEVEL
                            )
                            .value(JsonValue.from(listOf("high", "critical")))
                            .operator("operator")
                            .build()
                    )
                    .build()
            )
        assertThat(frameworkUpdateResponse.ruleStats())
            .contains(
                FrameworkUpdateResponse.RuleStats.builder()
                    .projectCompletion(
                        FrameworkUpdateResponse.RuleStats.ProjectCompletion.builder()
                            .high(0L)
                            .low(0L)
                            .mid(0L)
                            .build()
                    )
                    .ruleResults(
                        FrameworkUpdateResponse.RuleStats.RuleResults.builder()
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
        val frameworkUpdateResponse =
            FrameworkUpdateResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkUpdateResponse.Avatar.builder()
                        .type(FrameworkUpdateResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkUpdateResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkUpdateResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkUpdateResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkUpdateResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkUpdateResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkUpdateResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkUpdateResponse.RuleStats.RuleResults.builder()
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

        val roundtrippedFrameworkUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkUpdateResponse),
                jacksonTypeRef<FrameworkUpdateResponse>(),
            )

        assertThat(roundtrippedFrameworkUpdateResponse).isEqualTo(frameworkUpdateResponse)
    }
}
