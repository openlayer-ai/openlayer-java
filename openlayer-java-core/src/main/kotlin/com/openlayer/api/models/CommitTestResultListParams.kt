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

class CommitTestResultListParams constructor(
  private val projectVersionId: String,
  private val includeArchived: Boolean?,
  private val page: Long?,
  private val perPage: Long?,
  private val status: Status?,
  private val type: Type?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun projectVersionId(): String = projectVersionId

    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
      val params = mutableMapOf<String, List<String>>()
      this.includeArchived?.let {
          params.put("includeArchived", listOf(it.toString()))
      }
      this.page?.let {
          params.put("page", listOf(it.toString()))
      }
      this.perPage?.let {
          params.put("perPage", listOf(it.toString()))
      }
      this.status?.let {
          params.put("status", listOf(it.toString()))
      }
      this.type?.let {
          params.put("type", listOf(it.toString()))
      }
      params.putAll(additionalQueryParams)
      return params.toUnmodifiable()
    }

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> projectVersionId
          else -> ""
      }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is CommitTestResultListParams &&
          this.projectVersionId == other.projectVersionId &&
          this.includeArchived == other.includeArchived &&
          this.page == other.page &&
          this.perPage == other.perPage &&
          this.status == other.status &&
          this.type == other.type &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          projectVersionId,
          includeArchived,
          page,
          perPage,
          status,
          type,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "CommitTestResultListParams{projectVersionId=$projectVersionId, includeArchived=$includeArchived, page=$page, perPage=$perPage, status=$status, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectVersionId: String? = null
        private var includeArchived: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitTestResultListParams: CommitTestResultListParams) = apply {
            this.projectVersionId = commitTestResultListParams.projectVersionId
            this.includeArchived = commitTestResultListParams.includeArchived
            this.page = commitTestResultListParams.page
            this.perPage = commitTestResultListParams.perPage
            this.status = commitTestResultListParams.status
            this.type = commitTestResultListParams.type
            additionalQueryParams(commitTestResultListParams.additionalQueryParams)
            additionalHeaders(commitTestResultListParams.additionalHeaders)
            additionalBodyProperties(commitTestResultListParams.additionalBodyProperties)
        }

        fun projectVersionId(projectVersionId: String) = apply {
            this.projectVersionId = projectVersionId
        }

        /** Include archived goals. */
        fun includeArchived(includeArchived: Boolean) = apply {
            this.includeArchived = includeArchived
        }

        /** The page to return in a paginated query. */
        fun page(page: Long) = apply {
            this.page = page
        }

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long) = apply {
            this.perPage = perPage
        }

        /**
         * Filter list of test results by status. Available statuses are `running`,
         * `passing`, `failing`, `skipped`, and `error`.
         */
        fun status(status: Status) = apply {
            this.status = status
        }

        /**
         * Filter objects by test type. Available types are `integrity`, `consistency`,
         * `performance`, `fairness`, and `robustness`.
         */
        fun type(type: Type) = apply {
            this.type = type
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

        fun build(): CommitTestResultListParams = CommitTestResultListParams(
            checkNotNull(projectVersionId) {
                "`projectVersionId` is required but was not set"
            },
            includeArchived,
            page,
            perPage,
            status,
            type,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val RUNNING = Status(JsonField.of("running"))

            @JvmField val PASSING = Status(JsonField.of("passing"))

            @JvmField val FAILING = Status(JsonField.of("failing"))

            @JvmField val SKIPPED = Status(JsonField.of("skipped"))

            @JvmField val ERROR = Status(JsonField.of("error"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
        }

        enum class Value {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            RUNNING -> Value.RUNNING
            PASSING -> Value.PASSING
            FAILING -> Value.FAILING
            SKIPPED -> Value.SKIPPED
            ERROR -> Value.ERROR
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            RUNNING -> Known.RUNNING
            PASSING -> Known.PASSING
            FAILING -> Known.FAILING
            SKIPPED -> Known.SKIPPED
            ERROR -> Known.ERROR
            else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTEGRITY = Type(JsonField.of("integrity"))

            @JvmField val CONSISTENCY = Type(JsonField.of("consistency"))

            @JvmField val PERFORMANCE = Type(JsonField.of("performance"))

            @JvmField val FAIRNESS = Type(JsonField.of("fairness"))

            @JvmField val ROBUSTNESS = Type(JsonField.of("robustness"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
        }

        enum class Value {
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            INTEGRITY -> Value.INTEGRITY
            CONSISTENCY -> Value.CONSISTENCY
            PERFORMANCE -> Value.PERFORMANCE
            FAIRNESS -> Value.FAIRNESS
            ROBUSTNESS -> Value.ROBUSTNESS
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            INTEGRITY -> Known.INTEGRITY
            CONSISTENCY -> Known.CONSISTENCY
            PERFORMANCE -> Known.PERFORMANCE
            FAIRNESS -> Known.FAIRNESS
            ROBUSTNESS -> Known.ROBUSTNESS
            else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
