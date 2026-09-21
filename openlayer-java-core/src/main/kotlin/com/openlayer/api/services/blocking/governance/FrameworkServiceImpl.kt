// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance

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
import com.openlayer.api.services.blocking.governance.frameworks.DocumentService
import com.openlayer.api.services.blocking.governance.frameworks.DocumentServiceImpl
import com.openlayer.api.services.blocking.governance.frameworks.SectionService
import com.openlayer.api.services.blocking.governance.frameworks.SectionServiceImpl
import com.openlayer.api.services.blocking.governance.frameworks.SubsectionService
import com.openlayer.api.services.blocking.governance.frameworks.SubsectionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FrameworkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FrameworkService {

    private val withRawResponse: FrameworkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val documents: DocumentService by lazy { DocumentServiceImpl(clientOptions) }

    private val sections: SectionService by lazy { SectionServiceImpl(clientOptions) }

    private val subsections: SubsectionService by lazy { SubsectionServiceImpl(clientOptions) }

    override fun withRawResponse(): FrameworkService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FrameworkService =
        FrameworkServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun documents(): DocumentService = documents

    override fun sections(): SectionService = sections

    override fun subsections(): SubsectionService = subsections

    override fun create(
        params: FrameworkCreateParams,
        requestOptions: RequestOptions,
    ): FrameworkCreateResponse =
        // post /workspaces/{workspaceId}/frameworks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FrameworkRetrieveParams,
        requestOptions: RequestOptions,
    ): FrameworkRetrieveResponse =
        // get /frameworks/{frameworkId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FrameworkUpdateParams,
        requestOptions: RequestOptions,
    ): FrameworkUpdateResponse =
        // put /frameworks/{frameworkId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FrameworkListParams,
        requestOptions: RequestOptions,
    ): FrameworkListResponse =
        // get /workspaces/{workspaceId}/frameworks
        withRawResponse().list(params, requestOptions).parse()

    override fun export(
        params: FrameworkExportParams,
        requestOptions: RequestOptions,
    ): FrameworkExportResponse =
        // post /frameworks/{frameworkId}/export
        withRawResponse().export(params, requestOptions).parse()

    override fun listProjectRuleStats(
        params: FrameworkListProjectRuleStatsParams,
        requestOptions: RequestOptions,
    ): FrameworkListProjectRuleStatsResponse =
        // get /frameworks/{frameworkId}/project-rule-stats
        withRawResponse().listProjectRuleStats(params, requestOptions).parse()

    override fun listProjects(
        params: FrameworkListProjectsParams,
        requestOptions: RequestOptions,
    ): FrameworkListProjectsResponse =
        // get /frameworks/{frameworkId}/projects
        withRawResponse().listProjects(params, requestOptions).parse()

    override fun listRules(
        params: FrameworkListRulesParams,
        requestOptions: RequestOptions,
    ): FrameworkListRulesResponse =
        // get /frameworks/{frameworkId}/rules
        withRawResponse().listRules(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FrameworkService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val documents: DocumentService.WithRawResponse by lazy {
            DocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sections: SectionService.WithRawResponse by lazy {
            SectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val subsections: SubsectionService.WithRawResponse by lazy {
            SubsectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FrameworkService.WithRawResponse =
            FrameworkServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun documents(): DocumentService.WithRawResponse = documents

        override fun sections(): SectionService.WithRawResponse = sections

        override fun subsections(): SubsectionService.WithRawResponse = subsections

        private val createHandler: Handler<FrameworkCreateResponse> =
            jsonHandler<FrameworkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FrameworkCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkCreateResponse> {
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

        private val retrieveHandler: Handler<FrameworkRetrieveResponse> =
            jsonHandler<FrameworkRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FrameworkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0))
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

        private val updateHandler: Handler<FrameworkUpdateResponse> =
            jsonHandler<FrameworkUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FrameworkUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkUpdateResponse> {
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

        private val listHandler: Handler<FrameworkListResponse> =
            jsonHandler<FrameworkListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FrameworkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workspaceId", params.workspaceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workspaces", params._pathParam(0), "frameworks")
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

        private val exportHandler: Handler<FrameworkExportResponse> =
            jsonHandler<FrameworkExportResponse>(clientOptions.jsonMapper)

        override fun export(
            params: FrameworkExportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkExportResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { exportHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listProjectRuleStatsHandler: Handler<FrameworkListProjectRuleStatsResponse> =
            jsonHandler<FrameworkListProjectRuleStatsResponse>(clientOptions.jsonMapper)

        override fun listProjectRuleStats(
            params: FrameworkListProjectRuleStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListProjectRuleStatsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "project-rule-stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listProjectRuleStatsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listProjectsHandler: Handler<FrameworkListProjectsResponse> =
            jsonHandler<FrameworkListProjectsResponse>(clientOptions.jsonMapper)

        override fun listProjects(
            params: FrameworkListProjectsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListProjectsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "projects")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listProjectsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRulesHandler: Handler<FrameworkListRulesResponse> =
            jsonHandler<FrameworkListRulesResponse>(clientOptions.jsonMapper)

        override fun listRules(
            params: FrameworkListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FrameworkListRulesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("frameworkId", params.frameworkId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("frameworks", params._pathParam(0), "rules")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
