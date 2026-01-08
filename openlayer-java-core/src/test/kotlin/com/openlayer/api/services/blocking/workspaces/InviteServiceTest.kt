// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.workspaces.invites.InviteCreateParams
import com.openlayer.api.models.workspaces.invites.InviteListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InviteServiceTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inviteService = client.workspaces().invites()

        val invite =
            inviteService.create(
                InviteCreateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEmail("user@email.com")
                    .role(InviteCreateParams.Role.ADMIN)
                    .build()
            )

        invite.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inviteService = client.workspaces().invites()

        val invites =
            inviteService.list(
                InviteListParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        invites.validate()
    }
}
