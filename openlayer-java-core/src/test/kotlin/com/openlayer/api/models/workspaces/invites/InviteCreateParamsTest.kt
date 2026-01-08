// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.invites

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InviteCreateParamsTest {

    @Test
    fun create() {
        InviteCreateParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addEmail("user@email.com")
            .role(InviteCreateParams.Role.ADMIN)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InviteCreateParams.builder().workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InviteCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addEmail("user@email.com")
                .role(InviteCreateParams.Role.ADMIN)
                .build()

        val body = params._body()

        assertThat(body.emails().getOrNull()).containsExactly("user@email.com")
        assertThat(body.role()).contains(InviteCreateParams.Role.ADMIN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InviteCreateParams.builder().workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
