// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.data

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
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Publish an inference data point to an inference pipeline. */
class DataStreamParams
private constructor(
    private val inferencePipelineId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): String = inferencePipelineId

    /**
     * Configuration for the data stream. Depends on your **Openlayer project task type**.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = body.config()

    /**
     * A list of inference data points with inputs and outputs
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rows(): List<Row> = body.rows()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<Config> = body._config()

    /**
     * Returns the raw JSON value of [rows].
     *
     * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rows(): JsonField<List<Row>> = body._rows()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

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
        @JsonProperty("config")
        @ExcludeMissing
        private val config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("rows")
        @ExcludeMissing
        private val rows: JsonField<List<Row>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Configuration for the data stream. Depends on your **Openlayer project task type**.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun config(): Config = config.getRequired("config")

        /**
         * A list of inference data points with inputs and outputs
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rows(): List<Row> = rows.getRequired("rows")

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        /**
         * Returns the raw JSON value of [rows].
         *
         * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            config().validate()
            rows().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .config()
             * .rows()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var config: JsonField<Config>? = null
            private var rows: JsonField<MutableList<Row>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                config = body.config
                rows = body.rows.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Configuration for the data stream. Depends on your **Openlayer project task type**.
             */
            fun config(config: Config) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            /** Alias for calling [config] with `Config.ofLlmData(llmData)`. */
            fun config(llmData: Config.LlmData) = config(Config.ofLlmData(llmData))

            /**
             * Alias for calling [config] with
             * `Config.ofTabularClassificationData(tabularClassificationData)`.
             */
            fun config(tabularClassificationData: Config.TabularClassificationData) =
                config(Config.ofTabularClassificationData(tabularClassificationData))

            /**
             * Alias for calling [config] with
             * `Config.ofTabularRegressionData(tabularRegressionData)`.
             */
            fun config(tabularRegressionData: Config.TabularRegressionData) =
                config(Config.ofTabularRegressionData(tabularRegressionData))

            /**
             * Alias for calling [config] with
             * `Config.ofTextClassificationData(textClassificationData)`.
             */
            fun config(textClassificationData: Config.TextClassificationData) =
                config(Config.ofTextClassificationData(textClassificationData))

            /** A list of inference data points with inputs and outputs */
            fun rows(rows: List<Row>) = rows(JsonField.of(rows))

            /**
             * Sets [Builder.rows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rows] with a well-typed `List<Row>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rows(rows: JsonField<List<Row>>) = apply {
                this.rows = rows.map { it.toMutableList() }
            }

            /**
             * Adds a single [Row] to [rows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRow(row: Row) = apply {
                rows =
                    (rows ?: JsonField.of(mutableListOf())).also { checkKnown("rows", it).add(row) }
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
             * .config()
             * .rows()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("config", config),
                    checkRequired("rows", rows).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && config == other.config && rows == other.rows && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(config, rows, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{config=$config, rows=$rows, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataStreamParams].
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * .config()
         * .rows()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataStreamParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataStreamParams: DataStreamParams) = apply {
            inferencePipelineId = dataStreamParams.inferencePipelineId
            body = dataStreamParams.body.toBuilder()
            additionalHeaders = dataStreamParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataStreamParams.additionalQueryParams.toBuilder()
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Configuration for the data stream. Depends on your **Openlayer project task type**. */
        fun config(config: Config) = apply { body.config(config) }

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

        /** Alias for calling [config] with `Config.ofLlmData(llmData)`. */
        fun config(llmData: Config.LlmData) = apply { body.config(llmData) }

        /**
         * Alias for calling [config] with
         * `Config.ofTabularClassificationData(tabularClassificationData)`.
         */
        fun config(tabularClassificationData: Config.TabularClassificationData) = apply {
            body.config(tabularClassificationData)
        }

        /**
         * Alias for calling [config] with `Config.ofTabularRegressionData(tabularRegressionData)`.
         */
        fun config(tabularRegressionData: Config.TabularRegressionData) = apply {
            body.config(tabularRegressionData)
        }

        /**
         * Alias for calling [config] with
         * `Config.ofTextClassificationData(textClassificationData)`.
         */
        fun config(textClassificationData: Config.TextClassificationData) = apply {
            body.config(textClassificationData)
        }

        /** A list of inference data points with inputs and outputs */
        fun rows(rows: List<Row>) = apply { body.rows(rows) }

        /**
         * Sets [Builder.rows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rows] with a well-typed `List<Row>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rows(rows: JsonField<List<Row>>) = apply { body.rows(rows) }

        /**
         * Adds a single [Row] to [rows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * Returns an immutable instance of [DataStreamParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * .config()
         * .rows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataStreamParams =
            DataStreamParams(
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

        /** An interface that defines how to map each variant of [Config] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitLlmData(llmData: LlmData): T

            fun visitTabularClassificationData(
                tabularClassificationData: TabularClassificationData
            ): T

            fun visitTabularRegressionData(tabularRegressionData: TabularRegressionData): T

            fun visitTextClassificationData(textClassificationData: TextClassificationData): T

            /**
             * Maps an unknown variant of [Config] to a value of type [T].
             *
             * An instance of [Config] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws OpenlayerInvalidDataException in the default implementation.
             */
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
                provider: SerializerProvider,
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

            /**
             * Name of the column with the model outputs.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outputColumnName(): String = outputColumnName.getRequired("outputColumnName")

            /**
             * Name of the column with the context retrieved. Applies to RAG use cases. Providing
             * the context enables RAG-specific metrics.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun contextColumnName(): Optional<String> =
                Optional.ofNullable(contextColumnName.getNullable("contextColumnName"))

            /**
             * Name of the column with the cost associated with each row.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun costColumnName(): Optional<String> =
                Optional.ofNullable(costColumnName.getNullable("costColumnName"))

            /**
             * Name of the column with the ground truths.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun groundTruthColumnName(): Optional<String> =
                Optional.ofNullable(groundTruthColumnName.getNullable("groundTruthColumnName"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Array of input variable names. Each input variable should be a dataset column.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inputVariableNames(): Optional<List<String>> =
                Optional.ofNullable(inputVariableNames.getNullable("inputVariableNames"))

            /**
             * Name of the column with the latencies.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Name of the column with the total number of tokens.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun numOfTokenColumnName(): Optional<String> =
                Optional.ofNullable(numOfTokenColumnName.getNullable("numOfTokenColumnName"))

            /**
             * Prompt for the LLM.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun prompt(): Optional<List<Prompt>> = Optional.ofNullable(prompt.getNullable("prompt"))

            /**
             * Name of the column with the questions. Applies to RAG use cases. Providing the
             * question enables RAG-specific metrics.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun questionColumnName(): Optional<String> =
                Optional.ofNullable(questionColumnName.getNullable("questionColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * Returns the raw JSON value of [outputColumnName].
             *
             * Unlike [outputColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("outputColumnName")
            @ExcludeMissing
            fun _outputColumnName(): JsonField<String> = outputColumnName

            /**
             * Returns the raw JSON value of [contextColumnName].
             *
             * Unlike [contextColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contextColumnName")
            @ExcludeMissing
            fun _contextColumnName(): JsonField<String> = contextColumnName

            /**
             * Returns the raw JSON value of [costColumnName].
             *
             * Unlike [costColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("costColumnName")
            @ExcludeMissing
            fun _costColumnName(): JsonField<String> = costColumnName

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
             * Returns the raw JSON value of [inferenceIdColumnName].
             *
             * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inferenceIdColumnName")
            @ExcludeMissing
            fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

            /**
             * Returns the raw JSON value of [inputVariableNames].
             *
             * Unlike [inputVariableNames], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inputVariableNames")
            @ExcludeMissing
            fun _inputVariableNames(): JsonField<List<String>> = inputVariableNames

            /**
             * Returns the raw JSON value of [latencyColumnName].
             *
             * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /**
             * Returns the raw JSON value of [numOfTokenColumnName].
             *
             * Unlike [numOfTokenColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("numOfTokenColumnName")
            @ExcludeMissing
            fun _numOfTokenColumnName(): JsonField<String> = numOfTokenColumnName

            /**
             * Returns the raw JSON value of [prompt].
             *
             * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<List<Prompt>> = prompt

            /**
             * Returns the raw JSON value of [questionColumnName].
             *
             * Unlike [questionColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("questionColumnName")
            @ExcludeMissing
            fun _questionColumnName(): JsonField<String> = questionColumnName

            /**
             * Returns the raw JSON value of [timestampColumnName].
             *
             * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of [LlmData].
                 *
                 * The following fields are required:
                 * ```java
                 * .outputColumnName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LlmData]. */
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

                /**
                 * Sets [Builder.outputColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outputColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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
                 * Sets [Builder.contextColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contextColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contextColumnName(contextColumnName: JsonField<String>) = apply {
                    this.contextColumnName = contextColumnName
                }

                /** Name of the column with the cost associated with each row. */
                fun costColumnName(costColumnName: String) =
                    costColumnName(JsonField.of(costColumnName))

                /**
                 * Sets [Builder.costColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costColumnName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun costColumnName(costColumnName: JsonField<String>) = apply {
                    this.costColumnName = costColumnName
                }

                /** Name of the column with the ground truths. */
                fun groundTruthColumnName(groundTruthColumnName: String) =
                    groundTruthColumnName(JsonField.of(groundTruthColumnName))

                /**
                 * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groundTruthColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
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
                 * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * Sets [Builder.inputVariableNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputVariableNames] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun inputVariableNames(inputVariableNames: JsonField<List<String>>) = apply {
                    this.inputVariableNames = inputVariableNames.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [inputVariableNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInputVariableName(inputVariableName: String) = apply {
                    inputVariableNames =
                        (inputVariableNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("inputVariableNames", it).add(inputVariableName)
                        }
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /**
                 * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the total number of tokens. */
                fun numOfTokenColumnName(numOfTokenColumnName: String?) =
                    numOfTokenColumnName(JsonField.ofNullable(numOfTokenColumnName))

                /**
                 * Alias for calling [Builder.numOfTokenColumnName] with
                 * `numOfTokenColumnName.orElse(null)`.
                 */
                fun numOfTokenColumnName(numOfTokenColumnName: Optional<String>) =
                    numOfTokenColumnName(numOfTokenColumnName.getOrNull())

                /**
                 * Sets [Builder.numOfTokenColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numOfTokenColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun numOfTokenColumnName(numOfTokenColumnName: JsonField<String>) = apply {
                    this.numOfTokenColumnName = numOfTokenColumnName
                }

                /** Prompt for the LLM. */
                fun prompt(prompt: List<Prompt>) = prompt(JsonField.of(prompt))

                /**
                 * Sets [Builder.prompt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prompt] with a well-typed `List<Prompt>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prompt(prompt: JsonField<List<Prompt>>) = apply {
                    this.prompt = prompt.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Prompt] to [Builder.prompt].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPrompt(prompt: Prompt) = apply {
                    this.prompt =
                        (this.prompt ?: JsonField.of(mutableListOf())).also {
                            checkKnown("prompt", it).add(prompt)
                        }
                }

                /**
                 * Name of the column with the questions. Applies to RAG use cases. Providing the
                 * question enables RAG-specific metrics.
                 */
                fun questionColumnName(questionColumnName: String) =
                    questionColumnName(JsonField.of(questionColumnName))

                /**
                 * Sets [Builder.questionColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.questionColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestampColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [LlmData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .outputColumnName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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

                /**
                 * Content of the prompt.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun content(): Optional<String> =
                    Optional.ofNullable(content.getNullable("content"))

                /**
                 * Role of the prompt.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun role(): Optional<String> = Optional.ofNullable(role.getNullable("role"))

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
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

                    /** Returns a mutable builder for constructing an instance of [Prompt]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Prompt]. */
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

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** Role of the prompt. */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Prompt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Prompt = Prompt(content, role, additionalProperties.toImmutable())
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
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun classNames(): List<String> = classNames.getRequired("classNames")

            /**
             * Array with the names of all categorical features in the dataset. E.g.
             * ["Age", "Geography"].
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun categoricalFeatureNames(): Optional<List<String>> =
                Optional.ofNullable(categoricalFeatureNames.getNullable("categoricalFeatureNames"))

            /**
             * Array with all input feature names.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun featureNames(): Optional<List<String>> =
                Optional.ofNullable(featureNames.getNullable("featureNames"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun labelColumnName(): Optional<String> =
                Optional.ofNullable(labelColumnName.getNullable("labelColumnName"))

            /**
             * Name of the column with the latencies.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Name of the column with the model's predictions as **zero-indexed integers**.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionScoresColumnName(): Optional<String> =
                Optional.ofNullable(
                    predictionScoresColumnName.getNullable("predictionScoresColumnName")
                )

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * Returns the raw JSON value of [classNames].
             *
             * Unlike [classNames], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("classNames")
            @ExcludeMissing
            fun _classNames(): JsonField<List<String>> = classNames

            /**
             * Returns the raw JSON value of [categoricalFeatureNames].
             *
             * Unlike [categoricalFeatureNames], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            fun _categoricalFeatureNames(): JsonField<List<String>> = categoricalFeatureNames

            /**
             * Returns the raw JSON value of [featureNames].
             *
             * Unlike [featureNames], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("featureNames")
            @ExcludeMissing
            fun _featureNames(): JsonField<List<String>> = featureNames

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
             * Returns the raw JSON value of [labelColumnName].
             *
             * Unlike [labelColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName(): JsonField<String> = labelColumnName

            /**
             * Returns the raw JSON value of [latencyColumnName].
             *
             * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /**
             * Returns the raw JSON value of [predictionsColumnName].
             *
             * Unlike [predictionsColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /**
             * Returns the raw JSON value of [predictionScoresColumnName].
             *
             * Unlike [predictionScoresColumnName], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName(): JsonField<String> = predictionScoresColumnName

            /**
             * Returns the raw JSON value of [timestampColumnName].
             *
             * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TabularClassificationData].
                 *
                 * The following fields are required:
                 * ```java
                 * .classNames()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TabularClassificationData]. */
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
                 * Sets [Builder.classNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.classNames] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [classNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addClassName(className: String) = apply {
                    classNames =
                        (classNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("classNames", it).add(className)
                        }
                }

                /**
                 * Array with the names of all categorical features in the dataset. E.g.
                 * ["Age", "Geography"].
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: List<String>) =
                    categoricalFeatureNames(JsonField.of(categoricalFeatureNames))

                /**
                 * Sets [Builder.categoricalFeatureNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categoricalFeatureNames] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames =
                            categoricalFeatureNames.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [categoricalFeatureNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCategoricalFeatureName(categoricalFeatureName: String) = apply {
                    categoricalFeatureNames =
                        (categoricalFeatureNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("categoricalFeatureNames", it).add(categoricalFeatureName)
                        }
                }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /**
                 * Sets [Builder.featureNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureNames] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [featureNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFeatureName(featureName: String) = apply {
                    featureNames =
                        (featureNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("featureNames", it).add(featureName)
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
                 * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * Sets [Builder.labelColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.labelColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /**
                 * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /**
                 * Sets [Builder.predictionsColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionsColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
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
                 * Sets [Builder.predictionScoresColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionScoresColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestampColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [TabularClassificationData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .classNames()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun categoricalFeatureNames(): Optional<List<String>> =
                Optional.ofNullable(categoricalFeatureNames.getNullable("categoricalFeatureNames"))

            /**
             * Array with all input feature names.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun featureNames(): Optional<List<String>> =
                Optional.ofNullable(featureNames.getNullable("featureNames"))

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Name of the column with the latencies.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Name of the column with the model's predictions.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /**
             * Name of the column with the targets (ground truth values).
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun targetColumnName(): Optional<String> =
                Optional.ofNullable(targetColumnName.getNullable("targetColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * Returns the raw JSON value of [categoricalFeatureNames].
             *
             * Unlike [categoricalFeatureNames], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("categoricalFeatureNames")
            @ExcludeMissing
            fun _categoricalFeatureNames(): JsonField<List<String>> = categoricalFeatureNames

            /**
             * Returns the raw JSON value of [featureNames].
             *
             * Unlike [featureNames], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("featureNames")
            @ExcludeMissing
            fun _featureNames(): JsonField<List<String>> = featureNames

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
             * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /**
             * Returns the raw JSON value of [predictionsColumnName].
             *
             * Unlike [predictionsColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /**
             * Returns the raw JSON value of [targetColumnName].
             *
             * Unlike [targetColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("targetColumnName")
            @ExcludeMissing
            fun _targetColumnName(): JsonField<String> = targetColumnName

            /**
             * Returns the raw JSON value of [timestampColumnName].
             *
             * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TabularRegressionData].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TabularRegressionData]. */
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
                 * Sets [Builder.categoricalFeatureNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.categoricalFeatureNames] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun categoricalFeatureNames(categoricalFeatureNames: JsonField<List<String>>) =
                    apply {
                        this.categoricalFeatureNames =
                            categoricalFeatureNames.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [categoricalFeatureNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCategoricalFeatureName(categoricalFeatureName: String) = apply {
                    categoricalFeatureNames =
                        (categoricalFeatureNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("categoricalFeatureNames", it).add(categoricalFeatureName)
                        }
                }

                /** Array with all input feature names. */
                fun featureNames(featureNames: List<String>) =
                    featureNames(JsonField.of(featureNames))

                /**
                 * Sets [Builder.featureNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.featureNames] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun featureNames(featureNames: JsonField<List<String>>) = apply {
                    this.featureNames = featureNames.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [featureNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addFeatureName(featureName: String) = apply {
                    featureNames =
                        (featureNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("featureNames", it).add(featureName)
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
                 * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                    this.inferenceIdColumnName = inferenceIdColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /**
                 * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /**
                 * Sets [Builder.predictionsColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionsColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun predictionsColumnName(predictionsColumnName: JsonField<String>) = apply {
                    this.predictionsColumnName = predictionsColumnName
                }

                /** Name of the column with the targets (ground truth values). */
                fun targetColumnName(targetColumnName: String) =
                    targetColumnName(JsonField.of(targetColumnName))

                /**
                 * Sets [Builder.targetColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.targetColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
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
                 * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestampColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [TabularRegressionData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
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
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun classNames(): List<String> = classNames.getRequired("classNames")

            /**
             * Name of the column with the inference ids. This is useful if you want to update rows
             * at a later point in time. If not provided, a unique id is generated by Openlayer.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inferenceIdColumnName(): Optional<String> =
                Optional.ofNullable(inferenceIdColumnName.getNullable("inferenceIdColumnName"))

            /**
             * Name of the column with the labels. The data in this column must be **zero-indexed
             * integers**, matching the list provided in `classNames`.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun labelColumnName(): Optional<String> =
                Optional.ofNullable(labelColumnName.getNullable("labelColumnName"))

            /**
             * Name of the column with the latencies.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun latencyColumnName(): Optional<String> =
                Optional.ofNullable(latencyColumnName.getNullable("latencyColumnName"))

            /** Object with metadata. */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * Name of the column with the model's predictions as **zero-indexed integers**.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionsColumnName(): Optional<String> =
                Optional.ofNullable(predictionsColumnName.getNullable("predictionsColumnName"))

            /**
             * Name of the column with the model's predictions as **lists of class probabilities**.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionScoresColumnName(): Optional<String> =
                Optional.ofNullable(
                    predictionScoresColumnName.getNullable("predictionScoresColumnName")
                )

            /**
             * Name of the column with the text data.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun textColumnName(): Optional<String> =
                Optional.ofNullable(textColumnName.getNullable("textColumnName"))

            /**
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If not
             * provided, the upload timestamp is used.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun timestampColumnName(): Optional<String> =
                Optional.ofNullable(timestampColumnName.getNullable("timestampColumnName"))

            /**
             * Returns the raw JSON value of [classNames].
             *
             * Unlike [classNames], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("classNames")
            @ExcludeMissing
            fun _classNames(): JsonField<List<String>> = classNames

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
             * Returns the raw JSON value of [labelColumnName].
             *
             * Unlike [labelColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("labelColumnName")
            @ExcludeMissing
            fun _labelColumnName(): JsonField<String> = labelColumnName

            /**
             * Returns the raw JSON value of [latencyColumnName].
             *
             * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("latencyColumnName")
            @ExcludeMissing
            fun _latencyColumnName(): JsonField<String> = latencyColumnName

            /**
             * Returns the raw JSON value of [predictionsColumnName].
             *
             * Unlike [predictionsColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictionsColumnName")
            @ExcludeMissing
            fun _predictionsColumnName(): JsonField<String> = predictionsColumnName

            /**
             * Returns the raw JSON value of [predictionScoresColumnName].
             *
             * Unlike [predictionScoresColumnName], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("predictionScoresColumnName")
            @ExcludeMissing
            fun _predictionScoresColumnName(): JsonField<String> = predictionScoresColumnName

            /**
             * Returns the raw JSON value of [textColumnName].
             *
             * Unlike [textColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("textColumnName")
            @ExcludeMissing
            fun _textColumnName(): JsonField<String> = textColumnName

            /**
             * Returns the raw JSON value of [timestampColumnName].
             *
             * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TextClassificationData].
                 *
                 * The following fields are required:
                 * ```java
                 * .classNames()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TextClassificationData]. */
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
                 * Sets [Builder.classNames] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.classNames] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun classNames(classNames: JsonField<List<String>>) = apply {
                    this.classNames = classNames.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [classNames].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addClassName(className: String) = apply {
                    classNames =
                        (classNames ?: JsonField.of(mutableListOf())).also {
                            checkKnown("classNames", it).add(className)
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
                 * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * Sets [Builder.labelColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.labelColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun labelColumnName(labelColumnName: JsonField<String>) = apply {
                    this.labelColumnName = labelColumnName
                }

                /** Name of the column with the latencies. */
                fun latencyColumnName(latencyColumnName: String) =
                    latencyColumnName(JsonField.of(latencyColumnName))

                /**
                 * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latencyColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                    this.latencyColumnName = latencyColumnName
                }

                /** Object with metadata. */
                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                /** Name of the column with the model's predictions as **zero-indexed integers**. */
                fun predictionsColumnName(predictionsColumnName: String) =
                    predictionsColumnName(JsonField.of(predictionsColumnName))

                /**
                 * Sets [Builder.predictionsColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionsColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
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
                 * Sets [Builder.predictionScoresColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionScoresColumnName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun predictionScoresColumnName(predictionScoresColumnName: JsonField<String>) =
                    apply {
                        this.predictionScoresColumnName = predictionScoresColumnName
                    }

                /** Name of the column with the text data. */
                fun textColumnName(textColumnName: String) =
                    textColumnName(JsonField.of(textColumnName))

                /**
                 * Sets [Builder.textColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.textColumnName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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
                 * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestampColumnName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [TextClassificationData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .classNames()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

            /** Returns a mutable builder for constructing an instance of [Row]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Row]. */
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

            /**
             * Returns an immutable instance of [Row].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
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

        return /* spotless:off */ other is DataStreamParams && inferencePipelineId == other.inferencePipelineId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataStreamParams{inferencePipelineId=$inferencePipelineId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
