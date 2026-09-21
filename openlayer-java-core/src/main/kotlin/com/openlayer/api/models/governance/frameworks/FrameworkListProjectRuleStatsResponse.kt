// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FrameworkListProjectRuleStatsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

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
         * [FrameworkListProjectRuleStatsResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkListProjectRuleStatsResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            frameworkListProjectRuleStatsResponse: FrameworkListProjectRuleStatsResponse
        ) = apply {
            items = frameworkListProjectRuleStatsResponse.items.map { it.toMutableList() }
            additionalProperties =
                frameworkListProjectRuleStatsResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [FrameworkListProjectRuleStatsResponse].
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
        fun build(): FrameworkListProjectRuleStatsResponse =
            FrameworkListProjectRuleStatsResponse(
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): FrameworkListProjectRuleStatsResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val projectId: JsonField<String>,
        private val projectName: JsonField<String>,
        private val taskType: JsonField<String>,
        private val total: JsonField<Long>,
        private val totalDueSoon: JsonField<Long>,
        private val totalError: JsonField<Long>,
        private val totalFailing: JsonField<Long>,
        private val totalPassing: JsonField<Long>,
        private val totalPending: JsonField<Long>,
        private val totalRunning: JsonField<Long>,
        private val totalSkipped: JsonField<Long>,
        private val byRuleType: JsonField<ByRuleType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("projectName")
            @ExcludeMissing
            projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taskType")
            @ExcludeMissing
            taskType: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("byRuleType")
            @ExcludeMissing
            byRuleType: JsonField<ByRuleType> = JsonMissing.of(),
        ) : this(
            projectId,
            projectName,
            taskType,
            total,
            totalDueSoon,
            totalError,
            totalFailing,
            totalPassing,
            totalPending,
            totalRunning,
            totalSkipped,
            byRuleType,
            mutableMapOf(),
        )

        /**
         * The project id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectId(): String = projectId.getRequired("projectId")

        /**
         * The project name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectName(): String = projectName.getRequired("projectName")

        /**
         * The project's task type.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskType(): String = taskType.getRequired("taskType")

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
         * The same counts, broken down by the type of the rule each result belongs to.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun byRuleType(): Optional<ByRuleType> = byRuleType.getOptional("byRuleType")

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [projectName].
         *
         * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectName")
        @ExcludeMissing
        fun _projectName(): JsonField<String> = projectName

        /**
         * Returns the raw JSON value of [taskType].
         *
         * Unlike [taskType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskType") @ExcludeMissing fun _taskType(): JsonField<String> = taskType

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .projectId()
             * .projectName()
             * .taskType()
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

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var projectId: JsonField<String>? = null
            private var projectName: JsonField<String>? = null
            private var taskType: JsonField<String>? = null
            private var total: JsonField<Long>? = null
            private var totalDueSoon: JsonField<Long>? = null
            private var totalError: JsonField<Long>? = null
            private var totalFailing: JsonField<Long>? = null
            private var totalPassing: JsonField<Long>? = null
            private var totalPending: JsonField<Long>? = null
            private var totalRunning: JsonField<Long>? = null
            private var totalSkipped: JsonField<Long>? = null
            private var byRuleType: JsonField<ByRuleType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                projectId = item.projectId
                projectName = item.projectName
                taskType = item.taskType
                total = item.total
                totalDueSoon = item.totalDueSoon
                totalError = item.totalError
                totalFailing = item.totalFailing
                totalPassing = item.totalPassing
                totalPending = item.totalPending
                totalRunning = item.totalRunning
                totalSkipped = item.totalSkipped
                byRuleType = item.byRuleType
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The project id. */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The project name. */
            fun projectName(projectName: String) = projectName(JsonField.of(projectName))

            /**
             * Sets [Builder.projectName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectName(projectName: JsonField<String>) = apply {
                this.projectName = projectName
            }

            /** The project's task type. */
            fun taskType(taskType: String) = taskType(JsonField.of(taskType))

            /**
             * Sets [Builder.taskType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskType(taskType: JsonField<String>) = apply { this.taskType = taskType }

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

            /** The same counts, broken down by the type of the rule each result belongs to. */
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .projectId()
             * .projectName()
             * .taskType()
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
            fun build(): Item =
                Item(
                    checkRequired("projectId", projectId),
                    checkRequired("projectName", projectName),
                    checkRequired("taskType", taskType),
                    checkRequired("total", total),
                    checkRequired("totalDueSoon", totalDueSoon),
                    checkRequired("totalError", totalError),
                    checkRequired("totalFailing", totalFailing),
                    checkRequired("totalPassing", totalPassing),
                    checkRequired("totalPending", totalPending),
                    checkRequired("totalRunning", totalRunning),
                    checkRequired("totalSkipped", totalSkipped),
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
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            projectId()
            projectName()
            taskType()
            total()
            totalDueSoon()
            totalError()
            totalFailing()
            totalPassing()
            totalPending()
            totalRunning()
            totalSkipped()
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
            (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (projectName.asKnown().isPresent) 1 else 0) +
                (if (taskType.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                (if (totalError.asKnown().isPresent) 1 else 0) +
                (if (totalFailing.asKnown().isPresent) 1 else 0) +
                (if (totalPassing.asKnown().isPresent) 1 else 0) +
                (if (totalPending.asKnown().isPresent) 1 else 0) +
                (if (totalRunning.asKnown().isPresent) 1 else 0) +
                (if (totalSkipped.asKnown().isPresent) 1 else 0) +
                (byRuleType.asKnown().getOrNull()?.validity() ?: 0)

        /** The same counts, broken down by the type of the rule each result belongs to. */
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

            return other is Item &&
                projectId == other.projectId &&
                projectName == other.projectName &&
                taskType == other.taskType &&
                total == other.total &&
                totalDueSoon == other.totalDueSoon &&
                totalError == other.totalError &&
                totalFailing == other.totalFailing &&
                totalPassing == other.totalPassing &&
                totalPending == other.totalPending &&
                totalRunning == other.totalRunning &&
                totalSkipped == other.totalSkipped &&
                byRuleType == other.byRuleType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                projectId,
                projectName,
                taskType,
                total,
                totalDueSoon,
                totalError,
                totalFailing,
                totalPassing,
                totalPending,
                totalRunning,
                totalSkipped,
                byRuleType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{projectId=$projectId, projectName=$projectName, taskType=$taskType, total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, byRuleType=$byRuleType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FrameworkListProjectRuleStatsResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FrameworkListProjectRuleStatsResponse{items=$items, additionalProperties=$additionalProperties}"
}
