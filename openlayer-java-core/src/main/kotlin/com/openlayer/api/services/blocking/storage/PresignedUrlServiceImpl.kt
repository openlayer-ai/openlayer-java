// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.json
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import com.openlayer.api.models.StoragePresignedUrlCreateResponse

class PresignedUrlServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PresignedUrlService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<StoragePresignedUrlCreateResponse> =
        jsonHandler<StoragePresignedUrlCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a presigned url to post storage artifacts. */
    override fun create(
        params: StoragePresignedUrlCreateParams,
        requestOptions: RequestOptions,
    ): StoragePresignedUrlCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("storage", "presigned-url")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
