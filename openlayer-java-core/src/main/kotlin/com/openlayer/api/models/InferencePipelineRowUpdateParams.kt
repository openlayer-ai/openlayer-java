// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class InferencePipelineRowUpdateParams
constructor(
    private val inferencePipelineId: String,
    private val inferenceId: String,
    private val row: JsonValue,
    private val config: Config?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun inferenceId(): String = inferenceId

    fun row(): JsonValue = row

    fun config(): Optional<Config> = Optional.ofNullable(config)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): InferencePipelineRowUpdateBody {
        return InferencePipelineRowUpdateBody(
            row,
            config,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
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

    @JsonDeserialize(builder = InferencePipelineRowUpdateBody.Builder::class)
    @NoAutoDetect
    class InferencePipelineRowUpdateBody
    internal constructor(
        private val row: JsonValue?,
        private val config: Config?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("row") fun row(): JsonValue? = row

        @JsonProperty("config") fun config(): Config? = config

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var row: JsonValue? = null
            private var config: Config? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inferencePipelineRowUpdateBody: InferencePipelineRowUpdateBody) =
                apply {
                    this.row = inferencePipelineRowUpdateBody.row
                    this.config = inferencePipelineRowUpdateBody.config
                    additionalProperties(inferencePipelineRowUpdateBody.additionalProperties)
                }

            @JsonProperty("row") fun row(row: JsonValue) = apply { this.row = row }

            @JsonProperty("config") fun config(config: Config) = apply { this.config = config }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InferencePipelineRowUpdateBody =
                InferencePipelineRowUpdateBody(
                    checkNotNull(row) { "`row` is required but was not set" },
                    config,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferencePipelineRowUpdateBody && row == other.row && config == other.config && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(row, config, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferencePipelineRowUpdateBody{row=$row, config=$config, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inferencePipelineId: String? = null
        private var inferenceId: String? = null
        private var row: JsonValue? = null
        private var config: Config? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineRowUpdateParams: InferencePipelineRowUpdateParams) =
            apply {
                inferencePipelineId = inferencePipelineRowUpdateParams.inferencePipelineId
                inferenceId = inferencePipelineRowUpdateParams.inferenceId
                row = inferencePipelineRowUpdateParams.row
                config = inferencePipelineRowUpdateParams.config
                additionalHeaders = inferencePipelineRowUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inferencePipelineRowUpdateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    inferencePipelineRowUpdateParams.additionalBodyProperties.toMutableMap()
            }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Specify the inference id as a query param. */
        fun inferenceId(inferenceId: String) = apply { this.inferenceId = inferenceId }

        fun row(row: JsonValue) = apply { this.row = row }

        fun config(config: Config) = apply { this.config = config }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): InferencePipelineRowUpdateParams =
            InferencePipelineRowUpdateParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                checkNotNull(inferenceId) { "`inferenceId` is required but was not set" },
                checkNotNull(row) { "`row` is required but was not set" },
                config,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Config.Builder::class)
    @NoAutoDetect
    class Config
    private constructor(
        private val inferenceIdColumnName: String?,
        private val latencyColumnName: String?,
        private val timestampColumnName: String?,
        private val groundTruthColumnName: String?,
        private val humanFeedbackColumnName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Name of the column with the inference ids. This is useful if you want to update rows at a
         * later point in time. If not provided, a unique id is generated by Openlayer.
         */
        @JsonProperty("inferenceIdColumnName")
        fun inferenceIdColumnName(): String? = inferenceIdColumnName

        /** Name of the column with the latencies. */
        @JsonProperty("latencyColumnName") fun latencyColumnName(): String? = latencyColumnName

        /**
         * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
         * provided, the upload timestamp is used.
         */
        @JsonProperty("timestampColumnName")
        fun timestampColumnName(): String? = timestampColumnName

        /** Name of the column with the ground truths. */
        @JsonProperty("groundTruthColumnName")
        fun groundTruthColumnName(): String? = groundTruthColumnName

        /** Name of the column with human feedback. */
        @JsonProperty("humanFeedbackColumnName")
        fun humanFeedbackColumnName(): String? = humanFeedbackColumnName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inferenceIdColumnName: String? = null
            private var latencyColumnName: String? = null
            private var timestampColumnName: String? = null
            private var groundTruthColumnName: String? = null
            private var humanFeedbackColumnName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                this.inferenceIdColumnName = config.inferenceIdColumnName
                this.latencyColumnName = config.latencyColumnName
                this.timestampColumnName = config.timestampColumnName
                this.groundTruthColumnName = config.groundTruthColumnName
                this.humanFeedbackColumnName = config.humanFeedbackColumnName
                additionalProperties(config.additionalProperties)
            }

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            fun inferenceIdColumnName(inferenceIdColumnName: String) = apply {
                this.inferenceIdColumnName = inferenceIdColumnName
            }

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            fun latencyColumnName(latencyColumnName: String) = apply {
                this.latencyColumnName = latencyColumnName
            }

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            @JsonProperty("timestampColumnName")
            fun timestampColumnName(timestampColumnName: String) = apply {
                this.timestampColumnName = timestampColumnName
            }

            /** Name of the column with the ground truths. */
            @JsonProperty("groundTruthColumnName")
            fun groundTruthColumnName(groundTruthColumnName: String) = apply {
                this.groundTruthColumnName = groundTruthColumnName
            }

            /** Name of the column with human feedback. */
            @JsonProperty("humanFeedbackColumnName")
            fun humanFeedbackColumnName(humanFeedbackColumnName: String) = apply {
                this.humanFeedbackColumnName = humanFeedbackColumnName
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Config =
                Config(
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Config && inferenceIdColumnName == other.inferenceIdColumnName && latencyColumnName == other.latencyColumnName && timestampColumnName == other.timestampColumnName && groundTruthColumnName == other.groundTruthColumnName && humanFeedbackColumnName == other.humanFeedbackColumnName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inferenceIdColumnName, latencyColumnName, timestampColumnName, groundTruthColumnName, humanFeedbackColumnName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineRowUpdateParams && inferencePipelineId == other.inferencePipelineId && inferenceId == other.inferenceId && row == other.row && config == other.config && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, inferenceId, row, config, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InferencePipelineRowUpdateParams{inferencePipelineId=$inferencePipelineId, inferenceId=$inferenceId, row=$row, config=$config, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
