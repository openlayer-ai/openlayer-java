// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.workspaces

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
import com.openlayer.api.models.workspaces.invites.InviteCreateParams
import com.openlayer.api.models.workspaces.invites.InviteCreateResponse
import com.openlayer.api.models.workspaces.invites.InviteListParams
import com.openlayer.api.models.workspaces.invites.InviteListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InviteServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InviteService {

    private val withRawResponse: InviteService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InviteService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InviteService =
        InviteServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InviteCreateParams,
        requestOptions: RequestOptions,
    ): InviteCreateResponse =
        // post /workspaces/{workspaceId}/invites
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: InviteListParams,
        requestOptions: RequestOptions,
    ): InviteListResponse =
        // get /workspaces/{workspaceId}/invites
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InviteService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InviteService.WithRawResponse =
            InviteServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InviteCreateResponse> =
            jsonHandler<InviteCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InviteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "invites")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InviteListResponse> =
            jsonHandler<InviteListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InviteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InviteListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "invites")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
