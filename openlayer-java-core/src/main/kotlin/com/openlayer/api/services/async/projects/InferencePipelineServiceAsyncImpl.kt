// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
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
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineCreateResponse
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListParams
import com.openlayer.api.models.projects.inferencepipelines.InferencePipelineListResponse
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class InferencePipelineServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InferencePipelineServiceAsync {

    private val withRawResponse: InferencePipelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InferencePipelineServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: InferencePipelineCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineCreateResponse> =
        // post /projects/{projectId}/inference-pipelines
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InferencePipelineListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferencePipelineListResponse> =
        // get /projects/{projectId}/inference-pipelines
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InferencePipelineServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<InferencePipelineCreateResponse> =
            jsonHandler<InferencePipelineCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: InferencePipelineCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathProjectId", params.pathProjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("projects", params._pathParam(0), "inference-pipelines")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val listHandler: Handler<InferencePipelineListResponse> =
            jsonHandler<InferencePipelineListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InferencePipelineListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferencePipelineListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("projects", params._pathParam(0), "inference-pipelines")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
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
