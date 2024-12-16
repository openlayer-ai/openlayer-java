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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProjectInferencePipelineCreateResponse.Builder::class)
@NoAutoDetect
class ProjectInferencePipelineCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val projectId: JsonField<String>,
    private val workspaceId: JsonField<String>,
    private val project: JsonField<Project>,
    private val workspace: JsonField<Workspace>,
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

    /** The workspace id. */
    fun workspaceId(): Optional<String> =
        Optional.ofNullable(workspaceId.getNullable("workspaceId"))

    fun project(): Optional<Project> = Optional.ofNullable(project.getNullable("project"))

    fun workspace(): Optional<Workspace> = Optional.ofNullable(workspace.getNullable("workspace"))

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

    /** The workspace id. */
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId() = workspaceId

    @JsonProperty("project") @ExcludeMissing fun _project() = project

    @JsonProperty("workspace") @ExcludeMissing fun _workspace() = workspace

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

    fun validate(): ProjectInferencePipelineCreateResponse = apply {
        if (!validated) {
            id()
            projectId()
            workspaceId()
            project().map { it.validate() }
            workspace().map { it.validate() }
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
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var project: JsonField<Project> = JsonMissing.of()
        private var workspace: JsonField<Workspace> = JsonMissing.of()
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
        internal fun from(
            projectInferencePipelineCreateResponse: ProjectInferencePipelineCreateResponse
        ) = apply {
            this.id = projectInferencePipelineCreateResponse.id
            this.projectId = projectInferencePipelineCreateResponse.projectId
            this.workspaceId = projectInferencePipelineCreateResponse.workspaceId
            this.project = projectInferencePipelineCreateResponse.project
            this.workspace = projectInferencePipelineCreateResponse.workspace
            this.name = projectInferencePipelineCreateResponse.name
            this.dateCreated = projectInferencePipelineCreateResponse.dateCreated
            this.dateUpdated = projectInferencePipelineCreateResponse.dateUpdated
            this.dateLastSampleReceived =
                projectInferencePipelineCreateResponse.dateLastSampleReceived
            this.description = projectInferencePipelineCreateResponse.description
            this.dateLastEvaluated = projectInferencePipelineCreateResponse.dateLastEvaluated
            this.dateOfNextEvaluation = projectInferencePipelineCreateResponse.dateOfNextEvaluation
            this.passingGoalCount = projectInferencePipelineCreateResponse.passingGoalCount
            this.failingGoalCount = projectInferencePipelineCreateResponse.failingGoalCount
            this.totalGoalCount = projectInferencePipelineCreateResponse.totalGoalCount
            this.status = projectInferencePipelineCreateResponse.status
            this.statusMessage = projectInferencePipelineCreateResponse.statusMessage
            this.links = projectInferencePipelineCreateResponse.links
            additionalProperties(projectInferencePipelineCreateResponse.additionalProperties)
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

        /** The workspace id. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /** The workspace id. */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        fun project(project: Project) = project(JsonField.of(project))

        @JsonProperty("project")
        @ExcludeMissing
        fun project(project: JsonField<Project>) = apply { this.project = project }

        fun workspace(workspace: Workspace) = workspace(JsonField.of(workspace))

        @JsonProperty("workspace")
        @ExcludeMissing
        fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

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

        fun build(): ProjectInferencePipelineCreateResponse =
            ProjectInferencePipelineCreateResponse(
                id,
                projectId,
                workspaceId,
                project,
                workspace,
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

    @JsonDeserialize(builder = Project.Builder::class)
    @NoAutoDetect
    class Project
    private constructor(
        private val id: JsonField<String>,
        private val workspaceId: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val name: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val source: JsonField<Source>,
        private val taskType: JsonField<TaskType>,
        private val versionCount: JsonField<Long>,
        private val inferencePipelineCount: JsonField<Long>,
        private val goalCount: JsonField<Long>,
        private val developmentGoalCount: JsonField<Long>,
        private val monitoringGoalCount: JsonField<Long>,
        private val links: JsonField<Links>,
        private val gitRepo: JsonField<GitRepo>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The project id. */
        fun id(): String = id.getRequired("id")

        /** The workspace id. */
        fun workspaceId(): Optional<String> =
            Optional.ofNullable(workspaceId.getNullable("workspaceId"))

        /** The project creator id. */
        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        /** The project name. */
        fun name(): String = name.getRequired("name")

        /** The project creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The project last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The project description. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The source of the project. */
        fun source(): Optional<Source> = Optional.ofNullable(source.getNullable("source"))

        /** The task type of the project. */
        fun taskType(): TaskType = taskType.getRequired("taskType")

        /** The number of versions (commits) in the project. */
        fun versionCount(): Long = versionCount.getRequired("versionCount")

        /** The number of inference pipelines in the project. */
        fun inferencePipelineCount(): Long =
            inferencePipelineCount.getRequired("inferencePipelineCount")

        /** The total number of tests in the project. */
        fun goalCount(): Long = goalCount.getRequired("goalCount")

        /** The number of tests in the development mode of the project. */
        fun developmentGoalCount(): Long = developmentGoalCount.getRequired("developmentGoalCount")

        /** The number of tests in the monitoring mode of the project. */
        fun monitoringGoalCount(): Long = monitoringGoalCount.getRequired("monitoringGoalCount")

        /** Links to the project. */
        fun links(): Links = links.getRequired("links")

        fun gitRepo(): Optional<GitRepo> = Optional.ofNullable(gitRepo.getNullable("gitRepo"))

        /** The project id. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The workspace id. */
        @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId() = workspaceId

        /** The project creator id. */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId() = creatorId

        /** The project name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The project creation date. */
        @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

        /** The project last updated date. */
        @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

        /** The project description. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The source of the project. */
        @JsonProperty("source") @ExcludeMissing fun _source() = source

        /** The task type of the project. */
        @JsonProperty("taskType") @ExcludeMissing fun _taskType() = taskType

        /** The number of versions (commits) in the project. */
        @JsonProperty("versionCount") @ExcludeMissing fun _versionCount() = versionCount

        /** The number of inference pipelines in the project. */
        @JsonProperty("inferencePipelineCount")
        @ExcludeMissing
        fun _inferencePipelineCount() = inferencePipelineCount

        /** The total number of tests in the project. */
        @JsonProperty("goalCount") @ExcludeMissing fun _goalCount() = goalCount

        /** The number of tests in the development mode of the project. */
        @JsonProperty("developmentGoalCount")
        @ExcludeMissing
        fun _developmentGoalCount() = developmentGoalCount

        /** The number of tests in the monitoring mode of the project. */
        @JsonProperty("monitoringGoalCount")
        @ExcludeMissing
        fun _monitoringGoalCount() = monitoringGoalCount

        /** Links to the project. */
        @JsonProperty("links") @ExcludeMissing fun _links() = links

        @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo() = gitRepo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Project = apply {
            if (!validated) {
                id()
                workspaceId()
                creatorId()
                name()
                dateCreated()
                dateUpdated()
                description()
                source()
                taskType()
                versionCount()
                inferencePipelineCount()
                goalCount()
                developmentGoalCount()
                monitoringGoalCount()
                links().validate()
                gitRepo().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var creatorId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var taskType: JsonField<TaskType> = JsonMissing.of()
            private var versionCount: JsonField<Long> = JsonMissing.of()
            private var inferencePipelineCount: JsonField<Long> = JsonMissing.of()
            private var goalCount: JsonField<Long> = JsonMissing.of()
            private var developmentGoalCount: JsonField<Long> = JsonMissing.of()
            private var monitoringGoalCount: JsonField<Long> = JsonMissing.of()
            private var links: JsonField<Links> = JsonMissing.of()
            private var gitRepo: JsonField<GitRepo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(project: Project) = apply {
                this.id = project.id
                this.workspaceId = project.workspaceId
                this.creatorId = project.creatorId
                this.name = project.name
                this.dateCreated = project.dateCreated
                this.dateUpdated = project.dateUpdated
                this.description = project.description
                this.source = project.source
                this.taskType = project.taskType
                this.versionCount = project.versionCount
                this.inferencePipelineCount = project.inferencePipelineCount
                this.goalCount = project.goalCount
                this.developmentGoalCount = project.developmentGoalCount
                this.monitoringGoalCount = project.monitoringGoalCount
                this.links = project.links
                this.gitRepo = project.gitRepo
                additionalProperties(project.additionalProperties)
            }

            /** The project id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The project id. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The workspace id. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /** The workspace id. */
            @JsonProperty("workspaceId")
            @ExcludeMissing
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

            /** The project creator id. */
            fun creatorId(creatorId: String) = creatorId(JsonField.of(creatorId))

            /** The project creator id. */
            @JsonProperty("creatorId")
            @ExcludeMissing
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The project name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The project name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The project creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The project creation date. */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The project last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The project last updated date. */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The project description. */
            fun description(description: String) = description(JsonField.of(description))

            /** The project description. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The source of the project. */
            fun source(source: Source) = source(JsonField.of(source))

            /** The source of the project. */
            @JsonProperty("source")
            @ExcludeMissing
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The task type of the project. */
            fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

            /** The task type of the project. */
            @JsonProperty("taskType")
            @ExcludeMissing
            fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

            /** The number of versions (commits) in the project. */
            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            /** The number of versions (commits) in the project. */
            @JsonProperty("versionCount")
            @ExcludeMissing
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            /** The number of inference pipelines in the project. */
            fun inferencePipelineCount(inferencePipelineCount: Long) =
                inferencePipelineCount(JsonField.of(inferencePipelineCount))

            /** The number of inference pipelines in the project. */
            @JsonProperty("inferencePipelineCount")
            @ExcludeMissing
            fun inferencePipelineCount(inferencePipelineCount: JsonField<Long>) = apply {
                this.inferencePipelineCount = inferencePipelineCount
            }

            /** The total number of tests in the project. */
            fun goalCount(goalCount: Long) = goalCount(JsonField.of(goalCount))

            /** The total number of tests in the project. */
            @JsonProperty("goalCount")
            @ExcludeMissing
            fun goalCount(goalCount: JsonField<Long>) = apply { this.goalCount = goalCount }

            /** The number of tests in the development mode of the project. */
            fun developmentGoalCount(developmentGoalCount: Long) =
                developmentGoalCount(JsonField.of(developmentGoalCount))

            /** The number of tests in the development mode of the project. */
            @JsonProperty("developmentGoalCount")
            @ExcludeMissing
            fun developmentGoalCount(developmentGoalCount: JsonField<Long>) = apply {
                this.developmentGoalCount = developmentGoalCount
            }

            /** The number of tests in the monitoring mode of the project. */
            fun monitoringGoalCount(monitoringGoalCount: Long) =
                monitoringGoalCount(JsonField.of(monitoringGoalCount))

            /** The number of tests in the monitoring mode of the project. */
            @JsonProperty("monitoringGoalCount")
            @ExcludeMissing
            fun monitoringGoalCount(monitoringGoalCount: JsonField<Long>) = apply {
                this.monitoringGoalCount = monitoringGoalCount
            }

            /** Links to the project. */
            fun links(links: Links) = links(JsonField.of(links))

            /** Links to the project. */
            @JsonProperty("links")
            @ExcludeMissing
            fun links(links: JsonField<Links>) = apply { this.links = links }

            fun gitRepo(gitRepo: GitRepo) = gitRepo(JsonField.of(gitRepo))

            @JsonProperty("gitRepo")
            @ExcludeMissing
            fun gitRepo(gitRepo: JsonField<GitRepo>) = apply { this.gitRepo = gitRepo }

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

            fun build(): Project =
                Project(
                    id,
                    workspaceId,
                    creatorId,
                    name,
                    dateCreated,
                    dateUpdated,
                    description,
                    source,
                    taskType,
                    versionCount,
                    inferencePipelineCount,
                    goalCount,
                    developmentGoalCount,
                    monitoringGoalCount,
                    links,
                    gitRepo,
                    additionalProperties.toImmutable(),
                )
        }

        /** Links to the project. */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
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

        @JsonDeserialize(builder = GitRepo.Builder::class)
        @NoAutoDetect
        class GitRepo
        private constructor(
            private val id: JsonField<String>,
            private val gitId: JsonField<Long>,
            private val dateConnected: JsonField<OffsetDateTime>,
            private val dateUpdated: JsonField<OffsetDateTime>,
            private val branch: JsonField<String>,
            private val name: JsonField<String>,
            private val private_: JsonField<Boolean>,
            private val slug: JsonField<String>,
            private val url: JsonField<String>,
            private val rootDir: JsonField<String>,
            private val projectId: JsonField<String>,
            private val gitAccountId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            fun gitId(): Long = gitId.getRequired("gitId")

            fun dateConnected(): OffsetDateTime = dateConnected.getRequired("dateConnected")

            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

            fun name(): String = name.getRequired("name")

            fun private_(): Boolean = private_.getRequired("private")

            fun slug(): String = slug.getRequired("slug")

            fun url(): String = url.getRequired("url")

            fun rootDir(): Optional<String> = Optional.ofNullable(rootDir.getNullable("rootDir"))

            fun projectId(): String = projectId.getRequired("projectId")

            fun gitAccountId(): String = gitAccountId.getRequired("gitAccountId")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("gitId") @ExcludeMissing fun _gitId() = gitId

            @JsonProperty("dateConnected") @ExcludeMissing fun _dateConnected() = dateConnected

            @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

            @JsonProperty("branch") @ExcludeMissing fun _branch() = branch

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("private") @ExcludeMissing fun _private_() = private_

            @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

            @JsonProperty("url") @ExcludeMissing fun _url() = url

            @JsonProperty("rootDir") @ExcludeMissing fun _rootDir() = rootDir

            @JsonProperty("projectId") @ExcludeMissing fun _projectId() = projectId

            @JsonProperty("gitAccountId") @ExcludeMissing fun _gitAccountId() = gitAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GitRepo = apply {
                if (!validated) {
                    id()
                    gitId()
                    dateConnected()
                    dateUpdated()
                    branch()
                    name()
                    private_()
                    slug()
                    url()
                    rootDir()
                    projectId()
                    gitAccountId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var gitId: JsonField<Long> = JsonMissing.of()
                private var dateConnected: JsonField<OffsetDateTime> = JsonMissing.of()
                private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
                private var branch: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var private_: JsonField<Boolean> = JsonMissing.of()
                private var slug: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var rootDir: JsonField<String> = JsonMissing.of()
                private var projectId: JsonField<String> = JsonMissing.of()
                private var gitAccountId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gitRepo: GitRepo) = apply {
                    this.id = gitRepo.id
                    this.gitId = gitRepo.gitId
                    this.dateConnected = gitRepo.dateConnected
                    this.dateUpdated = gitRepo.dateUpdated
                    this.branch = gitRepo.branch
                    this.name = gitRepo.name
                    this.private_ = gitRepo.private_
                    this.slug = gitRepo.slug
                    this.url = gitRepo.url
                    this.rootDir = gitRepo.rootDir
                    this.projectId = gitRepo.projectId
                    this.gitAccountId = gitRepo.gitAccountId
                    additionalProperties(gitRepo.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun gitId(gitId: Long) = gitId(JsonField.of(gitId))

                @JsonProperty("gitId")
                @ExcludeMissing
                fun gitId(gitId: JsonField<Long>) = apply { this.gitId = gitId }

                fun dateConnected(dateConnected: OffsetDateTime) =
                    dateConnected(JsonField.of(dateConnected))

                @JsonProperty("dateConnected")
                @ExcludeMissing
                fun dateConnected(dateConnected: JsonField<OffsetDateTime>) = apply {
                    this.dateConnected = dateConnected
                }

                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                @JsonProperty("dateUpdated")
                @ExcludeMissing
                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                fun branch(branch: String) = branch(JsonField.of(branch))

                @JsonProperty("branch")
                @ExcludeMissing
                fun branch(branch: JsonField<String>) = apply { this.branch = branch }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun private_(private_: Boolean) = private_(JsonField.of(private_))

                @JsonProperty("private")
                @ExcludeMissing
                fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

                fun slug(slug: String) = slug(JsonField.of(slug))

                @JsonProperty("slug")
                @ExcludeMissing
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                fun url(url: String) = url(JsonField.of(url))

                @JsonProperty("url")
                @ExcludeMissing
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun rootDir(rootDir: String) = rootDir(JsonField.of(rootDir))

                @JsonProperty("rootDir")
                @ExcludeMissing
                fun rootDir(rootDir: JsonField<String>) = apply { this.rootDir = rootDir }

                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                @JsonProperty("projectId")
                @ExcludeMissing
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                fun gitAccountId(gitAccountId: String) = gitAccountId(JsonField.of(gitAccountId))

                @JsonProperty("gitAccountId")
                @ExcludeMissing
                fun gitAccountId(gitAccountId: JsonField<String>) = apply {
                    this.gitAccountId = gitAccountId
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

                fun build(): GitRepo =
                    GitRepo(
                        id,
                        gitId,
                        dateConnected,
                        dateUpdated,
                        branch,
                        name,
                        private_,
                        slug,
                        url,
                        rootDir,
                        projectId,
                        gitAccountId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GitRepo && id == other.id && gitId == other.gitId && dateConnected == other.dateConnected && dateUpdated == other.dateUpdated && branch == other.branch && name == other.name && private_ == other.private_ && slug == other.slug && url == other.url && rootDir == other.rootDir && projectId == other.projectId && gitAccountId == other.gitAccountId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, gitId, dateConnected, dateUpdated, branch, name, private_, slug, url, rootDir, projectId, gitAccountId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GitRepo{id=$id, gitId=$gitId, dateConnected=$dateConnected, dateUpdated=$dateUpdated, branch=$branch, name=$name, private_=$private_, slug=$slug, url=$url, rootDir=$rootDir, projectId=$projectId, gitAccountId=$gitAccountId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Project && id == other.id && workspaceId == other.workspaceId && creatorId == other.creatorId && name == other.name && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && description == other.description && source == other.source && taskType == other.taskType && versionCount == other.versionCount && inferencePipelineCount == other.inferencePipelineCount && goalCount == other.goalCount && developmentGoalCount == other.developmentGoalCount && monitoringGoalCount == other.monitoringGoalCount && links == other.links && gitRepo == other.gitRepo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, workspaceId, creatorId, name, dateCreated, dateUpdated, description, source, taskType, versionCount, inferencePipelineCount, goalCount, developmentGoalCount, monitoringGoalCount, links, gitRepo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Project{id=$id, workspaceId=$workspaceId, creatorId=$creatorId, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, source=$source, taskType=$taskType, versionCount=$versionCount, inferencePipelineCount=$inferencePipelineCount, goalCount=$goalCount, developmentGoalCount=$developmentGoalCount, monitoringGoalCount=$monitoringGoalCount, links=$links, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Workspace.Builder::class)
    @NoAutoDetect
    class Workspace
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val slug: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val creatorId: JsonField<String>,
        private val inviteCode: JsonField<String>,
        private val wildcardDomains: JsonField<List<String>>,
        private val projectCount: JsonField<Long>,
        private val memberCount: JsonField<Long>,
        private val monthlyUsage: JsonField<List<MonthlyUsage>>,
        private val inviteCount: JsonField<Long>,
        private val periodStartDate: JsonField<OffsetDateTime>,
        private val periodEndDate: JsonField<OffsetDateTime>,
        private val samlOnlyAccess: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun slug(): String = slug.getRequired("slug")

        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        fun inviteCode(): Optional<String> =
            Optional.ofNullable(inviteCode.getNullable("inviteCode"))

        fun wildcardDomains(): Optional<List<String>> =
            Optional.ofNullable(wildcardDomains.getNullable("wildcardDomains"))

        fun projectCount(): Long = projectCount.getRequired("projectCount")

        fun memberCount(): Long = memberCount.getRequired("memberCount")

        fun monthlyUsage(): Optional<List<MonthlyUsage>> =
            Optional.ofNullable(monthlyUsage.getNullable("monthlyUsage"))

        fun inviteCount(): Long = inviteCount.getRequired("inviteCount")

        fun periodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodStartDate.getNullable("periodStartDate"))

        fun periodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodEndDate.getNullable("periodEndDate"))

        fun samlOnlyAccess(): Optional<Boolean> =
            Optional.ofNullable(samlOnlyAccess.getNullable("samlOnlyAccess"))

        fun status(): Status = status.getRequired("status")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("slug") @ExcludeMissing fun _slug() = slug

        @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

        @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId() = creatorId

        @JsonProperty("inviteCode") @ExcludeMissing fun _inviteCode() = inviteCode

        @JsonProperty("wildcardDomains") @ExcludeMissing fun _wildcardDomains() = wildcardDomains

        @JsonProperty("projectCount") @ExcludeMissing fun _projectCount() = projectCount

        @JsonProperty("memberCount") @ExcludeMissing fun _memberCount() = memberCount

        @JsonProperty("monthlyUsage") @ExcludeMissing fun _monthlyUsage() = monthlyUsage

        @JsonProperty("inviteCount") @ExcludeMissing fun _inviteCount() = inviteCount

        @JsonProperty("periodStartDate") @ExcludeMissing fun _periodStartDate() = periodStartDate

        @JsonProperty("periodEndDate") @ExcludeMissing fun _periodEndDate() = periodEndDate

        @JsonProperty("samlOnlyAccess") @ExcludeMissing fun _samlOnlyAccess() = samlOnlyAccess

        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Workspace = apply {
            if (!validated) {
                id()
                name()
                slug()
                dateCreated()
                dateUpdated()
                creatorId()
                inviteCode()
                wildcardDomains()
                projectCount()
                memberCount()
                monthlyUsage().map { it.forEach { it.validate() } }
                inviteCount()
                periodStartDate()
                periodEndDate()
                samlOnlyAccess()
                status()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var slug: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var creatorId: JsonField<String> = JsonMissing.of()
            private var inviteCode: JsonField<String> = JsonMissing.of()
            private var wildcardDomains: JsonField<List<String>> = JsonMissing.of()
            private var projectCount: JsonField<Long> = JsonMissing.of()
            private var memberCount: JsonField<Long> = JsonMissing.of()
            private var monthlyUsage: JsonField<List<MonthlyUsage>> = JsonMissing.of()
            private var inviteCount: JsonField<Long> = JsonMissing.of()
            private var periodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var periodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var samlOnlyAccess: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(workspace: Workspace) = apply {
                this.id = workspace.id
                this.name = workspace.name
                this.slug = workspace.slug
                this.dateCreated = workspace.dateCreated
                this.dateUpdated = workspace.dateUpdated
                this.creatorId = workspace.creatorId
                this.inviteCode = workspace.inviteCode
                this.wildcardDomains = workspace.wildcardDomains
                this.projectCount = workspace.projectCount
                this.memberCount = workspace.memberCount
                this.monthlyUsage = workspace.monthlyUsage
                this.inviteCount = workspace.inviteCount
                this.periodStartDate = workspace.periodStartDate
                this.periodEndDate = workspace.periodEndDate
                this.samlOnlyAccess = workspace.samlOnlyAccess
                this.status = workspace.status
                additionalProperties(workspace.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun slug(slug: String) = slug(JsonField.of(slug))

            @JsonProperty("slug")
            @ExcludeMissing
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            fun creatorId(creatorId: String) = creatorId(JsonField.of(creatorId))

            @JsonProperty("creatorId")
            @ExcludeMissing
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            fun inviteCode(inviteCode: String) = inviteCode(JsonField.of(inviteCode))

            @JsonProperty("inviteCode")
            @ExcludeMissing
            fun inviteCode(inviteCode: JsonField<String>) = apply { this.inviteCode = inviteCode }

            fun wildcardDomains(wildcardDomains: List<String>) =
                wildcardDomains(JsonField.of(wildcardDomains))

            @JsonProperty("wildcardDomains")
            @ExcludeMissing
            fun wildcardDomains(wildcardDomains: JsonField<List<String>>) = apply {
                this.wildcardDomains = wildcardDomains
            }

            fun projectCount(projectCount: Long) = projectCount(JsonField.of(projectCount))

            @JsonProperty("projectCount")
            @ExcludeMissing
            fun projectCount(projectCount: JsonField<Long>) = apply {
                this.projectCount = projectCount
            }

            fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

            @JsonProperty("memberCount")
            @ExcludeMissing
            fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

            fun monthlyUsage(monthlyUsage: List<MonthlyUsage>) =
                monthlyUsage(JsonField.of(monthlyUsage))

            @JsonProperty("monthlyUsage")
            @ExcludeMissing
            fun monthlyUsage(monthlyUsage: JsonField<List<MonthlyUsage>>) = apply {
                this.monthlyUsage = monthlyUsage
            }

            fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

            @JsonProperty("inviteCount")
            @ExcludeMissing
            fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

            fun periodStartDate(periodStartDate: OffsetDateTime) =
                periodStartDate(JsonField.of(periodStartDate))

            @JsonProperty("periodStartDate")
            @ExcludeMissing
            fun periodStartDate(periodStartDate: JsonField<OffsetDateTime>) = apply {
                this.periodStartDate = periodStartDate
            }

            fun periodEndDate(periodEndDate: OffsetDateTime) =
                periodEndDate(JsonField.of(periodEndDate))

            @JsonProperty("periodEndDate")
            @ExcludeMissing
            fun periodEndDate(periodEndDate: JsonField<OffsetDateTime>) = apply {
                this.periodEndDate = periodEndDate
            }

            fun samlOnlyAccess(samlOnlyAccess: Boolean) =
                samlOnlyAccess(JsonField.of(samlOnlyAccess))

            @JsonProperty("samlOnlyAccess")
            @ExcludeMissing
            fun samlOnlyAccess(samlOnlyAccess: JsonField<Boolean>) = apply {
                this.samlOnlyAccess = samlOnlyAccess
            }

            fun status(status: Status) = status(JsonField.of(status))

            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): Workspace =
                Workspace(
                    id,
                    name,
                    slug,
                    dateCreated,
                    dateUpdated,
                    creatorId,
                    inviteCode,
                    wildcardDomains.map { it.toImmutable() },
                    projectCount,
                    memberCount,
                    monthlyUsage.map { it.toImmutable() },
                    inviteCount,
                    periodStartDate,
                    periodEndDate,
                    samlOnlyAccess,
                    status,
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

        @JsonDeserialize(builder = MonthlyUsage.Builder::class)
        @NoAutoDetect
        class MonthlyUsage
        private constructor(
            private val monthYear: JsonField<LocalDate>,
            private val predictionCount: JsonField<Long>,
            private val executionTimeMs: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun monthYear(): Optional<LocalDate> =
                Optional.ofNullable(monthYear.getNullable("monthYear"))

            fun predictionCount(): Optional<Long> =
                Optional.ofNullable(predictionCount.getNullable("predictionCount"))

            fun executionTimeMs(): Optional<Long> =
                Optional.ofNullable(executionTimeMs.getNullable("executionTimeMs"))

            @JsonProperty("monthYear") @ExcludeMissing fun _monthYear() = monthYear

            @JsonProperty("predictionCount")
            @ExcludeMissing
            fun _predictionCount() = predictionCount

            @JsonProperty("executionTimeMs")
            @ExcludeMissing
            fun _executionTimeMs() = executionTimeMs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MonthlyUsage = apply {
                if (!validated) {
                    monthYear()
                    predictionCount()
                    executionTimeMs()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var monthYear: JsonField<LocalDate> = JsonMissing.of()
                private var predictionCount: JsonField<Long> = JsonMissing.of()
                private var executionTimeMs: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(monthlyUsage: MonthlyUsage) = apply {
                    this.monthYear = monthlyUsage.monthYear
                    this.predictionCount = monthlyUsage.predictionCount
                    this.executionTimeMs = monthlyUsage.executionTimeMs
                    additionalProperties(monthlyUsage.additionalProperties)
                }

                fun monthYear(monthYear: LocalDate) = monthYear(JsonField.of(monthYear))

                @JsonProperty("monthYear")
                @ExcludeMissing
                fun monthYear(monthYear: JsonField<LocalDate>) = apply {
                    this.monthYear = monthYear
                }

                fun predictionCount(predictionCount: Long) =
                    predictionCount(JsonField.of(predictionCount))

                @JsonProperty("predictionCount")
                @ExcludeMissing
                fun predictionCount(predictionCount: JsonField<Long>) = apply {
                    this.predictionCount = predictionCount
                }

                fun executionTimeMs(executionTimeMs: Long) =
                    executionTimeMs(JsonField.of(executionTimeMs))

                @JsonProperty("executionTimeMs")
                @ExcludeMissing
                fun executionTimeMs(executionTimeMs: JsonField<Long>) = apply {
                    this.executionTimeMs = executionTimeMs
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

                fun build(): MonthlyUsage =
                    MonthlyUsage(
                        monthYear,
                        predictionCount,
                        executionTimeMs,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MonthlyUsage && monthYear == other.monthYear && predictionCount == other.predictionCount && executionTimeMs == other.executionTimeMs && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(monthYear, predictionCount, executionTimeMs, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonthlyUsage{monthYear=$monthYear, predictionCount=$predictionCount, executionTimeMs=$executionTimeMs, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Workspace && id == other.id && name == other.name && slug == other.slug && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && creatorId == other.creatorId && inviteCode == other.inviteCode && wildcardDomains == other.wildcardDomains && projectCount == other.projectCount && memberCount == other.memberCount && monthlyUsage == other.monthlyUsage && inviteCount == other.inviteCount && periodStartDate == other.periodStartDate && periodEndDate == other.periodEndDate && samlOnlyAccess == other.samlOnlyAccess && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, slug, dateCreated, dateUpdated, creatorId, inviteCode, wildcardDomains, projectCount, memberCount, monthlyUsage, inviteCount, periodStartDate, periodEndDate, samlOnlyAccess, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Workspace{id=$id, name=$name, slug=$slug, dateCreated=$dateCreated, dateUpdated=$dateUpdated, creatorId=$creatorId, inviteCode=$inviteCode, wildcardDomains=$wildcardDomains, projectCount=$projectCount, memberCount=$memberCount, monthlyUsage=$monthlyUsage, inviteCount=$inviteCount, periodStartDate=$periodStartDate, periodEndDate=$periodEndDate, samlOnlyAccess=$samlOnlyAccess, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectInferencePipelineCreateResponse && id == other.id && projectId == other.projectId && workspaceId == other.workspaceId && project == other.project && workspace == other.workspace && name == other.name && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && dateLastSampleReceived == other.dateLastSampleReceived && description == other.description && dateLastEvaluated == other.dateLastEvaluated && dateOfNextEvaluation == other.dateOfNextEvaluation && passingGoalCount == other.passingGoalCount && failingGoalCount == other.failingGoalCount && totalGoalCount == other.totalGoalCount && status == other.status && statusMessage == other.statusMessage && links == other.links && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, projectId, workspaceId, project, workspace, name, dateCreated, dateUpdated, dateLastSampleReceived, description, dateLastEvaluated, dateOfNextEvaluation, passingGoalCount, failingGoalCount, totalGoalCount, status, statusMessage, links, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectInferencePipelineCreateResponse{id=$id, projectId=$projectId, workspaceId=$workspaceId, project=$project, workspace=$workspace, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, dateLastSampleReceived=$dateLastSampleReceived, description=$description, dateLastEvaluated=$dateLastEvaluated, dateOfNextEvaluation=$dateOfNextEvaluation, passingGoalCount=$passingGoalCount, failingGoalCount=$failingGoalCount, totalGoalCount=$totalGoalCount, status=$status, statusMessage=$statusMessage, links=$links, additionalProperties=$additionalProperties}"
}
