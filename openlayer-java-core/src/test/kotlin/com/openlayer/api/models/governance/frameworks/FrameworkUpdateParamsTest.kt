// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.openlayer.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FrameworkUpdateParamsTest {

    @Test
    fun create() {
        FrameworkUpdateParams.builder()
            .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .avatar(
                FrameworkUpdateParams.Avatar.builder()
                    .type(FrameworkUpdateParams.Avatar.Type.EMOJI)
                    .value("🧭")
                    .build()
            )
            .description("Requirements for high-risk AI systems under the EU AI Act.")
            .enabled(true)
            .extendedDescription(
                FrameworkUpdateParams.ExtendedDescription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .href("href")
            .name("EU AI Act")
            .projectSelector(
                FrameworkUpdateParams.ProjectSelector.builder()
                    .addMatch(
                        FrameworkUpdateParams.ProjectSelector.Match.builder()
                            .property(
                                FrameworkUpdateParams.ProjectSelector.Match.Property.RISK_LEVEL
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
            FrameworkUpdateParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FrameworkUpdateParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .avatar(
                    FrameworkUpdateParams.Avatar.builder()
                        .type(FrameworkUpdateParams.Avatar.Type.EMOJI)
                        .value("🧭")
                        .build()
                )
                .description("Requirements for high-risk AI systems under the EU AI Act.")
                .enabled(true)
                .extendedDescription(
                    FrameworkUpdateParams.ExtendedDescription.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .href("href")
                .name("EU AI Act")
                .projectSelector(
                    FrameworkUpdateParams.ProjectSelector.builder()
                        .addMatch(
                            FrameworkUpdateParams.ProjectSelector.Match.builder()
                                .property(
                                    FrameworkUpdateParams.ProjectSelector.Match.Property.RISK_LEVEL
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

        assertThat(body.avatar())
            .contains(
                FrameworkUpdateParams.Avatar.builder()
                    .type(FrameworkUpdateParams.Avatar.Type.EMOJI)
                    .value("🧭")
                    .build()
            )
        assertThat(body.description())
            .contains("Requirements for high-risk AI systems under the EU AI Act.")
        assertThat(body.enabled()).contains(true)
        assertThat(body.extendedDescription())
            .contains(
                FrameworkUpdateParams.ExtendedDescription.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.href()).contains("href")
        assertThat(body.name()).contains("EU AI Act")
        assertThat(body.projectSelector())
            .contains(
                FrameworkUpdateParams.ProjectSelector.builder()
                    .addMatch(
                        FrameworkUpdateParams.ProjectSelector.Match.builder()
                            .property(
                                FrameworkUpdateParams.ProjectSelector.Match.Property.RISK_LEVEL
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
            FrameworkUpdateParams.builder()
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
