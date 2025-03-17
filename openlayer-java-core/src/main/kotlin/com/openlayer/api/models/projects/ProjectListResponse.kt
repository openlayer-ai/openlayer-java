// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

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
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class ProjectListResponse
@JsonCreator
private constructor(
    @JsonProperty("items")
    @ExcludeMissing
    private val items: JsonField<List<Item>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectListResponse: ProjectListResponse) = apply {
            items = projectListResponse.items.map { it.toMutableList() }
            additionalProperties = projectListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ProjectListResponse].
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
        fun build(): ProjectListResponse =
            ProjectListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Item
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

        /**
         * The project id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The project creator id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        /**
         * The project creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The project last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The number of tests in the development mode of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun developmentGoalCount(): Long = developmentGoalCount.getRequired("developmentGoalCount")

        /**
         * The total number of tests in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun goalCount(): Long = goalCount.getRequired("goalCount")

        /**
         * The number of inference pipelines in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inferencePipelineCount(): Long =
            inferencePipelineCount.getRequired("inferencePipelineCount")

        /**
         * Links to the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun links(): Links = links.getRequired("links")

        /**
         * The number of tests in the monitoring mode of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monitoringGoalCount(): Long = monitoringGoalCount.getRequired("monitoringGoalCount")

        /**
         * The project name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The source of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<Source> = Optional.ofNullable(source.getNullable("source"))

        /**
         * The task type of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskType(): TaskType = taskType.getRequired("taskType")

        /**
         * The number of versions (commits) in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun versionCount(): Long = versionCount.getRequired("versionCount")

        /**
         * The workspace id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> =
            Optional.ofNullable(workspaceId.getNullable("workspaceId"))

        /**
         * The project description.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitRepo(): Optional<GitRepo> = Optional.ofNullable(gitRepo.getNullable("gitRepo"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creatorId].
         *
         * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [developmentGoalCount].
         *
         * Unlike [developmentGoalCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("developmentGoalCount")
        @ExcludeMissing
        fun _developmentGoalCount(): JsonField<Long> = developmentGoalCount

        /**
         * Returns the raw JSON value of [goalCount].
         *
         * Unlike [goalCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("goalCount") @ExcludeMissing fun _goalCount(): JsonField<Long> = goalCount

        /**
         * Returns the raw JSON value of [inferencePipelineCount].
         *
         * Unlike [inferencePipelineCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inferencePipelineCount")
        @ExcludeMissing
        fun _inferencePipelineCount(): JsonField<Long> = inferencePipelineCount

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [monitoringGoalCount].
         *
         * Unlike [monitoringGoalCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monitoringGoalCount")
        @ExcludeMissing
        fun _monitoringGoalCount(): JsonField<Long> = monitoringGoalCount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [taskType].
         *
         * Unlike [taskType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskType") @ExcludeMissing fun _taskType(): JsonField<TaskType> = taskType

        /**
         * Returns the raw JSON value of [versionCount].
         *
         * Unlike [versionCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("versionCount")
        @ExcludeMissing
        fun _versionCount(): JsonField<Long> = versionCount

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [gitRepo].
         *
         * Unlike [gitRepo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo(): JsonField<GitRepo> = gitRepo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Item = apply {
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

            /**
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .developmentGoalCount()
             * .goalCount()
             * .inferencePipelineCount()
             * .links()
             * .monitoringGoalCount()
             * .name()
             * .source()
             * .taskType()
             * .versionCount()
             * .workspaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
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
            internal fun from(item: Item) = apply {
                id = item.id
                creatorId = item.creatorId
                dateCreated = item.dateCreated
                dateUpdated = item.dateUpdated
                developmentGoalCount = item.developmentGoalCount
                goalCount = item.goalCount
                inferencePipelineCount = item.inferencePipelineCount
                links = item.links
                monitoringGoalCount = item.monitoringGoalCount
                name = item.name
                source = item.source
                taskType = item.taskType
                versionCount = item.versionCount
                workspaceId = item.workspaceId
                description = item.description
                gitRepo = item.gitRepo
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The project id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The project creator id. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

            /**
             * Sets [Builder.creatorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The project creation date. */
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

            /** The project last updated date. */
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

            /** The number of tests in the development mode of the project. */
            fun developmentGoalCount(developmentGoalCount: Long) =
                developmentGoalCount(JsonField.of(developmentGoalCount))

            /**
             * Sets [Builder.developmentGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.developmentGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun developmentGoalCount(developmentGoalCount: JsonField<Long>) = apply {
                this.developmentGoalCount = developmentGoalCount
            }

            /** The total number of tests in the project. */
            fun goalCount(goalCount: Long) = goalCount(JsonField.of(goalCount))

            /**
             * Sets [Builder.goalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.goalCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun goalCount(goalCount: JsonField<Long>) = apply { this.goalCount = goalCount }

            /** The number of inference pipelines in the project. */
            fun inferencePipelineCount(inferencePipelineCount: Long) =
                inferencePipelineCount(JsonField.of(inferencePipelineCount))

            /**
             * Sets [Builder.inferencePipelineCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inferencePipelineCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inferencePipelineCount(inferencePipelineCount: JsonField<Long>) = apply {
                this.inferencePipelineCount = inferencePipelineCount
            }

            /** Links to the project. */
            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** The number of tests in the monitoring mode of the project. */
            fun monitoringGoalCount(monitoringGoalCount: Long) =
                monitoringGoalCount(JsonField.of(monitoringGoalCount))

            /**
             * Sets [Builder.monitoringGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monitoringGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monitoringGoalCount(monitoringGoalCount: JsonField<Long>) = apply {
                this.monitoringGoalCount = monitoringGoalCount
            }

            /** The project name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The source of the project. */
            fun source(source: Source?) = source(JsonField.ofNullable(source))

            /** Alias for calling [Builder.source] with `source.orElse(null)`. */
            fun source(source: Optional<Source>) = source(source.getOrNull())

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The task type of the project. */
            fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

            /**
             * Sets [Builder.taskType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskType] with a well-typed [TaskType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

            /** The number of versions (commits) in the project. */
            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            /**
             * Sets [Builder.versionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.versionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            /** The workspace id. */
            fun workspaceId(workspaceId: String?) = workspaceId(JsonField.ofNullable(workspaceId))

            /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
            fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

            /** The project description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun gitRepo(gitRepo: GitRepo?) = gitRepo(JsonField.ofNullable(gitRepo))

            /** Alias for calling [Builder.gitRepo] with `gitRepo.orElse(null)`. */
            fun gitRepo(gitRepo: Optional<GitRepo>) = gitRepo(gitRepo.getOrNull())

            /**
             * Sets [Builder.gitRepo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitRepo] with a well-typed [GitRepo] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .developmentGoalCount()
             * .goalCount()
             * .inferencePipelineCount()
             * .links()
             * .monitoringGoalCount()
             * .name()
             * .source()
             * .taskType()
             * .versionCount()
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
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

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun app(): String = app.getRequired("app")

            /**
             * Returns the raw JSON value of [app].
             *
             * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
             */
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

                /**
                 * Returns a mutable builder for constructing an instance of [Links].
                 *
                 * The following fields are required:
                 * ```java
                 * .app()
                 * ```
                 */
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

                /**
                 * Sets [Builder.app] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.app] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Links].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .app()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEB,
                API,
                NULL,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    WEB -> Value.WEB
                    API -> Value.API
                    NULL -> Value.NULL
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
                    WEB -> Known.WEB
                    API -> Known.API
                    NULL -> Known.NULL
                    else -> throw OpenlayerInvalidDataException("Unknown Source: $value")
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

                return /* spotless:off */ other is Source && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The task type of the project. */
        class TaskType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LLM_BASE,
                TABULAR_CLASSIFICATION,
                TABULAR_REGRESSION,
                TEXT_CLASSIFICATION,
                /**
                 * An enum member indicating that [TaskType] was instantiated with an unknown value.
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
                    LLM_BASE -> Value.LLM_BASE
                    TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
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
                    LLM_BASE -> Known.LLM_BASE
                    TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                    else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
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

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateConnected(): OffsetDateTime = dateConnected.getRequired("dateConnected")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gitAccountId(): String = gitAccountId.getRequired("gitAccountId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gitId(): Long = gitId.getRequired("gitId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun private_(): Boolean = private_.getRequired("private")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectId(): String = projectId.getRequired("projectId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun slug(): String = slug.getRequired("slug")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun branch(): Optional<String> = Optional.ofNullable(branch.getNullable("branch"))

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rootDir(): Optional<String> = Optional.ofNullable(rootDir.getNullable("rootDir"))

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [dateConnected].
             *
             * Unlike [dateConnected], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateConnected")
            @ExcludeMissing
            fun _dateConnected(): JsonField<OffsetDateTime> = dateConnected

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
             * Returns the raw JSON value of [gitAccountId].
             *
             * Unlike [gitAccountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gitAccountId")
            @ExcludeMissing
            fun _gitAccountId(): JsonField<String> = gitAccountId

            /**
             * Returns the raw JSON value of [gitId].
             *
             * Unlike [gitId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gitId") @ExcludeMissing fun _gitId(): JsonField<Long> = gitId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [private_].
             *
             * Unlike [private_], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private") @ExcludeMissing fun _private_(): JsonField<Boolean> = private_

            /**
             * Returns the raw JSON value of [projectId].
             *
             * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            /**
             * Returns the raw JSON value of [slug].
             *
             * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [branch].
             *
             * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

            /**
             * Returns the raw JSON value of [rootDir].
             *
             * Unlike [rootDir], this method doesn't throw if the JSON field has an unexpected type.
             */
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

                /**
                 * Returns a mutable builder for constructing an instance of [GitRepo].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .dateConnected()
                 * .dateUpdated()
                 * .gitAccountId()
                 * .gitId()
                 * .name()
                 * .private_()
                 * .projectId()
                 * .slug()
                 * .url()
                 * ```
                 */
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

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun dateConnected(dateConnected: OffsetDateTime) =
                    dateConnected(JsonField.of(dateConnected))

                /**
                 * Sets [Builder.dateConnected] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateConnected] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun dateConnected(dateConnected: JsonField<OffsetDateTime>) = apply {
                    this.dateConnected = dateConnected
                }

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

                fun gitAccountId(gitAccountId: String) = gitAccountId(JsonField.of(gitAccountId))

                /**
                 * Sets [Builder.gitAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gitAccountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gitAccountId(gitAccountId: JsonField<String>) = apply {
                    this.gitAccountId = gitAccountId
                }

                fun gitId(gitId: Long) = gitId(JsonField.of(gitId))

                /**
                 * Sets [Builder.gitId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gitId] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun gitId(gitId: JsonField<Long>) = apply { this.gitId = gitId }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun private_(private_: Boolean) = private_(JsonField.of(private_))

                /**
                 * Sets [Builder.private_] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.private_] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                fun slug(slug: String) = slug(JsonField.of(slug))

                /**
                 * Sets [Builder.slug] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slug] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun branch(branch: String) = branch(JsonField.of(branch))

                /**
                 * Sets [Builder.branch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.branch] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun branch(branch: JsonField<String>) = apply { this.branch = branch }

                fun rootDir(rootDir: String) = rootDir(JsonField.of(rootDir))

                /**
                 * Sets [Builder.rootDir] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rootDir] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [GitRepo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .dateConnected()
                 * .dateUpdated()
                 * .gitAccountId()
                 * .gitId()
                 * .name()
                 * .private_()
                 * .projectId()
                 * .slug()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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

            return /* spotless:off */ other is Item && id == other.id && creatorId == other.creatorId && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && developmentGoalCount == other.developmentGoalCount && goalCount == other.goalCount && inferencePipelineCount == other.inferencePipelineCount && links == other.links && monitoringGoalCount == other.monitoringGoalCount && name == other.name && source == other.source && taskType == other.taskType && versionCount == other.versionCount && workspaceId == other.workspaceId && description == other.description && gitRepo == other.gitRepo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creatorId, dateCreated, dateUpdated, developmentGoalCount, goalCount, inferencePipelineCount, links, monitoringGoalCount, name, source, taskType, versionCount, workspaceId, description, gitRepo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, developmentGoalCount=$developmentGoalCount, goalCount=$goalCount, inferencePipelineCount=$inferencePipelineCount, links=$links, monitoringGoalCount=$monitoringGoalCount, name=$name, source=$source, taskType=$taskType, versionCount=$versionCount, workspaceId=$workspaceId, description=$description, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectListResponse && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectListResponse{items=$items, additionalProperties=$additionalProperties}"
}
