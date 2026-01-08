// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.workspaces.invites.InviteCreateParams
import com.openlayer.api.models.workspaces.invites.InviteListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InviteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inviteServiceAsync = client.workspaces().invites()

        val inviteFuture =
            inviteServiceAsync.create(
                InviteCreateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addEmail("user@email.com")
                    .role(InviteCreateParams.Role.ADMIN)
                    .build()
            )

        val invite = inviteFuture.get()
        invite.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inviteServiceAsync = client.workspaces().invites()

        val invitesFuture =
            inviteServiceAsync.list(
                InviteListParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val invites = invitesFuture.get()
        invites.validate()
    }
}
