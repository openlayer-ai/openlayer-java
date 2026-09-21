// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.governance.rulestats.RuleStatRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RuleStatServiceTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ruleStatService = client.governance().ruleStats()

        val ruleStat =
            ruleStatService.retrieve(
                RuleStatRetrieveParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        ruleStat.validate()
    }
}
