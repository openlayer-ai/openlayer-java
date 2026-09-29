// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyUpdateResponseTest {

    @Test
    fun create() {
        val apiKeyUpdateResponse =
            ApiKeyUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyUpdateResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        assertThat(apiKeyUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(apiKeyUpdateResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyUpdateResponse.dateLastUsed())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyUpdateResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyUpdateResponse.secureKey()).isEqualTo("sk-o...5PW0")
        assertThat(apiKeyUpdateResponse.status()).isEqualTo(ApiKeyUpdateResponse.Status.ACTIVE)
        assertThat(apiKeyUpdateResponse.expiresAt())
            .contains(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
        assertThat(apiKeyUpdateResponse.lastRotatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyUpdateResponse.name()).contains("Secret Key")
        assertThat(apiKeyUpdateResponse.previousKeyExpiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyUpdateResponse.secret()).contains("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyUpdateResponse =
            ApiKeyUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateLastUsed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secureKey("sk-o...5PW0")
                .status(ApiKeyUpdateResponse.Status.ACTIVE)
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .lastRotatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("Secret Key")
                .previousKeyExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .secret("sk-ol-Xq3v9Rk2mPz8TnW4yL7bC1dF5hJ6")
                .build()

        val roundtrippedApiKeyUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyUpdateResponse),
                jacksonTypeRef<ApiKeyUpdateResponse>(),
            )

        assertThat(roundtrippedApiKeyUpdateResponse).isEqualTo(apiKeyUpdateResponse)
    }
}
