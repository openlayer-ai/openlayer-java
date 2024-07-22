package com.openlayer.api.core.http

import java.io.Closeable
import java.util.concurrent.CompletableFuture
import com.openlayer.api.core.RequestOptions

interface HttpClient : Closeable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
