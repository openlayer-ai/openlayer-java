// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

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
import com.openlayer.api.core.prepare
import com.openlayer.api.models.workspaces.WorkspaceRetrieveParams
import com.openlayer.api.models.workspaces.WorkspaceRetrieveResponse
import com.openlayer.api.models.workspaces.WorkspaceUpdateParams
import com.openlayer.api.models.workspaces.WorkspaceUpdateResponse
import com.openlayer.api.services.blocking.workspaces.ApiKeyService
import com.openlayer.api.services.blocking.workspaces.ApiKeyServiceImpl
import com.openlayer.api.services.blocking.workspaces.InviteService
import com.openlayer.api.services.blocking.workspaces.InviteServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkspaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkspaceService {

    private val withRawResponse: WorkspaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invites: InviteService by lazy { InviteServiceImpl(clientOptions) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    override fun withRawResponse(): WorkspaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspaceService =
        WorkspaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun invites(): InviteService = invites

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun retrieve(
        params: WorkspaceRetrieveParams,
        requestOptions: RequestOptions,
    ): WorkspaceRetrieveResponse =
        // get /workspaces/{workspaceId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: WorkspaceUpdateParams,
        requestOptions: RequestOptions,
    ): WorkspaceUpdateResponse =
        // put /workspaces/{workspaceId}
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkspaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val invites: InviteService.WithRawResponse by lazy {
            InviteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspaceService.WithRawResponse =
            WorkspaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun invites(): InviteService.WithRawResponse = invites

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        private val retrieveHandler: Handler<WorkspaceRetrieveResponse> =
            jsonHandler<WorkspaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WorkspaceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<WorkspaceUpdateResponse> =
            jsonHandler<WorkspaceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: WorkspaceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspaceUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
