// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowUpdateResponseTest {

    @Test
    fun create() {
        val rowUpdateResponse =
            RowUpdateResponse.builder().success(RowUpdateResponse.Success.TRUE).build()

        assertThat(rowUpdateResponse.success()).isEqualTo(RowUpdateResponse.Success.TRUE)
    }
}
