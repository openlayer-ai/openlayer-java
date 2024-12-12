// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ProjectCreateParams
constructor(
    private val name: String,
    private val taskType: TaskType,
    private val description: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun taskType(): TaskType = taskType

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ProjectCreateBody {
        return ProjectCreateBody(
            name,
            taskType,
            description,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ProjectCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectCreateBody
    internal constructor(
        private val name: String?,
        private val taskType: TaskType?,
        private val description: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The project name. */
        @JsonProperty("name") fun name(): String? = name

        /** The task type of the project. */
        @JsonProperty("taskType") fun taskType(): TaskType? = taskType

        /** The project description. */
        @JsonProperty("description") fun description(): String? = description

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
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
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The task type of the project. */
            @JsonProperty("taskType")
            fun taskType(taskType: TaskType) = apply { this.taskType = taskType }

            /** The project description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

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

            fun build(): ProjectCreateBody =
                ProjectCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(taskType) { "`taskType` is required but was not set" },
                    description,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectCreateBody && name == other.name && taskType == other.taskType && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, taskType, description, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectCreateBody{name=$name, taskType=$taskType, description=$description, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var taskType: TaskType? = null
        private var description: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectCreateParams: ProjectCreateParams) = apply {
            name = projectCreateParams.name
            taskType = projectCreateParams.taskType
            description = projectCreateParams.description
            additionalHeaders = projectCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = projectCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The project name. */
        fun name(name: String) = apply { this.name = name }

        /** The task type of the project. */
        fun taskType(taskType: TaskType) = apply { this.taskType = taskType }

        /** The project description. */
        fun description(description: String) = apply { this.description = description }

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

        fun build(): ProjectCreateParams =
            ProjectCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(taskType) { "`taskType` is required but was not set" },
                description,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Links to the project. */
    @JsonDeserialize(builder = Links.Builder::class)
    @NoAutoDetect
    class Links
    private constructor(
        private val app: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("app") fun app(): String? = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                this.app = links.app
                additionalProperties(links.additionalProperties)
            }

            @JsonProperty("app") fun app(app: String) = apply { this.app = app }

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

            fun build(): Links =
                Links(
                    checkNotNull(app) { "`app` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Links && app == other.app && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(app, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
    }

    class Source
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WEB = of("web")

            @JvmField val API = of("api")

            @JvmField val NULL = of("null")

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

        fun value(): Value =
            when (this) {
                WEB -> Value.WEB
                API -> Value.API
                NULL -> Value.NULL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                WEB -> Known.WEB
                API -> Known.API
                NULL -> Known.NULL
                else -> throw OpenlayerInvalidDataException("Unknown Source: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TaskType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LLM_BASE = of("llm-base")

            @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

            @JvmField val TABULAR_REGRESSION = of("tabular-regression")

            @JvmField val TEXT_CLASSIFICATION = of("text-classification")

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

        fun value(): Value =
            when (this) {
                LLM_BASE -> Value.LLM_BASE
                TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LLM_BASE -> Known.LLM_BASE
                TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaskType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = GitRepo.Builder::class)
    @NoAutoDetect
    class GitRepo
    private constructor(
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

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("gitId") fun gitId(): Long? = gitId

        @JsonProperty("dateConnected") fun dateConnected(): OffsetDateTime? = dateConnected

        @JsonProperty("dateUpdated") fun dateUpdated(): OffsetDateTime? = dateUpdated

        @JsonProperty("branch") fun branch(): String? = branch

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("private") fun private_(): Boolean? = private_

        @JsonProperty("slug") fun slug(): String? = slug

        @JsonProperty("url") fun url(): String? = url

        @JsonProperty("rootDir") fun rootDir(): String? = rootDir

        @JsonProperty("projectId") fun projectId(): String? = projectId

        @JsonProperty("gitAccountId") fun gitAccountId(): String? = gitAccountId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
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

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("gitId") fun gitId(gitId: Long) = apply { this.gitId = gitId }

            @JsonProperty("dateConnected")
            fun dateConnected(dateConnected: OffsetDateTime) = apply {
                this.dateConnected = dateConnected
            }

            @JsonProperty("dateUpdated")
            fun dateUpdated(dateUpdated: OffsetDateTime) = apply { this.dateUpdated = dateUpdated }

            @JsonProperty("branch") fun branch(branch: String) = apply { this.branch = branch }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("private")
            fun private_(private_: Boolean) = apply { this.private_ = private_ }

            @JsonProperty("slug") fun slug(slug: String) = apply { this.slug = slug }

            @JsonProperty("url") fun url(url: String) = apply { this.url = url }

            @JsonProperty("rootDir") fun rootDir(rootDir: String) = apply { this.rootDir = rootDir }

            @JsonProperty("projectId")
            fun projectId(projectId: String) = apply { this.projectId = projectId }

            @JsonProperty("gitAccountId")
            fun gitAccountId(gitAccountId: String) = apply { this.gitAccountId = gitAccountId }

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

            fun build(): GitRepo =
                GitRepo(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(gitId) { "`gitId` is required but was not set" },
                    checkNotNull(dateConnected) { "`dateConnected` is required but was not set" },
                    checkNotNull(dateUpdated) { "`dateUpdated` is required but was not set" },
                    branch,
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(private_) { "`private_` is required but was not set" },
                    checkNotNull(slug) { "`slug` is required but was not set" },
                    checkNotNull(url) { "`url` is required but was not set" },
                    rootDir,
                    checkNotNull(projectId) { "`projectId` is required but was not set" },
                    checkNotNull(gitAccountId) { "`gitAccountId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GitRepo && id == other.id && gitId == other.gitId && dateConnected == other.dateConnected && dateUpdated == other.dateUpdated && branch == other.branch && name == other.name && private_ == other.private_ && slug == other.slug && url == other.url && rootDir == other.rootDir && projectId == other.projectId && gitAccountId == other.gitAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, gitId, dateConnected, dateUpdated, branch, name, private_, slug, url, rootDir, projectId, gitAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GitRepo{id=$id, gitId=$gitId, dateConnected=$dateConnected, dateUpdated=$dateUpdated, branch=$branch, name=$name, private_=$private_, slug=$slug, url=$url, rootDir=$rootDir, projectId=$projectId, gitAccountId=$gitAccountId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectCreateParams && name == other.name && taskType == other.taskType && description == other.description && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, taskType, description, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ProjectCreateParams{name=$name, taskType=$taskType, description=$description, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
