// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

import com.openlayer.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleCreateParamsTest {

    @Test
    fun create() {
        RuleCreateParams.builder()
            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("Monitoring enabled")
            .scope(RuleCreateParams.Scope.PROJECT)
            .type(RuleCreateParams.Type.PLATFORM)
            .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .automationParams(
                RuleCreateParams.AutomationParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .automationType("monitoring_mode_enabled")
            .deactivated(true)
            .description("Each project must have Openlayer monitoring mode enabled.")
            .evidenceType(RuleCreateParams.EvidenceType.DOCUMENT)
            .renewalCadenceDays(90L)
            .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("Monitoring enabled")
                .scope(RuleCreateParams.Scope.PROJECT)
                .type(RuleCreateParams.Type.PLATFORM)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RuleCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("Monitoring enabled")
                .scope(RuleCreateParams.Scope.PROJECT)
                .type(RuleCreateParams.Type.PLATFORM)
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .automationParams(
                    RuleCreateParams.AutomationParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .automationType("monitoring_mode_enabled")
                .deactivated(true)
                .description("Each project must have Openlayer monitoring mode enabled.")
                .evidenceType(RuleCreateParams.EvidenceType.DOCUMENT)
                .renewalCadenceDays(90L)
                .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Monitoring enabled")
        assertThat(body.scope()).isEqualTo(RuleCreateParams.Scope.PROJECT)
        assertThat(body.type()).isEqualTo(RuleCreateParams.Type.PLATFORM)
        assertThat(body.assigneeId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.automationParams())
            .contains(
                RuleCreateParams.AutomationParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.automationType()).contains("monitoring_mode_enabled")
        assertThat(body.deactivated()).contains(true)
        assertThat(body.description())
            .contains("Each project must have Openlayer monitoring mode enabled.")
        assertThat(body.evidenceType()).contains(RuleCreateParams.EvidenceType.DOCUMENT)
        assertThat(body.renewalCadenceDays()).contains(90L)
        assertThat(body.tagIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleCreateParams.builder()
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("Monitoring enabled")
                .scope(RuleCreateParams.Scope.PROJECT)
                .type(RuleCreateParams.Type.PLATFORM)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Monitoring enabled")
        assertThat(body.scope()).isEqualTo(RuleCreateParams.Scope.PROJECT)
        assertThat(body.type()).isEqualTo(RuleCreateParams.Type.PLATFORM)
    }
}
