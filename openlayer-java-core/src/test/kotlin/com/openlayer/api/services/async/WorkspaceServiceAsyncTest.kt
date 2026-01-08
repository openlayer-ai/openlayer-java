// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.workspaces.WorkspaceUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkspaceServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture = workspaceServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val workspace = workspaceFuture.get()
        workspace.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workspaceServiceAsync = client.workspaces()

        val workspaceFuture =
            workspaceServiceAsync.update(
                WorkspaceUpdateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inviteCode("inviteCode")
                    .name("Openlayer")
                    .slug("openlayer")
                    .build()
            )

        val workspace = workspaceFuture.get()
        workspace.validate()
    }
}
