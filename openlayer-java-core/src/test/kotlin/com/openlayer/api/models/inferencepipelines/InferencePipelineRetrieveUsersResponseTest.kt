// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferencePipelineRetrieveUsersResponseTest {

    @Test
    fun create() {
        val inferencePipelineRetrieveUsersResponse =
            InferencePipelineRetrieveUsersResponse.builder()
                .addItem(
                    InferencePipelineRetrieveUsersResponse.Item.builder()
                        .id("user123")
                        .cost(0.125f)
                        .dateOfFirstRecord(OffsetDateTime.parse("2021-12-31T08:00:00Z"))
                        .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .records(15L)
                        .sessions(3L)
                        .tokens(5250.0f)
                        .build()
                )
                .build()

        assertThat(inferencePipelineRetrieveUsersResponse.items())
            .containsExactly(
                InferencePipelineRetrieveUsersResponse.Item.builder()
                    .id("user123")
                    .cost(0.125f)
                    .dateOfFirstRecord(OffsetDateTime.parse("2021-12-31T08:00:00Z"))
                    .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                    .records(15L)
                    .sessions(3L)
                    .tokens(5250.0f)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferencePipelineRetrieveUsersResponse =
            InferencePipelineRetrieveUsersResponse.builder()
                .addItem(
                    InferencePipelineRetrieveUsersResponse.Item.builder()
                        .id("user123")
                        .cost(0.125f)
                        .dateOfFirstRecord(OffsetDateTime.parse("2021-12-31T08:00:00Z"))
                        .dateOfLastRecord(OffsetDateTime.parse("2022-01-02T08:00:00Z"))
                        .records(15L)
                        .sessions(3L)
                        .tokens(5250.0f)
                        .build()
                )
                .build()

        val roundtrippedInferencePipelineRetrieveUsersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferencePipelineRetrieveUsersResponse),
                jacksonTypeRef<InferencePipelineRetrieveUsersResponse>(),
            )

        assertThat(roundtrippedInferencePipelineRetrieveUsersResponse)
            .isEqualTo(inferencePipelineRetrieveUsersResponse)
    }
}
