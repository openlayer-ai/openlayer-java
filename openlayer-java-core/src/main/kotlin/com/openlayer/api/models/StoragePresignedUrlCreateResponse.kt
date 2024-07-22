// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.JsonNull
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.Enum
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.errors.OpenlayerInvalidDataException

@JsonDeserialize(builder = StoragePresignedUrlCreateResponse.Builder::class)
@NoAutoDetect
class StoragePresignedUrlCreateResponse private constructor(
  private val url: JsonField<String>,
  private val fields: JsonValue,
  private val storageUri: JsonField<String>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The presigned url. */
    fun url(): String = url.getRequired("url")

    /** The storage URI to send back to the backend after the upload was completed. */
    fun storageUri(): String = storageUri.getRequired("storageUri")

    /** The presigned url. */
    @JsonProperty("url")
    @ExcludeMissing
    fun _url() = url

    /** Fields to include in the body of the upload. Only needed by s3. */
    @JsonProperty("fields")
    @ExcludeMissing
    fun _fields() = fields

    /** The storage URI to send back to the backend after the upload was completed. */
    @JsonProperty("storageUri")
    @ExcludeMissing
    fun _storageUri() = storageUri

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): StoragePresignedUrlCreateResponse = apply {
        if (!validated) {
          url()
          storageUri()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is StoragePresignedUrlCreateResponse &&
          this.url == other.url &&
          this.fields == other.fields &&
          this.storageUri == other.storageUri &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            url,
            fields,
            storageUri,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "StoragePresignedUrlCreateResponse{url=$url, fields=$fields, storageUri=$storageUri, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var url: JsonField<String> = JsonMissing.of()
        private var fields: JsonValue = JsonMissing.of()
        private var storageUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(storagePresignedUrlCreateResponse: StoragePresignedUrlCreateResponse) = apply {
            this.url = storagePresignedUrlCreateResponse.url
            this.fields = storagePresignedUrlCreateResponse.fields
            this.storageUri = storagePresignedUrlCreateResponse.storageUri
            additionalProperties(storagePresignedUrlCreateResponse.additionalProperties)
        }

        /** The presigned url. */
        fun url(url: String) = url(JsonField.of(url))

        /** The presigned url. */
        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply {
            this.url = url
        }

        /** Fields to include in the body of the upload. Only needed by s3. */
        @JsonProperty("fields")
        @ExcludeMissing
        fun fields(fields: JsonValue) = apply {
            this.fields = fields
        }

        /** The storage URI to send back to the backend after the upload was completed. */
        fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

        /** The storage URI to send back to the backend after the upload was completed. */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun storageUri(storageUri: JsonField<String>) = apply {
            this.storageUri = storageUri
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): StoragePresignedUrlCreateResponse = StoragePresignedUrlCreateResponse(
            url,
            fields,
            storageUri,
            additionalProperties.toUnmodifiable(),
        )
    }
}
