// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional

/** Publish an inference data point to an inference pipeline. */
class InferencePipelineDataStreamParams
private constructor(
    private val inferencePipelineId: String,
    private val body: InferencePipelineDataStreamBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
    fun config(): Config = body.config()

    /** A list of inference data points with inputs and outputs */
    fun rows(): List<Row> = body.rows()

    /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
    fun _config(): JsonField<Config> = body._config()

    /** A list of inference data points with inputs and outputs */
    fun _rows(): JsonField<List<Row>> = body._rows()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): InferencePipelineDataStreamBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    @NoAutoDetect
    class InferencePipelineDataStreamBody
    @JsonCreator
    internal constructor(
        @JsonProperty("config")
        @ExcludeMissing
        private val config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("rows")
        @ExcludeMissing
        private val rows: JsonField<List<Row>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(): Config = config.getRequired("config")

        /** A list of inference data points with inputs and outputs */
        fun rows(): List<Row> = rows.getRequired("rows")

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        /** A list of inference data points with inputs and outputs */
        @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InferencePipelineDataStreamBody = apply {
            if (validated) {
                return@apply
            }

            config().validate()
            rows().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var config: JsonField<Config>? = null
            private var rows: JsonField<MutableList<Row>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inferencePipelineDataStreamBody: InferencePipelineDataStreamBody) =
                apply {
                    config = inferencePipelineDataStreamBody.config
                    rows = inferencePipelineDataStreamBody.rows.map { it.toMutableList() }
                    additionalProperties =
                        inferencePipelineDataStreamBody.additionalProperties.toMutableMap()
                }

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(config: Config) = config(JsonField.of(config))

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(llmData: Config.LlmData) = config(Config.ofLlmData(llmData))

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(tabularClassificationData: Config.TabularClassificationData) =
                config(Config.ofTabularClassificationData(tabularClassificationData))

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(tabularRegressionData: Config.TabularRegressionData) =
                config(Config.ofTabularRegressionData(tabularRegressionData))

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(textClassificationData: Config.TextClassificationData) =
                config(Config.ofTextClassificationData(textClassificationData))

            /** A list of inference data points with inputs and outputs */
            fun rows(rows: List<Row>) = rows(JsonField.of(rows))

            /** A list of inference data points with inputs and outputs */
            fun rows(rows: JsonField<List<Row>>) = apply {
                this.rows = rows.map { it.toMutableList() }
            }

            /** A list of inference data points with inputs and outputs */
            fun addRow(row: Row) = apply {
                rows =
                    (rows ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(row)
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

            fun build(): InferencePipelineDataStreamBody =
                InferencePipelineDataStreamBody(
                    checkRequired("config", config),
                    checkRequired("rows", rows).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferencePipelineDataStreamBody && config == other.config && rows == other.rows && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(config, rows, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferencePipelineDataStreamBody{config=$config, rows=$rows, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var body: InferencePipelineDataStreamBody.Builder =
            InferencePipelineDataStreamBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inferencePipelineDataStreamParams: InferencePipelineDataStreamParams) =
            apply {
                inferencePipelineId = inferencePipelineDataStreamParams.inferencePipelineId
                body = inferencePipelineDataStreamParams.body.toBuilder()
                additionalHeaders = inferencePipelineDataStreamParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inferencePipelineDataStreamParams.additionalQueryParams.toBuilder()
            }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(config: Config) = apply { body.config(config) }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(llmData: Config.LlmData) = apply { body.config(llmData) }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(tabularClassificationData: Config.TabularClassificationData) = apply {
            body.config(tabularClassificationData)
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(tabularRegressionData: Config.TabularRegressionData) = apply {
            body.config(tabularRegressionData)
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(textClassificationData: Config.TextClassificationData) = apply {
            body.config(textClassificationData)
        }

        /** A list of inference data points with inputs and outputs */
        fun rows(rows: List<Row>) = apply { body.rows(rows) }

        /** A list of inference data points with inputs and outputs */
        fun rows(rows: JsonField<List<Row>>) = apply { body.rows(rows) }

        /** A list of inference data points with inputs and outputs */
        fun addRow(row: Row) = apply { body.addRow(row) }

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

        fun build(): InferencePipelineDataStreamParams =
            InferencePipelineDataStreamParams(
                checkRequired("inferencePipelineId", inferencePipelineId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
    @JsonDeserialize(using = Config.Deserializer::class)
    @JsonSerialize(using = Config.Serializer::class)
    class Config
    private constructor(
        private val llmData: LlmData? = null,
        private val tabularClassificationData: TabularClassificationData? = null,
        private val tabularRegressionData: TabularRegressionData? = null,
        private val textClassificationData: TextClassificationData? = null,
        private val _json: JsonValue? = null,
    ) {

        fun llmData(): Optional<LlmData> = Optional.ofNullable(llmData)

        fun tabularClassificationData(): Optional<TabularClassificationData> =
            Optional.ofNullable(tabularClassificationData)

        fun tabularRegressionData(): Optional<TabularRegressionData> =
            Optional.ofNullable(tabularRegressionData)

        fun textClassificationData(): Optional<TextClassificationData> =
            Optional.ofNullable(textClassificationData)

        fun isLlmData(): Boolean = llmData != null

        fun isTabularClassificationData(): Boolean = tabularClassificationData != null

        fun isTabularRegressionData(): Boolean = tabularRegressionData != null

        fun isTextClassificationData(): Boolean = textClassificationData != null

        fun asLlmData(): LlmData = llmData.getOrThrow("llmData")

        fun asTabularClassificationData(): TabularClassificationData =
            tabularClassificationData.getOrThrow("tabularClassificationData")

        fun asTabularRegressionData(): TabularRegressionData =
            tabularRegressionData.getOrThrow("tabularRegressionData")

        fun asTextClassificationData(): TextClassificationData =
            textClassificationData.getOrThrow("textClassificationData")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                llmData != null -> visitor.visitLlmData(llmData)
                tabularClassificationData != null ->
                    visitor.visitTabularClassificationData(tabularClassificationData)
                tabularRegressionData != null ->
                    visitor.visitTabularRegressionData(tabularRegressionData)
                textClassificationData != null ->
                    visitor.visitTextClassificationData(textClassificationData)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLlmData(llmData: LlmData) {
                        llmData.validate()
                    }

                    override fun visitTabularClassificationData(
                        tabularClassificationData: TabularClassificationData
                    ) {
                        tabularClassificationData.validate()
                    }

                    override fun visitTabularRegressionData(
                        tabularRegressionData: TabularRegressionData
                    ) {
                        tabularRegressionData.validate()
                    }

                    override fun visitTextClassificationData(
                        textClassificationData: TextClassificationData
                    ) {
                        textClassificationData.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Config && llmData == other.llmData && tabularClassificationData == other.tabularClassificationData && tabularRegressionData == other.tabularRegressionData && textClassificationData == other.textClassificationData /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmData, tabularClassificationData, tabularRegressionData, textClassificationData) /* spotless:on */

        override fun toString(): String =
            when {
                llmData != null -> "Config{llmData=$llmData}"
                tabularClassificationData != null ->
                    "Config{tabularClassificationData=$tabularClassificationData}"
                tabularRegressionData != null ->
                    "Config{tabularRegressionData=$tabularRegressionData}"
                textClassificationData != null ->
                    "Config{textClassificationData=$textClassificationData}"
                _json != null -> "Config{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Config")
            }

        companion object {

            @JvmStatic fun ofLlmData(llmData: LlmData) = Config(llmData = llmData)

            @JvmStatic
            fun ofTabularClassificationData(tabularClassificationData: TabularClassificationData) =
                Config(tabularClassificationData = tabularClassificationData)

            @JvmStatic
            fun ofTabularRegressionData(tabularRegressionData: TabularRegressionData) =
                Config(tabularRegressionData = tabularRegressionData)

            @JvmStatic
            fun ofTextClassificationData(textClassificationData: TextClassificationData) =
                Config(textClassificationData = textClassificationData)
        }

        interface Visitor<out T> {

            fun visitLlmData(llmData: LlmData): T

            fun visitTabularClassificationData(
                tabularClassificationData: TabularClassificationData
            ): T

            fun visitTabularRegressionData(tabularRegressionData: TabularRegressionData): T

            fun visitTextClassificationData(textClassificationData: TextClassificationData): T

            fun unknown(json: JsonValue?): T {
                throw OpenlayerInvalidDataException("Unknown Config: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Config>(Config::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Config {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<LlmData>()) { it.validate() }
                    ?.let {
                        return Config(llmData = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TabularClassificationData>()) { it.validate() }
                    ?.let {
                        return Config(tabularClassificationData = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TabularRegressionData>()) { it.validate() }
                    ?.let {
                        return Config(tabularRegressionData = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TextClassificationData>()) { it.validate() }
                    ?.let {
                        return Config(textClassificationData = it, _json = json)
                    }

                return Config(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Config>(Config::class) {

            override fun serialize(
                value: Config,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.llmData != null -> generator.writeObject(value.llmData)
                    value.tabularClassificationData != null ->
                        generator.writeObject(value.tabularClassificationData)
                    value.tabularRegressionData != null ->
                        generator.writeObject(value.tabularRegressionData)
                    value.textClassificationData != null ->
                        generator.writeObject(value.textClassificationData)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Config")
                }
            }
        }

        @NoAutoDetect
        class LlmData
        @JsonCreator
        private constructor(
            @JsonProperty("outputColumnName")
            @ExcludeMissing
            private val outputColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contextColumnName")
            @ExcludeMissing
            private val contextColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("costColumnName")
            @ExcludeMissing
            private val costColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("groundTruthColumnName")
            @ExcludeMissing
            private val groundTruthColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            private val inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputVariableNames")
            @ExcludeMissing
            private val inputVariableNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            private val latencyColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("numOfTokenColumnName")
            @ExcludeMissing
            private val numOfTokenColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt")
            @ExcludeMissing
            private val prompt: JsonField<List<Prompt>> = JsonMissing.of(),
            @JsonProperty("questionColumnName")
            @ExcludeMissing
            private val questionColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            private val timestampColumnName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Name of the column with the model outputs. */
            fun outputColumnName(): String = outputColumnName.getRequired("outputColumnName")

            /**
             * Name of the column with the context retrieved. Applies to RAG use cases. Providing
             * the context enables RAG-specific metrics.
             */
            fun contextColumnName(): Optional<String> =
                Optional.ofNullable(contextColumnName.getNullable("contextColumnName"))

            /** Name of the column with the cost associated with each row. */
            fun costColumnName(): Optional<String> =
                Optional.ofNullable(costColumnName.getNullable("costColumnName"))

            /** Name of the column with the ground truths. */
            fun groundTruthColumnName(): Optional<String> =
                Optional.ofNullable(groundTruthColumnName.getNullable("groundTruthColumnName"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /** Array of input variable names. Each input variable should be a dataset column. */
            fun inputVariableNames(): Optional<List<String>> =
                Optional.ofNullable(inputVariableNames.getNullable("inputVariableNames"))

            /** Name of the column with the latencies. */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /** Name of the column with the total number of tokens. */
            fun numOfTokenColumnName(): Optional<String> =
                Optional.ofNullable(numOfTokenColumnName.getNullable("numOfTokenColumnName"))

            /** Prompt for the LLM. */
            fun prompt(): Optional<List<Prompt>> = Optional.ofNullable(prompt.getNullable("prompt"))

            /**
             * Name of the column with the questions. Applies to RAG use cases. Providing the
             * question enables RAG-specific metrics.
             */
            fun questionColumnName(): Optional<String> =
                Optional.ofNullable(questionColumnName.getNullable("questionColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /** Name of the column with the model outputs. */
            @JsonProperty("outputColumnName")
            @ExcludeMissing
            fun _outputColumnName(): JsonField<String> = outputColumnName

            /**
             * Name of the column with the context retrieved. Applies to RAG use cases. Providing
             * the context enables RAG-specific metrics.
             */
            @JsonProperty("contextColumnName")
            @ExcludeMissing
            fun _contextColumnName(): JsonField<String> = contextColumnName

            /** Name of the column with the cost associated with each row. */
            @JsonProperty("costColumnName")
            @ExcludeMissing
            fun _costColumnName(): JsonField<String> = costColumnName

            /** Name of the column with the ground truths. */
            @JsonProperty("groundTruthColumnName")
            @ExcludeMissing
            fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

            /** Array of input variable names. Each input variable should be a dataset column. */
            @JsonProperty("inputVariableNames")
            @ExcludeMissing
            fun _inputVariableNames(): JsonField<List<String>> = inputVariableNames

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /** Name of the column with the total number of tokens. */
            @JsonProperty("numOfTokenColumnName")
            @ExcludeMissing
            fun _numOfTokenColumnName(): JsonField<String> = numOfTokenColumnName

            /** Prompt for the LLM. */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<List<Prompt>> = prompt

            /**
             * Name of the column with the questions. Applies to RAG use cases. Providing the
             * question enables RAG-specific metrics.
             */
            @JsonProperty("questionColumnName")
            @ExcludeMissing
            fun _questionColumnName(): JsonField<String> = questionColumnName

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

            fun validate(): LlmData = apply {
                if (validated) {
                    return@apply
                }

                outputColumnName()
                contextColumnName()
                costColumnName()
                groundTruthColumnName()
                inferenceIdColumnName()
                inputVariableNames()
                latencyColumnName()
                numOfTokenColumnName()
                prompt().ifPresent { it.forEach { it.validate() } }
                questionColumnName()
                timestampColumnName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var outputColumnName: JsonField<String>? = null
                private var contextColumnName: JsonField<String> = JsonMissing.of()
                private var costColumnName: JsonField<String> = JsonMissing.of()
                private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var inputVariableNames: JsonField<MutableList<String>>? = null
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var numOfTokenColumnName: JsonField<String> = JsonMissing.of()
                private var prompt: JsonField<MutableList<Prompt>>? = null
                private var questionColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(llmData: LlmData) = apply {
                    outputColumnName = llmData.outputColumnName
                    contextColumnName = llmData.contextColumnName
                    costColumnName = llmData.costColumnName
                    groundTruthColumnName = llmData.groundTruthColumnName
                    inferenceIdColumnName = llmData.inferenceIdColumnName
                    inputVariableNames = llmData.inputVariableNames.map { it.toMutableList() }
                    latencyColumnName = llmData.latencyColumnName
                    metadata = llmData.metadata
                    numOfTokenColumnName = llmData.numOfTokenColumnName
                    prompt = llmData.prompt.map { it.toMutableList() }
                    questionColumnName = llmData.questionColumnName
                    timestampColumnName = llmData.timestampColumnName
                    additionalProperties = llmData.additionalProperties.toMutableMap()
                }

                /** Name of the column with the model outputs. */
                fun outputColumnName(outputColumnName: String) =
                    outputColumnName(JsonField.of(outputColumnName))

                /** Name of the column with the model outputs. */
                fun outputColumnName(outputColumnName: JsonField<String>) = apply {
                    this.outputColumnName = outputColumnName
                }

                /**
                 * Name of the column with the context retrieved. Applies to RAG use cases.
                 * Providing the context enables RAG-specific metrics.
                 */
                fun contextColumnName(contextColumnName: String) =
                    contextColumnName(JsonField.of(contextColumnName))

                /**
                 * Name of the column with the context retrieved. Applies to RAG use cases.
                 * Providing the context enables RAG-specific metrics.
                 */
                fun contextColumnName(contextColumnName: JsonField<String>) = apply {
                    this.contextColumnName = contextColumnName
                }

                /** Name of the column with the cost associated with each row. */
                fun costColumnName(costColumnName: String) =
                    costColumnName(JsonField.of(costColumnName))

                /** Name of the column with the cost associated with each row. */
                fun costColumnName(costColumnName: JsonField<String>) = apply {
                    this.costColumnName = costColumnName
                }

                /** Name of the column with the ground truths. */
                fun groundTruthColumnName(groundTruthColumnName: String) =
                    groundTruthColumnName(JsonField.of(groundTruthColumnName))

                /** Name of the column with the ground truths. */
                fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                    this.groundTruthColumnName = groundTruthColumnName
                }

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: String) =
                    inferenceIdColumnName(JsonField.of(inferenceIdColumnName))

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /**
                 * Array of input variable names. Each input variable should be a dataset column.
                 */
                fun inputVariableNames(inputVariableNames: List<String>) =
                    inputVariableNames(JsonField.of(inputVariableNames))

                /**
                 * Array of input variable names. Each input variable should be a dataset column.
                 */
                fun inputVariableNames(inputVariableNames: JsonField<List<String>>) = apply {
                    this.inputVariableNames = inputVariableNames.map { it.toMutableList() }
                }

                /**
                 * Array of input variable names. Each input variable should be a dataset column.
                 */
                fun addInputVariableName(inputVariableName: String) = apply {
                    inputVariableNames =
                        (inputVariableNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(inputVariableName)
                        }
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the total number of tokens. */
                fun numOfTokenColumnName(numOfTokenColumnName: String?) =
                    numOfTokenColumnName(JsonField.ofNullable(numOfTokenColumnName))

                /** Name of the column with the total number of tokens. */
                fun numOfTokenColumnName(numOfTokenColumnName: Optional<String>) =
                    numOfTokenColumnName(numOfTokenColumnName.orElse(null))

                /** Name of the column with the total number of tokens. */
                fun numOfTokenColumnName(numOfTokenColumnName: JsonField<String>) = apply {
                    this.numOfTokenColumnName = numOfTokenColumnName
                }

                /** Prompt for the LLM. */
                fun prompt(prompt: List<Prompt>) = prompt(JsonField.of(prompt))

                /** Prompt for the LLM. */
                fun prompt(prompt: JsonField<List<Prompt>>) = apply {
                    this.prompt = prompt.map { it.toMutableList() }
                }

                /** Prompt for the LLM. */
                fun addPrompt(prompt: Prompt) = apply {
                    this.prompt =
                        (this.prompt ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(prompt)
                        }
                }

                /**
                 * Name of the column with the questions. Applies to RAG use cases. Providing the
                 * question enables RAG-specific metrics.
                 */
                fun questionColumnName(questionColumnName: String) =
                    questionColumnName(JsonField.of(questionColumnName))

                /**
                 * Name of the column with the questions. Applies to RAG use cases. Providing the
                 * question enables RAG-specific metrics.
                 */
                fun questionColumnName(questionColumnName: JsonField<String>) = apply {
                    this.questionColumnName = questionColumnName
                }

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 */
                fun timestampColumnName(timestampColumnName: String) =
                    timestampColumnName(JsonField.of(timestampColumnName))

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
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

                fun build(): LlmData =
                    LlmData(
                        checkRequired("outputColumnName", outputColumnName),
                        contextColumnName,
                        costColumnName,
                        groundTruthColumnName,
                        inferenceIdColumnName,
                        (inputVariableNames ?: JsonMissing.of()).map { it.toImmutable() },
                        latencyColumnName,
                        metadata,
                        numOfTokenColumnName,
                        (prompt ?: JsonMissing.of()).map { it.toImmutable() },
                        questionColumnName,
                        timestampColumnName,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Prompt
            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                private val content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("role")
                @ExcludeMissing
                private val role: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Content of the prompt. */
                fun content(): Optional<String> =
                    Optional.ofNullable(content.getNullable("content"))

                /** Role of the prompt. */
                fun role(): Optional<String> = Optional.ofNullable(role.getNullable("role"))

                /** Content of the prompt. */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /** Role of the prompt. */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Prompt = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var content: JsonField<String> = JsonMissing.of()
                    private var role: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(prompt: Prompt) = apply {
                        content = prompt.content
                        role = prompt.role
                        additionalProperties = prompt.additionalProperties.toMutableMap()
                    }

                    /** Content of the prompt. */
                    fun content(content: String) = content(JsonField.of(content))

                    /** Content of the prompt. */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** Role of the prompt. */
                    fun role(role: String) = role(JsonField.of(role))

                    /** Role of the prompt. */
                    fun role(role: JsonField<String>) = apply { this.role = role }

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

                    fun build(): Prompt =
                        Prompt(
                            content,
                            role,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Prompt && content == other.content && role == other.role && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Prompt{content=$content, role=$role, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LlmData && outputColumnName == other.outputColumnName && contextColumnName == other.contextColumnName && costColumnName == other.costColumnName && groundTruthColumnName == other.groundTruthColumnName && inferenceIdColumnName == other.inferenceIdColumnName && inputVariableNames == other.inputVariableNames && latencyColumnName == other.latencyColumnName && metadata == other.metadata && numOfTokenColumnName == other.numOfTokenColumnName && prompt == other.prompt && questionColumnName == other.questionColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(outputColumnName, contextColumnName, costColumnName, groundTruthColumnName, inferenceIdColumnName, inputVariableNames, latencyColumnName, metadata, numOfTokenColumnName, prompt, questionColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmData{outputColumnName=$outputColumnName, contextColumnName=$contextColumnName, costColumnName=$costColumnName, groundTruthColumnName=$groundTruthColumnName, inferenceIdColumnName=$inferenceIdColumnName, inputVariableNames=$inputVariableNames, latencyColumnName=$latencyColumnName, metadata=$metadata, numOfTokenColumnName=$numOfTokenColumnName, prompt=$prompt, questionColumnName=$questionColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TabularClassificationData
        @JsonCreator
        private constructor(
            @JsonProperty("classNames")
            @ExcludeMissing
            private val classNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            private val categoricalFeatureNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("featureNames")
            @ExcludeMissing
            private val featureNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            private val inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            private val labelColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            private val latencyColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            private val predictionsColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            private val predictionScoresColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            private val timestampColumnName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            fun classNames(): List<String> = classNames.getRequired("classNames")

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Age", "Geography"].
             */
            fun categoricalFeatureNames(): Optional<List<String>> =
                Optional.ofNullable(categoricalFeatureNames.getNullable("categoricalFeatureNames"))

            /** Array with all input feature names. */
            fun featureNames(): Optional<List<String>> =
                Optional.ofNullable(featureNames.getNullable("featureNames"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            fun labelColumnName(): Optional<String> =
                Optional.ofNullable(labelColumnName.getNullable("labelColumnName"))

            /** Name of the column with the latencies. */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            fun predictionScoresColumnName(): Optional<String> =
                Optional.ofNullable(
                    predictionScoresColumnName.getNullable("predictionScoresColumnName")
                )

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            @JsonProperty("classNames")
            @ExcludeMissing
            fun _classNames(): JsonField<List<String>> = classNames

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Age", "Geography"].
             */
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            fun _categoricalFeatureNames(): JsonField<List<String>> = categoricalFeatureNames

            /** Array with all input feature names. */
            @JsonProperty("featureNames")
            @ExcludeMissing
            fun _featureNames(): JsonField<List<String>> = featureNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName(): JsonField<String> = labelColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName(): JsonField<String> = predictionScoresColumnName

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

            fun validate(): TabularClassificationData = apply {
                if (validated) {
                    return@apply
                }

                classNames()
                categoricalFeatureNames()
                featureNames()
                inferenceIdColumnName()
                labelColumnName()
                latencyColumnName()
                predictionsColumnName()
                predictionScoresColumnName()
                timestampColumnName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var classNames: JsonField<MutableList<String>>? = null
                private var categoricalFeatureNames: JsonField<MutableList<String>>? = null
                private var featureNames: JsonField<MutableList<String>>? = null
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var labelColumnName: JsonField<String> = JsonMissing.of()
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var predictionsColumnName: JsonField<String> = JsonMissing.of()
                private var predictionScoresColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tabularClassificationData: TabularClassificationData) = apply {
                    classNames = tabularClassificationData.classNames.map { it.toMutableList() }
                    categoricalFeatureNames =
                        tabularClassificationData.categoricalFeatureNames.map { it.toMutableList() }
                    featureNames = tabularClassificationData.featureNames.map { it.toMutableList() }
                    inferenceIdColumnName = tabularClassificationData.inferenceIdColumnName
                    labelColumnName = tabularClassificationData.labelColumnName
                    latencyColumnName = tabularClassificationData.latencyColumnName
                    metadata = tabularClassificationData.metadata
                    predictionsColumnName = tabularClassificationData.predictionsColumnName
                    predictionScoresColumnName =
                        tabularClassificationData.predictionScoresColumnName
                    timestampColumnName = tabularClassificationData.timestampColumnName
                    additionalProperties =
                        tabularClassificationData.additionalProperties.toMutableMap()
                }

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun classNames(classNames: List<String>) = classNames(JsonField.of(classNames))

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames.map { it.toMutableList() }
                }

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun addClassName(className: String) = apply {
                    classNames =
                        (classNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(className)
                        }
                }

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Age", "Geography"].
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: List<String>) =
                    categoricalFeatureNames(JsonField.of(categoricalFeatureNames))

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Age", "Geography"].
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames =
                            categoricalFeatureNames.map { it.toMutableList() }
                    }

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Age", "Geography"].
                 */
                fun addCategoricalFeatureName(categoricalFeatureName: String) = apply {
                    categoricalFeatureNames =
                        (categoricalFeatureNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(categoricalFeatureName)
                        }
                }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /** Array with all input feature names. */
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames.map { it.toMutableList() }
                }

                /** Array with all input feature names. */
                fun addFeatureName(featureName: String) = apply {
                    featureNames =
                        (featureNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(featureName)
                        }
                }

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: String) =
                    inferenceIdColumnName(JsonField.of(inferenceIdColumnName))

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /**
                 * Name of the column with the labels. The data in this column must be
                 * **zero-indexed integers**, matching the list provided in `classNames`.
                 */
                fun labelColumnName(labelColumnName: String) =
                    labelColumnName(JsonField.of(labelColumnName))

                /**
                 * Name of the column with the labels. The data in this column must be
                 * **zero-indexed integers**, matching the list provided in `classNames`.
                 */
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: JsonField<String>) = apply {
                    this.predictionsColumnName = predictionsColumnName
                }

                /**
                 * Name of the column with the model's predictions as **lists of class
                 * probabilities**.
                 */
                fun predictionScoresColumnName(predictionScoresColumnName: String) =
                    predictionScoresColumnName(JsonField.of(predictionScoresColumnName))

                /**
                 * Name of the column with the model's predictions as **lists of class
                 * probabilities**.
                 */
                fun predictionScoresColumnName(predictionScoresColumnName: JsonField<String>) =
                    apply {
                        this.predictionScoresColumnName = predictionScoresColumnName
                    }

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 */
                fun timestampColumnName(timestampColumnName: String) =
                    timestampColumnName(JsonField.of(timestampColumnName))

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
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

                fun build(): TabularClassificationData =
                    TabularClassificationData(
                        checkRequired("classNames", classNames).map { it.toImmutable() },
                        (categoricalFeatureNames ?: JsonMissing.of()).map { it.toImmutable() },
                        (featureNames ?: JsonMissing.of()).map { it.toImmutable() },
                        inferenceIdColumnName,
                        labelColumnName,
                        latencyColumnName,
                        metadata,
                        predictionsColumnName,
                        predictionScoresColumnName,
                        timestampColumnName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TabularClassificationData && classNames == other.classNames && categoricalFeatureNames == other.categoricalFeatureNames && featureNames == other.featureNames && inferenceIdColumnName == other.inferenceIdColumnName && labelColumnName == other.labelColumnName && latencyColumnName == other.latencyColumnName && metadata == other.metadata && predictionsColumnName == other.predictionsColumnName && predictionScoresColumnName == other.predictionScoresColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(classNames, categoricalFeatureNames, featureNames, inferenceIdColumnName, labelColumnName, latencyColumnName, metadata, predictionsColumnName, predictionScoresColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TabularClassificationData{classNames=$classNames, categoricalFeatureNames=$categoricalFeatureNames, featureNames=$featureNames, inferenceIdColumnName=$inferenceIdColumnName, labelColumnName=$labelColumnName, latencyColumnName=$latencyColumnName, metadata=$metadata, predictionsColumnName=$predictionsColumnName, predictionScoresColumnName=$predictionScoresColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TabularRegressionData
        @JsonCreator
        private constructor(
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            private val categoricalFeatureNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("featureNames")
            @ExcludeMissing
            private val featureNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            private val inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            private val latencyColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            private val predictionsColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("targetColumnName")
            @ExcludeMissing
            private val targetColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            private val timestampColumnName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Gender", "Geography"].
             */
            fun categoricalFeatureNames(): Optional<List<String>> =
                Optional.ofNullable(categoricalFeatureNames.getNullable("categoricalFeatureNames"))

            /** Array with all input feature names. */
            fun featureNames(): Optional<List<String>> =
                Optional.ofNullable(featureNames.getNullable("featureNames"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /** Name of the column with the latencies. */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /** Name of the column with the model's predictions. */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /** Name of the column with the targets (ground truth values). */
            fun targetColumnName(): Optional<String> =
                Optional.ofNullable(targetColumnName.getNullable("targetColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Gender", "Geography"].
             */
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            fun _categoricalFeatureNames(): JsonField<List<String>> = categoricalFeatureNames

            /** Array with all input feature names. */
            @JsonProperty("featureNames")
            @ExcludeMissing
            fun _featureNames(): JsonField<List<String>> = featureNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /** Name of the column with the model's predictions. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /** Name of the column with the targets (ground truth values). */
            @JsonProperty("targetColumnName")
            @ExcludeMissing
            fun _targetColumnName(): JsonField<String> = targetColumnName

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

            fun validate(): TabularRegressionData = apply {
                if (validated) {
                    return@apply
                }

                categoricalFeatureNames()
                featureNames()
                inferenceIdColumnName()
                latencyColumnName()
                predictionsColumnName()
                targetColumnName()
                timestampColumnName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var categoricalFeatureNames: JsonField<MutableList<String>>? = null
                private var featureNames: JsonField<MutableList<String>>? = null
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var predictionsColumnName: JsonField<String> = JsonMissing.of()
                private var targetColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tabularRegressionData: TabularRegressionData) = apply {
                    categoricalFeatureNames =
                        tabularRegressionData.categoricalFeatureNames.map { it.toMutableList() }
                    featureNames = tabularRegressionData.featureNames.map { it.toMutableList() }
                    inferenceIdColumnName = tabularRegressionData.inferenceIdColumnName
                    latencyColumnName = tabularRegressionData.latencyColumnName
                    metadata = tabularRegressionData.metadata
                    predictionsColumnName = tabularRegressionData.predictionsColumnName
                    targetColumnName = tabularRegressionData.targetColumnName
                    timestampColumnName = tabularRegressionData.timestampColumnName
                    additionalProperties = tabularRegressionData.additionalProperties.toMutableMap()
                }

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Gender", "Geography"].
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: List<String>) =
                    categoricalFeatureNames(JsonField.of(categoricalFeatureNames))

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Gender", "Geography"].
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames =
                            categoricalFeatureNames.map { it.toMutableList() }
                    }

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Gender", "Geography"].
                 */
                fun addCategoricalFeatureName(categoricalFeatureName: String) = apply {
                    categoricalFeatureNames =
                        (categoricalFeatureNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(categoricalFeatureName)
                        }
                }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /** Array with all input feature names. */
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames.map { it.toMutableList() }
                }

                /** Array with all input feature names. */
                fun addFeatureName(featureName: String) = apply {
                    featureNames =
                        (featureNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(featureName)
                        }
                }

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: String) =
                    inferenceIdColumnName(JsonField.of(inferenceIdColumnName))

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions. */
                fun predictionsColumnName(predictionsColumnName: JsonField<String>) = apply {
                    this.predictionsColumnName = predictionsColumnName
                }

                /** Name of the column with the targets (ground truth values). */
                fun targetColumnName(targetColumnName: String) =
                    targetColumnName(JsonField.of(targetColumnName))

                /** Name of the column with the targets (ground truth values). */
                fun targetColumnName(targetColumnName: JsonField<String>) = apply {
                    this.targetColumnName = targetColumnName
                }

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 */
                fun timestampColumnName(timestampColumnName: String) =
                    timestampColumnName(JsonField.of(timestampColumnName))

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
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

                fun build(): TabularRegressionData =
                    TabularRegressionData(
                        (categoricalFeatureNames ?: JsonMissing.of()).map { it.toImmutable() },
                        (featureNames ?: JsonMissing.of()).map { it.toImmutable() },
                        inferenceIdColumnName,
                        latencyColumnName,
                        metadata,
                        predictionsColumnName,
                        targetColumnName,
                        timestampColumnName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TabularRegressionData && categoricalFeatureNames == other.categoricalFeatureNames && featureNames == other.featureNames && inferenceIdColumnName == other.inferenceIdColumnName && latencyColumnName == other.latencyColumnName && metadata == other.metadata && predictionsColumnName == other.predictionsColumnName && targetColumnName == other.targetColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(categoricalFeatureNames, featureNames, inferenceIdColumnName, latencyColumnName, metadata, predictionsColumnName, targetColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TabularRegressionData{categoricalFeatureNames=$categoricalFeatureNames, featureNames=$featureNames, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, metadata=$metadata, predictionsColumnName=$predictionsColumnName, targetColumnName=$targetColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TextClassificationData
        @JsonCreator
        private constructor(
            @JsonProperty("classNames")
            @ExcludeMissing
            private val classNames: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            private val inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            private val labelColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            private val latencyColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            private val predictionsColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            private val predictionScoresColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("textColumnName")
            @ExcludeMissing
            private val textColumnName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            private val timestampColumnName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            fun classNames(): List<String> = classNames.getRequired("classNames")

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            fun labelColumnName(): Optional<String> =
                Optional.ofNullable(labelColumnName.getNullable("labelColumnName"))

            /** Name of the column with the latencies. */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            fun predictionScoresColumnName(): Optional<String> =
                Optional.ofNullable(
                    predictionScoresColumnName.getNullable("predictionScoresColumnName")
                )

            /** Name of the column with the text data. */
            fun textColumnName(): Optional<String> =
                Optional.ofNullable(textColumnName.getNullable("textColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            @JsonProperty("classNames")
            @ExcludeMissing
            fun _classNames(): JsonField<List<String>> = classNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName(): JsonField<String> = labelColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName(): JsonField<String> = predictionScoresColumnName

            /** Name of the column with the text data. */
            @JsonProperty("textColumnName")
            @ExcludeMissing
            fun _textColumnName(): JsonField<String> = textColumnName

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

            fun validate(): TextClassificationData = apply {
                if (validated) {
                    return@apply
                }

                classNames()
                inferenceIdColumnName()
                labelColumnName()
                latencyColumnName()
                predictionsColumnName()
                predictionScoresColumnName()
                textColumnName()
                timestampColumnName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var classNames: JsonField<MutableList<String>>? = null
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var labelColumnName: JsonField<String> = JsonMissing.of()
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var predictionsColumnName: JsonField<String> = JsonMissing.of()
                private var predictionScoresColumnName: JsonField<String> = JsonMissing.of()
                private var textColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(textClassificationData: TextClassificationData) = apply {
                    classNames = textClassificationData.classNames.map { it.toMutableList() }
                    inferenceIdColumnName = textClassificationData.inferenceIdColumnName
                    labelColumnName = textClassificationData.labelColumnName
                    latencyColumnName = textClassificationData.latencyColumnName
                    metadata = textClassificationData.metadata
                    predictionsColumnName = textClassificationData.predictionsColumnName
                    predictionScoresColumnName = textClassificationData.predictionScoresColumnName
                    textColumnName = textClassificationData.textColumnName
                    timestampColumnName = textClassificationData.timestampColumnName
                    additionalProperties =
                        textClassificationData.additionalProperties.toMutableMap()
                }

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun classNames(classNames: List<String>) = classNames(JsonField.of(classNames))

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames.map { it.toMutableList() }
                }

                /**
                 * List of class names indexed by label integer in the dataset. E.g.
                 * ["Retained", "Exited"] when 0, 1 are in your label column.
                 */
                fun addClassName(className: String) = apply {
                    classNames =
                        (classNames ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(className)
                        }
                }

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: String) =
                    inferenceIdColumnName(JsonField.of(inferenceIdColumnName))

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /**
                 * Name of the column with the labels. The data in this column must be
                 * **zero-indexed integers**, matching the list provided in `classNames`.
                 */
                fun labelColumnName(labelColumnName: String) =
                    labelColumnName(JsonField.of(labelColumnName))

                /**
                 * Name of the column with the labels. The data in this column must be
                 * **zero-indexed integers**, matching the list provided in `classNames`.
                 */
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: JsonField<String>) = apply {
                    this.predictionsColumnName = predictionsColumnName
                }

                /**
                 * Name of the column with the model's predictions as **lists of class
                 * probabilities**.
                 */
                fun predictionScoresColumnName(predictionScoresColumnName: String) =
                    predictionScoresColumnName(JsonField.of(predictionScoresColumnName))

                /**
                 * Name of the column with the model's predictions as **lists of class
                 * probabilities**.
                 */
                fun predictionScoresColumnName(predictionScoresColumnName: JsonField<String>) =
                    apply {
                        this.predictionScoresColumnName = predictionScoresColumnName
                    }

                /** Name of the column with the text data. */
                fun textColumnName(textColumnName: String) =
                    textColumnName(JsonField.of(textColumnName))

                /** Name of the column with the text data. */
                fun textColumnName(textColumnName: JsonField<String>) = apply {
                    this.textColumnName = textColumnName
                }

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 */
                fun timestampColumnName(timestampColumnName: String) =
                    timestampColumnName(JsonField.of(timestampColumnName))

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
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

                fun build(): TextClassificationData =
                    TextClassificationData(
                        checkRequired("classNames", classNames).map { it.toImmutable() },
                        inferenceIdColumnName,
                        labelColumnName,
                        latencyColumnName,
                        metadata,
                        predictionsColumnName,
                        predictionScoresColumnName,
                        textColumnName,
                        timestampColumnName,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TextClassificationData && classNames == other.classNames && inferenceIdColumnName == other.inferenceIdColumnName && labelColumnName == other.labelColumnName && latencyColumnName == other.latencyColumnName && metadata == other.metadata && predictionsColumnName == other.predictionsColumnName && predictionScoresColumnName == other.predictionScoresColumnName && textColumnName == other.textColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(classNames, inferenceIdColumnName, labelColumnName, latencyColumnName, metadata, predictionsColumnName, predictionScoresColumnName, textColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TextClassificationData{classNames=$classNames, inferenceIdColumnName=$inferenceIdColumnName, labelColumnName=$labelColumnName, latencyColumnName=$latencyColumnName, metadata=$metadata, predictionsColumnName=$predictionsColumnName, predictionScoresColumnName=$predictionScoresColumnName, textColumnName=$textColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class Row
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Row = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(row: Row) = apply {
                additionalProperties = row.additionalProperties.toMutableMap()
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

            fun build(): Row = Row(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Row && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Row{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineDataStreamParams && inferencePipelineId == other.inferencePipelineId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferencePipelineDataStreamParams{inferencePipelineId=$inferencePipelineId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
