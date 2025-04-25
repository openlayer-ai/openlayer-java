// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestUpdateResponseTest {

    @Test
    fun create() {
        val testUpdateResponse =
            TestUpdateResponse.builder()
                .taskResultId("taskResultId")
                .taskResultUrl("taskResultUrl")
                .build()

        assertThat(testUpdateResponse.taskResultId()).contains("taskResultId")
        assertThat(testUpdateResponse.taskResultUrl()).contains("taskResultUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testUpdateResponse =
            TestUpdateResponse.builder()
                .taskResultId("taskResultId")
                .taskResultUrl("taskResultUrl")
                .build()

        val roundtrippedTestUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testUpdateResponse),
                jacksonTypeRef<TestUpdateResponse>(),
            )

        assertThat(roundtrippedTestUpdateResponse).isEqualTo(testUpdateResponse)
    }
}
