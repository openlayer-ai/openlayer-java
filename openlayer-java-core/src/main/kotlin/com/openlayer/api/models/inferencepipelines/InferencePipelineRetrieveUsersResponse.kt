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

class InferencePipelineRetrieveUsersResponse
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
     * Array of user aggregation data
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
         * [InferencePipelineRetrieveUsersResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineRetrieveUsersResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferencePipelineRetrieveUsersResponse: InferencePipelineRetrieveUsersResponse
        ) = apply {
            items = inferencePipelineRetrieveUsersResponse.items.map { it.toMutableList() }
            additionalProperties =
                inferencePipelineRetrieveUsersResponse.additionalProperties.toMutableMap()
        }

        /** Array of user aggregation data */
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
         * Returns an immutable instance of [InferencePipelineRetrieveUsersResponse].
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
        fun build(): InferencePipelineRetrieveUsersResponse =
            InferencePipelineRetrieveUsersResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferencePipelineRetrieveUsersResponse = apply {
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
        private val dateOfFirstRecord: JsonField<OffsetDateTime>,
        private val dateOfLastRecord: JsonField<OffsetDateTime>,
        private val records: JsonField<Long>,
        private val sessions: JsonField<Long>,
        private val tokens: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost") @ExcludeMissing cost: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("dateOfFirstRecord")
            @ExcludeMissing
            dateOfFirstRecord: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateOfLastRecord")
            @ExcludeMissing
            dateOfLastRecord: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("records") @ExcludeMissing records: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sessions") @ExcludeMissing sessions: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tokens") @ExcludeMissing tokens: JsonField<Float> = JsonMissing.of(),
        ) : this(
            id,
            cost,
            dateOfFirstRecord,
            dateOfLastRecord,
            records,
            sessions,
            tokens,
            mutableMapOf(),
        )

        /**
         * The unique user identifier
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Total cost for this user
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cost(): Float = cost.getRequired("cost")

        /**
         * Timestamp of the user's first event/trace
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateOfFirstRecord(): OffsetDateTime = dateOfFirstRecord.getRequired("dateOfFirstRecord")

        /**
         * Timestamp of the user's last event/trace
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateOfLastRecord(): OffsetDateTime = dateOfLastRecord.getRequired("dateOfLastRecord")

        /**
         * Total number of traces/rows for this user
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun records(): Long = records.getRequired("records")

        /**
         * Count of unique sessions for this user
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessions(): Long = sessions.getRequired("sessions")

        /**
         * Total token count for this user
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tokens(): Float = tokens.getRequired("tokens")

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
         * Returns the raw JSON value of [records].
         *
         * Unlike [records], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("records") @ExcludeMissing fun _records(): JsonField<Long> = records

        /**
         * Returns the raw JSON value of [sessions].
         *
         * Unlike [sessions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sessions") @ExcludeMissing fun _sessions(): JsonField<Long> = sessions

        /**
         * Returns the raw JSON value of [tokens].
         *
         * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<Float> = tokens

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
             * .dateOfFirstRecord()
             * .dateOfLastRecord()
             * .records()
             * .sessions()
             * .tokens()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var cost: JsonField<Float>? = null
            private var dateOfFirstRecord: JsonField<OffsetDateTime>? = null
            private var dateOfLastRecord: JsonField<OffsetDateTime>? = null
            private var records: JsonField<Long>? = null
            private var sessions: JsonField<Long>? = null
            private var tokens: JsonField<Float>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                cost = item.cost
                dateOfFirstRecord = item.dateOfFirstRecord
                dateOfLastRecord = item.dateOfLastRecord
                records = item.records
                sessions = item.sessions
                tokens = item.tokens
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The unique user identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Total cost for this user */
            fun cost(cost: Float) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cost(cost: JsonField<Float>) = apply { this.cost = cost }

            /** Timestamp of the user's first event/trace */
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

            /** Timestamp of the user's last event/trace */
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

            /** Total number of traces/rows for this user */
            fun records(records: Long) = records(JsonField.of(records))

            /**
             * Sets [Builder.records] to an arbitrary JSON value.
             *
             * You should usually call [Builder.records] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun records(records: JsonField<Long>) = apply { this.records = records }

            /** Count of unique sessions for this user */
            fun sessions(sessions: Long) = sessions(JsonField.of(sessions))

            /**
             * Sets [Builder.sessions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessions] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessions(sessions: JsonField<Long>) = apply { this.sessions = sessions }

            /** Total token count for this user */
            fun tokens(tokens: Float) = tokens(JsonField.of(tokens))

            /**
             * Sets [Builder.tokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokens] with a well-typed [Float] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokens(tokens: JsonField<Float>) = apply { this.tokens = tokens }

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
             * .dateOfFirstRecord()
             * .dateOfLastRecord()
             * .records()
             * .sessions()
             * .tokens()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("cost", cost),
                    checkRequired("dateOfFirstRecord", dateOfFirstRecord),
                    checkRequired("dateOfLastRecord", dateOfLastRecord),
                    checkRequired("records", records),
                    checkRequired("sessions", sessions),
                    checkRequired("tokens", tokens),
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
            dateOfFirstRecord()
            dateOfLastRecord()
            records()
            sessions()
            tokens()
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
                (if (dateOfFirstRecord.asKnown().isPresent) 1 else 0) +
                (if (dateOfLastRecord.asKnown().isPresent) 1 else 0) +
                (if (records.asKnown().isPresent) 1 else 0) +
                (if (sessions.asKnown().isPresent) 1 else 0) +
                (if (tokens.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                cost == other.cost &&
                dateOfFirstRecord == other.dateOfFirstRecord &&
                dateOfLastRecord == other.dateOfLastRecord &&
                records == other.records &&
                sessions == other.sessions &&
                tokens == other.tokens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                cost,
                dateOfFirstRecord,
                dateOfLastRecord,
                records,
                sessions,
                tokens,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, cost=$cost, dateOfFirstRecord=$dateOfFirstRecord, dateOfLastRecord=$dateOfLastRecord, records=$records, sessions=$sessions, tokens=$tokens, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferencePipelineRetrieveUsersResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineRetrieveUsersResponse{items=$items, additionalProperties=$additionalProperties}"
}
