// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance.frameworks

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SectionServiceAsyncTest {

    @Test
    fun listRules() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sectionServiceAsync = client.governance().frameworks().sections()

        val responseFuture =
            sectionServiceAsync.listRules(
                SectionListRulesParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeResults(true)
                    .includeSubsectionRules(true)
                    .page(1L)
                    .perPage(1L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(SectionListRulesParams.Status.PASSING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
