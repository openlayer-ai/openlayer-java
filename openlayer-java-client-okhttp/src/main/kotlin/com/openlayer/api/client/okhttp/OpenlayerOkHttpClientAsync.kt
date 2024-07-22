// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client.okhttp

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.Multimap
import java.net.Proxy
import java.time.Clock
import java.time.Duration
import java.util.Optional
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpClient
import com.openlayer.api.client.OpenlayerClientAsync
import com.openlayer.api.client.OpenlayerClientAsyncImpl

class OpenlayerOkHttpClientAsync private constructor() {

    companion object {

        @JvmStatic
        fun builder() = Builder()

        @JvmStatic
        fun fromEnv(): OpenlayerClientAsync = builder().fromEnv().build()
    }

    class Builder {

        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var baseUrl: String = ClientOptions.PRODUCTION_URL
        // default timeout for client is 1 minute
        private var timeout: Duration = Duration.ofSeconds(60)
        private var proxy: Proxy? = null

        fun baseUrl(baseUrl: String) = apply {
            clientOptions.baseUrl(baseUrl)
            this.baseUrl = baseUrl
        }

        fun jsonMapper(jsonMapper: JsonMapper) = apply {
            clientOptions.jsonMapper(jsonMapper)
        }

        fun clock(clock: Clock) = apply {
            clientOptions.clock(clock)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.headers(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            clientOptions.putHeader(name, value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.putHeaders(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllHeaders(headers)
        }

        fun removeHeader(name: String) = apply {
            clientOptions.removeHeader(name)
        }

        fun timeout(timeout: Duration) = apply {
            this.timeout = timeout
        }

        fun maxRetries(maxRetries: Int) = apply {
            clientOptions.maxRetries(maxRetries)
        }

        fun proxy(proxy: Proxy) = apply {
            this.proxy = proxy
        }

        fun responseValidation(responseValidation: Boolean) = apply {
            clientOptions.responseValidation(responseValidation)
        }

        fun apiKey(apiKey: String?) = apply {
            clientOptions.apiKey(apiKey)
        }

        fun fromEnv() = apply {
            clientOptions.fromEnv()
        }

        fun build(): OpenlayerClientAsync {
          return OpenlayerClientAsyncImpl(clientOptions
              .httpClient(OkHttpClient.builder()
                  .baseUrl(baseUrl)
                  .timeout(timeout)
                  .proxy(proxy)
                  .build())
              .build())
        }
    }
}
