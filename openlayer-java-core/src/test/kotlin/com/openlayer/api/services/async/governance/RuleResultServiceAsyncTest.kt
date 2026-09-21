// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListParams
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleResultServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultServiceAsync = client.governance().ruleResults()

        val ruleResultFuture =
            ruleResultServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val ruleResult = ruleResultFuture.get()
        ruleResult.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultServiceAsync = client.governance().ruleResults()

        val ruleResultFuture =
            ruleResultServiceAsync.update(
                RuleResultUpdateParams.builder()
                    .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assigneeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addBlockedBy(
                        RuleResultUpdateParams.BlockedBy.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(RuleResultUpdateParams.BlockedBy.Status.PASSING)
                            .build()
                    )
                    .addBlocking(
                        RuleResultUpdateParams.Blocking.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(RuleResultUpdateParams.Blocking.Status.PASSING)
                            .build()
                    )
                    .deactivated(true)
                    .deactivatedReason("deactivatedReason")
                    .build()
            )

        val ruleResult = ruleResultFuture.get()
        ruleResult.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultServiceAsync = client.governance().ruleResults()

        val ruleResultsFuture =
            ruleResultServiceAsync.list(
                RuleResultListParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .enabledFrameworkOnly(true)
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeUnframed(true)
                    .page(1L)
                    .perPage(1L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scope(RuleResultListParams.Scope.PROJECT)
                    .searchQuery("searchQuery")
                    .status(RuleResultListParams.Status.PASSING)
                    .type(RuleResultListParams.Type.PLATFORM)
                    .build()
            )

        val ruleResults = ruleResultsFuture.get()
        ruleResults.validate()
    }

    @Test
    fun createEvidence() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultServiceAsync = client.governance().ruleResults()

        val responseFuture =
            ruleResultServiceAsync.createEvidence(
                RuleResultCreateEvidenceParams.builder()
                    .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("Model risk assessment 2026")
                    .storageUri("s3://openlayer-evidence/evidence.pdf")
                    .text("text")
                    .url("https://openlayer.com/evidence")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listEvidence() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultServiceAsync = client.governance().ruleResults()

        val responseFuture =
            ruleResultServiceAsync.listEvidence(
                RuleResultListEvidenceParams.builder()
                    .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
