// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.storage

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PresignedUrlServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val presignedUrlServiceAsync = client.storage().presignedUrl()

        val presignedUrlFuture =
            presignedUrlServiceAsync.create(
                StoragePresignedUrlCreateParams.builder().objectName("objectName").build()
            )

        val presignedUrl = presignedUrlFuture.get()
        presignedUrl.validate()
    }
}
