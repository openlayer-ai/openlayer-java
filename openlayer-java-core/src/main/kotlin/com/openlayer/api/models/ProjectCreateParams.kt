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

class ProjectCreateParams constructor(
  private val name: String,
  private val taskType: TaskType,
  private val description: String?,
  private val additionalQueryParams: Map<String, List<String>>,
  private val additionalHeaders: Map<String, List<String>>,
  private val additionalBodyProperties: Map<String, JsonValue>,

) {

    fun name(): String = name

    fun taskType(): TaskType = taskType

    fun description(): Optional<String> = Optional.ofNullable(description)

    @JvmSynthetic
    internal fun getBody(): ProjectCreateBody {
      return ProjectCreateBody(
          name,
          taskType,
          description,
          additionalBodyProperties,
      )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ProjectCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectCreateBody internal constructor(
      private val name: String?,
      private val taskType: TaskType?,
      private val description: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        /** The project name. */
        @JsonProperty("name")
        fun name(): String? = name

        /** The task type of the project. */
        @JsonProperty("taskType")
        fun taskType(): TaskType? = taskType

        /** The project description. */
        @JsonProperty("description")
        fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is ProjectCreateBody &&
              this.name == other.name &&
              this.taskType == other.taskType &&
              this.description == other.description &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                name,
                taskType,
                description,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "ProjectCreateBody{name=$name, taskType=$taskType, description=$description, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var taskType: TaskType? = null
            private var description: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectCreateBody: ProjectCreateBody) = apply {
                this.name = projectCreateBody.name
                this.taskType = projectCreateBody.taskType
                this.description = projectCreateBody.description
                additionalProperties(projectCreateBody.additionalProperties)
            }

            /** The project name. */
            @JsonProperty("name")
            fun name(name: String) = apply {
                this.name = name
            }

            /** The task type of the project. */
            @JsonProperty("taskType")
            fun taskType(taskType: TaskType) = apply {
                this.taskType = taskType
            }

            /** The project description. */
            @JsonProperty("description")
            fun description(description: String) = apply {
                this.description = description
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

            fun build(): ProjectCreateBody = ProjectCreateBody(
                checkNotNull(name) {
                    "`name` is required but was not set"
                },
                checkNotNull(taskType) {
                    "`taskType` is required but was not set"
                },
                description,
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

      return other is ProjectCreateParams &&
          this.name == other.name &&
          this.taskType == other.taskType &&
          this.description == other.description &&
          this.additionalQueryParams == other.additionalQueryParams &&
          this.additionalHeaders == other.additionalHeaders &&
          this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
      return Objects.hash(
          name,
          taskType,
          description,
          additionalQueryParams,
          additionalHeaders,
          additionalBodyProperties,
      )
    }

    override fun toString() = "ProjectCreateParams{name=$name, taskType=$taskType, description=$description, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var taskType: TaskType? = null
        private var description: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectCreateParams: ProjectCreateParams) = apply {
            this.name = projectCreateParams.name
            this.taskType = projectCreateParams.taskType
            this.description = projectCreateParams.description
            additionalQueryParams(projectCreateParams.additionalQueryParams)
            additionalHeaders(projectCreateParams.additionalHeaders)
            additionalBodyProperties(projectCreateParams.additionalBodyProperties)
        }

        /** The project name. */
        fun name(name: String) = apply {
            this.name = name
        }

        /** The task type of the project. */
        fun taskType(taskType: TaskType) = apply {
            this.taskType = taskType
        }

        /** The project description. */
        fun description(description: String) = apply {
            this.description = description
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

        fun build(): ProjectCreateParams = ProjectCreateParams(
            checkNotNull(name) {
                "`name` is required but was not set"
            },
            checkNotNull(taskType) {
                "`taskType` is required but was not set"
            },
            description,
            additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            additionalBodyProperties.toUnmodifiable(),
        )
    }

    /** Links to the project. */
    @JsonDeserialize(builder = Links.Builder::class)
    @NoAutoDetect
    class Links private constructor(private val app: String?, private val additionalProperties: Map<String, JsonValue>, ) {

        private var hashCode: Int = 0

        @JsonProperty("app")
        fun app(): String? = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Links &&
              this.app == other.app &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(app, additionalProperties)
          }
          return hashCode
        }

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var app: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                this.app = links.app
                additionalProperties(links.additionalProperties)
            }

            @JsonProperty("app")
            fun app(app: String) = apply {
                this.app = app
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

            fun build(): Links = Links(checkNotNull(app) {
                "`app` is required but was not set"
            }, additionalProperties.toUnmodifiable())
        }
    }

    class Source @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Source &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val WEB = Source(JsonField.of("web"))

            @JvmField val API = Source(JsonField.of("api"))

            @JvmField val NULL = Source(JsonField.of("null"))

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        enum class Known {
            WEB,
            API,
            NULL,
        }

        enum class Value {
            WEB,
            API,
            NULL,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            WEB -> Value.WEB
            API -> Value.API
            NULL -> Value.NULL
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            WEB -> Known.WEB
            API -> Known.API
            NULL -> Known.NULL
            else -> throw OpenlayerInvalidDataException("Unknown Source: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
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

    @JsonDeserialize(builder = GitRepo.Builder::class)
    @NoAutoDetect
    class GitRepo private constructor(
      private val id: String?,
      private val gitId: Long?,
      private val dateConnected: OffsetDateTime?,
      private val dateUpdated: OffsetDateTime?,
      private val branch: String?,
      private val name: String?,
      private val private_: Boolean?,
      private val slug: String?,
      private val url: String?,
      private val rootDir: String?,
      private val projectId: String?,
      private val gitAccountId: String?,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var hashCode: Int = 0

        @JsonProperty("id")
        fun id(): String? = id

        @JsonProperty("gitId")
        fun gitId(): Long? = gitId

        @JsonProperty("dateConnected")
        fun dateConnected(): OffsetDateTime? = dateConnected

        @JsonProperty("dateUpdated")
        fun dateUpdated(): OffsetDateTime? = dateUpdated

        @JsonProperty("branch")
        fun branch(): String? = branch

        @JsonProperty("name")
        fun name(): String? = name

        @JsonProperty("private")
        fun private_(): Boolean? = private_

        @JsonProperty("slug")
        fun slug(): String? = slug

        @JsonProperty("url")
        fun url(): String? = url

        @JsonProperty("rootDir")
        fun rootDir(): String? = rootDir

        @JsonProperty("projectId")
        fun projectId(): String? = projectId

        @JsonProperty("gitAccountId")
        fun gitAccountId(): String? = gitAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is GitRepo &&
              this.id == other.id &&
              this.gitId == other.gitId &&
              this.dateConnected == other.dateConnected &&
              this.dateUpdated == other.dateUpdated &&
              this.branch == other.branch &&
              this.name == other.name &&
              this.private_ == other.private_ &&
              this.slug == other.slug &&
              this.url == other.url &&
              this.rootDir == other.rootDir &&
              this.projectId == other.projectId &&
              this.gitAccountId == other.gitAccountId &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                id,
                gitId,
                dateConnected,
                dateUpdated,
                branch,
                name,
                private_,
                slug,
                url,
                rootDir,
                projectId,
                gitAccountId,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "GitRepo{id=$id, gitId=$gitId, dateConnected=$dateConnected, dateUpdated=$dateUpdated, branch=$branch, name=$name, private_=$private_, slug=$slug, url=$url, rootDir=$rootDir, projectId=$projectId, gitAccountId=$gitAccountId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic
            fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var gitId: Long? = null
            private var dateConnected: OffsetDateTime? = null
            private var dateUpdated: OffsetDateTime? = null
            private var branch: String? = null
            private var name: String? = null
            private var private_: Boolean? = null
            private var slug: String? = null
            private var url: String? = null
            private var rootDir: String? = null
            private var projectId: String? = null
            private var gitAccountId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(gitRepo: GitRepo) = apply {
                this.id = gitRepo.id
                this.gitId = gitRepo.gitId
                this.dateConnected = gitRepo.dateConnected
                this.dateUpdated = gitRepo.dateUpdated
                this.branch = gitRepo.branch
                this.name = gitRepo.name
                this.private_ = gitRepo.private_
                this.slug = gitRepo.slug
                this.url = gitRepo.url
                this.rootDir = gitRepo.rootDir
                this.projectId = gitRepo.projectId
                this.gitAccountId = gitRepo.gitAccountId
                additionalProperties(gitRepo.additionalProperties)
            }

            @JsonProperty("id")
            fun id(id: String) = apply {
                this.id = id
            }

            @JsonProperty("gitId")
            fun gitId(gitId: Long) = apply {
                this.gitId = gitId
            }

            @JsonProperty("dateConnected")
            fun dateConnected(dateConnected: OffsetDateTime) = apply {
                this.dateConnected = dateConnected
            }

            @JsonProperty("dateUpdated")
            fun dateUpdated(dateUpdated: OffsetDateTime) = apply {
                this.dateUpdated = dateUpdated
            }

            @JsonProperty("branch")
            fun branch(branch: String) = apply {
                this.branch = branch
            }

            @JsonProperty("name")
            fun name(name: String) = apply {
                this.name = name
            }

            @JsonProperty("private")
            fun private_(private_: Boolean) = apply {
                this.private_ = private_
            }

            @JsonProperty("slug")
            fun slug(slug: String) = apply {
                this.slug = slug
            }

            @JsonProperty("url")
            fun url(url: String) = apply {
                this.url = url
            }

            @JsonProperty("rootDir")
            fun rootDir(rootDir: String) = apply {
                this.rootDir = rootDir
            }

            @JsonProperty("projectId")
            fun projectId(projectId: String) = apply {
                this.projectId = projectId
            }

            @JsonProperty("gitAccountId")
            fun gitAccountId(gitAccountId: String) = apply {
                this.gitAccountId = gitAccountId
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

            fun build(): GitRepo = GitRepo(
                checkNotNull(id) {
                    "`id` is required but was not set"
                },
                checkNotNull(gitId) {
                    "`gitId` is required but was not set"
                },
                checkNotNull(dateConnected) {
                    "`dateConnected` is required but was not set"
                },
                checkNotNull(dateUpdated) {
                    "`dateUpdated` is required but was not set"
                },
                branch,
                checkNotNull(name) {
                    "`name` is required but was not set"
                },
                checkNotNull(private_) {
                    "`private_` is required but was not set"
                },
                checkNotNull(slug) {
                    "`slug` is required but was not set"
                },
                checkNotNull(url) {
                    "`url` is required but was not set"
                },
                rootDir,
                checkNotNull(projectId) {
                    "`projectId` is required but was not set"
                },
                checkNotNull(gitAccountId) {
                    "`gitAccountId` is required but was not set"
                },
                additionalProperties.toUnmodifiable(),
            )
        }
    }
}
