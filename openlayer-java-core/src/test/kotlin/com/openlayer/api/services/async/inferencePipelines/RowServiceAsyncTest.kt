// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencePipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RowServiceAsyncTest {

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
                InferencePipelineRowUpdateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inferenceId("inferenceId")
                    .row(JsonValue.from(mapOf<String, Any>()))
                    .config(
                        InferencePipelineRowUpdateParams.Config.builder()
                            .groundTruthColumnName("ground_truth")
                            .humanFeedbackColumnName("human_feedback")
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
