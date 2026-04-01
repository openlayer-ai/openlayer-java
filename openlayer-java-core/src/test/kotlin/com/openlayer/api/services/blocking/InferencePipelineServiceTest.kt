// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveSessionsParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveUsersParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InferencePipelineServiceTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.inferencePipelines()

        val inferencePipeline =
            inferencePipelineService.retrieve(
                InferencePipelineRetrieveParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
                    .build()
            )

        inferencePipeline.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.inferencePipelines()

        val inferencePipeline =
            inferencePipelineService.update(
                InferencePipelineUpdateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("This pipeline is used for production.")
                    .name("production")
                    .referenceDatasetUri("referenceDatasetUri")
                    .build()
            )

        inferencePipeline.validate()
    }

    @Test
    fun delete() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.inferencePipelines()

        inferencePipelineService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun retrieveSessions() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.inferencePipelines()

        val response =
            inferencePipelineService.retrieveSessions(
                InferencePipelineRetrieveSessionsParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .page(1L)
                    .perPage(1L)
                    .sortColumn("sortColumn")
                    .addColumnFilter(
                        InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                            .builder()
                            .measurement("openlayer_token_set")
                            .operator(
                                InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                                    .Operator
                                    .CONTAINS_NONE
                            )
                            .addValue("cat")
                            .build()
                    )
                    .addExcludeRowIdList(0L)
                    .addNotSearchQueryAnd("string")
                    .addNotSearchQueryOr("string")
                    .addRowIdList(0L)
                    .addSearchQueryAnd("string")
                    .addSearchQueryOr("string")
                    .build()
            )

        response.validate()
    }

    @Test
    fun retrieveUsers() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineService = client.inferencePipelines()

        val response =
            inferencePipelineService.retrieveUsers(
                InferencePipelineRetrieveUsersParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .page(1L)
                    .perPage(1L)
                    .sortColumn("sortColumn")
                    .addColumnFilter(
                        InferencePipelineRetrieveUsersParams.ColumnFilter.SetColumnFilter.builder()
                            .measurement("openlayer_token_set")
                            .operator(
                                InferencePipelineRetrieveUsersParams.ColumnFilter.SetColumnFilter
                                    .Operator
                                    .CONTAINS_NONE
                            )
                            .addValue("cat")
                            .build()
                    )
                    .addExcludeRowIdList(0L)
                    .addNotSearchQueryAnd("string")
                    .addNotSearchQueryOr("string")
                    .addRowIdList(0L)
                    .addSearchQueryAnd("string")
                    .addSearchQueryOr("string")
                    .build()
            )

        response.validate()
    }
}
