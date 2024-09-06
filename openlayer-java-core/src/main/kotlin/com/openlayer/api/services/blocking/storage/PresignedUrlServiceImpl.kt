// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.storage

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import com.openlayer.api.models.StoragePresignedUrlCreateResponse
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.withErrorHandler

class PresignedUrlServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PresignedUrlService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<StoragePresignedUrlCreateResponse> =
        jsonHandler<StoragePresignedUrlCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a presigned url to post storage artifacts. */
    override fun create(
        params: StoragePresignedUrlCreateParams,
        requestOptions: RequestOptions
    ): StoragePresignedUrlCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("storage", "presigned-url")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
