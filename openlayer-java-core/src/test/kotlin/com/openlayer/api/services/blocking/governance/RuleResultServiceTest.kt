// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListParams
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleResultServiceTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultService = client.governance().ruleResults()

        val ruleResult = ruleResultService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        ruleResult.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultService = client.governance().ruleResults()

        val ruleResult =
            ruleResultService.update(
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

        ruleResult.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultService = client.governance().ruleResults()

        val ruleResults =
            ruleResultService.list(
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

        ruleResults.validate()
    }

    @Test
    fun createEvidence() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultService = client.governance().ruleResults()

        val response =
            ruleResultService.createEvidence(
                RuleResultCreateEvidenceParams.builder()
                    .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .name("Model risk assessment 2026")
                    .storageUri("s3://openlayer-evidence/evidence.pdf")
                    .text("text")
                    .url("https://openlayer.com/evidence")
                    .build()
            )

        response.validate()
    }

    @Test
    fun listEvidence() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleResultService = client.governance().ruleResults()

        val response =
            ruleResultService.listEvidence(
                RuleResultListEvidenceParams.builder()
                    .ruleResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        response.validate()
    }
}
