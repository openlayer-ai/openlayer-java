// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.inferencepipelines

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.handlers.errorHandler
import com.openlayer.api.core.handlers.jsonHandler
import com.openlayer.api.core.handlers.withErrorHandler
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.core.http.json
import com.openlayer.api.core.http.parseable
import com.openlayer.api.core.prepare
import com.openlayer.api.models.inferencepipelines.data.DataStreamParams
import com.openlayer.api.models.inferencepipelines.data.DataStreamResponse
import kotlin.jvm.optionals.getOrNull

class DataServiceImpl internal constructor(private val clientOptions: ClientOptions) : DataService {

    private val withRawResponse: DataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DataService.WithRawResponse = withRawResponse

    override fun stream(
        params: DataStreamParams,
        requestOptions: RequestOptions,
    ): DataStreamResponse =
        // post /inference-pipelines/{inferencePipelineId}/data-stream
        withRawResponse().stream(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val streamHandler: Handler<DataStreamResponse> =
            jsonHandler<DataStreamResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun stream(
            params: DataStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataStreamResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inferencePipelineId", params.inferencePipelineId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("inference-pipelines", params._pathParam(0), "data-stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { streamHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
