// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = StoragePresignedUrlCreateResponse.Builder::class)
@NoAutoDetect
class StoragePresignedUrlCreateResponse
private constructor(
    private val url: JsonField<String>,
    private val fields: JsonValue,
    private val storageUri: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The presigned url. */
    fun url(): String = url.getRequired("url")

    /** The storage URI to send back to the backend after the upload was completed. */
    fun storageUri(): String = storageUri.getRequired("storageUri")

    /** The presigned url. */
    @JsonProperty("url") @ExcludeMissing fun _url() = url

    /** Fields to include in the body of the upload. Only needed by s3 */
    @JsonProperty("fields") @ExcludeMissing fun _fields() = fields

    /** The storage URI to send back to the backend after the upload was completed. */
    @JsonProperty("storageUri") @ExcludeMissing fun _storageUri() = storageUri

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

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var url: JsonField<String> = JsonMissing.of()
        private var fields: JsonValue = JsonMissing.of()
        private var storageUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(storagePresignedUrlCreateResponse: StoragePresignedUrlCreateResponse) =
            apply {
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
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Fields to include in the body of the upload. Only needed by s3 */
        @JsonProperty("fields")
        @ExcludeMissing
        fun fields(fields: JsonValue) = apply { this.fields = fields }

        /** The storage URI to send back to the backend after the upload was completed. */
        fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

        /** The storage URI to send back to the backend after the upload was completed. */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

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

        fun build(): StoragePresignedUrlCreateResponse =
            StoragePresignedUrlCreateResponse(
                url,
                fields,
                storageUri,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StoragePresignedUrlCreateResponse && url == other.url && fields == other.fields && storageUri == other.storageUri && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(url, fields, storageUri, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StoragePresignedUrlCreateResponse{url=$url, fields=$fields, storageUri=$storageUri, additionalProperties=$additionalProperties}"
}
