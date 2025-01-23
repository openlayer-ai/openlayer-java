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
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ProjectInferencePipelineCreateParams
constructor(
    private val projectId: String,
    private val description: String?,
    private val name: String,
    private val project: Project?,
    private val workspace: Workspace?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): String = name

    fun project(): Optional<Project> = Optional.ofNullable(project)

    fun workspace(): Optional<Workspace> = Optional.ofNullable(workspace)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ProjectInferencePipelineCreateBody {
        return ProjectInferencePipelineCreateBody(
            description,
            name,
            project,
            workspace,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectInferencePipelineCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectInferencePipelineCreateBody
    internal constructor(
        private val description: String?,
        private val name: String?,
        private val project: Project?,
        private val workspace: Workspace?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The inference pipeline description. */
        @JsonProperty("description") fun description(): String? = description

        /** The inference pipeline name. */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("project") fun project(): Project? = project

        @JsonProperty("workspace") fun workspace(): Workspace? = workspace

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var name: String? = null
            private var project: Project? = null
            private var workspace: Workspace? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                projectInferencePipelineCreateBody: ProjectInferencePipelineCreateBody
            ) = apply {
                this.description = projectInferencePipelineCreateBody.description
                this.name = projectInferencePipelineCreateBody.name
                this.project = projectInferencePipelineCreateBody.project
                this.workspace = projectInferencePipelineCreateBody.workspace
                additionalProperties(projectInferencePipelineCreateBody.additionalProperties)
            }

            /** The inference pipeline description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The inference pipeline name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("project")
            fun project(project: Project) = apply { this.project = project }

            @JsonProperty("workspace")
            fun workspace(workspace: Workspace) = apply { this.workspace = workspace }

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

            fun build(): ProjectInferencePipelineCreateBody =
                ProjectInferencePipelineCreateBody(
                    description,
                    checkNotNull(name) { "`name` is required but was not set" },
                    project,
                    workspace,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectInferencePipelineCreateBody && description == other.description && name == other.name && project == other.project && workspace == other.workspace && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, project, workspace, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectInferencePipelineCreateBody{description=$description, name=$name, project=$project, workspace=$workspace, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var description: String? = null
        private var name: String? = null
        private var project: Project? = null
        private var workspace: Workspace? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            projectInferencePipelineCreateParams: ProjectInferencePipelineCreateParams
        ) = apply {
            projectId = projectInferencePipelineCreateParams.projectId
            description = projectInferencePipelineCreateParams.description
            name = projectInferencePipelineCreateParams.name
            project = projectInferencePipelineCreateParams.project
            workspace = projectInferencePipelineCreateParams.workspace
            additionalHeaders = projectInferencePipelineCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                projectInferencePipelineCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                projectInferencePipelineCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** The inference pipeline description. */
        fun description(description: String) = apply { this.description = description }

        /** The inference pipeline name. */
        fun name(name: String) = apply { this.name = name }

        fun project(project: Project) = apply { this.project = project }

        fun workspace(workspace: Workspace) = apply { this.workspace = workspace }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ProjectInferencePipelineCreateParams =
            ProjectInferencePipelineCreateParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                description,
                checkNotNull(name) { "`name` is required but was not set" },
                project,
                workspace,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Links.Builder::class)
    @NoAutoDetect
    class Links
    private constructor(
        private val app: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("app") fun app(): String? = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                this.app = links.app
                additionalProperties(links.additionalProperties)
            }

            @JsonProperty("app") fun app(app: String) = apply { this.app = app }

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

            fun build(): Links =
                Links(
                    checkNotNull(app) { "`app` is required but was not set" },
                    additionalProperties.toImmutable()
                )
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
        private val id: String?,
        private val workspaceId: String?,
        private val creatorId: String?,
        private val name: String?,
        private val dateCreated: OffsetDateTime?,
        private val dateUpdated: OffsetDateTime?,
        private val description: String?,
        private val source: Source?,
        private val taskType: TaskType?,
        private val versionCount: Long?,
        private val inferencePipelineCount: Long?,
        private val goalCount: Long?,
        private val developmentGoalCount: Long?,
        private val monitoringGoalCount: Long?,
        private val links: Links?,
        private val gitRepo: GitRepo?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The project id. */
        @JsonProperty("id") fun id(): String? = id

        /** The workspace id. */
        @JsonProperty("workspaceId") fun workspaceId(): String? = workspaceId

        /** The project creator id. */
        @JsonProperty("creatorId") fun creatorId(): String? = creatorId

        /** The project name. */
        @JsonProperty("name") fun name(): String? = name

        /** The project creation date. */
        @JsonProperty("dateCreated") fun dateCreated(): OffsetDateTime? = dateCreated

        /** The project last updated date. */
        @JsonProperty("dateUpdated") fun dateUpdated(): OffsetDateTime? = dateUpdated

        /** The project description. */
        @JsonProperty("description") fun description(): String? = description

        /** The source of the project. */
        @JsonProperty("source") fun source(): Source? = source

        /** The task type of the project. */
        @JsonProperty("taskType") fun taskType(): TaskType? = taskType

        /** The number of versions (commits) in the project. */
        @JsonProperty("versionCount") fun versionCount(): Long? = versionCount

        /** The number of inference pipelines in the project. */
        @JsonProperty("inferencePipelineCount")
        fun inferencePipelineCount(): Long? = inferencePipelineCount

        /** The total number of tests in the project. */
        @JsonProperty("goalCount") fun goalCount(): Long? = goalCount

        /** The number of tests in the development mode of the project. */
        @JsonProperty("developmentGoalCount")
        fun developmentGoalCount(): Long? = developmentGoalCount

        /** The number of tests in the monitoring mode of the project. */
        @JsonProperty("monitoringGoalCount") fun monitoringGoalCount(): Long? = monitoringGoalCount

        /** Links to the project. */
        @JsonProperty("links") fun links(): Links? = links

        @JsonProperty("gitRepo") fun gitRepo(): GitRepo? = gitRepo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var workspaceId: String? = null
            private var creatorId: String? = null
            private var name: String? = null
            private var dateCreated: OffsetDateTime? = null
            private var dateUpdated: OffsetDateTime? = null
            private var description: String? = null
            private var source: Source? = null
            private var taskType: TaskType? = null
            private var versionCount: Long? = null
            private var inferencePipelineCount: Long? = null
            private var goalCount: Long? = null
            private var developmentGoalCount: Long? = null
            private var monitoringGoalCount: Long? = null
            private var links: Links? = null
            private var gitRepo: GitRepo? = null
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
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** The workspace id. */
            @JsonProperty("workspaceId")
            fun workspaceId(workspaceId: String) = apply { this.workspaceId = workspaceId }

            /** The project creator id. */
            @JsonProperty("creatorId")
            fun creatorId(creatorId: String) = apply { this.creatorId = creatorId }

            /** The project name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The project creation date. */
            @JsonProperty("dateCreated")
            fun dateCreated(dateCreated: OffsetDateTime) = apply { this.dateCreated = dateCreated }

            /** The project last updated date. */
            @JsonProperty("dateUpdated")
            fun dateUpdated(dateUpdated: OffsetDateTime) = apply { this.dateUpdated = dateUpdated }

            /** The project description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The source of the project. */
            @JsonProperty("source") fun source(source: Source) = apply { this.source = source }

            /** The task type of the project. */
            @JsonProperty("taskType")
            fun taskType(taskType: TaskType) = apply { this.taskType = taskType }

            /** The number of versions (commits) in the project. */
            @JsonProperty("versionCount")
            fun versionCount(versionCount: Long) = apply { this.versionCount = versionCount }

            /** The number of inference pipelines in the project. */
            @JsonProperty("inferencePipelineCount")
            fun inferencePipelineCount(inferencePipelineCount: Long) = apply {
                this.inferencePipelineCount = inferencePipelineCount
            }

            /** The total number of tests in the project. */
            @JsonProperty("goalCount")
            fun goalCount(goalCount: Long) = apply { this.goalCount = goalCount }

            /** The number of tests in the development mode of the project. */
            @JsonProperty("developmentGoalCount")
            fun developmentGoalCount(developmentGoalCount: Long) = apply {
                this.developmentGoalCount = developmentGoalCount
            }

            /** The number of tests in the monitoring mode of the project. */
            @JsonProperty("monitoringGoalCount")
            fun monitoringGoalCount(monitoringGoalCount: Long) = apply {
                this.monitoringGoalCount = monitoringGoalCount
            }

            /** Links to the project. */
            @JsonProperty("links") fun links(links: Links) = apply { this.links = links }

            @JsonProperty("gitRepo")
            fun gitRepo(gitRepo: GitRepo) = apply { this.gitRepo = gitRepo }

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
                    checkNotNull(id) { "`id` is required but was not set" },
                    workspaceId,
                    creatorId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(dateCreated) { "`dateCreated` is required but was not set" },
                    checkNotNull(dateUpdated) { "`dateUpdated` is required but was not set" },
                    description,
                    source,
                    checkNotNull(taskType) { "`taskType` is required but was not set" },
                    checkNotNull(versionCount) { "`versionCount` is required but was not set" },
                    checkNotNull(inferencePipelineCount) {
                        "`inferencePipelineCount` is required but was not set"
                    },
                    checkNotNull(goalCount) { "`goalCount` is required but was not set" },
                    checkNotNull(developmentGoalCount) {
                        "`developmentGoalCount` is required but was not set"
                    },
                    checkNotNull(monitoringGoalCount) {
                        "`monitoringGoalCount` is required but was not set"
                    },
                    checkNotNull(links) { "`links` is required but was not set" },
                    gitRepo,
                    additionalProperties.toImmutable(),
                )
        }

        /** Links to the project. */
        @JsonDeserialize(builder = Links.Builder::class)
        @NoAutoDetect
        class Links
        private constructor(
            private val app: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("app") fun app(): String? = app

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var app: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    this.app = links.app
                    additionalProperties(links.additionalProperties)
                }

                @JsonProperty("app") fun app(app: String) = apply { this.app = app }

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

                fun build(): Links =
                    Links(
                        checkNotNull(app) { "`app` is required but was not set" },
                        additionalProperties.toImmutable()
                    )
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
            private val id: String?,
            private val gitId: Long?,
            private val dateConnected: OffsetDateTime?,
            private val dateUpdated: OffsetDateTime?,
            private val branch: String?,
            private val name: String?,
            private val private_: Boolean?,
            private val slug: String?,
            private val url: String?,
            private val rootDir: String?,
            private val projectId: String?,
            private val gitAccountId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("id") fun id(): String? = id

            @JsonProperty("gitId") fun gitId(): Long? = gitId

            @JsonProperty("dateConnected") fun dateConnected(): OffsetDateTime? = dateConnected

            @JsonProperty("dateUpdated") fun dateUpdated(): OffsetDateTime? = dateUpdated

            @JsonProperty("branch") fun branch(): String? = branch

            @JsonProperty("name") fun name(): String? = name

            @JsonProperty("private") fun private_(): Boolean? = private_

            @JsonProperty("slug") fun slug(): String? = slug

            @JsonProperty("url") fun url(): String? = url

            @JsonProperty("rootDir") fun rootDir(): String? = rootDir

            @JsonProperty("projectId") fun projectId(): String? = projectId

            @JsonProperty("gitAccountId") fun gitAccountId(): String? = gitAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var gitId: Long? = null
                private var dateConnected: OffsetDateTime? = null
                private var dateUpdated: OffsetDateTime? = null
                private var branch: String? = null
                private var name: String? = null
                private var private_: Boolean? = null
                private var slug: String? = null
                private var url: String? = null
                private var rootDir: String? = null
                private var projectId: String? = null
                private var gitAccountId: String? = null
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

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                @JsonProperty("gitId") fun gitId(gitId: Long) = apply { this.gitId = gitId }

                @JsonProperty("dateConnected")
                fun dateConnected(dateConnected: OffsetDateTime) = apply {
                    this.dateConnected = dateConnected
                }

                @JsonProperty("dateUpdated")
                fun dateUpdated(dateUpdated: OffsetDateTime) = apply {
                    this.dateUpdated = dateUpdated
                }

                @JsonProperty("branch") fun branch(branch: String) = apply { this.branch = branch }

                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                @JsonProperty("private")
                fun private_(private_: Boolean) = apply { this.private_ = private_ }

                @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

                @JsonProperty("url") fun url(url: String) = apply { this.url = url }

                @JsonProperty("rootDir")
                fun rootDir(rootDir: String) = apply { this.rootDir = rootDir }

                @JsonProperty("projectId")
                fun projectId(projectId: String) = apply { this.projectId = projectId }

                @JsonProperty("gitAccountId")
                fun gitAccountId(gitAccountId: String) = apply { this.gitAccountId = gitAccountId }

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
                        checkNotNull(id) { "`id` is required but was not set" },
                        checkNotNull(gitId) { "`gitId` is required but was not set" },
                        checkNotNull(dateConnected) {
                            "`dateConnected` is required but was not set"
                        },
                        checkNotNull(dateUpdated) { "`dateUpdated` is required but was not set" },
                        branch,
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(private_) { "`private_` is required but was not set" },
                        checkNotNull(slug) { "`slug` is required but was not set" },
                        checkNotNull(url) { "`url` is required but was not set" },
                        rootDir,
                        checkNotNull(projectId) { "`projectId` is required but was not set" },
                        checkNotNull(gitAccountId) { "`gitAccountId` is required but was not set" },
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
        private val id: String?,
        private val name: String?,
        private val slug: String?,
        private val dateCreated: OffsetDateTime?,
        private val dateUpdated: OffsetDateTime?,
        private val creatorId: String?,
        private val inviteCode: String?,
        private val wildcardDomains: List<String>?,
        private val projectCount: Long?,
        private val memberCount: Long?,
        private val monthlyUsage: List<MonthlyUsage>?,
        private val inviteCount: Long?,
        private val periodStartDate: OffsetDateTime?,
        private val periodEndDate: OffsetDateTime?,
        private val samlOnlyAccess: Boolean?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The workspace id. */
        @JsonProperty("id") fun id(): String? = id

        /** The workspace name. */
        @JsonProperty("name") fun name(): String? = name

        /** The workspace slug. */
        @JsonProperty("slug") fun slug(): String? = slug

        /** The workspace creation date. */
        @JsonProperty("dateCreated") fun dateCreated(): OffsetDateTime? = dateCreated

        /** The workspace last updated date. */
        @JsonProperty("dateUpdated") fun dateUpdated(): OffsetDateTime? = dateUpdated

        /** The workspace creator id. */
        @JsonProperty("creatorId") fun creatorId(): String? = creatorId

        /** The workspace invite code. */
        @JsonProperty("inviteCode") fun inviteCode(): String? = inviteCode

        @JsonProperty("wildcardDomains") fun wildcardDomains(): List<String>? = wildcardDomains

        /** The number of projects in the workspace. */
        @JsonProperty("projectCount") fun projectCount(): Long? = projectCount

        /** The number of members in the workspace. */
        @JsonProperty("memberCount") fun memberCount(): Long? = memberCount

        @JsonProperty("monthlyUsage") fun monthlyUsage(): List<MonthlyUsage>? = monthlyUsage

        /** The number of invites in the workspace. */
        @JsonProperty("inviteCount") fun inviteCount(): Long? = inviteCount

        /** The start date of the current billing period. */
        @JsonProperty("periodStartDate") fun periodStartDate(): OffsetDateTime? = periodStartDate

        /** The end date of the current billing period. */
        @JsonProperty("periodEndDate") fun periodEndDate(): OffsetDateTime? = periodEndDate

        /** Whether the workspace only allows SAML authentication. */
        @JsonProperty("samlOnlyAccess") fun samlOnlyAccess(): Boolean? = samlOnlyAccess

        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var name: String? = null
            private var slug: String? = null
            private var dateCreated: OffsetDateTime? = null
            private var dateUpdated: OffsetDateTime? = null
            private var creatorId: String? = null
            private var inviteCode: String? = null
            private var wildcardDomains: List<String>? = null
            private var projectCount: Long? = null
            private var memberCount: Long? = null
            private var monthlyUsage: List<MonthlyUsage>? = null
            private var inviteCount: Long? = null
            private var periodStartDate: OffsetDateTime? = null
            private var periodEndDate: OffsetDateTime? = null
            private var samlOnlyAccess: Boolean? = null
            private var status: Status? = null
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

            /** The workspace id. */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** The workspace name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The workspace slug. */
            @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

            /** The workspace creation date. */
            @JsonProperty("dateCreated")
            fun dateCreated(dateCreated: OffsetDateTime) = apply { this.dateCreated = dateCreated }

            /** The workspace last updated date. */
            @JsonProperty("dateUpdated")
            fun dateUpdated(dateUpdated: OffsetDateTime) = apply { this.dateUpdated = dateUpdated }

            /** The workspace creator id. */
            @JsonProperty("creatorId")
            fun creatorId(creatorId: String) = apply { this.creatorId = creatorId }

            /** The workspace invite code. */
            @JsonProperty("inviteCode")
            fun inviteCode(inviteCode: String) = apply { this.inviteCode = inviteCode }

            @JsonProperty("wildcardDomains")
            fun wildcardDomains(wildcardDomains: List<String>) = apply {
                this.wildcardDomains = wildcardDomains
            }

            /** The number of projects in the workspace. */
            @JsonProperty("projectCount")
            fun projectCount(projectCount: Long) = apply { this.projectCount = projectCount }

            /** The number of members in the workspace. */
            @JsonProperty("memberCount")
            fun memberCount(memberCount: Long) = apply { this.memberCount = memberCount }

            @JsonProperty("monthlyUsage")
            fun monthlyUsage(monthlyUsage: List<MonthlyUsage>) = apply {
                this.monthlyUsage = monthlyUsage
            }

            /** The number of invites in the workspace. */
            @JsonProperty("inviteCount")
            fun inviteCount(inviteCount: Long) = apply { this.inviteCount = inviteCount }

            /** The start date of the current billing period. */
            @JsonProperty("periodStartDate")
            fun periodStartDate(periodStartDate: OffsetDateTime) = apply {
                this.periodStartDate = periodStartDate
            }

            /** The end date of the current billing period. */
            @JsonProperty("periodEndDate")
            fun periodEndDate(periodEndDate: OffsetDateTime) = apply {
                this.periodEndDate = periodEndDate
            }

            /** Whether the workspace only allows SAML authentication. */
            @JsonProperty("samlOnlyAccess")
            fun samlOnlyAccess(samlOnlyAccess: Boolean) = apply {
                this.samlOnlyAccess = samlOnlyAccess
            }

            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(slug) { "`slug` is required but was not set" },
                    checkNotNull(dateCreated) { "`dateCreated` is required but was not set" },
                    checkNotNull(dateUpdated) { "`dateUpdated` is required but was not set" },
                    creatorId,
                    inviteCode,
                    wildcardDomains?.toImmutable(),
                    checkNotNull(projectCount) { "`projectCount` is required but was not set" },
                    checkNotNull(memberCount) { "`memberCount` is required but was not set" },
                    monthlyUsage?.toImmutable(),
                    checkNotNull(inviteCount) { "`inviteCount` is required but was not set" },
                    periodStartDate,
                    periodEndDate,
                    samlOnlyAccess,
                    checkNotNull(status) { "`status` is required but was not set" },
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
            private val monthYear: LocalDate?,
            private val predictionCount: Long?,
            private val executionTimeMs: Long?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("monthYear") fun monthYear(): LocalDate? = monthYear

            @JsonProperty("predictionCount") fun predictionCount(): Long? = predictionCount

            @JsonProperty("executionTimeMs") fun executionTimeMs(): Long? = executionTimeMs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var monthYear: LocalDate? = null
                private var predictionCount: Long? = null
                private var executionTimeMs: Long? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(monthlyUsage: MonthlyUsage) = apply {
                    this.monthYear = monthlyUsage.monthYear
                    this.predictionCount = monthlyUsage.predictionCount
                    this.executionTimeMs = monthlyUsage.executionTimeMs
                    additionalProperties(monthlyUsage.additionalProperties)
                }

                @JsonProperty("monthYear")
                fun monthYear(monthYear: LocalDate) = apply { this.monthYear = monthYear }

                @JsonProperty("predictionCount")
                fun predictionCount(predictionCount: Long) = apply {
                    this.predictionCount = predictionCount
                }

                @JsonProperty("executionTimeMs")
                fun executionTimeMs(executionTimeMs: Long) = apply {
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

        return /* spotless:off */ other is ProjectInferencePipelineCreateParams && projectId == other.projectId && description == other.description && name == other.name && project == other.project && workspace == other.workspace && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, description, name, project, workspace, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ProjectInferencePipelineCreateParams{projectId=$projectId, description=$description, name=$name, project=$project, workspace=$workspace, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
