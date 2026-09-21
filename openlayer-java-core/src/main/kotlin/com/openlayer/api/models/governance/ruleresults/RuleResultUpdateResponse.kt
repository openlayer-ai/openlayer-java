// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RuleResultUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val deactivated: JsonField<Boolean>,
    private val ruleId: JsonField<String>,
    private val status: JsonField<Status>,
    private val workspaceId: JsonField<String>,
    private val assigneeId: JsonField<String>,
    private val blockedBy: JsonField<List<BlockedBy>>,
    private val blocking: JsonField<List<Blocking>>,
    private val dateLastEvaluated: JsonField<OffsetDateTime>,
    private val dateOfLatestEvidence: JsonField<OffsetDateTime>,
    private val dateOfNextEvaluation: JsonField<OffsetDateTime>,
    private val dateOfRenewal: JsonField<OffsetDateTime>,
    private val deactivatedReason: JsonField<String>,
    private val projectId: JsonField<String>,
    private val statusMessage: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deactivated")
        @ExcludeMissing
        deactivated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ruleId") @ExcludeMissing ruleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("workspaceId")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assigneeId")
        @ExcludeMissing
        assigneeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("blockedBy")
        @ExcludeMissing
        blockedBy: JsonField<List<BlockedBy>> = JsonMissing.of(),
        @JsonProperty("blocking")
        @ExcludeMissing
        blocking: JsonField<List<Blocking>> = JsonMissing.of(),
        @JsonProperty("dateLastEvaluated")
        @ExcludeMissing
        dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateOfLatestEvidence")
        @ExcludeMissing
        dateOfLatestEvidence: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateOfRenewal")
        @ExcludeMissing
        dateOfRenewal: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deactivatedReason")
        @ExcludeMissing
        deactivatedReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("projectId") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statusMessage")
        @ExcludeMissing
        statusMessage: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        dateCreated,
        dateUpdated,
        deactivated,
        ruleId,
        status,
        workspaceId,
        assigneeId,
        blockedBy,
        blocking,
        dateLastEvaluated,
        dateOfLatestEvidence,
        dateOfNextEvaluation,
        dateOfRenewal,
        deactivatedReason,
        projectId,
        statusMessage,
        mutableMapOf(),
    )

    /**
     * The rule result id.
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
     * The last update date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /**
     * Whether this result is excluded from compliance calculations.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deactivated(): Boolean = deactivated.getRequired("deactivated")

    /**
     * The rule this result belongs to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleId(): String = ruleId.getRequired("ruleId")

    /**
     * The compliance status of the rule for this entity.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The id of the workspace the rule result belongs to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = workspaceId.getRequired("workspaceId")

    /**
     * The user responsible for this result.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

    /**
     * Rule results that must pass before this one can be satisfied.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockedBy(): Optional<List<BlockedBy>> = blockedBy.getOptional("blockedBy")

    /**
     * Rule results that this one blocks.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blocking(): Optional<List<Blocking>> = blocking.getOptional("blocking")

    /**
     * When the rule was last evaluated. Platform rules only.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastEvaluated(): Optional<OffsetDateTime> =
        dateLastEvaluated.getOptional("dateLastEvaluated")

    /**
     * When the most recent piece of evidence was attached. Evidence rules only.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfLatestEvidence(): Optional<OffsetDateTime> =
        dateOfLatestEvidence.getOptional("dateOfLatestEvidence")

    /**
     * When the rule will next be evaluated. Platform rules only.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
        dateOfNextEvaluation.getOptional("dateOfNextEvaluation")

    /**
     * When the evidence must be renewed. Evidence rules with a renewal cadence only.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfRenewal(): Optional<OffsetDateTime> = dateOfRenewal.getOptional("dateOfRenewal")

    /**
     * Why the result was excluded.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivatedReason(): Optional<String> = deactivatedReason.getOptional("deactivatedReason")

    /**
     * The project this result was evaluated for. `null` for workspace-scoped rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = projectId.getOptional("projectId")

    /**
     * A human-readable explanation of the status.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> = statusMessage.getOptional("statusMessage")

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
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [deactivated].
     *
     * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deactivated")
    @ExcludeMissing
    fun _deactivated(): JsonField<Boolean> = deactivated

    /**
     * Returns the raw JSON value of [ruleId].
     *
     * Unlike [ruleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleId") @ExcludeMissing fun _ruleId(): JsonField<String> = ruleId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId(): JsonField<String> = workspaceId

    /**
     * Returns the raw JSON value of [assigneeId].
     *
     * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assigneeId") @ExcludeMissing fun _assigneeId(): JsonField<String> = assigneeId

    /**
     * Returns the raw JSON value of [blockedBy].
     *
     * Unlike [blockedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blockedBy")
    @ExcludeMissing
    fun _blockedBy(): JsonField<List<BlockedBy>> = blockedBy

    /**
     * Returns the raw JSON value of [blocking].
     *
     * Unlike [blocking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocking") @ExcludeMissing fun _blocking(): JsonField<List<Blocking>> = blocking

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
     * Returns the raw JSON value of [dateOfLatestEvidence].
     *
     * Unlike [dateOfLatestEvidence], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dateOfLatestEvidence")
    @ExcludeMissing
    fun _dateOfLatestEvidence(): JsonField<OffsetDateTime> = dateOfLatestEvidence

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
     * Returns the raw JSON value of [dateOfRenewal].
     *
     * Unlike [dateOfRenewal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateOfRenewal")
    @ExcludeMissing
    fun _dateOfRenewal(): JsonField<OffsetDateTime> = dateOfRenewal

    /**
     * Returns the raw JSON value of [deactivatedReason].
     *
     * Unlike [deactivatedReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deactivatedReason")
    @ExcludeMissing
    fun _deactivatedReason(): JsonField<String> = deactivatedReason

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

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
         * Returns a mutable builder for constructing an instance of [RuleResultUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .deactivated()
         * .ruleId()
         * .status()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleResultUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var deactivated: JsonField<Boolean>? = null
        private var ruleId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var workspaceId: JsonField<String>? = null
        private var assigneeId: JsonField<String> = JsonMissing.of()
        private var blockedBy: JsonField<MutableList<BlockedBy>>? = null
        private var blocking: JsonField<MutableList<Blocking>>? = null
        private var dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateOfLatestEvidence: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dateOfRenewal: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deactivatedReason: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var statusMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleResultUpdateResponse: RuleResultUpdateResponse) = apply {
            id = ruleResultUpdateResponse.id
            dateCreated = ruleResultUpdateResponse.dateCreated
            dateUpdated = ruleResultUpdateResponse.dateUpdated
            deactivated = ruleResultUpdateResponse.deactivated
            ruleId = ruleResultUpdateResponse.ruleId
            status = ruleResultUpdateResponse.status
            workspaceId = ruleResultUpdateResponse.workspaceId
            assigneeId = ruleResultUpdateResponse.assigneeId
            blockedBy = ruleResultUpdateResponse.blockedBy.map { it.toMutableList() }
            blocking = ruleResultUpdateResponse.blocking.map { it.toMutableList() }
            dateLastEvaluated = ruleResultUpdateResponse.dateLastEvaluated
            dateOfLatestEvidence = ruleResultUpdateResponse.dateOfLatestEvidence
            dateOfNextEvaluation = ruleResultUpdateResponse.dateOfNextEvaluation
            dateOfRenewal = ruleResultUpdateResponse.dateOfRenewal
            deactivatedReason = ruleResultUpdateResponse.deactivatedReason
            projectId = ruleResultUpdateResponse.projectId
            statusMessage = ruleResultUpdateResponse.statusMessage
            additionalProperties = ruleResultUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The rule result id. */
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

        /** The last update date. */
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

        /** Whether this result is excluded from compliance calculations. */
        fun deactivated(deactivated: Boolean) = deactivated(JsonField.of(deactivated))

        /**
         * Sets [Builder.deactivated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deactivated(deactivated: JsonField<Boolean>) = apply { this.deactivated = deactivated }

        /** The rule this result belongs to. */
        fun ruleId(ruleId: String) = ruleId(JsonField.of(ruleId))

        /**
         * Sets [Builder.ruleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

        /** The compliance status of the rule for this entity. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The id of the workspace the rule result belongs to. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        /** The user responsible for this result. */
        fun assigneeId(assigneeId: String?) = assigneeId(JsonField.ofNullable(assigneeId))

        /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
        fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

        /**
         * Sets [Builder.assigneeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assigneeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assigneeId(assigneeId: JsonField<String>) = apply { this.assigneeId = assigneeId }

        /** Rule results that must pass before this one can be satisfied. */
        fun blockedBy(blockedBy: List<BlockedBy>) = blockedBy(JsonField.of(blockedBy))

        /**
         * Sets [Builder.blockedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedBy] with a well-typed `List<BlockedBy>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedBy(blockedBy: JsonField<List<BlockedBy>>) = apply {
            this.blockedBy = blockedBy.map { it.toMutableList() }
        }

        /**
         * Adds a single [BlockedBy] to [Builder.blockedBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedBy(blockedBy: BlockedBy) = apply {
            this.blockedBy =
                (this.blockedBy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedBy", it).add(blockedBy)
                }
        }

        /** Rule results that this one blocks. */
        fun blocking(blocking: List<Blocking>) = blocking(JsonField.of(blocking))

        /**
         * Sets [Builder.blocking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blocking] with a well-typed `List<Blocking>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blocking(blocking: JsonField<List<Blocking>>) = apply {
            this.blocking = blocking.map { it.toMutableList() }
        }

        /**
         * Adds a single [Blocking] to [Builder.blocking].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlocking(blocking: Blocking) = apply {
            this.blocking =
                (this.blocking ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blocking", it).add(blocking)
                }
        }

        /** When the rule was last evaluated. Platform rules only. */
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

        /** When the most recent piece of evidence was attached. Evidence rules only. */
        fun dateOfLatestEvidence(dateOfLatestEvidence: OffsetDateTime?) =
            dateOfLatestEvidence(JsonField.ofNullable(dateOfLatestEvidence))

        /**
         * Alias for calling [Builder.dateOfLatestEvidence] with
         * `dateOfLatestEvidence.orElse(null)`.
         */
        fun dateOfLatestEvidence(dateOfLatestEvidence: Optional<OffsetDateTime>) =
            dateOfLatestEvidence(dateOfLatestEvidence.getOrNull())

        /**
         * Sets [Builder.dateOfLatestEvidence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfLatestEvidence] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateOfLatestEvidence(dateOfLatestEvidence: JsonField<OffsetDateTime>) = apply {
            this.dateOfLatestEvidence = dateOfLatestEvidence
        }

        /** When the rule will next be evaluated. Platform rules only. */
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

        /** When the evidence must be renewed. Evidence rules with a renewal cadence only. */
        fun dateOfRenewal(dateOfRenewal: OffsetDateTime?) =
            dateOfRenewal(JsonField.ofNullable(dateOfRenewal))

        /** Alias for calling [Builder.dateOfRenewal] with `dateOfRenewal.orElse(null)`. */
        fun dateOfRenewal(dateOfRenewal: Optional<OffsetDateTime>) =
            dateOfRenewal(dateOfRenewal.getOrNull())

        /**
         * Sets [Builder.dateOfRenewal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfRenewal] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateOfRenewal(dateOfRenewal: JsonField<OffsetDateTime>) = apply {
            this.dateOfRenewal = dateOfRenewal
        }

        /** Why the result was excluded. */
        fun deactivatedReason(deactivatedReason: String?) =
            deactivatedReason(JsonField.ofNullable(deactivatedReason))

        /** Alias for calling [Builder.deactivatedReason] with `deactivatedReason.orElse(null)`. */
        fun deactivatedReason(deactivatedReason: Optional<String>) =
            deactivatedReason(deactivatedReason.getOrNull())

        /**
         * Sets [Builder.deactivatedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivatedReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deactivatedReason(deactivatedReason: JsonField<String>) = apply {
            this.deactivatedReason = deactivatedReason
        }

        /** The project this result was evaluated for. `null` for workspace-scoped rules. */
        fun projectId(projectId: String?) = projectId(JsonField.ofNullable(projectId))

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /** A human-readable explanation of the status. */
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
         * Returns an immutable instance of [RuleResultUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .deactivated()
         * .ruleId()
         * .status()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleResultUpdateResponse =
            RuleResultUpdateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("deactivated", deactivated),
                checkRequired("ruleId", ruleId),
                checkRequired("status", status),
                checkRequired("workspaceId", workspaceId),
                assigneeId,
                (blockedBy ?: JsonMissing.of()).map { it.toImmutable() },
                (blocking ?: JsonMissing.of()).map { it.toImmutable() },
                dateLastEvaluated,
                dateOfLatestEvidence,
                dateOfNextEvaluation,
                dateOfRenewal,
                deactivatedReason,
                projectId,
                statusMessage,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RuleResultUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateUpdated()
        deactivated()
        ruleId()
        status().validate()
        workspaceId()
        assigneeId()
        blockedBy().ifPresent { it.forEach { it.validate() } }
        blocking().ifPresent { it.forEach { it.validate() } }
        dateLastEvaluated()
        dateOfLatestEvidence()
        dateOfNextEvaluation()
        dateOfRenewal()
        deactivatedReason()
        projectId()
        statusMessage()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OpenlayerInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (deactivated.asKnown().isPresent) 1 else 0) +
            (if (ruleId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (if (assigneeId.asKnown().isPresent) 1 else 0) +
            (blockedBy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (blocking.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dateLastEvaluated.asKnown().isPresent) 1 else 0) +
            (if (dateOfLatestEvidence.asKnown().isPresent) 1 else 0) +
            (if (dateOfNextEvaluation.asKnown().isPresent) 1 else 0) +
            (if (dateOfRenewal.asKnown().isPresent) 1 else 0) +
            (if (deactivatedReason.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (statusMessage.asKnown().isPresent) 1 else 0)

    /** The compliance status of the rule for this entity. */
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

            @JvmField val RUNNING = of("running")

            @JvmField val PASSING = of("passing")

            @JvmField val FAILING = of("failing")

            @JvmField val SKIPPED = of("skipped")

            @JvmField val ERROR = of("error")

            @JvmField val PENDING = of("pending")

            @JvmField val DUE_SOON = of("due_soon")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            PENDING,
            DUE_SOON,
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
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            PENDING,
            DUE_SOON,
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
                RUNNING -> Value.RUNNING
                PASSING -> Value.PASSING
                FAILING -> Value.FAILING
                SKIPPED -> Value.SKIPPED
                ERROR -> Value.ERROR
                PENDING -> Value.PENDING
                DUE_SOON -> Value.DUE_SOON
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
                RUNNING -> Known.RUNNING
                PASSING -> Known.PASSING
                FAILING -> Known.FAILING
                SKIPPED -> Known.SKIPPED
                ERROR -> Known.ERROR
                PENDING -> Known.PENDING
                DUE_SOON -> Known.DUE_SOON
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

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenlayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BlockedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(id, status, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The compliance status of the rule for this entity.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [BlockedBy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BlockedBy]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(blockedBy: BlockedBy) = apply {
                id = blockedBy.id
                status = blockedBy.status
                additionalProperties = blockedBy.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The compliance status of the rule for this entity. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [BlockedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BlockedBy = BlockedBy(id, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BlockedBy = apply {
            if (validated) {
                return@apply
            }

            id()
            status().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenlayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) + (status.asKnown().getOrNull()?.validity() ?: 0)

        /** The compliance status of the rule for this entity. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val DUE_SOON = of("due_soon")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
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
                PENDING,
                DUE_SOON,
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
                    PENDING -> Value.PENDING
                    DUE_SOON -> Value.DUE_SOON
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
                    PENDING -> Known.PENDING
                    DUE_SOON -> Known.DUE_SOON
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BlockedBy &&
                id == other.id &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BlockedBy{id=$id, status=$status, additionalProperties=$additionalProperties}"
    }

    class Blocking
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(id, status, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The compliance status of the rule for this entity.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Blocking]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Blocking]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(blocking: Blocking) = apply {
                id = blocking.id
                status = blocking.status
                additionalProperties = blocking.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The compliance status of the rule for this entity. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Blocking].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Blocking = Blocking(id, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Blocking = apply {
            if (validated) {
                return@apply
            }

            id()
            status().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenlayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) + (status.asKnown().getOrNull()?.validity() ?: 0)

        /** The compliance status of the rule for this entity. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val DUE_SOON = of("due_soon")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                RUNNING,
                PASSING,
                FAILING,
                SKIPPED,
                ERROR,
                PENDING,
                DUE_SOON,
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
                PENDING,
                DUE_SOON,
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
                    PENDING -> Value.PENDING
                    DUE_SOON -> Value.DUE_SOON
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
                    PENDING -> Known.PENDING
                    DUE_SOON -> Known.DUE_SOON
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

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Blocking &&
                id == other.id &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Blocking{id=$id, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleResultUpdateResponse &&
            id == other.id &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            deactivated == other.deactivated &&
            ruleId == other.ruleId &&
            status == other.status &&
            workspaceId == other.workspaceId &&
            assigneeId == other.assigneeId &&
            blockedBy == other.blockedBy &&
            blocking == other.blocking &&
            dateLastEvaluated == other.dateLastEvaluated &&
            dateOfLatestEvidence == other.dateOfLatestEvidence &&
            dateOfNextEvaluation == other.dateOfNextEvaluation &&
            dateOfRenewal == other.dateOfRenewal &&
            deactivatedReason == other.deactivatedReason &&
            projectId == other.projectId &&
            statusMessage == other.statusMessage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dateCreated,
            dateUpdated,
            deactivated,
            ruleId,
            status,
            workspaceId,
            assigneeId,
            blockedBy,
            blocking,
            dateLastEvaluated,
            dateOfLatestEvidence,
            dateOfNextEvaluation,
            dateOfRenewal,
            deactivatedReason,
            projectId,
            statusMessage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleResultUpdateResponse{id=$id, dateCreated=$dateCreated, dateUpdated=$dateUpdated, deactivated=$deactivated, ruleId=$ruleId, status=$status, workspaceId=$workspaceId, assigneeId=$assigneeId, blockedBy=$blockedBy, blocking=$blocking, dateLastEvaluated=$dateLastEvaluated, dateOfLatestEvidence=$dateOfLatestEvidence, dateOfNextEvaluation=$dateOfNextEvaluation, dateOfRenewal=$dateOfRenewal, deactivatedReason=$deactivatedReason, projectId=$projectId, statusMessage=$statusMessage, additionalProperties=$additionalProperties}"
}
