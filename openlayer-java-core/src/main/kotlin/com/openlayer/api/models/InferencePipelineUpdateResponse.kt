// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = InferencePipelineUpdateResponse.Builder::class)
@NoAutoDetect
class InferencePipelineUpdateResponse
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val name: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val dateLastSampleReceived: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val dateLastEvaluated: JsonField<OffsetDateTime>,
    private val dateOfNextEvaluation: JsonField<OffsetDateTime>,
    private val passingGoalCount: JsonField<Long>,
    private val failingGoalCount: JsonField<Long>,
    private val totalGoalCount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val statusMessage: JsonField<String>,
    private val links: JsonField<Links>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The inference pipeline id. */
    fun id(): String = id.getRequired("id")

    /** The project id. */
    fun projectId(): String = projectId.getRequired("projectId")

    /** The inference pipeline name. */
    fun name(): String = name.getRequired("name")

    /** The creation date. */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /** The last updated date. */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /** The last data sample received date. */
    fun dateLastSampleReceived(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastSampleReceived.getNullable("dateLastSampleReceived"))

    /** The inference pipeline description. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The last test evaluation date. */
    fun dateLastEvaluated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastEvaluated.getNullable("dateLastEvaluated"))

    /** The next test evaluation date. */
    fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateOfNextEvaluation.getNullable("dateOfNextEvaluation"))

    /** The number of tests passing. */
    fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

    /** The number of tests failing. */
    fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

    /** The total number of tests. */
    fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

    /** The status of test evaluation for the inference pipeline. */
    fun status(): Status = status.getRequired("status")

    /** The status message of test evaluation for the inference pipeline. */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    fun links(): Links = links.getRequired("links")

    /** The inference pipeline id. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The project id. */
    @JsonProperty("projectId") @ExcludeMissing fun _projectId() = projectId

    /** The inference pipeline name. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The creation date. */
    @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

    /** The last updated date. */
    @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

    /** The last data sample received date. */
    @JsonProperty("dateLastSampleReceived")
    @ExcludeMissing
    fun _dateLastSampleReceived() = dateLastSampleReceived

    /** The inference pipeline description. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The last test evaluation date. */
    @JsonProperty("dateLastEvaluated") @ExcludeMissing fun _dateLastEvaluated() = dateLastEvaluated

    /** The next test evaluation date. */
    @JsonProperty("dateOfNextEvaluation")
    @ExcludeMissing
    fun _dateOfNextEvaluation() = dateOfNextEvaluation

    /** The number of tests passing. */
    @JsonProperty("passingGoalCount") @ExcludeMissing fun _passingGoalCount() = passingGoalCount

    /** The number of tests failing. */
    @JsonProperty("failingGoalCount") @ExcludeMissing fun _failingGoalCount() = failingGoalCount

    /** The total number of tests. */
    @JsonProperty("totalGoalCount") @ExcludeMissing fun _totalGoalCount() = totalGoalCount

    /** The status of test evaluation for the inference pipeline. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The status message of test evaluation for the inference pipeline. */
    @JsonProperty("statusMessage") @ExcludeMissing fun _statusMessage() = statusMessage

    @JsonProperty("links") @ExcludeMissing fun _links() = links

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InferencePipelineUpdateResponse = apply {
        if (!validated) {
            id()
            projectId()
            name()
            dateCreated()
            dateUpdated()
            dateLastSampleReceived()
            description()
            dateLastEvaluated()
            dateOfNextEvaluation()
            passingGoalCount()
            failingGoalCount()
            totalGoalCount()
            status()
            statusMessage()
            links().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateLastSampleReceived: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of()
        private var passingGoalCount: JsonField<Long> = JsonMissing.of()
        private var failingGoalCount: JsonField<Long> = JsonMissing.of()
        private var totalGoalCount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var links: JsonField<Links> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineUpdateResponse: InferencePipelineUpdateResponse) =
            apply {
                this.id = inferencePipelineUpdateResponse.id
                this.projectId = inferencePipelineUpdateResponse.projectId
                this.name = inferencePipelineUpdateResponse.name
                this.dateCreated = inferencePipelineUpdateResponse.dateCreated
                this.dateUpdated = inferencePipelineUpdateResponse.dateUpdated
                this.dateLastSampleReceived = inferencePipelineUpdateResponse.dateLastSampleReceived
                this.description = inferencePipelineUpdateResponse.description
                this.dateLastEvaluated = inferencePipelineUpdateResponse.dateLastEvaluated
                this.dateOfNextEvaluation = inferencePipelineUpdateResponse.dateOfNextEvaluation
                this.passingGoalCount = inferencePipelineUpdateResponse.passingGoalCount
                this.failingGoalCount = inferencePipelineUpdateResponse.failingGoalCount
                this.totalGoalCount = inferencePipelineUpdateResponse.totalGoalCount
                this.status = inferencePipelineUpdateResponse.status
                this.statusMessage = inferencePipelineUpdateResponse.statusMessage
                this.links = inferencePipelineUpdateResponse.links
                additionalProperties(inferencePipelineUpdateResponse.additionalProperties)
            }

        /** The inference pipeline id. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inference pipeline id. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The project id. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** The project id. */
        @JsonProperty("projectId")
        @ExcludeMissing
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** The inference pipeline name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The inference pipeline name. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime) =
            dateLastSampleReceived(JsonField.of(dateLastSampleReceived))

        /** The last data sample received date. */
        @JsonProperty("dateLastSampleReceived")
        @ExcludeMissing
        fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
            this.dateLastSampleReceived = dateLastSampleReceived
        }

        /** The inference pipeline description. */
        fun description(description: String) = description(JsonField.of(description))

        /** The inference pipeline description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime) =
            dateLastEvaluated(JsonField.of(dateLastEvaluated))

        /** The last test evaluation date. */
        @JsonProperty("dateLastEvaluated")
        @ExcludeMissing
        fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
            this.dateLastEvaluated = dateLastEvaluated
        }

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime) =
            dateOfNextEvaluation(JsonField.of(dateOfNextEvaluation))

        /** The next test evaluation date. */
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
            this.dateOfNextEvaluation = dateOfNextEvaluation
        }

        /** The number of tests passing. */
        fun passingGoalCount(passingGoalCount: Long) =
            passingGoalCount(JsonField.of(passingGoalCount))

        /** The number of tests passing. */
        @JsonProperty("passingGoalCount")
        @ExcludeMissing
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            this.passingGoalCount = passingGoalCount
        }

        /** The number of tests failing. */
        fun failingGoalCount(failingGoalCount: Long) =
            failingGoalCount(JsonField.of(failingGoalCount))

        /** The number of tests failing. */
        @JsonProperty("failingGoalCount")
        @ExcludeMissing
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            this.failingGoalCount = failingGoalCount
        }

        /** The total number of tests. */
        fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

        /** The total number of tests. */
        @JsonProperty("totalGoalCount")
        @ExcludeMissing
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            this.totalGoalCount = totalGoalCount
        }

        /** The status of test evaluation for the inference pipeline. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of test evaluation for the inference pipeline. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

        /** The status message of test evaluation for the inference pipeline. */
        @JsonProperty("statusMessage")
        @ExcludeMissing
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        fun links(links: Links) = links(JsonField.of(links))

        @JsonProperty("links")
        @ExcludeMissing
        fun links(links: JsonField<Links>) = apply { this.links = links }

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

        fun build(): InferencePipelineUpdateResponse =
            InferencePipelineUpdateResponse(
                id,
                projectId,
                name,
                dateCreated,
                dateUpdated,
                dateLastSampleReceived,
                description,
                dateLastEvaluated,
                dateOfNextEvaluation,
                passingGoalCount,
                failingGoalCount,
                totalGoalCount,
                status,
                statusMessage,
                links,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Links.Builder::class)
    @NoAutoDetect
    class Links
    private constructor(
        private val app: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun app(): String = app.getRequired("app")

        @JsonProperty("app") @ExcludeMissing fun _app() = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Links = apply {
            if (!validated) {
                app()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                this.app = links.app
                additionalProperties(links.additionalProperties)
            }

            fun app(app: String) = app(JsonField.of(app))

            @JsonProperty("app")
            @ExcludeMissing
            fun app(app: JsonField<String>) = apply { this.app = app }

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

            fun build(): Links = Links(app, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Links && app == other.app && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(app, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val QUEUED = Status(JsonField.of("queued"))

            @JvmField val RUNNING = Status(JsonField.of("running"))

            @JvmField val PAUSED = Status(JsonField.of("paused"))

            @JvmField val FAILED = Status(JsonField.of("failed"))

            @JvmField val COMPLETED = Status(JsonField.of("completed"))

            @JvmField val UNKNOWN = Status(JsonField.of("unknown"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                PAUSED -> Value.PAUSED
                FAILED -> Value.FAILED
                COMPLETED -> Value.COMPLETED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                PAUSED -> Known.PAUSED
                FAILED -> Known.FAILED
                COMPLETED -> Known.COMPLETED
                UNKNOWN -> Known.UNKNOWN
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineUpdateResponse && id == other.id && projectId == other.projectId && name == other.name && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && dateLastSampleReceived == other.dateLastSampleReceived && description == other.description && dateLastEvaluated == other.dateLastEvaluated && dateOfNextEvaluation == other.dateOfNextEvaluation && passingGoalCount == other.passingGoalCount && failingGoalCount == other.failingGoalCount && totalGoalCount == other.totalGoalCount && status == other.status && statusMessage == other.statusMessage && links == other.links && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, projectId, name, dateCreated, dateUpdated, dateLastSampleReceived, description, dateLastEvaluated, dateOfNextEvaluation, passingGoalCount, failingGoalCount, totalGoalCount, status, statusMessage, links, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineUpdateResponse{id=$id, projectId=$projectId, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, dateLastSampleReceived=$dateLastSampleReceived, description=$description, dateLastEvaluated=$dateLastEvaluated, dateOfNextEvaluation=$dateOfNextEvaluation, passingGoalCount=$passingGoalCount, failingGoalCount=$failingGoalCount, totalGoalCount=$totalGoalCount, status=$status, statusMessage=$statusMessage, links=$links, additionalProperties=$additionalProperties}"
}
