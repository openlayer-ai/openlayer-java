// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultListResponseTest {

    @Test
    fun create() {
        val ruleResultListResponse =
            RuleResultListResponse.builder()
                .addItem(
                    RuleResultListResponse.Item.builder()
                        .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .deactivated(true)
                        .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultListResponse.Item.Status.PASSING)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBlockedBy(
                            RuleResultListResponse.Item.BlockedBy.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(RuleResultListResponse.Item.BlockedBy.Status.PASSING)
                                .build()
                        )
                        .addBlocking(
                            RuleResultListResponse.Item.Blocking.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(RuleResultListResponse.Item.Blocking.Status.PASSING)
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
                .build()

        assertThat(ruleResultListResponse.items())
            .containsExactly(
                RuleResultListResponse.Item.builder()
                    .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .deactivated(true)
                    .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultListResponse.Item.Status.PASSING)
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBlockedBy(
                        RuleResultListResponse.Item.BlockedBy.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(RuleResultListResponse.Item.BlockedBy.Status.PASSING)
                            .build()
                    )
                    .addBlocking(
                        RuleResultListResponse.Item.Blocking.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(RuleResultListResponse.Item.Blocking.Status.PASSING)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ruleResultListResponse =
            RuleResultListResponse.builder()
                .addItem(
                    RuleResultListResponse.Item.builder()
                        .id("5b7d9f1a-2c3e-4d5f-8a6b-9c0d1e2f3a4b")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .deactivated(true)
                        .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultListResponse.Item.Status.PASSING)
                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addBlockedBy(
                            RuleResultListResponse.Item.BlockedBy.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(RuleResultListResponse.Item.BlockedBy.Status.PASSING)
                                .build()
                        )
                        .addBlocking(
                            RuleResultListResponse.Item.Blocking.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status(RuleResultListResponse.Item.Blocking.Status.PASSING)
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
                .build()

        val roundtrippedRuleResultListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ruleResultListResponse),
                jacksonTypeRef<RuleResultListResponse>(),
            )

        assertThat(roundtrippedRuleResultListResponse).isEqualTo(ruleResultListResponse)
    }
}
