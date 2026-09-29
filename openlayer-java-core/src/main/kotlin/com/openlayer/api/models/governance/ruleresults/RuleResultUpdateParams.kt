// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a rule result. */
class RuleResultUpdateParams
private constructor(
    private val ruleResultId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun ruleResultId(): Optional<String> = Optional.ofNullable(ruleResultId)

    /**
     * The user responsible for this result.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assigneeId(): Optional<String> = body.assigneeId()

    /**
     * Rule results that must pass before this one can be satisfied.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockedBy(): Optional<List<BlockedBy>> = body.blockedBy()

    /**
     * Rule results that this one blocks.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocking(): Optional<List<Blocking>> = body.blocking()

    /**
     * Whether this result is excluded from compliance calculations. Excludes just this result,
     * without deactivating the rule everywhere.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivated(): Optional<Boolean> = body.deactivated()

    /**
     * Why the result was excluded. Required when setting `deactivated` to `true`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivatedReason(): Optional<String> = body.deactivatedReason()

    /**
     * Returns the raw JSON value of [assigneeId].
     *
     * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assigneeId(): JsonField<String> = body._assigneeId()

    /**
     * Returns the raw JSON value of [blockedBy].
     *
     * Unlike [blockedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blockedBy(): JsonField<List<BlockedBy>> = body._blockedBy()

    /**
     * Returns the raw JSON value of [blocking].
     *
     * Unlike [blocking], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _blocking(): JsonField<List<Blocking>> = body._blocking()

    /**
     * Returns the raw JSON value of [deactivated].
     *
     * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deactivated(): JsonField<Boolean> = body._deactivated()

    /**
     * Returns the raw JSON value of [deactivatedReason].
     *
     * Unlike [deactivatedReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deactivatedReason(): JsonField<String> = body._deactivatedReason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RuleResultUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleResultUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleResultUpdateParams]. */
    class Builder internal constructor() {

        private var ruleResultId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleResultUpdateParams: RuleResultUpdateParams) = apply {
            ruleResultId = ruleResultUpdateParams.ruleResultId
            body = ruleResultUpdateParams.body.toBuilder()
            additionalHeaders = ruleResultUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleResultUpdateParams.additionalQueryParams.toBuilder()
        }

        fun ruleResultId(ruleResultId: String?) = apply { this.ruleResultId = ruleResultId }

        /** Alias for calling [Builder.ruleResultId] with `ruleResultId.orElse(null)`. */
        fun ruleResultId(ruleResultId: Optional<String>) = ruleResultId(ruleResultId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assigneeId]
         * - [blockedBy]
         * - [blocking]
         * - [deactivated]
         * - [deactivatedReason]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The user responsible for this result. */
        fun assigneeId(assigneeId: String?) = apply { body.assigneeId(assigneeId) }

        /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
        fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

        /**
         * Sets [Builder.assigneeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assigneeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assigneeId(assigneeId: JsonField<String>) = apply { body.assigneeId(assigneeId) }

        /** Rule results that must pass before this one can be satisfied. */
        fun blockedBy(blockedBy: List<BlockedBy>) = apply { body.blockedBy(blockedBy) }

        /**
         * Sets [Builder.blockedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedBy] with a well-typed `List<BlockedBy>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedBy(blockedBy: JsonField<List<BlockedBy>>) = apply { body.blockedBy(blockedBy) }

        /**
         * Adds a single [BlockedBy] to [Builder.blockedBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedBy(blockedBy: BlockedBy) = apply { body.addBlockedBy(blockedBy) }

        /** Rule results that this one blocks. */
        fun blocking(blocking: List<Blocking>) = apply { body.blocking(blocking) }

        /**
         * Sets [Builder.blocking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocking] with a well-typed `List<Blocking>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blocking(blocking: JsonField<List<Blocking>>) = apply { body.blocking(blocking) }

        /**
         * Adds a single [Blocking] to [Builder.blocking].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlocking(blocking: Blocking) = apply { body.addBlocking(blocking) }

        /**
         * Whether this result is excluded from compliance calculations. Excludes just this result,
         * without deactivating the rule everywhere.
         */
        fun deactivated(deactivated: Boolean) = apply { body.deactivated(deactivated) }

        /**
         * Sets [Builder.deactivated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deactivated(deactivated: JsonField<Boolean>) = apply { body.deactivated(deactivated) }

        /** Why the result was excluded. Required when setting `deactivated` to `true`. */
        fun deactivatedReason(deactivatedReason: String?) = apply {
            body.deactivatedReason(deactivatedReason)
        }

        /** Alias for calling [Builder.deactivatedReason] with `deactivatedReason.orElse(null)`. */
        fun deactivatedReason(deactivatedReason: Optional<String>) =
            deactivatedReason(deactivatedReason.getOrNull())

        /**
         * Sets [Builder.deactivatedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivatedReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deactivatedReason(deactivatedReason: JsonField<String>) = apply {
            body.deactivatedReason(deactivatedReason)
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
         * Returns an immutable instance of [RuleResultUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleResultUpdateParams =
            RuleResultUpdateParams(
                ruleResultId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> ruleResultId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assigneeId: JsonField<String>,
        private val blockedBy: JsonField<List<BlockedBy>>,
        private val blocking: JsonField<List<Blocking>>,
        private val deactivated: JsonField<Boolean>,
        private val deactivatedReason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assigneeId")
            @ExcludeMissing
            assigneeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("blockedBy")
            @ExcludeMissing
            blockedBy: JsonField<List<BlockedBy>> = JsonMissing.of(),
            @JsonProperty("blocking")
            @ExcludeMissing
            blocking: JsonField<List<Blocking>> = JsonMissing.of(),
            @JsonProperty("deactivated")
            @ExcludeMissing
            deactivated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("deactivatedReason")
            @ExcludeMissing
            deactivatedReason: JsonField<String> = JsonMissing.of(),
        ) : this(assigneeId, blockedBy, blocking, deactivated, deactivatedReason, mutableMapOf())

        /**
         * The user responsible for this result.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

        /**
         * Rule results that must pass before this one can be satisfied.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockedBy(): Optional<List<BlockedBy>> = blockedBy.getOptional("blockedBy")

        /**
         * Rule results that this one blocks.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blocking(): Optional<List<Blocking>> = blocking.getOptional("blocking")

        /**
         * Whether this result is excluded from compliance calculations. Excludes just this result,
         * without deactivating the rule everywhere.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

        /**
         * Why the result was excluded. Required when setting `deactivated` to `true`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deactivatedReason(): Optional<String> =
            deactivatedReason.getOptional("deactivatedReason")

        /**
         * Returns the raw JSON value of [assigneeId].
         *
         * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assigneeId")
        @ExcludeMissing
        fun _assigneeId(): JsonField<String> = assigneeId

        /**
         * Returns the raw JSON value of [blockedBy].
         *
         * Unlike [blockedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blockedBy")
        @ExcludeMissing
        fun _blockedBy(): JsonField<List<BlockedBy>> = blockedBy

        /**
         * Returns the raw JSON value of [blocking].
         *
         * Unlike [blocking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("blocking")
        @ExcludeMissing
        fun _blocking(): JsonField<List<Blocking>> = blocking

        /**
         * Returns the raw JSON value of [deactivated].
         *
         * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deactivated")
        @ExcludeMissing
        fun _deactivated(): JsonField<Boolean> = deactivated

        /**
         * Returns the raw JSON value of [deactivatedReason].
         *
         * Unlike [deactivatedReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deactivatedReason")
        @ExcludeMissing
        fun _deactivatedReason(): JsonField<String> = deactivatedReason

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

            private var assigneeId: JsonField<String> = JsonMissing.of()
            private var blockedBy: JsonField<MutableList<BlockedBy>>? = null
            private var blocking: JsonField<MutableList<Blocking>>? = null
            private var deactivated: JsonField<Boolean> = JsonMissing.of()
            private var deactivatedReason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assigneeId = body.assigneeId
                blockedBy = body.blockedBy.map { it.toMutableList() }
                blocking = body.blocking.map { it.toMutableList() }
                deactivated = body.deactivated
                deactivatedReason = body.deactivatedReason
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The user responsible for this result. */
            fun assigneeId(assigneeId: String?) = assigneeId(JsonField.ofNullable(assigneeId))

            /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
            fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

            /**
             * Sets [Builder.assigneeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assigneeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assigneeId(assigneeId: JsonField<String>) = apply { this.assigneeId = assigneeId }

            /** Rule results that must pass before this one can be satisfied. */
            fun blockedBy(blockedBy: List<BlockedBy>) = blockedBy(JsonField.of(blockedBy))

            /**
             * Sets [Builder.blockedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockedBy] with a well-typed `List<BlockedBy>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockedBy(blockedBy: JsonField<List<BlockedBy>>) = apply {
                this.blockedBy = blockedBy.map { it.toMutableList() }
            }

            /**
             * Adds a single [BlockedBy] to [Builder.blockedBy].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBlockedBy(blockedBy: BlockedBy) = apply {
                this.blockedBy =
                    (this.blockedBy ?: JsonField.of(mutableListOf())).also {
                        checkKnown("blockedBy", it).add(blockedBy)
                    }
            }

            /** Rule results that this one blocks. */
            fun blocking(blocking: List<Blocking>) = blocking(JsonField.of(blocking))

            /**
             * Sets [Builder.blocking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blocking] with a well-typed `List<Blocking>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blocking(blocking: JsonField<List<Blocking>>) = apply {
                this.blocking = blocking.map { it.toMutableList() }
            }

            /**
             * Adds a single [Blocking] to [Builder.blocking].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBlocking(blocking: Blocking) = apply {
                this.blocking =
                    (this.blocking ?: JsonField.of(mutableListOf())).also {
                        checkKnown("blocking", it).add(blocking)
                    }
            }

            /**
             * Whether this result is excluded from compliance calculations. Excludes just this
             * result, without deactivating the rule everywhere.
             */
            fun deactivated(deactivated: Boolean) = deactivated(JsonField.of(deactivated))

            /**
             * Sets [Builder.deactivated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deactivated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deactivated(deactivated: JsonField<Boolean>) = apply {
                this.deactivated = deactivated
            }

            /** Why the result was excluded. Required when setting `deactivated` to `true`. */
            fun deactivatedReason(deactivatedReason: String?) =
                deactivatedReason(JsonField.ofNullable(deactivatedReason))

            /**
             * Alias for calling [Builder.deactivatedReason] with `deactivatedReason.orElse(null)`.
             */
            fun deactivatedReason(deactivatedReason: Optional<String>) =
                deactivatedReason(deactivatedReason.getOrNull())

            /**
             * Sets [Builder.deactivatedReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deactivatedReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deactivatedReason(deactivatedReason: JsonField<String>) = apply {
                this.deactivatedReason = deactivatedReason
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
                Body(
                    assigneeId,
                    (blockedBy ?: JsonMissing.of()).map { it.toImmutable() },
                    (blocking ?: JsonMissing.of()).map { it.toImmutable() },
                    deactivated,
                    deactivatedReason,
                    additionalProperties.toMutableMap(),
                )
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

            assigneeId()
            blockedBy().ifPresent { it.forEach { it.validate() } }
            blocking().ifPresent { it.forEach { it.validate() } }
            deactivated()
            deactivatedReason()
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
            (if (assigneeId.asKnown().isPresent) 1 else 0) +
                (blockedBy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (blocking.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (deactivated.asKnown().isPresent) 1 else 0) +
                (if (deactivatedReason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assigneeId == other.assigneeId &&
                blockedBy == other.blockedBy &&
                blocking == other.blocking &&
                deactivated == other.deactivated &&
                deactivatedReason == other.deactivatedReason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assigneeId,
                blockedBy,
                blocking,
                deactivated,
                deactivatedReason,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assigneeId=$assigneeId, blockedBy=$blockedBy, blocking=$blocking, deactivated=$deactivated, deactivatedReason=$deactivatedReason, additionalProperties=$additionalProperties}"
    }

    class BlockedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(id, status, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The compliance status of the rule for this entity. Computed by Openlayer and can't be set
         * directly.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [BlockedBy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BlockedBy]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(blockedBy: BlockedBy) = apply {
                id = blockedBy.id
                status = blockedBy.status
                additionalProperties = blockedBy.additionalProperties.toMutableMap()
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

            /**
             * The compliance status of the rule for this entity. Computed by Openlayer and can't be
             * set directly.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [BlockedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BlockedBy = BlockedBy(id, status, additionalProperties.toMutableMap())
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
        fun validate(): BlockedBy = apply {
            if (validated) {
                return@apply
            }

            id()
            status().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) + (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The compliance status of the rule for this entity. Computed by Openlayer and can't be set
         * directly.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val RUNNING = of("running")

                @JvmField val PASSING = of("passing")

                @JvmField val FAILING = of("failing")

                @JvmField val SKIPPED = of("skipped")

                @JvmField val ERROR = of("error")

                @JvmField val PENDING = of("pending")

                @JvmField val DUE_SOON = of("due_soon")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    RUNNING -> Value.RUNNING
                    PASSING -> Value.PASSING
                    FAILING -> Value.FAILING
                    SKIPPED -> Value.SKIPPED
                    ERROR -> Value.ERROR
                    PENDING -> Value.PENDING
                    DUE_SOON -> Value.DUE_SOON
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
                    RUNNING -> Known.RUNNING
                    PASSING -> Known.PASSING
                    FAILING -> Known.FAILING
                    SKIPPED -> Known.SKIPPED
                    ERROR -> Known.ERROR
                    PENDING -> Known.PENDING
                    DUE_SOON -> Known.DUE_SOON
                    else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is BlockedBy &&
                id == other.id &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BlockedBy{id=$id, status=$status, additionalProperties=$additionalProperties}"
    }

    class Blocking
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(id, status, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The compliance status of the rule for this entity. Computed by Openlayer and can't be set
         * directly.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Blocking]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Blocking]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(blocking: Blocking) = apply {
                id = blocking.id
                status = blocking.status
                additionalProperties = blocking.additionalProperties.toMutableMap()
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

            /**
             * The compliance status of the rule for this entity. Computed by Openlayer and can't be
             * set directly.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Blocking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Blocking = Blocking(id, status, additionalProperties.toMutableMap())
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
        fun validate(): Blocking = apply {
            if (validated) {
                return@apply
            }

            id()
            status().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) + (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The compliance status of the rule for this entity. Computed by Openlayer and can't be set
         * directly.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val RUNNING = of("running")

                @JvmField val PASSING = of("passing")

                @JvmField val FAILING = of("failing")

                @JvmField val SKIPPED = of("skipped")

                @JvmField val ERROR = of("error")

                @JvmField val PENDING = of("pending")

                @JvmField val DUE_SOON = of("due_soon")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    RUNNING -> Value.RUNNING
                    PASSING -> Value.PASSING
                    FAILING -> Value.FAILING
                    SKIPPED -> Value.SKIPPED
                    ERROR -> Value.ERROR
                    PENDING -> Value.PENDING
                    DUE_SOON -> Value.DUE_SOON
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
                    RUNNING -> Known.RUNNING
                    PASSING -> Known.PASSING
                    FAILING -> Known.FAILING
                    SKIPPED -> Known.SKIPPED
                    ERROR -> Known.ERROR
                    PENDING -> Known.PENDING
                    DUE_SOON -> Known.DUE_SOON
                    else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is Blocking &&
                id == other.id &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Blocking{id=$id, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleResultUpdateParams &&
            ruleResultId == other.ruleResultId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(ruleResultId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleResultUpdateParams{ruleResultId=$ruleResultId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
