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
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProjectListResponse.Builder::class)
@NoAutoDetect
class ProjectListResponse
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun items(): List<Item> = items.getRequired("items")

    @JsonProperty("items") @ExcludeMissing fun _items() = items

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectListResponse = apply {
        if (!validated) {
            items().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectListResponse: ProjectListResponse) = apply {
            this.items = projectListResponse.items
            additionalProperties(projectListResponse.additionalProperties)
        }

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

        fun build(): ProjectListResponse =
            ProjectListResponse(
                items.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(builder = Item.Builder::class)
    @NoAutoDetect
    class Item
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

        fun validate(): Item = apply {
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
            internal fun from(item: Item) = apply {
                this.id = item.id
                this.workspaceId = item.workspaceId
                this.creatorId = item.creatorId
                this.name = item.name
                this.dateCreated = item.dateCreated
                this.dateUpdated = item.dateUpdated
                this.description = item.description
                this.source = item.source
                this.taskType = item.taskType
                this.versionCount = item.versionCount
                this.inferencePipelineCount = item.inferencePipelineCount
                this.goalCount = item.goalCount
                this.developmentGoalCount = item.developmentGoalCount
                this.monitoringGoalCount = item.monitoringGoalCount
                this.links = item.links
                this.gitRepo = item.gitRepo
                additionalProperties(item.additionalProperties)
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

            fun build(): Item =
                Item(
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
                    additionalProperties.toUnmodifiable(),
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

                fun build(): Links = Links(app, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Links && this.app == other.app && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(app, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
        }

        class Source
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Source && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val WEB = Source(JsonField.of("web"))

                @JvmField val API = Source(JsonField.of("api"))

                @JvmField val NULL = Source(JsonField.of("null"))

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
        }

        class TaskType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaskType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val LLM_BASE = TaskType(JsonField.of("llm-base"))

                @JvmField
                val TABULAR_CLASSIFICATION = TaskType(JsonField.of("tabular-classification"))

                @JvmField val TABULAR_REGRESSION = TaskType(JsonField.of("tabular-regression"))

                @JvmField val TEXT_CLASSIFICATION = TaskType(JsonField.of("text-classification"))

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
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GitRepo && this.id == other.id && this.gitId == other.gitId && this.dateConnected == other.dateConnected && this.dateUpdated == other.dateUpdated && this.branch == other.branch && this.name == other.name && this.private_ == other.private_ && this.slug == other.slug && this.url == other.url && this.rootDir == other.rootDir && this.projectId == other.projectId && this.gitAccountId == other.gitAccountId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, gitId, dateConnected, dateUpdated, branch, name, private_, slug, url, rootDir, projectId, gitAccountId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GitRepo{id=$id, gitId=$gitId, dateConnected=$dateConnected, dateUpdated=$dateUpdated, branch=$branch, name=$name, private_=$private_, slug=$slug, url=$url, rootDir=$rootDir, projectId=$projectId, gitAccountId=$gitAccountId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Item && this.id == other.id && this.workspaceId == other.workspaceId && this.creatorId == other.creatorId && this.name == other.name && this.dateCreated == other.dateCreated && this.dateUpdated == other.dateUpdated && this.description == other.description && this.source == other.source && this.taskType == other.taskType && this.versionCount == other.versionCount && this.inferencePipelineCount == other.inferencePipelineCount && this.goalCount == other.goalCount && this.developmentGoalCount == other.developmentGoalCount && this.monitoringGoalCount == other.monitoringGoalCount && this.links == other.links && this.gitRepo == other.gitRepo && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, workspaceId, creatorId, name, dateCreated, dateUpdated, description, source, taskType, versionCount, inferencePipelineCount, goalCount, developmentGoalCount, monitoringGoalCount, links, gitRepo, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Item{id=$id, workspaceId=$workspaceId, creatorId=$creatorId, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, source=$source, taskType=$taskType, versionCount=$versionCount, inferencePipelineCount=$inferencePipelineCount, goalCount=$goalCount, developmentGoalCount=$developmentGoalCount, monitoringGoalCount=$monitoringGoalCount, links=$links, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectListResponse && this.items == other.items && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectListResponse{items=$items, additionalProperties=$additionalProperties}"
}
