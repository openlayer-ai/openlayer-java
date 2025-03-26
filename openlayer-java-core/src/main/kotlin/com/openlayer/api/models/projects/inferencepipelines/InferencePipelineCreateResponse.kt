// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.inferencepipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InferencePipelineCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateLastEvaluated: JsonField<OffsetDateTime>,
    private val dateLastSampleReceived: JsonField<OffsetDateTime>,
    private val dateOfNextEvaluation: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val failingGoalCount: JsonField<Long>,
    private val links: JsonField<Links>,
    private val name: JsonField<String>,
    private val passingGoalCount: JsonField<Long>,
    private val projectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val statusMessage: JsonField<String>,
    private val totalGoalCount: JsonField<Long>,
    private val project: JsonField<Project>,
    private val workspace: JsonField<Workspace>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateLastEvaluated")
        @ExcludeMissing
        dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateLastSampleReceived")
        @ExcludeMissing
        dateLastSampleReceived: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failingGoalCount")
        @ExcludeMissing
        failingGoalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("passingGoalCount")
        @ExcludeMissing
        passingGoalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("projectId") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("statusMessage")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalGoalCount")
        @ExcludeMissing
        totalGoalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("project") @ExcludeMissing project: JsonField<Project> = JsonMissing.of(),
        @JsonProperty("workspace")
        @ExcludeMissing
        workspace: JsonField<Workspace> = JsonMissing.of(),
        @JsonProperty("workspaceId")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        dateCreated,
        dateLastEvaluated,
        dateLastSampleReceived,
        dateOfNextEvaluation,
        dateUpdated,
        description,
        failingGoalCount,
        links,
        name,
        passingGoalCount,
        projectId,
        status,
        statusMessage,
        totalGoalCount,
        project,
        workspace,
        workspaceId,
        mutableMapOf(),
    )

    /**
     * The inference pipeline id.
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
     * The last test evaluation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastEvaluated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastEvaluated.getNullable("dateLastEvaluated"))

    /**
     * The last data sample received date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastSampleReceived(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateLastSampleReceived.getNullable("dateLastSampleReceived"))

    /**
     * The next test evaluation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateOfNextEvaluation.getNullable("dateOfNextEvaluation"))

    /**
     * The last updated date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /**
     * The inference pipeline description.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The number of tests failing.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): Links = links.getRequired("links")

    /**
     * The inference pipeline name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The number of tests passing.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

    /**
     * The project id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectId(): String = projectId.getRequired("projectId")

    /**
     * The status of test evaluation for the inference pipeline.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The status message of test evaluation for the inference pipeline.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    /**
     * The total number of tests.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<Project> = Optional.ofNullable(project.getNullable("project"))

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspace(): Optional<Workspace> = Optional.ofNullable(workspace.getNullable("workspace"))

    /**
     * The workspace id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceId(): Optional<String> =
        Optional.ofNullable(workspaceId.getNullable("workspaceId"))

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
     * Returns the raw JSON value of [dateLastEvaluated].
     *
     * Unlike [dateLastEvaluated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dateLastEvaluated")
    @ExcludeMissing
    fun _dateLastEvaluated(): JsonField<OffsetDateTime> = dateLastEvaluated

    /**
     * Returns the raw JSON value of [dateLastSampleReceived].
     *
     * Unlike [dateLastSampleReceived], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("dateLastSampleReceived")
    @ExcludeMissing
    fun _dateLastSampleReceived(): JsonField<OffsetDateTime> = dateLastSampleReceived

    /**
     * Returns the raw JSON value of [dateOfNextEvaluation].
     *
     * Unlike [dateOfNextEvaluation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dateOfNextEvaluation")
    @ExcludeMissing
    fun _dateOfNextEvaluation(): JsonField<OffsetDateTime> = dateOfNextEvaluation

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [failingGoalCount].
     *
     * Unlike [failingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("failingGoalCount")
    @ExcludeMissing
    fun _failingGoalCount(): JsonField<Long> = failingGoalCount

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [passingGoalCount].
     *
     * Unlike [passingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("passingGoalCount")
    @ExcludeMissing
    fun _passingGoalCount(): JsonField<Long> = passingGoalCount

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /**
     * Returns the raw JSON value of [totalGoalCount].
     *
     * Unlike [totalGoalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalGoalCount")
    @ExcludeMissing
    fun _totalGoalCount(): JsonField<Long> = totalGoalCount

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Project> = project

    /**
     * Returns the raw JSON value of [workspace].
     *
     * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace") @ExcludeMissing fun _workspace(): JsonField<Workspace> = workspace

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId(): JsonField<String> = workspaceId

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
         * [InferencePipelineCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastEvaluated()
         * .dateLastSampleReceived()
         * .dateOfNextEvaluation()
         * .dateUpdated()
         * .description()
         * .failingGoalCount()
         * .links()
         * .name()
         * .passingGoalCount()
         * .projectId()
         * .status()
         * .statusMessage()
         * .totalGoalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineCreateResponse]. */
    class Builder internal constructor() {

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
        internal fun from(inferencePipelineCreateResponse: InferencePipelineCreateResponse) =
            apply {
                id = inferencePipelineCreateResponse.id
                dateCreated = inferencePipelineCreateResponse.dateCreated
                dateLastEvaluated = inferencePipelineCreateResponse.dateLastEvaluated
                dateLastSampleReceived = inferencePipelineCreateResponse.dateLastSampleReceived
                dateOfNextEvaluation = inferencePipelineCreateResponse.dateOfNextEvaluation
                dateUpdated = inferencePipelineCreateResponse.dateUpdated
                description = inferencePipelineCreateResponse.description
                failingGoalCount = inferencePipelineCreateResponse.failingGoalCount
                links = inferencePipelineCreateResponse.links
                name = inferencePipelineCreateResponse.name
                passingGoalCount = inferencePipelineCreateResponse.passingGoalCount
                projectId = inferencePipelineCreateResponse.projectId
                status = inferencePipelineCreateResponse.status
                statusMessage = inferencePipelineCreateResponse.statusMessage
                totalGoalCount = inferencePipelineCreateResponse.totalGoalCount
                project = inferencePipelineCreateResponse.project
                workspace = inferencePipelineCreateResponse.workspace
                workspaceId = inferencePipelineCreateResponse.workspaceId
                additionalProperties =
                    inferencePipelineCreateResponse.additionalProperties.toMutableMap()
            }

        /** The inference pipeline id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime?) =
            dateLastEvaluated(JsonField.ofNullable(dateLastEvaluated))

        /** Alias for calling [Builder.dateLastEvaluated] with `dateLastEvaluated.orElse(null)`. */
        fun dateLastEvaluated(dateLastEvaluated: Optional<OffsetDateTime>) =
            dateLastEvaluated(dateLastEvaluated.getOrNull())

        /**
         * Sets [Builder.dateLastEvaluated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastEvaluated] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
            this.dateLastEvaluated = dateLastEvaluated
        }

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime?) =
            dateLastSampleReceived(JsonField.ofNullable(dateLastSampleReceived))

        /**
         * Alias for calling [Builder.dateLastSampleReceived] with
         * `dateLastSampleReceived.orElse(null)`.
         */
        fun dateLastSampleReceived(dateLastSampleReceived: Optional<OffsetDateTime>) =
            dateLastSampleReceived(dateLastSampleReceived.getOrNull())

        /**
         * Sets [Builder.dateLastSampleReceived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastSampleReceived] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
            this.dateLastSampleReceived = dateLastSampleReceived
        }

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime?) =
            dateOfNextEvaluation(JsonField.ofNullable(dateOfNextEvaluation))

        /**
         * Alias for calling [Builder.dateOfNextEvaluation] with
         * `dateOfNextEvaluation.orElse(null)`.
         */
        fun dateOfNextEvaluation(dateOfNextEvaluation: Optional<OffsetDateTime>) =
            dateOfNextEvaluation(dateOfNextEvaluation.getOrNull())

        /**
         * Sets [Builder.dateOfNextEvaluation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfNextEvaluation] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
            this.dateOfNextEvaluation = dateOfNextEvaluation
        }

        /** The last updated date. */
        fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The inference pipeline description. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The number of tests failing. */
        fun failingGoalCount(failingGoalCount: Long) =
            failingGoalCount(JsonField.of(failingGoalCount))

        /**
         * Sets [Builder.failingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            this.failingGoalCount = failingGoalCount
        }

        fun links(links: Links) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [Links] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<Links>) = apply { this.links = links }

        /** The inference pipeline name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The number of tests passing. */
        fun passingGoalCount(passingGoalCount: Long) =
            passingGoalCount(JsonField.of(passingGoalCount))

        /**
         * Sets [Builder.passingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            this.passingGoalCount = passingGoalCount
        }

        /** The project id. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** The status of test evaluation for the inference pipeline. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: String?) =
            statusMessage(JsonField.ofNullable(statusMessage))

        /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
        fun statusMessage(statusMessage: Optional<String>) =
            statusMessage(statusMessage.getOrNull())

        /**
         * Sets [Builder.statusMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        /** The total number of tests. */
        fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

        /**
         * Sets [Builder.totalGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalGoalCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            this.totalGoalCount = totalGoalCount
        }

        fun project(project: Project?) = project(JsonField.ofNullable(project))

        /** Alias for calling [Builder.project] with `project.orElse(null)`. */
        fun project(project: Optional<Project>) = project(project.getOrNull())

        /**
         * Sets [Builder.project] to an arbitrary JSON value.
         *
         * You should usually call [Builder.project] with a well-typed [Project] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun project(project: JsonField<Project>) = apply { this.project = project }

        fun workspace(workspace: Workspace?) = workspace(JsonField.ofNullable(workspace))

        /** Alias for calling [Builder.workspace] with `workspace.orElse(null)`. */
        fun workspace(workspace: Optional<Workspace>) = workspace(workspace.getOrNull())

        /**
         * Sets [Builder.workspace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspace] with a well-typed [Workspace] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

        /** The workspace id. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [InferencePipelineCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastEvaluated()
         * .dateLastSampleReceived()
         * .dateOfNextEvaluation()
         * .dateUpdated()
         * .description()
         * .failingGoalCount()
         * .links()
         * .name()
         * .passingGoalCount()
         * .projectId()
         * .status()
         * .statusMessage()
         * .totalGoalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferencePipelineCreateResponse =
            InferencePipelineCreateResponse(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferencePipelineCreateResponse = apply {
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

    class Links
    private constructor(
        private val app: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of()
        ) : this(app, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun app(): String = app.getRequired("app")

        /**
         * Returns the raw JSON value of [app].
         *
         * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

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
             * You should usually call [Builder.app] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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
                Links(checkRequired("app", app), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Links = apply {
            if (validated) {
                return@apply
            }

            app()
            validated = true
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
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val PAUSED = of("paused")

            @JvmField val FAILED = of("failed")

            @JvmField val COMPLETED = of("completed")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                PAUSED -> Value.PAUSED
                FAILED -> Value.FAILED
                COMPLETED -> Value.COMPLETED
                UNKNOWN -> Value.UNKNOWN
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
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                PAUSED -> Known.PAUSED
                FAILED -> Known.FAILED
                COMPLETED -> Known.COMPLETED
                UNKNOWN -> Known.UNKNOWN
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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

    class Project
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val developmentGoalCount: JsonField<Long>,
        private val goalCount: JsonField<Long>,
        private val inferencePipelineCount: JsonField<Long>,
        private val links: JsonField<Links>,
        private val monitoringGoalCount: JsonField<Long>,
        private val name: JsonField<String>,
        private val source: JsonField<Source>,
        private val taskType: JsonField<TaskType>,
        private val versionCount: JsonField<Long>,
        private val workspaceId: JsonField<String>,
        private val description: JsonField<String>,
        private val gitRepo: JsonField<GitRepo>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("developmentGoalCount")
            @ExcludeMissing
            developmentGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("goalCount")
            @ExcludeMissing
            goalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inferencePipelineCount")
            @ExcludeMissing
            inferencePipelineCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("monitoringGoalCount")
            @ExcludeMissing
            monitoringGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("taskType")
            @ExcludeMissing
            taskType: JsonField<TaskType> = JsonMissing.of(),
            @JsonProperty("versionCount")
            @ExcludeMissing
            versionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("workspaceId")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitRepo") @ExcludeMissing gitRepo: JsonField<GitRepo> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            developmentGoalCount,
            goalCount,
            inferencePipelineCount,
            links,
            monitoringGoalCount,
            name,
            source,
            taskType,
            versionCount,
            workspaceId,
            description,
            gitRepo,
            mutableMapOf(),
        )

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
             * Returns a mutable builder for constructing an instance of [Project].
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

        /** A builder for [Project]. */
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
             * Returns an immutable instance of [Project].
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
                    additionalProperties.toMutableMap(),
                )
        }

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

        /** Links to the project. */
        class Links
        private constructor(
            private val app: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of()
            ) : this(app, mutableMapOf())

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
                    Links(checkRequired("app", app), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                app()
                validated = true
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

        class GitRepo
        private constructor(
            private val id: JsonField<String>,
            private val dateConnected: JsonField<OffsetDateTime>,
            private val dateUpdated: JsonField<OffsetDateTime>,
            private val gitAccountId: JsonField<String>,
            private val gitId: JsonField<Long>,
            private val name: JsonField<String>,
            private val private_: JsonField<Boolean>,
            private val projectId: JsonField<String>,
            private val slug: JsonField<String>,
            private val url: JsonField<String>,
            private val branch: JsonField<String>,
            private val rootDir: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dateConnected")
                @ExcludeMissing
                dateConnected: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dateUpdated")
                @ExcludeMissing
                dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("gitAccountId")
                @ExcludeMissing
                gitAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gitId") @ExcludeMissing gitId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private")
                @ExcludeMissing
                private_: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("projectId")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("branch")
                @ExcludeMissing
                branch: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rootDir")
                @ExcludeMissing
                rootDir: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                dateConnected,
                dateUpdated,
                gitAccountId,
                gitId,
                name,
                private_,
                projectId,
                slug,
                url,
                branch,
                rootDir,
                mutableMapOf(),
            )

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
                        additionalProperties.toMutableMap(),
                    )
            }

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

    class Workspace
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val inviteCount: JsonField<Long>,
        private val memberCount: JsonField<Long>,
        private val name: JsonField<String>,
        private val periodEndDate: JsonField<OffsetDateTime>,
        private val periodStartDate: JsonField<OffsetDateTime>,
        private val projectCount: JsonField<Long>,
        private val slug: JsonField<String>,
        private val status: JsonField<Status>,
        private val inviteCode: JsonField<String>,
        private val monthlyUsage: JsonField<List<MonthlyUsage>>,
        private val samlOnlyAccess: JsonField<Boolean>,
        private val wildcardDomains: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inviteCount")
            @ExcludeMissing
            inviteCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("memberCount")
            @ExcludeMissing
            memberCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("periodEndDate")
            @ExcludeMissing
            periodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("periodStartDate")
            @ExcludeMissing
            periodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("projectCount")
            @ExcludeMissing
            projectCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("inviteCode")
            @ExcludeMissing
            inviteCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("monthlyUsage")
            @ExcludeMissing
            monthlyUsage: JsonField<List<MonthlyUsage>> = JsonMissing.of(),
            @JsonProperty("samlOnlyAccess")
            @ExcludeMissing
            samlOnlyAccess: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("wildcardDomains")
            @ExcludeMissing
            wildcardDomains: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            inviteCount,
            memberCount,
            name,
            periodEndDate,
            periodStartDate,
            projectCount,
            slug,
            status,
            inviteCode,
            monthlyUsage,
            samlOnlyAccess,
            wildcardDomains,
            mutableMapOf(),
        )

        /**
         * The workspace id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The workspace creator id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creatorId(): Optional<String> = Optional.ofNullable(creatorId.getNullable("creatorId"))

        /**
         * The workspace creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The workspace last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The number of invites in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inviteCount(): Long = inviteCount.getRequired("inviteCount")

        /**
         * The number of members in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memberCount(): Long = memberCount.getRequired("memberCount")

        /**
         * The workspace name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The end date of the current billing period.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodEndDate.getNullable("periodEndDate"))

        /**
         * The start date of the current billing period.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodStartDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(periodStartDate.getNullable("periodStartDate"))

        /**
         * The number of projects in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectCount(): Long = projectCount.getRequired("projectCount")

        /**
         * The workspace slug.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The workspace invite code.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inviteCode(): Optional<String> =
            Optional.ofNullable(inviteCode.getNullable("inviteCode"))

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun monthlyUsage(): Optional<List<MonthlyUsage>> =
            Optional.ofNullable(monthlyUsage.getNullable("monthlyUsage"))

        /**
         * Whether the workspace only allows SAML authentication.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun samlOnlyAccess(): Optional<Boolean> =
            Optional.ofNullable(samlOnlyAccess.getNullable("samlOnlyAccess"))

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wildcardDomains(): Optional<List<String>> =
            Optional.ofNullable(wildcardDomains.getNullable("wildcardDomains"))

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
         * Returns the raw JSON value of [inviteCount].
         *
         * Unlike [inviteCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inviteCount")
        @ExcludeMissing
        fun _inviteCount(): JsonField<Long> = inviteCount

        /**
         * Returns the raw JSON value of [memberCount].
         *
         * Unlike [memberCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memberCount")
        @ExcludeMissing
        fun _memberCount(): JsonField<Long> = memberCount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [periodEndDate].
         *
         * Unlike [periodEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("periodEndDate")
        @ExcludeMissing
        fun _periodEndDate(): JsonField<OffsetDateTime> = periodEndDate

        /**
         * Returns the raw JSON value of [periodStartDate].
         *
         * Unlike [periodStartDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("periodStartDate")
        @ExcludeMissing
        fun _periodStartDate(): JsonField<OffsetDateTime> = periodStartDate

        /**
         * Returns the raw JSON value of [projectCount].
         *
         * Unlike [projectCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectCount")
        @ExcludeMissing
        fun _projectCount(): JsonField<Long> = projectCount

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [inviteCode].
         *
         * Unlike [inviteCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inviteCode")
        @ExcludeMissing
        fun _inviteCode(): JsonField<String> = inviteCode

        /**
         * Returns the raw JSON value of [monthlyUsage].
         *
         * Unlike [monthlyUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthlyUsage")
        @ExcludeMissing
        fun _monthlyUsage(): JsonField<List<MonthlyUsage>> = monthlyUsage

        /**
         * Returns the raw JSON value of [samlOnlyAccess].
         *
         * Unlike [samlOnlyAccess], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("samlOnlyAccess")
        @ExcludeMissing
        fun _samlOnlyAccess(): JsonField<Boolean> = samlOnlyAccess

        /**
         * Returns the raw JSON value of [wildcardDomains].
         *
         * Unlike [wildcardDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wildcardDomains")
        @ExcludeMissing
        fun _wildcardDomains(): JsonField<List<String>> = wildcardDomains

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
             * Returns a mutable builder for constructing an instance of [Workspace].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .inviteCount()
             * .memberCount()
             * .name()
             * .periodEndDate()
             * .periodStartDate()
             * .projectCount()
             * .slug()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Workspace]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The workspace creator id. */
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

            /** The workspace creation date. */
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

            /** The workspace last updated date. */
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

            /** The number of invites in the workspace. */
            fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

            /**
             * Sets [Builder.inviteCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

            /** The number of members in the workspace. */
            fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

            /**
             * Sets [Builder.memberCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

            /** The workspace name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The end date of the current billing period. */
            fun periodEndDate(periodEndDate: OffsetDateTime?) =
                periodEndDate(JsonField.ofNullable(periodEndDate))

            /** Alias for calling [Builder.periodEndDate] with `periodEndDate.orElse(null)`. */
            fun periodEndDate(periodEndDate: Optional<OffsetDateTime>) =
                periodEndDate(periodEndDate.getOrNull())

            /**
             * Sets [Builder.periodEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodEndDate(periodEndDate: JsonField<OffsetDateTime>) = apply {
                this.periodEndDate = periodEndDate
            }

            /** The start date of the current billing period. */
            fun periodStartDate(periodStartDate: OffsetDateTime?) =
                periodStartDate(JsonField.ofNullable(periodStartDate))

            /** Alias for calling [Builder.periodStartDate] with `periodStartDate.orElse(null)`. */
            fun periodStartDate(periodStartDate: Optional<OffsetDateTime>) =
                periodStartDate(periodStartDate.getOrNull())

            /**
             * Sets [Builder.periodStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStartDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodStartDate(periodStartDate: JsonField<OffsetDateTime>) = apply {
                this.periodStartDate = periodStartDate
            }

            /** The number of projects in the workspace. */
            fun projectCount(projectCount: Long) = projectCount(JsonField.of(projectCount))

            /**
             * Sets [Builder.projectCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectCount(projectCount: JsonField<Long>) = apply {
                this.projectCount = projectCount
            }

            /** The workspace slug. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The workspace invite code. */
            fun inviteCode(inviteCode: String) = inviteCode(JsonField.of(inviteCode))

            /**
             * Sets [Builder.inviteCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteCode(inviteCode: JsonField<String>) = apply { this.inviteCode = inviteCode }

            fun monthlyUsage(monthlyUsage: List<MonthlyUsage>) =
                monthlyUsage(JsonField.of(monthlyUsage))

            /**
             * Sets [Builder.monthlyUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyUsage] with a well-typed `List<MonthlyUsage>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun monthlyUsage(monthlyUsage: JsonField<List<MonthlyUsage>>) = apply {
                this.monthlyUsage = monthlyUsage.map { it.toMutableList() }
            }

            /**
             * Adds a single [MonthlyUsage] to [Builder.monthlyUsage].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMonthlyUsage(monthlyUsage: MonthlyUsage) = apply {
                this.monthlyUsage =
                    (this.monthlyUsage ?: JsonField.of(mutableListOf())).also {
                        checkKnown("monthlyUsage", it).add(monthlyUsage)
                    }
            }

            /** Whether the workspace only allows SAML authentication. */
            fun samlOnlyAccess(samlOnlyAccess: Boolean) =
                samlOnlyAccess(JsonField.of(samlOnlyAccess))

            /**
             * Sets [Builder.samlOnlyAccess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samlOnlyAccess] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samlOnlyAccess(samlOnlyAccess: JsonField<Boolean>) = apply {
                this.samlOnlyAccess = samlOnlyAccess
            }

            fun wildcardDomains(wildcardDomains: List<String>) =
                wildcardDomains(JsonField.of(wildcardDomains))

            /**
             * Sets [Builder.wildcardDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wildcardDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun wildcardDomains(wildcardDomains: JsonField<List<String>>) = apply {
                this.wildcardDomains = wildcardDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [wildcardDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWildcardDomain(wildcardDomain: String) = apply {
                wildcardDomains =
                    (wildcardDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("wildcardDomains", it).add(wildcardDomain)
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

            /**
             * Returns an immutable instance of [Workspace].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .inviteCount()
             * .memberCount()
             * .name()
             * .periodEndDate()
             * .periodStartDate()
             * .projectCount()
             * .slug()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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

            /** An enum containing [Status]'s known values. */
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
                ACTIVE,
                PAST_DUE,
                UNPAID,
                CANCELED,
                INCOMPLETE,
                INCOMPLETE_EXPIRED,
                TRIALING,
                PAUSED,
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

        class MonthlyUsage
        private constructor(
            private val executionTimeMs: JsonField<Long>,
            private val monthYear: JsonField<LocalDate>,
            private val predictionCount: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("executionTimeMs")
                @ExcludeMissing
                executionTimeMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("monthYear")
                @ExcludeMissing
                monthYear: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("predictionCount")
                @ExcludeMissing
                predictionCount: JsonField<Long> = JsonMissing.of(),
            ) : this(executionTimeMs, monthYear, predictionCount, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun executionTimeMs(): Optional<Long> =
                Optional.ofNullable(executionTimeMs.getNullable("executionTimeMs"))

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun monthYear(): Optional<LocalDate> =
                Optional.ofNullable(monthYear.getNullable("monthYear"))

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionCount(): Optional<Long> =
                Optional.ofNullable(predictionCount.getNullable("predictionCount"))

            /**
             * Returns the raw JSON value of [executionTimeMs].
             *
             * Unlike [executionTimeMs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("executionTimeMs")
            @ExcludeMissing
            fun _executionTimeMs(): JsonField<Long> = executionTimeMs

            /**
             * Returns the raw JSON value of [monthYear].
             *
             * Unlike [monthYear], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monthYear")
            @ExcludeMissing
            fun _monthYear(): JsonField<LocalDate> = monthYear

            /**
             * Returns the raw JSON value of [predictionCount].
             *
             * Unlike [predictionCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictionCount")
            @ExcludeMissing
            fun _predictionCount(): JsonField<Long> = predictionCount

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

                /** Returns a mutable builder for constructing an instance of [MonthlyUsage]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MonthlyUsage]. */
            class Builder internal constructor() {

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

                /**
                 * Alias for [Builder.executionTimeMs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun executionTimeMs(executionTimeMs: Long) =
                    executionTimeMs(executionTimeMs as Long?)

                /**
                 * Alias for calling [Builder.executionTimeMs] with `executionTimeMs.orElse(null)`.
                 */
                fun executionTimeMs(executionTimeMs: Optional<Long>) =
                    executionTimeMs(executionTimeMs.getOrNull())

                /**
                 * Sets [Builder.executionTimeMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.executionTimeMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun executionTimeMs(executionTimeMs: JsonField<Long>) = apply {
                    this.executionTimeMs = executionTimeMs
                }

                fun monthYear(monthYear: LocalDate) = monthYear(JsonField.of(monthYear))

                /**
                 * Sets [Builder.monthYear] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monthYear] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun monthYear(monthYear: JsonField<LocalDate>) = apply {
                    this.monthYear = monthYear
                }

                fun predictionCount(predictionCount: Long) =
                    predictionCount(JsonField.of(predictionCount))

                /**
                 * Sets [Builder.predictionCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [MonthlyUsage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MonthlyUsage =
                    MonthlyUsage(
                        executionTimeMs,
                        monthYear,
                        predictionCount,
                        additionalProperties.toMutableMap(),
                    )
            }

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

        return /* spotless:off */ other is InferencePipelineCreateResponse && id == other.id && dateCreated == other.dateCreated && dateLastEvaluated == other.dateLastEvaluated && dateLastSampleReceived == other.dateLastSampleReceived && dateOfNextEvaluation == other.dateOfNextEvaluation && dateUpdated == other.dateUpdated && description == other.description && failingGoalCount == other.failingGoalCount && links == other.links && name == other.name && passingGoalCount == other.passingGoalCount && projectId == other.projectId && status == other.status && statusMessage == other.statusMessage && totalGoalCount == other.totalGoalCount && project == other.project && workspace == other.workspace && workspaceId == other.workspaceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, dateCreated, dateLastEvaluated, dateLastSampleReceived, dateOfNextEvaluation, dateUpdated, description, failingGoalCount, links, name, passingGoalCount, projectId, status, statusMessage, totalGoalCount, project, workspace, workspaceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineCreateResponse{id=$id, dateCreated=$dateCreated, dateLastEvaluated=$dateLastEvaluated, dateLastSampleReceived=$dateLastSampleReceived, dateOfNextEvaluation=$dateOfNextEvaluation, dateUpdated=$dateUpdated, description=$description, failingGoalCount=$failingGoalCount, links=$links, name=$name, passingGoalCount=$passingGoalCount, projectId=$projectId, status=$status, statusMessage=$statusMessage, totalGoalCount=$totalGoalCount, project=$project, workspace=$workspace, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
