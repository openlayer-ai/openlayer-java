// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.create(
                ApiKeyCreateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("Secret Key")
                    .build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }
}
