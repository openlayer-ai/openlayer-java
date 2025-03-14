// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

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
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class CommitTestResultListResponse
@JsonCreator
private constructor(
    @JsonProperty("items")
    @ExcludeMissing
    private val items: JsonField<List<Item>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun items(): List<Item> = items.getRequired("items")

    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CommitTestResultListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitTestResultListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitTestResultListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitTestResultListResponse: CommitTestResultListResponse) = apply {
            items = commitTestResultListResponse.items.map { it.toMutableList() }
            additionalProperties = commitTestResultListResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

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

        fun build(): CommitTestResultListResponse =
            CommitTestResultListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Item
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateDataEnds")
        @ExcludeMissing
        private val dateDataEnds: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateDataStarts")
        @ExcludeMissing
        private val dateDataStarts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inferencePipelineId")
        @ExcludeMissing
        private val inferencePipelineId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("projectVersionId")
        @ExcludeMissing
        private val projectVersionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("statusMessage")
        @ExcludeMissing
        private val statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("goal") @ExcludeMissing private val goal: JsonField<Goal> = JsonMissing.of(),
        @JsonProperty("goalId")
        @ExcludeMissing
        private val goalId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Project version (commit) id. */
        fun id(): String = id.getRequired("id")

        /** The creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The data end date. */
        fun dateDataEnds(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateDataEnds.getNullable("dateDataEnds"))

        /** The data start date. */
        fun dateDataStarts(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateDataStarts.getNullable("dateDataStarts"))

        /** The last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The inference pipeline id. */
        fun inferencePipelineId(): Optional<String> =
            Optional.ofNullable(inferencePipelineId.getNullable("inferencePipelineId"))

        /** The project version (commit) id. */
        fun projectVersionId(): Optional<String> =
            Optional.ofNullable(projectVersionId.getNullable("projectVersionId"))

        /** The status of the test. */
        fun status(): Status = status.getRequired("status")

        /** The status message. */
        fun statusMessage(): Optional<String> =
            Optional.ofNullable(statusMessage.getNullable("statusMessage"))

        fun goal(): Optional<Goal> = Optional.ofNullable(goal.getNullable("goal"))

        /** The test id. */
        fun goalId(): Optional<String> = Optional.ofNullable(goalId.getNullable("goalId"))

        /** Project version (commit) id. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The creation date. */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /** The data end date. */
        @JsonProperty("dateDataEnds")
        @ExcludeMissing
        fun _dateDataEnds(): JsonField<OffsetDateTime> = dateDataEnds

        /** The data start date. */
        @JsonProperty("dateDataStarts")
        @ExcludeMissing
        fun _dateDataStarts(): JsonField<OffsetDateTime> = dateDataStarts

        /** The last updated date. */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /** The inference pipeline id. */
        @JsonProperty("inferencePipelineId")
        @ExcludeMissing
        fun _inferencePipelineId(): JsonField<String> = inferencePipelineId

        /** The project version (commit) id. */
        @JsonProperty("projectVersionId")
        @ExcludeMissing
        fun _projectVersionId(): JsonField<String> = projectVersionId

        /** The status of the test. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** The status message. */
        @JsonProperty("statusMessage")
        @ExcludeMissing
        fun _statusMessage(): JsonField<String> = statusMessage

        @JsonProperty("goal") @ExcludeMissing fun _goal(): JsonField<Goal> = goal

        /** The test id. */
        @JsonProperty("goalId") @ExcludeMissing fun _goalId(): JsonField<String> = goalId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            status()
            statusMessage()
            goal().ifPresent { it.validate() }
            goalId()
            validated = true
        }

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
            private var goal: JsonField<Goal> = JsonMissing.of()
            private var goalId: JsonField<String> = JsonMissing.of()
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
                goal = item.goal
                goalId = item.goalId
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** Project version (commit) id. */
            fun id(id: String) = id(JsonField.of(id))

            /** Project version (commit) id. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The creation date. */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The data end date. */
            fun dateDataEnds(dateDataEnds: OffsetDateTime?) =
                dateDataEnds(JsonField.ofNullable(dateDataEnds))

            /** The data end date. */
            fun dateDataEnds(dateDataEnds: Optional<OffsetDateTime>) =
                dateDataEnds(dateDataEnds.getOrNull())

            /** The data end date. */
            fun dateDataEnds(dateDataEnds: JsonField<OffsetDateTime>) = apply {
                this.dateDataEnds = dateDataEnds
            }

            /** The data start date. */
            fun dateDataStarts(dateDataStarts: OffsetDateTime?) =
                dateDataStarts(JsonField.ofNullable(dateDataStarts))

            /** The data start date. */
            fun dateDataStarts(dateDataStarts: Optional<OffsetDateTime>) =
                dateDataStarts(dateDataStarts.getOrNull())

            /** The data start date. */
            fun dateDataStarts(dateDataStarts: JsonField<OffsetDateTime>) = apply {
                this.dateDataStarts = dateDataStarts
            }

            /** The last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The last updated date. */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The inference pipeline id. */
            fun inferencePipelineId(inferencePipelineId: String?) =
                inferencePipelineId(JsonField.ofNullable(inferencePipelineId))

            /** The inference pipeline id. */
            fun inferencePipelineId(inferencePipelineId: Optional<String>) =
                inferencePipelineId(inferencePipelineId.getOrNull())

            /** The inference pipeline id. */
            fun inferencePipelineId(inferencePipelineId: JsonField<String>) = apply {
                this.inferencePipelineId = inferencePipelineId
            }

            /** The project version (commit) id. */
            fun projectVersionId(projectVersionId: String?) =
                projectVersionId(JsonField.ofNullable(projectVersionId))

            /** The project version (commit) id. */
            fun projectVersionId(projectVersionId: Optional<String>) =
                projectVersionId(projectVersionId.getOrNull())

            /** The project version (commit) id. */
            fun projectVersionId(projectVersionId: JsonField<String>) = apply {
                this.projectVersionId = projectVersionId
            }

            /** The status of the test. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the test. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The status message. */
            fun statusMessage(statusMessage: String?) =
                statusMessage(JsonField.ofNullable(statusMessage))

            /** The status message. */
            fun statusMessage(statusMessage: Optional<String>) =
                statusMessage(statusMessage.getOrNull())

            /** The status message. */
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            fun goal(goal: Goal) = goal(JsonField.of(goal))

            fun goal(goal: JsonField<Goal>) = apply { this.goal = goal }

            /** The test id. */
            fun goalId(goalId: String?) = goalId(JsonField.ofNullable(goalId))

            /** The test id. */
            fun goalId(goalId: Optional<String>) = goalId(goalId.getOrNull())

            /** The test id. */
            fun goalId(goalId: JsonField<String>) = apply { this.goalId = goalId }

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
                    goal,
                    goalId,
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Goal
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commentCount")
            @ExcludeMissing
            private val commentCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            private val creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateArchived")
            @ExcludeMissing
            private val dateArchived: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonValue = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("number")
            @ExcludeMissing
            private val number: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("originProjectVersionId")
            @ExcludeMissing
            private val originProjectVersionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subtype")
            @ExcludeMissing
            private val subtype: JsonField<String> = JsonMissing.of(),
            @JsonProperty("suggested")
            @ExcludeMissing
            private val suggested: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("thresholds")
            @ExcludeMissing
            private val thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("archived")
            @ExcludeMissing
            private val archived: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("delayWindow")
            @ExcludeMissing
            private val delayWindow: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("evaluationWindow")
            @ExcludeMissing
            private val evaluationWindow: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("usesMlModel")
            @ExcludeMissing
            private val usesMlModel: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("usesProductionData")
            @ExcludeMissing
            private val usesProductionData: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("usesReferenceDataset")
            @ExcludeMissing
            private val usesReferenceDataset: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("usesTrainingDataset")
            @ExcludeMissing
            private val usesTrainingDataset: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("usesValidationDataset")
            @ExcludeMissing
            private val usesValidationDataset: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The test id. */
            fun id(): String = id.getRequired("id")

            /** The number of comments on the test. */
            fun commentCount(): Long = commentCount.getRequired("commentCount")

            /** The test creator id. */
            fun creatorId(): Optional<String> =
                Optional.ofNullable(creatorId.getNullable("creatorId"))

            /** The date the test was archived. */
            fun dateArchived(): Optional<OffsetDateTime> =
                Optional.ofNullable(dateArchived.getNullable("dateArchived"))

            /** The creation date. */
            fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

            /** The last updated date. */
            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            /** The test description. */
            @JsonProperty("description") @ExcludeMissing fun _description(): JsonValue = description

            /** The test name. */
            fun name(): String = name.getRequired("name")

            /** The test number. */
            fun number(): Long = number.getRequired("number")

            /** The project version (commit) id where the test was created. */
            fun originProjectVersionId(): Optional<String> =
                Optional.ofNullable(originProjectVersionId.getNullable("originProjectVersionId"))

            /** The test subtype. */
            fun subtype(): String = subtype.getRequired("subtype")

            /** Whether the test is suggested or user-created. */
            fun suggested(): Boolean = suggested.getRequired("suggested")

            fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

            /** The test type. */
            fun type(): String = type.getRequired("type")

            /** Whether the test is archived. */
            fun archived(): Optional<Boolean> =
                Optional.ofNullable(archived.getNullable("archived"))

            /** The delay window in seconds. Only applies to tests that use production data. */
            fun delayWindow(): Optional<Double> =
                Optional.ofNullable(delayWindow.getNullable("delayWindow"))

            /** The evaluation window in seconds. Only applies to tests that use production data. */
            fun evaluationWindow(): Optional<Double> =
                Optional.ofNullable(evaluationWindow.getNullable("evaluationWindow"))

            /** Whether the test uses an ML model. */
            fun usesMlModel(): Optional<Boolean> =
                Optional.ofNullable(usesMlModel.getNullable("usesMlModel"))

            /** Whether the test uses production data (monitoring mode only). */
            fun usesProductionData(): Optional<Boolean> =
                Optional.ofNullable(usesProductionData.getNullable("usesProductionData"))

            /** Whether the test uses a reference dataset (monitoring mode only). */
            fun usesReferenceDataset(): Optional<Boolean> =
                Optional.ofNullable(usesReferenceDataset.getNullable("usesReferenceDataset"))

            /** Whether the test uses a training dataset. */
            fun usesTrainingDataset(): Optional<Boolean> =
                Optional.ofNullable(usesTrainingDataset.getNullable("usesTrainingDataset"))

            /** Whether the test uses a validation dataset. */
            fun usesValidationDataset(): Optional<Boolean> =
                Optional.ofNullable(usesValidationDataset.getNullable("usesValidationDataset"))

            /** The test id. */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** The number of comments on the test. */
            @JsonProperty("commentCount")
            @ExcludeMissing
            fun _commentCount(): JsonField<Long> = commentCount

            /** The test creator id. */
            @JsonProperty("creatorId")
            @ExcludeMissing
            fun _creatorId(): JsonField<String> = creatorId

            /** The date the test was archived. */
            @JsonProperty("dateArchived")
            @ExcludeMissing
            fun _dateArchived(): JsonField<OffsetDateTime> = dateArchived

            /** The creation date. */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

            /** The last updated date. */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

            /** The test name. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The test number. */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<Long> = number

            /** The project version (commit) id where the test was created. */
            @JsonProperty("originProjectVersionId")
            @ExcludeMissing
            fun _originProjectVersionId(): JsonField<String> = originProjectVersionId

            /** The test subtype. */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

            /** Whether the test is suggested or user-created. */
            @JsonProperty("suggested")
            @ExcludeMissing
            fun _suggested(): JsonField<Boolean> = suggested

            @JsonProperty("thresholds")
            @ExcludeMissing
            fun _thresholds(): JsonField<List<Threshold>> = thresholds

            /** The test type. */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

            /** Whether the test is archived. */
            @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

            /** The delay window in seconds. Only applies to tests that use production data. */
            @JsonProperty("delayWindow")
            @ExcludeMissing
            fun _delayWindow(): JsonField<Double> = delayWindow

            /** The evaluation window in seconds. Only applies to tests that use production data. */
            @JsonProperty("evaluationWindow")
            @ExcludeMissing
            fun _evaluationWindow(): JsonField<Double> = evaluationWindow

            /** Whether the test uses an ML model. */
            @JsonProperty("usesMlModel")
            @ExcludeMissing
            fun _usesMlModel(): JsonField<Boolean> = usesMlModel

            /** Whether the test uses production data (monitoring mode only). */
            @JsonProperty("usesProductionData")
            @ExcludeMissing
            fun _usesProductionData(): JsonField<Boolean> = usesProductionData

            /** Whether the test uses a reference dataset (monitoring mode only). */
            @JsonProperty("usesReferenceDataset")
            @ExcludeMissing
            fun _usesReferenceDataset(): JsonField<Boolean> = usesReferenceDataset

            /** Whether the test uses a training dataset. */
            @JsonProperty("usesTrainingDataset")
            @ExcludeMissing
            fun _usesTrainingDataset(): JsonField<Boolean> = usesTrainingDataset

            /** Whether the test uses a validation dataset. */
            @JsonProperty("usesValidationDataset")
            @ExcludeMissing
            fun _usesValidationDataset(): JsonField<Boolean> = usesValidationDataset

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                subtype()
                suggested()
                thresholds().forEach { it.validate() }
                type()
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
                private var subtype: JsonField<String>? = null
                private var suggested: JsonField<Boolean>? = null
                private var thresholds: JsonField<MutableList<Threshold>>? = null
                private var type: JsonField<String>? = null
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

                /** The test id. */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The number of comments on the test. */
                fun commentCount(commentCount: Long) = commentCount(JsonField.of(commentCount))

                /** The number of comments on the test. */
                fun commentCount(commentCount: JsonField<Long>) = apply {
                    this.commentCount = commentCount
                }

                /** The test creator id. */
                fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

                /** The test creator id. */
                fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

                /** The test creator id. */
                fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

                /** The date the test was archived. */
                fun dateArchived(dateArchived: OffsetDateTime?) =
                    dateArchived(JsonField.ofNullable(dateArchived))

                /** The date the test was archived. */
                fun dateArchived(dateArchived: Optional<OffsetDateTime>) =
                    dateArchived(dateArchived.getOrNull())

                /** The date the test was archived. */
                fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
                    this.dateArchived = dateArchived
                }

                /** The creation date. */
                fun dateCreated(dateCreated: OffsetDateTime) =
                    dateCreated(JsonField.of(dateCreated))

                /** The creation date. */
                fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                    this.dateCreated = dateCreated
                }

                /** The last updated date. */
                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                /** The last updated date. */
                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                /** The test description. */
                fun description(description: JsonValue) = apply { this.description = description }

                /** The test name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The test name. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The test number. */
                fun number(number: Long) = number(JsonField.of(number))

                /** The test number. */
                fun number(number: JsonField<Long>) = apply { this.number = number }

                /** The project version (commit) id where the test was created. */
                fun originProjectVersionId(originProjectVersionId: String?) =
                    originProjectVersionId(JsonField.ofNullable(originProjectVersionId))

                /** The project version (commit) id where the test was created. */
                fun originProjectVersionId(originProjectVersionId: Optional<String>) =
                    originProjectVersionId(originProjectVersionId.getOrNull())

                /** The project version (commit) id where the test was created. */
                fun originProjectVersionId(originProjectVersionId: JsonField<String>) = apply {
                    this.originProjectVersionId = originProjectVersionId
                }

                /** The test subtype. */
                fun subtype(subtype: String) = subtype(JsonField.of(subtype))

                /** The test subtype. */
                fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

                /** Whether the test is suggested or user-created. */
                fun suggested(suggested: Boolean) = suggested(JsonField.of(suggested))

                /** Whether the test is suggested or user-created. */
                fun suggested(suggested: JsonField<Boolean>) = apply { this.suggested = suggested }

                fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

                fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                    this.thresholds = thresholds.map { it.toMutableList() }
                }

                fun addThreshold(threshold: Threshold) = apply {
                    thresholds =
                        (thresholds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("thresholds", it).add(threshold)
                        }
                }

                /** The test type. */
                fun type(type: String) = type(JsonField.of(type))

                /** The test type. */
                fun type(type: JsonField<String>) = apply { this.type = type }

                /** Whether the test is archived. */
                fun archived(archived: Boolean) = archived(JsonField.of(archived))

                /** Whether the test is archived. */
                fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: Double?) =
                    delayWindow(JsonField.ofNullable(delayWindow))

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: Double) = delayWindow(delayWindow as Double?)

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: Optional<Double>) =
                    delayWindow(delayWindow.getOrNull())

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: JsonField<Double>) = apply {
                    this.delayWindow = delayWindow
                }

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: Double?) =
                    evaluationWindow(JsonField.ofNullable(evaluationWindow))

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: Double) =
                    evaluationWindow(evaluationWindow as Double?)

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: Optional<Double>) =
                    evaluationWindow(evaluationWindow.getOrNull())

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: JsonField<Double>) = apply {
                    this.evaluationWindow = evaluationWindow
                }

                /** Whether the test uses an ML model. */
                fun usesMlModel(usesMlModel: Boolean) = usesMlModel(JsonField.of(usesMlModel))

                /** Whether the test uses an ML model. */
                fun usesMlModel(usesMlModel: JsonField<Boolean>) = apply {
                    this.usesMlModel = usesMlModel
                }

                /** Whether the test uses production data (monitoring mode only). */
                fun usesProductionData(usesProductionData: Boolean) =
                    usesProductionData(JsonField.of(usesProductionData))

                /** Whether the test uses production data (monitoring mode only). */
                fun usesProductionData(usesProductionData: JsonField<Boolean>) = apply {
                    this.usesProductionData = usesProductionData
                }

                /** Whether the test uses a reference dataset (monitoring mode only). */
                fun usesReferenceDataset(usesReferenceDataset: Boolean) =
                    usesReferenceDataset(JsonField.of(usesReferenceDataset))

                /** Whether the test uses a reference dataset (monitoring mode only). */
                fun usesReferenceDataset(usesReferenceDataset: JsonField<Boolean>) = apply {
                    this.usesReferenceDataset = usesReferenceDataset
                }

                /** Whether the test uses a training dataset. */
                fun usesTrainingDataset(usesTrainingDataset: Boolean) =
                    usesTrainingDataset(JsonField.of(usesTrainingDataset))

                /** Whether the test uses a training dataset. */
                fun usesTrainingDataset(usesTrainingDataset: JsonField<Boolean>) = apply {
                    this.usesTrainingDataset = usesTrainingDataset
                }

                /** Whether the test uses a validation dataset. */
                fun usesValidationDataset(usesValidationDataset: Boolean) =
                    usesValidationDataset(JsonField.of(usesValidationDataset))

                /** Whether the test uses a validation dataset. */
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
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Threshold
            @JsonCreator
            private constructor(
                @JsonProperty("insightName")
                @ExcludeMissing
                private val insightName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("insightParameters")
                @ExcludeMissing
                private val insightParameters: JsonField<List<JsonValue>> = JsonMissing.of(),
                @JsonProperty("measurement")
                @ExcludeMissing
                private val measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                private val operator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<Value> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The insight name to be evaluated. */
                fun insightName(): Optional<String> =
                    Optional.ofNullable(insightName.getNullable("insightName"))

                fun insightParameters(): Optional<List<JsonValue>> =
                    Optional.ofNullable(insightParameters.getNullable("insightParameters"))

                /** The measurement to be evaluated. */
                fun measurement(): Optional<String> =
                    Optional.ofNullable(measurement.getNullable("measurement"))

                /** The operator to be used for the evaluation. */
                fun operator(): Optional<String> =
                    Optional.ofNullable(operator.getNullable("operator"))

                /** The value to be compared. */
                fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

                /** The insight name to be evaluated. */
                @JsonProperty("insightName")
                @ExcludeMissing
                fun _insightName(): JsonField<String> = insightName

                @JsonProperty("insightParameters")
                @ExcludeMissing
                fun _insightParameters(): JsonField<List<JsonValue>> = insightParameters

                /** The measurement to be evaluated. */
                @JsonProperty("measurement")
                @ExcludeMissing
                fun _measurement(): JsonField<String> = measurement

                /** The operator to be used for the evaluation. */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<String> = operator

                /** The value to be compared. */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Threshold = apply {
                    if (validated) {
                        return@apply
                    }

                    insightName()
                    insightParameters()
                    measurement()
                    operator()
                    value().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Threshold]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Threshold]. */
                class Builder internal constructor() {

                    private var insightName: JsonField<String> = JsonMissing.of()
                    private var insightParameters: JsonField<MutableList<JsonValue>>? = null
                    private var measurement: JsonField<String> = JsonMissing.of()
                    private var operator: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<Value> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(threshold: Threshold) = apply {
                        insightName = threshold.insightName
                        insightParameters = threshold.insightParameters.map { it.toMutableList() }
                        measurement = threshold.measurement
                        operator = threshold.operator
                        value = threshold.value
                        additionalProperties = threshold.additionalProperties.toMutableMap()
                    }

                    /** The insight name to be evaluated. */
                    fun insightName(insightName: String) = insightName(JsonField.of(insightName))

                    /** The insight name to be evaluated. */
                    fun insightName(insightName: JsonField<String>) = apply {
                        this.insightName = insightName
                    }

                    fun insightParameters(insightParameters: List<JsonValue>) =
                        insightParameters(JsonField.of(insightParameters))

                    fun insightParameters(insightParameters: JsonField<List<JsonValue>>) = apply {
                        this.insightParameters = insightParameters.map { it.toMutableList() }
                    }

                    fun addInsightParameter(insightParameter: JsonValue) = apply {
                        insightParameters =
                            (insightParameters ?: JsonField.of(mutableListOf())).also {
                                checkKnown("insightParameters", it).add(insightParameter)
                            }
                    }

                    /** The measurement to be evaluated. */
                    fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                    /** The measurement to be evaluated. */
                    fun measurement(measurement: JsonField<String>) = apply {
                        this.measurement = measurement
                    }

                    /** The operator to be used for the evaluation. */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /** The operator to be used for the evaluation. */
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /** The value to be compared. */
                    fun value(value: Value) = value(JsonField.of(value))

                    /** The value to be compared. */
                    fun value(value: JsonField<Value>) = apply { this.value = value }

                    /** The value to be compared. */
                    fun value(number: Double) = value(Value.ofNumber(number))

                    /** The value to be compared. */
                    fun value(bool: Boolean) = value(Value.ofBool(bool))

                    /** The value to be compared. */
                    fun value(string: String) = value(Value.ofString(string))

                    /** The value to be compared. */
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

                    fun build(): Threshold =
                        Threshold(
                            insightName,
                            (insightParameters ?: JsonMissing.of()).map { it.toImmutable() },
                            measurement,
                            operator,
                            value,
                            additionalProperties.toImmutable(),
                        )
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

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            number != null -> visitor.visitNumber(number)
                            bool != null -> visitor.visitBool(bool)
                            string != null -> visitor.visitString(string)
                            strings != null -> visitor.visitStrings(strings)
                            else -> visitor.unknown(_json)
                        }
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

                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                return Value(number = it, _json = json)
                            }
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                return Value(bool = it, _json = json)
                            }
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                return Value(string = it, _json = json)
                            }
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                return Value(strings = it, _json = json)
                            }

                            return Value(_json = json)
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

                    return /* spotless:off */ other is Threshold && insightName == other.insightName && insightParameters == other.insightParameters && measurement == other.measurement && operator == other.operator && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(insightName, insightParameters, measurement, operator, value, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Threshold{insightName=$insightName, insightParameters=$insightParameters, measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Goal && id == other.id && commentCount == other.commentCount && creatorId == other.creatorId && dateArchived == other.dateArchived && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && description == other.description && name == other.name && number == other.number && originProjectVersionId == other.originProjectVersionId && subtype == other.subtype && suggested == other.suggested && thresholds == other.thresholds && type == other.type && archived == other.archived && delayWindow == other.delayWindow && evaluationWindow == other.evaluationWindow && usesMlModel == other.usesMlModel && usesProductionData == other.usesProductionData && usesReferenceDataset == other.usesReferenceDataset && usesTrainingDataset == other.usesTrainingDataset && usesValidationDataset == other.usesValidationDataset && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, commentCount, creatorId, dateArchived, dateCreated, dateUpdated, description, name, number, originProjectVersionId, subtype, suggested, thresholds, type, archived, delayWindow, evaluationWindow, usesMlModel, usesProductionData, usesReferenceDataset, usesTrainingDataset, usesValidationDataset, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Goal{id=$id, commentCount=$commentCount, creatorId=$creatorId, dateArchived=$dateArchived, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, name=$name, number=$number, originProjectVersionId=$originProjectVersionId, subtype=$subtype, suggested=$suggested, thresholds=$thresholds, type=$type, archived=$archived, delayWindow=$delayWindow, evaluationWindow=$evaluationWindow, usesMlModel=$usesMlModel, usesProductionData=$usesProductionData, usesReferenceDataset=$usesReferenceDataset, usesTrainingDataset=$usesTrainingDataset, usesValidationDataset=$usesValidationDataset, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && id == other.id && dateCreated == other.dateCreated && dateDataEnds == other.dateDataEnds && dateDataStarts == other.dateDataStarts && dateUpdated == other.dateUpdated && inferencePipelineId == other.inferencePipelineId && projectVersionId == other.projectVersionId && status == other.status && statusMessage == other.statusMessage && goal == other.goal && goalId == other.goalId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, dateCreated, dateDataEnds, dateDataStarts, dateUpdated, inferencePipelineId, projectVersionId, status, statusMessage, goal, goalId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, dateCreated=$dateCreated, dateDataEnds=$dateDataEnds, dateDataStarts=$dateDataStarts, dateUpdated=$dateUpdated, inferencePipelineId=$inferencePipelineId, projectVersionId=$projectVersionId, status=$status, statusMessage=$statusMessage, goal=$goal, goalId=$goalId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitTestResultListResponse && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitTestResultListResponse{items=$items, additionalProperties=$additionalProperties}"
}
