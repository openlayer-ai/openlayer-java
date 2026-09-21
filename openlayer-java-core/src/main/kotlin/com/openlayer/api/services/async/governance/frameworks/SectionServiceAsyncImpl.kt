// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance.frameworks

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
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepareAsync
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesParams
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SectionServiceAsync {

    private val withRawResponse: SectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionServiceAsync =
        SectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listRules(
        params: SectionListRulesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SectionListRulesResponse> =
        // get /frameworks/{frameworkId}/sections/{sectionId}/rules
        withRawResponse().listRules(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SectionServiceAsync.WithRawResponse =
            SectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listRulesHandler: Handler<SectionListRulesResponse> =
            jsonHandler<SectionListRulesResponse>(clientOptions.jsonMapper)

        override fun listRules(
            params: SectionListRulesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SectionListRulesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sectionId", params.sectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "frameworks",
                        params._pathParam(0),
                        "sections",
                        params._pathParam(1),
                        "rules",
                    )
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
