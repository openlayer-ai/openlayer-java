// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRotateParamsTest {

    @Test
    fun create() {
        ApiKeyRotateParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
            .gracePeriodHours(24L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ApiKeyRotateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ApiKeyRotateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .expiresAt(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
                .gracePeriodHours(24L)
                .build()

        val body = params._body()

        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2027-01-01T00:00:00Z"))
        assertThat(body.gracePeriodHours()).contains(24L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ApiKeyRotateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .apiKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
