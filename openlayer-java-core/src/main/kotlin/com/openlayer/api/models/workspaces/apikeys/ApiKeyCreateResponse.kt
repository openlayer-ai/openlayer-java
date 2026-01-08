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
import com.openlayer.api.core.checkRequired
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiKeyCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateLastUsed: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val secureKey: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateLastUsed")
        @ExcludeMissing
        dateLastUsed: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("secureKey") @ExcludeMissing secureKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(id, dateCreated, dateLastUsed, dateUpdated, secureKey, name, mutableMapOf())

    /**
     * The API key id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The API key creation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /**
     * The API key last use date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastUsed(): Optional<OffsetDateTime> = dateLastUsed.getOptional("dateLastUsed")

    /**
     * The API key last update date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /**
     * The API key value.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secureKey(): String = secureKey.getRequired("secureKey")

    /**
     * The API key name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateCreated")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /**
     * Returns the raw JSON value of [dateLastUsed].
     *
     * Unlike [dateLastUsed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateLastUsed")
    @ExcludeMissing
    fun _dateLastUsed(): JsonField<OffsetDateTime> = dateLastUsed

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [secureKey].
     *
     * Unlike [secureKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secureKey") @ExcludeMissing fun _secureKey(): JsonField<String> = secureKey

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [ApiKeyCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastUsed()
         * .dateUpdated()
         * .secureKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateLastUsed: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var secureKey: JsonField<String>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyCreateResponse: ApiKeyCreateResponse) = apply {
            id = apiKeyCreateResponse.id
            dateCreated = apiKeyCreateResponse.dateCreated
            dateLastUsed = apiKeyCreateResponse.dateLastUsed
            dateUpdated = apiKeyCreateResponse.dateUpdated
            secureKey = apiKeyCreateResponse.secureKey
            name = apiKeyCreateResponse.name
            additionalProperties = apiKeyCreateResponse.additionalProperties.toMutableMap()
        }

        /** The API key id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The API key creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /** The API key last use date. */
        fun dateLastUsed(dateLastUsed: OffsetDateTime?) =
            dateLastUsed(JsonField.ofNullable(dateLastUsed))

        /** Alias for calling [Builder.dateLastUsed] with `dateLastUsed.orElse(null)`. */
        fun dateLastUsed(dateLastUsed: Optional<OffsetDateTime>) =
            dateLastUsed(dateLastUsed.getOrNull())

        /**
         * Sets [Builder.dateLastUsed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastUsed] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLastUsed(dateLastUsed: JsonField<OffsetDateTime>) = apply {
            this.dateLastUsed = dateLastUsed
        }

        /** The API key last update date. */
        fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The API key value. */
        fun secureKey(secureKey: String) = secureKey(JsonField.of(secureKey))

        /**
         * Sets [Builder.secureKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secureKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secureKey(secureKey: JsonField<String>) = apply { this.secureKey = secureKey }

        /** The API key name. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [ApiKeyCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastUsed()
         * .dateUpdated()
         * .secureKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyCreateResponse =
            ApiKeyCreateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateLastUsed", dateLastUsed),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("secureKey", secureKey),
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiKeyCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateLastUsed()
        dateUpdated()
        secureKey()
        name()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateLastUsed.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (secureKey.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyCreateResponse &&
            id == other.id &&
            dateCreated == other.dateCreated &&
            dateLastUsed == other.dateLastUsed &&
            dateUpdated == other.dateUpdated &&
            secureKey == other.secureKey &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dateCreated,
            dateLastUsed,
            dateUpdated,
            secureKey,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyCreateResponse{id=$id, dateCreated=$dateCreated, dateLastUsed=$dateLastUsed, dateUpdated=$dateUpdated, secureKey=$secureKey, name=$name, additionalProperties=$additionalProperties}"
}
