// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.inferencepipelines.InferencePipelineDeleteParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineRetrieveParams
import com.openlayer.api.models.inferencepipelines.InferencePipelineUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InferencePipelineServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineServiceAsync = client.inferencePipelines()

        val inferencePipelineFuture =
            inferencePipelineServiceAsync.retrieve(
                InferencePipelineRetrieveParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExpand(InferencePipelineRetrieveParams.Expand.PROJECT)
                    .build()
            )

        val inferencePipeline = inferencePipelineFuture.get()
        inferencePipeline.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineServiceAsync = client.inferencePipelines()

        val inferencePipelineFuture =
            inferencePipelineServiceAsync.update(
                InferencePipelineUpdateParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("This pipeline is used for production.")
                    .name("production")
                    .referenceDatasetUri("referenceDatasetUri")
                    .build()
            )

        val inferencePipeline = inferencePipelineFuture.get()
        inferencePipeline.validate()
    }

    @Test
    fun delete() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inferencePipelineServiceAsync = client.inferencePipelines()

        val future =
            inferencePipelineServiceAsync.delete(
                InferencePipelineDeleteParams.builder()
                    .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
