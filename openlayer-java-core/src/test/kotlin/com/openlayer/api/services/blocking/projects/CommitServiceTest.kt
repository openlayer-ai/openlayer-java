// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CommitServiceTest {

    @Test
    fun callCreate() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commitService = client.projects().commits()
        val projectCommitCreateResponse =
            commitService.create(
                ProjectCommitCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .commit(
                        ProjectCommitCreateParams.Commit.builder()
                            .message("Updated the prompt.")
                            .build()
                    )
                    .storageUri("s3://...")
                    .archived(false)
                    .deploymentStatus("Deployed")
                    .build()
            )
        println(projectCommitCreateResponse)
        projectCommitCreateResponse.validate()
    }

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
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )
        println(projectCommitListResponse)
        projectCommitListResponse.validate()
    }
}
