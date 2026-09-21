// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultUpdateResponseTest {

    @Test
    fun create() {
        val ruleResultUpdateResponse =
            RuleResultUpdateResponse.builder()
                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .deactivated(true)
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(RuleResultUpdateResponse.Status.PASSING)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBlockedBy(
                    RuleResultUpdateResponse.BlockedBy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateResponse.BlockedBy.Status.PASSING)
                        .build()
                )
                .addBlocking(
                    RuleResultUpdateResponse.Blocking.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateResponse.Blocking.Status.PASSING)
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

        assertThat(ruleResultUpdateResponse.id()).isEqualTo("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
        assertThat(ruleResultUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultUpdateResponse.deactivated()).isEqualTo(true)
        assertThat(ruleResultUpdateResponse.ruleId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultUpdateResponse.status())
            .isEqualTo(RuleResultUpdateResponse.Status.PASSING)
        assertThat(ruleResultUpdateResponse.workspaceId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultUpdateResponse.assigneeId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultUpdateResponse.blockedBy().getOrNull())
            .containsExactly(
                RuleResultUpdateResponse.BlockedBy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateResponse.BlockedBy.Status.PASSING)
                    .build()
            )
        assertThat(ruleResultUpdateResponse.blocking().getOrNull())
            .containsExactly(
                RuleResultUpdateResponse.Blocking.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateResponse.Blocking.Status.PASSING)
                    .build()
            )
        assertThat(ruleResultUpdateResponse.dateLastEvaluated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultUpdateResponse.dateOfLatestEvidence())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultUpdateResponse.dateOfNextEvaluation())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultUpdateResponse.dateOfRenewal())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultUpdateResponse.deactivatedReason()).contains("deactivatedReason")
        assertThat(ruleResultUpdateResponse.projectId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultUpdateResponse.statusMessage()).contains("statusMessage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleResultUpdateResponse =
            RuleResultUpdateResponse.builder()
                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .deactivated(true)
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(RuleResultUpdateResponse.Status.PASSING)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBlockedBy(
                    RuleResultUpdateResponse.BlockedBy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateResponse.BlockedBy.Status.PASSING)
                        .build()
                )
                .addBlocking(
                    RuleResultUpdateResponse.Blocking.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateResponse.Blocking.Status.PASSING)
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

        val roundtrippedRuleResultUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleResultUpdateResponse),
                jacksonTypeRef<RuleResultUpdateResponse>(),
            )

        assertThat(roundtrippedRuleResultUpdateResponse).isEqualTo(ruleResultUpdateResponse)
    }
}
