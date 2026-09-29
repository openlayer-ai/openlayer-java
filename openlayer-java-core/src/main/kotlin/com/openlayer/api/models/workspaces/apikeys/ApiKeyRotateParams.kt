// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Replace an API key's secret now. The new secret is returned in `secret`, only in this response.
 * Send `expiresAt` to change the key's expiry (`null` for never); omit it to keep the current one.
 * The previous secret keeps authenticating for `gracePeriodHours` (default 0, so it stops working
 * immediately), and never past `expiresAt`. The key keeps its id and name. Expired keys cannot be
 * rotated. Only one previous secret is kept, so rotating again during a grace period retires the
 * older one immediately.
 */
class ApiKeyRotateParams
private constructor(
    private val workspaceId: String,
    private val apiKeyId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun workspaceId(): String = workspaceId

    fun apiKeyId(): Optional<String> = Optional.ofNullable(apiKeyId)

    /**
     * When the key stops authenticating. `null` means the key never expires. Set when the key is
     * created or rotated, and must be in the future. When the request is authenticated with an API
     * key that expires, the result can't be later than that key's expiry.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = body.expiresAt()

    /**
     * Hours the previous secret keeps authenticating.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gracePeriodHours(): Optional<Long> = body.gracePeriodHours()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<OffsetDateTime> = body._expiresAt()

    /**
     * Returns the raw JSON value of [gracePeriodHours].
     *
     * Unlike [gracePeriodHours], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _gracePeriodHours(): JsonField<Long> = body._gracePeriodHours()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ApiKeyRotateParams].
         *
         * The following fields are required:
         * ```java
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyRotateParams]. */
    class Builder internal constructor() {

        private var workspaceId: String? = null
        private var apiKeyId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(apiKeyRotateParams: ApiKeyRotateParams) = apply {
            workspaceId = apiKeyRotateParams.workspaceId
            apiKeyId = apiKeyRotateParams.apiKeyId
            body = apiKeyRotateParams.body.toBuilder()
            additionalHeaders = apiKeyRotateParams.additionalHeaders.toBuilder()
            additionalQueryParams = apiKeyRotateParams.additionalQueryParams.toBuilder()
        }

        fun workspaceId(workspaceId: String) = apply { this.workspaceId = workspaceId }

        fun apiKeyId(apiKeyId: String?) = apply { this.apiKeyId = apiKeyId }

        /** Alias for calling [Builder.apiKeyId] with `apiKeyId.orElse(null)`. */
        fun apiKeyId(apiKeyId: Optional<String>) = apiKeyId(apiKeyId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [expiresAt]
         * - [gracePeriodHours]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * When the key stops authenticating. `null` means the key never expires. Set when the key
         * is created or rotated, and must be in the future. When the request is authenticated with
         * an API key that expires, the result can't be later than that key's expiry.
         */
        fun expiresAt(expiresAt: OffsetDateTime?) = apply { body.expiresAt(expiresAt) }

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { body.expiresAt(expiresAt) }

        /** Hours the previous secret keeps authenticating. */
        fun gracePeriodHours(gracePeriodHours: Long) = apply {
            body.gracePeriodHours(gracePeriodHours)
        }

        /**
         * Sets [Builder.gracePeriodHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gracePeriodHours] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gracePeriodHours(gracePeriodHours: JsonField<Long>) = apply {
            body.gracePeriodHours(gracePeriodHours)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ApiKeyRotateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyRotateParams =
            ApiKeyRotateParams(
                checkRequired("workspaceId", workspaceId),
                apiKeyId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> workspaceId
            1 -> apiKeyId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresAt: JsonField<OffsetDateTime>,
        private val gracePeriodHours: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("gracePeriodHours")
            @ExcludeMissing
            gracePeriodHours: JsonField<Long> = JsonMissing.of(),
        ) : this(expiresAt, gracePeriodHours, mutableMapOf())

        /**
         * When the key stops authenticating. `null` means the key never expires. Set when the key
         * is created or rotated, and must be in the future. When the request is authenticated with
         * an API key that expires, the result can't be later than that key's expiry.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

        /**
         * Hours the previous secret keeps authenticating.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gracePeriodHours(): Optional<Long> = gracePeriodHours.getOptional("gracePeriodHours")

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [gracePeriodHours].
         *
         * Unlike [gracePeriodHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gracePeriodHours")
        @ExcludeMissing
        fun _gracePeriodHours(): JsonField<Long> = gracePeriodHours

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gracePeriodHours: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                expiresAt = body.expiresAt
                gracePeriodHours = body.gracePeriodHours
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * When the key stops authenticating. `null` means the key never expires. Set when the
             * key is created or rotated, and must be in the future. When the request is
             * authenticated with an API key that expires, the result can't be later than that key's
             * expiry.
             */
            fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

            /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
            fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /** Hours the previous secret keeps authenticating. */
            fun gracePeriodHours(gracePeriodHours: Long) =
                gracePeriodHours(JsonField.of(gracePeriodHours))

            /**
             * Sets [Builder.gracePeriodHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gracePeriodHours] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gracePeriodHours(gracePeriodHours: JsonField<Long>) = apply {
                this.gracePeriodHours = gracePeriodHours
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(expiresAt, gracePeriodHours, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            gracePeriodHours()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (gracePeriodHours.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                expiresAt == other.expiresAt &&
                gracePeriodHours == other.gracePeriodHours &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresAt, gracePeriodHours, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{expiresAt=$expiresAt, gracePeriodHours=$gracePeriodHours, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyRotateParams &&
            workspaceId == other.workspaceId &&
            apiKeyId == other.apiKeyId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(workspaceId, apiKeyId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ApiKeyRotateParams{workspaceId=$workspaceId, apiKeyId=$apiKeyId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
