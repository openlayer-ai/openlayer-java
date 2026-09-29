// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyDeleteParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRetrieveParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRotateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyUpdateParams
import java.time.OffsetDateTime
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
                    .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                    .name("Secret Key")
                    .build()
            )

        apiKey.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        val apiKey =
            apiKeyService.retrieve(
                ApiKeyRetrieveParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        apiKey.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        val apiKey =
            apiKeyService.update(
                ApiKeyUpdateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("Secret Key")
                    .build()
            )

        apiKey.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        val apiKeys = apiKeyService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        apiKeys.forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        apiKeyService.delete(
            ApiKeyDeleteParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Test
    fun rotate() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyService = client.workspaces().apiKeys()

        val response =
            apiKeyService.rotate(
                ApiKeyRotateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                    .gracePeriodHours(24L)
                    .build()
            )

        response.validate()
    }
}
