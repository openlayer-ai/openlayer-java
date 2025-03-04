// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Update an inference data point in an inference pipeline. */
class InferencePipelineRowUpdateParams
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

    fun config(): Optional<Config> = body.config()

    fun _config(): JsonField<Config> = body._config()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.inferenceId.let { queryParams.put("inferenceId", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("row") @ExcludeMissing private val row: JsonValue = JsonMissing.of(),
        @JsonProperty("config")
        @ExcludeMissing
        private val config: JsonField<Config> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("row") @ExcludeMissing fun _row(): JsonValue = row

        fun config(): Optional<Config> = Optional.ofNullable(config.getNullable("config"))

        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            config().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun config(config: Optional<Config>) = config(config.orElse(null))

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

            fun build(): Body =
                Body(checkRequired("row", row), config, additionalProperties.toImmutable())
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineRowUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var inferenceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inferencePipelineRowUpdateParams: InferencePipelineRowUpdateParams) =
            apply {
                inferencePipelineId = inferencePipelineRowUpdateParams.inferencePipelineId
                inferenceId = inferencePipelineRowUpdateParams.inferenceId
                body = inferencePipelineRowUpdateParams.body.toBuilder()
                additionalHeaders = inferencePipelineRowUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inferencePipelineRowUpdateParams.additionalQueryParams.toBuilder()
            }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Specify the inference id as a query param. */
        fun inferenceId(inferenceId: String) = apply { this.inferenceId = inferenceId }

        fun row(row: JsonValue) = apply { body.row(row) }

        fun config(config: Config?) = apply { body.config(config) }

        fun config(config: Optional<Config>) = config(config.orElse(null))

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

        fun build(): InferencePipelineRowUpdateParams =
            InferencePipelineRowUpdateParams(
                checkRequired("inferencePipelineId", inferencePipelineId),
                checkRequired("inferenceId", inferenceId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Config
    @JsonCreator
    private constructor(
        @JsonProperty("groundTruthColumnName")
        @ExcludeMissing
        private val groundTruthColumnName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("humanFeedbackColumnName")
        @ExcludeMissing
        private val humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inferenceIdColumnName")
        @ExcludeMissing
        private val inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("latencyColumnName")
        @ExcludeMissing
        private val latencyColumnName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestampColumnName")
        @ExcludeMissing
        private val timestampColumnName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Name of the column with the ground truths. */
        fun groundTruthColumnName(): Optional<String> =
            Optional.ofNullable(groundTruthColumnName.getNullable("groundTruthColumnName"))

        /** Name of the column with human feedback. */
        fun humanFeedbackColumnName(): Optional<String> =
            Optional.ofNullable(humanFeedbackColumnName.getNullable("humanFeedbackColumnName"))

        /**
         * Name of the column with the inference ids. This is useful if you want to update rows at a
         * later point in time. If not provided, a unique id is generated by Openlayer.
         */
        fun inferenceIdColumnName(): Optional<String> =
            Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

        /** Name of the column with the latencies. */
        fun latencyColumnName(): Optional<String> =
            Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

        /**
         * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
         * provided, the upload timestamp is used.
         */
        fun timestampColumnName(): Optional<String> =
            Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

        /** Name of the column with the ground truths. */
        @JsonProperty("groundTruthColumnName")
        @ExcludeMissing
        fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

        /** Name of the column with human feedback. */
        @JsonProperty("humanFeedbackColumnName")
        @ExcludeMissing
        fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

        /**
         * Name of the column with the inference ids. This is useful if you want to update rows at a
         * later point in time. If not provided, a unique id is generated by Openlayer.
         */
        @JsonProperty("inferenceIdColumnName")
        @ExcludeMissing
        fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

        /** Name of the column with the latencies. */
        @JsonProperty("latencyColumnName")
        @ExcludeMissing
        fun _latencyColumnName(): JsonField<String> = latencyColumnName

        /**
         * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
         * provided, the upload timestamp is used.
         */
        @JsonProperty("timestampColumnName")
        @ExcludeMissing
        fun _timestampColumnName(): JsonField<String> = timestampColumnName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Name of the column with the ground truths. */
            fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                groundTruthColumnName(groundTruthColumnName.orElse(null))

            /** Name of the column with the ground truths. */
            fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                this.groundTruthColumnName = groundTruthColumnName
            }

            /** Name of the column with human feedback. */
            fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

            /** Name of the column with human feedback. */
            fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                humanFeedbackColumnName(humanFeedbackColumnName.orElse(null))

            /** Name of the column with human feedback. */
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
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                inferenceIdColumnName(inferenceIdColumnName.orElse(null))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                this.inferenceIdColumnName = inferenceIdColumnName
            }

            /** Name of the column with the latencies. */
            fun latencyColumnName(latencyColumnName: String?) =
                latencyColumnName(JsonField.ofNullable(latencyColumnName))

            /** Name of the column with the latencies. */
            fun latencyColumnName(latencyColumnName: Optional<String>) =
                latencyColumnName(latencyColumnName.orElse(null))

            /** Name of the column with the latencies. */
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
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(timestampColumnName: Optional<String>) =
                timestampColumnName(timestampColumnName.orElse(null))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
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

            fun build(): Config =
                Config(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    additionalProperties.toImmutable(),
                )
        }

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

        return /* spotless:off */ other is InferencePipelineRowUpdateParams && inferencePipelineId == other.inferencePipelineId && inferenceId == other.inferenceId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, inferenceId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferencePipelineRowUpdateParams{inferencePipelineId=$inferencePipelineId, inferenceId=$inferenceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
