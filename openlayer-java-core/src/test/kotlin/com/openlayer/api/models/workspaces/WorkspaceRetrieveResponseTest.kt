// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceRetrieveResponseTest {

    @Test
    fun create() {
        val workspaceRetrieveResponse =
            WorkspaceRetrieveResponse.builder()
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
                .status(WorkspaceRetrieveResponse.Status.ACTIVE)
                .addMonthlyUsage(
                    WorkspaceRetrieveResponse.MonthlyUsage.builder()
                        .executionTimeMs(0L)
                        .monthYear(LocalDate.parse("2019-12-27"))
                        .predictionCount(0L)
                        .build()
                )
                .samlOnlyAccess(true)
                .addWildcardDomain("string")
                .build()

        assertThat(workspaceRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceRetrieveResponse.creatorId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(workspaceRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceRetrieveResponse.inviteCount()).isEqualTo(0L)
        assertThat(workspaceRetrieveResponse.memberCount()).isEqualTo(0L)
        assertThat(workspaceRetrieveResponse.name()).isEqualTo("Openlayer")
        assertThat(workspaceRetrieveResponse.periodEndDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceRetrieveResponse.periodStartDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(workspaceRetrieveResponse.projectCount()).isEqualTo(0L)
        assertThat(workspaceRetrieveResponse.slug()).isEqualTo("openlayer")
        assertThat(workspaceRetrieveResponse.status())
            .isEqualTo(WorkspaceRetrieveResponse.Status.ACTIVE)
        assertThat(workspaceRetrieveResponse.monthlyUsage().getOrNull())
            .containsExactly(
                WorkspaceRetrieveResponse.MonthlyUsage.builder()
                    .executionTimeMs(0L)
                    .monthYear(LocalDate.parse("2019-12-27"))
                    .predictionCount(0L)
                    .build()
            )
        assertThat(workspaceRetrieveResponse.samlOnlyAccess()).contains(true)
        assertThat(workspaceRetrieveResponse.wildcardDomains().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceRetrieveResponse =
            WorkspaceRetrieveResponse.builder()
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
                .status(WorkspaceRetrieveResponse.Status.ACTIVE)
                .addMonthlyUsage(
                    WorkspaceRetrieveResponse.MonthlyUsage.builder()
                        .executionTimeMs(0L)
                        .monthYear(LocalDate.parse("2019-12-27"))
                        .predictionCount(0L)
                        .build()
                )
                .samlOnlyAccess(true)
                .addWildcardDomain("string")
                .build()

        val roundtrippedWorkspaceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceRetrieveResponse),
                jacksonTypeRef<WorkspaceRetrieveResponse>(),
            )

        assertThat(roundtrippedWorkspaceRetrieveResponse).isEqualTo(workspaceRetrieveResponse)
    }
}
