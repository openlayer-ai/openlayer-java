// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestEvaluateResponseTest {

    @Test
    fun create() {
        val testEvaluateResponse =
            TestEvaluateResponse.builder()
                .message("Evaluation task queued successfully")
                .pipelineCount(2L)
                .requestedEndTimestamp(1700006400L)
                .requestedStartTimestamp(1699920000L)
                .addTask(
                    TestEvaluateResponse.Task.builder()
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskResultUrl("taskResultUrl")
                        .build()
                )
                .build()

        assertThat(testEvaluateResponse.message()).isEqualTo("Evaluation task queued successfully")
        assertThat(testEvaluateResponse.pipelineCount()).isEqualTo(2L)
        assertThat(testEvaluateResponse.requestedEndTimestamp()).isEqualTo(1700006400L)
        assertThat(testEvaluateResponse.requestedStartTimestamp()).isEqualTo(1699920000L)
        assertThat(testEvaluateResponse.tasks())
            .containsExactly(
                TestEvaluateResponse.Task.builder()
                    .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taskResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .taskResultUrl("taskResultUrl")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testEvaluateResponse =
            TestEvaluateResponse.builder()
                .message("Evaluation task queued successfully")
                .pipelineCount(2L)
                .requestedEndTimestamp(1700006400L)
                .requestedStartTimestamp(1699920000L)
                .addTask(
                    TestEvaluateResponse.Task.builder()
                        .pipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskResultId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .taskResultUrl("taskResultUrl")
                        .build()
                )
                .build()

        val roundtrippedTestEvaluateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testEvaluateResponse),
                jacksonTypeRef<TestEvaluateResponse>(),
            )

        assertThat(roundtrippedTestEvaluateResponse).isEqualTo(testEvaluateResponse)
    }
}
