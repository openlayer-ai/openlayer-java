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
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Triggers one-off evaluation of a specific monitoring test for a custom timestamp range. This
 * allows evaluating tests for historical data or custom time periods outside the regular evaluation
 * window schedule. It also allows overwriting the existing test results.
 */
class TestEvaluateParams
private constructor(
    private val testId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun testId(): Optional<String> = Optional.ofNullable(testId)

    /**
     * End timestamp in seconds (Unix epoch)
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTimestamp(): Long = body.endTimestamp()

    /**
     * Start timestamp in seconds (Unix epoch)
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimestamp(): Long = body.startTimestamp()

    /**
     * ID of the inference pipeline to evaluate. If not provided, all inference pipelines the test
     * applies to will be evaluated.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inferencePipelineId(): Optional<String> = body.inferencePipelineId()

    /**
     * Whether to overwrite existing test results
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overwriteResults(): Optional<Boolean> = body.overwriteResults()

    /**
     * Returns the raw JSON value of [endTimestamp].
     *
     * Unlike [endTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTimestamp(): JsonField<Long> = body._endTimestamp()

    /**
     * Returns the raw JSON value of [startTimestamp].
     *
     * Unlike [startTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTimestamp(): JsonField<Long> = body._startTimestamp()

    /**
     * Returns the raw JSON value of [inferencePipelineId].
     *
     * Unlike [inferencePipelineId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _inferencePipelineId(): JsonField<String> = body._inferencePipelineId()

    /**
     * Returns the raw JSON value of [overwriteResults].
     *
     * Unlike [overwriteResults], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _overwriteResults(): JsonField<Boolean> = body._overwriteResults()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestEvaluateParams].
         *
         * The following fields are required:
         * ```java
         * .endTimestamp()
         * .startTimestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestEvaluateParams]. */
    class Builder internal constructor() {

        private var testId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testEvaluateParams: TestEvaluateParams) = apply {
            testId = testEvaluateParams.testId
            body = testEvaluateParams.body.toBuilder()
            additionalHeaders = testEvaluateParams.additionalHeaders.toBuilder()
            additionalQueryParams = testEvaluateParams.additionalQueryParams.toBuilder()
        }

        fun testId(testId: String?) = apply { this.testId = testId }

        /** Alias for calling [Builder.testId] with `testId.orElse(null)`. */
        fun testId(testId: Optional<String>) = testId(testId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endTimestamp]
         * - [startTimestamp]
         * - [inferencePipelineId]
         * - [overwriteResults]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** End timestamp in seconds (Unix epoch) */
        fun endTimestamp(endTimestamp: Long) = apply { body.endTimestamp(endTimestamp) }

        /**
         * Sets [Builder.endTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTimestamp] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endTimestamp(endTimestamp: JsonField<Long>) = apply { body.endTimestamp(endTimestamp) }

        /** Start timestamp in seconds (Unix epoch) */
        fun startTimestamp(startTimestamp: Long) = apply { body.startTimestamp(startTimestamp) }

        /**
         * Sets [Builder.startTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimestamp] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTimestamp(startTimestamp: JsonField<Long>) = apply {
            body.startTimestamp(startTimestamp)
        }

        /**
         * ID of the inference pipeline to evaluate. If not provided, all inference pipelines the
         * test applies to will be evaluated.
         */
        fun inferencePipelineId(inferencePipelineId: String) = apply {
            body.inferencePipelineId(inferencePipelineId)
        }

        /**
         * Sets [Builder.inferencePipelineId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inferencePipelineId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inferencePipelineId(inferencePipelineId: JsonField<String>) = apply {
            body.inferencePipelineId(inferencePipelineId)
        }

        /** Whether to overwrite existing test results */
        fun overwriteResults(overwriteResults: Boolean) = apply {
            body.overwriteResults(overwriteResults)
        }

        /**
         * Sets [Builder.overwriteResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwriteResults] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overwriteResults(overwriteResults: JsonField<Boolean>) = apply {
            body.overwriteResults(overwriteResults)
        }

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
         * Returns an immutable instance of [TestEvaluateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTimestamp()
         * .startTimestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestEvaluateParams =
            TestEvaluateParams(
                testId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> testId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endTimestamp: JsonField<Long>,
        private val startTimestamp: JsonField<Long>,
        private val inferencePipelineId: JsonField<String>,
        private val overwriteResults: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("endTimestamp")
            @ExcludeMissing
            endTimestamp: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("startTimestamp")
            @ExcludeMissing
            startTimestamp: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inferencePipelineId")
            @ExcludeMissing
            inferencePipelineId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overwriteResults")
            @ExcludeMissing
            overwriteResults: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            endTimestamp,
            startTimestamp,
            inferencePipelineId,
            overwriteResults,
            mutableMapOf(),
        )

        /**
         * End timestamp in seconds (Unix epoch)
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endTimestamp(): Long = endTimestamp.getRequired("endTimestamp")

        /**
         * Start timestamp in seconds (Unix epoch)
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTimestamp(): Long = startTimestamp.getRequired("startTimestamp")

        /**
         * ID of the inference pipeline to evaluate. If not provided, all inference pipelines the
         * test applies to will be evaluated.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inferencePipelineId(): Optional<String> =
            inferencePipelineId.getOptional("inferencePipelineId")

        /**
         * Whether to overwrite existing test results
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overwriteResults(): Optional<Boolean> = overwriteResults.getOptional("overwriteResults")

        /**
         * Returns the raw JSON value of [endTimestamp].
         *
         * Unlike [endTimestamp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("endTimestamp")
        @ExcludeMissing
        fun _endTimestamp(): JsonField<Long> = endTimestamp

        /**
         * Returns the raw JSON value of [startTimestamp].
         *
         * Unlike [startTimestamp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("startTimestamp")
        @ExcludeMissing
        fun _startTimestamp(): JsonField<Long> = startTimestamp

        /**
         * Returns the raw JSON value of [inferencePipelineId].
         *
         * Unlike [inferencePipelineId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inferencePipelineId")
        @ExcludeMissing
        fun _inferencePipelineId(): JsonField<String> = inferencePipelineId

        /**
         * Returns the raw JSON value of [overwriteResults].
         *
         * Unlike [overwriteResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overwriteResults")
        @ExcludeMissing
        fun _overwriteResults(): JsonField<Boolean> = overwriteResults

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
             * .endTimestamp()
             * .startTimestamp()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endTimestamp: JsonField<Long>? = null
            private var startTimestamp: JsonField<Long>? = null
            private var inferencePipelineId: JsonField<String> = JsonMissing.of()
            private var overwriteResults: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endTimestamp = body.endTimestamp
                startTimestamp = body.startTimestamp
                inferencePipelineId = body.inferencePipelineId
                overwriteResults = body.overwriteResults
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** End timestamp in seconds (Unix epoch) */
            fun endTimestamp(endTimestamp: Long) = endTimestamp(JsonField.of(endTimestamp))

            /**
             * Sets [Builder.endTimestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTimestamp] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTimestamp(endTimestamp: JsonField<Long>) = apply {
                this.endTimestamp = endTimestamp
            }

            /** Start timestamp in seconds (Unix epoch) */
            fun startTimestamp(startTimestamp: Long) = startTimestamp(JsonField.of(startTimestamp))

            /**
             * Sets [Builder.startTimestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTimestamp] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTimestamp(startTimestamp: JsonField<Long>) = apply {
                this.startTimestamp = startTimestamp
            }

            /**
             * ID of the inference pipeline to evaluate. If not provided, all inference pipelines
             * the test applies to will be evaluated.
             */
            fun inferencePipelineId(inferencePipelineId: String) =
                inferencePipelineId(JsonField.of(inferencePipelineId))

            /**
             * Sets [Builder.inferencePipelineId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inferencePipelineId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inferencePipelineId(inferencePipelineId: JsonField<String>) = apply {
                this.inferencePipelineId = inferencePipelineId
            }

            /** Whether to overwrite existing test results */
            fun overwriteResults(overwriteResults: Boolean) =
                overwriteResults(JsonField.of(overwriteResults))

            /**
             * Sets [Builder.overwriteResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overwriteResults] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overwriteResults(overwriteResults: JsonField<Boolean>) = apply {
                this.overwriteResults = overwriteResults
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
             * .endTimestamp()
             * .startTimestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endTimestamp", endTimestamp),
                    checkRequired("startTimestamp", startTimestamp),
                    inferencePipelineId,
                    overwriteResults,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endTimestamp()
            startTimestamp()
            inferencePipelineId()
            overwriteResults()
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
            (if (endTimestamp.asKnown().isPresent) 1 else 0) +
                (if (startTimestamp.asKnown().isPresent) 1 else 0) +
                (if (inferencePipelineId.asKnown().isPresent) 1 else 0) +
                (if (overwriteResults.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endTimestamp == other.endTimestamp &&
                startTimestamp == other.startTimestamp &&
                inferencePipelineId == other.inferencePipelineId &&
                overwriteResults == other.overwriteResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endTimestamp,
                startTimestamp,
                inferencePipelineId,
                overwriteResults,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endTimestamp=$endTimestamp, startTimestamp=$startTimestamp, inferencePipelineId=$inferencePipelineId, overwriteResults=$overwriteResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestEvaluateParams &&
            testId == other.testId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(testId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TestEvaluateParams{testId=$testId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
