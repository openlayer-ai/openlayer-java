// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.workspaces

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.workspaces.apikeys.ApiKeyCreateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyDeleteParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRetrieveParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyRotateParams
import com.openlayer.api.models.workspaces.apikeys.ApiKeyUpdateParams
import java.time.OffsetDateTime
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
                    .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                    .name("Secret Key")
                    .build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.retrieve(
                ApiKeyRetrieveParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.update(
                ApiKeyUpdateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("Secret Key")
                    .build()
            )

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val apiKeysFuture = apiKeyServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val apiKeys = apiKeysFuture.get()
        apiKeys.forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val future =
            apiKeyServiceAsync.delete(
                ApiKeyDeleteParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun rotate() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val apiKeyServiceAsync = client.workspaces().apiKeys()

        val responseFuture =
            apiKeyServiceAsync.rotate(
                ApiKeyRotateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                    .gracePeriodHours(24L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
