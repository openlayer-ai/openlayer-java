// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

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

/** Update an inference data point in an inference pipeline. */
class RowUpdateParams
private constructor(
    private val inferencePipelineId: String,
    private val inferenceId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): String = inferencePipelineId

    /** Specify the inference id as a query param. */
    fun inferenceId(): String = inferenceId

    fun _row(): JsonValue = body._row()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun config(): Optional<Config> = body.config()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<Config> = body._config()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RowUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * .inferenceId()
         * .row()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowUpdateParams]. */
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var inferenceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rowUpdateParams: RowUpdateParams) = apply {
            inferencePipelineId = rowUpdateParams.inferencePipelineId
            inferenceId = rowUpdateParams.inferenceId
            body = rowUpdateParams.body.toBuilder()
            additionalHeaders = rowUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = rowUpdateParams.additionalQueryParams.toBuilder()
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Specify the inference id as a query param. */
        fun inferenceId(inferenceId: String) = apply { this.inferenceId = inferenceId }

        fun row(row: JsonValue) = apply { body.row(row) }

        fun config(config: Config?) = apply { body.config(config) }

        /** Alias for calling [Builder.config] with `config.orElse(null)`. */
        fun config(config: Optional<Config>) = config(config.getOrNull())

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

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
         * Returns an immutable instance of [RowUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * .inferenceId()
         * .row()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RowUpdateParams =
            RowUpdateParams(
                checkRequired("inferencePipelineId", inferencePipelineId),
                checkRequired("inferenceId", inferenceId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inferencePipelineId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("inferenceId", inferenceId)
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    private constructor(
        private val row: JsonValue,
        private val config: JsonField<Config>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("row") @ExcludeMissing row: JsonValue = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        ) : this(row, config, mutableMapOf())

        @JsonProperty("row") @ExcludeMissing fun _row(): JsonValue = row

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun config(): Optional<Config> = Optional.ofNullable(config.getNullable("config"))

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

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
             * .row()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var row: JsonValue? = null
            private var config: JsonField<Config> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                row = body.row
                config = body.config
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun row(row: JsonValue) = apply { this.row = row }

            fun config(config: Config?) = config(JsonField.ofNullable(config))

            /** Alias for calling [Builder.config] with `config.orElse(null)`. */
            fun config(config: Optional<Config>) = config(config.getOrNull())

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

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
             * .row()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("row", row), config, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            config().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (config.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && row == other.row && config == other.config && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(row, config, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{row=$row, config=$config, additionalProperties=$additionalProperties}"
    }

    class Config
    private constructor(
        private val groundTruthColumnName: JsonField<String>,
        private val humanFeedbackColumnName: JsonField<String>,
        private val inferenceIdColumnName: JsonField<String>,
        private val latencyColumnName: JsonField<String>,
        private val timestampColumnName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("groundTruthColumnName")
            @ExcludeMissing
            groundTruthColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("humanFeedbackColumnName")
            @ExcludeMissing
            humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            latencyColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            timestampColumnName: JsonField<String> = JsonMissing.of(),
        ) : this(
            groundTruthColumnName,
            humanFeedbackColumnName,
            inferenceIdColumnName,
            latencyColumnName,
            timestampColumnName,
            mutableMapOf(),
        )

        /**
         * Name of the column with the ground truths.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groundTruthColumnName(): Optional<String> =
            Optional.ofNullable(groundTruthColumnName.getNullable("groundTruthColumnName"))

        /**
         * Name of the column with human feedback.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun humanFeedbackColumnName(): Optional<String> =
            Optional.ofNullable(humanFeedbackColumnName.getNullable("humanFeedbackColumnName"))

        /**
         * Name of the column with the inference ids. This is useful if you want to update rows at a
         * later point in time. If not provided, a unique id is generated by Openlayer.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inferenceIdColumnName(): Optional<String> =
            Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

        /**
         * Name of the column with the latencies.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latencyColumnName(): Optional<String> =
            Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

        /**
         * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
         * provided, the upload timestamp is used.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timestampColumnName(): Optional<String> =
            Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

        /**
         * Returns the raw JSON value of [groundTruthColumnName].
         *
         * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("groundTruthColumnName")
        @ExcludeMissing
        fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

        /**
         * Returns the raw JSON value of [humanFeedbackColumnName].
         *
         * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("humanFeedbackColumnName")
        @ExcludeMissing
        fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

        /**
         * Returns the raw JSON value of [inferenceIdColumnName].
         *
         * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inferenceIdColumnName")
        @ExcludeMissing
        fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

        /**
         * Returns the raw JSON value of [latencyColumnName].
         *
         * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("latencyColumnName")
        @ExcludeMissing
        fun _latencyColumnName(): JsonField<String> = latencyColumnName

        /**
         * Returns the raw JSON value of [timestampColumnName].
         *
         * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("timestampColumnName")
        @ExcludeMissing
        fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

            /** Returns a mutable builder for constructing an instance of [Config]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
            private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
            private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
            private var latencyColumnName: JsonField<String> = JsonMissing.of()
            private var timestampColumnName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                groundTruthColumnName = config.groundTruthColumnName
                humanFeedbackColumnName = config.humanFeedbackColumnName
                inferenceIdColumnName = config.inferenceIdColumnName
                latencyColumnName = config.latencyColumnName
                timestampColumnName = config.timestampColumnName
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /** Name of the column with the ground truths. */
            fun groundTruthColumnName(groundTruthColumnName: String?) =
                groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

            /**
             * Alias for calling [Builder.groundTruthColumnName] with
             * `groundTruthColumnName.orElse(null)`.
             */
            fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                groundTruthColumnName(groundTruthColumnName.getOrNull())

            /**
             * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groundTruthColumnName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                this.groundTruthColumnName = groundTruthColumnName
            }

            /** Name of the column with human feedback. */
            fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

            /**
             * Alias for calling [Builder.humanFeedbackColumnName] with
             * `humanFeedbackColumnName.orElse(null)`.
             */
            fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

            /**
             * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.humanFeedbackColumnName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) = apply {
                this.humanFeedbackColumnName = humanFeedbackColumnName
            }

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

            /**
             * Alias for calling [Builder.inferenceIdColumnName] with
             * `inferenceIdColumnName.orElse(null)`.
             */
            fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                inferenceIdColumnName(inferenceIdColumnName.getOrNull())

            /**
             * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inferenceIdColumnName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                this.inferenceIdColumnName = inferenceIdColumnName
            }

            /** Name of the column with the latencies. */
            fun latencyColumnName(latencyColumnName: String?) =
                latencyColumnName(JsonField.ofNullable(latencyColumnName))

            /**
             * Alias for calling [Builder.latencyColumnName] with `latencyColumnName.orElse(null)`.
             */
            fun latencyColumnName(latencyColumnName: Optional<String>) =
                latencyColumnName(latencyColumnName.getOrNull())

            /**
             * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latencyColumnName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                this.latencyColumnName = latencyColumnName
            }

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(timestampColumnName: String?) =
                timestampColumnName(JsonField.ofNullable(timestampColumnName))

            /**
             * Alias for calling [Builder.timestampColumnName] with
             * `timestampColumnName.orElse(null)`.
             */
            fun timestampColumnName(timestampColumnName: Optional<String>) =
                timestampColumnName(timestampColumnName.getOrNull())

            /**
             * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestampColumnName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                this.timestampColumnName = timestampColumnName
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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Config =
                Config(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            groundTruthColumnName()
            humanFeedbackColumnName()
            inferenceIdColumnName()
            latencyColumnName()
            timestampColumnName()
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
            (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                (if (timestampColumnName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Config && groundTruthColumnName == other.groundTruthColumnName && humanFeedbackColumnName == other.humanFeedbackColumnName && inferenceIdColumnName == other.inferenceIdColumnName && latencyColumnName == other.latencyColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(groundTruthColumnName, humanFeedbackColumnName, inferenceIdColumnName, latencyColumnName, timestampColumnName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RowUpdateParams && inferencePipelineId == other.inferencePipelineId && inferenceId == other.inferenceId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, inferenceId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RowUpdateParams{inferencePipelineId=$inferencePipelineId, inferenceId=$inferenceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
