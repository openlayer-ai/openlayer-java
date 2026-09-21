// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleResultUpdateParamsTest {

    @Test
    fun create() {
        RuleResultUpdateParams.builder()
            .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addBlockedBy(
                RuleResultUpdateParams.BlockedBy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateParams.BlockedBy.Status.PASSING)
                    .build()
            )
            .addBlocking(
                RuleResultUpdateParams.Blocking.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateParams.Blocking.Status.PASSING)
                    .build()
            )
            .deactivated(true)
            .deactivatedReason("deactivatedReason")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleResultUpdateParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RuleResultUpdateParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBlockedBy(
                    RuleResultUpdateParams.BlockedBy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateParams.BlockedBy.Status.PASSING)
                        .build()
                )
                .addBlocking(
                    RuleResultUpdateParams.Blocking.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(RuleResultUpdateParams.Blocking.Status.PASSING)
                        .build()
                )
                .deactivated(true)
                .deactivatedReason("deactivatedReason")
                .build()

        val body = params._body()

        assertThat(body.assigneeId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.blockedBy().getOrNull())
            .containsExactly(
                RuleResultUpdateParams.BlockedBy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateParams.BlockedBy.Status.PASSING)
                    .build()
            )
        assertThat(body.blocking().getOrNull())
            .containsExactly(
                RuleResultUpdateParams.Blocking.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(RuleResultUpdateParams.Blocking.Status.PASSING)
                    .build()
            )
        assertThat(body.deactivated()).contains(true)
        assertThat(body.deactivatedReason()).contains("deactivatedReason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleResultUpdateParams.builder()
                .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
