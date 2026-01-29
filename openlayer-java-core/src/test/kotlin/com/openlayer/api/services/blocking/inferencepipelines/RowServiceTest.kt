// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RowServiceTest {

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rowService = client.inferencePipelines().rows()

        val row =
            rowService.update(
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

        row.validate()
    }
}
