// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListResponseTest {

    @Test
    fun create() {
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyListResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        assertThat(apiKeyListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyListResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.dateLastUsed())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.secureKey()).isEqualTo("sk-o...5PW0")
        assertThat(apiKeyListResponse.status()).isEqualTo(ApiKeyListResponse.Status.ACTIVE)
        assertThat(apiKeyListResponse.expiresAt())
            .contains(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
        assertThat(apiKeyListResponse.lastRotatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.name()).contains("Secret Key")
        assertThat(apiKeyListResponse.previousKeyExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.secret()).contains("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyListResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        val roundtrippedApiKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyListResponse),
                jacksonTypeRef<ApiKeyListResponse>(),
            )

        assertThat(roundtrippedApiKeyListResponse).isEqualTo(apiKeyListResponse)
    }
}
