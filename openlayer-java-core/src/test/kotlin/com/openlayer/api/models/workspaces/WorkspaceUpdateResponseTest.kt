// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceUpdateResponseTest {

    @Test
    fun create() {
        val workspaceUpdateResponse =
            WorkspaceUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inviteCount(0L)
                .memberCount(0L)
                .name("Openlayer")
                .periodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .projectCount(0L)
                .slug("openlayer")
                .status(WorkspaceUpdateResponse.Status.ACTIVE)
                .inviteCode("inviteCode")
                .addMonthlyUsage(
                    WorkspaceUpdateResponse.MonthlyUsage.builder()
                        .executionTimeMs(0L)
                        .monthYear(LocalDate.parse("2019-12-27"))
                        .predictionCount(0L)
                        .build()
                )
                .samlOnlyAccess(true)
                .addWildcardDomain("string")
                .build()

        assertThat(workspaceUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceUpdateResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceUpdateResponse.inviteCount()).isEqualTo(0L)
        assertThat(workspaceUpdateResponse.memberCount()).isEqualTo(0L)
        assertThat(workspaceUpdateResponse.name()).isEqualTo("Openlayer")
        assertThat(workspaceUpdateResponse.periodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceUpdateResponse.periodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceUpdateResponse.projectCount()).isEqualTo(0L)
        assertThat(workspaceUpdateResponse.slug()).isEqualTo("openlayer")
        assertThat(workspaceUpdateResponse.status())
            .isEqualTo(WorkspaceUpdateResponse.Status.ACTIVE)
        assertThat(workspaceUpdateResponse.inviteCode()).contains("inviteCode")
        assertThat(workspaceUpdateResponse.monthlyUsage().getOrNull())
            .containsExactly(
                WorkspaceUpdateResponse.MonthlyUsage.builder()
                    .executionTimeMs(0L)
                    .monthYear(LocalDate.parse("2019-12-27"))
                    .predictionCount(0L)
                    .build()
            )
        assertThat(workspaceUpdateResponse.samlOnlyAccess()).contains(true)
        assertThat(workspaceUpdateResponse.wildcardDomains().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceUpdateResponse =
            WorkspaceUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inviteCount(0L)
                .memberCount(0L)
                .name("Openlayer")
                .periodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .projectCount(0L)
                .slug("openlayer")
                .status(WorkspaceUpdateResponse.Status.ACTIVE)
                .inviteCode("inviteCode")
                .addMonthlyUsage(
                    WorkspaceUpdateResponse.MonthlyUsage.builder()
                        .executionTimeMs(0L)
                        .monthYear(LocalDate.parse("2019-12-27"))
                        .predictionCount(0L)
                        .build()
                )
                .samlOnlyAccess(true)
                .addWildcardDomain("string")
                .build()

        val roundtrippedWorkspaceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceUpdateResponse),
                jacksonTypeRef<WorkspaceUpdateResponse>(),
            )

        assertThat(roundtrippedWorkspaceUpdateResponse).isEqualTo(workspaceUpdateResponse)
    }
}
