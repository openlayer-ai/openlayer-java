// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.tests.TestEvaluateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestServiceAsyncTest {

    @Test
    fun evaluate() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.tests()

        val responseFuture =
            testServiceAsync.evaluate(
                TestEvaluateParams.builder()
                    .testId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTimestamp(1700006400L)
                    .startTimestamp(1699920000L)
                    .inferencePipelineId("123e4567-e89b-12d3-a456-426614174000")
                    .overwriteResults(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
