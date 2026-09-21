// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.storage.presignedurl

import com.openlayer.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PresignedUrlRetrieveParamsTest {

    @Test
    fun create() {
        PresignedUrlRetrieveParams.builder().storageUri("storageUri").build()
    }

    @Test
    fun queryParams() {
        val params = PresignedUrlRetrieveParams.builder().storageUri("storageUri").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("storageUri", "storageUri").build())
    }
}
