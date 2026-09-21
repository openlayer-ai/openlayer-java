// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleUpdateParamsTest {

    @Test
    fun create() {
        RuleUpdateParams.builder()
            .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .deactivated(true)
            .description("Each project must have Openlayer monitoring mode enabled.")
            .name("Monitoring enabled")
            .renewalCadenceDays(90L)
            .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleUpdateParams.builder().ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RuleUpdateParams.builder()
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .deactivated(true)
                .description("Each project must have Openlayer monitoring mode enabled.")
                .name("Monitoring enabled")
                .renewalCadenceDays(90L)
                .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.assigneeId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.deactivated()).contains(true)
        assertThat(body.description())
            .contains("Each project must have Openlayer monitoring mode enabled.")
        assertThat(body.name()).contains("Monitoring enabled")
        assertThat(body.renewalCadenceDays()).contains(90L)
        assertThat(body.tagIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuleUpdateParams.builder().ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
