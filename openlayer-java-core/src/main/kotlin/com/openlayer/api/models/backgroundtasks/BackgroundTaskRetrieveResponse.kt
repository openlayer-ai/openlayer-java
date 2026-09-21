// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.backgroundtasks

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BackgroundTaskRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val complete: JsonField<Boolean>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val progress: JsonField<Float>,
    private val error: JsonField<String>,
    private val outputs: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("complete") @ExcludeMissing complete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("progress") @ExcludeMissing progress: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
    ) : this(id, complete, dateCreated, dateUpdated, name, progress, error, outputs, mutableMapOf())

    /**
     * The background task id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether the task has finished. Check this before reading `outputs`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun complete(): Boolean = complete.getRequired("complete")

    /**
     * When the task was queued.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /**
     * When the task last reported progress.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /**
     * The task's internal name, including the arguments it was queued with.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * How far along the task is, from 0 to 100.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun progress(): Float = progress.getRequired("progress")

    /**
     * Why the task failed, or `null` if it has not failed.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Whatever the task produced, keyed by name. `null` until the task completes. A framework
     * export returns `storageUri` -- pass it to `GET /storage/presigned-url` to download the
     * archive -- along with `filename`, `controlCount`, `evidenceCount` and `missingEvidenceCount`.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = backgroundTaskRetrieveResponse.outputs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [complete].
     *
     * Unlike [complete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("complete") @ExcludeMissing fun _complete(): JsonField<Boolean> = complete

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
     * Returns the raw JSON value of [progress].
     *
     * Unlike [progress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress") @ExcludeMissing fun _progress(): JsonField<Float> = progress

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
         * [BackgroundTaskRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .complete()
         * .dateCreated()
         * .dateUpdated()
         * .name()
         * .progress()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BackgroundTaskRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var complete: JsonField<Boolean>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var progress: JsonField<Float>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var outputs: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(backgroundTaskRetrieveResponse: BackgroundTaskRetrieveResponse) = apply {
            id = backgroundTaskRetrieveResponse.id
            complete = backgroundTaskRetrieveResponse.complete
            dateCreated = backgroundTaskRetrieveResponse.dateCreated
            dateUpdated = backgroundTaskRetrieveResponse.dateUpdated
            name = backgroundTaskRetrieveResponse.name
            progress = backgroundTaskRetrieveResponse.progress
            error = backgroundTaskRetrieveResponse.error
            outputs = backgroundTaskRetrieveResponse.outputs
            additionalProperties =
                backgroundTaskRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The background task id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Whether the task has finished. Check this before reading `outputs`. */
        fun complete(complete: Boolean) = complete(JsonField.of(complete))

        /**
         * Sets [Builder.complete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun complete(complete: JsonField<Boolean>) = apply { this.complete = complete }

        /** When the task was queued. */
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

        /** When the task last reported progress. */
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

        /** The task's internal name, including the arguments it was queued with. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** How far along the task is, from 0 to 100. */
        fun progress(progress: Float) = progress(JsonField.of(progress))

        /**
         * Sets [Builder.progress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progress] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun progress(progress: JsonField<Float>) = apply { this.progress = progress }

        /** Why the task failed, or `null` if it has not failed. */
        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /**
         * Whatever the task produced, keyed by name. `null` until the task completes. A framework
         * export returns `storageUri` -- pass it to `GET /storage/presigned-url` to download the
         * archive -- along with `filename`, `controlCount`, `evidenceCount` and
         * `missingEvidenceCount`.
         */
        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

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
         * Returns an immutable instance of [BackgroundTaskRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .complete()
         * .dateCreated()
         * .dateUpdated()
         * .name()
         * .progress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BackgroundTaskRetrieveResponse =
            BackgroundTaskRetrieveResponse(
                checkRequired("id", id),
                checkRequired("complete", complete),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("name", name),
                checkRequired("progress", progress),
                error,
                outputs,
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
    fun validate(): BackgroundTaskRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        complete()
        dateCreated()
        dateUpdated()
        name()
        progress()
        error()
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
            (if (complete.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (progress.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BackgroundTaskRetrieveResponse &&
            id == other.id &&
            complete == other.complete &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            name == other.name &&
            progress == other.progress &&
            error == other.error &&
            outputs == other.outputs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            complete,
            dateCreated,
            dateUpdated,
            name,
            progress,
            error,
            outputs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BackgroundTaskRetrieveResponse{id=$id, complete=$complete, dateCreated=$dateCreated, dateUpdated=$dateUpdated, name=$name, progress=$progress, error=$error, outputs=$outputs, additionalProperties=$additionalProperties}"
}
