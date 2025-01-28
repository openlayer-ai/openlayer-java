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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ProjectCreateResponse
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
    @JsonProperty("links") @ExcludeMissing private val links: JsonField<Links> = JsonMissing.of(),
    @JsonProperty("monitoringGoalCount")
    @ExcludeMissing
    private val monitoringGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
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
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId(): JsonField<String> = workspaceId

    /** The project description. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo(): JsonField<GitRepo> = gitRepo

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectCreateResponse = apply {
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

    /** A builder for [ProjectCreateResponse]. */
    class Builder internal constructor() {

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
        internal fun from(projectCreateResponse: ProjectCreateResponse) = apply {
            id = projectCreateResponse.id
            creatorId = projectCreateResponse.creatorId
            dateCreated = projectCreateResponse.dateCreated
            dateUpdated = projectCreateResponse.dateUpdated
            developmentGoalCount = projectCreateResponse.developmentGoalCount
            goalCount = projectCreateResponse.goalCount
            inferencePipelineCount = projectCreateResponse.inferencePipelineCount
            links = projectCreateResponse.links
            monitoringGoalCount = projectCreateResponse.monitoringGoalCount
            name = projectCreateResponse.name
            source = projectCreateResponse.source
            taskType = projectCreateResponse.taskType
            versionCount = projectCreateResponse.versionCount
            workspaceId = projectCreateResponse.workspaceId
            description = projectCreateResponse.description
            gitRepo = projectCreateResponse.gitRepo
            additionalProperties = projectCreateResponse.additionalProperties.toMutableMap()
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
        fun versionCount(versionCount: JsonField<Long>) = apply { this.versionCount = versionCount }

        /** The workspace id. */
        fun workspaceId(workspaceId: String?) = workspaceId(JsonField.ofNullable(workspaceId))

        /** The workspace id. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.orElse(null))

        /** The workspace id. */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        /** The project description. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** The project description. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /** The project description. */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun build(): ProjectCreateResponse =
            ProjectCreateResponse(
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

        /** A builder for [Links]. */
        class Builder internal constructor() {

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

    /** The source of the project. */
    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WEB = of("web")

            @JvmField val API = of("api")

            @JvmField val NULL = of("null")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            WEB,
            API,
            NULL,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WEB,
            API,
            NULL,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WEB -> Value.WEB
                API -> Value.API
                NULL -> Value.NULL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LLM_BASE = of("llm-base")

            @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

            @JvmField val TABULAR_REGRESSION = of("tabular-regression")

            @JvmField val TEXT_CLASSIFICATION = of("text-classification")

            @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
        }

        /** An enum containing [TaskType]'s known values. */
        enum class Known {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
        }

        /**
         * An enum containing [TaskType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaskType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
            /** An enum member indicating that [TaskType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LLM_BASE -> Value.LLM_BASE
                TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
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

        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

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

        /** A builder for [GitRepo]. */
        class Builder internal constructor() {

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

            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return /* spotless:off */ other is ProjectCreateResponse && id == other.id && creatorId == other.creatorId && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && developmentGoalCount == other.developmentGoalCount && goalCount == other.goalCount && inferencePipelineCount == other.inferencePipelineCount && links == other.links && monitoringGoalCount == other.monitoringGoalCount && name == other.name && source == other.source && taskType == other.taskType && versionCount == other.versionCount && workspaceId == other.workspaceId && description == other.description && gitRepo == other.gitRepo && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, creatorId, dateCreated, dateUpdated, developmentGoalCount, goalCount, inferencePipelineCount, links, monitoringGoalCount, name, source, taskType, versionCount, workspaceId, description, gitRepo, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectCreateResponse{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, developmentGoalCount=$developmentGoalCount, goalCount=$goalCount, inferencePipelineCount=$inferencePipelineCount, links=$links, monitoringGoalCount=$monitoringGoalCount, name=$name, source=$source, taskType=$taskType, versionCount=$versionCount, workspaceId=$workspaceId, description=$description, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
}
