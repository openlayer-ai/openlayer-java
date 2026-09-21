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
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a governance rule in a workspace.
 *
 * A rule is one requirement. Its `type` decides how it is satisfied, and the two types accept
 * different fields:
 * - `platform` rules are evaluated automatically from the state of your workspace. Set
 *   `automationType` to the signal to check. Their `scope` must be `project`, and `evidenceType`
 *   and `renewalCadenceDays` must be omitted or `null`.
 * - `evidence` rules are satisfied by attaching evidence. Set `evidenceType` to the kind of
 *   evidence that satisfies them. `automationType` and `automationParams` must be omitted or
 *   `null`.
 *
 * A new rule belongs to no framework. Map it to one from the Openlayer app.
 */
class RuleCreateParams
private constructor(
    private val workspaceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /**
     * The rule name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Whether the rule is evaluated once for the whole workspace, or once per project the rule's
     * frameworks apply to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): Scope = body.scope()

    /**
     * `platform` rules are evaluated automatically from the state of your Openlayer workspace.
     * `evidence` rules are satisfied by attaching evidence.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * The user responsible for satisfying the rule.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assigneeId(): Optional<String> = body.assigneeId()

    /**
     * Configuration for the platform check, when the automation takes parameters.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automationParams(): Optional<AutomationParams> = body.automationParams()

    /**
     * Which workspace signal a platform rule checks, for example `monitoring_mode_enabled`,
     * `test_setup`, or `project_owner_set`. `null` for evidence rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun automationType(): Optional<String> = body.automationType()

    /**
     * Whether the rule is excluded from compliance calculations.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deactivated(): Optional<Boolean> = body.deactivated()

    /**
     * What the rule requires.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The kind of evidence that satisfies the rule. `null` for platform rules.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evidenceType(): Optional<EvidenceType> = body.evidenceType()

    /**
     * How often evidence must be renewed, in days. Once evidence is older than this, the rule
     * result becomes `due_soon` and then `failing`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun renewalCadenceDays(): Optional<Long> = body.renewalCadenceDays()

    /**
     * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them back
     * from `tags`, and list the tags available in the workspace with `GET
     * /workspaces/{workspaceId}/rule-tags`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagIds(): Optional<List<String>> = body.tagIds()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scope(): JsonField<Scope> = body._scope()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [assigneeId].
     *
     * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assigneeId(): JsonField<String> = body._assigneeId()

    /**
     * Returns the raw JSON value of [automationParams].
     *
     * Unlike [automationParams], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _automationParams(): JsonField<AutomationParams> = body._automationParams()

    /**
     * Returns the raw JSON value of [automationType].
     *
     * Unlike [automationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _automationType(): JsonField<String> = body._automationType()

    /**
     * Returns the raw JSON value of [deactivated].
     *
     * Unlike [deactivated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _deactivated(): JsonField<Boolean> = body._deactivated()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [evidenceType].
     *
     * Unlike [evidenceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _evidenceType(): JsonField<EvidenceType> = body._evidenceType()

    /**
     * Returns the raw JSON value of [renewalCadenceDays].
     *
     * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _renewalCadenceDays(): JsonField<Long> = body._renewalCadenceDays()

    /**
     * Returns the raw JSON value of [tagIds].
     *
     * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tagIds(): JsonField<List<String>> = body._tagIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RuleCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .scope()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleCreateParams]. */
    class Builder internal constructor() {

        private var workspaceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleCreateParams: RuleCreateParams) = apply {
            workspaceId = ruleCreateParams.workspaceId
            body = ruleCreateParams.body.toBuilder()
            additionalHeaders = ruleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleCreateParams.additionalQueryParams.toBuilder()
        }

        fun workspaceId(workspaceId: String?) = apply { this.workspaceId = workspaceId }

        /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [scope]
         * - [type]
         * - [assigneeId]
         * - [automationParams]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The rule name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Whether the rule is evaluated once for the whole workspace, or once per project the
         * rule's frameworks apply to.
         */
        fun scope(scope: Scope) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { body.scope(scope) }

        /**
         * `platform` rules are evaluated automatically from the state of your Openlayer workspace.
         * `evidence` rules are satisfied by attaching evidence.
         */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** The user responsible for satisfying the rule. */
        fun assigneeId(assigneeId: String?) = apply { body.assigneeId(assigneeId) }

        /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
        fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

        /**
         * Sets [Builder.assigneeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assigneeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assigneeId(assigneeId: JsonField<String>) = apply { body.assigneeId(assigneeId) }

        /** Configuration for the platform check, when the automation takes parameters. */
        fun automationParams(automationParams: AutomationParams?) = apply {
            body.automationParams(automationParams)
        }

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
            body.automationParams(automationParams)
        }

        /**
         * Which workspace signal a platform rule checks, for example `monitoring_mode_enabled`,
         * `test_setup`, or `project_owner_set`. `null` for evidence rules.
         */
        fun automationType(automationType: String?) = apply { body.automationType(automationType) }

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
            body.automationType(automationType)
        }

        /** Whether the rule is excluded from compliance calculations. */
        fun deactivated(deactivated: Boolean) = apply { body.deactivated(deactivated) }

        /**
         * Sets [Builder.deactivated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deactivated] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deactivated(deactivated: JsonField<Boolean>) = apply { body.deactivated(deactivated) }

        /** What the rule requires. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The kind of evidence that satisfies the rule. `null` for platform rules. */
        fun evidenceType(evidenceType: EvidenceType?) = apply { body.evidenceType(evidenceType) }

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
            body.evidenceType(evidenceType)
        }

        /**
         * How often evidence must be renewed, in days. Once evidence is older than this, the rule
         * result becomes `due_soon` and then `failing`.
         */
        fun renewalCadenceDays(renewalCadenceDays: Long?) = apply {
            body.renewalCadenceDays(renewalCadenceDays)
        }

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
            body.renewalCadenceDays(renewalCadenceDays)
        }

        /**
         * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them
         * back from `tags`, and list the tags available in the workspace with `GET
         * /workspaces/{workspaceId}/rule-tags`.
         */
        fun tagIds(tagIds: List<String>?) = apply { body.tagIds(tagIds) }

        /** Alias for calling [Builder.tagIds] with `tagIds.orElse(null)`. */
        fun tagIds(tagIds: Optional<List<String>>) = tagIds(tagIds.getOrNull())

        /**
         * Sets [Builder.tagIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagIds(tagIds: JsonField<List<String>>) = apply { body.tagIds(tagIds) }

        /**
         * Adds a single [String] to [tagIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTagId(tagId: String) = apply { body.addTagId(tagId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        /**
         * Returns an immutable instance of [RuleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .scope()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleCreateParams =
            RuleCreateParams(
                workspaceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> workspaceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val scope: JsonField<Scope>,
        private val type: JsonField<Type>,
        private val assigneeId: JsonField<String>,
        private val automationParams: JsonField<AutomationParams>,
        private val automationType: JsonField<String>,
        private val deactivated: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val evidenceType: JsonField<EvidenceType>,
        private val renewalCadenceDays: JsonField<Long>,
        private val tagIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
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
            @JsonProperty("renewalCadenceDays")
            @ExcludeMissing
            renewalCadenceDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tagIds")
            @ExcludeMissing
            tagIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            name,
            scope,
            type,
            assigneeId,
            automationParams,
            automationType,
            deactivated,
            description,
            evidenceType,
            renewalCadenceDays,
            tagIds,
            mutableMapOf(),
        )

        /**
         * The rule name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Whether the rule is evaluated once for the whole workspace, or once per project the
         * rule's frameworks apply to.
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
         * The user responsible for satisfying the rule.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assigneeId(): Optional<String> = assigneeId.getOptional("assigneeId")

        /**
         * Configuration for the platform check, when the automation takes parameters.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun automationParams(): Optional<AutomationParams> =
            automationParams.getOptional("automationParams")

        /**
         * Which workspace signal a platform rule checks, for example `monitoring_mode_enabled`,
         * `test_setup`, or `project_owner_set`. `null` for evidence rules.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun automationType(): Optional<String> = automationType.getOptional("automationType")

        /**
         * Whether the rule is excluded from compliance calculations.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

        /**
         * What the rule requires.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The kind of evidence that satisfies the rule. `null` for platform rules.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evidenceType(): Optional<EvidenceType> = evidenceType.getOptional("evidenceType")

        /**
         * How often evidence must be renewed, in days. Once evidence is older than this, the rule
         * result becomes `due_soon` and then `failing`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun renewalCadenceDays(): Optional<Long> =
            renewalCadenceDays.getOptional("renewalCadenceDays")

        /**
         * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read them
         * back from `tags`, and list the tags available in the workspace with `GET
         * /workspaces/{workspaceId}/rule-tags`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tagIds(): Optional<List<String>> = tagIds.getOptional("tagIds")

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
         * Returns the raw JSON value of [assigneeId].
         *
         * Unlike [assigneeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assigneeId")
        @ExcludeMissing
        fun _assigneeId(): JsonField<String> = assigneeId

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
         * Unlike [automationType], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [evidenceType].
         *
         * Unlike [evidenceType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evidenceType")
        @ExcludeMissing
        fun _evidenceType(): JsonField<EvidenceType> = evidenceType

        /**
         * Returns the raw JSON value of [renewalCadenceDays].
         *
         * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("renewalCadenceDays")
        @ExcludeMissing
        fun _renewalCadenceDays(): JsonField<Long> = renewalCadenceDays

        /**
         * Returns the raw JSON value of [tagIds].
         *
         * Unlike [tagIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tagIds") @ExcludeMissing fun _tagIds(): JsonField<List<String>> = tagIds

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .scope()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var scope: JsonField<Scope>? = null
            private var type: JsonField<Type>? = null
            private var assigneeId: JsonField<String> = JsonMissing.of()
            private var automationParams: JsonField<AutomationParams> = JsonMissing.of()
            private var automationType: JsonField<String> = JsonMissing.of()
            private var deactivated: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var evidenceType: JsonField<EvidenceType> = JsonMissing.of()
            private var renewalCadenceDays: JsonField<Long> = JsonMissing.of()
            private var tagIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                scope = body.scope
                type = body.type
                assigneeId = body.assigneeId
                automationParams = body.automationParams
                automationType = body.automationType
                deactivated = body.deactivated
                description = body.description
                evidenceType = body.evidenceType
                renewalCadenceDays = body.renewalCadenceDays
                tagIds = body.tagIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The rule name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            /**
             * `platform` rules are evaluated automatically from the state of your Openlayer
             * workspace. `evidence` rules are satisfied by attaching evidence.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** The user responsible for satisfying the rule. */
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

            /** Configuration for the platform check, when the automation takes parameters. */
            fun automationParams(automationParams: AutomationParams?) =
                automationParams(JsonField.ofNullable(automationParams))

            /**
             * Alias for calling [Builder.automationParams] with `automationParams.orElse(null)`.
             */
            fun automationParams(automationParams: Optional<AutomationParams>) =
                automationParams(automationParams.getOrNull())

            /**
             * Sets [Builder.automationParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automationParams] with a well-typed
             * [AutomationParams] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * You should usually call [Builder.deactivated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deactivated(deactivated: JsonField<Boolean>) = apply {
                this.deactivated = deactivated
            }

            /** What the rule requires. */
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

            /**
             * How often evidence must be renewed, in days. Once evidence is older than this, the
             * rule result becomes `due_soon` and then `failing`.
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
             * Alias for calling [Builder.renewalCadenceDays] with
             * `renewalCadenceDays.orElse(null)`.
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
             * The ids of the rule tags to associate with the rule. Replaces the rule's tags. Read
             * them back from `tags`, and list the tags available in the workspace with `GET
             * /workspaces/{workspaceId}/rule-tags`.
             */
            fun tagIds(tagIds: List<String>?) = tagIds(JsonField.ofNullable(tagIds))

            /** Alias for calling [Builder.tagIds] with `tagIds.orElse(null)`. */
            fun tagIds(tagIds: Optional<List<String>>) = tagIds(tagIds.getOrNull())

            /**
             * Sets [Builder.tagIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tagIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .scope()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("scope", scope),
                    checkRequired("type", type),
                    assigneeId,
                    automationParams,
                    automationType,
                    deactivated,
                    description,
                    evidenceType,
                    renewalCadenceDays,
                    (tagIds ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            scope().validate()
            type().validate()
            assigneeId()
            automationParams().ifPresent { it.validate() }
            automationType()
            deactivated()
            description()
            evidenceType().ifPresent { it.validate() }
            renewalCadenceDays()
            tagIds()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (assigneeId.asKnown().isPresent) 1 else 0) +
                (automationParams.asKnown().getOrNull()?.validity() ?: 0) +
                (if (automationType.asKnown().isPresent) 1 else 0) +
                (if (deactivated.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (evidenceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (renewalCadenceDays.asKnown().isPresent) 1 else 0) +
                (tagIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                scope == other.scope &&
                type == other.type &&
                assigneeId == other.assigneeId &&
                automationParams == other.automationParams &&
                automationType == other.automationType &&
                deactivated == other.deactivated &&
                description == other.description &&
                evidenceType == other.evidenceType &&
                renewalCadenceDays == other.renewalCadenceDays &&
                tagIds == other.tagIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                scope,
                type,
                assigneeId,
                automationParams,
                automationType,
                deactivated,
                description,
                evidenceType,
                renewalCadenceDays,
                tagIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, scope=$scope, type=$type, assigneeId=$assigneeId, automationParams=$automationParams, automationType=$automationType, deactivated=$deactivated, description=$description, evidenceType=$evidenceType, renewalCadenceDays=$renewalCadenceDays, tagIds=$tagIds, additionalProperties=$additionalProperties}"
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleCreateParams &&
            workspaceId == other.workspaceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(workspaceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuleCreateParams{workspaceId=$workspaceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
