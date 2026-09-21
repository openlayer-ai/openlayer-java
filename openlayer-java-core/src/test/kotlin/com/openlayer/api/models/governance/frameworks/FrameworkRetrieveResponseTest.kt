// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkRetrieveResponseTest {

    @Test
    fun create() {
        val frameworkRetrieveResponse =
            FrameworkRetrieveResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkRetrieveResponse.Avatar.builder()
                        .type(FrameworkRetrieveResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkRetrieveResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkRetrieveResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkRetrieveResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkRetrieveResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkRetrieveResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkRetrieveResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkRetrieveResponse.RuleStats.RuleResults.builder()
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

        assertThat(frameworkRetrieveResponse.id()).isEqualTo("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
        assertThat(frameworkRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(frameworkRetrieveResponse.enabled()).isEqualTo(true)
        assertThat(frameworkRetrieveResponse.name()).isEqualTo("EU AI Act")
        assertThat(frameworkRetrieveResponse.tags()).containsExactly("regulation", "eu")
        assertThat(frameworkRetrieveResponse.workspaceId())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(frameworkRetrieveResponse.avatar())
            .contains(
                FrameworkRetrieveResponse.Avatar.builder()
                    .type(FrameworkRetrieveResponse.Avatar.Type.EMOJI)
                    .value("🧭")
                    .build()
            )
        assertThat(frameworkRetrieveResponse.builtInSlug()).contains("eu_ai_act")
        assertThat(frameworkRetrieveResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(frameworkRetrieveResponse.description())
            .contains("Requirements for high-risk AI systems under the EU AI Act.")
        assertThat(frameworkRetrieveResponse.extendedDescription())
            .contains(
                FrameworkRetrieveResponse.ExtendedDescription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(frameworkRetrieveResponse.href()).contains("href")
        assertThat(frameworkRetrieveResponse.immutable()).contains(true)
        assertThat(frameworkRetrieveResponse.projectSelector())
            .contains(
                FrameworkRetrieveResponse.ProjectSelector.builder()
                    .addMatch(
                        FrameworkRetrieveResponse.ProjectSelector.Match.builder()
                            .property(
                                FrameworkRetrieveResponse.ProjectSelector.Match.Property.RISK_LEVEL
                            )
                            .value(JsonValue.from(listOf("high", "critical")))
                            .operator("operator")
                            .build()
                    )
                    .build()
            )
        assertThat(frameworkRetrieveResponse.ruleStats())
            .contains(
                FrameworkRetrieveResponse.RuleStats.builder()
                    .projectCompletion(
                        FrameworkRetrieveResponse.RuleStats.ProjectCompletion.builder()
                            .high(0L)
                            .low(0L)
                            .mid(0L)
                            .build()
                    )
                    .ruleResults(
                        FrameworkRetrieveResponse.RuleStats.RuleResults.builder()
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
        val frameworkRetrieveResponse =
            FrameworkRetrieveResponse.builder()
                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .enabled(true)
                .name("EU AI Act")
                .addTag("regulation")
                .addTag("eu")
                .workspaceId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .avatar(
                    FrameworkRetrieveResponse.Avatar.builder()
                        .type(FrameworkRetrieveResponse.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .builtInSlug("eu_ai_act")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .extendedDescription(
                    FrameworkRetrieveResponse.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .immutable(true)
                .projectSelector(
                    FrameworkRetrieveResponse.ProjectSelector.builder()
                        .addMatch(
                            FrameworkRetrieveResponse.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkRetrieveResponse.ProjectSelector.Match.Property
                                        .RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .ruleStats(
                    FrameworkRetrieveResponse.RuleStats.builder()
                        .projectCompletion(
                            FrameworkRetrieveResponse.RuleStats.ProjectCompletion.builder()
                                .high(0L)
                                .low(0L)
                                .mid(0L)
                                .build()
                        )
                        .ruleResults(
                            FrameworkRetrieveResponse.RuleStats.RuleResults.builder()
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

        val roundtrippedFrameworkRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkRetrieveResponse),
                jacksonTypeRef<FrameworkRetrieveResponse>(),
            )

        assertThat(roundtrippedFrameworkRetrieveResponse).isEqualTo(frameworkRetrieveResponse)
    }
}
