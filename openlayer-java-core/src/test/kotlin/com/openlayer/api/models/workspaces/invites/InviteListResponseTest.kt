// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.invites

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteListResponseTest {

    @Test
    fun create() {
        val inviteListResponse =
            InviteListResponse.builder()
                .addItem(
                    InviteListResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .creator(
                            InviteListResponse.Item.Creator.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("Rishab Ramanathan")
                                .username("user123")
                                .build()
                        )
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("user@email.com")
                        .role(InviteListResponse.Item.Role.ADMIN)
                        .status(InviteListResponse.Item.Status.ACCEPTED)
                        .workspace(
                            InviteListResponse.Item.Workspace.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .memberCount(0L)
                                .name("Openlayer")
                                .slug("openlayer")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(inviteListResponse.items())
            .containsExactly(
                InviteListResponse.Item.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creator(
                        InviteListResponse.Item.Creator.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("Rishab Ramanathan")
                            .username("user123")
                            .build()
                    )
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("user@email.com")
                    .role(InviteListResponse.Item.Role.ADMIN)
                    .status(InviteListResponse.Item.Status.ACCEPTED)
                    .workspace(
                        InviteListResponse.Item.Workspace.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .memberCount(0L)
                            .name("Openlayer")
                            .slug("openlayer")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inviteListResponse =
            InviteListResponse.builder()
                .addItem(
                    InviteListResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .creator(
                            InviteListResponse.Item.Creator.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("Rishab Ramanathan")
                                .username("user123")
                                .build()
                        )
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("user@email.com")
                        .role(InviteListResponse.Item.Role.ADMIN)
                        .status(InviteListResponse.Item.Status.ACCEPTED)
                        .workspace(
                            InviteListResponse.Item.Workspace.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .memberCount(0L)
                                .name("Openlayer")
                                .slug("openlayer")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedInviteListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inviteListResponse),
                jacksonTypeRef<InviteListResponse>(),
            )

        assertThat(roundtrippedInviteListResponse).isEqualTo(inviteListResponse)
    }
}
