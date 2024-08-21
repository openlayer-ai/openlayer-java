package com.openlayer.api.example;

import com.openlayer.api.client.OpenlayerClient;
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient;
import com.openlayer.api.core.JsonValue;
import com.openlayer.api.models.*;

import java.util.Arrays;
import java.util.List;


public class Main {
    static final String API_KEY = System.getenv("OPENLAYER_API_KEY");
    // require API key or exit if not set
//    static {
//        if (API_KEY == null) {
//            System.err.println("Please set the OPENLAYER_API_KEY environment variable");
//            System.exit(1);
//        }
//    }
    static final OpenlayerClient client = OpenlayerOkHttpClient.builder()
            .apiKey("TEST")
            .build();

    public static void main(String[] args) {
        InferencePipelineDataStreamParams params = InferencePipelineDataStreamParams.builder()
                .rows(Arrays.asList(InferencePipelineDataStreamParams.Row.builder()
                        .putAdditionalProperty("user_query", JsonValue.from("what's the meaning of life?"))
                        .putAdditionalProperty("output", JsonValue.from("42"))
                        .putAdditionalProperty("tokens", JsonValue.from(7))
                        .putAdditionalProperty("cost", JsonValue.from(0.02))
                        .putAdditionalProperty("timestamp", JsonValue.from(1620000000))
                        .build()))
                .config(InferencePipelineDataStreamParams.Config.ofLlmData(InferencePipelineDataStreamParams.Config.LlmData.builder()
                        .outputColumnName("output")
                        .costColumnName("cost")
                        .inputVariableNames(Arrays.asList("user_query"))
                        .numOfTokenColumnName("tokens")
                        .timestampColumnName("timestamp")

                        .build()))
                .inferencePipelineId("llm")
                .build();
        InferencePipelineDataStreamResponse inferencePipelineDataStreamResponse = client.inferencePipelines().data().stream(params);
        System.out.println(inferencePipelineDataStreamResponse);
    }
}