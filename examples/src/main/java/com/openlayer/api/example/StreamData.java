/*
 * This source file was generated by the Gradle 'init' task
 */
package com.openlayer.api.example;

import com.openlayer.api.client.OpenlayerClient;
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient;
import com.openlayer.api.core.JsonNumber;
import com.openlayer.api.core.JsonString;
import com.openlayer.api.models.InferencePipelineDataStreamParams;
import com.openlayer.api.models.InferencePipelineDataStreamResponse;
import java.util.Arrays;

public class StreamData {
    public static void main(String[] args) {
        // Configure the client using environment variables
        OpenlayerClient client = OpenlayerOkHttpClient.fromEnv();

        // Or you can configure the client with additional properties
        /*
         * OpenlayerClient client = OpenlayerOkHttpClient.builder()
         * .fromEnv()
         * // Additional properties can be set here
         * .build();
         */

        // Replace with your inference pipeline id
        String inferencePipelineId = "your-inference-pipeline-id";

        // Let's say we want to stream the following row, which represents a model
        // prediction:
        // Define a row with the relevant fields
        InferencePipelineDataStreamParams.Row row = InferencePipelineDataStreamParams.Row.builder()
                .putAdditionalProperty("user_query", JsonString.of("what's the meaning of life?"))
                .putAdditionalProperty("output", JsonString.of("42"))
                .putAdditionalProperty("tokens", JsonNumber.of(7))
                .putAdditionalProperty("cost", JsonNumber.of(0.02))
                .build();

        // Create Inference Pipeline Data Stream Parameters
        InferencePipelineDataStreamParams params = InferencePipelineDataStreamParams.builder()
                .inferencePipelineId(inferencePipelineId)
                .rows(Arrays.asList(row))
                .config(InferencePipelineDataStreamParams.Config.ofLlmData(
                        InferencePipelineDataStreamParams.Config.LlmData.builder()
                                .outputColumnName("output")
                                .costColumnName("cost")
                                .inputVariableNames(Arrays.asList("user_query"))
                                .numOfTokenColumnName("tokens")
                                .build()))
                .build();

        // Execute the request
        InferencePipelineDataStreamResponse inferencePipelineDataStreamResponse =
                client.inferencePipelines().data().stream(params);

        // Print the response
        System.out.println(inferencePipelineDataStreamResponse);
    }
}
