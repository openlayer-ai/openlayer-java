// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.*
import java.time.OffsetDateTime
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
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .fileSize(123L)
                            .message("Updated the prompt.")
                            .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .storageUri("s3://...")
                            .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .gitCommitRef("main")
                            .gitCommitSha(123L)
                            .gitCommitUrl("gitCommitUrl")
                            .build()
                    )
                    .storageUri("s3://...")
                    .archived(true)
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
                    .page(123L)
                    .perPage(100L)
                    .build()
            )
        println(projectCommitListResponse)
        projectCommitListResponse.validate()
    }
}
