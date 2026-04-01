// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class InferencePipelineRetrieveSessionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * Array of session aggregation data
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of
         * [InferencePipelineRetrieveSessionsResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineRetrieveSessionsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferencePipelineRetrieveSessionsResponse: InferencePipelineRetrieveSessionsResponse
        ) = apply {
            items = inferencePipelineRetrieveSessionsResponse.items.map { it.toMutableList() }
            additionalProperties =
                inferencePipelineRetrieveSessionsResponse.additionalProperties.toMutableMap()
        }

        /** Array of session aggregation data */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [InferencePipelineRetrieveSessionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferencePipelineRetrieveSessionsResponse =
            InferencePipelineRetrieveSessionsResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferencePipelineRetrieveSessionsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val cost: JsonField<Float>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateOfFirstRecord: JsonField<OffsetDateTime>,
        private val dateOfLastRecord: JsonField<OffsetDateTime>,
        private val duration: JsonField<Float>,
        private val firstRecord: JsonField<FirstRecord>,
        private val lastRecord: JsonField<LastRecord>,
        private val latency: JsonField<Float>,
        private val records: JsonField<Long>,
        private val tokens: JsonField<Float>,
        private val userIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateOfFirstRecord")
            @ExcludeMissing
            dateOfFirstRecord: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateOfLastRecord")
            @ExcludeMissing
            dateOfLastRecord: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("duration") @ExcludeMissing duration: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("firstRecord")
            @ExcludeMissing
            firstRecord: JsonField<FirstRecord> = JsonMissing.of(),
            @JsonProperty("lastRecord")
            @ExcludeMissing
            lastRecord: JsonField<LastRecord> = JsonMissing.of(),
            @JsonProperty("latency") @ExcludeMissing latency: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("records") @ExcludeMissing records: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tokens") @ExcludeMissing tokens: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("userIds")
            @ExcludeMissing
            userIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            cost,
            dateCreated,
            dateOfFirstRecord,
            dateOfLastRecord,
            duration,
            firstRecord,
            lastRecord,
            latency,
            records,
            tokens,
            userIds,
            mutableMapOf(),
        )

        /**
         * The unique session identifier
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Total cost for the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cost(): Float = cost.getRequired("cost")

        /**
         * Latest/most recent timestamp in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * Timestamp of the first request in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateOfFirstRecord(): OffsetDateTime = dateOfFirstRecord.getRequired("dateOfFirstRecord")

        /**
         * Timestamp of the last request in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateOfLastRecord(): OffsetDateTime = dateOfLastRecord.getRequired("dateOfLastRecord")

        /**
         * Duration between first and last request (in milliseconds)
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun duration(): Float = duration.getRequired("duration")

        /**
         * The complete first record in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstRecord(): FirstRecord = firstRecord.getRequired("firstRecord")

        /**
         * The complete last record in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastRecord(): LastRecord = lastRecord.getRequired("lastRecord")

        /**
         * Total latency for the session (in milliseconds)
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun latency(): Float = latency.getRequired("latency")

        /**
         * Total number of records/traces in the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun records(): Long = records.getRequired("records")

        /**
         * Total token count for the session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokens(): Float = tokens.getRequired("tokens")

        /**
         * List of unique user IDs that participated in this session
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun userIds(): List<String> = userIds.getRequired("userIds")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Float> = cost

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateOfFirstRecord].
         *
         * Unlike [dateOfFirstRecord], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateOfFirstRecord")
        @ExcludeMissing
        fun _dateOfFirstRecord(): JsonField<OffsetDateTime> = dateOfFirstRecord

        /**
         * Returns the raw JSON value of [dateOfLastRecord].
         *
         * Unlike [dateOfLastRecord], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateOfLastRecord")
        @ExcludeMissing
        fun _dateOfLastRecord(): JsonField<OffsetDateTime> = dateOfLastRecord

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Float> = duration

        /**
         * Returns the raw JSON value of [firstRecord].
         *
         * Unlike [firstRecord], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstRecord")
        @ExcludeMissing
        fun _firstRecord(): JsonField<FirstRecord> = firstRecord

        /**
         * Returns the raw JSON value of [lastRecord].
         *
         * Unlike [lastRecord], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastRecord")
        @ExcludeMissing
        fun _lastRecord(): JsonField<LastRecord> = lastRecord

        /**
         * Returns the raw JSON value of [latency].
         *
         * Unlike [latency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency") @ExcludeMissing fun _latency(): JsonField<Float> = latency

        /**
         * Returns the raw JSON value of [records].
         *
         * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<Long> = records

        /**
         * Returns the raw JSON value of [tokens].
         *
         * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<Float> = tokens

        /**
         * Returns the raw JSON value of [userIds].
         *
         * Unlike [userIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("userIds") @ExcludeMissing fun _userIds(): JsonField<List<String>> = userIds

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .cost()
             * .dateCreated()
             * .dateOfFirstRecord()
             * .dateOfLastRecord()
             * .duration()
             * .firstRecord()
             * .lastRecord()
             * .latency()
             * .records()
             * .tokens()
             * .userIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var cost: JsonField<Float>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateOfFirstRecord: JsonField<OffsetDateTime>? = null
            private var dateOfLastRecord: JsonField<OffsetDateTime>? = null
            private var duration: JsonField<Float>? = null
            private var firstRecord: JsonField<FirstRecord>? = null
            private var lastRecord: JsonField<LastRecord>? = null
            private var latency: JsonField<Float>? = null
            private var records: JsonField<Long>? = null
            private var tokens: JsonField<Float>? = null
            private var userIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                cost = item.cost
                dateCreated = item.dateCreated
                dateOfFirstRecord = item.dateOfFirstRecord
                dateOfLastRecord = item.dateOfLastRecord
                duration = item.duration
                firstRecord = item.firstRecord
                lastRecord = item.lastRecord
                latency = item.latency
                records = item.records
                tokens = item.tokens
                userIds = item.userIds.map { it.toMutableList() }
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The unique session identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Total cost for the session */
            fun cost(cost: Float) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Float>) = apply { this.cost = cost }

            /** Latest/most recent timestamp in the session */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** Timestamp of the first request in the session */
            fun dateOfFirstRecord(dateOfFirstRecord: OffsetDateTime) =
                dateOfFirstRecord(JsonField.of(dateOfFirstRecord))

            /**
             * Sets [Builder.dateOfFirstRecord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfFirstRecord] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dateOfFirstRecord(dateOfFirstRecord: JsonField<OffsetDateTime>) = apply {
                this.dateOfFirstRecord = dateOfFirstRecord
            }

            /** Timestamp of the last request in the session */
            fun dateOfLastRecord(dateOfLastRecord: OffsetDateTime) =
                dateOfLastRecord(JsonField.of(dateOfLastRecord))

            /**
             * Sets [Builder.dateOfLastRecord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfLastRecord] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateOfLastRecord(dateOfLastRecord: JsonField<OffsetDateTime>) = apply {
                this.dateOfLastRecord = dateOfLastRecord
            }

            /** Duration between first and last request (in milliseconds) */
            fun duration(duration: Float) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Float>) = apply { this.duration = duration }

            /** The complete first record in the session */
            fun firstRecord(firstRecord: FirstRecord) = firstRecord(JsonField.of(firstRecord))

            /**
             * Sets [Builder.firstRecord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstRecord] with a well-typed [FirstRecord] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstRecord(firstRecord: JsonField<FirstRecord>) = apply {
                this.firstRecord = firstRecord
            }

            /** The complete last record in the session */
            fun lastRecord(lastRecord: LastRecord) = lastRecord(JsonField.of(lastRecord))

            /**
             * Sets [Builder.lastRecord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastRecord] with a well-typed [LastRecord] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastRecord(lastRecord: JsonField<LastRecord>) = apply {
                this.lastRecord = lastRecord
            }

            /** Total latency for the session (in milliseconds) */
            fun latency(latency: Float) = latency(JsonField.of(latency))

            /**
             * Sets [Builder.latency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latency] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latency(latency: JsonField<Float>) = apply { this.latency = latency }

            /** Total number of records/traces in the session */
            fun records(records: Long) = records(JsonField.of(records))

            /**
             * Sets [Builder.records] to an arbitrary JSON value.
             *
             * You should usually call [Builder.records] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun records(records: JsonField<Long>) = apply { this.records = records }

            /** Total token count for the session */
            fun tokens(tokens: Float) = tokens(JsonField.of(tokens))

            /**
             * Sets [Builder.tokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokens] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokens(tokens: JsonField<Float>) = apply { this.tokens = tokens }

            /** List of unique user IDs that participated in this session */
            fun userIds(userIds: List<String>) = userIds(JsonField.of(userIds))

            /**
             * Sets [Builder.userIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userIds(userIds: JsonField<List<String>>) = apply {
                this.userIds = userIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [userIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUserId(userId: String) = apply {
                userIds =
                    (userIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("userIds", it).add(userId)
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .cost()
             * .dateCreated()
             * .dateOfFirstRecord()
             * .dateOfLastRecord()
             * .duration()
             * .firstRecord()
             * .lastRecord()
             * .latency()
             * .records()
             * .tokens()
             * .userIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("cost", cost),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateOfFirstRecord", dateOfFirstRecord),
                    checkRequired("dateOfLastRecord", dateOfLastRecord),
                    checkRequired("duration", duration),
                    checkRequired("firstRecord", firstRecord),
                    checkRequired("lastRecord", lastRecord),
                    checkRequired("latency", latency),
                    checkRequired("records", records),
                    checkRequired("tokens", tokens),
                    checkRequired("userIds", userIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            cost()
            dateCreated()
            dateOfFirstRecord()
            dateOfLastRecord()
            duration()
            firstRecord().validate()
            lastRecord().validate()
            latency()
            records()
            tokens()
            userIds()
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
                (if (cost.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateOfFirstRecord.asKnown().isPresent) 1 else 0) +
                (if (dateOfLastRecord.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (firstRecord.asKnown().getOrNull()?.validity() ?: 0) +
                (lastRecord.asKnown().getOrNull()?.validity() ?: 0) +
                (if (latency.asKnown().isPresent) 1 else 0) +
                (if (records.asKnown().isPresent) 1 else 0) +
                (if (tokens.asKnown().isPresent) 1 else 0) +
                (userIds.asKnown().getOrNull()?.size ?: 0)

        /** The complete first record in the session */
        class FirstRecord
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [FirstRecord]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FirstRecord]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(firstRecord: FirstRecord) = apply {
                    additionalProperties = firstRecord.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [FirstRecord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FirstRecord = FirstRecord(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): FirstRecord = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FirstRecord && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "FirstRecord{additionalProperties=$additionalProperties}"
        }

        /** The complete last record in the session */
        class LastRecord
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [LastRecord]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LastRecord]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(lastRecord: LastRecord) = apply {
                    additionalProperties = lastRecord.additionalProperties.toMutableMap()
                }

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
                 * Returns an immutable instance of [LastRecord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LastRecord = LastRecord(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): LastRecord = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LastRecord && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "LastRecord{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                cost == other.cost &&
                dateCreated == other.dateCreated &&
                dateOfFirstRecord == other.dateOfFirstRecord &&
                dateOfLastRecord == other.dateOfLastRecord &&
                duration == other.duration &&
                firstRecord == other.firstRecord &&
                lastRecord == other.lastRecord &&
                latency == other.latency &&
                records == other.records &&
                tokens == other.tokens &&
                userIds == other.userIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                cost,
                dateCreated,
                dateOfFirstRecord,
                dateOfLastRecord,
                duration,
                firstRecord,
                lastRecord,
                latency,
                records,
                tokens,
                userIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, cost=$cost, dateCreated=$dateCreated, dateOfFirstRecord=$dateOfFirstRecord, dateOfLastRecord=$dateOfLastRecord, duration=$duration, firstRecord=$firstRecord, lastRecord=$lastRecord, latency=$latency, records=$records, tokens=$tokens, userIds=$userIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferencePipelineRetrieveSessionsResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineRetrieveSessionsResponse{items=$items, additionalProperties=$additionalProperties}"
}
