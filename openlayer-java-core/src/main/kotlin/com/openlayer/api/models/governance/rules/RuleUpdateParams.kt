// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Update a rule. */
class RuleUpdateParams
private constructor(
    private val ruleId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun ruleId(): Optional<String> = Optional.ofNullable(ruleId)

    /**
     * The user responsible for satisfying the rule.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assigneeId(): Optional<String> = body.assigneeId()

    /**
     * Whether the rule is excluded from compliance calculations.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivated(): Optional<Boolean> = body.deactivated()

    /**
     * What the rule requires.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The rule name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * How often evidence must be renewed, in days. Once evidence is older than this, the rule
     * result becomes `due_soon` and then `failing`. The window restarts whenever evidence is
     * attached. Omit or `null` for platform rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renewalCadenceDays(): Optional<Long> = body.renewalCadenceDays()

    /**
     * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them back
     * from `tags`, and list the tags available in the workspace with `GET
     * /workspaces/{workspaceId}/rule-tags`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagIds(): Optional<List<String>> = body.tagIds()

    /**
     * Returns the raw JSON value of [assigneeId].
     *
     * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assigneeId(): JsonField<String> = body._assigneeId()

    /**
     * Returns the raw JSON value of [deactivated].
     *
     * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deactivated(): JsonField<Boolean> = body._deactivated()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [renewalCadenceDays].
     *
     * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _renewalCadenceDays(): JsonField<Long> = body._renewalCadenceDays()

    /**
     * Returns the raw JSON value of [tagIds].
     *
     * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tagIds(): JsonField<List<String>> = body._tagIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RuleUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleUpdateParams]. */
    class Builder internal constructor() {

        private var ruleId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleUpdateParams: RuleUpdateParams) = apply {
            ruleId = ruleUpdateParams.ruleId
            body = ruleUpdateParams.body.toBuilder()
            additionalHeaders = ruleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun ruleId(ruleId: String?) = apply { this.ruleId = ruleId }

        /** Alias for calling [Builder.ruleId] with `ruleId.orElse(null)`. */
        fun ruleId(ruleId: Optional<String>) = ruleId(ruleId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [assigneeId]
         * - [deactivated]
         * - [description]
         * - [name]
         * - [renewalCadenceDays]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The user responsible for satisfying the rule. */
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

        /** Whether the rule is excluded from compliance calculations. */
        fun deactivated(deactivated: Boolean) = apply { body.deactivated(deactivated) }

        /**
         * Sets [Builder.deactivated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deactivated(deactivated: JsonField<Boolean>) = apply { body.deactivated(deactivated) }

        /** What the rule requires. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The rule name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * How often evidence must be renewed, in days. Once evidence is older than this, the rule
         * result becomes `due_soon` and then `failing`. The window restarts whenever evidence is
         * attached. Omit or `null` for platform rules.
         */
        fun renewalCadenceDays(renewalCadenceDays: Long?) = apply {
            body.renewalCadenceDays(renewalCadenceDays)
        }

        /**
         * Alias for [Builder.renewalCadenceDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun renewalCadenceDays(renewalCadenceDays: Long) =
            renewalCadenceDays(renewalCadenceDays as Long?)

        /**
         * Alias for calling [Builder.renewalCadenceDays] with `renewalCadenceDays.orElse(null)`.
         */
        fun renewalCadenceDays(renewalCadenceDays: Optional<Long>) =
            renewalCadenceDays(renewalCadenceDays.getOrNull())

        /**
         * Sets [Builder.renewalCadenceDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.renewalCadenceDays] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun renewalCadenceDays(renewalCadenceDays: JsonField<Long>) = apply {
            body.renewalCadenceDays(renewalCadenceDays)
        }

        /**
         * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them
         * back from `tags`, and list the tags available in the workspace with `GET
         * /workspaces/{workspaceId}/rule-tags`.
         */
        fun tagIds(tagIds: List<String>?) = apply { body.tagIds(tagIds) }

        /** Alias for calling [Builder.tagIds] with `tagIds.orElse(null)`. */
        fun tagIds(tagIds: Optional<List<String>>) = tagIds(tagIds.getOrNull())

        /**
         * Sets [Builder.tagIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagIds(tagIds: JsonField<List<String>>) = apply { body.tagIds(tagIds) }

        /**
         * Adds a single [String] to [tagIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagId(tagId: String) = apply { body.addTagId(tagId) }

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
         * Returns an immutable instance of [RuleUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleUpdateParams =
            RuleUpdateParams(
                ruleId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> ruleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assigneeId: JsonField<String>,
        private val deactivated: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val renewalCadenceDays: JsonField<Long>,
        private val tagIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assigneeId")
            @ExcludeMissing
            assigneeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deactivated")
            @ExcludeMissing
            deactivated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("renewalCadenceDays")
            @ExcludeMissing
            renewalCadenceDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tagIds")
            @ExcludeMissing
            tagIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            assigneeId,
            deactivated,
            description,
            name,
            renewalCadenceDays,
            tagIds,
            mutableMapOf(),
        )

        /**
         * The user responsible for satisfying the rule.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

        /**
         * Whether the rule is excluded from compliance calculations.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

        /**
         * What the rule requires.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The rule name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * How often evidence must be renewed, in days. Once evidence is older than this, the rule
         * result becomes `due_soon` and then `failing`. The window restarts whenever evidence is
         * attached. Omit or `null` for platform rules.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun renewalCadenceDays(): Optional<Long> =
            renewalCadenceDays.getOptional("renewalCadenceDays")

        /**
         * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them
         * back from `tags`, and list the tags available in the workspace with `GET
         * /workspaces/{workspaceId}/rule-tags`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tagIds(): Optional<List<String>> = tagIds.getOptional("tagIds")

        /**
         * Returns the raw JSON value of [assigneeId].
         *
         * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assigneeId")
        @ExcludeMissing
        fun _assigneeId(): JsonField<String> = assigneeId

        /**
         * Returns the raw JSON value of [deactivated].
         *
         * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deactivated")
        @ExcludeMissing
        fun _deactivated(): JsonField<Boolean> = deactivated

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [renewalCadenceDays].
         *
         * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("renewalCadenceDays")
        @ExcludeMissing
        fun _renewalCadenceDays(): JsonField<Long> = renewalCadenceDays

        /**
         * Returns the raw JSON value of [tagIds].
         *
         * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tagIds") @ExcludeMissing fun _tagIds(): JsonField<List<String>> = tagIds

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
            private var deactivated: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var renewalCadenceDays: JsonField<Long> = JsonMissing.of()
            private var tagIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assigneeId = body.assigneeId
                deactivated = body.deactivated
                description = body.description
                name = body.name
                renewalCadenceDays = body.renewalCadenceDays
                tagIds = body.tagIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The user responsible for satisfying the rule. */
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

            /** Whether the rule is excluded from compliance calculations. */
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

            /** What the rule requires. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The rule name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * How often evidence must be renewed, in days. Once evidence is older than this, the
             * rule result becomes `due_soon` and then `failing`. The window restarts whenever
             * evidence is attached. Omit or `null` for platform rules.
             */
            fun renewalCadenceDays(renewalCadenceDays: Long?) =
                renewalCadenceDays(JsonField.ofNullable(renewalCadenceDays))

            /**
             * Alias for [Builder.renewalCadenceDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun renewalCadenceDays(renewalCadenceDays: Long) =
                renewalCadenceDays(renewalCadenceDays as Long?)

            /**
             * Alias for calling [Builder.renewalCadenceDays] with
             * `renewalCadenceDays.orElse(null)`.
             */
            fun renewalCadenceDays(renewalCadenceDays: Optional<Long>) =
                renewalCadenceDays(renewalCadenceDays.getOrNull())

            /**
             * Sets [Builder.renewalCadenceDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.renewalCadenceDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun renewalCadenceDays(renewalCadenceDays: JsonField<Long>) = apply {
                this.renewalCadenceDays = renewalCadenceDays
            }

            /**
             * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read
             * them back from `tags`, and list the tags available in the workspace with `GET
             * /workspaces/{workspaceId}/rule-tags`.
             */
            fun tagIds(tagIds: List<String>?) = tagIds(JsonField.ofNullable(tagIds))

            /** Alias for calling [Builder.tagIds] with `tagIds.orElse(null)`. */
            fun tagIds(tagIds: Optional<List<String>>) = tagIds(tagIds.getOrNull())

            /**
             * Sets [Builder.tagIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tagIds(tagIds: JsonField<List<String>>) = apply {
                this.tagIds = tagIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tagIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTagId(tagId: String) = apply {
                tagIds =
                    (tagIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tagIds", it).add(tagId)
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
             */
            fun build(): Body =
                Body(
                    assigneeId,
                    deactivated,
                    description,
                    name,
                    renewalCadenceDays,
                    (tagIds ?: JsonMissing.of()).map { it.toImmutable() },
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
            deactivated()
            description()
            name()
            renewalCadenceDays()
            tagIds()
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
                (if (deactivated.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (renewalCadenceDays.asKnown().isPresent) 1 else 0) +
                (tagIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                assigneeId == other.assigneeId &&
                deactivated == other.deactivated &&
                description == other.description &&
                name == other.name &&
                renewalCadenceDays == other.renewalCadenceDays &&
                tagIds == other.tagIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assigneeId,
                deactivated,
                description,
                name,
                renewalCadenceDays,
                tagIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assigneeId=$assigneeId, deactivated=$deactivated, description=$description, name=$name, renewalCadenceDays=$renewalCadenceDays, tagIds=$tagIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleUpdateParams &&
            ruleId == other.ruleId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(ruleId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleUpdateParams{ruleId=$ruleId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
