// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.tests

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
import kotlin.jvm.optionals.getOrNull

class TestEvaluateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val pipelineCount: JsonField<Long>,
    private val requestedEndTimestamp: JsonField<Long>,
    private val requestedStartTimestamp: JsonField<Long>,
    private val tasks: JsonField<List<Task>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pipelineCount")
        @ExcludeMissing
        pipelineCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("requestedEndTimestamp")
        @ExcludeMissing
        requestedEndTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("requestedStartTimestamp")
        @ExcludeMissing
        requestedStartTimestamp: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tasks") @ExcludeMissing tasks: JsonField<List<Task>> = JsonMissing.of(),
    ) : this(
        message,
        pipelineCount,
        requestedEndTimestamp,
        requestedStartTimestamp,
        tasks,
        mutableMapOf(),
    )

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Number of inference pipelines the test was queued for evaluation on
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pipelineCount(): Long = pipelineCount.getRequired("pipelineCount")

    /**
     * The end timestamp you requested (in seconds)
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedEndTimestamp(): Long = requestedEndTimestamp.getRequired("requestedEndTimestamp")

    /**
     * The start timestamp you requested (in seconds)
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedStartTimestamp(): Long =
        requestedStartTimestamp.getRequired("requestedStartTimestamp")

    /**
     * Array of background task information for each pipeline evaluation
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tasks(): List<Task> = tasks.getRequired("tasks")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [pipelineCount].
     *
     * Unlike [pipelineCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pipelineCount")
    @ExcludeMissing
    fun _pipelineCount(): JsonField<Long> = pipelineCount

    /**
     * Returns the raw JSON value of [requestedEndTimestamp].
     *
     * Unlike [requestedEndTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requestedEndTimestamp")
    @ExcludeMissing
    fun _requestedEndTimestamp(): JsonField<Long> = requestedEndTimestamp

    /**
     * Returns the raw JSON value of [requestedStartTimestamp].
     *
     * Unlike [requestedStartTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requestedStartTimestamp")
    @ExcludeMissing
    fun _requestedStartTimestamp(): JsonField<Long> = requestedStartTimestamp

    /**
     * Returns the raw JSON value of [tasks].
     *
     * Unlike [tasks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tasks") @ExcludeMissing fun _tasks(): JsonField<List<Task>> = tasks

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
         * Returns a mutable builder for constructing an instance of [TestEvaluateResponse].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .pipelineCount()
         * .requestedEndTimestamp()
         * .requestedStartTimestamp()
         * .tasks()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestEvaluateResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String>? = null
        private var pipelineCount: JsonField<Long>? = null
        private var requestedEndTimestamp: JsonField<Long>? = null
        private var requestedStartTimestamp: JsonField<Long>? = null
        private var tasks: JsonField<MutableList<Task>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testEvaluateResponse: TestEvaluateResponse) = apply {
            message = testEvaluateResponse.message
            pipelineCount = testEvaluateResponse.pipelineCount
            requestedEndTimestamp = testEvaluateResponse.requestedEndTimestamp
            requestedStartTimestamp = testEvaluateResponse.requestedStartTimestamp
            tasks = testEvaluateResponse.tasks.map { it.toMutableList() }
            additionalProperties = testEvaluateResponse.additionalProperties.toMutableMap()
        }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Number of inference pipelines the test was queued for evaluation on */
        fun pipelineCount(pipelineCount: Long) = pipelineCount(JsonField.of(pipelineCount))

        /**
         * Sets [Builder.pipelineCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pipelineCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pipelineCount(pipelineCount: JsonField<Long>) = apply {
            this.pipelineCount = pipelineCount
        }

        /** The end timestamp you requested (in seconds) */
        fun requestedEndTimestamp(requestedEndTimestamp: Long) =
            requestedEndTimestamp(JsonField.of(requestedEndTimestamp))

        /**
         * Sets [Builder.requestedEndTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedEndTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedEndTimestamp(requestedEndTimestamp: JsonField<Long>) = apply {
            this.requestedEndTimestamp = requestedEndTimestamp
        }

        /** The start timestamp you requested (in seconds) */
        fun requestedStartTimestamp(requestedStartTimestamp: Long) =
            requestedStartTimestamp(JsonField.of(requestedStartTimestamp))

        /**
         * Sets [Builder.requestedStartTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedStartTimestamp] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedStartTimestamp(requestedStartTimestamp: JsonField<Long>) = apply {
            this.requestedStartTimestamp = requestedStartTimestamp
        }

        /** Array of background task information for each pipeline evaluation */
        fun tasks(tasks: List<Task>) = tasks(JsonField.of(tasks))

        /**
         * Sets [Builder.tasks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tasks] with a well-typed `List<Task>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tasks(tasks: JsonField<List<Task>>) = apply {
            this.tasks = tasks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Task] to [tasks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTask(task: Task) = apply {
            tasks =
                (tasks ?: JsonField.of(mutableListOf())).also { checkKnown("tasks", it).add(task) }
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
         * Returns an immutable instance of [TestEvaluateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * .pipelineCount()
         * .requestedEndTimestamp()
         * .requestedStartTimestamp()
         * .tasks()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestEvaluateResponse =
            TestEvaluateResponse(
                checkRequired("message", message),
                checkRequired("pipelineCount", pipelineCount),
                checkRequired("requestedEndTimestamp", requestedEndTimestamp),
                checkRequired("requestedStartTimestamp", requestedStartTimestamp),
                checkRequired("tasks", tasks).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TestEvaluateResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        pipelineCount()
        requestedEndTimestamp()
        requestedStartTimestamp()
        tasks().forEach { it.validate() }
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
        (if (message.asKnown().isPresent) 1 else 0) +
            (if (pipelineCount.asKnown().isPresent) 1 else 0) +
            (if (requestedEndTimestamp.asKnown().isPresent) 1 else 0) +
            (if (requestedStartTimestamp.asKnown().isPresent) 1 else 0) +
            (tasks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Task
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val pipelineId: JsonField<String>,
        private val taskResultId: JsonField<String>,
        private val taskResultUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pipelineId")
            @ExcludeMissing
            pipelineId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taskResultId")
            @ExcludeMissing
            taskResultId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("taskResultUrl")
            @ExcludeMissing
            taskResultUrl: JsonField<String> = JsonMissing.of(),
        ) : this(pipelineId, taskResultId, taskResultUrl, mutableMapOf())

        /**
         * ID of the inference pipeline this task is for
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pipelineId(): String = pipelineId.getRequired("pipelineId")

        /**
         * ID of the background task
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskResultId(): String = taskResultId.getRequired("taskResultId")

        /**
         * URL to check the status of this background task
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskResultUrl(): String = taskResultUrl.getRequired("taskResultUrl")

        /**
         * Returns the raw JSON value of [pipelineId].
         *
         * Unlike [pipelineId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pipelineId")
        @ExcludeMissing
        fun _pipelineId(): JsonField<String> = pipelineId

        /**
         * Returns the raw JSON value of [taskResultId].
         *
         * Unlike [taskResultId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("taskResultId")
        @ExcludeMissing
        fun _taskResultId(): JsonField<String> = taskResultId

        /**
         * Returns the raw JSON value of [taskResultUrl].
         *
         * Unlike [taskResultUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Task].
             *
             * The following fields are required:
             * ```java
             * .pipelineId()
             * .taskResultId()
             * .taskResultUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Task]. */
        class Builder internal constructor() {

            private var pipelineId: JsonField<String>? = null
            private var taskResultId: JsonField<String>? = null
            private var taskResultUrl: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(task: Task) = apply {
                pipelineId = task.pipelineId
                taskResultId = task.taskResultId
                taskResultUrl = task.taskResultUrl
                additionalProperties = task.additionalProperties.toMutableMap()
            }

            /** ID of the inference pipeline this task is for */
            fun pipelineId(pipelineId: String) = pipelineId(JsonField.of(pipelineId))

            /**
             * Sets [Builder.pipelineId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipelineId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pipelineId(pipelineId: JsonField<String>) = apply { this.pipelineId = pipelineId }

            /** ID of the background task */
            fun taskResultId(taskResultId: String) = taskResultId(JsonField.of(taskResultId))

            /**
             * Sets [Builder.taskResultId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskResultId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskResultId(taskResultId: JsonField<String>) = apply {
                this.taskResultId = taskResultId
            }

            /** URL to check the status of this background task */
            fun taskResultUrl(taskResultUrl: String) = taskResultUrl(JsonField.of(taskResultUrl))

            /**
             * Sets [Builder.taskResultUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskResultUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Task].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pipelineId()
             * .taskResultId()
             * .taskResultUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Task =
                Task(
                    checkRequired("pipelineId", pipelineId),
                    checkRequired("taskResultId", taskResultId),
                    checkRequired("taskResultUrl", taskResultUrl),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Task = apply {
            if (validated) {
                return@apply
            }

            pipelineId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (pipelineId.asKnown().isPresent) 1 else 0) +
                (if (taskResultId.asKnown().isPresent) 1 else 0) +
                (if (taskResultUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Task &&
                pipelineId == other.pipelineId &&
                taskResultId == other.taskResultId &&
                taskResultUrl == other.taskResultUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pipelineId, taskResultId, taskResultUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Task{pipelineId=$pipelineId, taskResultId=$taskResultId, taskResultUrl=$taskResultUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestEvaluateResponse &&
            message == other.message &&
            pipelineCount == other.pipelineCount &&
            requestedEndTimestamp == other.requestedEndTimestamp &&
            requestedStartTimestamp == other.requestedStartTimestamp &&
            tasks == other.tasks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            message,
            pipelineCount,
            requestedEndTimestamp,
            requestedStartTimestamp,
            tasks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestEvaluateResponse{message=$message, pipelineCount=$pipelineCount, requestedEndTimestamp=$requestedEndTimestamp, requestedStartTimestamp=$requestedStartTimestamp, tasks=$tasks, additionalProperties=$additionalProperties}"
}
