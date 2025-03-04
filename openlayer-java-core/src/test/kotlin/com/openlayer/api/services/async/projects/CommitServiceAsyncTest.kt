// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.ProjectCommitCreateParams
import com.openlayer.api.models.ProjectCommitListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CommitServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commitServiceAsync = client.projects().commits()

        val commitFuture =
            commitServiceAsync.create(
                ProjectCommitCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .commit(
                        ProjectCommitCreateParams.Commit.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .authorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .fileSize(1024L)
                            .message("Updated the prompt.")
                            .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .storageUri("s3://...")
                            .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .gitCommitRef("main")
                            .gitCommitSha(0L)
                            .gitCommitUrl("gitCommitUrl")
                            .build()
                    )
                    .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .failingGoalCount(1L)
                    .mlModelId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .passingGoalCount(5L)
                    .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(ProjectCommitCreateParams.Status.QUEUED)
                    .statusMessage("Commit successfully processed.")
                    .storageUri("s3://...")
                    .totalGoalCount(6L)
                    .trainingDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .validationDatasetId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .archived(false)
                    .deploymentStatus("Deployed")
                    .links(
                        ProjectCommitCreateParams.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .build()
            )

        val commit = commitFuture.get()
        commit.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val commitServiceAsync = client.projects().commits()

        val commitFuture =
            commitServiceAsync.list(
                ProjectCommitListParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val commit = commitFuture.get()
        commit.validate()
    }
}
