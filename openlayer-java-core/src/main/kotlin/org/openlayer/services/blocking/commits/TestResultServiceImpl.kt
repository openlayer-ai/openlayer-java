// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking.commits

import org.openlayer.core.ClientOptions
import org.openlayer.core.RequestOptions
import org.openlayer.core.http.HttpMethod
import org.openlayer.core.http.HttpRequest
import org.openlayer.core.http.HttpResponse.Handler
import org.openlayer.errors.OpenlayerError
import org.openlayer.models.CommitTestResultListParams
import org.openlayer.models.CommitTestResultListResponse
import org.openlayer.services.errorHandler
import org.openlayer.services.jsonHandler
import org.openlayer.services.withErrorHandler

class TestResultServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TestResultService {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CommitTestResultListResponse> =
        jsonHandler<CommitTestResultListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the test results for a commit (project version). */
    override fun list(
        params: CommitTestResultListParams,
        requestOptions: RequestOptions
    ): CommitTestResultListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("versions", params.getPathParam(0), "results")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
