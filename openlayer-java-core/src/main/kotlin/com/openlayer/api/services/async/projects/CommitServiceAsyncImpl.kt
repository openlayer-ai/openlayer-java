// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

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
import com.openlayer.api.models.projects.commits.CommitCreateParams
import com.openlayer.api.models.projects.commits.CommitCreateResponse
import com.openlayer.api.models.projects.commits.CommitListParams
import com.openlayer.api.models.projects.commits.CommitListResponse
import java.util.concurrent.CompletableFuture

class CommitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitServiceAsync {

    private val withRawResponse: CommitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitCreateResponse> =
        // post /projects/{projectId}/versions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CommitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitListResponse> =
        // get /projects/{projectId}/versions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CommitCreateResponse> =
            jsonHandler<CommitCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("projects", params.getPathParam(0), "versions")
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

        private val listHandler: Handler<CommitListResponse> =
            jsonHandler<CommitListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: CommitListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("projects", params.getPathParam(0), "versions")
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
