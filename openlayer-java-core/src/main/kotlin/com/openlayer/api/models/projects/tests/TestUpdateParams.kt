// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.allMaxBy
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update tests. */
class TestUpdateParams
private constructor(
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payloads(): List<Payload> = body.payloads()

    /**
     * Returns the raw JSON value of [payloads].
     *
     * Unlike [payloads], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payloads(): JsonField<List<Payload>> = body._payloads()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .payloads()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestUpdateParams]. */
    class Builder internal constructor() {

        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testUpdateParams: TestUpdateParams) = apply {
            projectId = testUpdateParams.projectId
            body = testUpdateParams.body.toBuilder()
            additionalHeaders = testUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = testUpdateParams.additionalQueryParams.toBuilder()
        }

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [payloads]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun payloads(payloads: List<Payload>) = apply { body.payloads(payloads) }

        /**
         * Sets [Builder.payloads] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloads] with a well-typed `List<Payload>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payloads(payloads: JsonField<List<Payload>>) = apply { body.payloads(payloads) }

        /**
         * Adds a single [Payload] to [payloads].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayload(payload: Payload) = apply { body.addPayload(payload) }

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
         * Returns an immutable instance of [TestUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payloads()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestUpdateParams =
            TestUpdateParams(
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> projectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val payloads: JsonField<List<Payload>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payloads")
            @ExcludeMissing
            payloads: JsonField<List<Payload>> = JsonMissing.of()
        ) : this(payloads, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payloads(): List<Payload> = payloads.getRequired("payloads")

        /**
         * Returns the raw JSON value of [payloads].
         *
         * Unlike [payloads], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payloads")
        @ExcludeMissing
        fun _payloads(): JsonField<List<Payload>> = payloads

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .payloads()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var payloads: JsonField<MutableList<Payload>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                payloads = body.payloads.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun payloads(payloads: List<Payload>) = payloads(JsonField.of(payloads))

            /**
             * Sets [Builder.payloads] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloads] with a well-typed `List<Payload>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloads(payloads: JsonField<List<Payload>>) = apply {
                this.payloads = payloads.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payload] to [payloads].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayload(payload: Payload) = apply {
                payloads =
                    (payloads ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payloads", it).add(payload)
                    }
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
             *
             * The following fields are required:
             * ```java
             * .payloads()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("payloads", payloads).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            payloads().forEach { it.validate() }
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
            (payloads.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && payloads == other.payloads && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(payloads, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{payloads=$payloads, additionalProperties=$additionalProperties}"
    }

    class Payload
    private constructor(
        private val id: JsonField<String>,
        private val archived: JsonField<Boolean>,
        private val description: JsonValue,
        private val name: JsonField<String>,
        private val suggested: JsonField<Suggested>,
        private val thresholds: JsonField<List<Threshold>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("archived")
            @ExcludeMissing
            archived: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description") @ExcludeMissing description: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suggested")
            @ExcludeMissing
            suggested: JsonField<Suggested> = JsonMissing.of(),
            @JsonProperty("thresholds")
            @ExcludeMissing
            thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
        ) : this(id, archived, description, name, suggested, thresholds, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Whether the test is archived.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun archived(): Optional<Boolean> = archived.getOptional("archived")

        /** The test description. */
        @JsonProperty("description") @ExcludeMissing fun _description(): JsonValue = description

        /**
         * The test name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun suggested(): Optional<Suggested> = suggested.getOptional("suggested")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun thresholds(): Optional<List<Threshold>> = thresholds.getOptional("thresholds")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [archived].
         *
         * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [suggested].
         *
         * Unlike [suggested], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suggested")
        @ExcludeMissing
        fun _suggested(): JsonField<Suggested> = suggested

        /**
         * Returns the raw JSON value of [thresholds].
         *
         * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thresholds")
        @ExcludeMissing
        fun _thresholds(): JsonField<List<Threshold>> = thresholds

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
             * Returns a mutable builder for constructing an instance of [Payload].
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payload]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var archived: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var suggested: JsonField<Suggested> = JsonMissing.of()
            private var thresholds: JsonField<MutableList<Threshold>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payload: Payload) = apply {
                id = payload.id
                archived = payload.archived
                description = payload.description
                name = payload.name
                suggested = payload.suggested
                thresholds = payload.thresholds.map { it.toMutableList() }
                additionalProperties = payload.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Whether the test is archived. */
            fun archived(archived: Boolean) = archived(JsonField.of(archived))

            /**
             * Sets [Builder.archived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            /** The test description. */
            fun description(description: JsonValue) = apply { this.description = description }

            /** The test name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun suggested(suggested: Suggested) = suggested(JsonField.of(suggested))

            /**
             * Sets [Builder.suggested] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suggested] with a well-typed [Suggested] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suggested(suggested: JsonField<Suggested>) = apply { this.suggested = suggested }

            fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

            /**
             * Sets [Builder.thresholds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                this.thresholds = thresholds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Threshold] to [thresholds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addThreshold(threshold: Threshold) = apply {
                thresholds =
                    (thresholds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("thresholds", it).add(threshold)
                    }
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
             * Returns an immutable instance of [Payload].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payload =
                Payload(
                    checkRequired("id", id),
                    archived,
                    description,
                    name,
                    suggested,
                    (thresholds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payload = apply {
            if (validated) {
                return@apply
            }

            id()
            archived()
            name()
            suggested().ifPresent { it.validate() }
            thresholds().ifPresent { it.forEach { it.validate() } }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (archived.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (suggested.asKnown().getOrNull()?.validity() ?: 0) +
                (thresholds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Suggested @JsonCreator private constructor(private val value: JsonField<Boolean>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

            companion object {

                @JvmField val FALSE = of(false)

                @JvmStatic fun of(value: Boolean) = Suggested(JsonField.of(value))
            }

            /** An enum containing [Suggested]'s known values. */
            enum class Known {
                FALSE
            }

            /**
             * An enum containing [Suggested]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Suggested] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                FALSE,
                /**
                 * An enum member indicating that [Suggested] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    FALSE -> Value.FALSE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    FALSE -> Known.FALSE
                    else -> throw OpenlayerInvalidDataException("Unknown Suggested: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asBoolean(): Boolean =
                _value().asBoolean().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a Boolean")
                }

            private var validated: Boolean = false

            fun validate(): Suggested = apply {
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

                return /* spotless:off */ other is Suggested && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Threshold
        private constructor(
            private val insightName: JsonField<InsightName>,
            private val insightParameters: JsonField<List<InsightParameter>>,
            private val measurement: JsonField<String>,
            private val operator: JsonField<Operator>,
            private val thresholdMode: JsonField<ThresholdMode>,
            private val value: JsonField<Value>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("insightName")
                @ExcludeMissing
                insightName: JsonField<InsightName> = JsonMissing.of(),
                @JsonProperty("insightParameters")
                @ExcludeMissing
                insightParameters: JsonField<List<InsightParameter>> = JsonMissing.of(),
                @JsonProperty("measurement")
                @ExcludeMissing
                measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("thresholdMode")
                @ExcludeMissing
                thresholdMode: JsonField<ThresholdMode> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
            ) : this(
                insightName,
                insightParameters,
                measurement,
                operator,
                thresholdMode,
                value,
                mutableMapOf(),
            )

            /**
             * The insight name to be evaluated.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun insightName(): Optional<InsightName> = insightName.getOptional("insightName")

            /**
             * The insight parameters. Required only for some test subtypes. For example, for tests
             * that require a column name, the insight parameters will be
             * [{'name': 'column_name', 'value': 'Age'}]
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun insightParameters(): Optional<List<InsightParameter>> =
                insightParameters.getOptional("insightParameters")

            /**
             * The measurement to be evaluated.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun measurement(): Optional<String> = measurement.getOptional("measurement")

            /**
             * The operator to be used for the evaluation.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun operator(): Optional<Operator> = operator.getOptional("operator")

            /**
             * Whether to use automatic anomaly detection or manual thresholds
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun thresholdMode(): Optional<ThresholdMode> =
                thresholdMode.getOptional("thresholdMode")

            /**
             * The value to be compared.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<Value> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [insightName].
             *
             * Unlike [insightName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("insightName")
            @ExcludeMissing
            fun _insightName(): JsonField<InsightName> = insightName

            /**
             * Returns the raw JSON value of [insightParameters].
             *
             * Unlike [insightParameters], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("insightParameters")
            @ExcludeMissing
            fun _insightParameters(): JsonField<List<InsightParameter>> = insightParameters

            /**
             * Returns the raw JSON value of [measurement].
             *
             * Unlike [measurement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("measurement")
            @ExcludeMissing
            fun _measurement(): JsonField<String> = measurement

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [thresholdMode].
             *
             * Unlike [thresholdMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("thresholdMode")
            @ExcludeMissing
            fun _thresholdMode(): JsonField<ThresholdMode> = thresholdMode

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

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

                /** Returns a mutable builder for constructing an instance of [Threshold]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Threshold]. */
            class Builder internal constructor() {

                private var insightName: JsonField<InsightName> = JsonMissing.of()
                private var insightParameters: JsonField<MutableList<InsightParameter>>? = null
                private var measurement: JsonField<String> = JsonMissing.of()
                private var operator: JsonField<Operator> = JsonMissing.of()
                private var thresholdMode: JsonField<ThresholdMode> = JsonMissing.of()
                private var value: JsonField<Value> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(threshold: Threshold) = apply {
                    insightName = threshold.insightName
                    insightParameters = threshold.insightParameters.map { it.toMutableList() }
                    measurement = threshold.measurement
                    operator = threshold.operator
                    thresholdMode = threshold.thresholdMode
                    value = threshold.value
                    additionalProperties = threshold.additionalProperties.toMutableMap()
                }

                /** The insight name to be evaluated. */
                fun insightName(insightName: InsightName) = insightName(JsonField.of(insightName))

                /**
                 * Sets [Builder.insightName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.insightName] with a well-typed [InsightName]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun insightName(insightName: JsonField<InsightName>) = apply {
                    this.insightName = insightName
                }

                /**
                 * The insight parameters. Required only for some test subtypes. For example, for
                 * tests that require a column name, the insight parameters will be
                 * [{'name': 'column_name', 'value': 'Age'}]
                 */
                fun insightParameters(insightParameters: List<InsightParameter>?) =
                    insightParameters(JsonField.ofNullable(insightParameters))

                /**
                 * Alias for calling [Builder.insightParameters] with
                 * `insightParameters.orElse(null)`.
                 */
                fun insightParameters(insightParameters: Optional<List<InsightParameter>>) =
                    insightParameters(insightParameters.getOrNull())

                /**
                 * Sets [Builder.insightParameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.insightParameters] with a well-typed
                 * `List<InsightParameter>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun insightParameters(insightParameters: JsonField<List<InsightParameter>>) =
                    apply {
                        this.insightParameters = insightParameters.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [InsightParameter] to [insightParameters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInsightParameter(insightParameter: InsightParameter) = apply {
                    insightParameters =
                        (insightParameters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("insightParameters", it).add(insightParameter)
                        }
                }

                /** The measurement to be evaluated. */
                fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                /**
                 * Sets [Builder.measurement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.measurement] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun measurement(measurement: JsonField<String>) = apply {
                    this.measurement = measurement
                }

                /** The operator to be used for the evaluation. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** Whether to use automatic anomaly detection or manual thresholds */
                fun thresholdMode(thresholdMode: ThresholdMode) =
                    thresholdMode(JsonField.of(thresholdMode))

                /**
                 * Sets [Builder.thresholdMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholdMode] with a well-typed [ThresholdMode]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun thresholdMode(thresholdMode: JsonField<ThresholdMode>) = apply {
                    this.thresholdMode = thresholdMode
                }

                /** The value to be compared. */
                fun value(value: Value) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofNumber(number)`. */
                fun value(number: Double) = value(Value.ofNumber(number))

                /** Alias for calling [value] with `Value.ofBool(bool)`. */
                fun value(bool: Boolean) = value(Value.ofBool(bool))

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofStrings(strings)`. */
                fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Threshold].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Threshold =
                    Threshold(
                        insightName,
                        (insightParameters ?: JsonMissing.of()).map { it.toImmutable() },
                        measurement,
                        operator,
                        thresholdMode,
                        value,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Threshold = apply {
                if (validated) {
                    return@apply
                }

                insightName().ifPresent { it.validate() }
                insightParameters().ifPresent { it.forEach { it.validate() } }
                measurement()
                operator().ifPresent { it.validate() }
                thresholdMode().ifPresent { it.validate() }
                value().ifPresent { it.validate() }
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
                (insightName.asKnown().getOrNull()?.validity() ?: 0) +
                    (insightParameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (measurement.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (thresholdMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (value.asKnown().getOrNull()?.validity() ?: 0)

            /** The insight name to be evaluated. */
            class InsightName
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CHARACTER_LENGTH = of("characterLength")

                    @JvmField val CLASS_IMBALANCE = of("classImbalance")

                    @JvmField
                    val EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B = of("expectColumnAToBeInColumnB")

                    @JvmField val COLUMN_AVERAGE = of("columnAverage")

                    @JvmField val COLUMN_DRIFT = of("columnDrift")

                    @JvmField val COLUMN_VALUES_MATCH = of("columnValuesMatch")

                    @JvmField val CONFIDENCE_DISTRIBUTION = of("confidenceDistribution")

                    @JvmField val CONFLICTING_LABEL_ROW_COUNT = of("conflictingLabelRowCount")

                    @JvmField val CONTAINS_PII = of("containsPii")

                    @JvmField val CONTAINS_VALID_URL = of("containsValidUrl")

                    @JvmField val CORRELATED_FEATURES = of("correlatedFeatures")

                    @JvmField val CUSTOM_METRIC = of("customMetric")

                    @JvmField val DUPLICATE_ROW_COUNT = of("duplicateRowCount")

                    @JvmField val EMPTY_FEATURES = of("emptyFeatures")

                    @JvmField val FEATURE_DRIFT = of("featureDrift")

                    @JvmField val FEATURE_PROFILE = of("featureProfile")

                    @JvmField val GREAT_EXPECTATIONS = of("greatExpectations")

                    @JvmField val GROUP_BY_COLUMN_STATS_CHECK = of("groupByColumnStatsCheck")

                    @JvmField val ILL_FORMED_ROW_COUNT = of("illFormedRowCount")

                    @JvmField val IS_CODE = of("isCode")

                    @JvmField val IS_JSON = of("isJson")

                    @JvmField val LLM_RUBRIC_V2 = of("llmRubricV2")

                    @JvmField val LABEL_DRIFT = of("labelDrift")

                    @JvmField val METRICS = of("metrics")

                    @JvmField val NEW_CATEGORIES = of("newCategories")

                    @JvmField val NEW_LABELS = of("newLabels")

                    @JvmField val NULL_ROW_COUNT = of("nullRowCount")

                    @JvmField val PP_SCORE = of("ppScore")

                    @JvmField val QUASI_CONSTANT_FEATURES = of("quasiConstantFeatures")

                    @JvmField val SENTENCE_LENGTH = of("sentenceLength")

                    @JvmField val SIZE_RATIO = of("sizeRatio")

                    @JvmField val SPECIAL_CHARACTERS = of("specialCharacters")

                    @JvmField val STRING_VALIDATION = of("stringValidation")

                    @JvmField val TRAIN_VAL_LEAKAGE_ROW_COUNT = of("trainValLeakageRowCount")

                    @JvmStatic fun of(value: String) = InsightName(JsonField.of(value))
                }

                /** An enum containing [InsightName]'s known values. */
                enum class Known {
                    CHARACTER_LENGTH,
                    CLASS_IMBALANCE,
                    EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B,
                    COLUMN_AVERAGE,
                    COLUMN_DRIFT,
                    COLUMN_VALUES_MATCH,
                    CONFIDENCE_DISTRIBUTION,
                    CONFLICTING_LABEL_ROW_COUNT,
                    CONTAINS_PII,
                    CONTAINS_VALID_URL,
                    CORRELATED_FEATURES,
                    CUSTOM_METRIC,
                    DUPLICATE_ROW_COUNT,
                    EMPTY_FEATURES,
                    FEATURE_DRIFT,
                    FEATURE_PROFILE,
                    GREAT_EXPECTATIONS,
                    GROUP_BY_COLUMN_STATS_CHECK,
                    ILL_FORMED_ROW_COUNT,
                    IS_CODE,
                    IS_JSON,
                    LLM_RUBRIC_V2,
                    LABEL_DRIFT,
                    METRICS,
                    NEW_CATEGORIES,
                    NEW_LABELS,
                    NULL_ROW_COUNT,
                    PP_SCORE,
                    QUASI_CONSTANT_FEATURES,
                    SENTENCE_LENGTH,
                    SIZE_RATIO,
                    SPECIAL_CHARACTERS,
                    STRING_VALIDATION,
                    TRAIN_VAL_LEAKAGE_ROW_COUNT,
                }

                /**
                 * An enum containing [InsightName]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [InsightName] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHARACTER_LENGTH,
                    CLASS_IMBALANCE,
                    EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B,
                    COLUMN_AVERAGE,
                    COLUMN_DRIFT,
                    COLUMN_VALUES_MATCH,
                    CONFIDENCE_DISTRIBUTION,
                    CONFLICTING_LABEL_ROW_COUNT,
                    CONTAINS_PII,
                    CONTAINS_VALID_URL,
                    CORRELATED_FEATURES,
                    CUSTOM_METRIC,
                    DUPLICATE_ROW_COUNT,
                    EMPTY_FEATURES,
                    FEATURE_DRIFT,
                    FEATURE_PROFILE,
                    GREAT_EXPECTATIONS,
                    GROUP_BY_COLUMN_STATS_CHECK,
                    ILL_FORMED_ROW_COUNT,
                    IS_CODE,
                    IS_JSON,
                    LLM_RUBRIC_V2,
                    LABEL_DRIFT,
                    METRICS,
                    NEW_CATEGORIES,
                    NEW_LABELS,
                    NULL_ROW_COUNT,
                    PP_SCORE,
                    QUASI_CONSTANT_FEATURES,
                    SENTENCE_LENGTH,
                    SIZE_RATIO,
                    SPECIAL_CHARACTERS,
                    STRING_VALIDATION,
                    TRAIN_VAL_LEAKAGE_ROW_COUNT,
                    /**
                     * An enum member indicating that [InsightName] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CHARACTER_LENGTH -> Value.CHARACTER_LENGTH
                        CLASS_IMBALANCE -> Value.CLASS_IMBALANCE
                        EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B -> Value.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
                        COLUMN_AVERAGE -> Value.COLUMN_AVERAGE
                        COLUMN_DRIFT -> Value.COLUMN_DRIFT
                        COLUMN_VALUES_MATCH -> Value.COLUMN_VALUES_MATCH
                        CONFIDENCE_DISTRIBUTION -> Value.CONFIDENCE_DISTRIBUTION
                        CONFLICTING_LABEL_ROW_COUNT -> Value.CONFLICTING_LABEL_ROW_COUNT
                        CONTAINS_PII -> Value.CONTAINS_PII
                        CONTAINS_VALID_URL -> Value.CONTAINS_VALID_URL
                        CORRELATED_FEATURES -> Value.CORRELATED_FEATURES
                        CUSTOM_METRIC -> Value.CUSTOM_METRIC
                        DUPLICATE_ROW_COUNT -> Value.DUPLICATE_ROW_COUNT
                        EMPTY_FEATURES -> Value.EMPTY_FEATURES
                        FEATURE_DRIFT -> Value.FEATURE_DRIFT
                        FEATURE_PROFILE -> Value.FEATURE_PROFILE
                        GREAT_EXPECTATIONS -> Value.GREAT_EXPECTATIONS
                        GROUP_BY_COLUMN_STATS_CHECK -> Value.GROUP_BY_COLUMN_STATS_CHECK
                        ILL_FORMED_ROW_COUNT -> Value.ILL_FORMED_ROW_COUNT
                        IS_CODE -> Value.IS_CODE
                        IS_JSON -> Value.IS_JSON
                        LLM_RUBRIC_V2 -> Value.LLM_RUBRIC_V2
                        LABEL_DRIFT -> Value.LABEL_DRIFT
                        METRICS -> Value.METRICS
                        NEW_CATEGORIES -> Value.NEW_CATEGORIES
                        NEW_LABELS -> Value.NEW_LABELS
                        NULL_ROW_COUNT -> Value.NULL_ROW_COUNT
                        PP_SCORE -> Value.PP_SCORE
                        QUASI_CONSTANT_FEATURES -> Value.QUASI_CONSTANT_FEATURES
                        SENTENCE_LENGTH -> Value.SENTENCE_LENGTH
                        SIZE_RATIO -> Value.SIZE_RATIO
                        SPECIAL_CHARACTERS -> Value.SPECIAL_CHARACTERS
                        STRING_VALIDATION -> Value.STRING_VALIDATION
                        TRAIN_VAL_LEAKAGE_ROW_COUNT -> Value.TRAIN_VAL_LEAKAGE_ROW_COUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CHARACTER_LENGTH -> Known.CHARACTER_LENGTH
                        CLASS_IMBALANCE -> Known.CLASS_IMBALANCE
                        EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B -> Known.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
                        COLUMN_AVERAGE -> Known.COLUMN_AVERAGE
                        COLUMN_DRIFT -> Known.COLUMN_DRIFT
                        COLUMN_VALUES_MATCH -> Known.COLUMN_VALUES_MATCH
                        CONFIDENCE_DISTRIBUTION -> Known.CONFIDENCE_DISTRIBUTION
                        CONFLICTING_LABEL_ROW_COUNT -> Known.CONFLICTING_LABEL_ROW_COUNT
                        CONTAINS_PII -> Known.CONTAINS_PII
                        CONTAINS_VALID_URL -> Known.CONTAINS_VALID_URL
                        CORRELATED_FEATURES -> Known.CORRELATED_FEATURES
                        CUSTOM_METRIC -> Known.CUSTOM_METRIC
                        DUPLICATE_ROW_COUNT -> Known.DUPLICATE_ROW_COUNT
                        EMPTY_FEATURES -> Known.EMPTY_FEATURES
                        FEATURE_DRIFT -> Known.FEATURE_DRIFT
                        FEATURE_PROFILE -> Known.FEATURE_PROFILE
                        GREAT_EXPECTATIONS -> Known.GREAT_EXPECTATIONS
                        GROUP_BY_COLUMN_STATS_CHECK -> Known.GROUP_BY_COLUMN_STATS_CHECK
                        ILL_FORMED_ROW_COUNT -> Known.ILL_FORMED_ROW_COUNT
                        IS_CODE -> Known.IS_CODE
                        IS_JSON -> Known.IS_JSON
                        LLM_RUBRIC_V2 -> Known.LLM_RUBRIC_V2
                        LABEL_DRIFT -> Known.LABEL_DRIFT
                        METRICS -> Known.METRICS
                        NEW_CATEGORIES -> Known.NEW_CATEGORIES
                        NEW_LABELS -> Known.NEW_LABELS
                        NULL_ROW_COUNT -> Known.NULL_ROW_COUNT
                        PP_SCORE -> Known.PP_SCORE
                        QUASI_CONSTANT_FEATURES -> Known.QUASI_CONSTANT_FEATURES
                        SENTENCE_LENGTH -> Known.SENTENCE_LENGTH
                        SIZE_RATIO -> Known.SIZE_RATIO
                        SPECIAL_CHARACTERS -> Known.SPECIAL_CHARACTERS
                        STRING_VALIDATION -> Known.STRING_VALIDATION
                        TRAIN_VAL_LEAKAGE_ROW_COUNT -> Known.TRAIN_VAL_LEAKAGE_ROW_COUNT
                        else -> throw OpenlayerInvalidDataException("Unknown InsightName: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): InsightName = apply {
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

                    return /* spotless:off */ other is InsightName && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class InsightParameter
            private constructor(
                private val name: JsonField<String>,
                private val value: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
                ) : this(name, value, mutableMapOf())

                /**
                 * The name of the insight filter.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [InsightParameter].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InsightParameter]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var value: JsonValue? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(insightParameter: InsightParameter) = apply {
                        name = insightParameter.name
                        value = insightParameter.value
                        additionalProperties = insightParameter.additionalProperties.toMutableMap()
                    }

                    /** The name of the insight filter. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun value(value: JsonValue) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [InsightParameter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InsightParameter =
                        InsightParameter(
                            checkRequired("name", name),
                            checkRequired("value", value),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InsightParameter = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InsightParameter && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InsightParameter{name=$name, value=$value, additionalProperties=$additionalProperties}"
            }

            /** The operator to be used for the evaluation. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IS = of("is")

                    @JvmField val GREATER = of(">")

                    @JvmField val GREATER_OR_EQUALS = of(">=")

                    @JvmField val LESS = of("<")

                    @JvmField val LESS_OR_EQUALS = of("<=")

                    @JvmField val NOT_EQUALS = of("!=")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    IS,
                    GREATER,
                    GREATER_OR_EQUALS,
                    LESS,
                    LESS_OR_EQUALS,
                    NOT_EQUALS,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IS,
                    GREATER,
                    GREATER_OR_EQUALS,
                    LESS,
                    LESS_OR_EQUALS,
                    NOT_EQUALS,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IS -> Value.IS
                        GREATER -> Value.GREATER
                        GREATER_OR_EQUALS -> Value.GREATER_OR_EQUALS
                        LESS -> Value.LESS
                        LESS_OR_EQUALS -> Value.LESS_OR_EQUALS
                        NOT_EQUALS -> Value.NOT_EQUALS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IS -> Known.IS
                        GREATER -> Known.GREATER
                        GREATER_OR_EQUALS -> Known.GREATER_OR_EQUALS
                        LESS -> Known.LESS
                        LESS_OR_EQUALS -> Known.LESS_OR_EQUALS
                        NOT_EQUALS -> Known.NOT_EQUALS
                        else -> throw OpenlayerInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Whether to use automatic anomaly detection or manual thresholds */
            class ThresholdMode
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AUTOMATIC = of("automatic")

                    @JvmField val MANUAL = of("manual")

                    @JvmStatic fun of(value: String) = ThresholdMode(JsonField.of(value))
                }

                /** An enum containing [ThresholdMode]'s known values. */
                enum class Known {
                    AUTOMATIC,
                    MANUAL,
                }

                /**
                 * An enum containing [ThresholdMode]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ThresholdMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTOMATIC,
                    MANUAL,
                    /**
                     * An enum member indicating that [ThresholdMode] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTOMATIC -> Value.AUTOMATIC
                        MANUAL -> Value.MANUAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTOMATIC -> Known.AUTOMATIC
                        MANUAL -> Known.MANUAL
                        else -> throw OpenlayerInvalidDataException("Unknown ThresholdMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): ThresholdMode = apply {
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

                    return /* spotless:off */ other is ThresholdMode && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The value to be compared. */
            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val number: Double? = null,
                private val bool: Boolean? = null,
                private val string: String? = null,
                private val strings: List<String>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                fun isNumber(): Boolean = number != null

                fun isBool(): Boolean = bool != null

                fun isString(): Boolean = string != null

                fun isStrings(): Boolean = strings != null

                fun asNumber(): Double = number.getOrThrow("number")

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun asString(): String = string.getOrThrow("string")

                fun asStrings(): List<String> = strings.getOrThrow("strings")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        number != null -> visitor.visitNumber(number)
                        bool != null -> visitor.visitBool(bool)
                        string != null -> visitor.visitString(string)
                        strings != null -> visitor.visitStrings(strings)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitNumber(number: Double) {}

                            override fun visitBool(bool: Boolean) {}

                            override fun visitString(string: String) {}

                            override fun visitStrings(strings: List<String>) {}
                        }
                    )
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
                    accept(
                        object : Visitor<Int> {
                            override fun visitNumber(number: Double) = 1

                            override fun visitBool(bool: Boolean) = 1

                            override fun visitString(string: String) = 1

                            override fun visitStrings(strings: List<String>) = strings.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Value && number == other.number && bool == other.bool && string == other.string && strings == other.strings /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, bool, string, strings) /* spotless:on */

                override fun toString(): String =
                    when {
                        number != null -> "Value{number=$number}"
                        bool != null -> "Value{bool=$bool}"
                        string != null -> "Value{string=$string}"
                        strings != null -> "Value{strings=$strings}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                    @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)

                    @JvmStatic fun ofString(string: String) = Value(string = string)

                    @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitNumber(number: Double): T

                    fun visitBool(bool: Boolean): T

                    fun visitString(string: String): T

                    fun visitStrings(strings: List<String>): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws OpenlayerInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw OpenlayerInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(number = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        Value(bool = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        Value(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // object).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.number != null -> generator.writeObject(value.number)
                            value.bool != null -> generator.writeObject(value.bool)
                            value.string != null -> generator.writeObject(value.string)
                            value.strings != null -> generator.writeObject(value.strings)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Threshold && insightName == other.insightName && insightParameters == other.insightParameters && measurement == other.measurement && operator == other.operator && thresholdMode == other.thresholdMode && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(insightName, insightParameters, measurement, operator, thresholdMode, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Threshold{insightName=$insightName, insightParameters=$insightParameters, measurement=$measurement, operator=$operator, thresholdMode=$thresholdMode, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Payload && id == other.id && archived == other.archived && description == other.description && name == other.name && suggested == other.suggested && thresholds == other.thresholds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, archived, description, name, suggested, thresholds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payload{id=$id, archived=$archived, description=$description, name=$name, suggested=$suggested, thresholds=$thresholds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TestUpdateParams && projectId == other.projectId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TestUpdateParams{projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
