// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.governance.rules.RuleCreateParams
import com.openlayer.api.models.governance.rules.RuleListParams
import com.openlayer.api.models.governance.rules.RuleUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleServiceAsync = client.governance().rules()

        val ruleFuture =
            ruleServiceAsync.create(
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
            )

        val rule = ruleFuture.get()
        rule.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleServiceAsync = client.governance().rules()

        val ruleFuture = ruleServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val rule = ruleFuture.get()
        rule.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleServiceAsync = client.governance().rules()

        val ruleFuture =
            ruleServiceAsync.update(
                RuleUpdateParams.builder()
                    .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deactivated(true)
                    .description("Each project must have Openlayer monitoring mode enabled.")
                    .name("Monitoring enabled")
                    .renewalCadenceDays(90L)
                    .addTagId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val rule = ruleFuture.get()
        rule.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleServiceAsync = client.governance().rules()

        val rulesFuture =
            ruleServiceAsync.list(
                RuleListParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .deactivated(true)
                    .enabledFrameworkOnly(true)
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .group(RuleListParams.Group.OPEN)
                    .includeResults(true)
                    .includeUnframed(true)
                    .page(1L)
                    .perPage(1L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scope(RuleListParams.Scope.PROJECT)
                    .searchQuery("searchQuery")
                    .sortBy(RuleListParams.SortBy.NAME)
                    .status(RuleListParams.Status.PASSING)
                    .addTag("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(RuleListParams.Type.PLATFORM)
                    .build()
            )

        val rules = rulesFuture.get()
        rules.validate()
    }

    @Test
    fun delete() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleServiceAsync = client.governance().rules()

        val future = ruleServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
