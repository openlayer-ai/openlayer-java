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
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepare
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateResponse

class PresignedUrlServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PresignedUrlService {

    private val withRawResponse: PresignedUrlService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PresignedUrlService.WithRawResponse = withRawResponse

    override fun create(
        params: PresignedUrlCreateParams,
        requestOptions: RequestOptions,
    ): PresignedUrlCreateResponse =
        // post /storage/presigned-url
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PresignedUrlService.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PresignedUrlCreateResponse> =
            jsonHandler<PresignedUrlCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PresignedUrlCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PresignedUrlCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("storage", "presigned-url")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
