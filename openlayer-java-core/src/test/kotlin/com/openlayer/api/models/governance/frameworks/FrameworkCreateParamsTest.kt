// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.openlayer.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkCreateParamsTest {

    @Test
    fun create() {
        FrameworkCreateParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("EU AI Act")
            .description("Requirements for high-risk AI systems under the EU AI Act.")
            .enabled(true)
            .projectSelector(
                FrameworkCreateParams.ProjectSelector.builder()
                    .addMatch(
                        FrameworkCreateParams.ProjectSelector.Match.builder()
                            .property(
                                FrameworkCreateParams.ProjectSelector.Match.Property.RISK_LEVEL
                            )
                            .value(JsonValue.from(listOf("high", "critical")))
                            .operator("operator")
                            .build()
                    )
                    .build()
            )
            .addTag("regulation")
            .addTag("eu")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FrameworkCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("EU AI Act")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FrameworkCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("EU AI Act")
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .enabled(true)
                .projectSelector(
                    FrameworkCreateParams.ProjectSelector.builder()
                        .addMatch(
                            FrameworkCreateParams.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkCreateParams.ProjectSelector.Match.Property.RISK_LEVEL
                                )
                                .value(JsonValue.from(listOf("high", "critical")))
                                .operator("operator")
                                .build()
                        )
                        .build()
                )
                .addTag("regulation")
                .addTag("eu")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("EU AI Act")
        assertThat(body.description())
            .contains("Requirements for high-risk AI systems under the EU AI Act.")
        assertThat(body.enabled()).contains(true)
        assertThat(body.projectSelector())
            .contains(
                FrameworkCreateParams.ProjectSelector.builder()
                    .addMatch(
                        FrameworkCreateParams.ProjectSelector.Match.builder()
                            .property(
                                FrameworkCreateParams.ProjectSelector.Match.Property.RISK_LEVEL
                            )
                            .value(JsonValue.from(listOf("high", "critical")))
                            .operator("operator")
                            .build()
                    )
                    .build()
            )
        assertThat(body.tags().getOrNull()).containsExactly("regulation", "eu")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FrameworkCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("EU AI Act")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("EU AI Act")
    }
}
