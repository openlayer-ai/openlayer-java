// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultRetrieveResponseTest {

    @Test
    fun create() {
        val ruleResultRetrieveResponse =
            RuleResultRetrieveResponse.builder()
                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .deactivated(true)
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(RuleResultRetrieveResponse.Status.PASSING)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBlockedBy(
                    RuleResultRetrieveResponse.BlockedBy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultRetrieveResponse.BlockedBy.Status.PASSING)
                        .build()
                )
                .addBlocking(
                    RuleResultRetrieveResponse.Blocking.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultRetrieveResponse.Blocking.Status.PASSING)
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

        assertThat(ruleResultRetrieveResponse.id())
            .isEqualTo("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
        assertThat(ruleResultRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(ruleResultRetrieveResponse.deactivated()).isEqualTo(true)
        assertThat(ruleResultRetrieveResponse.ruleId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultRetrieveResponse.status())
            .isEqualTo(RuleResultRetrieveResponse.Status.PASSING)
        assertThat(ruleResultRetrieveResponse.workspaceId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultRetrieveResponse.assigneeId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultRetrieveResponse.blockedBy().getOrNull())
            .containsExactly(
                RuleResultRetrieveResponse.BlockedBy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultRetrieveResponse.BlockedBy.Status.PASSING)
                    .build()
            )
        assertThat(ruleResultRetrieveResponse.blocking().getOrNull())
            .containsExactly(
                RuleResultRetrieveResponse.Blocking.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultRetrieveResponse.Blocking.Status.PASSING)
                    .build()
            )
        assertThat(ruleResultRetrieveResponse.dateLastEvaluated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultRetrieveResponse.dateOfLatestEvidence())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultRetrieveResponse.dateOfNextEvaluation())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultRetrieveResponse.dateOfRenewal())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ruleResultRetrieveResponse.deactivatedReason()).contains("deactivatedReason")
        assertThat(ruleResultRetrieveResponse.projectId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ruleResultRetrieveResponse.statusMessage()).contains("statusMessage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleResultRetrieveResponse =
            RuleResultRetrieveResponse.builder()
                .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .deactivated(true)
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(RuleResultRetrieveResponse.Status.PASSING)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBlockedBy(
                    RuleResultRetrieveResponse.BlockedBy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultRetrieveResponse.BlockedBy.Status.PASSING)
                        .build()
                )
                .addBlocking(
                    RuleResultRetrieveResponse.Blocking.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultRetrieveResponse.Blocking.Status.PASSING)
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

        val roundtrippedRuleResultRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleResultRetrieveResponse),
                jacksonTypeRef<RuleResultRetrieveResponse>(),
            )

        assertThat(roundtrippedRuleResultRetrieveResponse).isEqualTo(ruleResultRetrieveResponse)
    }
}
