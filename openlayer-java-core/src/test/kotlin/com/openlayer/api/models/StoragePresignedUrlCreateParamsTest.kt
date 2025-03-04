// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StoragePresignedUrlCreateParamsTest {

    @Test
    fun create() {
        StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
    }

    @Test
    fun queryParams() {
        val params = StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
        val expected = QueryParams.builder()
        expected.put("objectName", "objectName")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
        val expected = QueryParams.builder()
        expected.put("objectName", "objectName")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
