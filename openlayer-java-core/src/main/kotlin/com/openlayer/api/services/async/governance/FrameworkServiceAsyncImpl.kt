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
import com.openlayer.api.models.governance.frameworks.FrameworkCreateParams
import com.openlayer.api.models.governance.frameworks.FrameworkCreateResponse
import com.openlayer.api.models.governance.frameworks.FrameworkExportParams
import com.openlayer.api.models.governance.frameworks.FrameworkExportResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectRuleStatsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectRuleStatsResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectsResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListResponse
import com.openlayer.api.models.governance.frameworks.FrameworkListRulesParams
import com.openlayer.api.models.governance.frameworks.FrameworkListRulesResponse
import com.openlayer.api.models.governance.frameworks.FrameworkRetrieveParams
import com.openlayer.api.models.governance.frameworks.FrameworkRetrieveResponse
import com.openlayer.api.models.governance.frameworks.FrameworkUpdateParams
import com.openlayer.api.models.governance.frameworks.FrameworkUpdateResponse
import com.openlayer.api.services.async.governance.frameworks.DocumentServiceAsync
import com.openlayer.api.services.async.governance.frameworks.DocumentServiceAsyncImpl
import com.openlayer.api.services.async.governance.frameworks.SectionServiceAsync
import com.openlayer.api.services.async.governance.frameworks.SectionServiceAsyncImpl
import com.openlayer.api.services.async.governance.frameworks.SubsectionServiceAsync
import com.openlayer.api.services.async.governance.frameworks.SubsectionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FrameworkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FrameworkServiceAsync {

    private val withRawResponse: FrameworkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    private val sections: SectionServiceAsync by lazy { SectionServiceAsyncImpl(clientOptions) }

    private val subsections: SubsectionServiceAsync by lazy {
        SubsectionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): FrameworkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FrameworkServiceAsync =
        FrameworkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentServiceAsync = documents

    override fun sections(): SectionServiceAsync = sections

    override fun subsections(): SubsectionServiceAsync = subsections

    override fun create(
        params: FrameworkCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkCreateResponse> =
        // post /workspaces/{workspaceId}/frameworks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FrameworkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkRetrieveResponse> =
        // get /frameworks/{frameworkId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FrameworkUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkUpdateResponse> =
        // put /frameworks/{frameworkId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FrameworkListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListResponse> =
        // get /workspaces/{workspaceId}/frameworks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun export(
        params: FrameworkExportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkExportResponse> =
        // post /frameworks/{frameworkId}/export
        withRawResponse().export(params, requestOptions).thenApply { it.parse() }

    override fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListProjectRuleStatsResponse> =
        // get /frameworks/{frameworkId}/project-rule-stats
        withRawResponse().listProjectRuleStats(params, requestOptions).thenApply { it.parse() }

    override fun listProjects(
        params: FrameworkListProjectsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListProjectsResponse> =
        // get /frameworks/{frameworkId}/projects
        withRawResponse().listProjects(params, requestOptions).thenApply { it.parse() }

    override fun listRules(
        params: FrameworkListRulesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FrameworkListRulesResponse> =
        // get /frameworks/{frameworkId}/rules
        withRawResponse().listRules(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FrameworkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentServiceAsync.WithRawResponse by lazy {
            DocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sections: SectionServiceAsync.WithRawResponse by lazy {
            SectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subsections: SubsectionServiceAsync.WithRawResponse by lazy {
            SubsectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FrameworkServiceAsync.WithRawResponse =
            FrameworkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentServiceAsync.WithRawResponse = documents

        override fun sections(): SectionServiceAsync.WithRawResponse = sections

        override fun subsections(): SubsectionServiceAsync.WithRawResponse = subsections

        private val createHandler: Handler<FrameworkCreateResponse> =
            jsonHandler<FrameworkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FrameworkCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "frameworks")
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

        private val retrieveHandler: Handler<FrameworkRetrieveResponse> =
            jsonHandler<FrameworkRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FrameworkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0))
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

        private val updateHandler: Handler<FrameworkUpdateResponse> =
            jsonHandler<FrameworkUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FrameworkUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0))
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

        private val listHandler: Handler<FrameworkListResponse> =
            jsonHandler<FrameworkListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FrameworkListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "frameworks")
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

        private val exportHandler: Handler<FrameworkExportResponse> =
            jsonHandler<FrameworkExportResponse>(clientOptions.jsonMapper)

        override fun export(
            params: FrameworkExportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkExportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "export")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { exportHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listProjectRuleStatsHandler: Handler<FrameworkListProjectRuleStatsResponse> =
            jsonHandler<FrameworkListProjectRuleStatsResponse>(clientOptions.jsonMapper)

        override fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectRuleStatsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "project-rule-stats")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listProjectRuleStatsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listProjectsHandler: Handler<FrameworkListProjectsResponse> =
            jsonHandler<FrameworkListProjectsResponse>(clientOptions.jsonMapper)

        override fun listProjects(
            params: FrameworkListProjectsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListProjectsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "projects")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listProjectsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRulesHandler: Handler<FrameworkListRulesResponse> =
            jsonHandler<FrameworkListRulesResponse>(clientOptions.jsonMapper)

        override fun listRules(
            params: FrameworkListRulesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FrameworkListRulesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "rules")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRulesHandler.handle(it) }
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
