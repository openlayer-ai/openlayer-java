// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkListRulesResponseTest {

    @Test
    fun create() {
        val frameworkListRulesResponse =
            FrameworkListRulesResponse.builder()
                .addItem(
                    FrameworkListRulesResponse.Item.builder()
                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .name("Monitoring enabled")
                        .scope(FrameworkListRulesResponse.Item.Scope.PROJECT)
                        .type(FrameworkListRulesResponse.Item.Type.PLATFORM)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .automationParams(
                            FrameworkListRulesResponse.Item.AutomationParams.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .automationType("monitoring_mode_enabled")
                        .deactivated(true)
                        .description("Each project must have Openlayer monitoring mode enabled.")
                        .evidenceType(FrameworkListRulesResponse.Item.EvidenceType.DOCUMENT)
                        .addFramework(
                            FrameworkListRulesResponse.Item.Framework.builder()
                                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                                .avatar(
                                    FrameworkListRulesResponse.Item.Framework.Avatar.builder()
                                        .type(
                                            FrameworkListRulesResponse.Item.Framework.Avatar.Type
                                                .EMOJI
                                        )
                                        .value("🧭")
                                        .build()
                                )
                                .builtInSlug("eu_ai_act")
                                .enabled(true)
                                .name("EU AI Act")
                                .build()
                        )
                        .immutable(true)
                        .renewalCadenceDays(90L)
                        .addResult(
                            FrameworkListRulesResponse.Item.Result.builder()
                                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .deactivated(true)
                                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(FrameworkListRulesResponse.Item.Result.Status.PASSING)
                                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addBlockedBy(
                                    FrameworkListRulesResponse.Item.Result.BlockedBy.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .status(
                                            FrameworkListRulesResponse.Item.Result.BlockedBy.Status
                                                .PASSING
                                        )
                                        .build()
                                )
                                .addBlocking(
                                    FrameworkListRulesResponse.Item.Result.Blocking.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .status(
                                            FrameworkListRulesResponse.Item.Result.Blocking.Status
                                                .PASSING
                                        )
                                        .build()
                                )
                                .dateLastEvaluated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .dateOfLatestEvidence(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .dateOfNextEvaluation(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .dateOfRenewal(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deactivatedReason("deactivatedReason")
                                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .statusMessage("statusMessage")
                                .build()
                        )
                        .resultsSummary(
                            FrameworkListRulesResponse.Item.ResultsSummary.builder()
                                .passing(0L)
                                .total(0L)
                                .build()
                        )
                        .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addTag(
                            FrameworkListRulesResponse.Item.Tag.builder()
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
                )
                .build()

        assertThat(frameworkListRulesResponse.items())
            .containsExactly(
                FrameworkListRulesResponse.Item.builder()
                    .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .name("Monitoring enabled")
                    .scope(FrameworkListRulesResponse.Item.Scope.PROJECT)
                    .type(FrameworkListRulesResponse.Item.Type.PLATFORM)
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .automationParams(
                        FrameworkListRulesResponse.Item.AutomationParams.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .automationType("monitoring_mode_enabled")
                    .deactivated(true)
                    .description("Each project must have Openlayer monitoring mode enabled.")
                    .evidenceType(FrameworkListRulesResponse.Item.EvidenceType.DOCUMENT)
                    .addFramework(
                        FrameworkListRulesResponse.Item.Framework.builder()
                            .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                            .avatar(
                                FrameworkListRulesResponse.Item.Framework.Avatar.builder()
                                    .type(
                                        FrameworkListRulesResponse.Item.Framework.Avatar.Type.EMOJI
                                    )
                                    .value("🧭")
                                    .build()
                            )
                            .builtInSlug("eu_ai_act")
                            .enabled(true)
                            .name("EU AI Act")
                            .build()
                    )
                    .immutable(true)
                    .renewalCadenceDays(90L)
                    .addResult(
                        FrameworkListRulesResponse.Item.Result.builder()
                            .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                            .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                            .deactivated(true)
                            .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(FrameworkListRulesResponse.Item.Result.Status.PASSING)
                            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addBlockedBy(
                                FrameworkListRulesResponse.Item.Result.BlockedBy.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .status(
                                        FrameworkListRulesResponse.Item.Result.BlockedBy.Status
                                            .PASSING
                                    )
                                    .build()
                            )
                            .addBlocking(
                                FrameworkListRulesResponse.Item.Result.Blocking.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .status(
                                        FrameworkListRulesResponse.Item.Result.Blocking.Status
                                            .PASSING
                                    )
                                    .build()
                            )
                            .dateLastEvaluated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateOfLatestEvidence(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateOfNextEvaluation(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateOfRenewal(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deactivatedReason("deactivatedReason")
                            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .statusMessage("statusMessage")
                            .build()
                    )
                    .resultsSummary(
                        FrameworkListRulesResponse.Item.ResultsSummary.builder()
                            .passing(0L)
                            .total(0L)
                            .build()
                    )
                    .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTag(
                        FrameworkListRulesResponse.Item.Tag.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val frameworkListRulesResponse =
            FrameworkListRulesResponse.builder()
                .addItem(
                    FrameworkListRulesResponse.Item.builder()
                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .name("Monitoring enabled")
                        .scope(FrameworkListRulesResponse.Item.Scope.PROJECT)
                        .type(FrameworkListRulesResponse.Item.Type.PLATFORM)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .automationParams(
                            FrameworkListRulesResponse.Item.AutomationParams.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .automationType("monitoring_mode_enabled")
                        .deactivated(true)
                        .description("Each project must have Openlayer monitoring mode enabled.")
                        .evidenceType(FrameworkListRulesResponse.Item.EvidenceType.DOCUMENT)
                        .addFramework(
                            FrameworkListRulesResponse.Item.Framework.builder()
                                .id("9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70")
                                .avatar(
                                    FrameworkListRulesResponse.Item.Framework.Avatar.builder()
                                        .type(
                                            FrameworkListRulesResponse.Item.Framework.Avatar.Type
                                                .EMOJI
                                        )
                                        .value("🧭")
                                        .build()
                                )
                                .builtInSlug("eu_ai_act")
                                .enabled(true)
                                .name("EU AI Act")
                                .build()
                        )
                        .immutable(true)
                        .renewalCadenceDays(90L)
                        .addResult(
                            FrameworkListRulesResponse.Item.Result.builder()
                                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .deactivated(true)
                                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(FrameworkListRulesResponse.Item.Result.Status.PASSING)
                                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addBlockedBy(
                                    FrameworkListRulesResponse.Item.Result.BlockedBy.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .status(
                                            FrameworkListRulesResponse.Item.Result.BlockedBy.Status
                                                .PASSING
                                        )
                                        .build()
                                )
                                .addBlocking(
                                    FrameworkListRulesResponse.Item.Result.Blocking.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .status(
                                            FrameworkListRulesResponse.Item.Result.Blocking.Status
                                                .PASSING
                                        )
                                        .build()
                                )
                                .dateLastEvaluated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .dateOfLatestEvidence(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .dateOfNextEvaluation(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .dateOfRenewal(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deactivatedReason("deactivatedReason")
                                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .statusMessage("statusMessage")
                                .build()
                        )
                        .resultsSummary(
                            FrameworkListRulesResponse.Item.ResultsSummary.builder()
                                .passing(0L)
                                .total(0L)
                                .build()
                        )
                        .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addTag(
                            FrameworkListRulesResponse.Item.Tag.builder()
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
                )
                .build()

        val roundtrippedFrameworkListRulesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkListRulesResponse),
                jacksonTypeRef<FrameworkListRulesResponse>(),
            )

        assertThat(roundtrippedFrameworkListRulesResponse).isEqualTo(frameworkListRulesResponse)
    }
}
