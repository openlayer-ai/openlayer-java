// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import org.openlayer.core.BaseDeserializer
import org.openlayer.core.BaseSerializer
import org.openlayer.core.Enum
import org.openlayer.core.ExcludeMissing
import org.openlayer.core.JsonField
import org.openlayer.core.JsonMissing
import org.openlayer.core.JsonValue
import org.openlayer.core.NoAutoDetect
import org.openlayer.core.getOrThrow
import org.openlayer.core.toUnmodifiable
import org.openlayer.errors.OpenlayerInvalidDataException

@JsonDeserialize(builder = CommitTestResultListResponse.Builder::class)
@NoAutoDetect
class CommitTestResultListResponse
private constructor(
    private val _meta: JsonField<_Meta>,
    private val items: JsonField<List<Item>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun _meta(): _Meta = _meta.getRequired("_meta")

    fun items(): List<Item> = items.getRequired("items")

    @JsonProperty("_meta") @ExcludeMissing fun __meta() = _meta

    @JsonProperty("items") @ExcludeMissing fun _items() = items

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CommitTestResultListResponse = apply {
        if (!validated) {
            _meta().validate()
            items().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitTestResultListResponse &&
            this._meta == other._meta &&
            this.items == other.items &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    _meta,
                    items,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CommitTestResultListResponse{_meta=$_meta, items=$items, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var _meta: JsonField<_Meta> = JsonMissing.of()
        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitTestResultListResponse: CommitTestResultListResponse) = apply {
            this._meta = commitTestResultListResponse._meta
            this.items = commitTestResultListResponse.items
            additionalProperties(commitTestResultListResponse.additionalProperties)
        }

        fun _meta(_meta: _Meta) = _meta(JsonField.of(_meta))

        @JsonProperty("_meta")
        @ExcludeMissing
        fun _meta(_meta: JsonField<_Meta>) = apply { this._meta = _meta }

        fun items(items: List<Item>) = items(JsonField.of(items))

        @JsonProperty("items")
        @ExcludeMissing
        fun items(items: JsonField<List<Item>>) = apply { this.items = items }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CommitTestResultListResponse =
            CommitTestResultListResponse(
                _meta,
                items.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = _Meta.Builder::class)
    @NoAutoDetect
    class _Meta
    private constructor(
        private val page: JsonField<Long>,
        private val perPage: JsonField<Long>,
        private val totalItems: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The current page. */
        fun page(): Long = page.getRequired("page")

        /** The number of items per page. */
        fun perPage(): Long = perPage.getRequired("perPage")

        /** The total number of items. */
        fun totalItems(): Long = totalItems.getRequired("totalItems")

        /** The total number of pages. */
        fun totalPages(): Long = totalPages.getRequired("totalPages")

        /** The current page. */
        @JsonProperty("page") @ExcludeMissing fun _page() = page

        /** The number of items per page. */
        @JsonProperty("perPage") @ExcludeMissing fun _perPage() = perPage

        /** The total number of items. */
        @JsonProperty("totalItems") @ExcludeMissing fun _totalItems() = totalItems

        /** The total number of pages. */
        @JsonProperty("totalPages") @ExcludeMissing fun _totalPages() = totalPages

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): _Meta = apply {
            if (!validated) {
                page()
                perPage()
                totalItems()
                totalPages()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is _Meta &&
                this.page == other.page &&
                this.perPage == other.perPage &&
                this.totalItems == other.totalItems &&
                this.totalPages == other.totalPages &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        page,
                        perPage,
                        totalItems,
                        totalPages,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "_Meta{page=$page, perPage=$perPage, totalItems=$totalItems, totalPages=$totalPages, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var page: JsonField<Long> = JsonMissing.of()
            private var perPage: JsonField<Long> = JsonMissing.of()
            private var totalItems: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(_meta: _Meta) = apply {
                this.page = _meta.page
                this.perPage = _meta.perPage
                this.totalItems = _meta.totalItems
                this.totalPages = _meta.totalPages
                additionalProperties(_meta.additionalProperties)
            }

            /** The current page. */
            fun page(page: Long) = page(JsonField.of(page))

            /** The current page. */
            @JsonProperty("page")
            @ExcludeMissing
            fun page(page: JsonField<Long>) = apply { this.page = page }

            /** The number of items per page. */
            fun perPage(perPage: Long) = perPage(JsonField.of(perPage))

            /** The number of items per page. */
            @JsonProperty("perPage")
            @ExcludeMissing
            fun perPage(perPage: JsonField<Long>) = apply { this.perPage = perPage }

            /** The total number of items. */
            fun totalItems(totalItems: Long) = totalItems(JsonField.of(totalItems))

            /** The total number of items. */
            @JsonProperty("totalItems")
            @ExcludeMissing
            fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

            /** The total number of pages. */
            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /** The total number of pages. */
            @JsonProperty("totalPages")
            @ExcludeMissing
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): _Meta =
                _Meta(
                    page,
                    perPage,
                    totalItems,
                    totalPages,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = Item.Builder::class)
    @NoAutoDetect
    class Item
    private constructor(
        private val id: JsonField<String>,
        private val goal: JsonField<Goal>,
        private val goalId: JsonField<String>,
        private val projectVersionId: JsonField<String>,
        private val inferencePipelineId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val dateDataStarts: JsonField<OffsetDateTime>,
        private val dateDataEnds: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val statusMessage: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Project version (commit) id. */
        fun id(): String = id.getRequired("id")

        fun goal(): Optional<Goal> = Optional.ofNullable(goal.getNullable("goal"))

        /** The test id. */
        fun goalId(): Optional<String> = Optional.ofNullable(goalId.getNullable("goalId"))

        /** The project version (commit) id. */
        fun projectVersionId(): Optional<String> =
            Optional.ofNullable(projectVersionId.getNullable("projectVersionId"))

        /** The inference pipeline id. */
        fun inferencePipelineId(): Optional<String> =
            Optional.ofNullable(inferencePipelineId.getNullable("inferencePipelineId"))

        /** The creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The data start date. */
        fun dateDataStarts(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateDataStarts.getNullable("dateDataStarts"))

        /** The data end date. */
        fun dateDataEnds(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateDataEnds.getNullable("dateDataEnds"))

        /** The status of the test. */
        fun status(): Status = status.getRequired("status")

        /** The status message. */
        fun statusMessage(): Optional<String> =
            Optional.ofNullable(statusMessage.getNullable("statusMessage"))

        /** Project version (commit) id. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("goal") @ExcludeMissing fun _goal() = goal

        /** The test id. */
        @JsonProperty("goalId") @ExcludeMissing fun _goalId() = goalId

        /** The project version (commit) id. */
        @JsonProperty("projectVersionId") @ExcludeMissing fun _projectVersionId() = projectVersionId

        /** The inference pipeline id. */
        @JsonProperty("inferencePipelineId")
        @ExcludeMissing
        fun _inferencePipelineId() = inferencePipelineId

        /** The creation date. */
        @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

        /** The last updated date. */
        @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

        /** The data start date. */
        @JsonProperty("dateDataStarts") @ExcludeMissing fun _dateDataStarts() = dateDataStarts

        /** The data end date. */
        @JsonProperty("dateDataEnds") @ExcludeMissing fun _dateDataEnds() = dateDataEnds

        /** The status of the test. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** The status message. */
        @JsonProperty("statusMessage") @ExcludeMissing fun _statusMessage() = statusMessage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Item = apply {
            if (!validated) {
                id()
                goal().map { it.validate() }
                goalId()
                projectVersionId()
                inferencePipelineId()
                dateCreated()
                dateUpdated()
                dateDataStarts()
                dateDataEnds()
                status()
                statusMessage()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                this.id == other.id &&
                this.goal == other.goal &&
                this.goalId == other.goalId &&
                this.projectVersionId == other.projectVersionId &&
                this.inferencePipelineId == other.inferencePipelineId &&
                this.dateCreated == other.dateCreated &&
                this.dateUpdated == other.dateUpdated &&
                this.dateDataStarts == other.dateDataStarts &&
                this.dateDataEnds == other.dateDataEnds &&
                this.status == other.status &&
                this.statusMessage == other.statusMessage &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        goal,
                        goalId,
                        projectVersionId,
                        inferencePipelineId,
                        dateCreated,
                        dateUpdated,
                        dateDataStarts,
                        dateDataEnds,
                        status,
                        statusMessage,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Item{id=$id, goal=$goal, goalId=$goalId, projectVersionId=$projectVersionId, inferencePipelineId=$inferencePipelineId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, dateDataStarts=$dateDataStarts, dateDataEnds=$dateDataEnds, status=$status, statusMessage=$statusMessage, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var goal: JsonField<Goal> = JsonMissing.of()
            private var goalId: JsonField<String> = JsonMissing.of()
            private var projectVersionId: JsonField<String> = JsonMissing.of()
            private var inferencePipelineId: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateDataStarts: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateDataEnds: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusMessage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                this.id = item.id
                this.goal = item.goal
                this.goalId = item.goalId
                this.projectVersionId = item.projectVersionId
                this.inferencePipelineId = item.inferencePipelineId
                this.dateCreated = item.dateCreated
                this.dateUpdated = item.dateUpdated
                this.dateDataStarts = item.dateDataStarts
                this.dateDataEnds = item.dateDataEnds
                this.status = item.status
                this.statusMessage = item.statusMessage
                additionalProperties(item.additionalProperties)
            }

            /** Project version (commit) id. */
            fun id(id: String) = id(JsonField.of(id))

            /** Project version (commit) id. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun goal(goal: Goal) = goal(JsonField.of(goal))

            @JsonProperty("goal")
            @ExcludeMissing
            fun goal(goal: JsonField<Goal>) = apply { this.goal = goal }

            /** The test id. */
            fun goalId(goalId: String) = goalId(JsonField.of(goalId))

            /** The test id. */
            @JsonProperty("goalId")
            @ExcludeMissing
            fun goalId(goalId: JsonField<String>) = apply { this.goalId = goalId }

            /** The project version (commit) id. */
            fun projectVersionId(projectVersionId: String) =
                projectVersionId(JsonField.of(projectVersionId))

            /** The project version (commit) id. */
            @JsonProperty("projectVersionId")
            @ExcludeMissing
            fun projectVersionId(projectVersionId: JsonField<String>) = apply {
                this.projectVersionId = projectVersionId
            }

            /** The inference pipeline id. */
            fun inferencePipelineId(inferencePipelineId: String) =
                inferencePipelineId(JsonField.of(inferencePipelineId))

            /** The inference pipeline id. */
            @JsonProperty("inferencePipelineId")
            @ExcludeMissing
            fun inferencePipelineId(inferencePipelineId: JsonField<String>) = apply {
                this.inferencePipelineId = inferencePipelineId
            }

            /** The creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The creation date. */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The last updated date. */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The data start date. */
            fun dateDataStarts(dateDataStarts: OffsetDateTime) =
                dateDataStarts(JsonField.of(dateDataStarts))

            /** The data start date. */
            @JsonProperty("dateDataStarts")
            @ExcludeMissing
            fun dateDataStarts(dateDataStarts: JsonField<OffsetDateTime>) = apply {
                this.dateDataStarts = dateDataStarts
            }

            /** The data end date. */
            fun dateDataEnds(dateDataEnds: OffsetDateTime) =
                dateDataEnds(JsonField.of(dateDataEnds))

            /** The data end date. */
            @JsonProperty("dateDataEnds")
            @ExcludeMissing
            fun dateDataEnds(dateDataEnds: JsonField<OffsetDateTime>) = apply {
                this.dateDataEnds = dateDataEnds
            }

            /** The status of the test. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the test. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The status message. */
            fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

            /** The status message. */
            @JsonProperty("statusMessage")
            @ExcludeMissing
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Item =
                Item(
                    id,
                    goal,
                    goalId,
                    projectVersionId,
                    inferencePipelineId,
                    dateCreated,
                    dateUpdated,
                    dateDataStarts,
                    dateDataEnds,
                    status,
                    statusMessage,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val RUNNING = Status(JsonField.of("running"))

                @JvmField val PASSING = Status(JsonField.of("passing"))

                @JvmField val FAILING = Status(JsonField.of("failing"))

                @JvmField val SKIPPED = Status(JsonField.of("skipped"))

                @JvmField val ERROR = Status(JsonField.of("error"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
            }

            enum class Value {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    RUNNING -> Value.RUNNING
                    PASSING -> Value.PASSING
                    FAILING -> Value.FAILING
                    SKIPPED -> Value.SKIPPED
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    RUNNING -> Known.RUNNING
                    PASSING -> Known.PASSING
                    FAILING -> Known.FAILING
                    SKIPPED -> Known.SKIPPED
                    ERROR -> Known.ERROR
                    else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Goal.Builder::class)
        @NoAutoDetect
        class Goal
        private constructor(
            private val id: JsonField<String>,
            private val number: JsonField<Long>,
            private val name: JsonField<String>,
            private val dateCreated: JsonField<OffsetDateTime>,
            private val dateUpdated: JsonField<OffsetDateTime>,
            private val description: JsonValue,
            private val evaluationWindow: JsonField<Double>,
            private val delayWindow: JsonField<Double>,
            private val type: JsonField<String>,
            private val subtype: JsonField<String>,
            private val creatorId: JsonField<String>,
            private val originProjectVersionId: JsonField<String>,
            private val thresholds: JsonField<List<Threshold>>,
            private val archived: JsonField<Boolean>,
            private val dateArchived: JsonField<OffsetDateTime>,
            private val suggested: JsonField<Boolean>,
            private val commentCount: JsonField<Long>,
            private val usesMlModel: JsonField<Boolean>,
            private val usesValidationDataset: JsonField<Boolean>,
            private val usesTrainingDataset: JsonField<Boolean>,
            private val usesReferenceDataset: JsonField<Boolean>,
            private val usesProductionData: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The test id. */
            fun id(): String = id.getRequired("id")

            /** The test number. */
            fun number(): Long = number.getRequired("number")

            /** The test name. */
            fun name(): String = name.getRequired("name")

            /** The creation date. */
            fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

            /** The last updated date. */
            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            /** The evaluation window in seconds. Only applies to tests that use production data. */
            fun evaluationWindow(): Optional<Double> =
                Optional.ofNullable(evaluationWindow.getNullable("evaluationWindow"))

            /** The delay window in seconds. Only applies to tests that use production data. */
            fun delayWindow(): Optional<Double> =
                Optional.ofNullable(delayWindow.getNullable("delayWindow"))

            /** The test type. */
            fun type(): String = type.getRequired("type")

            /** The test subtype. */
            fun subtype(): String = subtype.getRequired("subtype")

            /** The test creator id. */
            fun creatorId(): Optional<String> =
                Optional.ofNullable(creatorId.getNullable("creatorId"))

            /** The project version (commit) id where the test was created. */
            fun originProjectVersionId(): Optional<String> =
                Optional.ofNullable(originProjectVersionId.getNullable("originProjectVersionId"))

            fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

            /** Whether the test is archived. */
            fun archived(): Optional<Boolean> =
                Optional.ofNullable(archived.getNullable("archived"))

            /** The date the test was archived. */
            fun dateArchived(): Optional<OffsetDateTime> =
                Optional.ofNullable(dateArchived.getNullable("dateArchived"))

            /** Whether the test is suggested or user-created. */
            fun suggested(): Boolean = suggested.getRequired("suggested")

            /** The number of comments on the test. */
            fun commentCount(): Long = commentCount.getRequired("commentCount")

            /** Whether the test uses an ML model. */
            fun usesMlModel(): Optional<Boolean> =
                Optional.ofNullable(usesMlModel.getNullable("usesMlModel"))

            /** Whether the test uses a validation dataset. */
            fun usesValidationDataset(): Optional<Boolean> =
                Optional.ofNullable(usesValidationDataset.getNullable("usesValidationDataset"))

            /** Whether the test uses a training dataset. */
            fun usesTrainingDataset(): Optional<Boolean> =
                Optional.ofNullable(usesTrainingDataset.getNullable("usesTrainingDataset"))

            /** Whether the test uses a reference dataset (monitoring mode only). */
            fun usesReferenceDataset(): Optional<Boolean> =
                Optional.ofNullable(usesReferenceDataset.getNullable("usesReferenceDataset"))

            /** Whether the test uses production data (monitoring mode only). */
            fun usesProductionData(): Optional<Boolean> =
                Optional.ofNullable(usesProductionData.getNullable("usesProductionData"))

            /** The test id. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The test number. */
            @JsonProperty("number") @ExcludeMissing fun _number() = number

            /** The test name. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The creation date. */
            @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

            /** The last updated date. */
            @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

            /** The test description. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The evaluation window in seconds. Only applies to tests that use production data. */
            @JsonProperty("evaluationWindow")
            @ExcludeMissing
            fun _evaluationWindow() = evaluationWindow

            /** The delay window in seconds. Only applies to tests that use production data. */
            @JsonProperty("delayWindow") @ExcludeMissing fun _delayWindow() = delayWindow

            /** The test type. */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** The test subtype. */
            @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

            /** The test creator id. */
            @JsonProperty("creatorId") @ExcludeMissing fun _creatorId() = creatorId

            /** The project version (commit) id where the test was created. */
            @JsonProperty("originProjectVersionId")
            @ExcludeMissing
            fun _originProjectVersionId() = originProjectVersionId

            @JsonProperty("thresholds") @ExcludeMissing fun _thresholds() = thresholds

            /** Whether the test is archived. */
            @JsonProperty("archived") @ExcludeMissing fun _archived() = archived

            /** The date the test was archived. */
            @JsonProperty("dateArchived") @ExcludeMissing fun _dateArchived() = dateArchived

            /** Whether the test is suggested or user-created. */
            @JsonProperty("suggested") @ExcludeMissing fun _suggested() = suggested

            /** The number of comments on the test. */
            @JsonProperty("commentCount") @ExcludeMissing fun _commentCount() = commentCount

            /** Whether the test uses an ML model. */
            @JsonProperty("usesMlModel") @ExcludeMissing fun _usesMlModel() = usesMlModel

            /** Whether the test uses a validation dataset. */
            @JsonProperty("usesValidationDataset")
            @ExcludeMissing
            fun _usesValidationDataset() = usesValidationDataset

            /** Whether the test uses a training dataset. */
            @JsonProperty("usesTrainingDataset")
            @ExcludeMissing
            fun _usesTrainingDataset() = usesTrainingDataset

            /** Whether the test uses a reference dataset (monitoring mode only). */
            @JsonProperty("usesReferenceDataset")
            @ExcludeMissing
            fun _usesReferenceDataset() = usesReferenceDataset

            /** Whether the test uses production data (monitoring mode only). */
            @JsonProperty("usesProductionData")
            @ExcludeMissing
            fun _usesProductionData() = usesProductionData

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Goal = apply {
                if (!validated) {
                    id()
                    number()
                    name()
                    dateCreated()
                    dateUpdated()
                    evaluationWindow()
                    delayWindow()
                    type()
                    subtype()
                    creatorId()
                    originProjectVersionId()
                    thresholds().forEach { it.validate() }
                    archived()
                    dateArchived()
                    suggested()
                    commentCount()
                    usesMlModel()
                    usesValidationDataset()
                    usesTrainingDataset()
                    usesReferenceDataset()
                    usesProductionData()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Goal &&
                    this.id == other.id &&
                    this.number == other.number &&
                    this.name == other.name &&
                    this.dateCreated == other.dateCreated &&
                    this.dateUpdated == other.dateUpdated &&
                    this.description == other.description &&
                    this.evaluationWindow == other.evaluationWindow &&
                    this.delayWindow == other.delayWindow &&
                    this.type == other.type &&
                    this.subtype == other.subtype &&
                    this.creatorId == other.creatorId &&
                    this.originProjectVersionId == other.originProjectVersionId &&
                    this.thresholds == other.thresholds &&
                    this.archived == other.archived &&
                    this.dateArchived == other.dateArchived &&
                    this.suggested == other.suggested &&
                    this.commentCount == other.commentCount &&
                    this.usesMlModel == other.usesMlModel &&
                    this.usesValidationDataset == other.usesValidationDataset &&
                    this.usesTrainingDataset == other.usesTrainingDataset &&
                    this.usesReferenceDataset == other.usesReferenceDataset &&
                    this.usesProductionData == other.usesProductionData &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            number,
                            name,
                            dateCreated,
                            dateUpdated,
                            description,
                            evaluationWindow,
                            delayWindow,
                            type,
                            subtype,
                            creatorId,
                            originProjectVersionId,
                            thresholds,
                            archived,
                            dateArchived,
                            suggested,
                            commentCount,
                            usesMlModel,
                            usesValidationDataset,
                            usesTrainingDataset,
                            usesReferenceDataset,
                            usesProductionData,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Goal{id=$id, number=$number, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, evaluationWindow=$evaluationWindow, delayWindow=$delayWindow, type=$type, subtype=$subtype, creatorId=$creatorId, originProjectVersionId=$originProjectVersionId, thresholds=$thresholds, archived=$archived, dateArchived=$dateArchived, suggested=$suggested, commentCount=$commentCount, usesMlModel=$usesMlModel, usesValidationDataset=$usesValidationDataset, usesTrainingDataset=$usesTrainingDataset, usesReferenceDataset=$usesReferenceDataset, usesProductionData=$usesProductionData, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var number: JsonField<Long> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
                private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
                private var description: JsonValue = JsonMissing.of()
                private var evaluationWindow: JsonField<Double> = JsonMissing.of()
                private var delayWindow: JsonField<Double> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var subtype: JsonField<String> = JsonMissing.of()
                private var creatorId: JsonField<String> = JsonMissing.of()
                private var originProjectVersionId: JsonField<String> = JsonMissing.of()
                private var thresholds: JsonField<List<Threshold>> = JsonMissing.of()
                private var archived: JsonField<Boolean> = JsonMissing.of()
                private var dateArchived: JsonField<OffsetDateTime> = JsonMissing.of()
                private var suggested: JsonField<Boolean> = JsonMissing.of()
                private var commentCount: JsonField<Long> = JsonMissing.of()
                private var usesMlModel: JsonField<Boolean> = JsonMissing.of()
                private var usesValidationDataset: JsonField<Boolean> = JsonMissing.of()
                private var usesTrainingDataset: JsonField<Boolean> = JsonMissing.of()
                private var usesReferenceDataset: JsonField<Boolean> = JsonMissing.of()
                private var usesProductionData: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(goal: Goal) = apply {
                    this.id = goal.id
                    this.number = goal.number
                    this.name = goal.name
                    this.dateCreated = goal.dateCreated
                    this.dateUpdated = goal.dateUpdated
                    this.description = goal.description
                    this.evaluationWindow = goal.evaluationWindow
                    this.delayWindow = goal.delayWindow
                    this.type = goal.type
                    this.subtype = goal.subtype
                    this.creatorId = goal.creatorId
                    this.originProjectVersionId = goal.originProjectVersionId
                    this.thresholds = goal.thresholds
                    this.archived = goal.archived
                    this.dateArchived = goal.dateArchived
                    this.suggested = goal.suggested
                    this.commentCount = goal.commentCount
                    this.usesMlModel = goal.usesMlModel
                    this.usesValidationDataset = goal.usesValidationDataset
                    this.usesTrainingDataset = goal.usesTrainingDataset
                    this.usesReferenceDataset = goal.usesReferenceDataset
                    this.usesProductionData = goal.usesProductionData
                    additionalProperties(goal.additionalProperties)
                }

                /** The test id. */
                fun id(id: String) = id(JsonField.of(id))

                /** The test id. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The test number. */
                fun number(number: Long) = number(JsonField.of(number))

                /** The test number. */
                @JsonProperty("number")
                @ExcludeMissing
                fun number(number: JsonField<Long>) = apply { this.number = number }

                /** The test name. */
                fun name(name: String) = name(JsonField.of(name))

                /** The test name. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The creation date. */
                fun dateCreated(dateCreated: OffsetDateTime) =
                    dateCreated(JsonField.of(dateCreated))

                /** The creation date. */
                @JsonProperty("dateCreated")
                @ExcludeMissing
                fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                    this.dateCreated = dateCreated
                }

                /** The last updated date. */
                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                /** The last updated date. */
                @JsonProperty("dateUpdated")
                @ExcludeMissing
                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                /** The test description. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonValue) = apply { this.description = description }

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                fun evaluationWindow(evaluationWindow: Double) =
                    evaluationWindow(JsonField.of(evaluationWindow))

                /**
                 * The evaluation window in seconds. Only applies to tests that use production data.
                 */
                @JsonProperty("evaluationWindow")
                @ExcludeMissing
                fun evaluationWindow(evaluationWindow: JsonField<Double>) = apply {
                    this.evaluationWindow = evaluationWindow
                }

                /** The delay window in seconds. Only applies to tests that use production data. */
                fun delayWindow(delayWindow: Double) = delayWindow(JsonField.of(delayWindow))

                /** The delay window in seconds. Only applies to tests that use production data. */
                @JsonProperty("delayWindow")
                @ExcludeMissing
                fun delayWindow(delayWindow: JsonField<Double>) = apply {
                    this.delayWindow = delayWindow
                }

                /** The test type. */
                fun type(type: String) = type(JsonField.of(type))

                /** The test type. */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<String>) = apply { this.type = type }

                /** The test subtype. */
                fun subtype(subtype: String) = subtype(JsonField.of(subtype))

                /** The test subtype. */
                @JsonProperty("subtype")
                @ExcludeMissing
                fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

                /** The test creator id. */
                fun creatorId(creatorId: String) = creatorId(JsonField.of(creatorId))

                /** The test creator id. */
                @JsonProperty("creatorId")
                @ExcludeMissing
                fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

                /** The project version (commit) id where the test was created. */
                fun originProjectVersionId(originProjectVersionId: String) =
                    originProjectVersionId(JsonField.of(originProjectVersionId))

                /** The project version (commit) id where the test was created. */
                @JsonProperty("originProjectVersionId")
                @ExcludeMissing
                fun originProjectVersionId(originProjectVersionId: JsonField<String>) = apply {
                    this.originProjectVersionId = originProjectVersionId
                }

                fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

                @JsonProperty("thresholds")
                @ExcludeMissing
                fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                    this.thresholds = thresholds
                }

                /** Whether the test is archived. */
                fun archived(archived: Boolean) = archived(JsonField.of(archived))

                /** Whether the test is archived. */
                @JsonProperty("archived")
                @ExcludeMissing
                fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

                /** The date the test was archived. */
                fun dateArchived(dateArchived: OffsetDateTime) =
                    dateArchived(JsonField.of(dateArchived))

                /** The date the test was archived. */
                @JsonProperty("dateArchived")
                @ExcludeMissing
                fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
                    this.dateArchived = dateArchived
                }

                /** Whether the test is suggested or user-created. */
                fun suggested(suggested: Boolean) = suggested(JsonField.of(suggested))

                /** Whether the test is suggested or user-created. */
                @JsonProperty("suggested")
                @ExcludeMissing
                fun suggested(suggested: JsonField<Boolean>) = apply { this.suggested = suggested }

                /** The number of comments on the test. */
                fun commentCount(commentCount: Long) = commentCount(JsonField.of(commentCount))

                /** The number of comments on the test. */
                @JsonProperty("commentCount")
                @ExcludeMissing
                fun commentCount(commentCount: JsonField<Long>) = apply {
                    this.commentCount = commentCount
                }

                /** Whether the test uses an ML model. */
                fun usesMlModel(usesMlModel: Boolean) = usesMlModel(JsonField.of(usesMlModel))

                /** Whether the test uses an ML model. */
                @JsonProperty("usesMlModel")
                @ExcludeMissing
                fun usesMlModel(usesMlModel: JsonField<Boolean>) = apply {
                    this.usesMlModel = usesMlModel
                }

                /** Whether the test uses a validation dataset. */
                fun usesValidationDataset(usesValidationDataset: Boolean) =
                    usesValidationDataset(JsonField.of(usesValidationDataset))

                /** Whether the test uses a validation dataset. */
                @JsonProperty("usesValidationDataset")
                @ExcludeMissing
                fun usesValidationDataset(usesValidationDataset: JsonField<Boolean>) = apply {
                    this.usesValidationDataset = usesValidationDataset
                }

                /** Whether the test uses a training dataset. */
                fun usesTrainingDataset(usesTrainingDataset: Boolean) =
                    usesTrainingDataset(JsonField.of(usesTrainingDataset))

                /** Whether the test uses a training dataset. */
                @JsonProperty("usesTrainingDataset")
                @ExcludeMissing
                fun usesTrainingDataset(usesTrainingDataset: JsonField<Boolean>) = apply {
                    this.usesTrainingDataset = usesTrainingDataset
                }

                /** Whether the test uses a reference dataset (monitoring mode only). */
                fun usesReferenceDataset(usesReferenceDataset: Boolean) =
                    usesReferenceDataset(JsonField.of(usesReferenceDataset))

                /** Whether the test uses a reference dataset (monitoring mode only). */
                @JsonProperty("usesReferenceDataset")
                @ExcludeMissing
                fun usesReferenceDataset(usesReferenceDataset: JsonField<Boolean>) = apply {
                    this.usesReferenceDataset = usesReferenceDataset
                }

                /** Whether the test uses production data (monitoring mode only). */
                fun usesProductionData(usesProductionData: Boolean) =
                    usesProductionData(JsonField.of(usesProductionData))

                /** Whether the test uses production data (monitoring mode only). */
                @JsonProperty("usesProductionData")
                @ExcludeMissing
                fun usesProductionData(usesProductionData: JsonField<Boolean>) = apply {
                    this.usesProductionData = usesProductionData
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Goal =
                    Goal(
                        id,
                        number,
                        name,
                        dateCreated,
                        dateUpdated,
                        description,
                        evaluationWindow,
                        delayWindow,
                        type,
                        subtype,
                        creatorId,
                        originProjectVersionId,
                        thresholds.map { it.toUnmodifiable() },
                        archived,
                        dateArchived,
                        suggested,
                        commentCount,
                        usesMlModel,
                        usesValidationDataset,
                        usesTrainingDataset,
                        usesReferenceDataset,
                        usesProductionData,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Threshold.Builder::class)
            @NoAutoDetect
            class Threshold
            private constructor(
                private val measurement: JsonField<String>,
                private val insightName: JsonField<String>,
                private val insightParameters: JsonField<List<JsonValue>>,
                private val operator: JsonField<String>,
                private val value: JsonField<Value>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The measurement to be evaluated. */
                fun measurement(): Optional<String> =
                    Optional.ofNullable(measurement.getNullable("measurement"))

                /** The insight name to be evaluated. */
                fun insightName(): Optional<String> =
                    Optional.ofNullable(insightName.getNullable("insightName"))

                fun insightParameters(): Optional<List<JsonValue>> =
                    Optional.ofNullable(insightParameters.getNullable("insightParameters"))

                /** The operator to be used for the evaluation. */
                fun operator(): Optional<String> =
                    Optional.ofNullable(operator.getNullable("operator"))

                /** The value to be compared. */
                fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

                /** The measurement to be evaluated. */
                @JsonProperty("measurement") @ExcludeMissing fun _measurement() = measurement

                /** The insight name to be evaluated. */
                @JsonProperty("insightName") @ExcludeMissing fun _insightName() = insightName

                @JsonProperty("insightParameters")
                @ExcludeMissing
                fun _insightParameters() = insightParameters

                /** The operator to be used for the evaluation. */
                @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

                /** The value to be compared. */
                @JsonProperty("value") @ExcludeMissing fun _value() = value

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Threshold = apply {
                    if (!validated) {
                        measurement()
                        insightName()
                        insightParameters()
                        operator()
                        value()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Threshold &&
                        this.measurement == other.measurement &&
                        this.insightName == other.insightName &&
                        this.insightParameters == other.insightParameters &&
                        this.operator == other.operator &&
                        this.value == other.value &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                measurement,
                                insightName,
                                insightParameters,
                                operator,
                                value,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Threshold{measurement=$measurement, insightName=$insightName, insightParameters=$insightParameters, operator=$operator, value=$value, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var measurement: JsonField<String> = JsonMissing.of()
                    private var insightName: JsonField<String> = JsonMissing.of()
                    private var insightParameters: JsonField<List<JsonValue>> = JsonMissing.of()
                    private var operator: JsonField<String> = JsonMissing.of()
                    private var value: JsonField<Value> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(threshold: Threshold) = apply {
                        this.measurement = threshold.measurement
                        this.insightName = threshold.insightName
                        this.insightParameters = threshold.insightParameters
                        this.operator = threshold.operator
                        this.value = threshold.value
                        additionalProperties(threshold.additionalProperties)
                    }

                    /** The measurement to be evaluated. */
                    fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                    /** The measurement to be evaluated. */
                    @JsonProperty("measurement")
                    @ExcludeMissing
                    fun measurement(measurement: JsonField<String>) = apply {
                        this.measurement = measurement
                    }

                    /** The insight name to be evaluated. */
                    fun insightName(insightName: String) = insightName(JsonField.of(insightName))

                    /** The insight name to be evaluated. */
                    @JsonProperty("insightName")
                    @ExcludeMissing
                    fun insightName(insightName: JsonField<String>) = apply {
                        this.insightName = insightName
                    }

                    fun insightParameters(insightParameters: List<JsonValue>) =
                        insightParameters(JsonField.of(insightParameters))

                    @JsonProperty("insightParameters")
                    @ExcludeMissing
                    fun insightParameters(insightParameters: JsonField<List<JsonValue>>) = apply {
                        this.insightParameters = insightParameters
                    }

                    /** The operator to be used for the evaluation. */
                    fun operator(operator: String) = operator(JsonField.of(operator))

                    /** The operator to be used for the evaluation. */
                    @JsonProperty("operator")
                    @ExcludeMissing
                    fun operator(operator: JsonField<String>) = apply { this.operator = operator }

                    /** The value to be compared. */
                    fun value(value: Value) = value(JsonField.of(value))

                    /** The value to be compared. */
                    @JsonProperty("value")
                    @ExcludeMissing
                    fun value(value: JsonField<Value>) = apply { this.value = value }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Threshold =
                        Threshold(
                            measurement,
                            insightName,
                            insightParameters.map { it.toUnmodifiable() },
                            operator,
                            value,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(using = Value.Deserializer::class)
                @JsonSerialize(using = Value.Serializer::class)
                class Value
                private constructor(
                    private val double: Double? = null,
                    private val boolean: Boolean? = null,
                    private val string: String? = null,
                    private val strings: List<String>? = null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun double(): Optional<Double> = Optional.ofNullable(double)

                    fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

                    fun string(): Optional<String> = Optional.ofNullable(string)

                    fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                    fun isDouble(): Boolean = double != null

                    fun isBoolean(): Boolean = boolean != null

                    fun isString(): Boolean = string != null

                    fun isStrings(): Boolean = strings != null

                    fun asDouble(): Double = double.getOrThrow("double")

                    fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

                    fun asString(): String = string.getOrThrow("string")

                    fun asStrings(): List<String> = strings.getOrThrow("strings")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            double != null -> visitor.visitDouble(double)
                            boolean != null -> visitor.visitBoolean(boolean)
                            string != null -> visitor.visitString(string)
                            strings != null -> visitor.visitStrings(strings)
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): Value = apply {
                        if (!validated) {
                            if (
                                double == null &&
                                    boolean == null &&
                                    string == null &&
                                    strings == null
                            ) {
                                throw OpenlayerInvalidDataException("Unknown Value: $_json")
                            }
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Value &&
                            this.double == other.double &&
                            this.boolean == other.boolean &&
                            this.string == other.string &&
                            this.strings == other.strings
                    }

                    override fun hashCode(): Int {
                        return Objects.hash(
                            double,
                            boolean,
                            string,
                            strings,
                        )
                    }

                    override fun toString(): String {
                        return when {
                            double != null -> "Value{double=$double}"
                            boolean != null -> "Value{boolean=$boolean}"
                            string != null -> "Value{string=$string}"
                            strings != null -> "Value{strings=$strings}"
                            _json != null -> "Value{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }

                    companion object {

                        @JvmStatic fun ofDouble(double: Double) = Value(double = double)

                        @JvmStatic fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

                        @JvmStatic fun ofString(string: String) = Value(string = string)

                        @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
                    }

                    interface Visitor<out T> {

                        fun visitDouble(double: Double): T

                        fun visitBoolean(boolean: Boolean): T

                        fun visitString(string: String): T

                        fun visitStrings(strings: List<String>): T

                        fun unknown(json: JsonValue?): T {
                            throw OpenlayerInvalidDataException("Unknown Value: $json")
                        }
                    }

                    class Deserializer : BaseDeserializer<Value>(Value::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Value {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                return Value(double = it, _json = json)
                            }
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                return Value(boolean = it, _json = json)
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

                    class Serializer : BaseSerializer<Value>(Value::class) {

                        override fun serialize(
                            value: Value,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.double != null -> generator.writeObject(value.double)
                                value.boolean != null -> generator.writeObject(value.boolean)
                                value.string != null -> generator.writeObject(value.string)
                                value.strings != null -> generator.writeObject(value.strings)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Value")
                            }
                        }
                    }
                }
            }
        }
    }
}
