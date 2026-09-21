// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

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
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultCreateEvidenceResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListEvidenceResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultListParams
import com.openlayer.api.models.governance.ruleresults.RuleResultListResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultRetrieveParams
import com.openlayer.api.models.governance.ruleresults.RuleResultRetrieveResponse
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateParams
import com.openlayer.api.models.governance.ruleresults.RuleResultUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RuleResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RuleResultServiceAsync {

    private val withRawResponse: RuleResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuleResultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuleResultServiceAsync =
        RuleResultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RuleResultRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultRetrieveResponse> =
        // get /rule-results/{ruleResultId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: RuleResultUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultUpdateResponse> =
        // patch /rule-results/{ruleResultId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RuleResultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultListResponse> =
        // get /workspaces/{workspaceId}/rule-results
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createEvidence(
        params: RuleResultCreateEvidenceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultCreateEvidenceResponse> =
        // post /rule-results/{ruleResultId}/evidence
        withRawResponse().createEvidence(params, requestOptions).thenApply { it.parse() }

    override fun listEvidence(
        params: RuleResultListEvidenceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuleResultListEvidenceResponse> =
        // get /rule-results/{ruleResultId}/evidence
        withRawResponse().listEvidence(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuleResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuleResultServiceAsync.WithRawResponse =
            RuleResultServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RuleResultRetrieveResponse> =
            jsonHandler<RuleResultRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RuleResultRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleResultId", params.ruleResultId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rule-results", params._pathParam(0))
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

        private val updateHandler: Handler<RuleResultUpdateResponse> =
            jsonHandler<RuleResultUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: RuleResultUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleResultId", params.ruleResultId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rule-results", params._pathParam(0))
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

        private val listHandler: Handler<RuleResultListResponse> =
            jsonHandler<RuleResultListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RuleResultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "rule-results")
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

        private val createEvidenceHandler: Handler<RuleResultCreateEvidenceResponse> =
            jsonHandler<RuleResultCreateEvidenceResponse>(clientOptions.jsonMapper)

        override fun createEvidence(
            params: RuleResultCreateEvidenceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultCreateEvidenceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleResultId", params.ruleResultId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rule-results", params._pathParam(0), "evidence")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEvidenceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEvidenceHandler: Handler<RuleResultListEvidenceResponse> =
            jsonHandler<RuleResultListEvidenceResponse>(clientOptions.jsonMapper)

        override fun listEvidence(
            params: RuleResultListEvidenceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuleResultListEvidenceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ruleResultId", params.ruleResultId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rule-results", params._pathParam(0), "evidence")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listEvidenceHandler.handle(it) }
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
