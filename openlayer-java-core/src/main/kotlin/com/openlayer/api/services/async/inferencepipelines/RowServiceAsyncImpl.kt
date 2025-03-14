// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

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
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateResponse
import java.util.concurrent.CompletableFuture

class RowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RowServiceAsync {

    private val withRawResponse: RowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RowServiceAsync.WithRawResponse = withRawResponse

    override fun update(
        params: RowUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowUpdateResponse> =
        // put /inference-pipelines/{inferencePipelineId}/rows
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val updateHandler: Handler<RowUpdateResponse> =
            jsonHandler<RowUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: RowUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("inference-pipelines", params.getPathParam(0), "rows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
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
