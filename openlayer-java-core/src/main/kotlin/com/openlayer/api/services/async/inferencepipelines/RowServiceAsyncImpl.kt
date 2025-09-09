// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.errorBodyHandler
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateParams
import com.openlayer.api.models.inferencepipelines.rows.RowUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RowServiceAsync {

    private val withRawResponse: RowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync =
        RowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: RowUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowUpdateResponse> =
        // put /inference-pipelines/{inferencePipelineId}/rows
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RowServiceAsync.WithRawResponse =
            RowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<RowUpdateResponse> =
            jsonHandler<RowUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RowUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inference-pipelines", params._pathParam(0), "rows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
