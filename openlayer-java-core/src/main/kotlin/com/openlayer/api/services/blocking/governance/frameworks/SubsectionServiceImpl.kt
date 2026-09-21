// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance.frameworks

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
import com.openlayer.api.core.prepare
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesParams
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubsectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubsectionService {

    private val withRawResponse: SubsectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubsectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubsectionService =
        SubsectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listRules(
        params: SubsectionListRulesParams,
        requestOptions: RequestOptions,
    ): SubsectionListRulesResponse =
        // get /frameworks/{frameworkId}/subsections/{subsectionId}/rules
        withRawResponse().listRules(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubsectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubsectionService.WithRawResponse =
            SubsectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listRulesHandler: Handler<SubsectionListRulesResponse> =
            jsonHandler<SubsectionListRulesResponse>(clientOptions.jsonMapper)

        override fun listRules(
            params: SubsectionListRulesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubsectionListRulesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subsectionId", params.subsectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "frameworks",
                        params._pathParam(0),
                        "subsections",
                        params._pathParam(1),
                        "rules",
                    )
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
