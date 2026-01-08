// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.invites

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteCreateResponseTest {

    @Test
    fun create() {
        val inviteCreateResponse =
            InviteCreateResponse.builder()
                .addItem(
                    InviteCreateResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .creator(
                            InviteCreateResponse.Item.Creator.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("Rishab Ramanathan")
                                .username("user123")
                                .build()
                        )
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("user@email.com")
                        .role(InviteCreateResponse.Item.Role.ADMIN)
                        .status(InviteCreateResponse.Item.Status.ACCEPTED)
                        .workspace(
                            InviteCreateResponse.Item.Workspace.builder()
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

        assertThat(inviteCreateResponse.items())
            .containsExactly(
                InviteCreateResponse.Item.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creator(
                        InviteCreateResponse.Item.Creator.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("Rishab Ramanathan")
                            .username("user123")
                            .build()
                    )
                    .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("user@email.com")
                    .role(InviteCreateResponse.Item.Role.ADMIN)
                    .status(InviteCreateResponse.Item.Status.ACCEPTED)
                    .workspace(
                        InviteCreateResponse.Item.Workspace.builder()
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
        val inviteCreateResponse =
            InviteCreateResponse.builder()
                .addItem(
                    InviteCreateResponse.Item.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .creator(
                            InviteCreateResponse.Item.Creator.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("Rishab Ramanathan")
                                .username("user123")
                                .build()
                        )
                        .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("user@email.com")
                        .role(InviteCreateResponse.Item.Role.ADMIN)
                        .status(InviteCreateResponse.Item.Status.ACCEPTED)
                        .workspace(
                            InviteCreateResponse.Item.Workspace.builder()
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

        val roundtrippedInviteCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inviteCreateResponse),
                jacksonTypeRef<InviteCreateResponse>(),
            )

        assertThat(roundtrippedInviteCreateResponse).isEqualTo(inviteCreateResponse)
    }
}
