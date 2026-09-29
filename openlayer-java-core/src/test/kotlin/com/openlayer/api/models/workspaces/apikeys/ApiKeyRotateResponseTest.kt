// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRotateResponseTest {

    @Test
    fun create() {
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyRotateResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        assertThat(apiKeyRotateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyRotateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRotateResponse.dateLastUsed())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRotateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRotateResponse.secureKey()).isEqualTo("sk-o...5PW0")
        assertThat(apiKeyRotateResponse.status()).isEqualTo(ApiKeyRotateResponse.Status.ACTIVE)
        assertThat(apiKeyRotateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
        assertThat(apiKeyRotateResponse.lastRotatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRotateResponse.name()).contains("Secret Key")
        assertThat(apiKeyRotateResponse.previousKeyExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyRotateResponse.secret()).contains("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyRotateResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        val roundtrippedApiKeyRotateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRotateResponse),
                jacksonTypeRef<ApiKeyRotateResponse>(),
            )

        assertThat(roundtrippedApiKeyRotateResponse).isEqualTo(apiKeyRotateResponse)
    }
}
