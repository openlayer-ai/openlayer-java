// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

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
import com.openlayer.api.models.projects.commits.CommitCreateParams
import com.openlayer.api.models.projects.commits.CommitCreateResponse
import com.openlayer.api.models.projects.commits.CommitListParams
import com.openlayer.api.models.projects.commits.CommitListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitServiceAsync {

    private val withRawResponse: CommitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitServiceAsync =
        CommitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitServiceAsync.WithRawResponse =
            CommitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CommitCreateResponse> =
            jsonHandler<CommitCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathProjectId", params.pathProjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0), "versions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
            jsonHandler<CommitListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CommitListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("projectId", params.projectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", params._pathParam(0), "versions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
