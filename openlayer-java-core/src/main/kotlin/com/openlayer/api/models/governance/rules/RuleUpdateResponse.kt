// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

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

class RuleUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val scope: JsonField<Scope>,
    private val type: JsonField<Type>,
    private val workspaceId: JsonField<String>,
    private val assigneeId: JsonField<String>,
    private val automationParams: JsonField<AutomationParams>,
    private val automationType: JsonField<String>,
    private val deactivated: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val evidenceType: JsonField<EvidenceType>,
    private val frameworks: JsonField<List<Framework>>,
    private val immutable: JsonField<Boolean>,
    private val renewalCadenceDays: JsonField<Long>,
    private val results: JsonField<List<Result>>,
    private val resultsSummary: JsonField<ResultsSummary>,
    private val tagIds: JsonField<List<String>>,
    private val tags: JsonField<List<Tag>>,
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("workspaceId")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("assigneeId")
        @ExcludeMissing
        assigneeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("automationParams")
        @ExcludeMissing
        automationParams: JsonField<AutomationParams> = JsonMissing.of(),
        @JsonProperty("automationType")
        @ExcludeMissing
        automationType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deactivated")
        @ExcludeMissing
        deactivated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evidenceType")
        @ExcludeMissing
        evidenceType: JsonField<EvidenceType> = JsonMissing.of(),
        @JsonProperty("frameworks")
        @ExcludeMissing
        frameworks: JsonField<List<Framework>> = JsonMissing.of(),
        @JsonProperty("immutable") @ExcludeMissing immutable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("renewalCadenceDays")
        @ExcludeMissing
        renewalCadenceDays: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("resultsSummary")
        @ExcludeMissing
        resultsSummary: JsonField<ResultsSummary> = JsonMissing.of(),
        @JsonProperty("tagIds") @ExcludeMissing tagIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
    ) : this(
        id,
        dateCreated,
        dateUpdated,
        name,
        scope,
        type,
        workspaceId,
        assigneeId,
        automationParams,
        automationType,
        deactivated,
        description,
        evidenceType,
        frameworks,
        immutable,
        renewalCadenceDays,
        results,
        resultsSummary,
        tagIds,
        tags,
        mutableMapOf(),
    )

    /**
     * The rule id.
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
     * The rule name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Whether the rule is evaluated once for the whole workspace, or once per project the rule's
     * frameworks apply to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): Scope = scope.getRequired("scope")

    /**
     * `platform` rules are evaluated automatically from the state of your Openlayer workspace.
     * `evidence` rules are satisfied by attaching evidence.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The id of the workspace the rule belongs to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = workspaceId.getRequired("workspaceId")

    /**
     * The user responsible for satisfying the rule.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

    /**
     * Configuration for the platform check, when the automation takes parameters.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automationParams(): Optional<AutomationParams> =
        automationParams.getOptional("automationParams")

    /**
     * Which workspace signal a platform rule checks, for example `monitoring_mode_enabled`,
     * `test_setup`, or `project_owner_set`. `null` for evidence rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automationType(): Optional<String> = automationType.getOptional("automationType")

    /**
     * Whether the rule is excluded from compliance calculations.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

    /**
     * What the rule requires.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The kind of evidence that satisfies the rule. `null` for platform rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evidenceType(): Optional<EvidenceType> = evidenceType.getOptional("evidenceType")

    /**
     * The frameworks that include this rule.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameworks(): Optional<List<Framework>> = frameworks.getOptional("frameworks")

    /**
     * Whether the rule is managed by Openlayer and cannot be edited.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun immutable(): Optional<Boolean> = immutable.getOptional("immutable")

    /**
     * How often evidence must be renewed, in days. Once evidence is older than this, the rule
     * result becomes `due_soon` and then `failing`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renewalCadenceDays(): Optional<Long> = renewalCadenceDays.getOptional("renewalCadenceDays")

    /**
     * The rule's results, one per entity the rule is evaluated against. Only returned when
     * `includeResults` is `true`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * Pass-rate counts across all of the rule's entities, independent of any status filter applied
     * to the request.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resultsSummary(): Optional<ResultsSummary> = resultsSummary.getOptional("resultsSummary")

    /**
     * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them back
     * from `tags`, and list the tags available in the workspace with `GET
     * /workspaces/{workspaceId}/rule-tags`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagIds(): Optional<List<String>> = tagIds.getOptional("tagIds")

    /**
     * The rule tags associated with the rule.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<Tag>> = tags.getOptional("tags")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
     * Returns the raw JSON value of [automationParams].
     *
     * Unlike [automationParams], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("automationParams")
    @ExcludeMissing
    fun _automationParams(): JsonField<AutomationParams> = automationParams

    /**
     * Returns the raw JSON value of [automationType].
     *
     * Unlike [automationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("automationType")
    @ExcludeMissing
    fun _automationType(): JsonField<String> = automationType

    /**
     * Returns the raw JSON value of [deactivated].
     *
     * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deactivated")
    @ExcludeMissing
    fun _deactivated(): JsonField<Boolean> = deactivated

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [evidenceType].
     *
     * Unlike [evidenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evidenceType")
    @ExcludeMissing
    fun _evidenceType(): JsonField<EvidenceType> = evidenceType

    /**
     * Returns the raw JSON value of [frameworks].
     *
     * Unlike [frameworks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frameworks")
    @ExcludeMissing
    fun _frameworks(): JsonField<List<Framework>> = frameworks

    /**
     * Returns the raw JSON value of [immutable].
     *
     * Unlike [immutable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("immutable") @ExcludeMissing fun _immutable(): JsonField<Boolean> = immutable

    /**
     * Returns the raw JSON value of [renewalCadenceDays].
     *
     * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("renewalCadenceDays")
    @ExcludeMissing
    fun _renewalCadenceDays(): JsonField<Long> = renewalCadenceDays

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [resultsSummary].
     *
     * Unlike [resultsSummary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resultsSummary")
    @ExcludeMissing
    fun _resultsSummary(): JsonField<ResultsSummary> = resultsSummary

    /**
     * Returns the raw JSON value of [tagIds].
     *
     * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tagIds") @ExcludeMissing fun _tagIds(): JsonField<List<String>> = tagIds

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

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
         * Returns a mutable builder for constructing an instance of [RuleUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .name()
         * .scope()
         * .type()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var scope: JsonField<Scope>? = null
        private var type: JsonField<Type>? = null
        private var workspaceId: JsonField<String>? = null
        private var assigneeId: JsonField<String> = JsonMissing.of()
        private var automationParams: JsonField<AutomationParams> = JsonMissing.of()
        private var automationType: JsonField<String> = JsonMissing.of()
        private var deactivated: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var evidenceType: JsonField<EvidenceType> = JsonMissing.of()
        private var frameworks: JsonField<MutableList<Framework>>? = null
        private var immutable: JsonField<Boolean> = JsonMissing.of()
        private var renewalCadenceDays: JsonField<Long> = JsonMissing.of()
        private var results: JsonField<MutableList<Result>>? = null
        private var resultsSummary: JsonField<ResultsSummary> = JsonMissing.of()
        private var tagIds: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<Tag>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleUpdateResponse: RuleUpdateResponse) = apply {
            id = ruleUpdateResponse.id
            dateCreated = ruleUpdateResponse.dateCreated
            dateUpdated = ruleUpdateResponse.dateUpdated
            name = ruleUpdateResponse.name
            scope = ruleUpdateResponse.scope
            type = ruleUpdateResponse.type
            workspaceId = ruleUpdateResponse.workspaceId
            assigneeId = ruleUpdateResponse.assigneeId
            automationParams = ruleUpdateResponse.automationParams
            automationType = ruleUpdateResponse.automationType
            deactivated = ruleUpdateResponse.deactivated
            description = ruleUpdateResponse.description
            evidenceType = ruleUpdateResponse.evidenceType
            frameworks = ruleUpdateResponse.frameworks.map { it.toMutableList() }
            immutable = ruleUpdateResponse.immutable
            renewalCadenceDays = ruleUpdateResponse.renewalCadenceDays
            results = ruleUpdateResponse.results.map { it.toMutableList() }
            resultsSummary = ruleUpdateResponse.resultsSummary
            tagIds = ruleUpdateResponse.tagIds.map { it.toMutableList() }
            tags = ruleUpdateResponse.tags.map { it.toMutableList() }
            additionalProperties = ruleUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The rule id. */
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

        /** The rule name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Whether the rule is evaluated once for the whole workspace, or once per project the
         * rule's frameworks apply to.
         */
        fun scope(scope: Scope) = scope(JsonField.of(scope))

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

        /**
         * `platform` rules are evaluated automatically from the state of your Openlayer workspace.
         * `evidence` rules are satisfied by attaching evidence.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The id of the workspace the rule belongs to. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        /** The user responsible for satisfying the rule. */
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

        /** Configuration for the platform check, when the automation takes parameters. */
        fun automationParams(automationParams: AutomationParams?) =
            automationParams(JsonField.ofNullable(automationParams))

        /** Alias for calling [Builder.automationParams] with `automationParams.orElse(null)`. */
        fun automationParams(automationParams: Optional<AutomationParams>) =
            automationParams(automationParams.getOrNull())

        /**
         * Sets [Builder.automationParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automationParams] with a well-typed [AutomationParams]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun automationParams(automationParams: JsonField<AutomationParams>) = apply {
            this.automationParams = automationParams
        }

        /**
         * Which workspace signal a platform rule checks, for example `monitoring_mode_enabled`,
         * `test_setup`, or `project_owner_set`. `null` for evidence rules.
         */
        fun automationType(automationType: String?) =
            automationType(JsonField.ofNullable(automationType))

        /** Alias for calling [Builder.automationType] with `automationType.orElse(null)`. */
        fun automationType(automationType: Optional<String>) =
            automationType(automationType.getOrNull())

        /**
         * Sets [Builder.automationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.automationType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun automationType(automationType: JsonField<String>) = apply {
            this.automationType = automationType
        }

        /** Whether the rule is excluded from compliance calculations. */
        fun deactivated(deactivated: Boolean) = deactivated(JsonField.of(deactivated))

        /**
         * Sets [Builder.deactivated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deactivated(deactivated: JsonField<Boolean>) = apply { this.deactivated = deactivated }

        /** What the rule requires. */
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

        /** The kind of evidence that satisfies the rule. `null` for platform rules. */
        fun evidenceType(evidenceType: EvidenceType?) =
            evidenceType(JsonField.ofNullable(evidenceType))

        /** Alias for calling [Builder.evidenceType] with `evidenceType.orElse(null)`. */
        fun evidenceType(evidenceType: Optional<EvidenceType>) =
            evidenceType(evidenceType.getOrNull())

        /**
         * Sets [Builder.evidenceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evidenceType] with a well-typed [EvidenceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evidenceType(evidenceType: JsonField<EvidenceType>) = apply {
            this.evidenceType = evidenceType
        }

        /** The frameworks that include this rule. */
        fun frameworks(frameworks: List<Framework>) = frameworks(JsonField.of(frameworks))

        /**
         * Sets [Builder.frameworks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameworks] with a well-typed `List<Framework>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frameworks(frameworks: JsonField<List<Framework>>) = apply {
            this.frameworks = frameworks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Framework] to [frameworks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFramework(framework: Framework) = apply {
            frameworks =
                (frameworks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("frameworks", it).add(framework)
                }
        }

        /** Whether the rule is managed by Openlayer and cannot be edited. */
        fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

        /**
         * Sets [Builder.immutable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.immutable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun immutable(immutable: JsonField<Boolean>) = apply { this.immutable = immutable }

        /**
         * How often evidence must be renewed, in days. Once evidence is older than this, the rule
         * result becomes `due_soon` and then `failing`.
         */
        fun renewalCadenceDays(renewalCadenceDays: Long?) =
            renewalCadenceDays(JsonField.ofNullable(renewalCadenceDays))

        /**
         * Alias for [Builder.renewalCadenceDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun renewalCadenceDays(renewalCadenceDays: Long) =
            renewalCadenceDays(renewalCadenceDays as Long?)

        /**
         * Alias for calling [Builder.renewalCadenceDays] with `renewalCadenceDays.orElse(null)`.
         */
        fun renewalCadenceDays(renewalCadenceDays: Optional<Long>) =
            renewalCadenceDays(renewalCadenceDays.getOrNull())

        /**
         * Sets [Builder.renewalCadenceDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.renewalCadenceDays] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun renewalCadenceDays(renewalCadenceDays: JsonField<Long>) = apply {
            this.renewalCadenceDays = renewalCadenceDays
        }

        /**
         * The rule's results, one per entity the rule is evaluated against. Only returned when
         * `includeResults` is `true`.
         */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /**
         * Pass-rate counts across all of the rule's entities, independent of any status filter
         * applied to the request.
         */
        fun resultsSummary(resultsSummary: ResultsSummary?) =
            resultsSummary(JsonField.ofNullable(resultsSummary))

        /** Alias for calling [Builder.resultsSummary] with `resultsSummary.orElse(null)`. */
        fun resultsSummary(resultsSummary: Optional<ResultsSummary>) =
            resultsSummary(resultsSummary.getOrNull())

        /**
         * Sets [Builder.resultsSummary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resultsSummary] with a well-typed [ResultsSummary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resultsSummary(resultsSummary: JsonField<ResultsSummary>) = apply {
            this.resultsSummary = resultsSummary
        }

        /**
         * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them
         * back from `tags`, and list the tags available in the workspace with `GET
         * /workspaces/{workspaceId}/rule-tags`.
         */
        fun tagIds(tagIds: List<String>?) = tagIds(JsonField.ofNullable(tagIds))

        /** Alias for calling [Builder.tagIds] with `tagIds.orElse(null)`. */
        fun tagIds(tagIds: Optional<List<String>>) = tagIds(tagIds.getOrNull())

        /**
         * Sets [Builder.tagIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagIds(tagIds: JsonField<List<String>>) = apply {
            this.tagIds = tagIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tagIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagId(tagId: String) = apply {
            tagIds =
                (tagIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tagIds", it).add(tagId)
                }
        }

        /** The rule tags associated with the rule. */
        fun tags(tags: List<Tag>?) = tags(JsonField.ofNullable(tags))

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<Tag>>) = tags(tags.getOrNull())

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [RuleUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .name()
         * .scope()
         * .type()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleUpdateResponse =
            RuleUpdateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("name", name),
                checkRequired("scope", scope),
                checkRequired("type", type),
                checkRequired("workspaceId", workspaceId),
                assigneeId,
                automationParams,
                automationType,
                deactivated,
                description,
                evidenceType,
                (frameworks ?: JsonMissing.of()).map { it.toImmutable() },
                immutable,
                renewalCadenceDays,
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                resultsSummary,
                (tagIds ?: JsonMissing.of()).map { it.toImmutable() },
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RuleUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateUpdated()
        name()
        scope().validate()
        type().validate()
        workspaceId()
        assigneeId()
        automationParams().ifPresent { it.validate() }
        automationType()
        deactivated()
        description()
        evidenceType().ifPresent { it.validate() }
        frameworks().ifPresent { it.forEach { it.validate() } }
        immutable()
        renewalCadenceDays()
        results().ifPresent { it.forEach { it.validate() } }
        resultsSummary().ifPresent { it.validate() }
        tagIds()
        tags().ifPresent { it.forEach { it.validate() } }
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (scope.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (if (assigneeId.asKnown().isPresent) 1 else 0) +
            (automationParams.asKnown().getOrNull()?.validity() ?: 0) +
            (if (automationType.asKnown().isPresent) 1 else 0) +
            (if (deactivated.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (evidenceType.asKnown().getOrNull()?.validity() ?: 0) +
            (frameworks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (immutable.asKnown().isPresent) 1 else 0) +
            (if (renewalCadenceDays.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (resultsSummary.asKnown().getOrNull()?.validity() ?: 0) +
            (tagIds.asKnown().getOrNull()?.size ?: 0) +
            (tags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * Whether the rule is evaluated once for the whole workspace, or once per project the rule's
     * frameworks apply to.
     */
    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROJECT = of("project")

            @JvmField val WORKSPACE = of("workspace")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            PROJECT,
            WORKSPACE,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECT,
            WORKSPACE,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                PROJECT -> Value.PROJECT
                WORKSPACE -> Value.WORKSPACE
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
                PROJECT -> Known.PROJECT
                WORKSPACE -> Known.WORKSPACE
                else -> throw OpenlayerInvalidDataException("Unknown Scope: $value")
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
        fun validate(): Scope = apply {
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

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * `platform` rules are evaluated automatically from the state of your Openlayer workspace.
     * `evidence` rules are satisfied by attaching evidence.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PLATFORM = of("platform")

            @JvmField val EVIDENCE = of("evidence")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PLATFORM,
            EVIDENCE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLATFORM,
            EVIDENCE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PLATFORM -> Value.PLATFORM
                EVIDENCE -> Value.EVIDENCE
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
                PLATFORM -> Known.PLATFORM
                EVIDENCE -> Known.EVIDENCE
                else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration for the platform check, when the automation takes parameters. */
    class AutomationParams
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [AutomationParams]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AutomationParams]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(automationParams: AutomationParams) = apply {
                additionalProperties = automationParams.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [AutomationParams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AutomationParams = AutomationParams(additionalProperties.toImmutable())
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
        fun validate(): AutomationParams = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AutomationParams && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "AutomationParams{additionalProperties=$additionalProperties}"
    }

    /** The kind of evidence that satisfies the rule. `null` for platform rules. */
    class EvidenceType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DOCUMENT = of("document")

            @JvmField val TEXT = of("text")

            @JvmField val URL = of("url")

            @JvmField val CATEGORY_VALUE = of("categoryValue")

            @JvmStatic fun of(value: String) = EvidenceType(JsonField.of(value))
        }

        /** An enum containing [EvidenceType]'s known values. */
        enum class Known {
            DOCUMENT,
            TEXT,
            URL,
            CATEGORY_VALUE,
        }

        /**
         * An enum containing [EvidenceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EvidenceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DOCUMENT,
            TEXT,
            URL,
            CATEGORY_VALUE,
            /**
             * An enum member indicating that [EvidenceType] was instantiated with an unknown value.
             */
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
                DOCUMENT -> Value.DOCUMENT
                TEXT -> Value.TEXT
                URL -> Value.URL
                CATEGORY_VALUE -> Value.CATEGORY_VALUE
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
                DOCUMENT -> Known.DOCUMENT
                TEXT -> Known.TEXT
                URL -> Known.URL
                CATEGORY_VALUE -> Known.CATEGORY_VALUE
                else -> throw OpenlayerInvalidDataException("Unknown EvidenceType: $value")
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
        fun validate(): EvidenceType = apply {
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

            return other is EvidenceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Framework
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val avatar: JsonField<Avatar>,
        private val builtInSlug: JsonField<String>,
        private val enabled: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<Avatar> = JsonMissing.of(),
            @JsonProperty("builtInSlug")
            @ExcludeMissing
            builtInSlug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(id, avatar, builtInSlug, enabled, name, mutableMapOf())

        /**
         * The framework id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The icon shown for the framework.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun avatar(): Optional<Avatar> = avatar.getOptional("avatar")

        /**
         * Identifies a framework that ships with Openlayer, for example `eu_ai_act`, `iso_42001`,
         * `nist_ai_rmf`, or `traiga`. `null` for frameworks you create yourself.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun builtInSlug(): Optional<String> = builtInSlug.getOptional("builtInSlug")

        /**
         * Whether the framework is active. Rules of a disabled framework are not evaluated and do
         * not count towards compliance.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * The framework name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [avatar].
         *
         * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<Avatar> = avatar

        /**
         * Returns the raw JSON value of [builtInSlug].
         *
         * Unlike [builtInSlug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("builtInSlug")
        @ExcludeMissing
        fun _builtInSlug(): JsonField<String> = builtInSlug

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Framework].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatar()
             * .builtInSlug()
             * .enabled()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Framework]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var avatar: JsonField<Avatar>? = null
            private var builtInSlug: JsonField<String>? = null
            private var enabled: JsonField<Boolean>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(framework: Framework) = apply {
                id = framework.id
                avatar = framework.avatar
                builtInSlug = framework.builtInSlug
                enabled = framework.enabled
                name = framework.name
                additionalProperties = framework.additionalProperties.toMutableMap()
            }

            /** The framework id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The icon shown for the framework. */
            fun avatar(avatar: Avatar?) = avatar(JsonField.ofNullable(avatar))

            /** Alias for calling [Builder.avatar] with `avatar.orElse(null)`. */
            fun avatar(avatar: Optional<Avatar>) = avatar(avatar.getOrNull())

            /**
             * Sets [Builder.avatar] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avatar] with a well-typed [Avatar] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avatar(avatar: JsonField<Avatar>) = apply { this.avatar = avatar }

            /**
             * Identifies a framework that ships with Openlayer, for example `eu_ai_act`,
             * `iso_42001`, `nist_ai_rmf`, or `traiga`. `null` for frameworks you create yourself.
             */
            fun builtInSlug(builtInSlug: String?) = builtInSlug(JsonField.ofNullable(builtInSlug))

            /** Alias for calling [Builder.builtInSlug] with `builtInSlug.orElse(null)`. */
            fun builtInSlug(builtInSlug: Optional<String>) = builtInSlug(builtInSlug.getOrNull())

            /**
             * Sets [Builder.builtInSlug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.builtInSlug] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun builtInSlug(builtInSlug: JsonField<String>) = apply {
                this.builtInSlug = builtInSlug
            }

            /**
             * Whether the framework is active. Rules of a disabled framework are not evaluated and
             * do not count towards compliance.
             */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** The framework name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Framework].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .avatar()
             * .builtInSlug()
             * .enabled()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Framework =
                Framework(
                    checkRequired("id", id),
                    checkRequired("avatar", avatar),
                    checkRequired("builtInSlug", builtInSlug),
                    checkRequired("enabled", enabled),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Framework = apply {
            if (validated) {
                return@apply
            }

            id()
            avatar().ifPresent { it.validate() }
            builtInSlug()
            enabled()
            name()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (avatar.asKnown().getOrNull()?.validity() ?: 0) +
                (if (builtInSlug.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The icon shown for the framework. */
        class Avatar
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(type, value, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                 * Returns a mutable builder for constructing an instance of [Avatar].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Avatar]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(avatar: Avatar) = apply {
                    type = avatar.type
                    value = avatar.value
                    additionalProperties = avatar.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

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
                 * Returns an immutable instance of [Avatar].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Avatar =
                    Avatar(
                        checkRequired("type", type),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Avatar = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                value()
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EMOJI = of("emoji")

                    @JvmField val IMAGE_URL = of("imageUrl")

                    @JvmField val BUILTIN_IMAGE = of("builtinImage")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    EMOJI,
                    IMAGE_URL,
                    BUILTIN_IMAGE,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMOJI,
                    IMAGE_URL,
                    BUILTIN_IMAGE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EMOJI -> Value.EMOJI
                        IMAGE_URL -> Value.IMAGE_URL
                        BUILTIN_IMAGE -> Value.BUILTIN_IMAGE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        EMOJI -> Known.EMOJI
                        IMAGE_URL -> Known.IMAGE_URL
                        BUILTIN_IMAGE -> Known.BUILTIN_IMAGE
                        else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Avatar &&
                    type == other.type &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Avatar{type=$type, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Framework &&
                id == other.id &&
                avatar == other.avatar &&
                builtInSlug == other.builtInSlug &&
                enabled == other.enabled &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, avatar, builtInSlug, enabled, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Framework{id=$id, avatar=$avatar, builtInSlug=$builtInSlug, enabled=$enabled, name=$name, additionalProperties=$additionalProperties}"
    }

    class Result
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
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
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
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

        /**
         * Rule results that must pass before this one can be satisfied.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockedBy(): Optional<List<BlockedBy>> = blockedBy.getOptional("blockedBy")

        /**
         * Rule results that this one blocks.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blocking(): Optional<List<Blocking>> = blocking.getOptional("blocking")

        /**
         * When the rule was last evaluated. Platform rules only.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateLastEvaluated(): Optional<OffsetDateTime> =
            dateLastEvaluated.getOptional("dateLastEvaluated")

        /**
         * When the most recent piece of evidence was attached. Evidence rules only.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateOfLatestEvidence(): Optional<OffsetDateTime> =
            dateOfLatestEvidence.getOptional("dateOfLatestEvidence")

        /**
         * When the rule will next be evaluated. Platform rules only.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
            dateOfNextEvaluation.getOptional("dateOfNextEvaluation")

        /**
         * When the evidence must be renewed. Evidence rules with a renewal cadence only.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateOfRenewal(): Optional<OffsetDateTime> = dateOfRenewal.getOptional("dateOfRenewal")

        /**
         * Why the result was excluded.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deactivatedReason(): Optional<String> =
            deactivatedReason.getOptional("deactivatedReason")

        /**
         * The project this result was evaluated for. `null` for workspace-scoped rules.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("projectId")

        /**
         * A human-readable explanation of the status.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [assigneeId].
         *
         * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assigneeId")
        @ExcludeMissing
        fun _assigneeId(): JsonField<String> = assigneeId

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
        @JsonProperty("blocking")
        @ExcludeMissing
        fun _blocking(): JsonField<List<Blocking>> = blocking

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
         * Unlike [dateOfLatestEvidence], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dateOfLatestEvidence")
        @ExcludeMissing
        fun _dateOfLatestEvidence(): JsonField<OffsetDateTime> = dateOfLatestEvidence

        /**
         * Returns the raw JSON value of [dateOfNextEvaluation].
         *
         * Unlike [dateOfNextEvaluation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        fun _dateOfNextEvaluation(): JsonField<OffsetDateTime> = dateOfNextEvaluation

        /**
         * Returns the raw JSON value of [dateOfRenewal].
         *
         * Unlike [dateOfRenewal], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Result].
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

        /** A builder for [Result]. */
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
            internal fun from(result: Result) = apply {
                id = result.id
                dateCreated = result.dateCreated
                dateUpdated = result.dateUpdated
                deactivated = result.deactivated
                ruleId = result.ruleId
                status = result.status
                workspaceId = result.workspaceId
                assigneeId = result.assigneeId
                blockedBy = result.blockedBy.map { it.toMutableList() }
                blocking = result.blocking.map { it.toMutableList() }
                dateLastEvaluated = result.dateLastEvaluated
                dateOfLatestEvidence = result.dateOfLatestEvidence
                dateOfNextEvaluation = result.dateOfNextEvaluation
                dateOfRenewal = result.dateOfRenewal
                deactivatedReason = result.deactivatedReason
                projectId = result.projectId
                statusMessage = result.statusMessage
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** The rule result id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation date. */
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

            /** The last update date. */
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

            /** Whether this result is excluded from compliance calculations. */
            fun deactivated(deactivated: Boolean) = deactivated(JsonField.of(deactivated))

            /**
             * Sets [Builder.deactivated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deactivated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deactivated(deactivated: JsonField<Boolean>) = apply {
                this.deactivated = deactivated
            }

            /** The rule this result belongs to. */
            fun ruleId(ruleId: String) = ruleId(JsonField.of(ruleId))

            /**
             * Sets [Builder.ruleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

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

            /** The id of the workspace the rule result belongs to. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

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

            /** The user responsible for this result. */
            fun assigneeId(assigneeId: String?) = assigneeId(JsonField.ofNullable(assigneeId))

            /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
            fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

            /**
             * Sets [Builder.assigneeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assigneeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Alias for calling [Builder.dateLastEvaluated] with `dateLastEvaluated.orElse(null)`.
             */
            fun dateLastEvaluated(dateLastEvaluated: Optional<OffsetDateTime>) =
                dateLastEvaluated(dateLastEvaluated.getOrNull())

            /**
             * Sets [Builder.dateLastEvaluated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateLastEvaluated] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * You should usually call [Builder.dateOfLatestEvidence] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * You should usually call [Builder.dateOfNextEvaluation] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * You should usually call [Builder.dateOfRenewal] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateOfRenewal(dateOfRenewal: JsonField<OffsetDateTime>) = apply {
                this.dateOfRenewal = dateOfRenewal
            }

            /** Why the result was excluded. */
            fun deactivatedReason(deactivatedReason: String?) =
                deactivatedReason(JsonField.ofNullable(deactivatedReason))

            /**
             * Alias for calling [Builder.deactivatedReason] with `deactivatedReason.orElse(null)`.
             */
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.statusMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Result].
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
            fun build(): Result =
                Result(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Result = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The compliance status of the rule for this entity.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The compliance status of the rule for this entity. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            /** The compliance status of the rule for this entity. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The compliance status of the rule for this entity.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The compliance status of the rule for this entity. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

            /** The compliance status of the rule for this entity. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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

            return other is Result &&
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
            "Result{id=$id, dateCreated=$dateCreated, dateUpdated=$dateUpdated, deactivated=$deactivated, ruleId=$ruleId, status=$status, workspaceId=$workspaceId, assigneeId=$assigneeId, blockedBy=$blockedBy, blocking=$blocking, dateLastEvaluated=$dateLastEvaluated, dateOfLatestEvidence=$dateOfLatestEvidence, dateOfNextEvaluation=$dateOfNextEvaluation, dateOfRenewal=$dateOfRenewal, deactivatedReason=$deactivatedReason, projectId=$projectId, statusMessage=$statusMessage, additionalProperties=$additionalProperties}"
    }

    /**
     * Pass-rate counts across all of the rule's entities, independent of any status filter applied
     * to the request.
     */
    class ResultsSummary
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val passing: JsonField<Long>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("passing") @ExcludeMissing passing: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(passing, total, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun passing(): Optional<Long> = passing.getOptional("passing")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun total(): Optional<Long> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [passing].
         *
         * Unlike [passing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("passing") @ExcludeMissing fun _passing(): JsonField<Long> = passing

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

            /** Returns a mutable builder for constructing an instance of [ResultsSummary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResultsSummary]. */
        class Builder internal constructor() {

            private var passing: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resultsSummary: ResultsSummary) = apply {
                passing = resultsSummary.passing
                total = resultsSummary.total
                additionalProperties = resultsSummary.additionalProperties.toMutableMap()
            }

            fun passing(passing: Long) = passing(JsonField.of(passing))

            /**
             * Sets [Builder.passing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passing] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passing(passing: JsonField<Long>) = apply { this.passing = passing }

            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

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
             * Returns an immutable instance of [ResultsSummary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResultsSummary =
                ResultsSummary(passing, total, additionalProperties.toMutableMap())
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
        fun validate(): ResultsSummary = apply {
            if (validated) {
                return@apply
            }

            passing()
            total()
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
            (if (passing.asKnown().isPresent) 1 else 0) + (if (total.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResultsSummary &&
                passing == other.passing &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(passing, total, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResultsSummary{passing=$passing, total=$total, additionalProperties=$additionalProperties}"
    }

    class Tag
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val immutable: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val workspaceId: JsonField<String>,
        private val color: JsonField<String>,
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
            @JsonProperty("immutable")
            @ExcludeMissing
            immutable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("workspaceId")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            immutable,
            name,
            workspaceId,
            color,
            mutableMapOf(),
        )

        /**
         * The rule tag id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The user who created the tag. `null` for tags that ship with Openlayer.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

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
         * Whether the tag is managed by Openlayer and cannot be edited or deleted.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun immutable(): Boolean = immutable.getRequired("immutable")

        /**
         * The tag name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The id of the workspace the tag belongs to.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun workspaceId(): String = workspaceId.getRequired("workspaceId")

        /**
         * The color the tag is displayed with.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun color(): Optional<String> = color.getOptional("color")

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
         * Returns the raw JSON value of [immutable].
         *
         * Unlike [immutable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("immutable") @ExcludeMissing fun _immutable(): JsonField<Boolean> = immutable

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [color].
         *
         * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

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
             * Returns a mutable builder for constructing an instance of [Tag].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .immutable()
             * .name()
             * .workspaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Tag]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var immutable: JsonField<Boolean>? = null
            private var name: JsonField<String>? = null
            private var workspaceId: JsonField<String>? = null
            private var color: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tag: Tag) = apply {
                id = tag.id
                creatorId = tag.creatorId
                dateCreated = tag.dateCreated
                dateUpdated = tag.dateUpdated
                immutable = tag.immutable
                name = tag.name
                workspaceId = tag.workspaceId
                color = tag.color
                additionalProperties = tag.additionalProperties.toMutableMap()
            }

            /** The rule tag id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The user who created the tag. `null` for tags that ship with Openlayer. */
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

            /** The creation date. */
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

            /** The last update date. */
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

            /** Whether the tag is managed by Openlayer and cannot be edited or deleted. */
            fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

            /**
             * Sets [Builder.immutable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.immutable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun immutable(immutable: JsonField<Boolean>) = apply { this.immutable = immutable }

            /** The tag name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The id of the workspace the tag belongs to. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

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

            /** The color the tag is displayed with. */
            fun color(color: String?) = color(JsonField.ofNullable(color))

            /** Alias for calling [Builder.color] with `color.orElse(null)`. */
            fun color(color: Optional<String>) = color(color.getOrNull())

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

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
             * Returns an immutable instance of [Tag].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .immutable()
             * .name()
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Tag =
                Tag(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("immutable", immutable),
                    checkRequired("name", name),
                    checkRequired("workspaceId", workspaceId),
                    color,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Tag = apply {
            if (validated) {
                return@apply
            }

            id()
            creatorId()
            dateCreated()
            dateUpdated()
            immutable()
            name()
            workspaceId()
            color()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (creatorId.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (immutable.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0) +
                (if (color.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag &&
                id == other.id &&
                creatorId == other.creatorId &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                immutable == other.immutable &&
                name == other.name &&
                workspaceId == other.workspaceId &&
                color == other.color &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creatorId,
                dateCreated,
                dateUpdated,
                immutable,
                name,
                workspaceId,
                color,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tag{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, immutable=$immutable, name=$name, workspaceId=$workspaceId, color=$color, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleUpdateResponse &&
            id == other.id &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            name == other.name &&
            scope == other.scope &&
            type == other.type &&
            workspaceId == other.workspaceId &&
            assigneeId == other.assigneeId &&
            automationParams == other.automationParams &&
            automationType == other.automationType &&
            deactivated == other.deactivated &&
            description == other.description &&
            evidenceType == other.evidenceType &&
            frameworks == other.frameworks &&
            immutable == other.immutable &&
            renewalCadenceDays == other.renewalCadenceDays &&
            results == other.results &&
            resultsSummary == other.resultsSummary &&
            tagIds == other.tagIds &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dateCreated,
            dateUpdated,
            name,
            scope,
            type,
            workspaceId,
            assigneeId,
            automationParams,
            automationType,
            deactivated,
            description,
            evidenceType,
            frameworks,
            immutable,
            renewalCadenceDays,
            results,
            resultsSummary,
            tagIds,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleUpdateResponse{id=$id, dateCreated=$dateCreated, dateUpdated=$dateUpdated, name=$name, scope=$scope, type=$type, workspaceId=$workspaceId, assigneeId=$assigneeId, automationParams=$automationParams, automationType=$automationType, deactivated=$deactivated, description=$description, evidenceType=$evidenceType, frameworks=$frameworks, immutable=$immutable, renewalCadenceDays=$renewalCadenceDays, results=$results, resultsSummary=$resultsSummary, tagIds=$tagIds, tags=$tags, additionalProperties=$additionalProperties}"
}
