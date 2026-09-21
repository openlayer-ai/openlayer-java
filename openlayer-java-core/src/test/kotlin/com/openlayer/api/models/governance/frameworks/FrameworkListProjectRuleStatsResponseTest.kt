// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkListProjectRuleStatsResponseTest {

    @Test
    fun create() {
        val frameworkListProjectRuleStatsResponse =
            FrameworkListProjectRuleStatsResponse.builder()
                .addItem(
                    FrameworkListProjectRuleStatsResponse.Item.builder()
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("Customer chatbot")
                        .taskType("llm-base")
                        .total(0L)
                        .totalDueSoon(0L)
                        .totalError(0L)
                        .totalFailing(0L)
                        .totalPassing(0L)
                        .totalPending(0L)
                        .totalRunning(0L)
                        .totalSkipped(0L)
                        .byRuleType(
                            FrameworkListProjectRuleStatsResponse.Item.ByRuleType.builder()
                                .evidence(
                                    FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Evidence
                                        .builder()
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
                                .platform(
                                    FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Platform
                                        .builder()
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

        assertThat(frameworkListProjectRuleStatsResponse.items())
            .containsExactly(
                FrameworkListProjectRuleStatsResponse.Item.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectName("Customer chatbot")
                    .taskType("llm-base")
                    .total(0L)
                    .totalDueSoon(0L)
                    .totalError(0L)
                    .totalFailing(0L)
                    .totalPassing(0L)
                    .totalPending(0L)
                    .totalRunning(0L)
                    .totalSkipped(0L)
                    .byRuleType(
                        FrameworkListProjectRuleStatsResponse.Item.ByRuleType.builder()
                            .evidence(
                                FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Evidence
                                    .builder()
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
                            .platform(
                                FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Platform
                                    .builder()
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
        val frameworkListProjectRuleStatsResponse =
            FrameworkListProjectRuleStatsResponse.builder()
                .addItem(
                    FrameworkListProjectRuleStatsResponse.Item.builder()
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .projectName("Customer chatbot")
                        .taskType("llm-base")
                        .total(0L)
                        .totalDueSoon(0L)
                        .totalError(0L)
                        .totalFailing(0L)
                        .totalPassing(0L)
                        .totalPending(0L)
                        .totalRunning(0L)
                        .totalSkipped(0L)
                        .byRuleType(
                            FrameworkListProjectRuleStatsResponse.Item.ByRuleType.builder()
                                .evidence(
                                    FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Evidence
                                        .builder()
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
                                .platform(
                                    FrameworkListProjectRuleStatsResponse.Item.ByRuleType.Platform
                                        .builder()
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

        val roundtrippedFrameworkListProjectRuleStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(frameworkListProjectRuleStatsResponse),
                jacksonTypeRef<FrameworkListProjectRuleStatsResponse>(),
            )

        assertThat(roundtrippedFrameworkListProjectRuleStatsResponse)
            .isEqualTo(frameworkListProjectRuleStatsResponse)
    }
}
