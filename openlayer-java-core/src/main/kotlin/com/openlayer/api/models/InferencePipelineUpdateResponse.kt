// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class InferencePipelineUpdateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dateCreated")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dateLastEvaluated")
    @ExcludeMissing
    private val dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dateLastSampleReceived")
    @ExcludeMissing
    private val dateLastSampleReceived: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dateOfNextEvaluation")
    @ExcludeMissing
    private val dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("failingGoalCount")
    @ExcludeMissing
    private val failingGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("links") @ExcludeMissing private val links: JsonField<Links> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("passingGoalCount")
    @ExcludeMissing
    private val passingGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("projectId")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("statusMessage")
    @ExcludeMissing
    private val statusMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("totalGoalCount")
    @ExcludeMissing
    private val totalGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("project")
    @ExcludeMissing
    private val project: JsonField<Project> = JsonMissing.of(),
    @JsonProperty("workspace")
    @ExcludeMissing
    private val workspace: JsonField<Workspace> = JsonMissing.of(),
    @JsonProperty("workspaceId")
    @ExcludeMissing
    private val workspaceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The inference pipeline id. */
    fun id(): String = id.getRequired("id")

    /** The creation date. */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /** The last test evaluation date. */
    fun dateLastEvaluated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastEvaluated.getNullable("dateLastEvaluated"))

    /** The last data sample received date. */
    fun dateLastSampleReceived(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastSampleReceived.getNullable("dateLastSampleReceived"))

    /** The next test evaluation date. */
    fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateOfNextEvaluation.getNullable("dateOfNextEvaluation"))

    /** The last updated date. */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /** The inference pipeline description. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The number of tests failing. */
    fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

    fun links(): Links = links.getRequired("links")

    /** The inference pipeline name. */
    fun name(): String = name.getRequired("name")

    /** The number of tests passing. */
    fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

    /** The project id. */
    fun projectId(): String = projectId.getRequired("projectId")

    /** The status of test evaluation for the inference pipeline. */
    fun status(): Status = status.getRequired("status")

    /** The status message of test evaluation for the inference pipeline. */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    /** The total number of tests. */
    fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

    fun project(): Optional<Project> = Optional.ofNullable(project.getNullable("project"))

    fun workspace(): Optional<Workspace> = Optional.ofNullable(workspace.getNullable("workspace"))

    /** The workspace id. */
    fun workspaceId(): Optional<String> =
        Optional.ofNullable(workspaceId.getNullable("workspaceId"))

    /** The inference pipeline id. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The creation date. */
    @JsonProperty("dateCreated")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /** The last test evaluation date. */
    @JsonProperty("dateLastEvaluated")
    @ExcludeMissing
    fun _dateLastEvaluated(): JsonField<OffsetDateTime> = dateLastEvaluated

    /** The last data sample received date. */
    @JsonProperty("dateLastSampleReceived")
    @ExcludeMissing
    fun _dateLastSampleReceived(): JsonField<OffsetDateTime> = dateLastSampleReceived

    /** The next test evaluation date. */
    @JsonProperty("dateOfNextEvaluation")
    @ExcludeMissing
    fun _dateOfNextEvaluation(): JsonField<OffsetDateTime> = dateOfNextEvaluation

    /** The last updated date. */
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /** The inference pipeline description. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The number of tests failing. */
    @JsonProperty("failingGoalCount")
    @ExcludeMissing
    fun _failingGoalCount(): JsonField<Long> = failingGoalCount

    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

    /** The inference pipeline name. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The number of tests passing. */
    @JsonProperty("passingGoalCount")
    @ExcludeMissing
    fun _passingGoalCount(): JsonField<Long> = passingGoalCount

    /** The project id. */
    @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /** The status of test evaluation for the inference pipeline. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The status message of test evaluation for the inference pipeline. */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /** The total number of tests. */
    @JsonProperty("totalGoalCount")
    @ExcludeMissing
    fun _totalGoalCount(): JsonField<Long> = totalGoalCount

    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Project> = project

    @JsonProperty("workspace") @ExcludeMissing fun _workspace(): JsonField<Workspace> = workspace

    /** The workspace id. */
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId(): JsonField<String> = workspaceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InferencePipelineUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateLastEvaluated()
        dateLastSampleReceived()
        dateOfNextEvaluation()
        dateUpdated()
        description()
        failingGoalCount()
        links().validate()
        name()
        passingGoalCount()
        projectId()
        status()
        statusMessage()
        totalGoalCount()
        project().ifPresent { it.validate() }
        workspace().ifPresent { it.validate() }
        workspaceId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateLastEvaluated: JsonField<OffsetDateTime>? = null
        private var dateLastSampleReceived: JsonField<OffsetDateTime>? = null
        private var dateOfNextEvaluation: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var failingGoalCount: JsonField<Long>? = null
        private var links: JsonField<Links>? = null
        private var name: JsonField<String>? = null
        private var passingGoalCount: JsonField<Long>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var statusMessage: JsonField<String>? = null
        private var totalGoalCount: JsonField<Long>? = null
        private var project: JsonField<Project> = JsonMissing.of()
        private var workspace: JsonField<Workspace> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineUpdateResponse: InferencePipelineUpdateResponse) =
            apply {
                id = inferencePipelineUpdateResponse.id
                dateCreated = inferencePipelineUpdateResponse.dateCreated
                dateLastEvaluated = inferencePipelineUpdateResponse.dateLastEvaluated
                dateLastSampleReceived = inferencePipelineUpdateResponse.dateLastSampleReceived
                dateOfNextEvaluation = inferencePipelineUpdateResponse.dateOfNextEvaluation
                dateUpdated = inferencePipelineUpdateResponse.dateUpdated
                description = inferencePipelineUpdateResponse.description
                failingGoalCount = inferencePipelineUpdateResponse.failingGoalCount
                links = inferencePipelineUpdateResponse.links
                name = inferencePipelineUpdateResponse.name
                passingGoalCount = inferencePipelineUpdateResponse.passingGoalCount
                projectId = inferencePipelineUpdateResponse.projectId
                status = inferencePipelineUpdateResponse.status
                statusMessage = inferencePipelineUpdateResponse.statusMessage
                totalGoalCount = inferencePipelineUpdateResponse.totalGoalCount
                project = inferencePipelineUpdateResponse.project
                workspace = inferencePipelineUpdateResponse.workspace
                workspaceId = inferencePipelineUpdateResponse.workspaceId
                additionalProperties =
                    inferencePipelineUpdateResponse.additionalProperties.toMutableMap()
            }

        /** The inference pipeline id. */
        fun id(id: String) = id(JsonField.of(id))

        /** The inference pipeline id. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /** The creation date. */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime?) =
            dateLastEvaluated(JsonField.ofNullable(dateLastEvaluated))

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: Optional<OffsetDateTime>) =
            dateLastEvaluated(dateLastEvaluated.orElse(null))

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
            this.dateLastEvaluated = dateLastEvaluated
        }

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime?) =
            dateLastSampleReceived(JsonField.ofNullable(dateLastSampleReceived))

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: Optional<OffsetDateTime>) =
            dateLastSampleReceived(dateLastSampleReceived.orElse(null))

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
            this.dateLastSampleReceived = dateLastSampleReceived
        }

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime?) =
            dateOfNextEvaluation(JsonField.ofNullable(dateOfNextEvaluation))

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: Optional<OffsetDateTime>) =
            dateOfNextEvaluation(dateOfNextEvaluation.orElse(null))

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
            this.dateOfNextEvaluation = dateOfNextEvaluation
        }

        /** The last updated date. */
        fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

        /** The last updated date. */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The inference pipeline description. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The inference pipeline description. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** The inference pipeline description. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The number of tests failing. */
        fun failingGoalCount(failingGoalCount: Long) =
            failingGoalCount(JsonField.of(failingGoalCount))

        /** The number of tests failing. */
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            this.failingGoalCount = failingGoalCount
        }

        fun links(links: Links) = links(JsonField.of(links))

        fun links(links: JsonField<Links>) = apply { this.links = links }

        /** The inference pipeline name. */
        fun name(name: String) = name(JsonField.of(name))

        /** The inference pipeline name. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The number of tests passing. */
        fun passingGoalCount(passingGoalCount: Long) =
            passingGoalCount(JsonField.of(passingGoalCount))

        /** The number of tests passing. */
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            this.passingGoalCount = passingGoalCount
        }

        /** The project id. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** The project id. */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** The status of test evaluation for the inference pipeline. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of test evaluation for the inference pipeline. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: String?) =
            statusMessage(JsonField.ofNullable(statusMessage))

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: Optional<String>) =
            statusMessage(statusMessage.orElse(null))

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        /** The total number of tests. */
        fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

        /** The total number of tests. */
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            this.totalGoalCount = totalGoalCount
        }

        fun project(project: Project?) = project(JsonField.ofNullable(project))

        fun project(project: Optional<Project>) = project(project.orElse(null))

        fun project(project: JsonField<Project>) = apply { this.project = project }

        fun workspace(workspace: Workspace?) = workspace(JsonField.ofNullable(workspace))

        fun workspace(workspace: Optional<Workspace>) = workspace(workspace.orElse(null))

        fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

        /** The workspace id. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /** The workspace id. */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

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

        fun build(): InferencePipelineUpdateResponse =
            InferencePipelineUpdateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateLastEvaluated", dateLastEvaluated),
                checkRequired("dateLastSampleReceived", dateLastSampleReceived),
                checkRequired("dateOfNextEvaluation", dateOfNextEvaluation),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("description", description),
                checkRequired("failingGoalCount", failingGoalCount),
                checkRequired("links", links),
                checkRequired("name", name),
                checkRequired("passingGoalCount", passingGoalCount),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("statusMessage", statusMessage),
                checkRequired("totalGoalCount", totalGoalCount),
                project,
                workspace,
                workspaceId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Links
    @JsonCreator
    private constructor(
        @JsonProperty("app") @ExcludeMissing private val app: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun app(): String = app.getRequired("app")

        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Links = apply {
            if (validated) {
                return@apply
            }

            app()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                app = links.app
                additionalProperties = links.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            fun app(app: JsonField<String>) = apply { this.app = app }

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

            fun build(): Links =
                Links(checkRequired("app", app), additionalProperties.toImmutable())
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

    /** The status of test evaluation for the inference pipeline. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val PAUSED = of("paused")

            @JvmField val FAILED = of("failed")

            @JvmField val COMPLETED = of("completed")

            @JvmField val UNKNOWN = of("unknown")

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
    class Project
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creatorId")
        @ExcludeMissing
        private val creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("developmentGoalCount")
        @ExcludeMissing
        private val developmentGoalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("goalCount")
        @ExcludeMissing
        private val goalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inferencePipelineCount")
        @ExcludeMissing
        private val inferencePipelineCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("links")
        @ExcludeMissing
        private val links: JsonField<Links> = JsonMissing.of(),
        @JsonProperty("monitoringGoalCount")
        @ExcludeMissing
        private val monitoringGoalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        private val source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("taskType")
        @ExcludeMissing
        private val taskType: JsonField<TaskType> = JsonMissing.of(),
        @JsonProperty("versionCount")
        @ExcludeMissing
        private val versionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("workspaceId")
        @ExcludeMissing
        private val workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gitRepo")
        @ExcludeMissing
        private val gitRepo: JsonField<GitRepo> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The project id. */
        fun id(): String = id.getRequired("id")

        /** The project creator id. */
        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        /** The project creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The project last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The number of tests in the development mode of the project. */
        fun developmentGoalCount(): Long = developmentGoalCount.getRequired("developmentGoalCount")

        /** The total number of tests in the project. */
        fun goalCount(): Long = goalCount.getRequired("goalCount")

        /** The number of inference pipelines in the project. */
        fun inferencePipelineCount(): Long =
            inferencePipelineCount.getRequired("inferencePipelineCount")

        /** Links to the project. */
        fun links(): Links = links.getRequired("links")

        /** The number of tests in the monitoring mode of the project. */
        fun monitoringGoalCount(): Long = monitoringGoalCount.getRequired("monitoringGoalCount")

        /** The project name. */
        fun name(): String = name.getRequired("name")

        /** The source of the project. */
        fun source(): Optional<Source> = Optional.ofNullable(source.getNullable("source"))

        /** The task type of the project. */
        fun taskType(): TaskType = taskType.getRequired("taskType")

        /** The number of versions (commits) in the project. */
        fun versionCount(): Long = versionCount.getRequired("versionCount")

        /** The workspace id. */
        fun workspaceId(): Optional<String> =
            Optional.ofNullable(workspaceId.getNullable("workspaceId"))

        /** The project description. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun gitRepo(): Optional<GitRepo> = Optional.ofNullable(gitRepo.getNullable("gitRepo"))

        /** The project id. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The project creator id. */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

        /** The project creation date. */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /** The project last updated date. */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /** The number of tests in the development mode of the project. */
        @JsonProperty("developmentGoalCount")
        @ExcludeMissing
        fun _developmentGoalCount(): JsonField<Long> = developmentGoalCount

        /** The total number of tests in the project. */
        @JsonProperty("goalCount") @ExcludeMissing fun _goalCount(): JsonField<Long> = goalCount

        /** The number of inference pipelines in the project. */
        @JsonProperty("inferencePipelineCount")
        @ExcludeMissing
        fun _inferencePipelineCount(): JsonField<Long> = inferencePipelineCount

        /** Links to the project. */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /** The number of tests in the monitoring mode of the project. */
        @JsonProperty("monitoringGoalCount")
        @ExcludeMissing
        fun _monitoringGoalCount(): JsonField<Long> = monitoringGoalCount

        /** The project name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The source of the project. */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /** The task type of the project. */
        @JsonProperty("taskType") @ExcludeMissing fun _taskType(): JsonField<TaskType> = taskType

        /** The number of versions (commits) in the project. */
        @JsonProperty("versionCount")
        @ExcludeMissing
        fun _versionCount(): JsonField<Long> = versionCount

        /** The workspace id. */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /** The project description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo(): JsonField<GitRepo> = gitRepo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Project = apply {
            if (validated) {
                return@apply
            }

            id()
            creatorId()
            dateCreated()
            dateUpdated()
            developmentGoalCount()
            goalCount()
            inferencePipelineCount()
            links().validate()
            monitoringGoalCount()
            name()
            source()
            taskType()
            versionCount()
            workspaceId()
            description()
            gitRepo().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var developmentGoalCount: JsonField<Long>? = null
            private var goalCount: JsonField<Long>? = null
            private var inferencePipelineCount: JsonField<Long>? = null
            private var links: JsonField<Links>? = null
            private var monitoringGoalCount: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var source: JsonField<Source>? = null
            private var taskType: JsonField<TaskType>? = null
            private var versionCount: JsonField<Long>? = null
            private var workspaceId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var gitRepo: JsonField<GitRepo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(project: Project) = apply {
                id = project.id
                creatorId = project.creatorId
                dateCreated = project.dateCreated
                dateUpdated = project.dateUpdated
                developmentGoalCount = project.developmentGoalCount
                goalCount = project.goalCount
                inferencePipelineCount = project.inferencePipelineCount
                links = project.links
                monitoringGoalCount = project.monitoringGoalCount
                name = project.name
                source = project.source
                taskType = project.taskType
                versionCount = project.versionCount
                workspaceId = project.workspaceId
                description = project.description
                gitRepo = project.gitRepo
                additionalProperties = project.additionalProperties.toMutableMap()
            }

            /** The project id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The project id. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The project creator id. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** The project creator id. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.orElse(null))

            /** The project creator id. */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The project creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The project creation date. */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The project last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The project last updated date. */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The number of tests in the development mode of the project. */
            fun developmentGoalCount(developmentGoalCount: Long) =
                developmentGoalCount(JsonField.of(developmentGoalCount))

            /** The number of tests in the development mode of the project. */
            fun developmentGoalCount(developmentGoalCount: JsonField<Long>) = apply {
                this.developmentGoalCount = developmentGoalCount
            }

            /** The total number of tests in the project. */
            fun goalCount(goalCount: Long) = goalCount(JsonField.of(goalCount))

            /** The total number of tests in the project. */
            fun goalCount(goalCount: JsonField<Long>) = apply { this.goalCount = goalCount }

            /** The number of inference pipelines in the project. */
            fun inferencePipelineCount(inferencePipelineCount: Long) =
                inferencePipelineCount(JsonField.of(inferencePipelineCount))

            /** The number of inference pipelines in the project. */
            fun inferencePipelineCount(inferencePipelineCount: JsonField<Long>) = apply {
                this.inferencePipelineCount = inferencePipelineCount
            }

            /** Links to the project. */
            fun links(links: Links) = links(JsonField.of(links))

            /** Links to the project. */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** The number of tests in the monitoring mode of the project. */
            fun monitoringGoalCount(monitoringGoalCount: Long) =
                monitoringGoalCount(JsonField.of(monitoringGoalCount))

            /** The number of tests in the monitoring mode of the project. */
            fun monitoringGoalCount(monitoringGoalCount: JsonField<Long>) = apply {
                this.monitoringGoalCount = monitoringGoalCount
            }

            /** The project name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The project name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The source of the project. */
            fun source(source: Source?) = source(JsonField.ofNullable(source))

            /** The source of the project. */
            fun source(source: Optional<Source>) = source(source.orElse(null))

            /** The source of the project. */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The task type of the project. */
            fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

            /** The task type of the project. */
            fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

            /** The number of versions (commits) in the project. */
            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            /** The number of versions (commits) in the project. */
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            /** The workspace id. */
            fun workspaceId(workspaceId: String?) = workspaceId(JsonField.ofNullable(workspaceId))

            /** The workspace id. */
            fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.orElse(null))

            /** The workspace id. */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

            /** The project description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** The project description. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** The project description. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun gitRepo(gitRepo: GitRepo?) = gitRepo(JsonField.ofNullable(gitRepo))

            fun gitRepo(gitRepo: Optional<GitRepo>) = gitRepo(gitRepo.orElse(null))

            fun gitRepo(gitRepo: JsonField<GitRepo>) = apply { this.gitRepo = gitRepo }

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

            fun build(): Project =
                Project(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("developmentGoalCount", developmentGoalCount),
                    checkRequired("goalCount", goalCount),
                    checkRequired("inferencePipelineCount", inferencePipelineCount),
                    checkRequired("links", links),
                    checkRequired("monitoringGoalCount", monitoringGoalCount),
                    checkRequired("name", name),
                    checkRequired("source", source),
                    checkRequired("taskType", taskType),
                    checkRequired("versionCount", versionCount),
                    checkRequired("workspaceId", workspaceId),
                    description,
                    gitRepo,
                    additionalProperties.toImmutable(),
                )
        }

        /** Links to the project. */
        @NoAutoDetect
        class Links
        @JsonCreator
        private constructor(
            @JsonProperty("app")
            @ExcludeMissing
            private val app: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun app(): String = app.getRequired("app")

            @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                app()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var app: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    app = links.app
                    additionalProperties = links.additionalProperties.toMutableMap()
                }

                fun app(app: String) = app(JsonField.of(app))

                fun app(app: JsonField<String>) = apply { this.app = app }

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

                fun build(): Links =
                    Links(checkRequired("app", app), additionalProperties.toImmutable())
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

        /** The source of the project. */
        class Source
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WEB = of("web")

                @JvmField val API = of("api")

                @JvmField val NULL = of("null")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            enum class Known {
                WEB,
                API,
                NULL,
            }

            enum class Value {
                WEB,
                API,
                NULL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    WEB -> Value.WEB
                    API -> Value.API
                    NULL -> Value.NULL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    WEB -> Known.WEB
                    API -> Known.API
                    NULL -> Known.NULL
                    else -> throw OpenlayerInvalidDataException("Unknown Source: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Source && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The task type of the project. */
        class TaskType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LLM_BASE = of("llm-base")

                @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

                @JvmField val TABULAR_REGRESSION = of("tabular-regression")

                @JvmField val TEXT_CLASSIFICATION = of("text-classification")

                @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
            }

            enum class Known {
                LLM_BASE,
                TABULAR_CLASSIFICATION,
                TABULAR_REGRESSION,
                TEXT_CLASSIFICATION,
            }

            enum class Value {
                LLM_BASE,
                TABULAR_CLASSIFICATION,
                TABULAR_REGRESSION,
                TEXT_CLASSIFICATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LLM_BASE -> Value.LLM_BASE
                    TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LLM_BASE -> Known.LLM_BASE
                    TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                    else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaskType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GitRepo
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateConnected")
            @ExcludeMissing
            private val dateConnected: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("gitAccountId")
            @ExcludeMissing
            private val gitAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitId")
            @ExcludeMissing
            private val gitId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("private")
            @ExcludeMissing
            private val private_: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            private val projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug")
            @ExcludeMissing
            private val slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url")
            @ExcludeMissing
            private val url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("branch")
            @ExcludeMissing
            private val branch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rootDir")
            @ExcludeMissing
            private val rootDir: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun dateConnected(): OffsetDateTime = dateConnected.getRequired("dateConnected")

            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            fun gitAccountId(): String = gitAccountId.getRequired("gitAccountId")

            fun gitId(): Long = gitId.getRequired("gitId")

            fun name(): String = name.getRequired("name")

            fun private_(): Boolean = private_.getRequired("private")

            fun projectId(): String = projectId.getRequired("projectId")

            fun slug(): String = slug.getRequired("slug")

            fun url(): String = url.getRequired("url")

            fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

            fun rootDir(): Optional<String> = Optional.ofNullable(rootDir.getNullable("rootDir"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("dateConnected")
            @ExcludeMissing
            fun _dateConnected(): JsonField<OffsetDateTime> = dateConnected

            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

            @JsonProperty("gitAccountId")
            @ExcludeMissing
            fun _gitAccountId(): JsonField<String> = gitAccountId

            @JsonProperty("gitId") @ExcludeMissing fun _gitId(): JsonField<Long> = gitId

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("private") @ExcludeMissing fun _private_(): JsonField<Boolean> = private_

            @JsonProperty("projectId")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

            @JsonProperty("rootDir") @ExcludeMissing fun _rootDir(): JsonField<String> = rootDir

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GitRepo = apply {
                if (validated) {
                    return@apply
                }

                id()
                dateConnected()
                dateUpdated()
                gitAccountId()
                gitId()
                name()
                private_()
                projectId()
                slug()
                url()
                branch()
                rootDir()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String>? = null
                private var dateConnected: JsonField<OffsetDateTime>? = null
                private var dateUpdated: JsonField<OffsetDateTime>? = null
                private var gitAccountId: JsonField<String>? = null
                private var gitId: JsonField<Long>? = null
                private var name: JsonField<String>? = null
                private var private_: JsonField<Boolean>? = null
                private var projectId: JsonField<String>? = null
                private var slug: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var branch: JsonField<String> = JsonMissing.of()
                private var rootDir: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gitRepo: GitRepo) = apply {
                    id = gitRepo.id
                    dateConnected = gitRepo.dateConnected
                    dateUpdated = gitRepo.dateUpdated
                    gitAccountId = gitRepo.gitAccountId
                    gitId = gitRepo.gitId
                    name = gitRepo.name
                    private_ = gitRepo.private_
                    projectId = gitRepo.projectId
                    slug = gitRepo.slug
                    url = gitRepo.url
                    branch = gitRepo.branch
                    rootDir = gitRepo.rootDir
                    additionalProperties = gitRepo.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun dateConnected(dateConnected: OffsetDateTime) =
                    dateConnected(JsonField.of(dateConnected))

                fun dateConnected(dateConnected: JsonField<OffsetDateTime>) = apply {
                    this.dateConnected = dateConnected
                }

                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                fun gitAccountId(gitAccountId: String) = gitAccountId(JsonField.of(gitAccountId))

                fun gitAccountId(gitAccountId: JsonField<String>) = apply {
                    this.gitAccountId = gitAccountId
                }

                fun gitId(gitId: Long) = gitId(JsonField.of(gitId))

                fun gitId(gitId: JsonField<Long>) = apply { this.gitId = gitId }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun private_(private_: Boolean) = private_(JsonField.of(private_))

                fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                fun slug(slug: String) = slug(JsonField.of(slug))

                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                fun url(url: String) = url(JsonField.of(url))

                fun url(url: JsonField<String>) = apply { this.url = url }

                fun branch(branch: String) = branch(JsonField.of(branch))

                fun branch(branch: JsonField<String>) = apply { this.branch = branch }

                fun rootDir(rootDir: String) = rootDir(JsonField.of(rootDir))

                fun rootDir(rootDir: JsonField<String>) = apply { this.rootDir = rootDir }

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

                fun build(): GitRepo =
                    GitRepo(
                        checkRequired("id", id),
                        checkRequired("dateConnected", dateConnected),
                        checkRequired("dateUpdated", dateUpdated),
                        checkRequired("gitAccountId", gitAccountId),
                        checkRequired("gitId", gitId),
                        checkRequired("name", name),
                        checkRequired("private_", private_),
                        checkRequired("projectId", projectId),
                        checkRequired("slug", slug),
                        checkRequired("url", url),
                        branch,
                        rootDir,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GitRepo && id == other.id && dateConnected == other.dateConnected && dateUpdated == other.dateUpdated && gitAccountId == other.gitAccountId && gitId == other.gitId && name == other.name && private_ == other.private_ && projectId == other.projectId && slug == other.slug && url == other.url && branch == other.branch && rootDir == other.rootDir && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, dateConnected, dateUpdated, gitAccountId, gitId, name, private_, projectId, slug, url, branch, rootDir, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GitRepo{id=$id, dateConnected=$dateConnected, dateUpdated=$dateUpdated, gitAccountId=$gitAccountId, gitId=$gitId, name=$name, private_=$private_, projectId=$projectId, slug=$slug, url=$url, branch=$branch, rootDir=$rootDir, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Project && id == other.id && creatorId == other.creatorId && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && developmentGoalCount == other.developmentGoalCount && goalCount == other.goalCount && inferencePipelineCount == other.inferencePipelineCount && links == other.links && monitoringGoalCount == other.monitoringGoalCount && name == other.name && source == other.source && taskType == other.taskType && versionCount == other.versionCount && workspaceId == other.workspaceId && description == other.description && gitRepo == other.gitRepo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creatorId, dateCreated, dateUpdated, developmentGoalCount, goalCount, inferencePipelineCount, links, monitoringGoalCount, name, source, taskType, versionCount, workspaceId, description, gitRepo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Project{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, developmentGoalCount=$developmentGoalCount, goalCount=$goalCount, inferencePipelineCount=$inferencePipelineCount, links=$links, monitoringGoalCount=$monitoringGoalCount, name=$name, source=$source, taskType=$taskType, versionCount=$versionCount, workspaceId=$workspaceId, description=$description, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Workspace
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creatorId")
        @ExcludeMissing
        private val creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        private val dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inviteCount")
        @ExcludeMissing
        private val inviteCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("memberCount")
        @ExcludeMissing
        private val memberCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("periodEndDate")
        @ExcludeMissing
        private val periodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("periodStartDate")
        @ExcludeMissing
        private val periodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("projectCount")
        @ExcludeMissing
        private val projectCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("slug")
        @ExcludeMissing
        private val slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("inviteCode")
        @ExcludeMissing
        private val inviteCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("monthlyUsage")
        @ExcludeMissing
        private val monthlyUsage: JsonField<List<MonthlyUsage>> = JsonMissing.of(),
        @JsonProperty("samlOnlyAccess")
        @ExcludeMissing
        private val samlOnlyAccess: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("wildcardDomains")
        @ExcludeMissing
        private val wildcardDomains: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The workspace id. */
        fun id(): String = id.getRequired("id")

        /** The workspace creator id. */
        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        /** The workspace creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The workspace last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The number of invites in the workspace. */
        fun inviteCount(): Long = inviteCount.getRequired("inviteCount")

        /** The number of members in the workspace. */
        fun memberCount(): Long = memberCount.getRequired("memberCount")

        /** The workspace name. */
        fun name(): String = name.getRequired("name")

        /** The end date of the current billing period. */
        fun periodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodEndDate.getNullable("periodEndDate"))

        /** The start date of the current billing period. */
        fun periodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodStartDate.getNullable("periodStartDate"))

        /** The number of projects in the workspace. */
        fun projectCount(): Long = projectCount.getRequired("projectCount")

        /** The workspace slug. */
        fun slug(): String = slug.getRequired("slug")

        fun status(): Status = status.getRequired("status")

        /** The workspace invite code. */
        fun inviteCode(): Optional<String> =
            Optional.ofNullable(inviteCode.getNullable("inviteCode"))

        fun monthlyUsage(): Optional<List<MonthlyUsage>> =
            Optional.ofNullable(monthlyUsage.getNullable("monthlyUsage"))

        /** Whether the workspace only allows SAML authentication. */
        fun samlOnlyAccess(): Optional<Boolean> =
            Optional.ofNullable(samlOnlyAccess.getNullable("samlOnlyAccess"))

        fun wildcardDomains(): Optional<List<String>> =
            Optional.ofNullable(wildcardDomains.getNullable("wildcardDomains"))

        /** The workspace id. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The workspace creator id. */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

        /** The workspace creation date. */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /** The workspace last updated date. */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /** The number of invites in the workspace. */
        @JsonProperty("inviteCount")
        @ExcludeMissing
        fun _inviteCount(): JsonField<Long> = inviteCount

        /** The number of members in the workspace. */
        @JsonProperty("memberCount")
        @ExcludeMissing
        fun _memberCount(): JsonField<Long> = memberCount

        /** The workspace name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** The end date of the current billing period. */
        @JsonProperty("periodEndDate")
        @ExcludeMissing
        fun _periodEndDate(): JsonField<OffsetDateTime> = periodEndDate

        /** The start date of the current billing period. */
        @JsonProperty("periodStartDate")
        @ExcludeMissing
        fun _periodStartDate(): JsonField<OffsetDateTime> = periodStartDate

        /** The number of projects in the workspace. */
        @JsonProperty("projectCount")
        @ExcludeMissing
        fun _projectCount(): JsonField<Long> = projectCount

        /** The workspace slug. */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** The workspace invite code. */
        @JsonProperty("inviteCode")
        @ExcludeMissing
        fun _inviteCode(): JsonField<String> = inviteCode

        @JsonProperty("monthlyUsage")
        @ExcludeMissing
        fun _monthlyUsage(): JsonField<List<MonthlyUsage>> = monthlyUsage

        /** Whether the workspace only allows SAML authentication. */
        @JsonProperty("samlOnlyAccess")
        @ExcludeMissing
        fun _samlOnlyAccess(): JsonField<Boolean> = samlOnlyAccess

        @JsonProperty("wildcardDomains")
        @ExcludeMissing
        fun _wildcardDomains(): JsonField<List<String>> = wildcardDomains

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Workspace = apply {
            if (validated) {
                return@apply
            }

            id()
            creatorId()
            dateCreated()
            dateUpdated()
            inviteCount()
            memberCount()
            name()
            periodEndDate()
            periodStartDate()
            projectCount()
            slug()
            status()
            inviteCode()
            monthlyUsage().ifPresent { it.forEach { it.validate() } }
            samlOnlyAccess()
            wildcardDomains()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var inviteCount: JsonField<Long>? = null
            private var memberCount: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var periodEndDate: JsonField<OffsetDateTime>? = null
            private var periodStartDate: JsonField<OffsetDateTime>? = null
            private var projectCount: JsonField<Long>? = null
            private var slug: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var inviteCode: JsonField<String> = JsonMissing.of()
            private var monthlyUsage: JsonField<MutableList<MonthlyUsage>>? = null
            private var samlOnlyAccess: JsonField<Boolean> = JsonMissing.of()
            private var wildcardDomains: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(workspace: Workspace) = apply {
                id = workspace.id
                creatorId = workspace.creatorId
                dateCreated = workspace.dateCreated
                dateUpdated = workspace.dateUpdated
                inviteCount = workspace.inviteCount
                memberCount = workspace.memberCount
                name = workspace.name
                periodEndDate = workspace.periodEndDate
                periodStartDate = workspace.periodStartDate
                projectCount = workspace.projectCount
                slug = workspace.slug
                status = workspace.status
                inviteCode = workspace.inviteCode
                monthlyUsage = workspace.monthlyUsage.map { it.toMutableList() }
                samlOnlyAccess = workspace.samlOnlyAccess
                wildcardDomains = workspace.wildcardDomains.map { it.toMutableList() }
                additionalProperties = workspace.additionalProperties.toMutableMap()
            }

            /** The workspace id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The workspace id. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The workspace creator id. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** The workspace creator id. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.orElse(null))

            /** The workspace creator id. */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The workspace creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The workspace creation date. */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The workspace last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The workspace last updated date. */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The number of invites in the workspace. */
            fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

            /** The number of invites in the workspace. */
            fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

            /** The number of members in the workspace. */
            fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

            /** The number of members in the workspace. */
            fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

            /** The workspace name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The workspace name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The end date of the current billing period. */
            fun periodEndDate(periodEndDate: OffsetDateTime?) =
                periodEndDate(JsonField.ofNullable(periodEndDate))

            /** The end date of the current billing period. */
            fun periodEndDate(periodEndDate: Optional<OffsetDateTime>) =
                periodEndDate(periodEndDate.orElse(null))

            /** The end date of the current billing period. */
            fun periodEndDate(periodEndDate: JsonField<OffsetDateTime>) = apply {
                this.periodEndDate = periodEndDate
            }

            /** The start date of the current billing period. */
            fun periodStartDate(periodStartDate: OffsetDateTime?) =
                periodStartDate(JsonField.ofNullable(periodStartDate))

            /** The start date of the current billing period. */
            fun periodStartDate(periodStartDate: Optional<OffsetDateTime>) =
                periodStartDate(periodStartDate.orElse(null))

            /** The start date of the current billing period. */
            fun periodStartDate(periodStartDate: JsonField<OffsetDateTime>) = apply {
                this.periodStartDate = periodStartDate
            }

            /** The number of projects in the workspace. */
            fun projectCount(projectCount: Long) = projectCount(JsonField.of(projectCount))

            /** The number of projects in the workspace. */
            fun projectCount(projectCount: JsonField<Long>) = apply {
                this.projectCount = projectCount
            }

            /** The workspace slug. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /** The workspace slug. */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun status(status: Status) = status(JsonField.of(status))

            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The workspace invite code. */
            fun inviteCode(inviteCode: String) = inviteCode(JsonField.of(inviteCode))

            /** The workspace invite code. */
            fun inviteCode(inviteCode: JsonField<String>) = apply { this.inviteCode = inviteCode }

            fun monthlyUsage(monthlyUsage: List<MonthlyUsage>) =
                monthlyUsage(JsonField.of(monthlyUsage))

            fun monthlyUsage(monthlyUsage: JsonField<List<MonthlyUsage>>) = apply {
                this.monthlyUsage = monthlyUsage.map { it.toMutableList() }
            }

            fun addMonthlyUsage(monthlyUsage: MonthlyUsage) = apply {
                this.monthlyUsage =
                    (this.monthlyUsage ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(monthlyUsage)
                    }
            }

            /** Whether the workspace only allows SAML authentication. */
            fun samlOnlyAccess(samlOnlyAccess: Boolean) =
                samlOnlyAccess(JsonField.of(samlOnlyAccess))

            /** Whether the workspace only allows SAML authentication. */
            fun samlOnlyAccess(samlOnlyAccess: JsonField<Boolean>) = apply {
                this.samlOnlyAccess = samlOnlyAccess
            }

            fun wildcardDomains(wildcardDomains: List<String>) =
                wildcardDomains(JsonField.of(wildcardDomains))

            fun wildcardDomains(wildcardDomains: JsonField<List<String>>) = apply {
                this.wildcardDomains = wildcardDomains.map { it.toMutableList() }
            }

            fun addWildcardDomain(wildcardDomain: String) = apply {
                wildcardDomains =
                    (wildcardDomains ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(wildcardDomain)
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

            fun build(): Workspace =
                Workspace(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("inviteCount", inviteCount),
                    checkRequired("memberCount", memberCount),
                    checkRequired("name", name),
                    checkRequired("periodEndDate", periodEndDate),
                    checkRequired("periodStartDate", periodStartDate),
                    checkRequired("projectCount", projectCount),
                    checkRequired("slug", slug),
                    checkRequired("status", status),
                    inviteCode,
                    (monthlyUsage ?: JsonMissing.of()).map { it.toImmutable() },
                    samlOnlyAccess,
                    (wildcardDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTIVE = of("active")

                @JvmField val PAST_DUE = of("past_due")

                @JvmField val UNPAID = of("unpaid")

                @JvmField val CANCELED = of("canceled")

                @JvmField val INCOMPLETE = of("incomplete")

                @JvmField val INCOMPLETE_EXPIRED = of("incomplete_expired")

                @JvmField val TRIALING = of("trialing")

                @JvmField val PAUSED = of("paused")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ACTIVE,
                PAST_DUE,
                UNPAID,
                CANCELED,
                INCOMPLETE,
                INCOMPLETE_EXPIRED,
                TRIALING,
                PAUSED,
            }

            enum class Value {
                ACTIVE,
                PAST_DUE,
                UNPAID,
                CANCELED,
                INCOMPLETE,
                INCOMPLETE_EXPIRED,
                TRIALING,
                PAUSED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    PAST_DUE -> Value.PAST_DUE
                    UNPAID -> Value.UNPAID
                    CANCELED -> Value.CANCELED
                    INCOMPLETE -> Value.INCOMPLETE
                    INCOMPLETE_EXPIRED -> Value.INCOMPLETE_EXPIRED
                    TRIALING -> Value.TRIALING
                    PAUSED -> Value.PAUSED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    PAST_DUE -> Known.PAST_DUE
                    UNPAID -> Known.UNPAID
                    CANCELED -> Known.CANCELED
                    INCOMPLETE -> Known.INCOMPLETE
                    INCOMPLETE_EXPIRED -> Known.INCOMPLETE_EXPIRED
                    TRIALING -> Known.TRIALING
                    PAUSED -> Known.PAUSED
                    else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
        class MonthlyUsage
        @JsonCreator
        private constructor(
            @JsonProperty("executionTimeMs")
            @ExcludeMissing
            private val executionTimeMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthYear")
            @ExcludeMissing
            private val monthYear: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("predictionCount")
            @ExcludeMissing
            private val predictionCount: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun executionTimeMs(): Optional<Long> =
                Optional.ofNullable(executionTimeMs.getNullable("executionTimeMs"))

            fun monthYear(): Optional<LocalDate> =
                Optional.ofNullable(monthYear.getNullable("monthYear"))

            fun predictionCount(): Optional<Long> =
                Optional.ofNullable(predictionCount.getNullable("predictionCount"))

            @JsonProperty("executionTimeMs")
            @ExcludeMissing
            fun _executionTimeMs(): JsonField<Long> = executionTimeMs

            @JsonProperty("monthYear")
            @ExcludeMissing
            fun _monthYear(): JsonField<LocalDate> = monthYear

            @JsonProperty("predictionCount")
            @ExcludeMissing
            fun _predictionCount(): JsonField<Long> = predictionCount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MonthlyUsage = apply {
                if (validated) {
                    return@apply
                }

                executionTimeMs()
                monthYear()
                predictionCount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var executionTimeMs: JsonField<Long> = JsonMissing.of()
                private var monthYear: JsonField<LocalDate> = JsonMissing.of()
                private var predictionCount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(monthlyUsage: MonthlyUsage) = apply {
                    executionTimeMs = monthlyUsage.executionTimeMs
                    monthYear = monthlyUsage.monthYear
                    predictionCount = monthlyUsage.predictionCount
                    additionalProperties = monthlyUsage.additionalProperties.toMutableMap()
                }

                fun executionTimeMs(executionTimeMs: Long?) =
                    executionTimeMs(JsonField.ofNullable(executionTimeMs))

                fun executionTimeMs(executionTimeMs: Long) =
                    executionTimeMs(executionTimeMs as Long?)

                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun executionTimeMs(executionTimeMs: Optional<Long>) =
                    executionTimeMs(executionTimeMs.orElse(null) as Long?)

                fun executionTimeMs(executionTimeMs: JsonField<Long>) = apply {
                    this.executionTimeMs = executionTimeMs
                }

                fun monthYear(monthYear: LocalDate) = monthYear(JsonField.of(monthYear))

                fun monthYear(monthYear: JsonField<LocalDate>) = apply {
                    this.monthYear = monthYear
                }

                fun predictionCount(predictionCount: Long) =
                    predictionCount(JsonField.of(predictionCount))

                fun predictionCount(predictionCount: JsonField<Long>) = apply {
                    this.predictionCount = predictionCount
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

                fun build(): MonthlyUsage =
                    MonthlyUsage(
                        executionTimeMs,
                        monthYear,
                        predictionCount,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonthlyUsage && executionTimeMs == other.executionTimeMs && monthYear == other.monthYear && predictionCount == other.predictionCount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(executionTimeMs, monthYear, predictionCount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonthlyUsage{executionTimeMs=$executionTimeMs, monthYear=$monthYear, predictionCount=$predictionCount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Workspace && id == other.id && creatorId == other.creatorId && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && inviteCount == other.inviteCount && memberCount == other.memberCount && name == other.name && periodEndDate == other.periodEndDate && periodStartDate == other.periodStartDate && projectCount == other.projectCount && slug == other.slug && status == other.status && inviteCode == other.inviteCode && monthlyUsage == other.monthlyUsage && samlOnlyAccess == other.samlOnlyAccess && wildcardDomains == other.wildcardDomains && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creatorId, dateCreated, dateUpdated, inviteCount, memberCount, name, periodEndDate, periodStartDate, projectCount, slug, status, inviteCode, monthlyUsage, samlOnlyAccess, wildcardDomains, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Workspace{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, inviteCount=$inviteCount, memberCount=$memberCount, name=$name, periodEndDate=$periodEndDate, periodStartDate=$periodStartDate, projectCount=$projectCount, slug=$slug, status=$status, inviteCode=$inviteCode, monthlyUsage=$monthlyUsage, samlOnlyAccess=$samlOnlyAccess, wildcardDomains=$wildcardDomains, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineUpdateResponse && id == other.id && dateCreated == other.dateCreated && dateLastEvaluated == other.dateLastEvaluated && dateLastSampleReceived == other.dateLastSampleReceived && dateOfNextEvaluation == other.dateOfNextEvaluation && dateUpdated == other.dateUpdated && description == other.description && failingGoalCount == other.failingGoalCount && links == other.links && name == other.name && passingGoalCount == other.passingGoalCount && projectId == other.projectId && status == other.status && statusMessage == other.statusMessage && totalGoalCount == other.totalGoalCount && project == other.project && workspace == other.workspace && workspaceId == other.workspaceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, dateCreated, dateLastEvaluated, dateLastSampleReceived, dateOfNextEvaluation, dateUpdated, description, failingGoalCount, links, name, passingGoalCount, projectId, status, statusMessage, totalGoalCount, project, workspace, workspaceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineUpdateResponse{id=$id, dateCreated=$dateCreated, dateLastEvaluated=$dateLastEvaluated, dateLastSampleReceived=$dateLastSampleReceived, dateOfNextEvaluation=$dateOfNextEvaluation, dateUpdated=$dateUpdated, description=$description, failingGoalCount=$failingGoalCount, links=$links, name=$name, passingGoalCount=$passingGoalCount, projectId=$projectId, status=$status, statusMessage=$statusMessage, totalGoalCount=$totalGoalCount, project=$project, workspace=$workspace, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
