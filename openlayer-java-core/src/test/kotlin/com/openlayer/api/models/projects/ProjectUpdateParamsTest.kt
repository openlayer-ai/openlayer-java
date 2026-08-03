// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectUpdateParamsTest {

    @Test
    fun create() {
        ProjectUpdateParams.builder()
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dataRetentionDays(30L)
            .description("My project description.")
            .modelDeveloper("Acme AI")
            .addModelType("llm")
            .name("My Project")
            .purpose("Answer customer billing questions.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectUpdateParams.builder()
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataRetentionDays(30L)
                .description("My project description.")
                .modelDeveloper("Acme AI")
                .addModelType("llm")
                .name("My Project")
                .purpose("Answer customer billing questions.")
                .build()

        val body = params._body()

        assertThat(body.dataRetentionDays()).contains(30L)
        assertThat(body.description()).contains("My project description.")
        assertThat(body.modelDeveloper()).contains("Acme AI")
        assertThat(body.modelTypes().getOrNull()).containsExactly("llm")
        assertThat(body.name()).contains("My Project")
        assertThat(body.purpose()).contains("Answer customer billing questions.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectUpdateParams.builder().projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
