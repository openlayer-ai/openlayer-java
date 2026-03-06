// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.inferencepipelines.rows.RowCreateParams
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RowServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rowServiceAsync = client.inferencePipelines().rows()

        val rowFuture =
            rowServiceAsync.create(
                RowCreateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .page(1L)
                    .perPage(1L)
                    .sortColumn("sortColumn")
                    .addColumnFilter(
                        RowCreateParams.ColumnFilter.SetColumnFilter.builder()
                            .measurement("openlayer_token_set")
                            .operator(
                                RowCreateParams.ColumnFilter.SetColumnFilter.Operator.CONTAINS_NONE
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

        val row = rowFuture.get()
        row.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rowServiceAsync = client.inferencePipelines().rows()

        val rowFuture =
            rowServiceAsync.update(
                RowUpdateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inferenceId("inferenceId")
                    .row(JsonValue.from(mapOf<String, Any>()))
                    .config(
                        RowUpdateParams.Config.builder()
                            .groundTruthColumnName("ground_truth")
                            .humanFeedbackColumnName("human_feedback")
                            .inferenceIdColumnName("id")
                            .latencyColumnName("latency")
                            .timestampColumnName("timestamp")
                            .build()
                    )
                    .build()
            )

        val row = rowFuture.get()
        row.validate()
    }
}
