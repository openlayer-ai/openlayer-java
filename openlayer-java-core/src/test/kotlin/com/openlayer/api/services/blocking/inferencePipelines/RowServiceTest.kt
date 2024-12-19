// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencePipelines

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.InferencePipelineRowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RowServiceTest {

    @Test
    fun callUpdate() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rowService = client.inferencePipelines().rows()
        val inferencePipelineRowUpdateResponse =
            rowService.update(
                InferencePipelineRowUpdateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inferenceId("inferenceId")
                    .row(JsonValue.from(mapOf<String, Any>()))
                    .config(
                        InferencePipelineRowUpdateParams.Config.builder()
                            .groundTruthColumnName("ground_truth")
                            .humanFeedbackColumnName("human_feedback")
                            .inferenceIdColumnName("id")
                            .latencyColumnName("latency")
                            .timestampColumnName("timestamp")
                            .build()
                    )
                    .build()
            )
        println(inferencePipelineRowUpdateResponse)
        inferencePipelineRowUpdateResponse.validate()
    }
}
