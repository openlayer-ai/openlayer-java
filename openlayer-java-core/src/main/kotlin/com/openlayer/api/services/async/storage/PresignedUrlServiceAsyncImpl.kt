// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.storage

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.openlayer.api.core.Enum
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.StoragePresignedUrlCreateParams
import com.openlayer.api.models.StoragePresignedUrlCreateResponse
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.http.HttpMethod
import com.openlayer.api.core.http.HttpRequest
import com.openlayer.api.core.http.HttpResponse.Handler
import com.openlayer.api.core.http.BinaryResponseContent
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.services.emptyHandler
import com.openlayer.api.services.errorHandler
import com.openlayer.api.services.json
import com.openlayer.api.services.jsonHandler
import com.openlayer.api.services.multipartFormData
import com.openlayer.api.services.stringHandler
import com.openlayer.api.services.binaryHandler
import com.openlayer.api.services.withErrorHandler

class PresignedUrlServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : PresignedUrlServiceAsync {

    private val errorHandler: Handler<OpenlayerError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<StoragePresignedUrlCreateResponse> =
    jsonHandler<StoragePresignedUrlCreateResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a presigned url to post storage artifacts. */
    override fun create(params: StoragePresignedUrlCreateParams, requestOptions: RequestOptions): CompletableFuture<StoragePresignedUrlCreateResponse> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("storage", "presigned-url")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
