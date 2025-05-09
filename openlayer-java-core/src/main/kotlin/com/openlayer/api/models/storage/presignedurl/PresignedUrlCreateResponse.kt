// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.storage.presignedurl

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkRequired
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects

class PresignedUrlCreateResponse
private constructor(
    private val storageUri: JsonField<String>,
    private val url: JsonField<String>,
    private val fields: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("storageUri")
        @ExcludeMissing
        storageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fields") @ExcludeMissing fields: JsonValue = JsonMissing.of(),
    ) : this(storageUri, url, fields, mutableMapOf())

    /**
     * The storage URI to send back to the backend after the upload was completed.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun storageUri(): String = storageUri.getRequired("storageUri")

    /**
     * The presigned url.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /** Fields to include in the body of the upload. Only needed by s3 */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonValue = fields

    /**
     * Returns the raw JSON value of [storageUri].
     *
     * Unlike [storageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("storageUri") @ExcludeMissing fun _storageUri(): JsonField<String> = storageUri

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PresignedUrlCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .storageUri()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PresignedUrlCreateResponse]. */
    class Builder internal constructor() {

        private var storageUri: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var fields: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(presignedUrlCreateResponse: PresignedUrlCreateResponse) = apply {
            storageUri = presignedUrlCreateResponse.storageUri
            url = presignedUrlCreateResponse.url
            fields = presignedUrlCreateResponse.fields
            additionalProperties = presignedUrlCreateResponse.additionalProperties.toMutableMap()
        }

        /** The storage URI to send back to the backend after the upload was completed. */
        fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

        /**
         * Sets [Builder.storageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

        /** The presigned url. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [PresignedUrlCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .storageUri()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PresignedUrlCreateResponse =
            PresignedUrlCreateResponse(
                checkRequired("storageUri", storageUri),
                checkRequired("url", url),
                fields,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PresignedUrlCreateResponse = apply {
        if (validated) {
            return@apply
        }

        storageUri()
        url()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OpenlayerInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (storageUri.asKnown().isPresent) 1 else 0) + (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PresignedUrlCreateResponse && storageUri == other.storageUri && url == other.url && fields == other.fields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(storageUri, url, fields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PresignedUrlCreateResponse{storageUri=$storageUri, url=$url, fields=$fields, additionalProperties=$additionalProperties}"
}
