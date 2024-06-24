// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.projects

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openlayer.TestServerExtension
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.models.*

@ExtendWith(TestServerExtension::class)
class CommitServiceTest {

    @Test
    fun callList() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commitService = client.projects().commits()
        val projectCommitListResponse =
            commitService.list(
                ProjectCommitListParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(123L)
                    .perPage(100L)
                    .build()
            )
        println(projectCommitListResponse)
        projectCommitListResponse.validate()
    }
}
