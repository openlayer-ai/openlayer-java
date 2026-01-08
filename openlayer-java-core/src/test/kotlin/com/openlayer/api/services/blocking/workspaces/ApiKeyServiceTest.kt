// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        val apiKey =
            apiKeyService.create(
                ApiKeyCreateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("Secret Key")
                    .build()
            )

        apiKey.validate()
    }
}
