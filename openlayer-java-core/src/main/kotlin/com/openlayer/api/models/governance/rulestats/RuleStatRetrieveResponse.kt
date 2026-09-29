// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rulestats

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkRequired
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Counts of rules and their results by status. Narrowed by the request's filters, so `frameworkId`
 * gives one framework's compliance and `projectId` gives one project's.
 */
class RuleStatRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ruleResults: JsonField<RuleResults>,
    private val rules: JsonField<Rules>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ruleResults")
        @ExcludeMissing
        ruleResults: JsonField<RuleResults> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<Rules> = JsonMissing.of(),
    ) : this(ruleResults, rules, mutableMapOf())

    /**
     * Counts of rule results, after any filters in the request, with breakdowns by the type and
     * scope of the rule each result belongs to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ruleResults(): RuleResults = ruleResults.getRequired("ruleResults")

    /**
     * Counts of the rules themselves, after any filters in the request.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): Rules = rules.getRequired("rules")

    /**
     * Returns the raw JSON value of [ruleResults].
     *
     * Unlike [ruleResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleResults")
    @ExcludeMissing
    fun _ruleResults(): JsonField<RuleResults> = ruleResults

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<Rules> = rules

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
         * Returns a mutable builder for constructing an instance of [RuleStatRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .ruleResults()
         * .rules()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleStatRetrieveResponse]. */
    class Builder internal constructor() {

        private var ruleResults: JsonField<RuleResults>? = null
        private var rules: JsonField<Rules>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleStatRetrieveResponse: RuleStatRetrieveResponse) = apply {
            ruleResults = ruleStatRetrieveResponse.ruleResults
            rules = ruleStatRetrieveResponse.rules
            additionalProperties = ruleStatRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * Counts of rule results, after any filters in the request, with breakdowns by the type and
         * scope of the rule each result belongs to.
         */
        fun ruleResults(ruleResults: RuleResults) = ruleResults(JsonField.of(ruleResults))

        /**
         * Sets [Builder.ruleResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleResults] with a well-typed [RuleResults] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ruleResults(ruleResults: JsonField<RuleResults>) = apply {
            this.ruleResults = ruleResults
        }

        /** Counts of the rules themselves, after any filters in the request. */
        fun rules(rules: Rules) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed [Rules] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rules(rules: JsonField<Rules>) = apply { this.rules = rules }

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
         * Returns an immutable instance of [RuleStatRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ruleResults()
         * .rules()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleStatRetrieveResponse =
            RuleStatRetrieveResponse(
                checkRequired("ruleResults", ruleResults),
                checkRequired("rules", rules),
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
    fun validate(): RuleStatRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        ruleResults().validate()
        rules().validate()
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
        (ruleResults.asKnown().getOrNull()?.validity() ?: 0) +
            (rules.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Counts of rule results, after any filters in the request, with breakdowns by the type and
     * scope of the rule each result belongs to.
     */
    class RuleResults
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val total: JsonField<Long>,
        private val totalDueSoon: JsonField<Long>,
        private val totalError: JsonField<Long>,
        private val totalFailing: JsonField<Long>,
        private val totalPassing: JsonField<Long>,
        private val totalPending: JsonField<Long>,
        private val totalRunning: JsonField<Long>,
        private val totalSkipped: JsonField<Long>,
        private val byRuleScope: JsonField<ByRuleScope>,
        private val byRuleType: JsonField<ByRuleType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalDueSoon")
            @ExcludeMissing
            totalDueSoon: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalError")
            @ExcludeMissing
            totalError: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalFailing")
            @ExcludeMissing
            totalFailing: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalPassing")
            @ExcludeMissing
            totalPassing: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalPending")
            @ExcludeMissing
            totalPending: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalRunning")
            @ExcludeMissing
            totalRunning: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalSkipped")
            @ExcludeMissing
            totalSkipped: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("byRuleScope")
            @ExcludeMissing
            byRuleScope: JsonField<ByRuleScope> = JsonMissing.of(),
            @JsonProperty("byRuleType")
            @ExcludeMissing
            byRuleType: JsonField<ByRuleType> = JsonMissing.of(),
        ) : this(
            total,
            totalDueSoon,
            totalError,
            totalFailing,
            totalPassing,
            totalPending,
            totalRunning,
            totalSkipped,
            byRuleScope,
            byRuleType,
            mutableMapOf(),
        )

        /**
         * The total number of rule results.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Long = total.getRequired("total")

        /**
         * The number of rule results whose evidence is about to expire.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

        /**
         * The number of rule results that errored during evaluation.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalError(): Long = totalError.getRequired("totalError")

        /**
         * The number of failing rule results.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

        /**
         * The number of passing rule results.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

        /**
         * The number of rule results that have not been satisfied yet.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalPending(): Long = totalPending.getRequired("totalPending")

        /**
         * The number of rule results currently being evaluated.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

        /**
         * The number of skipped rule results.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun byRuleScope(): Optional<ByRuleScope> = byRuleScope.getOptional("byRuleScope")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun byRuleType(): Optional<ByRuleType> = byRuleType.getOptional("byRuleType")

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [totalDueSoon].
         *
         * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalDueSoon")
        @ExcludeMissing
        fun _totalDueSoon(): JsonField<Long> = totalDueSoon

        /**
         * Returns the raw JSON value of [totalError].
         *
         * Unlike [totalError], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalError") @ExcludeMissing fun _totalError(): JsonField<Long> = totalError

        /**
         * Returns the raw JSON value of [totalFailing].
         *
         * Unlike [totalFailing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalFailing")
        @ExcludeMissing
        fun _totalFailing(): JsonField<Long> = totalFailing

        /**
         * Returns the raw JSON value of [totalPassing].
         *
         * Unlike [totalPassing], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalPassing")
        @ExcludeMissing
        fun _totalPassing(): JsonField<Long> = totalPassing

        /**
         * Returns the raw JSON value of [totalPending].
         *
         * Unlike [totalPending], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalPending")
        @ExcludeMissing
        fun _totalPending(): JsonField<Long> = totalPending

        /**
         * Returns the raw JSON value of [totalRunning].
         *
         * Unlike [totalRunning], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRunning")
        @ExcludeMissing
        fun _totalRunning(): JsonField<Long> = totalRunning

        /**
         * Returns the raw JSON value of [totalSkipped].
         *
         * Unlike [totalSkipped], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalSkipped")
        @ExcludeMissing
        fun _totalSkipped(): JsonField<Long> = totalSkipped

        /**
         * Returns the raw JSON value of [byRuleScope].
         *
         * Unlike [byRuleScope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("byRuleScope")
        @ExcludeMissing
        fun _byRuleScope(): JsonField<ByRuleScope> = byRuleScope

        /**
         * Returns the raw JSON value of [byRuleType].
         *
         * Unlike [byRuleType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("byRuleType")
        @ExcludeMissing
        fun _byRuleType(): JsonField<ByRuleType> = byRuleType

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
             * Returns a mutable builder for constructing an instance of [RuleResults].
             *
             * The following fields are required:
             * ```java
             * .total()
             * .totalDueSoon()
             * .totalError()
             * .totalFailing()
             * .totalPassing()
             * .totalPending()
             * .totalRunning()
             * .totalSkipped()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RuleResults]. */
        class Builder internal constructor() {

            private var total: JsonField<Long>? = null
            private var totalDueSoon: JsonField<Long>? = null
            private var totalError: JsonField<Long>? = null
            private var totalFailing: JsonField<Long>? = null
            private var totalPassing: JsonField<Long>? = null
            private var totalPending: JsonField<Long>? = null
            private var totalRunning: JsonField<Long>? = null
            private var totalSkipped: JsonField<Long>? = null
            private var byRuleScope: JsonField<ByRuleScope> = JsonMissing.of()
            private var byRuleType: JsonField<ByRuleType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ruleResults: RuleResults) = apply {
                total = ruleResults.total
                totalDueSoon = ruleResults.totalDueSoon
                totalError = ruleResults.totalError
                totalFailing = ruleResults.totalFailing
                totalPassing = ruleResults.totalPassing
                totalPending = ruleResults.totalPending
                totalRunning = ruleResults.totalRunning
                totalSkipped = ruleResults.totalSkipped
                byRuleScope = ruleResults.byRuleScope
                byRuleType = ruleResults.byRuleType
                additionalProperties = ruleResults.additionalProperties.toMutableMap()
            }

            /** The total number of rule results. */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            /** The number of rule results whose evidence is about to expire. */
            fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

            /**
             * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                this.totalDueSoon = totalDueSoon
            }

            /** The number of rule results that errored during evaluation. */
            fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

            /**
             * Sets [Builder.totalError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalError] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalError(totalError: JsonField<Long>) = apply { this.totalError = totalError }

            /** The number of failing rule results. */
            fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

            /**
             * Sets [Builder.totalFailing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalFailing] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalFailing(totalFailing: JsonField<Long>) = apply {
                this.totalFailing = totalFailing
            }

            /** The number of passing rule results. */
            fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

            /**
             * Sets [Builder.totalPassing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPassing] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPassing(totalPassing: JsonField<Long>) = apply {
                this.totalPassing = totalPassing
            }

            /** The number of rule results that have not been satisfied yet. */
            fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

            /**
             * Sets [Builder.totalPending] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalPending] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalPending(totalPending: JsonField<Long>) = apply {
                this.totalPending = totalPending
            }

            /** The number of rule results currently being evaluated. */
            fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

            /**
             * Sets [Builder.totalRunning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRunning] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRunning(totalRunning: JsonField<Long>) = apply {
                this.totalRunning = totalRunning
            }

            /** The number of skipped rule results. */
            fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

            /**
             * Sets [Builder.totalSkipped] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                this.totalSkipped = totalSkipped
            }

            fun byRuleScope(byRuleScope: ByRuleScope) = byRuleScope(JsonField.of(byRuleScope))

            /**
             * Sets [Builder.byRuleScope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byRuleScope] with a well-typed [ByRuleScope] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byRuleScope(byRuleScope: JsonField<ByRuleScope>) = apply {
                this.byRuleScope = byRuleScope
            }

            fun byRuleType(byRuleType: ByRuleType) = byRuleType(JsonField.of(byRuleType))

            /**
             * Sets [Builder.byRuleType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byRuleType] with a well-typed [ByRuleType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byRuleType(byRuleType: JsonField<ByRuleType>) = apply {
                this.byRuleType = byRuleType
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
             * Returns an immutable instance of [RuleResults].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .total()
             * .totalDueSoon()
             * .totalError()
             * .totalFailing()
             * .totalPassing()
             * .totalPending()
             * .totalRunning()
             * .totalSkipped()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RuleResults =
                RuleResults(
                    checkRequired("total", total),
                    checkRequired("totalDueSoon", totalDueSoon),
                    checkRequired("totalError", totalError),
                    checkRequired("totalFailing", totalFailing),
                    checkRequired("totalPassing", totalPassing),
                    checkRequired("totalPending", totalPending),
                    checkRequired("totalRunning", totalRunning),
                    checkRequired("totalSkipped", totalSkipped),
                    byRuleScope,
                    byRuleType,
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
        fun validate(): RuleResults = apply {
            if (validated) {
                return@apply
            }

            total()
            totalDueSoon()
            totalError()
            totalFailing()
            totalPassing()
            totalPending()
            totalRunning()
            totalSkipped()
            byRuleScope().ifPresent { it.validate() }
            byRuleType().ifPresent { it.validate() }
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
            (if (total.asKnown().isPresent) 1 else 0) +
                (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                (if (totalError.asKnown().isPresent) 1 else 0) +
                (if (totalFailing.asKnown().isPresent) 1 else 0) +
                (if (totalPassing.asKnown().isPresent) 1 else 0) +
                (if (totalPending.asKnown().isPresent) 1 else 0) +
                (if (totalRunning.asKnown().isPresent) 1 else 0) +
                (if (totalSkipped.asKnown().isPresent) 1 else 0) +
                (byRuleScope.asKnown().getOrNull()?.validity() ?: 0) +
                (byRuleType.asKnown().getOrNull()?.validity() ?: 0)

        class ByRuleScope
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val project: JsonField<Project>,
            private val workspace: JsonField<Workspace>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("project")
                @ExcludeMissing
                project: JsonField<Project> = JsonMissing.of(),
                @JsonProperty("workspace")
                @ExcludeMissing
                workspace: JsonField<Workspace> = JsonMissing.of(),
            ) : this(project, workspace, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun project(): Optional<Project> = project.getOptional("project")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspace(): Optional<Workspace> = workspace.getOptional("workspace")

            /**
             * Returns the raw JSON value of [project].
             *
             * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Project> = project

            /**
             * Returns the raw JSON value of [workspace].
             *
             * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("workspace")
            @ExcludeMissing
            fun _workspace(): JsonField<Workspace> = workspace

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

                /** Returns a mutable builder for constructing an instance of [ByRuleScope]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByRuleScope]. */
            class Builder internal constructor() {

                private var project: JsonField<Project> = JsonMissing.of()
                private var workspace: JsonField<Workspace> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byRuleScope: ByRuleScope) = apply {
                    project = byRuleScope.project
                    workspace = byRuleScope.workspace
                    additionalProperties = byRuleScope.additionalProperties.toMutableMap()
                }

                fun project(project: Project) = project(JsonField.of(project))

                /**
                 * Sets [Builder.project] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.project] with a well-typed [Project] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun project(project: JsonField<Project>) = apply { this.project = project }

                fun workspace(workspace: Workspace) = workspace(JsonField.of(workspace))

                /**
                 * Sets [Builder.workspace] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workspace] with a well-typed [Workspace] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workspace(workspace: JsonField<Workspace>) = apply {
                    this.workspace = workspace
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
                 * Returns an immutable instance of [ByRuleScope].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ByRuleScope =
                    ByRuleScope(project, workspace, additionalProperties.toMutableMap())
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
            fun validate(): ByRuleScope = apply {
                if (validated) {
                    return@apply
                }

                project().ifPresent { it.validate() }
                workspace().ifPresent { it.validate() }
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
                (project.asKnown().getOrNull()?.validity() ?: 0) +
                    (workspace.asKnown().getOrNull()?.validity() ?: 0)

            class Project
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val total: JsonField<Long>,
                private val totalDueSoon: JsonField<Long>,
                private val totalError: JsonField<Long>,
                private val totalFailing: JsonField<Long>,
                private val totalPassing: JsonField<Long>,
                private val totalPending: JsonField<Long>,
                private val totalRunning: JsonField<Long>,
                private val totalSkipped: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("total")
                    @ExcludeMissing
                    total: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalDueSoon")
                    @ExcludeMissing
                    totalDueSoon: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalError")
                    @ExcludeMissing
                    totalError: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalFailing")
                    @ExcludeMissing
                    totalFailing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPassing")
                    @ExcludeMissing
                    totalPassing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPending")
                    @ExcludeMissing
                    totalPending: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalRunning")
                    @ExcludeMissing
                    totalRunning: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalSkipped")
                    @ExcludeMissing
                    totalSkipped: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    total,
                    totalDueSoon,
                    totalError,
                    totalFailing,
                    totalPassing,
                    totalPending,
                    totalRunning,
                    totalSkipped,
                    mutableMapOf(),
                )

                /**
                 * The total number of rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun total(): Long = total.getRequired("total")

                /**
                 * The number of rule results whose evidence is about to expire.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

                /**
                 * The number of rule results that errored during evaluation.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalError(): Long = totalError.getRequired("totalError")

                /**
                 * The number of failing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

                /**
                 * The number of passing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

                /**
                 * The number of rule results that have not been satisfied yet.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPending(): Long = totalPending.getRequired("totalPending")

                /**
                 * The number of rule results currently being evaluated.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

                /**
                 * The number of skipped rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

                /**
                 * Returns the raw JSON value of [total].
                 *
                 * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

                /**
                 * Returns the raw JSON value of [totalDueSoon].
                 *
                 * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalDueSoon")
                @ExcludeMissing
                fun _totalDueSoon(): JsonField<Long> = totalDueSoon

                /**
                 * Returns the raw JSON value of [totalError].
                 *
                 * Unlike [totalError], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalError")
                @ExcludeMissing
                fun _totalError(): JsonField<Long> = totalError

                /**
                 * Returns the raw JSON value of [totalFailing].
                 *
                 * Unlike [totalFailing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalFailing")
                @ExcludeMissing
                fun _totalFailing(): JsonField<Long> = totalFailing

                /**
                 * Returns the raw JSON value of [totalPassing].
                 *
                 * Unlike [totalPassing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPassing")
                @ExcludeMissing
                fun _totalPassing(): JsonField<Long> = totalPassing

                /**
                 * Returns the raw JSON value of [totalPending].
                 *
                 * Unlike [totalPending], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPending")
                @ExcludeMissing
                fun _totalPending(): JsonField<Long> = totalPending

                /**
                 * Returns the raw JSON value of [totalRunning].
                 *
                 * Unlike [totalRunning], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalRunning")
                @ExcludeMissing
                fun _totalRunning(): JsonField<Long> = totalRunning

                /**
                 * Returns the raw JSON value of [totalSkipped].
                 *
                 * Unlike [totalSkipped], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalSkipped")
                @ExcludeMissing
                fun _totalSkipped(): JsonField<Long> = totalSkipped

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
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Project]. */
                class Builder internal constructor() {

                    private var total: JsonField<Long>? = null
                    private var totalDueSoon: JsonField<Long>? = null
                    private var totalError: JsonField<Long>? = null
                    private var totalFailing: JsonField<Long>? = null
                    private var totalPassing: JsonField<Long>? = null
                    private var totalPending: JsonField<Long>? = null
                    private var totalRunning: JsonField<Long>? = null
                    private var totalSkipped: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(project: Project) = apply {
                        total = project.total
                        totalDueSoon = project.totalDueSoon
                        totalError = project.totalError
                        totalFailing = project.totalFailing
                        totalPassing = project.totalPassing
                        totalPending = project.totalPending
                        totalRunning = project.totalRunning
                        totalSkipped = project.totalSkipped
                        additionalProperties = project.additionalProperties.toMutableMap()
                    }

                    /** The total number of rule results. */
                    fun total(total: Long) = total(JsonField.of(total))

                    /**
                     * Sets [Builder.total] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.total] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun total(total: JsonField<Long>) = apply { this.total = total }

                    /** The number of rule results whose evidence is about to expire. */
                    fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

                    /**
                     * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                        this.totalDueSoon = totalDueSoon
                    }

                    /** The number of rule results that errored during evaluation. */
                    fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

                    /**
                     * Sets [Builder.totalError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalError] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalError(totalError: JsonField<Long>) = apply {
                        this.totalError = totalError
                    }

                    /** The number of failing rule results. */
                    fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

                    /**
                     * Sets [Builder.totalFailing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalFailing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalFailing(totalFailing: JsonField<Long>) = apply {
                        this.totalFailing = totalFailing
                    }

                    /** The number of passing rule results. */
                    fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

                    /**
                     * Sets [Builder.totalPassing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPassing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPassing(totalPassing: JsonField<Long>) = apply {
                        this.totalPassing = totalPassing
                    }

                    /** The number of rule results that have not been satisfied yet. */
                    fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

                    /**
                     * Sets [Builder.totalPending] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPending] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPending(totalPending: JsonField<Long>) = apply {
                        this.totalPending = totalPending
                    }

                    /** The number of rule results currently being evaluated. */
                    fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

                    /**
                     * Sets [Builder.totalRunning] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalRunning] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalRunning(totalRunning: JsonField<Long>) = apply {
                        this.totalRunning = totalRunning
                    }

                    /** The number of skipped rule results. */
                    fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

                    /**
                     * Sets [Builder.totalSkipped] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                        this.totalSkipped = totalSkipped
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
                     * Returns an immutable instance of [Project].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Project =
                        Project(
                            checkRequired("total", total),
                            checkRequired("totalDueSoon", totalDueSoon),
                            checkRequired("totalError", totalError),
                            checkRequired("totalFailing", totalFailing),
                            checkRequired("totalPassing", totalPassing),
                            checkRequired("totalPending", totalPending),
                            checkRequired("totalRunning", totalRunning),
                            checkRequired("totalSkipped", totalSkipped),
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Project = apply {
                    if (validated) {
                        return@apply
                    }

                    total()
                    totalDueSoon()
                    totalError()
                    totalFailing()
                    totalPassing()
                    totalPending()
                    totalRunning()
                    totalSkipped()
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
                    (if (total.asKnown().isPresent) 1 else 0) +
                        (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                        (if (totalError.asKnown().isPresent) 1 else 0) +
                        (if (totalFailing.asKnown().isPresent) 1 else 0) +
                        (if (totalPassing.asKnown().isPresent) 1 else 0) +
                        (if (totalPending.asKnown().isPresent) 1 else 0) +
                        (if (totalRunning.asKnown().isPresent) 1 else 0) +
                        (if (totalSkipped.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Project &&
                        total == other.total &&
                        totalDueSoon == other.totalDueSoon &&
                        totalError == other.totalError &&
                        totalFailing == other.totalFailing &&
                        totalPassing == other.totalPassing &&
                        totalPending == other.totalPending &&
                        totalRunning == other.totalRunning &&
                        totalSkipped == other.totalSkipped &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        total,
                        totalDueSoon,
                        totalError,
                        totalFailing,
                        totalPassing,
                        totalPending,
                        totalRunning,
                        totalSkipped,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Project{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, additionalProperties=$additionalProperties}"
            }

            class Workspace
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val total: JsonField<Long>,
                private val totalDueSoon: JsonField<Long>,
                private val totalError: JsonField<Long>,
                private val totalFailing: JsonField<Long>,
                private val totalPassing: JsonField<Long>,
                private val totalPending: JsonField<Long>,
                private val totalRunning: JsonField<Long>,
                private val totalSkipped: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("total")
                    @ExcludeMissing
                    total: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalDueSoon")
                    @ExcludeMissing
                    totalDueSoon: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalError")
                    @ExcludeMissing
                    totalError: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalFailing")
                    @ExcludeMissing
                    totalFailing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPassing")
                    @ExcludeMissing
                    totalPassing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPending")
                    @ExcludeMissing
                    totalPending: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalRunning")
                    @ExcludeMissing
                    totalRunning: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalSkipped")
                    @ExcludeMissing
                    totalSkipped: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    total,
                    totalDueSoon,
                    totalError,
                    totalFailing,
                    totalPassing,
                    totalPending,
                    totalRunning,
                    totalSkipped,
                    mutableMapOf(),
                )

                /**
                 * The total number of rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun total(): Long = total.getRequired("total")

                /**
                 * The number of rule results whose evidence is about to expire.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

                /**
                 * The number of rule results that errored during evaluation.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalError(): Long = totalError.getRequired("totalError")

                /**
                 * The number of failing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

                /**
                 * The number of passing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

                /**
                 * The number of rule results that have not been satisfied yet.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPending(): Long = totalPending.getRequired("totalPending")

                /**
                 * The number of rule results currently being evaluated.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

                /**
                 * The number of skipped rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

                /**
                 * Returns the raw JSON value of [total].
                 *
                 * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

                /**
                 * Returns the raw JSON value of [totalDueSoon].
                 *
                 * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalDueSoon")
                @ExcludeMissing
                fun _totalDueSoon(): JsonField<Long> = totalDueSoon

                /**
                 * Returns the raw JSON value of [totalError].
                 *
                 * Unlike [totalError], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalError")
                @ExcludeMissing
                fun _totalError(): JsonField<Long> = totalError

                /**
                 * Returns the raw JSON value of [totalFailing].
                 *
                 * Unlike [totalFailing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalFailing")
                @ExcludeMissing
                fun _totalFailing(): JsonField<Long> = totalFailing

                /**
                 * Returns the raw JSON value of [totalPassing].
                 *
                 * Unlike [totalPassing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPassing")
                @ExcludeMissing
                fun _totalPassing(): JsonField<Long> = totalPassing

                /**
                 * Returns the raw JSON value of [totalPending].
                 *
                 * Unlike [totalPending], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPending")
                @ExcludeMissing
                fun _totalPending(): JsonField<Long> = totalPending

                /**
                 * Returns the raw JSON value of [totalRunning].
                 *
                 * Unlike [totalRunning], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalRunning")
                @ExcludeMissing
                fun _totalRunning(): JsonField<Long> = totalRunning

                /**
                 * Returns the raw JSON value of [totalSkipped].
                 *
                 * Unlike [totalSkipped], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalSkipped")
                @ExcludeMissing
                fun _totalSkipped(): JsonField<Long> = totalSkipped

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
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Workspace]. */
                class Builder internal constructor() {

                    private var total: JsonField<Long>? = null
                    private var totalDueSoon: JsonField<Long>? = null
                    private var totalError: JsonField<Long>? = null
                    private var totalFailing: JsonField<Long>? = null
                    private var totalPassing: JsonField<Long>? = null
                    private var totalPending: JsonField<Long>? = null
                    private var totalRunning: JsonField<Long>? = null
                    private var totalSkipped: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(workspace: Workspace) = apply {
                        total = workspace.total
                        totalDueSoon = workspace.totalDueSoon
                        totalError = workspace.totalError
                        totalFailing = workspace.totalFailing
                        totalPassing = workspace.totalPassing
                        totalPending = workspace.totalPending
                        totalRunning = workspace.totalRunning
                        totalSkipped = workspace.totalSkipped
                        additionalProperties = workspace.additionalProperties.toMutableMap()
                    }

                    /** The total number of rule results. */
                    fun total(total: Long) = total(JsonField.of(total))

                    /**
                     * Sets [Builder.total] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.total] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun total(total: JsonField<Long>) = apply { this.total = total }

                    /** The number of rule results whose evidence is about to expire. */
                    fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

                    /**
                     * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                        this.totalDueSoon = totalDueSoon
                    }

                    /** The number of rule results that errored during evaluation. */
                    fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

                    /**
                     * Sets [Builder.totalError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalError] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalError(totalError: JsonField<Long>) = apply {
                        this.totalError = totalError
                    }

                    /** The number of failing rule results. */
                    fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

                    /**
                     * Sets [Builder.totalFailing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalFailing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalFailing(totalFailing: JsonField<Long>) = apply {
                        this.totalFailing = totalFailing
                    }

                    /** The number of passing rule results. */
                    fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

                    /**
                     * Sets [Builder.totalPassing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPassing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPassing(totalPassing: JsonField<Long>) = apply {
                        this.totalPassing = totalPassing
                    }

                    /** The number of rule results that have not been satisfied yet. */
                    fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

                    /**
                     * Sets [Builder.totalPending] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPending] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPending(totalPending: JsonField<Long>) = apply {
                        this.totalPending = totalPending
                    }

                    /** The number of rule results currently being evaluated. */
                    fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

                    /**
                     * Sets [Builder.totalRunning] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalRunning] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalRunning(totalRunning: JsonField<Long>) = apply {
                        this.totalRunning = totalRunning
                    }

                    /** The number of skipped rule results. */
                    fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

                    /**
                     * Sets [Builder.totalSkipped] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                        this.totalSkipped = totalSkipped
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
                     * Returns an immutable instance of [Workspace].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Workspace =
                        Workspace(
                            checkRequired("total", total),
                            checkRequired("totalDueSoon", totalDueSoon),
                            checkRequired("totalError", totalError),
                            checkRequired("totalFailing", totalFailing),
                            checkRequired("totalPassing", totalPassing),
                            checkRequired("totalPending", totalPending),
                            checkRequired("totalRunning", totalRunning),
                            checkRequired("totalSkipped", totalSkipped),
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Workspace = apply {
                    if (validated) {
                        return@apply
                    }

                    total()
                    totalDueSoon()
                    totalError()
                    totalFailing()
                    totalPassing()
                    totalPending()
                    totalRunning()
                    totalSkipped()
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
                    (if (total.asKnown().isPresent) 1 else 0) +
                        (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                        (if (totalError.asKnown().isPresent) 1 else 0) +
                        (if (totalFailing.asKnown().isPresent) 1 else 0) +
                        (if (totalPassing.asKnown().isPresent) 1 else 0) +
                        (if (totalPending.asKnown().isPresent) 1 else 0) +
                        (if (totalRunning.asKnown().isPresent) 1 else 0) +
                        (if (totalSkipped.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Workspace &&
                        total == other.total &&
                        totalDueSoon == other.totalDueSoon &&
                        totalError == other.totalError &&
                        totalFailing == other.totalFailing &&
                        totalPassing == other.totalPassing &&
                        totalPending == other.totalPending &&
                        totalRunning == other.totalRunning &&
                        totalSkipped == other.totalSkipped &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        total,
                        totalDueSoon,
                        totalError,
                        totalFailing,
                        totalPassing,
                        totalPending,
                        totalRunning,
                        totalSkipped,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Workspace{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByRuleScope &&
                    project == other.project &&
                    workspace == other.workspace &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(project, workspace, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByRuleScope{project=$project, workspace=$workspace, additionalProperties=$additionalProperties}"
        }

        class ByRuleType
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val evidence: JsonField<Evidence>,
            private val platform: JsonField<Platform>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("evidence")
                @ExcludeMissing
                evidence: JsonField<Evidence> = JsonMissing.of(),
                @JsonProperty("platform")
                @ExcludeMissing
                platform: JsonField<Platform> = JsonMissing.of(),
            ) : this(evidence, platform, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun evidence(): Optional<Evidence> = evidence.getOptional("evidence")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun platform(): Optional<Platform> = platform.getOptional("platform")

            /**
             * Returns the raw JSON value of [evidence].
             *
             * Unlike [evidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("evidence")
            @ExcludeMissing
            fun _evidence(): JsonField<Evidence> = evidence

            /**
             * Returns the raw JSON value of [platform].
             *
             * Unlike [platform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platform")
            @ExcludeMissing
            fun _platform(): JsonField<Platform> = platform

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

                /** Returns a mutable builder for constructing an instance of [ByRuleType]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByRuleType]. */
            class Builder internal constructor() {

                private var evidence: JsonField<Evidence> = JsonMissing.of()
                private var platform: JsonField<Platform> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byRuleType: ByRuleType) = apply {
                    evidence = byRuleType.evidence
                    platform = byRuleType.platform
                    additionalProperties = byRuleType.additionalProperties.toMutableMap()
                }

                fun evidence(evidence: Evidence) = evidence(JsonField.of(evidence))

                /**
                 * Sets [Builder.evidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evidence] with a well-typed [Evidence] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun evidence(evidence: JsonField<Evidence>) = apply { this.evidence = evidence }

                fun platform(platform: Platform) = platform(JsonField.of(platform))

                /**
                 * Sets [Builder.platform] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platform] with a well-typed [Platform] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

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
                 * Returns an immutable instance of [ByRuleType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ByRuleType =
                    ByRuleType(evidence, platform, additionalProperties.toMutableMap())
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
            fun validate(): ByRuleType = apply {
                if (validated) {
                    return@apply
                }

                evidence().ifPresent { it.validate() }
                platform().ifPresent { it.validate() }
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
                (evidence.asKnown().getOrNull()?.validity() ?: 0) +
                    (platform.asKnown().getOrNull()?.validity() ?: 0)

            class Evidence
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val total: JsonField<Long>,
                private val totalDueSoon: JsonField<Long>,
                private val totalError: JsonField<Long>,
                private val totalFailing: JsonField<Long>,
                private val totalPassing: JsonField<Long>,
                private val totalPending: JsonField<Long>,
                private val totalRunning: JsonField<Long>,
                private val totalSkipped: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("total")
                    @ExcludeMissing
                    total: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalDueSoon")
                    @ExcludeMissing
                    totalDueSoon: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalError")
                    @ExcludeMissing
                    totalError: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalFailing")
                    @ExcludeMissing
                    totalFailing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPassing")
                    @ExcludeMissing
                    totalPassing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPending")
                    @ExcludeMissing
                    totalPending: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalRunning")
                    @ExcludeMissing
                    totalRunning: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalSkipped")
                    @ExcludeMissing
                    totalSkipped: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    total,
                    totalDueSoon,
                    totalError,
                    totalFailing,
                    totalPassing,
                    totalPending,
                    totalRunning,
                    totalSkipped,
                    mutableMapOf(),
                )

                /**
                 * The total number of rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun total(): Long = total.getRequired("total")

                /**
                 * The number of rule results whose evidence is about to expire.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

                /**
                 * The number of rule results that errored during evaluation.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalError(): Long = totalError.getRequired("totalError")

                /**
                 * The number of failing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

                /**
                 * The number of passing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

                /**
                 * The number of rule results that have not been satisfied yet.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPending(): Long = totalPending.getRequired("totalPending")

                /**
                 * The number of rule results currently being evaluated.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

                /**
                 * The number of skipped rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

                /**
                 * Returns the raw JSON value of [total].
                 *
                 * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

                /**
                 * Returns the raw JSON value of [totalDueSoon].
                 *
                 * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalDueSoon")
                @ExcludeMissing
                fun _totalDueSoon(): JsonField<Long> = totalDueSoon

                /**
                 * Returns the raw JSON value of [totalError].
                 *
                 * Unlike [totalError], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalError")
                @ExcludeMissing
                fun _totalError(): JsonField<Long> = totalError

                /**
                 * Returns the raw JSON value of [totalFailing].
                 *
                 * Unlike [totalFailing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalFailing")
                @ExcludeMissing
                fun _totalFailing(): JsonField<Long> = totalFailing

                /**
                 * Returns the raw JSON value of [totalPassing].
                 *
                 * Unlike [totalPassing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPassing")
                @ExcludeMissing
                fun _totalPassing(): JsonField<Long> = totalPassing

                /**
                 * Returns the raw JSON value of [totalPending].
                 *
                 * Unlike [totalPending], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPending")
                @ExcludeMissing
                fun _totalPending(): JsonField<Long> = totalPending

                /**
                 * Returns the raw JSON value of [totalRunning].
                 *
                 * Unlike [totalRunning], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalRunning")
                @ExcludeMissing
                fun _totalRunning(): JsonField<Long> = totalRunning

                /**
                 * Returns the raw JSON value of [totalSkipped].
                 *
                 * Unlike [totalSkipped], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalSkipped")
                @ExcludeMissing
                fun _totalSkipped(): JsonField<Long> = totalSkipped

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
                     * Returns a mutable builder for constructing an instance of [Evidence].
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Evidence]. */
                class Builder internal constructor() {

                    private var total: JsonField<Long>? = null
                    private var totalDueSoon: JsonField<Long>? = null
                    private var totalError: JsonField<Long>? = null
                    private var totalFailing: JsonField<Long>? = null
                    private var totalPassing: JsonField<Long>? = null
                    private var totalPending: JsonField<Long>? = null
                    private var totalRunning: JsonField<Long>? = null
                    private var totalSkipped: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(evidence: Evidence) = apply {
                        total = evidence.total
                        totalDueSoon = evidence.totalDueSoon
                        totalError = evidence.totalError
                        totalFailing = evidence.totalFailing
                        totalPassing = evidence.totalPassing
                        totalPending = evidence.totalPending
                        totalRunning = evidence.totalRunning
                        totalSkipped = evidence.totalSkipped
                        additionalProperties = evidence.additionalProperties.toMutableMap()
                    }

                    /** The total number of rule results. */
                    fun total(total: Long) = total(JsonField.of(total))

                    /**
                     * Sets [Builder.total] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.total] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun total(total: JsonField<Long>) = apply { this.total = total }

                    /** The number of rule results whose evidence is about to expire. */
                    fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

                    /**
                     * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                        this.totalDueSoon = totalDueSoon
                    }

                    /** The number of rule results that errored during evaluation. */
                    fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

                    /**
                     * Sets [Builder.totalError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalError] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalError(totalError: JsonField<Long>) = apply {
                        this.totalError = totalError
                    }

                    /** The number of failing rule results. */
                    fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

                    /**
                     * Sets [Builder.totalFailing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalFailing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalFailing(totalFailing: JsonField<Long>) = apply {
                        this.totalFailing = totalFailing
                    }

                    /** The number of passing rule results. */
                    fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

                    /**
                     * Sets [Builder.totalPassing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPassing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPassing(totalPassing: JsonField<Long>) = apply {
                        this.totalPassing = totalPassing
                    }

                    /** The number of rule results that have not been satisfied yet. */
                    fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

                    /**
                     * Sets [Builder.totalPending] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPending] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPending(totalPending: JsonField<Long>) = apply {
                        this.totalPending = totalPending
                    }

                    /** The number of rule results currently being evaluated. */
                    fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

                    /**
                     * Sets [Builder.totalRunning] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalRunning] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalRunning(totalRunning: JsonField<Long>) = apply {
                        this.totalRunning = totalRunning
                    }

                    /** The number of skipped rule results. */
                    fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

                    /**
                     * Sets [Builder.totalSkipped] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                        this.totalSkipped = totalSkipped
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
                     * Returns an immutable instance of [Evidence].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Evidence =
                        Evidence(
                            checkRequired("total", total),
                            checkRequired("totalDueSoon", totalDueSoon),
                            checkRequired("totalError", totalError),
                            checkRequired("totalFailing", totalFailing),
                            checkRequired("totalPassing", totalPassing),
                            checkRequired("totalPending", totalPending),
                            checkRequired("totalRunning", totalRunning),
                            checkRequired("totalSkipped", totalSkipped),
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Evidence = apply {
                    if (validated) {
                        return@apply
                    }

                    total()
                    totalDueSoon()
                    totalError()
                    totalFailing()
                    totalPassing()
                    totalPending()
                    totalRunning()
                    totalSkipped()
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
                    (if (total.asKnown().isPresent) 1 else 0) +
                        (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                        (if (totalError.asKnown().isPresent) 1 else 0) +
                        (if (totalFailing.asKnown().isPresent) 1 else 0) +
                        (if (totalPassing.asKnown().isPresent) 1 else 0) +
                        (if (totalPending.asKnown().isPresent) 1 else 0) +
                        (if (totalRunning.asKnown().isPresent) 1 else 0) +
                        (if (totalSkipped.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Evidence &&
                        total == other.total &&
                        totalDueSoon == other.totalDueSoon &&
                        totalError == other.totalError &&
                        totalFailing == other.totalFailing &&
                        totalPassing == other.totalPassing &&
                        totalPending == other.totalPending &&
                        totalRunning == other.totalRunning &&
                        totalSkipped == other.totalSkipped &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        total,
                        totalDueSoon,
                        totalError,
                        totalFailing,
                        totalPassing,
                        totalPending,
                        totalRunning,
                        totalSkipped,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Evidence{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, additionalProperties=$additionalProperties}"
            }

            class Platform
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val total: JsonField<Long>,
                private val totalDueSoon: JsonField<Long>,
                private val totalError: JsonField<Long>,
                private val totalFailing: JsonField<Long>,
                private val totalPassing: JsonField<Long>,
                private val totalPending: JsonField<Long>,
                private val totalRunning: JsonField<Long>,
                private val totalSkipped: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("total")
                    @ExcludeMissing
                    total: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalDueSoon")
                    @ExcludeMissing
                    totalDueSoon: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalError")
                    @ExcludeMissing
                    totalError: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalFailing")
                    @ExcludeMissing
                    totalFailing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPassing")
                    @ExcludeMissing
                    totalPassing: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalPending")
                    @ExcludeMissing
                    totalPending: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalRunning")
                    @ExcludeMissing
                    totalRunning: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("totalSkipped")
                    @ExcludeMissing
                    totalSkipped: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    total,
                    totalDueSoon,
                    totalError,
                    totalFailing,
                    totalPassing,
                    totalPending,
                    totalRunning,
                    totalSkipped,
                    mutableMapOf(),
                )

                /**
                 * The total number of rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun total(): Long = total.getRequired("total")

                /**
                 * The number of rule results whose evidence is about to expire.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

                /**
                 * The number of rule results that errored during evaluation.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalError(): Long = totalError.getRequired("totalError")

                /**
                 * The number of failing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

                /**
                 * The number of passing rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

                /**
                 * The number of rule results that have not been satisfied yet.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalPending(): Long = totalPending.getRequired("totalPending")

                /**
                 * The number of rule results currently being evaluated.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

                /**
                 * The number of skipped rule results.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

                /**
                 * Returns the raw JSON value of [total].
                 *
                 * Unlike [total], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

                /**
                 * Returns the raw JSON value of [totalDueSoon].
                 *
                 * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalDueSoon")
                @ExcludeMissing
                fun _totalDueSoon(): JsonField<Long> = totalDueSoon

                /**
                 * Returns the raw JSON value of [totalError].
                 *
                 * Unlike [totalError], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalError")
                @ExcludeMissing
                fun _totalError(): JsonField<Long> = totalError

                /**
                 * Returns the raw JSON value of [totalFailing].
                 *
                 * Unlike [totalFailing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalFailing")
                @ExcludeMissing
                fun _totalFailing(): JsonField<Long> = totalFailing

                /**
                 * Returns the raw JSON value of [totalPassing].
                 *
                 * Unlike [totalPassing], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPassing")
                @ExcludeMissing
                fun _totalPassing(): JsonField<Long> = totalPassing

                /**
                 * Returns the raw JSON value of [totalPending].
                 *
                 * Unlike [totalPending], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalPending")
                @ExcludeMissing
                fun _totalPending(): JsonField<Long> = totalPending

                /**
                 * Returns the raw JSON value of [totalRunning].
                 *
                 * Unlike [totalRunning], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalRunning")
                @ExcludeMissing
                fun _totalRunning(): JsonField<Long> = totalRunning

                /**
                 * Returns the raw JSON value of [totalSkipped].
                 *
                 * Unlike [totalSkipped], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("totalSkipped")
                @ExcludeMissing
                fun _totalSkipped(): JsonField<Long> = totalSkipped

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
                     * Returns a mutable builder for constructing an instance of [Platform].
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Platform]. */
                class Builder internal constructor() {

                    private var total: JsonField<Long>? = null
                    private var totalDueSoon: JsonField<Long>? = null
                    private var totalError: JsonField<Long>? = null
                    private var totalFailing: JsonField<Long>? = null
                    private var totalPassing: JsonField<Long>? = null
                    private var totalPending: JsonField<Long>? = null
                    private var totalRunning: JsonField<Long>? = null
                    private var totalSkipped: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(platform: Platform) = apply {
                        total = platform.total
                        totalDueSoon = platform.totalDueSoon
                        totalError = platform.totalError
                        totalFailing = platform.totalFailing
                        totalPassing = platform.totalPassing
                        totalPending = platform.totalPending
                        totalRunning = platform.totalRunning
                        totalSkipped = platform.totalSkipped
                        additionalProperties = platform.additionalProperties.toMutableMap()
                    }

                    /** The total number of rule results. */
                    fun total(total: Long) = total(JsonField.of(total))

                    /**
                     * Sets [Builder.total] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.total] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun total(total: JsonField<Long>) = apply { this.total = total }

                    /** The number of rule results whose evidence is about to expire. */
                    fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

                    /**
                     * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                        this.totalDueSoon = totalDueSoon
                    }

                    /** The number of rule results that errored during evaluation. */
                    fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

                    /**
                     * Sets [Builder.totalError] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalError] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalError(totalError: JsonField<Long>) = apply {
                        this.totalError = totalError
                    }

                    /** The number of failing rule results. */
                    fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

                    /**
                     * Sets [Builder.totalFailing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalFailing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalFailing(totalFailing: JsonField<Long>) = apply {
                        this.totalFailing = totalFailing
                    }

                    /** The number of passing rule results. */
                    fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

                    /**
                     * Sets [Builder.totalPassing] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPassing] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPassing(totalPassing: JsonField<Long>) = apply {
                        this.totalPassing = totalPassing
                    }

                    /** The number of rule results that have not been satisfied yet. */
                    fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

                    /**
                     * Sets [Builder.totalPending] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalPending] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalPending(totalPending: JsonField<Long>) = apply {
                        this.totalPending = totalPending
                    }

                    /** The number of rule results currently being evaluated. */
                    fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

                    /**
                     * Sets [Builder.totalRunning] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalRunning] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalRunning(totalRunning: JsonField<Long>) = apply {
                        this.totalRunning = totalRunning
                    }

                    /** The number of skipped rule results. */
                    fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

                    /**
                     * Sets [Builder.totalSkipped] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                        this.totalSkipped = totalSkipped
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
                     * Returns an immutable instance of [Platform].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .total()
                     * .totalDueSoon()
                     * .totalError()
                     * .totalFailing()
                     * .totalPassing()
                     * .totalPending()
                     * .totalRunning()
                     * .totalSkipped()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Platform =
                        Platform(
                            checkRequired("total", total),
                            checkRequired("totalDueSoon", totalDueSoon),
                            checkRequired("totalError", totalError),
                            checkRequired("totalFailing", totalFailing),
                            checkRequired("totalPassing", totalPassing),
                            checkRequired("totalPending", totalPending),
                            checkRequired("totalRunning", totalRunning),
                            checkRequired("totalSkipped", totalSkipped),
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
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Platform = apply {
                    if (validated) {
                        return@apply
                    }

                    total()
                    totalDueSoon()
                    totalError()
                    totalFailing()
                    totalPassing()
                    totalPending()
                    totalRunning()
                    totalSkipped()
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
                    (if (total.asKnown().isPresent) 1 else 0) +
                        (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                        (if (totalError.asKnown().isPresent) 1 else 0) +
                        (if (totalFailing.asKnown().isPresent) 1 else 0) +
                        (if (totalPassing.asKnown().isPresent) 1 else 0) +
                        (if (totalPending.asKnown().isPresent) 1 else 0) +
                        (if (totalRunning.asKnown().isPresent) 1 else 0) +
                        (if (totalSkipped.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Platform &&
                        total == other.total &&
                        totalDueSoon == other.totalDueSoon &&
                        totalError == other.totalError &&
                        totalFailing == other.totalFailing &&
                        totalPassing == other.totalPassing &&
                        totalPending == other.totalPending &&
                        totalRunning == other.totalRunning &&
                        totalSkipped == other.totalSkipped &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        total,
                        totalDueSoon,
                        totalError,
                        totalFailing,
                        totalPassing,
                        totalPending,
                        totalRunning,
                        totalSkipped,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Platform{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByRuleType &&
                    evidence == other.evidence &&
                    platform == other.platform &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(evidence, platform, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByRuleType{evidence=$evidence, platform=$platform, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RuleResults &&
                total == other.total &&
                totalDueSoon == other.totalDueSoon &&
                totalError == other.totalError &&
                totalFailing == other.totalFailing &&
                totalPassing == other.totalPassing &&
                totalPending == other.totalPending &&
                totalRunning == other.totalRunning &&
                totalSkipped == other.totalSkipped &&
                byRuleScope == other.byRuleScope &&
                byRuleType == other.byRuleType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                total,
                totalDueSoon,
                totalError,
                totalFailing,
                totalPassing,
                totalPending,
                totalRunning,
                totalSkipped,
                byRuleScope,
                byRuleType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RuleResults{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, byRuleScope=$byRuleScope, byRuleType=$byRuleType, additionalProperties=$additionalProperties}"
    }

    /** Counts of the rules themselves, after any filters in the request. */
    class Rules
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val byScope: JsonField<ByScope>,
        private val byType: JsonField<ByType>,
        private val total: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("byScope") @ExcludeMissing byScope: JsonField<ByScope> = JsonMissing.of(),
            @JsonProperty("byType") @ExcludeMissing byType: JsonField<ByType> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        ) : this(byScope, byType, total, mutableMapOf())

        /**
         * Rule counts by scope.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun byScope(): Optional<ByScope> = byScope.getOptional("byScope")

        /**
         * Rule counts by type.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun byType(): Optional<ByType> = byType.getOptional("byType")

        /**
         * The total number of rules.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun total(): Optional<Long> = total.getOptional("total")

        /**
         * Returns the raw JSON value of [byScope].
         *
         * Unlike [byScope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("byScope") @ExcludeMissing fun _byScope(): JsonField<ByScope> = byScope

        /**
         * Returns the raw JSON value of [byType].
         *
         * Unlike [byType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("byType") @ExcludeMissing fun _byType(): JsonField<ByType> = byType

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

            /** Returns a mutable builder for constructing an instance of [Rules]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rules]. */
        class Builder internal constructor() {

            private var byScope: JsonField<ByScope> = JsonMissing.of()
            private var byType: JsonField<ByType> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rules: Rules) = apply {
                byScope = rules.byScope
                byType = rules.byType
                total = rules.total
                additionalProperties = rules.additionalProperties.toMutableMap()
            }

            /** Rule counts by scope. */
            fun byScope(byScope: ByScope) = byScope(JsonField.of(byScope))

            /**
             * Sets [Builder.byScope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byScope] with a well-typed [ByScope] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byScope(byScope: JsonField<ByScope>) = apply { this.byScope = byScope }

            /** Rule counts by type. */
            fun byType(byType: ByType) = byType(JsonField.of(byType))

            /**
             * Sets [Builder.byType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.byType] with a well-typed [ByType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun byType(byType: JsonField<ByType>) = apply { this.byType = byType }

            /** The total number of rules. */
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
             * Returns an immutable instance of [Rules].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Rules = Rules(byScope, byType, total, additionalProperties.toMutableMap())
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
        fun validate(): Rules = apply {
            if (validated) {
                return@apply
            }

            byScope().ifPresent { it.validate() }
            byType().ifPresent { it.validate() }
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
            (byScope.asKnown().getOrNull()?.validity() ?: 0) +
                (byType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (total.asKnown().isPresent) 1 else 0)

        /** Rule counts by scope. */
        class ByScope
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val project: JsonField<Long>,
            private val workspace: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("project")
                @ExcludeMissing
                project: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("workspace")
                @ExcludeMissing
                workspace: JsonField<Long> = JsonMissing.of(),
            ) : this(project, workspace, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun project(): Optional<Long> = project.getOptional("project")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspace(): Optional<Long> = workspace.getOptional("workspace")

            /**
             * Returns the raw JSON value of [project].
             *
             * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Long> = project

            /**
             * Returns the raw JSON value of [workspace].
             *
             * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("workspace") @ExcludeMissing fun _workspace(): JsonField<Long> = workspace

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

                /** Returns a mutable builder for constructing an instance of [ByScope]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByScope]. */
            class Builder internal constructor() {

                private var project: JsonField<Long> = JsonMissing.of()
                private var workspace: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byScope: ByScope) = apply {
                    project = byScope.project
                    workspace = byScope.workspace
                    additionalProperties = byScope.additionalProperties.toMutableMap()
                }

                fun project(project: Long) = project(JsonField.of(project))

                /**
                 * Sets [Builder.project] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.project] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun project(project: JsonField<Long>) = apply { this.project = project }

                fun workspace(workspace: Long) = workspace(JsonField.of(workspace))

                /**
                 * Sets [Builder.workspace] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workspace] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workspace(workspace: JsonField<Long>) = apply { this.workspace = workspace }

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
                 * Returns an immutable instance of [ByScope].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ByScope =
                    ByScope(project, workspace, additionalProperties.toMutableMap())
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
            fun validate(): ByScope = apply {
                if (validated) {
                    return@apply
                }

                project()
                workspace()
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
                (if (project.asKnown().isPresent) 1 else 0) +
                    (if (workspace.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByScope &&
                    project == other.project &&
                    workspace == other.workspace &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(project, workspace, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByScope{project=$project, workspace=$workspace, additionalProperties=$additionalProperties}"
        }

        /** Rule counts by type. */
        class ByType
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val evidence: JsonField<Long>,
            private val platform: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("evidence")
                @ExcludeMissing
                evidence: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("platform")
                @ExcludeMissing
                platform: JsonField<Long> = JsonMissing.of(),
            ) : this(evidence, platform, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun evidence(): Optional<Long> = evidence.getOptional("evidence")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun platform(): Optional<Long> = platform.getOptional("platform")

            /**
             * Returns the raw JSON value of [evidence].
             *
             * Unlike [evidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("evidence") @ExcludeMissing fun _evidence(): JsonField<Long> = evidence

            /**
             * Returns the raw JSON value of [platform].
             *
             * Unlike [platform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<Long> = platform

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

                /** Returns a mutable builder for constructing an instance of [ByType]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ByType]. */
            class Builder internal constructor() {

                private var evidence: JsonField<Long> = JsonMissing.of()
                private var platform: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(byType: ByType) = apply {
                    evidence = byType.evidence
                    platform = byType.platform
                    additionalProperties = byType.additionalProperties.toMutableMap()
                }

                fun evidence(evidence: Long) = evidence(JsonField.of(evidence))

                /**
                 * Sets [Builder.evidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evidence] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun evidence(evidence: JsonField<Long>) = apply { this.evidence = evidence }

                fun platform(platform: Long) = platform(JsonField.of(platform))

                /**
                 * Sets [Builder.platform] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platform] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun platform(platform: JsonField<Long>) = apply { this.platform = platform }

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
                 * Returns an immutable instance of [ByType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ByType =
                    ByType(evidence, platform, additionalProperties.toMutableMap())
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
            fun validate(): ByType = apply {
                if (validated) {
                    return@apply
                }

                evidence()
                platform()
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
                (if (evidence.asKnown().isPresent) 1 else 0) +
                    (if (platform.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ByType &&
                    evidence == other.evidence &&
                    platform == other.platform &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(evidence, platform, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ByType{evidence=$evidence, platform=$platform, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rules &&
                byScope == other.byScope &&
                byType == other.byType &&
                total == other.total &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(byScope, byType, total, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rules{byScope=$byScope, byType=$byType, total=$total, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleStatRetrieveResponse &&
            ruleResults == other.ruleResults &&
            rules == other.rules &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(ruleResults, rules, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleStatRetrieveResponse{ruleResults=$ruleResults, rules=$rules, additionalProperties=$additionalProperties}"
}
