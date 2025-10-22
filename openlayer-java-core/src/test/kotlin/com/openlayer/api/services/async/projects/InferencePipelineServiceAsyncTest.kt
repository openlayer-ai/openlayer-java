// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InferencePipelineServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineServiceAsync = client.projects().inferencePipelines()

        val inferencePipelineFuture =
            inferencePipelineServiceAsync.create(
                InferencePipelineCreateParams.builder()
                    .pathProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastEvaluated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateLastSampleReceived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateOfNextEvaluation(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .description("This pipeline is used for production.")
                    .failingGoalCount(1L)
                    .links(
                        InferencePipelineCreateParams.Links.builder()
                            .app(
                                "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6/inference-pipeline/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                            )
                            .build()
                    )
                    .name("production")
                    .passingGoalCount(5L)
                    .bodyProjectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .status(InferencePipelineCreateParams.Status.COMPLETED)
                    .statusMessage("Tests successfully evaluated")
                    .totalGoalCount(6L)
                    .dataBackend(
                        InferencePipelineCreateParams.DataBackend.UnionMember0.builder()
                            .backendType(
                                InferencePipelineCreateParams.DataBackend.UnionMember0.BackendType
                                    .BIGQUERY
                            )
                            .bigqueryConnectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .datasetId("my-dataset")
                            .bodyProjectId("my-project")
                            .tableId("my-table")
                            .partitionType(
                                InferencePipelineCreateParams.DataBackend.UnionMember0.PartitionType
                                    .DAY
                            )
                            .build()
                    )
                    .dateLastPolled(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .project(
                        InferencePipelineCreateParams.Project.builder()
                            .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                            .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                            .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                            .developmentGoalCount(5L)
                            .goalCount(10L)
                            .inferencePipelineCount(1L)
                            .links(
                                InferencePipelineCreateParams.Project.Links.builder()
                                    .app(
                                        "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                                    )
                                    .build()
                            )
                            .monitoringGoalCount(5L)
                            .name("My Project")
                            .source(InferencePipelineCreateParams.Project.Source.WEB)
                            .taskType(InferencePipelineCreateParams.Project.TaskType.LLM_BASE)
                            .versionCount(2L)
                            .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                            .description("My project description.")
                            .gitRepo(
                                InferencePipelineCreateParams.Project.GitRepo.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .dateConnected(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .gitAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .gitId(0L)
                                    .name("name")
                                    .private_(true)
                                    .bodyProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .slug("slug")
                                    .url("url")
                                    .branch("branch")
                                    .rootDir("rootDir")
                                    .build()
                            )
                            .build()
                    )
                    .totalRecordsCount(1000L)
                    .workspace(
                        InferencePipelineCreateParams.Workspace.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .creatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .dateCreated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .inviteCount(0L)
                            .memberCount(0L)
                            .name("Openlayer")
                            .periodEndDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .periodStartDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .projectCount(0L)
                            .slug("openlayer")
                            .status(InferencePipelineCreateParams.Workspace.Status.ACTIVE)
                            .addMonthlyUsage(
                                InferencePipelineCreateParams.Workspace.MonthlyUsage.builder()
                                    .executionTimeMs(0L)
                                    .monthYear(LocalDate.parse("2019-12-27"))
                                    .predictionCount(0L)
                                    .build()
                            )
                            .samlOnlyAccess(true)
                            .addWildcardDomain("string")
                            .build()
                    )
                    .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                    .build()
            )

        val inferencePipeline = inferencePipelineFuture.get()
        inferencePipeline.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineServiceAsync = client.projects().inferencePipelines()

        val inferencePipelinesFuture =
            inferencePipelineServiceAsync.list(
                InferencePipelineListParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val inferencePipelines = inferencePipelinesFuture.get()
        inferencePipelines.validate()
    }
}
