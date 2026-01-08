// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

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
import com.openlayer.api.models.workspaces.WorkspaceRetrieveParams
import com.openlayer.api.models.workspaces.WorkspaceRetrieveResponse
import com.openlayer.api.models.workspaces.WorkspaceUpdateParams
import com.openlayer.api.models.workspaces.WorkspaceUpdateResponse
import com.openlayer.api.services.async.workspaces.ApiKeyServiceAsync
import com.openlayer.api.services.async.workspaces.ApiKeyServiceAsyncImpl
import com.openlayer.api.services.async.workspaces.InviteServiceAsync
import com.openlayer.api.services.async.workspaces.InviteServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceServiceAsync {

    private val withRawResponse: WorkspaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invites: InviteServiceAsync by lazy { InviteServiceAsyncImpl(clientOptions) }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceServiceAsync =
        WorkspaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invites(): InviteServiceAsync = invites

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun retrieve(
        params: WorkspaceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceRetrieveResponse> =
        // get /workspaces/{workspaceId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspaceUpdateResponse> =
        // put /workspaces/{workspaceId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invites: InviteServiceAsync.WithRawResponse by lazy {
            InviteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceServiceAsync.WithRawResponse =
            WorkspaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invites(): InviteServiceAsync.WithRawResponse = invites

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        private val retrieveHandler: Handler<WorkspaceRetrieveResponse> =
            jsonHandler<WorkspaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WorkspaceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<WorkspaceUpdateResponse> =
            jsonHandler<WorkspaceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspaceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0))
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
