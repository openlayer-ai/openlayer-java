// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import java.util.Objects
import java.util.Optional

class InferencePipelineDataStreamParams
constructor(
    private val inferencePipelineId: String,
    private val config: Config,
    private val rows: List<Row>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun config(): Config = config

    fun rows(): List<Row> = rows

    @JvmSynthetic
    internal fun getBody(): InferencePipelineDataStreamBody {
        return InferencePipelineDataStreamBody(
            config,
            rows,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InferencePipelineDataStreamBody.Builder::class)
    @NoAutoDetect
    class InferencePipelineDataStreamBody
    internal constructor(
        private val config: Config?,
        private val rows: List<Row>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        @JsonProperty("config") fun config(): Config? = config

        /** A list of inference data points with inputs and outputs */
        @JsonProperty("rows") fun rows(): List<Row>? = rows

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var config: Config? = null
            private var rows: List<Row>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inferencePipelineDataStreamBody: InferencePipelineDataStreamBody) =
                apply {
                    this.config = inferencePipelineDataStreamBody.config
                    this.rows = inferencePipelineDataStreamBody.rows
                    additionalProperties(inferencePipelineDataStreamBody.additionalProperties)
                }

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            @JsonProperty("config") fun config(config: Config) = apply { this.config = config }

            /** A list of inference data points with inputs and outputs */
            @JsonProperty("rows") fun rows(rows: List<Row>) = apply { this.rows = rows }

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

            fun build(): InferencePipelineDataStreamBody =
                InferencePipelineDataStreamBody(
                    checkNotNull(config) { "`config` is required but was not set" },
                    checkNotNull(rows) { "`rows` is required but was not set" }.toImmutable(),
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineDataStreamParams && inferencePipelineId == other.inferencePipelineId && config == other.config && rows == other.rows && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, config, rows, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InferencePipelineDataStreamParams{inferencePipelineId=$inferencePipelineId, config=$config, rows=$rows, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inferencePipelineId: String? = null
        private var config: Config? = null
        private var rows: MutableList<Row> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineDataStreamParams: InferencePipelineDataStreamParams) =
            apply {
                this.inferencePipelineId = inferencePipelineDataStreamParams.inferencePipelineId
                this.config = inferencePipelineDataStreamParams.config
                this.rows(inferencePipelineDataStreamParams.rows)
                additionalHeaders(inferencePipelineDataStreamParams.additionalHeaders)
                additionalQueryParams(inferencePipelineDataStreamParams.additionalQueryParams)
                additionalBodyProperties(inferencePipelineDataStreamParams.additionalBodyProperties)
            }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(config: Config) = apply { this.config = config }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(llmData: Config.LlmData) = apply { this.config = Config.ofLlmData(llmData) }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(tabularClassificationData: Config.TabularClassificationData) = apply {
            this.config = Config.ofTabularClassificationData(tabularClassificationData)
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(tabularRegressionData: Config.TabularRegressionData) = apply {
            this.config = Config.ofTabularRegressionData(tabularRegressionData)
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(textClassificationData: Config.TextClassificationData) = apply {
            this.config = Config.ofTextClassificationData(textClassificationData)
        }

        /** A list of inference data points with inputs and outputs */
        fun rows(rows: List<Row>) = apply {
            this.rows.clear()
            this.rows.addAll(rows)
        }

        /** A list of inference data points with inputs and outputs */
        fun addRow(row: Row) = apply { this.rows.add(row) }

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

        fun build(): InferencePipelineDataStreamParams =
            InferencePipelineDataStreamParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                checkNotNull(config) { "`config` is required but was not set" },
                checkNotNull(rows) { "`rows` is required but was not set" }.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

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

        private var validated: Boolean = false

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

        fun validate(): Config = apply {
            if (!validated) {
                if (
                    llmData == null &&
                        tabularClassificationData == null &&
                        tabularRegressionData == null &&
                        textClassificationData == null
                ) {
                    throw OpenlayerInvalidDataException("Unknown Config: $_json")
                }
                llmData?.validate()
                tabularClassificationData?.validate()
                tabularRegressionData?.validate()
                textClassificationData?.validate()
                validated = true
            }
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

        class Deserializer : BaseDeserializer<Config>(Config::class) {

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

        class Serializer : BaseSerializer<Config>(Config::class) {

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

        @JsonDeserialize(builder = LlmData.Builder::class)
        @NoAutoDetect
        class LlmData
        private constructor(
            private val numOfTokenColumnName: JsonField<String>,
            private val contextColumnName: JsonField<String>,
            private val costColumnName: JsonField<String>,
            private val groundTruthColumnName: JsonField<String>,
            private val inferenceIdColumnName: JsonField<String>,
            private val inputVariableNames: JsonField<List<String>>,
            private val latencyColumnName: JsonField<String>,
            private val metadata: JsonValue,
            private val outputColumnName: JsonField<String>,
            private val prompt: JsonField<List<Prompt>>,
            private val questionColumnName: JsonField<String>,
            private val timestampColumnName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Name of the column with the total number of tokens. */
            fun numOfTokenColumnName(): Optional<String> =
                Optional.ofNullable(numOfTokenColumnName.getNullable("numOfTokenColumnName"))

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

            /** Name of the column with the model outputs. */
            fun outputColumnName(): String = outputColumnName.getRequired("outputColumnName")

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

            /** Name of the column with the total number of tokens. */
            @JsonProperty("numOfTokenColumnName")
            @ExcludeMissing
            fun _numOfTokenColumnName() = numOfTokenColumnName

            /**
             * Name of the column with the context retrieved. Applies to RAG use cases. Providing
             * the context enables RAG-specific metrics.
             */
            @JsonProperty("contextColumnName")
            @ExcludeMissing
            fun _contextColumnName() = contextColumnName

            /** Name of the column with the cost associated with each row. */
            @JsonProperty("costColumnName") @ExcludeMissing fun _costColumnName() = costColumnName

            /** Name of the column with the ground truths. */
            @JsonProperty("groundTruthColumnName")
            @ExcludeMissing
            fun _groundTruthColumnName() = groundTruthColumnName

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName() = inferenceIdColumnName

            /** Array of input variable names. Each input variable should be a dataset column. */
            @JsonProperty("inputVariableNames")
            @ExcludeMissing
            fun _inputVariableNames() = inputVariableNames

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName() = latencyColumnName

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** Name of the column with the model outputs. */
            @JsonProperty("outputColumnName")
            @ExcludeMissing
            fun _outputColumnName() = outputColumnName

            /** Prompt for the LLM. */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt() = prompt

            /**
             * Name of the column with the questions. Applies to RAG use cases. Providing the
             * question enables RAG-specific metrics.
             */
            @JsonProperty("questionColumnName")
            @ExcludeMissing
            fun _questionColumnName() = questionColumnName

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            fun _timestampColumnName() = timestampColumnName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LlmData = apply {
                if (!validated) {
                    numOfTokenColumnName()
                    contextColumnName()
                    costColumnName()
                    groundTruthColumnName()
                    inferenceIdColumnName()
                    inputVariableNames()
                    latencyColumnName()
                    outputColumnName()
                    prompt().map { it.forEach { it.validate() } }
                    questionColumnName()
                    timestampColumnName()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var numOfTokenColumnName: JsonField<String> = JsonMissing.of()
                private var contextColumnName: JsonField<String> = JsonMissing.of()
                private var costColumnName: JsonField<String> = JsonMissing.of()
                private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var inputVariableNames: JsonField<List<String>> = JsonMissing.of()
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var outputColumnName: JsonField<String> = JsonMissing.of()
                private var prompt: JsonField<List<Prompt>> = JsonMissing.of()
                private var questionColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(llmData: LlmData) = apply {
                    this.numOfTokenColumnName = llmData.numOfTokenColumnName
                    this.contextColumnName = llmData.contextColumnName
                    this.costColumnName = llmData.costColumnName
                    this.groundTruthColumnName = llmData.groundTruthColumnName
                    this.inferenceIdColumnName = llmData.inferenceIdColumnName
                    this.inputVariableNames = llmData.inputVariableNames
                    this.latencyColumnName = llmData.latencyColumnName
                    this.metadata = llmData.metadata
                    this.outputColumnName = llmData.outputColumnName
                    this.prompt = llmData.prompt
                    this.questionColumnName = llmData.questionColumnName
                    this.timestampColumnName = llmData.timestampColumnName
                    additionalProperties(llmData.additionalProperties)
                }

                /** Name of the column with the total number of tokens. */
                fun numOfTokenColumnName(numOfTokenColumnName: String) =
                    numOfTokenColumnName(JsonField.of(numOfTokenColumnName))

                /** Name of the column with the total number of tokens. */
                @JsonProperty("numOfTokenColumnName")
                @ExcludeMissing
                fun numOfTokenColumnName(numOfTokenColumnName: JsonField<String>) = apply {
                    this.numOfTokenColumnName = numOfTokenColumnName
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
                @JsonProperty("contextColumnName")
                @ExcludeMissing
                fun contextColumnName(contextColumnName: JsonField<String>) = apply {
                    this.contextColumnName = contextColumnName
                }

                /** Name of the column with the cost associated with each row. */
                fun costColumnName(costColumnName: String) =
                    costColumnName(JsonField.of(costColumnName))

                /** Name of the column with the cost associated with each row. */
                @JsonProperty("costColumnName")
                @ExcludeMissing
                fun costColumnName(costColumnName: JsonField<String>) = apply {
                    this.costColumnName = costColumnName
                }

                /** Name of the column with the ground truths. */
                fun groundTruthColumnName(groundTruthColumnName: String) =
                    groundTruthColumnName(JsonField.of(groundTruthColumnName))

                /** Name of the column with the ground truths. */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
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
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
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
                @JsonProperty("inputVariableNames")
                @ExcludeMissing
                fun inputVariableNames(inputVariableNames: JsonField<List<String>>) = apply {
                    this.inputVariableNames = inputVariableNames
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model outputs. */
                fun outputColumnName(outputColumnName: String) =
                    outputColumnName(JsonField.of(outputColumnName))

                /** Name of the column with the model outputs. */
                @JsonProperty("outputColumnName")
                @ExcludeMissing
                fun outputColumnName(outputColumnName: JsonField<String>) = apply {
                    this.outputColumnName = outputColumnName
                }

                /** Prompt for the LLM. */
                fun prompt(prompt: List<Prompt>) = prompt(JsonField.of(prompt))

                /** Prompt for the LLM. */
                @JsonProperty("prompt")
                @ExcludeMissing
                fun prompt(prompt: JsonField<List<Prompt>>) = apply { this.prompt = prompt }

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
                @JsonProperty("questionColumnName")
                @ExcludeMissing
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
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                    this.timestampColumnName = timestampColumnName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LlmData =
                    LlmData(
                        numOfTokenColumnName,
                        contextColumnName,
                        costColumnName,
                        groundTruthColumnName,
                        inferenceIdColumnName,
                        inputVariableNames.map { it.toImmutable() },
                        latencyColumnName,
                        metadata,
                        outputColumnName,
                        prompt.map { it.toImmutable() },
                        questionColumnName,
                        timestampColumnName,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Prompt.Builder::class)
            @NoAutoDetect
            class Prompt
            private constructor(
                private val role: JsonField<String>,
                private val content: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** Role of the prompt. */
                fun role(): Optional<String> = Optional.ofNullable(role.getNullable("role"))

                /** Content of the prompt. */
                fun content(): Optional<String> =
                    Optional.ofNullable(content.getNullable("content"))

                /** Role of the prompt. */
                @JsonProperty("role") @ExcludeMissing fun _role() = role

                /** Content of the prompt. */
                @JsonProperty("content") @ExcludeMissing fun _content() = content

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Prompt = apply {
                    if (!validated) {
                        role()
                        content()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var role: JsonField<String> = JsonMissing.of()
                    private var content: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(prompt: Prompt) = apply {
                        this.role = prompt.role
                        this.content = prompt.content
                        additionalProperties(prompt.additionalProperties)
                    }

                    /** Role of the prompt. */
                    fun role(role: String) = role(JsonField.of(role))

                    /** Role of the prompt. */
                    @JsonProperty("role")
                    @ExcludeMissing
                    fun role(role: JsonField<String>) = apply { this.role = role }

                    /** Content of the prompt. */
                    fun content(content: String) = content(JsonField.of(content))

                    /** Content of the prompt. */
                    @JsonProperty("content")
                    @ExcludeMissing
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Prompt =
                        Prompt(
                            role,
                            content,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Prompt && role == other.role && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(role, content, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Prompt{role=$role, content=$content, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LlmData && numOfTokenColumnName == other.numOfTokenColumnName && contextColumnName == other.contextColumnName && costColumnName == other.costColumnName && groundTruthColumnName == other.groundTruthColumnName && inferenceIdColumnName == other.inferenceIdColumnName && inputVariableNames == other.inputVariableNames && latencyColumnName == other.latencyColumnName && metadata == other.metadata && outputColumnName == other.outputColumnName && prompt == other.prompt && questionColumnName == other.questionColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(numOfTokenColumnName, contextColumnName, costColumnName, groundTruthColumnName, inferenceIdColumnName, inputVariableNames, latencyColumnName, metadata, outputColumnName, prompt, questionColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmData{numOfTokenColumnName=$numOfTokenColumnName, contextColumnName=$contextColumnName, costColumnName=$costColumnName, groundTruthColumnName=$groundTruthColumnName, inferenceIdColumnName=$inferenceIdColumnName, inputVariableNames=$inputVariableNames, latencyColumnName=$latencyColumnName, metadata=$metadata, outputColumnName=$outputColumnName, prompt=$prompt, questionColumnName=$questionColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TabularClassificationData.Builder::class)
        @NoAutoDetect
        class TabularClassificationData
        private constructor(
            private val categoricalFeatureNames: JsonField<List<String>>,
            private val classNames: JsonField<List<String>>,
            private val featureNames: JsonField<List<String>>,
            private val inferenceIdColumnName: JsonField<String>,
            private val labelColumnName: JsonField<String>,
            private val latencyColumnName: JsonField<String>,
            private val metadata: JsonValue,
            private val predictionsColumnName: JsonField<String>,
            private val predictionScoresColumnName: JsonField<String>,
            private val timestampColumnName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Age", "Geography"].
             */
            fun categoricalFeatureNames(): Optional<List<String>> =
                Optional.ofNullable(categoricalFeatureNames.getNullable("categoricalFeatureNames"))

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            fun classNames(): List<String> = classNames.getRequired("classNames")

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
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Age", "Geography"].
             */
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            fun _categoricalFeatureNames() = categoricalFeatureNames

            /**
             * List of class names indexed by label integer in the dataset. E.g.
             * ["Retained", "Exited"] when 0, 1 are in your label column.
             */
            @JsonProperty("classNames") @ExcludeMissing fun _classNames() = classNames

            /** Array with all input feature names. */
            @JsonProperty("featureNames") @ExcludeMissing fun _featureNames() = featureNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName() = inferenceIdColumnName

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName() = labelColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName() = latencyColumnName

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName() = predictionsColumnName

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName() = predictionScoresColumnName

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            fun _timestampColumnName() = timestampColumnName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TabularClassificationData = apply {
                if (!validated) {
                    categoricalFeatureNames()
                    classNames()
                    featureNames()
                    inferenceIdColumnName()
                    labelColumnName()
                    latencyColumnName()
                    predictionsColumnName()
                    predictionScoresColumnName()
                    timestampColumnName()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var categoricalFeatureNames: JsonField<List<String>> = JsonMissing.of()
                private var classNames: JsonField<List<String>> = JsonMissing.of()
                private var featureNames: JsonField<List<String>> = JsonMissing.of()
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
                    this.categoricalFeatureNames = tabularClassificationData.categoricalFeatureNames
                    this.classNames = tabularClassificationData.classNames
                    this.featureNames = tabularClassificationData.featureNames
                    this.inferenceIdColumnName = tabularClassificationData.inferenceIdColumnName
                    this.labelColumnName = tabularClassificationData.labelColumnName
                    this.latencyColumnName = tabularClassificationData.latencyColumnName
                    this.metadata = tabularClassificationData.metadata
                    this.predictionsColumnName = tabularClassificationData.predictionsColumnName
                    this.predictionScoresColumnName =
                        tabularClassificationData.predictionScoresColumnName
                    this.timestampColumnName = tabularClassificationData.timestampColumnName
                    additionalProperties(tabularClassificationData.additionalProperties)
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
                @JsonProperty("categoricalFeatureNames")
                @ExcludeMissing
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames = categoricalFeatureNames
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
                @JsonProperty("classNames")
                @ExcludeMissing
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames
                }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /** Array with all input feature names. */
                @JsonProperty("featureNames")
                @ExcludeMissing
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames
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
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
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
                @JsonProperty("labelColumnName")
                @ExcludeMissing
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                @JsonProperty("predictionsColumnName")
                @ExcludeMissing
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
                @JsonProperty("predictionScoresColumnName")
                @ExcludeMissing
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
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                    this.timestampColumnName = timestampColumnName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TabularClassificationData =
                    TabularClassificationData(
                        categoricalFeatureNames.map { it.toImmutable() },
                        classNames.map { it.toImmutable() },
                        featureNames.map { it.toImmutable() },
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

                return /* spotless:off */ other is TabularClassificationData && categoricalFeatureNames == other.categoricalFeatureNames && classNames == other.classNames && featureNames == other.featureNames && inferenceIdColumnName == other.inferenceIdColumnName && labelColumnName == other.labelColumnName && latencyColumnName == other.latencyColumnName && metadata == other.metadata && predictionsColumnName == other.predictionsColumnName && predictionScoresColumnName == other.predictionScoresColumnName && timestampColumnName == other.timestampColumnName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(categoricalFeatureNames, classNames, featureNames, inferenceIdColumnName, labelColumnName, latencyColumnName, metadata, predictionsColumnName, predictionScoresColumnName, timestampColumnName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TabularClassificationData{categoricalFeatureNames=$categoricalFeatureNames, classNames=$classNames, featureNames=$featureNames, inferenceIdColumnName=$inferenceIdColumnName, labelColumnName=$labelColumnName, latencyColumnName=$latencyColumnName, metadata=$metadata, predictionsColumnName=$predictionsColumnName, predictionScoresColumnName=$predictionScoresColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TabularRegressionData.Builder::class)
        @NoAutoDetect
        class TabularRegressionData
        private constructor(
            private val categoricalFeatureNames: JsonField<List<String>>,
            private val featureNames: JsonField<List<String>>,
            private val inferenceIdColumnName: JsonField<String>,
            private val latencyColumnName: JsonField<String>,
            private val metadata: JsonValue,
            private val predictionsColumnName: JsonField<String>,
            private val targetColumnName: JsonField<String>,
            private val timestampColumnName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            fun _categoricalFeatureNames() = categoricalFeatureNames

            /** Array with all input feature names. */
            @JsonProperty("featureNames") @ExcludeMissing fun _featureNames() = featureNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName() = inferenceIdColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName() = latencyColumnName

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** Name of the column with the model's predictions. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName() = predictionsColumnName

            /** Name of the column with the targets (ground truth values). */
            @JsonProperty("targetColumnName")
            @ExcludeMissing
            fun _targetColumnName() = targetColumnName

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            fun _timestampColumnName() = timestampColumnName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TabularRegressionData = apply {
                if (!validated) {
                    categoricalFeatureNames()
                    featureNames()
                    inferenceIdColumnName()
                    latencyColumnName()
                    predictionsColumnName()
                    targetColumnName()
                    timestampColumnName()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var categoricalFeatureNames: JsonField<List<String>> = JsonMissing.of()
                private var featureNames: JsonField<List<String>> = JsonMissing.of()
                private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                private var latencyColumnName: JsonField<String> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var predictionsColumnName: JsonField<String> = JsonMissing.of()
                private var targetColumnName: JsonField<String> = JsonMissing.of()
                private var timestampColumnName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tabularRegressionData: TabularRegressionData) = apply {
                    this.categoricalFeatureNames = tabularRegressionData.categoricalFeatureNames
                    this.featureNames = tabularRegressionData.featureNames
                    this.inferenceIdColumnName = tabularRegressionData.inferenceIdColumnName
                    this.latencyColumnName = tabularRegressionData.latencyColumnName
                    this.metadata = tabularRegressionData.metadata
                    this.predictionsColumnName = tabularRegressionData.predictionsColumnName
                    this.targetColumnName = tabularRegressionData.targetColumnName
                    this.timestampColumnName = tabularRegressionData.timestampColumnName
                    additionalProperties(tabularRegressionData.additionalProperties)
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
                @JsonProperty("categoricalFeatureNames")
                @ExcludeMissing
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames = categoricalFeatureNames
                    }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /** Array with all input feature names. */
                @JsonProperty("featureNames")
                @ExcludeMissing
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames
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
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions. */
                @JsonProperty("predictionsColumnName")
                @ExcludeMissing
                fun predictionsColumnName(predictionsColumnName: JsonField<String>) = apply {
                    this.predictionsColumnName = predictionsColumnName
                }

                /** Name of the column with the targets (ground truth values). */
                fun targetColumnName(targetColumnName: String) =
                    targetColumnName(JsonField.of(targetColumnName))

                /** Name of the column with the targets (ground truth values). */
                @JsonProperty("targetColumnName")
                @ExcludeMissing
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
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                    this.timestampColumnName = timestampColumnName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TabularRegressionData =
                    TabularRegressionData(
                        categoricalFeatureNames.map { it.toImmutable() },
                        featureNames.map { it.toImmutable() },
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

        @JsonDeserialize(builder = TextClassificationData.Builder::class)
        @NoAutoDetect
        class TextClassificationData
        private constructor(
            private val classNames: JsonField<List<String>>,
            private val inferenceIdColumnName: JsonField<String>,
            private val labelColumnName: JsonField<String>,
            private val latencyColumnName: JsonField<String>,
            private val metadata: JsonValue,
            private val predictionsColumnName: JsonField<String>,
            private val predictionScoresColumnName: JsonField<String>,
            private val textColumnName: JsonField<String>,
            private val timestampColumnName: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("classNames") @ExcludeMissing fun _classNames() = classNames

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName() = inferenceIdColumnName

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName() = labelColumnName

            /** Name of the column with the latencies. */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName() = latencyColumnName

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

            /** Name of the column with the model's predictions as **zero-indexed integers**. */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName() = predictionsColumnName

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName() = predictionScoresColumnName

            /** Name of the column with the text data. */
            @JsonProperty("textColumnName") @ExcludeMissing fun _textColumnName() = textColumnName

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             */
            @JsonProperty("timestampColumnName")
            @ExcludeMissing
            fun _timestampColumnName() = timestampColumnName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TextClassificationData = apply {
                if (!validated) {
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
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var classNames: JsonField<List<String>> = JsonMissing.of()
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
                    this.classNames = textClassificationData.classNames
                    this.inferenceIdColumnName = textClassificationData.inferenceIdColumnName
                    this.labelColumnName = textClassificationData.labelColumnName
                    this.latencyColumnName = textClassificationData.latencyColumnName
                    this.metadata = textClassificationData.metadata
                    this.predictionsColumnName = textClassificationData.predictionsColumnName
                    this.predictionScoresColumnName =
                        textClassificationData.predictionScoresColumnName
                    this.textColumnName = textClassificationData.textColumnName
                    this.timestampColumnName = textClassificationData.timestampColumnName
                    additionalProperties(textClassificationData.additionalProperties)
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
                @JsonProperty("classNames")
                @ExcludeMissing
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames
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
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
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
                @JsonProperty("labelColumnName")
                @ExcludeMissing
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /** Name of the column with the latencies. */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                @JsonProperty("predictionsColumnName")
                @ExcludeMissing
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
                @JsonProperty("predictionScoresColumnName")
                @ExcludeMissing
                fun predictionScoresColumnName(predictionScoresColumnName: JsonField<String>) =
                    apply {
                        this.predictionScoresColumnName = predictionScoresColumnName
                    }

                /** Name of the column with the text data. */
                fun textColumnName(textColumnName: String) =
                    textColumnName(JsonField.of(textColumnName))

                /** Name of the column with the text data. */
                @JsonProperty("textColumnName")
                @ExcludeMissing
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
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                    this.timestampColumnName = timestampColumnName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TextClassificationData =
                    TextClassificationData(
                        classNames.map { it.toImmutable() },
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

    @JsonDeserialize(builder = Row.Builder::class)
    @NoAutoDetect
    class Row
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(row: Row) = apply { additionalProperties(row.additionalProperties) }

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
}
