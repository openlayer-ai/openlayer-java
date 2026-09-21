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
import com.openlayer.api.core.checkRequired
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects

class FrameworkExportResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val taskResultId: JsonField<String>,
    private val taskResultUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("taskResultId")
        @ExcludeMissing
        taskResultId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taskResultUrl")
        @ExcludeMissing
        taskResultUrl: JsonField<String> = JsonMissing.of(),
    ) : this(taskResultId, taskResultUrl, mutableMapOf())

    /**
     * The background task id, for `GET /background-tasks/{taskId}`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskResultId(): String = taskResultId.getRequired("taskResultId")

    /**
     * The path to poll for this export's status and result. Already `/v1`-prefixed, so it is
     * relative to the API host rather than to the `/v1` base url -- or just pass `taskResultId` to
     * `GET /background-tasks/{taskId}`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taskResultUrl(): String = taskResultUrl.getRequired("taskResultUrl")

    /**
     * Returns the raw JSON value of [taskResultId].
     *
     * Unlike [taskResultId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskResultId")
    @ExcludeMissing
    fun _taskResultId(): JsonField<String> = taskResultId

    /**
     * Returns the raw JSON value of [taskResultUrl].
     *
     * Unlike [taskResultUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskResultUrl")
    @ExcludeMissing
    fun _taskResultUrl(): JsonField<String> = taskResultUrl

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
         * Returns a mutable builder for constructing an instance of [FrameworkExportResponse].
         *
         * The following fields are required:
         * ```java
         * .taskResultId()
         * .taskResultUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkExportResponse]. */
    class Builder internal constructor() {

        private var taskResultId: JsonField<String>? = null
        private var taskResultUrl: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(frameworkExportResponse: FrameworkExportResponse) = apply {
            taskResultId = frameworkExportResponse.taskResultId
            taskResultUrl = frameworkExportResponse.taskResultUrl
            additionalProperties = frameworkExportResponse.additionalProperties.toMutableMap()
        }

        /** The background task id, for `GET /background-tasks/{taskId}`. */
        fun taskResultId(taskResultId: String) = taskResultId(JsonField.of(taskResultId))

        /**
         * Sets [Builder.taskResultId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskResultId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taskResultId(taskResultId: JsonField<String>) = apply {
            this.taskResultId = taskResultId
        }

        /**
         * The path to poll for this export's status and result. Already `/v1`-prefixed, so it is
         * relative to the API host rather than to the `/v1` base url -- or just pass `taskResultId`
         * to `GET /background-tasks/{taskId}`.
         */
        fun taskResultUrl(taskResultUrl: String) = taskResultUrl(JsonField.of(taskResultUrl))

        /**
         * Sets [Builder.taskResultUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskResultUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taskResultUrl(taskResultUrl: JsonField<String>) = apply {
            this.taskResultUrl = taskResultUrl
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
         * Returns an immutable instance of [FrameworkExportResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .taskResultId()
         * .taskResultUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FrameworkExportResponse =
            FrameworkExportResponse(
                checkRequired("taskResultId", taskResultId),
                checkRequired("taskResultUrl", taskResultUrl),
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
    fun validate(): FrameworkExportResponse = apply {
        if (validated) {
            return@apply
        }

        taskResultId()
        taskResultUrl()
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
        (if (taskResultId.asKnown().isPresent) 1 else 0) +
            (if (taskResultUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FrameworkExportResponse &&
            taskResultId == other.taskResultId &&
            taskResultUrl == other.taskResultUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(taskResultId, taskResultUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FrameworkExportResponse{taskResultId=$taskResultId, taskResultUrl=$taskResultUrl, additionalProperties=$additionalProperties}"
}
