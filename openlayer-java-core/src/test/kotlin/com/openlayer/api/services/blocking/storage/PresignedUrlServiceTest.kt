// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PresignedUrlServiceTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val presignedUrlService = client.storage().presignedUrl()

        val presignedUrl =
            presignedUrlService.create(
                StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
            )

        presignedUrl.validate()
    }
}
