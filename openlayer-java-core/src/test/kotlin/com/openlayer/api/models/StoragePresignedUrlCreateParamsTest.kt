// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StoragePresignedUrlCreateParamsTest {

    @Test
    fun createStoragePresignedUrlCreateParams() {
        StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
    }

    @Test
    fun getQueryParams() {
        val params = StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
        val expected = QueryParams.builder()
        expected.put("objectName", "objectName")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
        val expected = QueryParams.builder()
        expected.put("objectName", "objectName")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
