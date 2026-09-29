// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.workspaces.apikeys

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
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

class ApiKeyUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateLastUsed: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val secureKey: JsonField<String>,
    private val status: JsonField<Status>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val lastRotatedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val previousKeyExpiresAt: JsonField<OffsetDateTime>,
    private val secret: JsonField<String>,
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
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastRotatedAt")
        @ExcludeMissing
        lastRotatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previousKeyExpiresAt")
        @ExcludeMissing
        previousKeyExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("secret") @ExcludeMissing secret: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        dateCreated,
        dateLastUsed,
        dateUpdated,
        secureKey,
        status,
        expiresAt,
        lastRotatedAt,
        name,
        previousKeyExpiresAt,
        secret,
        mutableMapOf(),
    )

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
     * An obfuscated hint of the API key value. When a key is created or rotated this also holds the
     * full secret, for backward compatibility; prefer `secret`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secureKey(): String = secureKey.getRequired("secureKey")

    /**
     * The key's lifecycle state. `active`: the current secret authenticates. `rotating`: the key
     * was rotated and the previous secret still authenticates until `previousKeyExpiresAt`.
     * `expired`: `expiresAt` has passed, no secret authenticates, and the key can't be rotated.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When the key stops authenticating. `null` means the key never expires. Set when the key is
     * created or rotated, and must be in the future. When the request is authenticated with an API
     * key that expires, the result can't be later than that key's expiry. On create, omit it to
     * inherit that expiry. On rotate, omit it to keep the current one. It can't be changed with an
     * update; rotate the key instead.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expiresAt")

    /**
     * When the key was last rotated.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastRotatedAt(): Optional<OffsetDateTime> = lastRotatedAt.getOptional("lastRotatedAt")

    /**
     * The API key name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * While `status` is `rotating`, when the previous secret stops authenticating.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousKeyExpiresAt(): Optional<OffsetDateTime> =
        previousKeyExpiresAt.getOptional("previousKeyExpiresAt")

    /**
     * The full API key. Only present in the response that creates or rotates the key, and never
     * shown again.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secret(): Optional<String> = secret.getOptional("secret")

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [lastRotatedAt].
     *
     * Unlike [lastRotatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastRotatedAt")
    @ExcludeMissing
    fun _lastRotatedAt(): JsonField<OffsetDateTime> = lastRotatedAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [previousKeyExpiresAt].
     *
     * Unlike [previousKeyExpiresAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previousKeyExpiresAt")
    @ExcludeMissing
    fun _previousKeyExpiresAt(): JsonField<OffsetDateTime> = previousKeyExpiresAt

    /**
     * Returns the raw JSON value of [secret].
     *
     * Unlike [secret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

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
         * Returns a mutable builder for constructing an instance of [ApiKeyUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastUsed()
         * .dateUpdated()
         * .secureKey()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateLastUsed: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var secureKey: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastRotatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var previousKeyExpiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyUpdateResponse: ApiKeyUpdateResponse) = apply {
            id = apiKeyUpdateResponse.id
            dateCreated = apiKeyUpdateResponse.dateCreated
            dateLastUsed = apiKeyUpdateResponse.dateLastUsed
            dateUpdated = apiKeyUpdateResponse.dateUpdated
            secureKey = apiKeyUpdateResponse.secureKey
            status = apiKeyUpdateResponse.status
            expiresAt = apiKeyUpdateResponse.expiresAt
            lastRotatedAt = apiKeyUpdateResponse.lastRotatedAt
            name = apiKeyUpdateResponse.name
            previousKeyExpiresAt = apiKeyUpdateResponse.previousKeyExpiresAt
            secret = apiKeyUpdateResponse.secret
            additionalProperties = apiKeyUpdateResponse.additionalProperties.toMutableMap()
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

        /**
         * An obfuscated hint of the API key value. When a key is created or rotated this also holds
         * the full secret, for backward compatibility; prefer `secret`.
         */
        fun secureKey(secureKey: String) = secureKey(JsonField.of(secureKey))

        /**
         * Sets [Builder.secureKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secureKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secureKey(secureKey: JsonField<String>) = apply { this.secureKey = secureKey }

        /**
         * The key's lifecycle state. `active`: the current secret authenticates. `rotating`: the
         * key was rotated and the previous secret still authenticates until `previousKeyExpiresAt`.
         * `expired`: `expiresAt` has passed, no secret authenticates, and the key can't be rotated.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * When the key stops authenticating. `null` means the key never expires. Set when the key
         * is created or rotated, and must be in the future. When the request is authenticated with
         * an API key that expires, the result can't be later than that key's expiry. On create,
         * omit it to inherit that expiry. On rotate, omit it to keep the current one. It can't be
         * changed with an update; rotate the key instead.
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
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** When the key was last rotated. */
        fun lastRotatedAt(lastRotatedAt: OffsetDateTime?) =
            lastRotatedAt(JsonField.ofNullable(lastRotatedAt))

        /** Alias for calling [Builder.lastRotatedAt] with `lastRotatedAt.orElse(null)`. */
        fun lastRotatedAt(lastRotatedAt: Optional<OffsetDateTime>) =
            lastRotatedAt(lastRotatedAt.getOrNull())

        /**
         * Sets [Builder.lastRotatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastRotatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastRotatedAt(lastRotatedAt: JsonField<OffsetDateTime>) = apply {
            this.lastRotatedAt = lastRotatedAt
        }

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

        /** While `status` is `rotating`, when the previous secret stops authenticating. */
        fun previousKeyExpiresAt(previousKeyExpiresAt: OffsetDateTime?) =
            previousKeyExpiresAt(JsonField.ofNullable(previousKeyExpiresAt))

        /**
         * Alias for calling [Builder.previousKeyExpiresAt] with
         * `previousKeyExpiresAt.orElse(null)`.
         */
        fun previousKeyExpiresAt(previousKeyExpiresAt: Optional<OffsetDateTime>) =
            previousKeyExpiresAt(previousKeyExpiresAt.getOrNull())

        /**
         * Sets [Builder.previousKeyExpiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousKeyExpiresAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previousKeyExpiresAt(previousKeyExpiresAt: JsonField<OffsetDateTime>) = apply {
            this.previousKeyExpiresAt = previousKeyExpiresAt
        }

        /**
         * The full API key. Only present in the response that creates or rotates the key, and never
         * shown again.
         */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /**
         * Sets [Builder.secret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secret] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

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
         * Returns an immutable instance of [ApiKeyUpdateResponse].
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
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyUpdateResponse =
            ApiKeyUpdateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateLastUsed", dateLastUsed),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("secureKey", secureKey),
                checkRequired("status", status),
                expiresAt,
                lastRotatedAt,
                name,
                previousKeyExpiresAt,
                secret,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ApiKeyUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateLastUsed()
        dateUpdated()
        secureKey()
        status().validate()
        expiresAt()
        lastRotatedAt()
        name()
        previousKeyExpiresAt()
        secret()
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
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (lastRotatedAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (previousKeyExpiresAt.asKnown().isPresent) 1 else 0) +
            (if (secret.asKnown().isPresent) 1 else 0)

    /**
     * The key's lifecycle state. `active`: the current secret authenticates. `rotating`: the key
     * was rotated and the previous secret still authenticates until `previousKeyExpiresAt`.
     * `expired`: `expiresAt` has passed, no secret authenticates, and the key can't be rotated.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val ROTATING = of("rotating")

            @JvmField val EXPIRED = of("expired")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ROTATING,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            ROTATING,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ROTATING -> Value.ROTATING
                EXPIRED -> Value.EXPIRED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ROTATING -> Known.ROTATING
                EXPIRED -> Known.EXPIRED
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                OpenlayerInvalidDataException("Value is not a String")
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
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyUpdateResponse &&
            id == other.id &&
            dateCreated == other.dateCreated &&
            dateLastUsed == other.dateLastUsed &&
            dateUpdated == other.dateUpdated &&
            secureKey == other.secureKey &&
            status == other.status &&
            expiresAt == other.expiresAt &&
            lastRotatedAt == other.lastRotatedAt &&
            name == other.name &&
            previousKeyExpiresAt == other.previousKeyExpiresAt &&
            secret == other.secret &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dateCreated,
            dateLastUsed,
            dateUpdated,
            secureKey,
            status,
            expiresAt,
            lastRotatedAt,
            name,
            previousKeyExpiresAt,
            secret,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyUpdateResponse{id=$id, dateCreated=$dateCreated, dateLastUsed=$dateLastUsed, dateUpdated=$dateUpdated, secureKey=$secureKey, status=$status, expiresAt=$expiresAt, lastRotatedAt=$lastRotatedAt, name=$name, previousKeyExpiresAt=$previousKeyExpiresAt, secret=$secret, additionalProperties=$additionalProperties}"
}
