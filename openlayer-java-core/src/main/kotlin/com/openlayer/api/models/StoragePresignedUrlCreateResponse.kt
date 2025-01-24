// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class StoragePresignedUrlCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("storageUri")
    @ExcludeMissing
    private val storageUri: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("fields") @ExcludeMissing private val fields: JsonValue = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The storage URI to send back to the backend after the upload was completed. */
    fun storageUri(): String = storageUri.getRequired("storageUri")

    /** The presigned url. */
    fun url(): String = url.getRequired("url")

    /** Fields to include in the body of the upload. Only needed by s3 */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonValue = fields

    /** The storage URI to send back to the backend after the upload was completed. */
    @JsonProperty("storageUri") @ExcludeMissing fun _storageUri(): JsonField<String> = storageUri

    /** The presigned url. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): StoragePresignedUrlCreateResponse = apply {
        if (validated) {
            return@apply
        }

        storageUri()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var storageUri: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var fields: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(storagePresignedUrlCreateResponse: StoragePresignedUrlCreateResponse) =
            apply {
                storageUri = storagePresignedUrlCreateResponse.storageUri
                url = storagePresignedUrlCreateResponse.url
                fields = storagePresignedUrlCreateResponse.fields
                additionalProperties =
                    storagePresignedUrlCreateResponse.additionalProperties.toMutableMap()
            }

        /** The storage URI to send back to the backend after the upload was completed. */
        fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

        /** The storage URI to send back to the backend after the upload was completed. */
        fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

        /** The presigned url. */
        fun url(url: String) = url(JsonField.of(url))

        /** The presigned url. */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Fields to include in the body of the upload. Only needed by s3 */
        fun fields(fields: JsonValue) = apply { this.fields = fields }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): StoragePresignedUrlCreateResponse =
            StoragePresignedUrlCreateResponse(
                checkRequired("storageUri", storageUri),
                checkRequired("url", url),
                fields,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StoragePresignedUrlCreateResponse && storageUri == other.storageUri && url == other.url && fields == other.fields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(storageUri, url, fields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StoragePresignedUrlCreateResponse{storageUri=$storageUri, url=$url, fields=$fields, additionalProperties=$additionalProperties}"
}
