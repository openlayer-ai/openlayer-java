// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.storage

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PresignedUrlServiceAsyncTest {

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
                PresignedUrlCreateParams.builder().objectName("objectName").build()
            )

        val presignedUrl = presignedUrlFuture.get()
        presignedUrl.validate()
    }
}
