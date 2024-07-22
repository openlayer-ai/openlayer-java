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

class ProjectListParams constructor(
  private val name: String?,
  private val page: Long?,
  private val perPage: Long?,
  private val taskType: TaskType?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun taskType(): Optional<TaskType> = Optional.ofNullable(taskType)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.name?.let {
          params.put("name", listOf(it.toString()))
      }
      this.page?.let {
          params.put("page", listOf(it.toString()))
      }
      this.perPage?.let {
          params.put("perPage", listOf(it.toString()))
      }
      this.taskType?.let {
          params.put("taskType", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is ProjectListParams &&
          this.name == other.name &&
          this.page == other.page &&
          this.perPage == other.perPage &&
          this.taskType == other.taskType &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          name,
          page,
          perPage,
          taskType,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ProjectListParams{name=$name, page=$page, perPage=$perPage, taskType=$taskType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var taskType: TaskType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectListParams: ProjectListParams) = apply {
            this.name = projectListParams.name
            this.page = projectListParams.page
            this.perPage = projectListParams.perPage
            this.taskType = projectListParams.taskType
            additionalQueryParams(projectListParams.additionalQueryParams)
            additionalHeaders(projectListParams.additionalHeaders)
            additionalBodyProperties(projectListParams.additionalBodyProperties)
        }

        /** Filter list of items by project name. */
        fun name(name: String) = apply {
            this.name = name
        }

        /** The page to return in a paginated query. */
        fun page(page: Long) = apply {
            this.page = page
        }

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long) = apply {
            this.perPage = perPage
        }

        /** Filter list of items by task type. */
        fun taskType(taskType: TaskType) = apply {
            this.taskType = taskType
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

        fun build(): ProjectListParams = ProjectListParams(
            name,
            page,
            perPage,
            taskType,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class TaskType @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TaskType &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LLM_BASE = TaskType(JsonField.of("llm-base"))

            @JvmField val TABULAR_CLASSIFICATION = TaskType(JsonField.of("tabular-classification"))

            @JvmField val TABULAR_REGRESSION = TaskType(JsonField.of("tabular-regression"))

            @JvmField val TEXT_CLASSIFICATION = TaskType(JsonField.of("text-classification"))

            @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
        }

        enum class Known {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
        }

        enum class Value {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            LLM_BASE -> Value.LLM_BASE
            TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
            TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
            TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            LLM_BASE -> Known.LLM_BASE
            TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
            TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
            TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
            else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
