// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.apache.hc.core5.http.ContentType
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.MultipartFormValue
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ContentTypes
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*

class InferencePipelineRowUpdateParams constructor(
  private val inferencePipelineId: String,
  private val inferenceId: String,
  private val row: JsonValue,
  private val config: Config?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun inferenceId(): String = inferenceId

    fun row(): JsonValue = row

    fun config(): Optional<Config> = Optional.ofNullable(config)

    @JvmSynthetic
    internal fun getBody(): InferencePipelineRowUpdateBody {
      return InferencePipelineRowUpdateBody(
          row,
          config,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.inferenceId.let {
          params.put("inferenceId", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> inferencePipelineId
          else -> ""
      }
    }

    @JsonDeserialize(builder = InferencePipelineRowUpdateBody.Builder::class)
    @NoAutoDetect
    class InferencePipelineRowUpdateBody internal constructor(private val row: JsonValue?, private val config: Config?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        @JsonProperty("row")
        fun row(): JsonValue? = row

        @JsonProperty("config")
        fun config(): Config? = config

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is InferencePipelineRowUpdateBody &&
              this.row == other.row &&
              this.config == other.config &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                row,
                config,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "InferencePipelineRowUpdateBody{row=$row, config=$config, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var row: JsonValue? = null
            private var config: Config? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inferencePipelineRowUpdateBody: InferencePipelineRowUpdateBody) = apply {
                this.row = inferencePipelineRowUpdateBody.row
                this.config = inferencePipelineRowUpdateBody.config
                additionalProperties(inferencePipelineRowUpdateBody.additionalProperties)
            }

            @JsonProperty("row")
            fun row(row: JsonValue) = apply {
                this.row = row
            }

            @JsonProperty("config")
            fun config(config: Config) = apply {
                this.config = config
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

            fun build(): InferencePipelineRowUpdateBody = InferencePipelineRowUpdateBody(
                checkNotNull(row) {
                    "`row` is required but was not set"
                },
                config,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is InferencePipelineRowUpdateParams &&
          this.inferencePipelineId == other.inferencePipelineId &&
          this.row == other.row &&
          this.config == other.config &&
          this.inferenceId == other.inferenceId &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          inferencePipelineId,
          row,
          config,
          inferenceId,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "InferencePipelineRowUpdateParams{inferencePipelineId=$inferencePipelineId, row=$row, config=$config, inferenceId=$inferenceId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inferencePipelineId: String? = null
        private var inferenceId: String? = null
        private var row: JsonValue? = null
        private var config: Config? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineRowUpdateParams: InferencePipelineRowUpdateParams) = apply {
            this.inferencePipelineId = inferencePipelineRowUpdateParams.inferencePipelineId
            this.inferenceId = inferencePipelineRowUpdateParams.inferenceId
            this.row = inferencePipelineRowUpdateParams.row
            this.config = inferencePipelineRowUpdateParams.config
            additionalQueryParams(inferencePipelineRowUpdateParams.additionalQueryParams)
            additionalHeaders(inferencePipelineRowUpdateParams.additionalHeaders)
            additionalBodyProperties(inferencePipelineRowUpdateParams.additionalBodyProperties)
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Specify the inference id as a query param. */
        fun inferenceId(inferenceId: String) = apply {
            this.inferenceId = inferenceId
        }

        fun row(row: JsonValue) = apply {
            this.row = row
        }

        fun config(config: Config) = apply {
            this.config = config
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply {
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun build(): InferencePipelineRowUpdateParams = InferencePipelineRowUpdateParams(
            checkNotNull(inferencePipelineId) {
                "`inferencePipelineId` is required but was not set"
            },
            checkNotNull(inferenceId) {
                "`inferenceId` is required but was not set"
            },
            checkNotNull(row) {
                "`row` is required but was not set"
            },
            config,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Config.Builder::class)
    @NoAutoDetect
    class Config private constructor(
      private val inferenceIdColumnName: String?,
      private val latencyColumnName: String?,
      private val timestampColumnName: String?,
      private val groundTruthColumnName: String?,
      private val humanFeedbackColumnName: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /**
         * Name of the column with the inference ids. This is useful if you want to update
         * rows at a later point in time. If not provided, a unique id is generated by
         * Openlayer.
         */
        @JsonProperty("inferenceIdColumnName")
        fun inferenceIdColumnName(): String? = inferenceIdColumnName

        /** Name of the column with the latencies. */
        @JsonProperty("latencyColumnName")
        fun latencyColumnName(): String? = latencyColumnName

        /**
         * Name of the column with the timestamps. Timestamps must be in UNIX sec format.
         * If not provided, the upload timestamp is used.
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

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Config &&
              this.inferenceIdColumnName == other.inferenceIdColumnName &&
              this.latencyColumnName == other.latencyColumnName &&
              this.timestampColumnName == other.timestampColumnName &&
              this.groundTruthColumnName == other.groundTruthColumnName &&
              this.humanFeedbackColumnName == other.humanFeedbackColumnName &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                inferenceIdColumnName,
                latencyColumnName,
                timestampColumnName,
                groundTruthColumnName,
                humanFeedbackColumnName,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Config{inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
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
             * Name of the column with the inference ids. This is useful if you want to update
             * rows at a later point in time. If not provided, a unique id is generated by
             * Openlayer.
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
             * Name of the column with the timestamps. Timestamps must be in UNIX sec format.
             * If not provided, the upload timestamp is used.
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

            fun build(): Config = Config(
                inferenceIdColumnName,
                latencyColumnName,
                timestampColumnName,
                groundTruthColumnName,
                humanFeedbackColumnName,
                additionalProperties.toUnmodifiable(),
            )
        }
    }
}
