// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.testresults

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
import com.openlayer.api.core.allMaxBy
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TestResultListResponse
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
         * Returns a mutable builder for constructing an instance of [TestResultListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestResultListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testResultListResponse: TestResultListResponse) = apply {
            items = testResultListResponse.items.map { it.toMutableList() }
            additionalProperties = testResultListResponse.additionalProperties.toMutableMap()
        }

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
         * Returns an immutable instance of [TestResultListResponse].
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
        fun build(): TestResultListResponse =
            TestResultListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TestResultListResponse = apply {
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
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateDataEnds: JsonField<OffsetDateTime>,
        private val dateDataStarts: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val inferencePipelineId: JsonField<String>,
        private val projectVersionId: JsonField<String>,
        private val status: JsonField<Status>,
        private val statusMessage: JsonField<String>,
        private val expectedValues: JsonField<List<ExpectedValue>>,
        private val goal: JsonField<Goal>,
        private val goalId: JsonField<String>,
        private val rows: JsonField<String>,
        private val rowsBody: JsonField<RowsBody>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateDataEnds")
            @ExcludeMissing
            dateDataEnds: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateDataStarts")
            @ExcludeMissing
            dateDataStarts: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inferencePipelineId")
            @ExcludeMissing
            inferencePipelineId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("projectVersionId")
            @ExcludeMissing
            projectVersionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("statusMessage")
            @ExcludeMissing
            statusMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expectedValues")
            @ExcludeMissing
            expectedValues: JsonField<List<ExpectedValue>> = JsonMissing.of(),
            @JsonProperty("goal") @ExcludeMissing goal: JsonField<Goal> = JsonMissing.of(),
            @JsonProperty("goalId") @ExcludeMissing goalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rows") @ExcludeMissing rows: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rowsBody")
            @ExcludeMissing
            rowsBody: JsonField<RowsBody> = JsonMissing.of(),
        ) : this(
            id,
            dateCreated,
            dateDataEnds,
            dateDataStarts,
            dateUpdated,
            inferencePipelineId,
            projectVersionId,
            status,
            statusMessage,
            expectedValues,
            goal,
            goalId,
            rows,
            rowsBody,
            mutableMapOf(),
        )

        /**
         * Project version (commit) id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The data end date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateDataEnds(): Optional<OffsetDateTime> = dateDataEnds.getOptional("dateDataEnds")

        /**
         * The data start date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateDataStarts(): Optional<OffsetDateTime> =
            dateDataStarts.getOptional("dateDataStarts")

        /**
         * The last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The inference pipeline id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inferencePipelineId(): Optional<String> =
            inferencePipelineId.getOptional("inferencePipelineId")

        /**
         * The project version (commit) id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectVersionId(): Optional<String> = projectVersionId.getOptional("projectVersionId")

        /**
         * The status of the test.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The status message.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statusMessage(): Optional<String> = statusMessage.getOptional("statusMessage")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun expectedValues(): Optional<List<ExpectedValue>> =
            expectedValues.getOptional("expectedValues")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun goal(): Optional<Goal> = goal.getOptional("goal")

        /**
         * The test id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun goalId(): Optional<String> = goalId.getOptional("goalId")

        /**
         * The URL to the rows of the test result.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rows(): Optional<String> = rows.getOptional("rows")

        /**
         * The body of the rows request.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rowsBody(): Optional<RowsBody> = rowsBody.getOptional("rowsBody")

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
         * Returns the raw JSON value of [dateDataEnds].
         *
         * Unlike [dateDataEnds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateDataEnds")
        @ExcludeMissing
        fun _dateDataEnds(): JsonField<OffsetDateTime> = dateDataEnds

        /**
         * Returns the raw JSON value of [dateDataStarts].
         *
         * Unlike [dateDataStarts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateDataStarts")
        @ExcludeMissing
        fun _dateDataStarts(): JsonField<OffsetDateTime> = dateDataStarts

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [inferencePipelineId].
         *
         * Unlike [inferencePipelineId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inferencePipelineId")
        @ExcludeMissing
        fun _inferencePipelineId(): JsonField<String> = inferencePipelineId

        /**
         * Returns the raw JSON value of [projectVersionId].
         *
         * Unlike [projectVersionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectVersionId")
        @ExcludeMissing
        fun _projectVersionId(): JsonField<String> = projectVersionId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [statusMessage].
         *
         * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("statusMessage")
        @ExcludeMissing
        fun _statusMessage(): JsonField<String> = statusMessage

        /**
         * Returns the raw JSON value of [expectedValues].
         *
         * Unlike [expectedValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expectedValues")
        @ExcludeMissing
        fun _expectedValues(): JsonField<List<ExpectedValue>> = expectedValues

        /**
         * Returns the raw JSON value of [goal].
         *
         * Unlike [goal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("goal") @ExcludeMissing fun _goal(): JsonField<Goal> = goal

        /**
         * Returns the raw JSON value of [goalId].
         *
         * Unlike [goalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("goalId") @ExcludeMissing fun _goalId(): JsonField<String> = goalId

        /**
         * Returns the raw JSON value of [rows].
         *
         * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<String> = rows

        /**
         * Returns the raw JSON value of [rowsBody].
         *
         * Unlike [rowsBody], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rowsBody") @ExcludeMissing fun _rowsBody(): JsonField<RowsBody> = rowsBody

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
             * .dateCreated()
             * .dateDataEnds()
             * .dateDataStarts()
             * .dateUpdated()
             * .inferencePipelineId()
             * .projectVersionId()
             * .status()
             * .statusMessage()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateDataEnds: JsonField<OffsetDateTime>? = null
            private var dateDataStarts: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var inferencePipelineId: JsonField<String>? = null
            private var projectVersionId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var statusMessage: JsonField<String>? = null
            private var expectedValues: JsonField<MutableList<ExpectedValue>>? = null
            private var goal: JsonField<Goal> = JsonMissing.of()
            private var goalId: JsonField<String> = JsonMissing.of()
            private var rows: JsonField<String> = JsonMissing.of()
            private var rowsBody: JsonField<RowsBody> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                dateCreated = item.dateCreated
                dateDataEnds = item.dateDataEnds
                dateDataStarts = item.dateDataStarts
                dateUpdated = item.dateUpdated
                inferencePipelineId = item.inferencePipelineId
                projectVersionId = item.projectVersionId
                status = item.status
                statusMessage = item.statusMessage
                expectedValues = item.expectedValues.map { it.toMutableList() }
                goal = item.goal
                goalId = item.goalId
                rows = item.rows
                rowsBody = item.rowsBody
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Project version (commit) id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation date. */
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

            /** The data end date. */
            fun dateDataEnds(dateDataEnds: OffsetDateTime?) =
                dateDataEnds(JsonField.ofNullable(dateDataEnds))

            /** Alias for calling [Builder.dateDataEnds] with `dateDataEnds.orElse(null)`. */
            fun dateDataEnds(dateDataEnds: Optional<OffsetDateTime>) =
                dateDataEnds(dateDataEnds.getOrNull())

            /**
             * Sets [Builder.dateDataEnds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateDataEnds] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateDataEnds(dateDataEnds: JsonField<OffsetDateTime>) = apply {
                this.dateDataEnds = dateDataEnds
            }

            /** The data start date. */
            fun dateDataStarts(dateDataStarts: OffsetDateTime?) =
                dateDataStarts(JsonField.ofNullable(dateDataStarts))

            /** Alias for calling [Builder.dateDataStarts] with `dateDataStarts.orElse(null)`. */
            fun dateDataStarts(dateDataStarts: Optional<OffsetDateTime>) =
                dateDataStarts(dateDataStarts.getOrNull())

            /**
             * Sets [Builder.dateDataStarts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateDataStarts] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateDataStarts(dateDataStarts: JsonField<OffsetDateTime>) = apply {
                this.dateDataStarts = dateDataStarts
            }

            /** The last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The inference pipeline id. */
            fun inferencePipelineId(inferencePipelineId: String?) =
                inferencePipelineId(JsonField.ofNullable(inferencePipelineId))

            /**
             * Alias for calling [Builder.inferencePipelineId] with
             * `inferencePipelineId.orElse(null)`.
             */
            fun inferencePipelineId(inferencePipelineId: Optional<String>) =
                inferencePipelineId(inferencePipelineId.getOrNull())

            /**
             * Sets [Builder.inferencePipelineId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inferencePipelineId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inferencePipelineId(inferencePipelineId: JsonField<String>) = apply {
                this.inferencePipelineId = inferencePipelineId
            }

            /** The project version (commit) id. */
            fun projectVersionId(projectVersionId: String?) =
                projectVersionId(JsonField.ofNullable(projectVersionId))

            /**
             * Alias for calling [Builder.projectVersionId] with `projectVersionId.orElse(null)`.
             */
            fun projectVersionId(projectVersionId: Optional<String>) =
                projectVersionId(projectVersionId.getOrNull())

            /**
             * Sets [Builder.projectVersionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectVersionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectVersionId(projectVersionId: JsonField<String>) = apply {
                this.projectVersionId = projectVersionId
            }

            /** The status of the test. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The status message. */
            fun statusMessage(statusMessage: String?) =
                statusMessage(JsonField.ofNullable(statusMessage))

            /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
            fun statusMessage(statusMessage: Optional<String>) =
                statusMessage(statusMessage.getOrNull())

            /**
             * Sets [Builder.statusMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            fun expectedValues(expectedValues: List<ExpectedValue>) =
                expectedValues(JsonField.of(expectedValues))

            /**
             * Sets [Builder.expectedValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expectedValues] with a well-typed
             * `List<ExpectedValue>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun expectedValues(expectedValues: JsonField<List<ExpectedValue>>) = apply {
                this.expectedValues = expectedValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [ExpectedValue] to [expectedValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExpectedValue(expectedValue: ExpectedValue) = apply {
                expectedValues =
                    (expectedValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("expectedValues", it).add(expectedValue)
                    }
            }

            fun goal(goal: Goal) = goal(JsonField.of(goal))

            /**
             * Sets [Builder.goal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.goal] with a well-typed [Goal] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun goal(goal: JsonField<Goal>) = apply { this.goal = goal }

            /** The test id. */
            fun goalId(goalId: String?) = goalId(JsonField.ofNullable(goalId))

            /** Alias for calling [Builder.goalId] with `goalId.orElse(null)`. */
            fun goalId(goalId: Optional<String>) = goalId(goalId.getOrNull())

            /**
             * Sets [Builder.goalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.goalId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun goalId(goalId: JsonField<String>) = apply { this.goalId = goalId }

            /** The URL to the rows of the test result. */
            fun rows(rows: String) = rows(JsonField.of(rows))

            /**
             * Sets [Builder.rows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rows] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rows(rows: JsonField<String>) = apply { this.rows = rows }

            /** The body of the rows request. */
            fun rowsBody(rowsBody: RowsBody?) = rowsBody(JsonField.ofNullable(rowsBody))

            /** Alias for calling [Builder.rowsBody] with `rowsBody.orElse(null)`. */
            fun rowsBody(rowsBody: Optional<RowsBody>) = rowsBody(rowsBody.getOrNull())

            /**
             * Sets [Builder.rowsBody] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rowsBody] with a well-typed [RowsBody] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rowsBody(rowsBody: JsonField<RowsBody>) = apply { this.rowsBody = rowsBody }

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
             * .dateCreated()
             * .dateDataEnds()
             * .dateDataStarts()
             * .dateUpdated()
             * .inferencePipelineId()
             * .projectVersionId()
             * .status()
             * .statusMessage()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateDataEnds", dateDataEnds),
                    checkRequired("dateDataStarts", dateDataStarts),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("inferencePipelineId", inferencePipelineId),
                    checkRequired("projectVersionId", projectVersionId),
                    checkRequired("status", status),
                    checkRequired("statusMessage", statusMessage),
                    (expectedValues ?: JsonMissing.of()).map { it.toImmutable() },
                    goal,
                    goalId,
                    rows,
                    rowsBody,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            dateCreated()
            dateDataEnds()
            dateDataStarts()
            dateUpdated()
            inferencePipelineId()
            projectVersionId()
            status().validate()
            statusMessage()
            expectedValues().ifPresent { it.forEach { it.validate() } }
            goal().ifPresent { it.validate() }
            goalId()
            rows()
            rowsBody().ifPresent { it.validate() }
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
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateDataEnds.asKnown().isPresent) 1 else 0) +
                (if (dateDataStarts.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (inferencePipelineId.asKnown().isPresent) 1 else 0) +
                (if (projectVersionId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (statusMessage.asKnown().isPresent) 1 else 0) +
                (expectedValues.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (goal.asKnown().getOrNull()?.validity() ?: 0) +
                (if (goalId.asKnown().isPresent) 1 else 0) +
                (if (rows.asKnown().isPresent) 1 else 0) +
                (rowsBody.asKnown().getOrNull()?.validity() ?: 0)

        /** The status of the test. */
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

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
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

        class ExpectedValue
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val lowerThreshold: JsonField<Float>,
            private val measurement: JsonField<String>,
            private val upperThreshold: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("lowerThreshold")
                @ExcludeMissing
                lowerThreshold: JsonField<Float> = JsonMissing.of(),
                @JsonProperty("measurement")
                @ExcludeMissing
                measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("upperThreshold")
                @ExcludeMissing
                upperThreshold: JsonField<Float> = JsonMissing.of(),
            ) : this(lowerThreshold, measurement, upperThreshold, mutableMapOf())

            /**
             * the lower threshold for the expected value
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun lowerThreshold(): Optional<Float> = lowerThreshold.getOptional("lowerThreshold")

            /**
             * One of the `measurement` values in the test's thresholds
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun measurement(): Optional<String> = measurement.getOptional("measurement")

            /**
             * The upper threshold for the expected value
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun upperThreshold(): Optional<Float> = upperThreshold.getOptional("upperThreshold")

            /**
             * Returns the raw JSON value of [lowerThreshold].
             *
             * Unlike [lowerThreshold], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("lowerThreshold")
            @ExcludeMissing
            fun _lowerThreshold(): JsonField<Float> = lowerThreshold

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
             * Returns the raw JSON value of [upperThreshold].
             *
             * Unlike [upperThreshold], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("upperThreshold")
            @ExcludeMissing
            fun _upperThreshold(): JsonField<Float> = upperThreshold

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

                /** Returns a mutable builder for constructing an instance of [ExpectedValue]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExpectedValue]. */
            class Builder internal constructor() {

                private var lowerThreshold: JsonField<Float> = JsonMissing.of()
                private var measurement: JsonField<String> = JsonMissing.of()
                private var upperThreshold: JsonField<Float> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(expectedValue: ExpectedValue) = apply {
                    lowerThreshold = expectedValue.lowerThreshold
                    measurement = expectedValue.measurement
                    upperThreshold = expectedValue.upperThreshold
                    additionalProperties = expectedValue.additionalProperties.toMutableMap()
                }

                /** the lower threshold for the expected value */
                fun lowerThreshold(lowerThreshold: Float?) =
                    lowerThreshold(JsonField.ofNullable(lowerThreshold))

                /**
                 * Alias for [Builder.lowerThreshold].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun lowerThreshold(lowerThreshold: Float) = lowerThreshold(lowerThreshold as Float?)

                /**
                 * Alias for calling [Builder.lowerThreshold] with `lowerThreshold.orElse(null)`.
                 */
                fun lowerThreshold(lowerThreshold: Optional<Float>) =
                    lowerThreshold(lowerThreshold.getOrNull())

                /**
                 * Sets [Builder.lowerThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lowerThreshold] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lowerThreshold(lowerThreshold: JsonField<Float>) = apply {
                    this.lowerThreshold = lowerThreshold
                }

                /** One of the `measurement` values in the test's thresholds */
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

                /** The upper threshold for the expected value */
                fun upperThreshold(upperThreshold: Float?) =
                    upperThreshold(JsonField.ofNullable(upperThreshold))

                /**
                 * Alias for [Builder.upperThreshold].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun upperThreshold(upperThreshold: Float) = upperThreshold(upperThreshold as Float?)

                /**
                 * Alias for calling [Builder.upperThreshold] with `upperThreshold.orElse(null)`.
                 */
                fun upperThreshold(upperThreshold: Optional<Float>) =
                    upperThreshold(upperThreshold.getOrNull())

                /**
                 * Sets [Builder.upperThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.upperThreshold] with a well-typed [Float] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun upperThreshold(upperThreshold: JsonField<Float>) = apply {
                    this.upperThreshold = upperThreshold
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
                 * Returns an immutable instance of [ExpectedValue].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExpectedValue =
                    ExpectedValue(
                        lowerThreshold,
                        measurement,
                        upperThreshold,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExpectedValue = apply {
                if (validated) {
                    return@apply
                }

                lowerThreshold()
                measurement()
                upperThreshold()
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
                (if (lowerThreshold.asKnown().isPresent) 1 else 0) +
                    (if (measurement.asKnown().isPresent) 1 else 0) +
                    (if (upperThreshold.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExpectedValue &&
                    lowerThreshold == other.lowerThreshold &&
                    measurement == other.measurement &&
                    upperThreshold == other.upperThreshold &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(lowerThreshold, measurement, upperThreshold, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedValue{lowerThreshold=$lowerThreshold, measurement=$measurement, upperThreshold=$upperThreshold, additionalProperties=$additionalProperties}"
        }

        class Goal
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val commentCount: JsonField<Long>,
            private val creatorId: JsonField<String>,
            private val dateArchived: JsonField<OffsetDateTime>,
            private val dateCreated: JsonField<OffsetDateTime>,
            private val dateUpdated: JsonField<OffsetDateTime>,
            private val description: JsonValue,
            private val name: JsonField<String>,
            private val number: JsonField<Long>,
            private val originProjectVersionId: JsonField<String>,
            private val subtype: JsonField<Subtype>,
            private val suggested: JsonField<Boolean>,
            private val thresholds: JsonField<List<Threshold>>,
            private val type: JsonField<Type>,
            private val archived: JsonField<Boolean>,
            private val delayWindow: JsonField<Double>,
            private val evaluationWindow: JsonField<Double>,
            private val usesMlModel: JsonField<Boolean>,
            private val usesProductionData: JsonField<Boolean>,
            private val usesReferenceDataset: JsonField<Boolean>,
            private val usesTrainingDataset: JsonField<Boolean>,
            private val usesValidationDataset: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("commentCount")
                @ExcludeMissing
                commentCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("creatorId")
                @ExcludeMissing
                creatorId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dateArchived")
                @ExcludeMissing
                dateArchived: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dateCreated")
                @ExcludeMissing
                dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dateUpdated")
                @ExcludeMissing
                dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonValue = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("number") @ExcludeMissing number: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("originProjectVersionId")
                @ExcludeMissing
                originProjectVersionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subtype")
                @ExcludeMissing
                subtype: JsonField<Subtype> = JsonMissing.of(),
                @JsonProperty("suggested")
                @ExcludeMissing
                suggested: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("thresholds")
                @ExcludeMissing
                thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("archived")
                @ExcludeMissing
                archived: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("delayWindow")
                @ExcludeMissing
                delayWindow: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("evaluationWindow")
                @ExcludeMissing
                evaluationWindow: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("usesMlModel")
                @ExcludeMissing
                usesMlModel: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usesProductionData")
                @ExcludeMissing
                usesProductionData: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usesReferenceDataset")
                @ExcludeMissing
                usesReferenceDataset: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usesTrainingDataset")
                @ExcludeMissing
                usesTrainingDataset: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("usesValidationDataset")
                @ExcludeMissing
                usesValidationDataset: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                id,
                commentCount,
                creatorId,
                dateArchived,
                dateCreated,
                dateUpdated,
                description,
                name,
                number,
                originProjectVersionId,
                subtype,
                suggested,
                thresholds,
                type,
                archived,
                delayWindow,
                evaluationWindow,
                usesMlModel,
                usesProductionData,
                usesReferenceDataset,
                usesTrainingDataset,
                usesValidationDataset,
                mutableMapOf(),
            )

            /**
             * The test id.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The number of comments on the test.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun commentCount(): Long = commentCount.getRequired("commentCount")

            /**
             * The test creator id.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

            /**
             * The date the test was archived.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun dateArchived(): Optional<OffsetDateTime> = dateArchived.getOptional("dateArchived")

            /**
             * The creation date.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

            /**
             * The last updated date.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            /** The test description. */
            @JsonProperty("description") @ExcludeMissing fun _description(): JsonValue = description

            /**
             * The test name.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The test number.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun number(): Long = number.getRequired("number")

            /**
             * The project version (commit) id where the test was created.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun originProjectVersionId(): Optional<String> =
                originProjectVersionId.getOptional("originProjectVersionId")

            /**
             * The test subtype.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subtype(): Subtype = subtype.getRequired("subtype")

            /**
             * Whether the test is suggested or user-created.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun suggested(): Boolean = suggested.getRequired("suggested")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

            /**
             * The test type.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Whether the test is archived.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun archived(): Optional<Boolean> = archived.getOptional("archived")

            /**
             * The delay window in seconds. Only applies to tests that use production data.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun delayWindow(): Optional<Double> = delayWindow.getOptional("delayWindow")

            /**
             * The evaluation window in seconds. Only applies to tests that use production data.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun evaluationWindow(): Optional<Double> =
                evaluationWindow.getOptional("evaluationWindow")

            /**
             * Whether the test uses an ML model.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usesMlModel(): Optional<Boolean> = usesMlModel.getOptional("usesMlModel")

            /**
             * Whether the test uses production data (monitoring mode only).
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usesProductionData(): Optional<Boolean> =
                usesProductionData.getOptional("usesProductionData")

            /**
             * Whether the test uses a reference dataset (monitoring mode only).
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usesReferenceDataset(): Optional<Boolean> =
                usesReferenceDataset.getOptional("usesReferenceDataset")

            /**
             * Whether the test uses a training dataset.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usesTrainingDataset(): Optional<Boolean> =
                usesTrainingDataset.getOptional("usesTrainingDataset")

            /**
             * Whether the test uses a validation dataset.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usesValidationDataset(): Optional<Boolean> =
                usesValidationDataset.getOptional("usesValidationDataset")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [commentCount].
             *
             * Unlike [commentCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commentCount")
            @ExcludeMissing
            fun _commentCount(): JsonField<Long> = commentCount

            /**
             * Returns the raw JSON value of [creatorId].
             *
             * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creatorId")
            @ExcludeMissing
            fun _creatorId(): JsonField<String> = creatorId

            /**
             * Returns the raw JSON value of [dateArchived].
             *
             * Unlike [dateArchived], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateArchived")
            @ExcludeMissing
            fun _dateArchived(): JsonField<OffsetDateTime> = dateArchived

            /**
             * Returns the raw JSON value of [dateCreated].
             *
             * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

            /**
             * Returns the raw JSON value of [dateUpdated].
             *
             * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<Long> = number

            /**
             * Returns the raw JSON value of [originProjectVersionId].
             *
             * Unlike [originProjectVersionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originProjectVersionId")
            @ExcludeMissing
            fun _originProjectVersionId(): JsonField<String> = originProjectVersionId

            /**
             * Returns the raw JSON value of [subtype].
             *
             * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<Subtype> = subtype

            /**
             * Returns the raw JSON value of [suggested].
             *
             * Unlike [suggested], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("suggested")
            @ExcludeMissing
            fun _suggested(): JsonField<Boolean> = suggested

            /**
             * Returns the raw JSON value of [thresholds].
             *
             * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("thresholds")
            @ExcludeMissing
            fun _thresholds(): JsonField<List<Threshold>> = thresholds

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [archived].
             *
             * Unlike [archived], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

            /**
             * Returns the raw JSON value of [delayWindow].
             *
             * Unlike [delayWindow], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delayWindow")
            @ExcludeMissing
            fun _delayWindow(): JsonField<Double> = delayWindow

            /**
             * Returns the raw JSON value of [evaluationWindow].
             *
             * Unlike [evaluationWindow], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("evaluationWindow")
            @ExcludeMissing
            fun _evaluationWindow(): JsonField<Double> = evaluationWindow

            /**
             * Returns the raw JSON value of [usesMlModel].
             *
             * Unlike [usesMlModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("usesMlModel")
            @ExcludeMissing
            fun _usesMlModel(): JsonField<Boolean> = usesMlModel

            /**
             * Returns the raw JSON value of [usesProductionData].
             *
             * Unlike [usesProductionData], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usesProductionData")
            @ExcludeMissing
            fun _usesProductionData(): JsonField<Boolean> = usesProductionData

            /**
             * Returns the raw JSON value of [usesReferenceDataset].
             *
             * Unlike [usesReferenceDataset], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usesReferenceDataset")
            @ExcludeMissing
            fun _usesReferenceDataset(): JsonField<Boolean> = usesReferenceDataset

            /**
             * Returns the raw JSON value of [usesTrainingDataset].
             *
             * Unlike [usesTrainingDataset], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usesTrainingDataset")
            @ExcludeMissing
            fun _usesTrainingDataset(): JsonField<Boolean> = usesTrainingDataset

            /**
             * Returns the raw JSON value of [usesValidationDataset].
             *
             * Unlike [usesValidationDataset], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("usesValidationDataset")
            @ExcludeMissing
            fun _usesValidationDataset(): JsonField<Boolean> = usesValidationDataset

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
                 * Returns a mutable builder for constructing an instance of [Goal].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commentCount()
                 * .creatorId()
                 * .dateArchived()
                 * .dateCreated()
                 * .dateUpdated()
                 * .description()
                 * .name()
                 * .number()
                 * .originProjectVersionId()
                 * .subtype()
                 * .suggested()
                 * .thresholds()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Goal]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var commentCount: JsonField<Long>? = null
                private var creatorId: JsonField<String>? = null
                private var dateArchived: JsonField<OffsetDateTime>? = null
                private var dateCreated: JsonField<OffsetDateTime>? = null
                private var dateUpdated: JsonField<OffsetDateTime>? = null
                private var description: JsonValue? = null
                private var name: JsonField<String>? = null
                private var number: JsonField<Long>? = null
                private var originProjectVersionId: JsonField<String>? = null
                private var subtype: JsonField<Subtype>? = null
                private var suggested: JsonField<Boolean>? = null
                private var thresholds: JsonField<MutableList<Threshold>>? = null
                private var type: JsonField<Type>? = null
                private var archived: JsonField<Boolean> = JsonMissing.of()
                private var delayWindow: JsonField<Double> = JsonMissing.of()
                private var evaluationWindow: JsonField<Double> = JsonMissing.of()
                private var usesMlModel: JsonField<Boolean> = JsonMissing.of()
                private var usesProductionData: JsonField<Boolean> = JsonMissing.of()
                private var usesReferenceDataset: JsonField<Boolean> = JsonMissing.of()
                private var usesTrainingDataset: JsonField<Boolean> = JsonMissing.of()
                private var usesValidationDataset: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(goal: Goal) = apply {
                    id = goal.id
                    commentCount = goal.commentCount
                    creatorId = goal.creatorId
                    dateArchived = goal.dateArchived
                    dateCreated = goal.dateCreated
                    dateUpdated = goal.dateUpdated
                    description = goal.description
                    name = goal.name
                    number = goal.number
                    originProjectVersionId = goal.originProjectVersionId
                    subtype = goal.subtype
                    suggested = goal.suggested
                    thresholds = goal.thresholds.map { it.toMutableList() }
                    type = goal.type
                    archived = goal.archived
                    delayWindow = goal.delayWindow
                    evaluationWindow = goal.evaluationWindow
                    usesMlModel = goal.usesMlModel
                    usesProductionData = goal.usesProductionData
                    usesReferenceDataset = goal.usesReferenceDataset
                    usesTrainingDataset = goal.usesTrainingDataset
                    usesValidationDataset = goal.usesValidationDataset
                    additionalProperties = goal.additionalProperties.toMutableMap()
                }

                /** The test id. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The number of comments on the test. */
                fun commentCount(commentCount: Long) = commentCount(JsonField.of(commentCount))

                /**
                 * Sets [Builder.commentCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commentCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commentCount(commentCount: JsonField<Long>) = apply {
                    this.commentCount = commentCount
                }

                /** The test creator id. */
                fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

                /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
                fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

                /**
                 * Sets [Builder.creatorId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creatorId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

                /** The date the test was archived. */
                fun dateArchived(dateArchived: OffsetDateTime?) =
                    dateArchived(JsonField.ofNullable(dateArchived))

                /** Alias for calling [Builder.dateArchived] with `dateArchived.orElse(null)`. */
                fun dateArchived(dateArchived: Optional<OffsetDateTime>) =
                    dateArchived(dateArchived.getOrNull())

                /**
                 * Sets [Builder.dateArchived] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateArchived] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
                    this.dateArchived = dateArchived
                }

                /** The creation date. */
                fun dateCreated(dateCreated: OffsetDateTime) =
                    dateCreated(JsonField.of(dateCreated))

                /**
                 * Sets [Builder.dateCreated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                    this.dateCreated = dateCreated
                }

                /** The last updated date. */
                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                /**
                 * Sets [Builder.dateUpdated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                /** The test description. */
                fun description(description: JsonValue) = apply { this.description = description }

                /** The test name. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The test number. */
                fun number(number: Long) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun number(number: JsonField<Long>) = apply { this.number = number }

                /** The project version (commit) id where the test was created. */
                fun originProjectVersionId(originProjectVersionId: String?) =
                    originProjectVersionId(JsonField.ofNullable(originProjectVersionId))

                /**
                 * Alias for calling [Builder.originProjectVersionId] with
                 * `originProjectVersionId.orElse(null)`.
                 */
                fun originProjectVersionId(originProjectVersionId: Optional<String>) =
                    originProjectVersionId(originProjectVersionId.getOrNull())

                /**
                 * Sets [Builder.originProjectVersionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originProjectVersionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun originProjectVersionId(originProjectVersionId: JsonField<String>) = apply {
                    this.originProjectVersionId = originProjectVersionId
                }

                /** The test subtype. */
                fun subtype(subtype: Subtype) = subtype(JsonField.of(subtype))

                /**
                 * Sets [Builder.subtype] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtype] with a well-typed [Subtype] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtype(subtype: JsonField<Subtype>) = apply { this.subtype = subtype }

                /** Whether the test is suggested or user-created. */
                fun suggested(suggested: Boolean) = suggested(JsonField.of(suggested))

                /**
                 * Sets [Builder.suggested] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.suggested] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun suggested(suggested: JsonField<Boolean>) = apply { this.suggested = suggested }

                fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

                /**
                 * Sets [Builder.thresholds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /** The test type. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Whether the test is archived. */
                fun archived(archived: Boolean) = archived(JsonField.of(archived))

                /**
                 * Sets [Builder.archived] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.archived] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: Double?) =
                    delayWindow(JsonField.ofNullable(delayWindow))

                /**
                 * Alias for [Builder.delayWindow].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun delayWindow(delayWindow: Double) = delayWindow(delayWindow as Double?)

                /** Alias for calling [Builder.delayWindow] with `delayWindow.orElse(null)`. */
                fun delayWindow(delayWindow: Optional<Double>) =
                    delayWindow(delayWindow.getOrNull())

                /**
                 * Sets [Builder.delayWindow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delayWindow] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun delayWindow(delayWindow: JsonField<Double>) = apply {
                    this.delayWindow = delayWindow
                }

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: Double?) =
                    evaluationWindow(JsonField.ofNullable(evaluationWindow))

                /**
                 * Alias for [Builder.evaluationWindow].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun evaluationWindow(evaluationWindow: Double) =
                    evaluationWindow(evaluationWindow as Double?)

                /**
                 * Alias for calling [Builder.evaluationWindow] with
                 * `evaluationWindow.orElse(null)`.
                 */
                fun evaluationWindow(evaluationWindow: Optional<Double>) =
                    evaluationWindow(evaluationWindow.getOrNull())

                /**
                 * Sets [Builder.evaluationWindow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evaluationWindow] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun evaluationWindow(evaluationWindow: JsonField<Double>) = apply {
                    this.evaluationWindow = evaluationWindow
                }

                /** Whether the test uses an ML model. */
                fun usesMlModel(usesMlModel: Boolean) = usesMlModel(JsonField.of(usesMlModel))

                /**
                 * Sets [Builder.usesMlModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usesMlModel] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usesMlModel(usesMlModel: JsonField<Boolean>) = apply {
                    this.usesMlModel = usesMlModel
                }

                /** Whether the test uses production data (monitoring mode only). */
                fun usesProductionData(usesProductionData: Boolean) =
                    usesProductionData(JsonField.of(usesProductionData))

                /**
                 * Sets [Builder.usesProductionData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usesProductionData] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usesProductionData(usesProductionData: JsonField<Boolean>) = apply {
                    this.usesProductionData = usesProductionData
                }

                /** Whether the test uses a reference dataset (monitoring mode only). */
                fun usesReferenceDataset(usesReferenceDataset: Boolean) =
                    usesReferenceDataset(JsonField.of(usesReferenceDataset))

                /**
                 * Sets [Builder.usesReferenceDataset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usesReferenceDataset] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun usesReferenceDataset(usesReferenceDataset: JsonField<Boolean>) = apply {
                    this.usesReferenceDataset = usesReferenceDataset
                }

                /** Whether the test uses a training dataset. */
                fun usesTrainingDataset(usesTrainingDataset: Boolean) =
                    usesTrainingDataset(JsonField.of(usesTrainingDataset))

                /**
                 * Sets [Builder.usesTrainingDataset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usesTrainingDataset] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun usesTrainingDataset(usesTrainingDataset: JsonField<Boolean>) = apply {
                    this.usesTrainingDataset = usesTrainingDataset
                }

                /** Whether the test uses a validation dataset. */
                fun usesValidationDataset(usesValidationDataset: Boolean) =
                    usesValidationDataset(JsonField.of(usesValidationDataset))

                /**
                 * Sets [Builder.usesValidationDataset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usesValidationDataset] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun usesValidationDataset(usesValidationDataset: JsonField<Boolean>) = apply {
                    this.usesValidationDataset = usesValidationDataset
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
                 * Returns an immutable instance of [Goal].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commentCount()
                 * .creatorId()
                 * .dateArchived()
                 * .dateCreated()
                 * .dateUpdated()
                 * .description()
                 * .name()
                 * .number()
                 * .originProjectVersionId()
                 * .subtype()
                 * .suggested()
                 * .thresholds()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Goal =
                    Goal(
                        checkRequired("id", id),
                        checkRequired("commentCount", commentCount),
                        checkRequired("creatorId", creatorId),
                        checkRequired("dateArchived", dateArchived),
                        checkRequired("dateCreated", dateCreated),
                        checkRequired("dateUpdated", dateUpdated),
                        checkRequired("description", description),
                        checkRequired("name", name),
                        checkRequired("number", number),
                        checkRequired("originProjectVersionId", originProjectVersionId),
                        checkRequired("subtype", subtype),
                        checkRequired("suggested", suggested),
                        checkRequired("thresholds", thresholds).map { it.toImmutable() },
                        checkRequired("type", type),
                        archived,
                        delayWindow,
                        evaluationWindow,
                        usesMlModel,
                        usesProductionData,
                        usesReferenceDataset,
                        usesTrainingDataset,
                        usesValidationDataset,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Goal = apply {
                if (validated) {
                    return@apply
                }

                id()
                commentCount()
                creatorId()
                dateArchived()
                dateCreated()
                dateUpdated()
                name()
                number()
                originProjectVersionId()
                subtype().validate()
                suggested()
                thresholds().forEach { it.validate() }
                type().validate()
                archived()
                delayWindow()
                evaluationWindow()
                usesMlModel()
                usesProductionData()
                usesReferenceDataset()
                usesTrainingDataset()
                usesValidationDataset()
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
                    (if (commentCount.asKnown().isPresent) 1 else 0) +
                    (if (creatorId.asKnown().isPresent) 1 else 0) +
                    (if (dateArchived.asKnown().isPresent) 1 else 0) +
                    (if (dateCreated.asKnown().isPresent) 1 else 0) +
                    (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (number.asKnown().isPresent) 1 else 0) +
                    (if (originProjectVersionId.asKnown().isPresent) 1 else 0) +
                    (subtype.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (suggested.asKnown().isPresent) 1 else 0) +
                    (thresholds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (archived.asKnown().isPresent) 1 else 0) +
                    (if (delayWindow.asKnown().isPresent) 1 else 0) +
                    (if (evaluationWindow.asKnown().isPresent) 1 else 0) +
                    (if (usesMlModel.asKnown().isPresent) 1 else 0) +
                    (if (usesProductionData.asKnown().isPresent) 1 else 0) +
                    (if (usesReferenceDataset.asKnown().isPresent) 1 else 0) +
                    (if (usesTrainingDataset.asKnown().isPresent) 1 else 0) +
                    (if (usesValidationDataset.asKnown().isPresent) 1 else 0)

            /** The test subtype. */
            class Subtype @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val ANOMALOUS_COLUMN_COUNT = of("anomalousColumnCount")

                    @JvmField val CHARACTER_LENGTH = of("characterLength")

                    @JvmField val CLASS_IMBALANCE_RATIO = of("classImbalanceRatio")

                    @JvmField
                    val EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B = of("expectColumnAToBeInColumnB")

                    @JvmField val COLUMN_AVERAGE = of("columnAverage")

                    @JvmField val COLUMN_DRIFT = of("columnDrift")

                    @JvmField val COLUMN_STATISTIC = of("columnStatistic")

                    @JvmField val COLUMN_VALUES_MATCH = of("columnValuesMatch")

                    @JvmField val CONFLICTING_LABEL_ROW_COUNT = of("conflictingLabelRowCount")

                    @JvmField val CONTAINS_PII = of("containsPii")

                    @JvmField val CONTAINS_VALID_URL = of("containsValidUrl")

                    @JvmField val CORRELATED_FEATURE_COUNT = of("correlatedFeatureCount")

                    @JvmField val CUSTOM_METRIC_THRESHOLD = of("customMetricThreshold")

                    @JvmField val DUPLICATE_ROW_COUNT = of("duplicateRowCount")

                    @JvmField val EMPTY_FEATURE = of("emptyFeature")

                    @JvmField val EMPTY_FEATURE_COUNT = of("emptyFeatureCount")

                    @JvmField val DRIFTED_FEATURE_COUNT = of("driftedFeatureCount")

                    @JvmField val FEATURE_MISSING_VALUES = of("featureMissingValues")

                    @JvmField val FEATURE_VALUE_VALIDATION = of("featureValueValidation")

                    @JvmField val GREAT_EXPECTATIONS = of("greatExpectations")

                    @JvmField val GROUP_BY_COLUMN_STATS_CHECK = of("groupByColumnStatsCheck")

                    @JvmField val ILL_FORMED_ROW_COUNT = of("illFormedRowCount")

                    @JvmField val IS_CODE = of("isCode")

                    @JvmField val IS_JSON = of("isJson")

                    @JvmField val LLM_RUBRIC_THRESHOLD_V2 = of("llmRubricThresholdV2")

                    @JvmField val LABEL_DRIFT = of("labelDrift")

                    @JvmField val METRIC_THRESHOLD = of("metricThreshold")

                    @JvmField val NEW_CATEGORY_COUNT = of("newCategoryCount")

                    @JvmField val NEW_LABEL_COUNT = of("newLabelCount")

                    @JvmField val NULL_ROW_COUNT = of("nullRowCount")

                    @JvmField val ROW_COUNT = of("rowCount")

                    @JvmField val PP_SCORE_VALUE_VALIDATION = of("ppScoreValueValidation")

                    @JvmField val QUASI_CONSTANT_FEATURE = of("quasiConstantFeature")

                    @JvmField val QUASI_CONSTANT_FEATURE_COUNT = of("quasiConstantFeatureCount")

                    @JvmField val SQL_QUERY = of("sqlQuery")

                    @JvmField val DTYPE_VALIDATION = of("dtypeValidation")

                    @JvmField val SENTENCE_LENGTH = of("sentenceLength")

                    @JvmField val SIZE_RATIO = of("sizeRatio")

                    @JvmField val SPECIAL_CHARACTERS_RATIO = of("specialCharactersRatio")

                    @JvmField val STRING_VALIDATION = of("stringValidation")

                    @JvmField val TRAIN_VAL_LEAKAGE_ROW_COUNT = of("trainValLeakageRowCount")

                    @JvmStatic fun of(value: String) = Subtype(JsonField.of(value))
                }

                /** An enum containing [Subtype]'s known values. */
                enum class Known {
                    ANOMALOUS_COLUMN_COUNT,
                    CHARACTER_LENGTH,
                    CLASS_IMBALANCE_RATIO,
                    EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B,
                    COLUMN_AVERAGE,
                    COLUMN_DRIFT,
                    COLUMN_STATISTIC,
                    COLUMN_VALUES_MATCH,
                    CONFLICTING_LABEL_ROW_COUNT,
                    CONTAINS_PII,
                    CONTAINS_VALID_URL,
                    CORRELATED_FEATURE_COUNT,
                    CUSTOM_METRIC_THRESHOLD,
                    DUPLICATE_ROW_COUNT,
                    EMPTY_FEATURE,
                    EMPTY_FEATURE_COUNT,
                    DRIFTED_FEATURE_COUNT,
                    FEATURE_MISSING_VALUES,
                    FEATURE_VALUE_VALIDATION,
                    GREAT_EXPECTATIONS,
                    GROUP_BY_COLUMN_STATS_CHECK,
                    ILL_FORMED_ROW_COUNT,
                    IS_CODE,
                    IS_JSON,
                    LLM_RUBRIC_THRESHOLD_V2,
                    LABEL_DRIFT,
                    METRIC_THRESHOLD,
                    NEW_CATEGORY_COUNT,
                    NEW_LABEL_COUNT,
                    NULL_ROW_COUNT,
                    ROW_COUNT,
                    PP_SCORE_VALUE_VALIDATION,
                    QUASI_CONSTANT_FEATURE,
                    QUASI_CONSTANT_FEATURE_COUNT,
                    SQL_QUERY,
                    DTYPE_VALIDATION,
                    SENTENCE_LENGTH,
                    SIZE_RATIO,
                    SPECIAL_CHARACTERS_RATIO,
                    STRING_VALIDATION,
                    TRAIN_VAL_LEAKAGE_ROW_COUNT,
                }

                /**
                 * An enum containing [Subtype]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Subtype] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANOMALOUS_COLUMN_COUNT,
                    CHARACTER_LENGTH,
                    CLASS_IMBALANCE_RATIO,
                    EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B,
                    COLUMN_AVERAGE,
                    COLUMN_DRIFT,
                    COLUMN_STATISTIC,
                    COLUMN_VALUES_MATCH,
                    CONFLICTING_LABEL_ROW_COUNT,
                    CONTAINS_PII,
                    CONTAINS_VALID_URL,
                    CORRELATED_FEATURE_COUNT,
                    CUSTOM_METRIC_THRESHOLD,
                    DUPLICATE_ROW_COUNT,
                    EMPTY_FEATURE,
                    EMPTY_FEATURE_COUNT,
                    DRIFTED_FEATURE_COUNT,
                    FEATURE_MISSING_VALUES,
                    FEATURE_VALUE_VALIDATION,
                    GREAT_EXPECTATIONS,
                    GROUP_BY_COLUMN_STATS_CHECK,
                    ILL_FORMED_ROW_COUNT,
                    IS_CODE,
                    IS_JSON,
                    LLM_RUBRIC_THRESHOLD_V2,
                    LABEL_DRIFT,
                    METRIC_THRESHOLD,
                    NEW_CATEGORY_COUNT,
                    NEW_LABEL_COUNT,
                    NULL_ROW_COUNT,
                    ROW_COUNT,
                    PP_SCORE_VALUE_VALIDATION,
                    QUASI_CONSTANT_FEATURE,
                    QUASI_CONSTANT_FEATURE_COUNT,
                    SQL_QUERY,
                    DTYPE_VALIDATION,
                    SENTENCE_LENGTH,
                    SIZE_RATIO,
                    SPECIAL_CHARACTERS_RATIO,
                    STRING_VALIDATION,
                    TRAIN_VAL_LEAKAGE_ROW_COUNT,
                    /**
                     * An enum member indicating that [Subtype] was instantiated with an unknown
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
                        ANOMALOUS_COLUMN_COUNT -> Value.ANOMALOUS_COLUMN_COUNT
                        CHARACTER_LENGTH -> Value.CHARACTER_LENGTH
                        CLASS_IMBALANCE_RATIO -> Value.CLASS_IMBALANCE_RATIO
                        EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B -> Value.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
                        COLUMN_AVERAGE -> Value.COLUMN_AVERAGE
                        COLUMN_DRIFT -> Value.COLUMN_DRIFT
                        COLUMN_STATISTIC -> Value.COLUMN_STATISTIC
                        COLUMN_VALUES_MATCH -> Value.COLUMN_VALUES_MATCH
                        CONFLICTING_LABEL_ROW_COUNT -> Value.CONFLICTING_LABEL_ROW_COUNT
                        CONTAINS_PII -> Value.CONTAINS_PII
                        CONTAINS_VALID_URL -> Value.CONTAINS_VALID_URL
                        CORRELATED_FEATURE_COUNT -> Value.CORRELATED_FEATURE_COUNT
                        CUSTOM_METRIC_THRESHOLD -> Value.CUSTOM_METRIC_THRESHOLD
                        DUPLICATE_ROW_COUNT -> Value.DUPLICATE_ROW_COUNT
                        EMPTY_FEATURE -> Value.EMPTY_FEATURE
                        EMPTY_FEATURE_COUNT -> Value.EMPTY_FEATURE_COUNT
                        DRIFTED_FEATURE_COUNT -> Value.DRIFTED_FEATURE_COUNT
                        FEATURE_MISSING_VALUES -> Value.FEATURE_MISSING_VALUES
                        FEATURE_VALUE_VALIDATION -> Value.FEATURE_VALUE_VALIDATION
                        GREAT_EXPECTATIONS -> Value.GREAT_EXPECTATIONS
                        GROUP_BY_COLUMN_STATS_CHECK -> Value.GROUP_BY_COLUMN_STATS_CHECK
                        ILL_FORMED_ROW_COUNT -> Value.ILL_FORMED_ROW_COUNT
                        IS_CODE -> Value.IS_CODE
                        IS_JSON -> Value.IS_JSON
                        LLM_RUBRIC_THRESHOLD_V2 -> Value.LLM_RUBRIC_THRESHOLD_V2
                        LABEL_DRIFT -> Value.LABEL_DRIFT
                        METRIC_THRESHOLD -> Value.METRIC_THRESHOLD
                        NEW_CATEGORY_COUNT -> Value.NEW_CATEGORY_COUNT
                        NEW_LABEL_COUNT -> Value.NEW_LABEL_COUNT
                        NULL_ROW_COUNT -> Value.NULL_ROW_COUNT
                        ROW_COUNT -> Value.ROW_COUNT
                        PP_SCORE_VALUE_VALIDATION -> Value.PP_SCORE_VALUE_VALIDATION
                        QUASI_CONSTANT_FEATURE -> Value.QUASI_CONSTANT_FEATURE
                        QUASI_CONSTANT_FEATURE_COUNT -> Value.QUASI_CONSTANT_FEATURE_COUNT
                        SQL_QUERY -> Value.SQL_QUERY
                        DTYPE_VALIDATION -> Value.DTYPE_VALIDATION
                        SENTENCE_LENGTH -> Value.SENTENCE_LENGTH
                        SIZE_RATIO -> Value.SIZE_RATIO
                        SPECIAL_CHARACTERS_RATIO -> Value.SPECIAL_CHARACTERS_RATIO
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
                        ANOMALOUS_COLUMN_COUNT -> Known.ANOMALOUS_COLUMN_COUNT
                        CHARACTER_LENGTH -> Known.CHARACTER_LENGTH
                        CLASS_IMBALANCE_RATIO -> Known.CLASS_IMBALANCE_RATIO
                        EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B -> Known.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
                        COLUMN_AVERAGE -> Known.COLUMN_AVERAGE
                        COLUMN_DRIFT -> Known.COLUMN_DRIFT
                        COLUMN_STATISTIC -> Known.COLUMN_STATISTIC
                        COLUMN_VALUES_MATCH -> Known.COLUMN_VALUES_MATCH
                        CONFLICTING_LABEL_ROW_COUNT -> Known.CONFLICTING_LABEL_ROW_COUNT
                        CONTAINS_PII -> Known.CONTAINS_PII
                        CONTAINS_VALID_URL -> Known.CONTAINS_VALID_URL
                        CORRELATED_FEATURE_COUNT -> Known.CORRELATED_FEATURE_COUNT
                        CUSTOM_METRIC_THRESHOLD -> Known.CUSTOM_METRIC_THRESHOLD
                        DUPLICATE_ROW_COUNT -> Known.DUPLICATE_ROW_COUNT
                        EMPTY_FEATURE -> Known.EMPTY_FEATURE
                        EMPTY_FEATURE_COUNT -> Known.EMPTY_FEATURE_COUNT
                        DRIFTED_FEATURE_COUNT -> Known.DRIFTED_FEATURE_COUNT
                        FEATURE_MISSING_VALUES -> Known.FEATURE_MISSING_VALUES
                        FEATURE_VALUE_VALIDATION -> Known.FEATURE_VALUE_VALIDATION
                        GREAT_EXPECTATIONS -> Known.GREAT_EXPECTATIONS
                        GROUP_BY_COLUMN_STATS_CHECK -> Known.GROUP_BY_COLUMN_STATS_CHECK
                        ILL_FORMED_ROW_COUNT -> Known.ILL_FORMED_ROW_COUNT
                        IS_CODE -> Known.IS_CODE
                        IS_JSON -> Known.IS_JSON
                        LLM_RUBRIC_THRESHOLD_V2 -> Known.LLM_RUBRIC_THRESHOLD_V2
                        LABEL_DRIFT -> Known.LABEL_DRIFT
                        METRIC_THRESHOLD -> Known.METRIC_THRESHOLD
                        NEW_CATEGORY_COUNT -> Known.NEW_CATEGORY_COUNT
                        NEW_LABEL_COUNT -> Known.NEW_LABEL_COUNT
                        NULL_ROW_COUNT -> Known.NULL_ROW_COUNT
                        ROW_COUNT -> Known.ROW_COUNT
                        PP_SCORE_VALUE_VALIDATION -> Known.PP_SCORE_VALUE_VALIDATION
                        QUASI_CONSTANT_FEATURE -> Known.QUASI_CONSTANT_FEATURE
                        QUASI_CONSTANT_FEATURE_COUNT -> Known.QUASI_CONSTANT_FEATURE_COUNT
                        SQL_QUERY -> Known.SQL_QUERY
                        DTYPE_VALIDATION -> Known.DTYPE_VALIDATION
                        SENTENCE_LENGTH -> Known.SENTENCE_LENGTH
                        SIZE_RATIO -> Known.SIZE_RATIO
                        SPECIAL_CHARACTERS_RATIO -> Known.SPECIAL_CHARACTERS_RATIO
                        STRING_VALIDATION -> Known.STRING_VALIDATION
                        TRAIN_VAL_LEAKAGE_ROW_COUNT -> Known.TRAIN_VAL_LEAKAGE_ROW_COUNT
                        else -> throw OpenlayerInvalidDataException("Unknown Subtype: $value")
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

                fun validate(): Subtype = apply {
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

                    return other is Subtype && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Threshold
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Value> = JsonMissing.of(),
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
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun insightName(): Optional<InsightName> = insightName.getOptional("insightName")

                /**
                 * The insight parameters. Required only for some test subtypes. For example, for
                 * tests that require a column name, the insight parameters will be
                 * [{'name': 'column_name', 'value': 'Age'}]
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun insightParameters(): Optional<List<InsightParameter>> =
                    insightParameters.getOptional("insightParameters")

                /**
                 * The measurement to be evaluated.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun measurement(): Optional<String> = measurement.getOptional("measurement")

                /**
                 * The operator to be used for the evaluation.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun operator(): Optional<Operator> = operator.getOptional("operator")

                /**
                 * Whether to use automatic anomaly detection or manual thresholds
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun thresholdMode(): Optional<ThresholdMode> =
                    thresholdMode.getOptional("thresholdMode")

                /**
                 * The value to be compared.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<Value> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [insightName].
                 *
                 * Unlike [insightName], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                 * Unlike [measurement], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                 * Unlike [thresholdMode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("thresholdMode")
                @ExcludeMissing
                fun _thresholdMode(): JsonField<ThresholdMode> = thresholdMode

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    fun insightName(insightName: InsightName) =
                        insightName(JsonField.of(insightName))

                    /**
                     * Sets [Builder.insightName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.insightName] with a well-typed [InsightName]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun insightName(insightName: JsonField<InsightName>) = apply {
                        this.insightName = insightName
                    }

                    /**
                     * The insight parameters. Required only for some test subtypes. For example,
                     * for tests that require a column name, the insight parameters will be
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
                     * `List<InsightParameter>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
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
                     * You should usually call [Builder.measurement] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** Whether to use automatic anomaly detection or manual thresholds */
                    fun thresholdMode(thresholdMode: ThresholdMode) =
                        thresholdMode(JsonField.of(thresholdMode))

                    /**
                     * Sets [Builder.thresholdMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.thresholdMode] with a well-typed
                     * [ThresholdMode] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun thresholdMode(thresholdMode: JsonField<ThresholdMode>) = apply {
                        this.thresholdMode = thresholdMode
                    }

                    /** The value to be compared. */
                    fun value(value: Value) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [Value] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [InsightName]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [InsightName] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [InsightName] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CHARACTER_LENGTH -> Value.CHARACTER_LENGTH
                            CLASS_IMBALANCE -> Value.CLASS_IMBALANCE
                            EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B ->
                                Value.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CHARACTER_LENGTH -> Known.CHARACTER_LENGTH
                            CLASS_IMBALANCE -> Known.CLASS_IMBALANCE
                            EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B ->
                                Known.EXPECT_COLUMN_A_TO_BE_IN_COLUMN_B
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
                            else ->
                                throw OpenlayerInvalidDataException("Unknown InsightName: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InsightName && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class InsightParameter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
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
                         * Returns a mutable builder for constructing an instance of
                         * [InsightParameter].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(insightParameter: InsightParameter) = apply {
                            name = insightParameter.name
                            value = insightParameter.value
                            additionalProperties =
                                insightParameter.additionalProperties.toMutableMap()
                        }

                        /** The name of the insight filter. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun value(value: JsonValue) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        return other is InsightParameter &&
                            name == other.name &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InsightParameter{name=$name, value=$value, additionalProperties=$additionalProperties}"
                }

                /** The operator to be used for the evaluation. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Operator && value == other.value
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An instance of [ThresholdMode] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AUTOMATIC -> Known.AUTOMATIC
                            MANUAL -> Known.MANUAL
                            else ->
                                throw OpenlayerInvalidDataException("Unknown ThresholdMode: $value")
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ThresholdMode && value == other.value
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

                        return other is Value &&
                            number == other.number &&
                            bool == other.bool &&
                            string == other.string &&
                            strings == other.strings
                    }

                    override fun hashCode(): Int = Objects.hash(number, bool, string, strings)

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

                        @JvmStatic
                        fun ofStrings(strings: List<String>) =
                            Value(strings = strings.toImmutable())
                    }

                    /**
                     * An interface that defines how to map each variant of [Value] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        fun visitNumber(number: Double): T

                        fun visitBool(bool: Boolean): T

                        fun visitString(string: String): T

                        fun visitStrings(strings: List<String>): T

                        /**
                         * Maps an unknown variant of [Value] to a value of type [T].
                         *
                         * An instance of [Value] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
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
                                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                            Value(string = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                            Value(number = it, _json = json)
                                        },
                                        tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                            Value(bool = it, _json = json)
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
                                // incompatible with all the possible variants (e.g. deserializing
                                // from object).
                                0 -> Value(_json = json)
                                1 -> bestMatches.single()
                                // If there's more than one match with the highest validity, then
                                // use the first completely valid match, or simply the first match
                                // if none are completely valid.
                                else ->
                                    bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
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

                    return other is Threshold &&
                        insightName == other.insightName &&
                        insightParameters == other.insightParameters &&
                        measurement == other.measurement &&
                        operator == other.operator &&
                        thresholdMode == other.thresholdMode &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        insightName,
                        insightParameters,
                        measurement,
                        operator,
                        thresholdMode,
                        value,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Threshold{insightName=$insightName, insightParameters=$insightParameters, measurement=$measurement, operator=$operator, thresholdMode=$thresholdMode, value=$value, additionalProperties=$additionalProperties}"
            }

            /** The test type. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val INTEGRITY = of("integrity")

                    @JvmField val CONSISTENCY = of("consistency")

                    @JvmField val PERFORMANCE = of("performance")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    INTEGRITY,
                    CONSISTENCY,
                    PERFORMANCE,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INTEGRITY,
                    CONSISTENCY,
                    PERFORMANCE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        INTEGRITY -> Value.INTEGRITY
                        CONSISTENCY -> Value.CONSISTENCY
                        PERFORMANCE -> Value.PERFORMANCE
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
                        INTEGRITY -> Known.INTEGRITY
                        CONSISTENCY -> Known.CONSISTENCY
                        PERFORMANCE -> Known.PERFORMANCE
                        else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
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

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Goal &&
                    id == other.id &&
                    commentCount == other.commentCount &&
                    creatorId == other.creatorId &&
                    dateArchived == other.dateArchived &&
                    dateCreated == other.dateCreated &&
                    dateUpdated == other.dateUpdated &&
                    description == other.description &&
                    name == other.name &&
                    number == other.number &&
                    originProjectVersionId == other.originProjectVersionId &&
                    subtype == other.subtype &&
                    suggested == other.suggested &&
                    thresholds == other.thresholds &&
                    type == other.type &&
                    archived == other.archived &&
                    delayWindow == other.delayWindow &&
                    evaluationWindow == other.evaluationWindow &&
                    usesMlModel == other.usesMlModel &&
                    usesProductionData == other.usesProductionData &&
                    usesReferenceDataset == other.usesReferenceDataset &&
                    usesTrainingDataset == other.usesTrainingDataset &&
                    usesValidationDataset == other.usesValidationDataset &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    commentCount,
                    creatorId,
                    dateArchived,
                    dateCreated,
                    dateUpdated,
                    description,
                    name,
                    number,
                    originProjectVersionId,
                    subtype,
                    suggested,
                    thresholds,
                    type,
                    archived,
                    delayWindow,
                    evaluationWindow,
                    usesMlModel,
                    usesProductionData,
                    usesReferenceDataset,
                    usesTrainingDataset,
                    usesValidationDataset,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Goal{id=$id, commentCount=$commentCount, creatorId=$creatorId, dateArchived=$dateArchived, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, name=$name, number=$number, originProjectVersionId=$originProjectVersionId, subtype=$subtype, suggested=$suggested, thresholds=$thresholds, type=$type, archived=$archived, delayWindow=$delayWindow, evaluationWindow=$evaluationWindow, usesMlModel=$usesMlModel, usesProductionData=$usesProductionData, usesReferenceDataset=$usesReferenceDataset, usesTrainingDataset=$usesTrainingDataset, usesValidationDataset=$usesValidationDataset, additionalProperties=$additionalProperties}"
        }

        /** The body of the rows request. */
        class RowsBody
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val columnFilters: JsonField<List<ColumnFilter>>,
            private val excludeRowIdList: JsonField<List<Long>>,
            private val notSearchQueryAnd: JsonField<List<String>>,
            private val notSearchQueryOr: JsonField<List<String>>,
            private val rowIdList: JsonField<List<Long>>,
            private val searchQueryAnd: JsonField<List<String>>,
            private val searchQueryOr: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("columnFilters")
                @ExcludeMissing
                columnFilters: JsonField<List<ColumnFilter>> = JsonMissing.of(),
                @JsonProperty("excludeRowIdList")
                @ExcludeMissing
                excludeRowIdList: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("notSearchQueryAnd")
                @ExcludeMissing
                notSearchQueryAnd: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("notSearchQueryOr")
                @ExcludeMissing
                notSearchQueryOr: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("rowIdList")
                @ExcludeMissing
                rowIdList: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("searchQueryAnd")
                @ExcludeMissing
                searchQueryAnd: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("searchQueryOr")
                @ExcludeMissing
                searchQueryOr: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                columnFilters,
                excludeRowIdList,
                notSearchQueryAnd,
                notSearchQueryOr,
                rowIdList,
                searchQueryAnd,
                searchQueryOr,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun columnFilters(): Optional<List<ColumnFilter>> =
                columnFilters.getOptional("columnFilters")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun excludeRowIdList(): Optional<List<Long>> =
                excludeRowIdList.getOptional("excludeRowIdList")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun notSearchQueryAnd(): Optional<List<String>> =
                notSearchQueryAnd.getOptional("notSearchQueryAnd")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun notSearchQueryOr(): Optional<List<String>> =
                notSearchQueryOr.getOptional("notSearchQueryOr")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rowIdList(): Optional<List<Long>> = rowIdList.getOptional("rowIdList")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun searchQueryAnd(): Optional<List<String>> =
                searchQueryAnd.getOptional("searchQueryAnd")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun searchQueryOr(): Optional<List<String>> = searchQueryOr.getOptional("searchQueryOr")

            /**
             * Returns the raw JSON value of [columnFilters].
             *
             * Unlike [columnFilters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("columnFilters")
            @ExcludeMissing
            fun _columnFilters(): JsonField<List<ColumnFilter>> = columnFilters

            /**
             * Returns the raw JSON value of [excludeRowIdList].
             *
             * Unlike [excludeRowIdList], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("excludeRowIdList")
            @ExcludeMissing
            fun _excludeRowIdList(): JsonField<List<Long>> = excludeRowIdList

            /**
             * Returns the raw JSON value of [notSearchQueryAnd].
             *
             * Unlike [notSearchQueryAnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("notSearchQueryAnd")
            @ExcludeMissing
            fun _notSearchQueryAnd(): JsonField<List<String>> = notSearchQueryAnd

            /**
             * Returns the raw JSON value of [notSearchQueryOr].
             *
             * Unlike [notSearchQueryOr], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("notSearchQueryOr")
            @ExcludeMissing
            fun _notSearchQueryOr(): JsonField<List<String>> = notSearchQueryOr

            /**
             * Returns the raw JSON value of [rowIdList].
             *
             * Unlike [rowIdList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rowIdList")
            @ExcludeMissing
            fun _rowIdList(): JsonField<List<Long>> = rowIdList

            /**
             * Returns the raw JSON value of [searchQueryAnd].
             *
             * Unlike [searchQueryAnd], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("searchQueryAnd")
            @ExcludeMissing
            fun _searchQueryAnd(): JsonField<List<String>> = searchQueryAnd

            /**
             * Returns the raw JSON value of [searchQueryOr].
             *
             * Unlike [searchQueryOr], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("searchQueryOr")
            @ExcludeMissing
            fun _searchQueryOr(): JsonField<List<String>> = searchQueryOr

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

                /** Returns a mutable builder for constructing an instance of [RowsBody]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RowsBody]. */
            class Builder internal constructor() {

                private var columnFilters: JsonField<MutableList<ColumnFilter>>? = null
                private var excludeRowIdList: JsonField<MutableList<Long>>? = null
                private var notSearchQueryAnd: JsonField<MutableList<String>>? = null
                private var notSearchQueryOr: JsonField<MutableList<String>>? = null
                private var rowIdList: JsonField<MutableList<Long>>? = null
                private var searchQueryAnd: JsonField<MutableList<String>>? = null
                private var searchQueryOr: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rowsBody: RowsBody) = apply {
                    columnFilters = rowsBody.columnFilters.map { it.toMutableList() }
                    excludeRowIdList = rowsBody.excludeRowIdList.map { it.toMutableList() }
                    notSearchQueryAnd = rowsBody.notSearchQueryAnd.map { it.toMutableList() }
                    notSearchQueryOr = rowsBody.notSearchQueryOr.map { it.toMutableList() }
                    rowIdList = rowsBody.rowIdList.map { it.toMutableList() }
                    searchQueryAnd = rowsBody.searchQueryAnd.map { it.toMutableList() }
                    searchQueryOr = rowsBody.searchQueryOr.map { it.toMutableList() }
                    additionalProperties = rowsBody.additionalProperties.toMutableMap()
                }

                fun columnFilters(columnFilters: List<ColumnFilter>?) =
                    columnFilters(JsonField.ofNullable(columnFilters))

                /** Alias for calling [Builder.columnFilters] with `columnFilters.orElse(null)`. */
                fun columnFilters(columnFilters: Optional<List<ColumnFilter>>) =
                    columnFilters(columnFilters.getOrNull())

                /**
                 * Sets [Builder.columnFilters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.columnFilters] with a well-typed
                 * `List<ColumnFilter>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun columnFilters(columnFilters: JsonField<List<ColumnFilter>>) = apply {
                    this.columnFilters = columnFilters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ColumnFilter] to [columnFilters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addColumnFilter(columnFilter: ColumnFilter) = apply {
                    columnFilters =
                        (columnFilters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("columnFilters", it).add(columnFilter)
                        }
                }

                /** Alias for calling [addColumnFilter] with `ColumnFilter.ofSet(set)`. */
                fun addColumnFilter(set: ColumnFilter.SetColumnFilter) =
                    addColumnFilter(ColumnFilter.ofSet(set))

                /** Alias for calling [addColumnFilter] with `ColumnFilter.ofNumeric(numeric)`. */
                fun addColumnFilter(numeric: ColumnFilter.NumericColumnFilter) =
                    addColumnFilter(ColumnFilter.ofNumeric(numeric))

                /** Alias for calling [addColumnFilter] with `ColumnFilter.ofString(string)`. */
                fun addColumnFilter(string: ColumnFilter.StringColumnFilter) =
                    addColumnFilter(ColumnFilter.ofString(string))

                fun excludeRowIdList(excludeRowIdList: List<Long>?) =
                    excludeRowIdList(JsonField.ofNullable(excludeRowIdList))

                /**
                 * Alias for calling [Builder.excludeRowIdList] with
                 * `excludeRowIdList.orElse(null)`.
                 */
                fun excludeRowIdList(excludeRowIdList: Optional<List<Long>>) =
                    excludeRowIdList(excludeRowIdList.getOrNull())

                /**
                 * Sets [Builder.excludeRowIdList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.excludeRowIdList] with a well-typed `List<Long>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun excludeRowIdList(excludeRowIdList: JsonField<List<Long>>) = apply {
                    this.excludeRowIdList = excludeRowIdList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.excludeRowIdList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExcludeRowIdList(excludeRowIdList: Long) = apply {
                    this.excludeRowIdList =
                        (this.excludeRowIdList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("excludeRowIdList", it).add(excludeRowIdList)
                        }
                }

                fun notSearchQueryAnd(notSearchQueryAnd: List<String>?) =
                    notSearchQueryAnd(JsonField.ofNullable(notSearchQueryAnd))

                /**
                 * Alias for calling [Builder.notSearchQueryAnd] with
                 * `notSearchQueryAnd.orElse(null)`.
                 */
                fun notSearchQueryAnd(notSearchQueryAnd: Optional<List<String>>) =
                    notSearchQueryAnd(notSearchQueryAnd.getOrNull())

                /**
                 * Sets [Builder.notSearchQueryAnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notSearchQueryAnd] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun notSearchQueryAnd(notSearchQueryAnd: JsonField<List<String>>) = apply {
                    this.notSearchQueryAnd = notSearchQueryAnd.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.notSearchQueryAnd].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNotSearchQueryAnd(notSearchQueryAnd: String) = apply {
                    this.notSearchQueryAnd =
                        (this.notSearchQueryAnd ?: JsonField.of(mutableListOf())).also {
                            checkKnown("notSearchQueryAnd", it).add(notSearchQueryAnd)
                        }
                }

                fun notSearchQueryOr(notSearchQueryOr: List<String>?) =
                    notSearchQueryOr(JsonField.ofNullable(notSearchQueryOr))

                /**
                 * Alias for calling [Builder.notSearchQueryOr] with
                 * `notSearchQueryOr.orElse(null)`.
                 */
                fun notSearchQueryOr(notSearchQueryOr: Optional<List<String>>) =
                    notSearchQueryOr(notSearchQueryOr.getOrNull())

                /**
                 * Sets [Builder.notSearchQueryOr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notSearchQueryOr] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun notSearchQueryOr(notSearchQueryOr: JsonField<List<String>>) = apply {
                    this.notSearchQueryOr = notSearchQueryOr.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.notSearchQueryOr].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNotSearchQueryOr(notSearchQueryOr: String) = apply {
                    this.notSearchQueryOr =
                        (this.notSearchQueryOr ?: JsonField.of(mutableListOf())).also {
                            checkKnown("notSearchQueryOr", it).add(notSearchQueryOr)
                        }
                }

                fun rowIdList(rowIdList: List<Long>?) = rowIdList(JsonField.ofNullable(rowIdList))

                /** Alias for calling [Builder.rowIdList] with `rowIdList.orElse(null)`. */
                fun rowIdList(rowIdList: Optional<List<Long>>) = rowIdList(rowIdList.getOrNull())

                /**
                 * Sets [Builder.rowIdList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rowIdList] with a well-typed `List<Long>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rowIdList(rowIdList: JsonField<List<Long>>) = apply {
                    this.rowIdList = rowIdList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [Builder.rowIdList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRowIdList(rowIdList: Long) = apply {
                    this.rowIdList =
                        (this.rowIdList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rowIdList", it).add(rowIdList)
                        }
                }

                fun searchQueryAnd(searchQueryAnd: List<String>?) =
                    searchQueryAnd(JsonField.ofNullable(searchQueryAnd))

                /**
                 * Alias for calling [Builder.searchQueryAnd] with `searchQueryAnd.orElse(null)`.
                 */
                fun searchQueryAnd(searchQueryAnd: Optional<List<String>>) =
                    searchQueryAnd(searchQueryAnd.getOrNull())

                /**
                 * Sets [Builder.searchQueryAnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.searchQueryAnd] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun searchQueryAnd(searchQueryAnd: JsonField<List<String>>) = apply {
                    this.searchQueryAnd = searchQueryAnd.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.searchQueryAnd].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSearchQueryAnd(searchQueryAnd: String) = apply {
                    this.searchQueryAnd =
                        (this.searchQueryAnd ?: JsonField.of(mutableListOf())).also {
                            checkKnown("searchQueryAnd", it).add(searchQueryAnd)
                        }
                }

                fun searchQueryOr(searchQueryOr: List<String>?) =
                    searchQueryOr(JsonField.ofNullable(searchQueryOr))

                /** Alias for calling [Builder.searchQueryOr] with `searchQueryOr.orElse(null)`. */
                fun searchQueryOr(searchQueryOr: Optional<List<String>>) =
                    searchQueryOr(searchQueryOr.getOrNull())

                /**
                 * Sets [Builder.searchQueryOr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.searchQueryOr] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun searchQueryOr(searchQueryOr: JsonField<List<String>>) = apply {
                    this.searchQueryOr = searchQueryOr.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.searchQueryOr].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSearchQueryOr(searchQueryOr: String) = apply {
                    this.searchQueryOr =
                        (this.searchQueryOr ?: JsonField.of(mutableListOf())).also {
                            checkKnown("searchQueryOr", it).add(searchQueryOr)
                        }
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
                 * Returns an immutable instance of [RowsBody].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RowsBody =
                    RowsBody(
                        (columnFilters ?: JsonMissing.of()).map { it.toImmutable() },
                        (excludeRowIdList ?: JsonMissing.of()).map { it.toImmutable() },
                        (notSearchQueryAnd ?: JsonMissing.of()).map { it.toImmutable() },
                        (notSearchQueryOr ?: JsonMissing.of()).map { it.toImmutable() },
                        (rowIdList ?: JsonMissing.of()).map { it.toImmutable() },
                        (searchQueryAnd ?: JsonMissing.of()).map { it.toImmutable() },
                        (searchQueryOr ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RowsBody = apply {
                if (validated) {
                    return@apply
                }

                columnFilters().ifPresent { it.forEach { it.validate() } }
                excludeRowIdList()
                notSearchQueryAnd()
                notSearchQueryOr()
                rowIdList()
                searchQueryAnd()
                searchQueryOr()
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
                (columnFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (excludeRowIdList.asKnown().getOrNull()?.size ?: 0) +
                    (notSearchQueryAnd.asKnown().getOrNull()?.size ?: 0) +
                    (notSearchQueryOr.asKnown().getOrNull()?.size ?: 0) +
                    (rowIdList.asKnown().getOrNull()?.size ?: 0) +
                    (searchQueryAnd.asKnown().getOrNull()?.size ?: 0) +
                    (searchQueryOr.asKnown().getOrNull()?.size ?: 0)

            @JsonDeserialize(using = ColumnFilter.Deserializer::class)
            @JsonSerialize(using = ColumnFilter.Serializer::class)
            class ColumnFilter
            private constructor(
                private val set: SetColumnFilter? = null,
                private val numeric: NumericColumnFilter? = null,
                private val string: StringColumnFilter? = null,
                private val _json: JsonValue? = null,
            ) {

                fun set(): Optional<SetColumnFilter> = Optional.ofNullable(set)

                fun numeric(): Optional<NumericColumnFilter> = Optional.ofNullable(numeric)

                fun string(): Optional<StringColumnFilter> = Optional.ofNullable(string)

                fun isSet(): Boolean = set != null

                fun isNumeric(): Boolean = numeric != null

                fun isString(): Boolean = string != null

                fun asSet(): SetColumnFilter = set.getOrThrow("set")

                fun asNumeric(): NumericColumnFilter = numeric.getOrThrow("numeric")

                fun asString(): StringColumnFilter = string.getOrThrow("string")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        set != null -> visitor.visitSet(set)
                        numeric != null -> visitor.visitNumeric(numeric)
                        string != null -> visitor.visitString(string)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): ColumnFilter = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitSet(set: SetColumnFilter) {
                                set.validate()
                            }

                            override fun visitNumeric(numeric: NumericColumnFilter) {
                                numeric.validate()
                            }

                            override fun visitString(string: StringColumnFilter) {
                                string.validate()
                            }
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
                            override fun visitSet(set: SetColumnFilter) = set.validity()

                            override fun visitNumeric(numeric: NumericColumnFilter) =
                                numeric.validity()

                            override fun visitString(string: StringColumnFilter) = string.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ColumnFilter &&
                        set == other.set &&
                        numeric == other.numeric &&
                        string == other.string
                }

                override fun hashCode(): Int = Objects.hash(set, numeric, string)

                override fun toString(): String =
                    when {
                        set != null -> "ColumnFilter{set=$set}"
                        numeric != null -> "ColumnFilter{numeric=$numeric}"
                        string != null -> "ColumnFilter{string=$string}"
                        _json != null -> "ColumnFilter{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid ColumnFilter")
                    }

                companion object {

                    @JvmStatic fun ofSet(set: SetColumnFilter) = ColumnFilter(set = set)

                    @JvmStatic
                    fun ofNumeric(numeric: NumericColumnFilter) = ColumnFilter(numeric = numeric)

                    @JvmStatic
                    fun ofString(string: StringColumnFilter) = ColumnFilter(string = string)
                }

                /**
                 * An interface that defines how to map each variant of [ColumnFilter] to a value of
                 * type [T].
                 */
                interface Visitor<out T> {

                    fun visitSet(set: SetColumnFilter): T

                    fun visitNumeric(numeric: NumericColumnFilter): T

                    fun visitString(string: StringColumnFilter): T

                    /**
                     * Maps an unknown variant of [ColumnFilter] to a value of type [T].
                     *
                     * An instance of [ColumnFilter] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws OpenlayerInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw OpenlayerInvalidDataException("Unknown ColumnFilter: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<ColumnFilter>(ColumnFilter::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): ColumnFilter {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<SetColumnFilter>())?.let {
                                        ColumnFilter(set = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<NumericColumnFilter>())
                                        ?.let { ColumnFilter(numeric = it, _json = json) },
                                    tryDeserialize(node, jacksonTypeRef<StringColumnFilter>())
                                        ?.let { ColumnFilter(string = it, _json = json) },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> ColumnFilter(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<ColumnFilter>(ColumnFilter::class) {

                    override fun serialize(
                        value: ColumnFilter,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.set != null -> generator.writeObject(value.set)
                            value.numeric != null -> generator.writeObject(value.numeric)
                            value.string != null -> generator.writeObject(value.string)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid ColumnFilter")
                        }
                    }
                }

                class SetColumnFilter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val measurement: JsonField<String>,
                    private val operator: JsonField<Operator>,
                    private val value: JsonField<List<Value>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("measurement")
                        @ExcludeMissing
                        measurement: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<List<Value>> = JsonMissing.of(),
                    ) : this(measurement, operator, value, mutableMapOf())

                    /**
                     * The name of the column.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun measurement(): String = measurement.getRequired("measurement")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): List<Value> = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [measurement].
                     *
                     * Unlike [measurement], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("measurement")
                    @ExcludeMissing
                    fun _measurement(): JsonField<String> = measurement

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value")
                    @ExcludeMissing
                    fun _value(): JsonField<List<Value>> = value

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
                         * [SetColumnFilter].
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SetColumnFilter]. */
                    class Builder internal constructor() {

                        private var measurement: JsonField<String>? = null
                        private var operator: JsonField<Operator>? = null
                        private var value: JsonField<MutableList<Value>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(setColumnFilter: SetColumnFilter) = apply {
                            measurement = setColumnFilter.measurement
                            operator = setColumnFilter.operator
                            value = setColumnFilter.value.map { it.toMutableList() }
                            additionalProperties =
                                setColumnFilter.additionalProperties.toMutableMap()
                        }

                        /** The name of the column. */
                        fun measurement(measurement: String) =
                            measurement(JsonField.of(measurement))

                        /**
                         * Sets [Builder.measurement] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.measurement] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun measurement(measurement: JsonField<String>) = apply {
                            this.measurement = measurement
                        }

                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        fun value(value: List<Value>) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed `List<Value>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<List<Value>>) = apply {
                            this.value = value.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Value] to [Builder.value].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addValue(value: Value) = apply {
                            this.value =
                                (this.value ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("value", it).add(value)
                                }
                        }

                        /** Alias for calling [addValue] with `Value.ofString(string)`. */
                        fun addValue(string: String) = addValue(Value.ofString(string))

                        /** Alias for calling [addValue] with `Value.ofNumber(number)`. */
                        fun addValue(number: Double) = addValue(Value.ofNumber(number))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SetColumnFilter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SetColumnFilter =
                            SetColumnFilter(
                                checkRequired("measurement", measurement),
                                checkRequired("operator", operator),
                                checkRequired("value", value).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): SetColumnFilter = apply {
                        if (validated) {
                            return@apply
                        }

                        measurement()
                        operator().validate()
                        value().forEach { it.validate() }
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
                        (if (measurement.asKnown().isPresent) 1 else 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (value.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val CONTAINS_NONE = of("contains_none")

                            @JvmField val CONTAINS_ANY = of("contains_any")

                            @JvmField val CONTAINS_ALL = of("contains_all")

                            @JvmField val ONE_OF = of("one_of")

                            @JvmField val NONE_OF = of("none_of")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            CONTAINS_NONE,
                            CONTAINS_ANY,
                            CONTAINS_ALL,
                            ONE_OF,
                            NONE_OF,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            CONTAINS_NONE,
                            CONTAINS_ANY,
                            CONTAINS_ALL,
                            ONE_OF,
                            NONE_OF,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                CONTAINS_NONE -> Value.CONTAINS_NONE
                                CONTAINS_ANY -> Value.CONTAINS_ANY
                                CONTAINS_ALL -> Value.CONTAINS_ALL
                                ONE_OF -> Value.ONE_OF
                                NONE_OF -> Value.NONE_OF
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                CONTAINS_NONE -> Known.CONTAINS_NONE
                                CONTAINS_ANY -> Known.CONTAINS_ANY
                                CONTAINS_ALL -> Known.CONTAINS_ALL
                                ONE_OF -> Known.ONE_OF
                                NONE_OF -> Known.NONE_OF
                                else ->
                                    throw OpenlayerInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Operator && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val number: Double? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun string(): Optional<String> = Optional.ofNullable(string)

                        fun number(): Optional<Double> = Optional.ofNullable(number)

                        fun isString(): Boolean = string != null

                        fun isNumber(): Boolean = number != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asNumber(): Double = number.getOrThrow("number")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                string != null -> visitor.visitString(string)
                                number != null -> visitor.visitNumber(number)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitString(string: String) {}

                                    override fun visitNumber(number: Double) {}
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitString(string: String) = 1

                                    override fun visitNumber(number: Double) = 1

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Value &&
                                string == other.string &&
                                number == other.number
                        }

                        override fun hashCode(): Int = Objects.hash(string, number)

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                number != null -> "Value{number=$number}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofNumber(number: Double) = Value(number = number)
                        }

                        /**
                         * An interface that defines how to map each variant of [Value] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitNumber(number: Double): T

                            /**
                             * Maps an unknown variant of [Value] to a value of type [T].
                             *
                             * An instance of [Value] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
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
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Value(string = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                                Value(number = it, _json = json)
                                            },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from boolean).
                                    0 -> Value(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
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
                                    value.string != null -> generator.writeObject(value.string)
                                    value.number != null -> generator.writeObject(value.number)
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

                        return other is SetColumnFilter &&
                            measurement == other.measurement &&
                            operator == other.operator &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(measurement, operator, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SetColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                }

                class NumericColumnFilter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val measurement: JsonField<String>,
                    private val operator: JsonField<Operator>,
                    private val value: JsonField<Float>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("measurement")
                        @ExcludeMissing
                        measurement: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Float> = JsonMissing.of(),
                    ) : this(measurement, operator, value, mutableMapOf())

                    /**
                     * The name of the column.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun measurement(): String = measurement.getRequired("measurement")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun value(): Optional<Float> = value.getOptional("value")

                    /**
                     * Returns the raw JSON value of [measurement].
                     *
                     * Unlike [measurement], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("measurement")
                    @ExcludeMissing
                    fun _measurement(): JsonField<String> = measurement

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Float> = value

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
                         * [NumericColumnFilter].
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [NumericColumnFilter]. */
                    class Builder internal constructor() {

                        private var measurement: JsonField<String>? = null
                        private var operator: JsonField<Operator>? = null
                        private var value: JsonField<Float>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(numericColumnFilter: NumericColumnFilter) = apply {
                            measurement = numericColumnFilter.measurement
                            operator = numericColumnFilter.operator
                            value = numericColumnFilter.value
                            additionalProperties =
                                numericColumnFilter.additionalProperties.toMutableMap()
                        }

                        /** The name of the column. */
                        fun measurement(measurement: String) =
                            measurement(JsonField.of(measurement))

                        /**
                         * Sets [Builder.measurement] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.measurement] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun measurement(measurement: JsonField<String>) = apply {
                            this.measurement = measurement
                        }

                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        fun value(value: Float?) = value(JsonField.ofNullable(value))

                        /**
                         * Alias for [Builder.value].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun value(value: Float) = value(value as Float?)

                        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                        fun value(value: Optional<Float>) = value(value.getOrNull())

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Float] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Float>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [NumericColumnFilter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): NumericColumnFilter =
                            NumericColumnFilter(
                                checkRequired("measurement", measurement),
                                checkRequired("operator", operator),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): NumericColumnFilter = apply {
                        if (validated) {
                            return@apply
                        }

                        measurement()
                        operator().validate()
                        value()
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
                        (if (measurement.asKnown().isPresent) 1 else 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val GREATER = of(">")

                            @JvmField val GREATER_OR_EQUALS = of(">=")

                            @JvmField val IS = of("is")

                            @JvmField val LESS = of("<")

                            @JvmField val LESS_OR_EQUALS = of("<=")

                            @JvmField val NOT_EQUALS = of("!=")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            GREATER,
                            GREATER_OR_EQUALS,
                            IS,
                            LESS,
                            LESS_OR_EQUALS,
                            NOT_EQUALS,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            GREATER,
                            GREATER_OR_EQUALS,
                            IS,
                            LESS,
                            LESS_OR_EQUALS,
                            NOT_EQUALS,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                GREATER -> Value.GREATER
                                GREATER_OR_EQUALS -> Value.GREATER_OR_EQUALS
                                IS -> Value.IS
                                LESS -> Value.LESS
                                LESS_OR_EQUALS -> Value.LESS_OR_EQUALS
                                NOT_EQUALS -> Value.NOT_EQUALS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                GREATER -> Known.GREATER
                                GREATER_OR_EQUALS -> Known.GREATER_OR_EQUALS
                                IS -> Known.IS
                                LESS -> Known.LESS
                                LESS_OR_EQUALS -> Known.LESS_OR_EQUALS
                                NOT_EQUALS -> Known.NOT_EQUALS
                                else ->
                                    throw OpenlayerInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Operator && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is NumericColumnFilter &&
                            measurement == other.measurement &&
                            operator == other.operator &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(measurement, operator, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "NumericColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                }

                class StringColumnFilter
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val measurement: JsonField<String>,
                    private val operator: JsonField<Operator>,
                    private val value: JsonField<Value>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("measurement")
                        @ExcludeMissing
                        measurement: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("operator")
                        @ExcludeMissing
                        operator: JsonField<Operator> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Value> = JsonMissing.of(),
                    ) : this(measurement, operator, value, mutableMapOf())

                    /**
                     * The name of the column.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun measurement(): String = measurement.getRequired("measurement")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun operator(): Operator = operator.getRequired("operator")

                    /**
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): Value = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [measurement].
                     *
                     * Unlike [measurement], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("measurement")
                    @ExcludeMissing
                    fun _measurement(): JsonField<String> = measurement

                    /**
                     * Returns the raw JSON value of [operator].
                     *
                     * Unlike [operator], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun _operator(): JsonField<Operator> = operator

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
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

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [StringColumnFilter].
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [StringColumnFilter]. */
                    class Builder internal constructor() {

                        private var measurement: JsonField<String>? = null
                        private var operator: JsonField<Operator>? = null
                        private var value: JsonField<Value>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(stringColumnFilter: StringColumnFilter) = apply {
                            measurement = stringColumnFilter.measurement
                            operator = stringColumnFilter.operator
                            value = stringColumnFilter.value
                            additionalProperties =
                                stringColumnFilter.additionalProperties.toMutableMap()
                        }

                        /** The name of the column. */
                        fun measurement(measurement: String) =
                            measurement(JsonField.of(measurement))

                        /**
                         * Sets [Builder.measurement] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.measurement] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun measurement(measurement: JsonField<String>) = apply {
                            this.measurement = measurement
                        }

                        fun operator(operator: Operator) = operator(JsonField.of(operator))

                        /**
                         * Sets [Builder.operator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.operator] with a well-typed [Operator]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun operator(operator: JsonField<Operator>) = apply {
                            this.operator = operator
                        }

                        fun value(value: Value) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Value] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Value>) = apply { this.value = value }

                        /** Alias for calling [value] with `Value.ofString(string)`. */
                        fun value(string: String) = value(Value.ofString(string))

                        /** Alias for calling [value] with `Value.ofBool(bool)`. */
                        fun value(bool: Boolean) = value(Value.ofBool(bool))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [StringColumnFilter].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .measurement()
                         * .operator()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): StringColumnFilter =
                            StringColumnFilter(
                                checkRequired("measurement", measurement),
                                checkRequired("operator", operator),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): StringColumnFilter = apply {
                        if (validated) {
                            return@apply
                        }

                        measurement()
                        operator().validate()
                        value().validate()
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
                        (if (measurement.asKnown().isPresent) 1 else 0) +
                            (operator.asKnown().getOrNull()?.validity() ?: 0) +
                            (value.asKnown().getOrNull()?.validity() ?: 0)

                    class Operator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val IS = of("is")

                            @JvmField val NOT_EQUALS = of("!=")

                            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                        }

                        /** An enum containing [Operator]'s known values. */
                        enum class Known {
                            IS,
                            NOT_EQUALS,
                        }

                        /**
                         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Operator] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            IS,
                            NOT_EQUALS,
                            /**
                             * An enum member indicating that [Operator] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                IS -> Value.IS
                                NOT_EQUALS -> Value.NOT_EQUALS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                IS -> Known.IS
                                NOT_EQUALS -> Known.NOT_EQUALS
                                else ->
                                    throw OpenlayerInvalidDataException("Unknown Operator: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Operator && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = Value.Deserializer::class)
                    @JsonSerialize(using = Value.Serializer::class)
                    class Value
                    private constructor(
                        private val string: String? = null,
                        private val bool: Boolean? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun string(): Optional<String> = Optional.ofNullable(string)

                        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                        fun isString(): Boolean = string != null

                        fun isBool(): Boolean = bool != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asBool(): Boolean = bool.getOrThrow("bool")

                        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                        fun <T> accept(visitor: Visitor<T>): T =
                            when {
                                string != null -> visitor.visitString(string)
                                bool != null -> visitor.visitBool(bool)
                                else -> visitor.unknown(_json)
                            }

                        private var validated: Boolean = false

                        fun validate(): Value = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitString(string: String) {}

                                    override fun visitBool(bool: Boolean) {}
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            accept(
                                object : Visitor<Int> {
                                    override fun visitString(string: String) = 1

                                    override fun visitBool(bool: Boolean) = 1

                                    override fun unknown(json: JsonValue?) = 0
                                }
                            )

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Value && string == other.string && bool == other.bool
                        }

                        override fun hashCode(): Int = Objects.hash(string, bool)

                        override fun toString(): String =
                            when {
                                string != null -> "Value{string=$string}"
                                bool != null -> "Value{bool=$bool}"
                                _json != null -> "Value{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Value")
                            }

                        companion object {

                            @JvmStatic fun ofString(string: String) = Value(string = string)

                            @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)
                        }

                        /**
                         * An interface that defines how to map each variant of [Value] to a value
                         * of type [T].
                         */
                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitBool(bool: Boolean): T

                            /**
                             * Maps an unknown variant of [Value] to a value of type [T].
                             *
                             * An instance of [Value] can contain an unknown variant if it was
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
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
                                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                                Value(string = it, _json = json)
                                            },
                                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                                Value(bool = it, _json = json)
                                            },
                                        )
                                        .filterNotNull()
                                        .allMaxBy { it.validity() }
                                        .toList()
                                return when (bestMatches.size) {
                                    // This can happen if what we're deserializing is completely
                                    // incompatible with all the possible variants (e.g.
                                    // deserializing from integer).
                                    0 -> Value(_json = json)
                                    1 -> bestMatches.single()
                                    // If there's more than one match with the highest validity,
                                    // then use the first completely valid match, or simply the
                                    // first match if none are completely valid.
                                    else ->
                                        bestMatches.firstOrNull { it.isValid() }
                                            ?: bestMatches.first()
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
                                    value.string != null -> generator.writeObject(value.string)
                                    value.bool != null -> generator.writeObject(value.bool)
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

                        return other is StringColumnFilter &&
                            measurement == other.measurement &&
                            operator == other.operator &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(measurement, operator, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "StringColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RowsBody &&
                    columnFilters == other.columnFilters &&
                    excludeRowIdList == other.excludeRowIdList &&
                    notSearchQueryAnd == other.notSearchQueryAnd &&
                    notSearchQueryOr == other.notSearchQueryOr &&
                    rowIdList == other.rowIdList &&
                    searchQueryAnd == other.searchQueryAnd &&
                    searchQueryOr == other.searchQueryOr &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    columnFilters,
                    excludeRowIdList,
                    notSearchQueryAnd,
                    notSearchQueryOr,
                    rowIdList,
                    searchQueryAnd,
                    searchQueryOr,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RowsBody{columnFilters=$columnFilters, excludeRowIdList=$excludeRowIdList, notSearchQueryAnd=$notSearchQueryAnd, notSearchQueryOr=$notSearchQueryOr, rowIdList=$rowIdList, searchQueryAnd=$searchQueryAnd, searchQueryOr=$searchQueryOr, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                dateCreated == other.dateCreated &&
                dateDataEnds == other.dateDataEnds &&
                dateDataStarts == other.dateDataStarts &&
                dateUpdated == other.dateUpdated &&
                inferencePipelineId == other.inferencePipelineId &&
                projectVersionId == other.projectVersionId &&
                status == other.status &&
                statusMessage == other.statusMessage &&
                expectedValues == other.expectedValues &&
                goal == other.goal &&
                goalId == other.goalId &&
                rows == other.rows &&
                rowsBody == other.rowsBody &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                dateCreated,
                dateDataEnds,
                dateDataStarts,
                dateUpdated,
                inferencePipelineId,
                projectVersionId,
                status,
                statusMessage,
                expectedValues,
                goal,
                goalId,
                rows,
                rowsBody,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, dateCreated=$dateCreated, dateDataEnds=$dateDataEnds, dateDataStarts=$dateDataStarts, dateUpdated=$dateUpdated, inferencePipelineId=$inferencePipelineId, projectVersionId=$projectVersionId, status=$status, statusMessage=$statusMessage, expectedValues=$expectedValues, goal=$goal, goalId=$goalId, rows=$rows, rowsBody=$rowsBody, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestResultListResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestResultListResponse{items=$items, additionalProperties=$additionalProperties}"
}
