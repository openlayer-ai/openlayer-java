// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferencePipelineRetrieveSessionsResponseTest {

    @Test
    fun create() {
        val inferencePipelineRetrieveSessionsResponse =
            InferencePipelineRetrieveSessionsResponse.builder()
                .addItem(
                    InferencePipelineRetrieveSessionsResponse.Item.builder()
                        .id("session456")
                        .cost(0.025f)
                        .dateCreated(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .dateOfFirstRecord(OffsetDateTime.parse("2022-01-02T07:58:20Z"))
                        .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .duration(100576.341f)
                        .firstRecord(
                            InferencePipelineRetrieveSessionsResponse.Item.FirstRecord.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .lastRecord(
                            InferencePipelineRetrieveSessionsResponse.Item.LastRecord.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .latency(1250.5f)
                        .records(15L)
                        .tokens(1250.0f)
                        .addUserId("user123")
                        .addUserId("user456")
                        .build()
                )
                .build()

        assertThat(inferencePipelineRetrieveSessionsResponse.items())
            .containsExactly(
                InferencePipelineRetrieveSessionsResponse.Item.builder()
                    .id("session456")
                    .cost(0.025f)
                    .dateCreated(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                    .dateOfFirstRecord(OffsetDateTime.parse("2022-01-02T07:58:20Z"))
                    .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                    .duration(100576.341f)
                    .firstRecord(
                        InferencePipelineRetrieveSessionsResponse.Item.FirstRecord.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .lastRecord(
                        InferencePipelineRetrieveSessionsResponse.Item.LastRecord.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .latency(1250.5f)
                    .records(15L)
                    .tokens(1250.0f)
                    .addUserId("user123")
                    .addUserId("user456")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferencePipelineRetrieveSessionsResponse =
            InferencePipelineRetrieveSessionsResponse.builder()
                .addItem(
                    InferencePipelineRetrieveSessionsResponse.Item.builder()
                        .id("session456")
                        .cost(0.025f)
                        .dateCreated(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .dateOfFirstRecord(OffsetDateTime.parse("2022-01-02T07:58:20Z"))
                        .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .duration(100576.341f)
                        .firstRecord(
                            InferencePipelineRetrieveSessionsResponse.Item.FirstRecord.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .lastRecord(
                            InferencePipelineRetrieveSessionsResponse.Item.LastRecord.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .latency(1250.5f)
                        .records(15L)
                        .tokens(1250.0f)
                        .addUserId("user123")
                        .addUserId("user456")
                        .build()
                )
                .build()

        val roundtrippedInferencePipelineRetrieveSessionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferencePipelineRetrieveSessionsResponse),
                jacksonTypeRef<InferencePipelineRetrieveSessionsResponse>(),
            )

        assertThat(roundtrippedInferencePipelineRetrieveSessionsResponse)
            .isEqualTo(inferencePipelineRetrieveSessionsResponse)
    }
}
