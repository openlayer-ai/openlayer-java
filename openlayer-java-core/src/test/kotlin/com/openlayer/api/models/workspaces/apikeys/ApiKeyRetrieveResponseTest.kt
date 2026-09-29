// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRetrieveResponseTest {

    @Test
    fun create() {
        val apiKeyRetrieveResponse =
            ApiKeyRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyRetrieveResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        assertThat(apiKeyRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRetrieveResponse.dateLastUsed())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRetrieveResponse.secureKey()).isEqualTo("sk-o...5PW0")
        assertThat(apiKeyRetrieveResponse.status()).isEqualTo(ApiKeyRetrieveResponse.Status.ACTIVE)
        assertThat(apiKeyRetrieveResponse.expiresAt())
            .contains(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
        assertThat(apiKeyRetrieveResponse.lastRotatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRetrieveResponse.name()).contains("Secret Key")
        assertThat(apiKeyRetrieveResponse.previousKeyExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRetrieveResponse.secret()).contains("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRetrieveResponse =
            ApiKeyRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyRetrieveResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        val roundtrippedApiKeyRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRetrieveResponse),
                jacksonTypeRef<ApiKeyRetrieveResponse>(),
            )

        assertThat(roundtrippedApiKeyRetrieveResponse).isEqualTo(apiKeyRetrieveResponse)
    }
}
