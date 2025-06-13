// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.storage

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
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
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateParams
import com.openlayer.api.models.storage.presignedurl.PresignedUrlCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PresignedUrlServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PresignedUrlServiceAsync {

    private val withRawResponse: PresignedUrlServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PresignedUrlServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PresignedUrlServiceAsync =
        PresignedUrlServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PresignedUrlCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PresignedUrlCreateResponse> =
        // post /storage/presigned-url
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PresignedUrlServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PresignedUrlServiceAsync.WithRawResponse =
            PresignedUrlServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PresignedUrlCreateResponse> =
            jsonHandler<PresignedUrlCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PresignedUrlCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PresignedUrlCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "presigned-url")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
