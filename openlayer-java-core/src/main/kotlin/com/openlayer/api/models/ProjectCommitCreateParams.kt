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

class ProjectCommitCreateParams
constructor(
    private val projectId: String,
    private val commit: Commit,
    private val storageUri: String,
    private val archived: Boolean?,
    private val deploymentStatus: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun commit(): Commit = commit

    fun storageUri(): String = storageUri

    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun deploymentStatus(): Optional<String> = Optional.ofNullable(deploymentStatus)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ProjectCommitCreateBody {
        return ProjectCommitCreateBody(
            commit,
            storageUri,
            archived,
            deploymentStatus,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectCommitCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectCommitCreateBody
    internal constructor(
        private val commit: Commit?,
        private val storageUri: String?,
        private val archived: Boolean?,
        private val deploymentStatus: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The details of a commit (project version). */
        @JsonProperty("commit") fun commit(): Commit? = commit

        /** The storage URI where the commit bundle is stored. */
        @JsonProperty("storageUri") fun storageUri(): String? = storageUri

        /** Whether the commit is archived. */
        @JsonProperty("archived") fun archived(): Boolean? = archived

        /** The deployment status associated with the commit's model. */
        @JsonProperty("deploymentStatus") fun deploymentStatus(): String? = deploymentStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var commit: Commit? = null
            private var storageUri: String? = null
            private var archived: Boolean? = null
            private var deploymentStatus: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectCommitCreateBody: ProjectCommitCreateBody) = apply {
                this.commit = projectCommitCreateBody.commit
                this.storageUri = projectCommitCreateBody.storageUri
                this.archived = projectCommitCreateBody.archived
                this.deploymentStatus = projectCommitCreateBody.deploymentStatus
                additionalProperties(projectCommitCreateBody.additionalProperties)
            }

            /** The details of a commit (project version). */
            @JsonProperty("commit") fun commit(commit: Commit) = apply { this.commit = commit }

            /** The storage URI where the commit bundle is stored. */
            @JsonProperty("storageUri")
            fun storageUri(storageUri: String) = apply { this.storageUri = storageUri }

            /** Whether the commit is archived. */
            @JsonProperty("archived")
            fun archived(archived: Boolean) = apply { this.archived = archived }

            /** The deployment status associated with the commit's model. */
            @JsonProperty("deploymentStatus")
            fun deploymentStatus(deploymentStatus: String) = apply {
                this.deploymentStatus = deploymentStatus
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

            fun build(): ProjectCommitCreateBody =
                ProjectCommitCreateBody(
                    checkNotNull(commit) { "`commit` is required but was not set" },
                    checkNotNull(storageUri) { "`storageUri` is required but was not set" },
                    archived,
                    deploymentStatus,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProjectCommitCreateBody && commit == other.commit && storageUri == other.storageUri && archived == other.archived && deploymentStatus == other.deploymentStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(commit, storageUri, archived, deploymentStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectCommitCreateBody{commit=$commit, storageUri=$storageUri, archived=$archived, deploymentStatus=$deploymentStatus, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var projectId: String? = null
        private var commit: Commit? = null
        private var storageUri: String? = null
        private var archived: Boolean? = null
        private var deploymentStatus: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectCommitCreateParams: ProjectCommitCreateParams) = apply {
            projectId = projectCommitCreateParams.projectId
            commit = projectCommitCreateParams.commit
            storageUri = projectCommitCreateParams.storageUri
            archived = projectCommitCreateParams.archived
            deploymentStatus = projectCommitCreateParams.deploymentStatus
            additionalHeaders = projectCommitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectCommitCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                projectCommitCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** The details of a commit (project version). */
        fun commit(commit: Commit) = apply { this.commit = commit }

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: String) = apply { this.storageUri = storageUri }

        /** Whether the commit is archived. */
        fun archived(archived: Boolean) = apply { this.archived = archived }

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(deploymentStatus: String) = apply {
            this.deploymentStatus = deploymentStatus
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

        fun build(): ProjectCommitCreateParams =
            ProjectCommitCreateParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(commit) { "`commit` is required but was not set" },
                checkNotNull(storageUri) { "`storageUri` is required but was not set" },
                archived,
                deploymentStatus,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The details of a commit (project version). */
    @JsonDeserialize(builder = Commit.Builder::class)
    @NoAutoDetect
    class Commit
    private constructor(
        private val id: String?,
        private val authorId: String?,
        private val dateCreated: OffsetDateTime?,
        private val fileSize: Long?,
        private val message: String?,
        private val mlModelId: String?,
        private val validationDatasetId: String?,
        private val trainingDatasetId: String?,
        private val storageUri: String?,
        private val gitCommitSha: Long?,
        private val gitCommitRef: String?,
        private val gitCommitUrl: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The commit id. */
        @JsonProperty("id") fun id(): String? = id

        /** The author id of the commit. */
        @JsonProperty("authorId") fun authorId(): String? = authorId

        /** The commit creation date. */
        @JsonProperty("dateCreated") fun dateCreated(): OffsetDateTime? = dateCreated

        /** The size of the commit bundle in bytes. */
        @JsonProperty("fileSize") fun fileSize(): Long? = fileSize

        /** The commit message. */
        @JsonProperty("message") fun message(): String? = message

        /** The model id. */
        @JsonProperty("mlModelId") fun mlModelId(): String? = mlModelId

        /** The validation dataset id. */
        @JsonProperty("validationDatasetId")
        fun validationDatasetId(): String? = validationDatasetId

        /** The training dataset id. */
        @JsonProperty("trainingDatasetId") fun trainingDatasetId(): String? = trainingDatasetId

        /** The storage URI where the commit bundle is stored. */
        @JsonProperty("storageUri") fun storageUri(): String? = storageUri

        /** The SHA of the corresponding git commit. */
        @JsonProperty("gitCommitSha") fun gitCommitSha(): Long? = gitCommitSha

        /** The ref of the corresponding git commit. */
        @JsonProperty("gitCommitRef") fun gitCommitRef(): String? = gitCommitRef

        /** The URL of the corresponding git commit. */
        @JsonProperty("gitCommitUrl") fun gitCommitUrl(): String? = gitCommitUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var authorId: String? = null
            private var dateCreated: OffsetDateTime? = null
            private var fileSize: Long? = null
            private var message: String? = null
            private var mlModelId: String? = null
            private var validationDatasetId: String? = null
            private var trainingDatasetId: String? = null
            private var storageUri: String? = null
            private var gitCommitSha: Long? = null
            private var gitCommitRef: String? = null
            private var gitCommitUrl: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                this.id = commit.id
                this.authorId = commit.authorId
                this.dateCreated = commit.dateCreated
                this.fileSize = commit.fileSize
                this.message = commit.message
                this.mlModelId = commit.mlModelId
                this.validationDatasetId = commit.validationDatasetId
                this.trainingDatasetId = commit.trainingDatasetId
                this.storageUri = commit.storageUri
                this.gitCommitSha = commit.gitCommitSha
                this.gitCommitRef = commit.gitCommitRef
                this.gitCommitUrl = commit.gitCommitUrl
                additionalProperties(commit.additionalProperties)
            }

            /** The commit id. */
            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            /** The author id of the commit. */
            @JsonProperty("authorId")
            fun authorId(authorId: String) = apply { this.authorId = authorId }

            /** The commit creation date. */
            @JsonProperty("dateCreated")
            fun dateCreated(dateCreated: OffsetDateTime) = apply { this.dateCreated = dateCreated }

            /** The size of the commit bundle in bytes. */
            @JsonProperty("fileSize")
            fun fileSize(fileSize: Long) = apply { this.fileSize = fileSize }

            /** The commit message. */
            @JsonProperty("message") fun message(message: String) = apply { this.message = message }

            /** The model id. */
            @JsonProperty("mlModelId")
            fun mlModelId(mlModelId: String) = apply { this.mlModelId = mlModelId }

            /** The validation dataset id. */
            @JsonProperty("validationDatasetId")
            fun validationDatasetId(validationDatasetId: String) = apply {
                this.validationDatasetId = validationDatasetId
            }

            /** The training dataset id. */
            @JsonProperty("trainingDatasetId")
            fun trainingDatasetId(trainingDatasetId: String) = apply {
                this.trainingDatasetId = trainingDatasetId
            }

            /** The storage URI where the commit bundle is stored. */
            @JsonProperty("storageUri")
            fun storageUri(storageUri: String) = apply { this.storageUri = storageUri }

            /** The SHA of the corresponding git commit. */
            @JsonProperty("gitCommitSha")
            fun gitCommitSha(gitCommitSha: Long) = apply { this.gitCommitSha = gitCommitSha }

            /** The ref of the corresponding git commit. */
            @JsonProperty("gitCommitRef")
            fun gitCommitRef(gitCommitRef: String) = apply { this.gitCommitRef = gitCommitRef }

            /** The URL of the corresponding git commit. */
            @JsonProperty("gitCommitUrl")
            fun gitCommitUrl(gitCommitUrl: String) = apply { this.gitCommitUrl = gitCommitUrl }

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

            fun build(): Commit =
                Commit(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(authorId) { "`authorId` is required but was not set" },
                    dateCreated,
                    fileSize,
                    checkNotNull(message) { "`message` is required but was not set" },
                    mlModelId,
                    validationDatasetId,
                    trainingDatasetId,
                    checkNotNull(storageUri) { "`storageUri` is required but was not set" },
                    gitCommitSha,
                    gitCommitRef,
                    gitCommitUrl,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && id == other.id && authorId == other.authorId && dateCreated == other.dateCreated && fileSize == other.fileSize && message == other.message && mlModelId == other.mlModelId && validationDatasetId == other.validationDatasetId && trainingDatasetId == other.trainingDatasetId && storageUri == other.storageUri && gitCommitSha == other.gitCommitSha && gitCommitRef == other.gitCommitRef && gitCommitUrl == other.gitCommitUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, authorId, dateCreated, fileSize, message, mlModelId, validationDatasetId, trainingDatasetId, storageUri, gitCommitSha, gitCommitRef, gitCommitUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{id=$id, authorId=$authorId, dateCreated=$dateCreated, fileSize=$fileSize, message=$message, mlModelId=$mlModelId, validationDatasetId=$validationDatasetId, trainingDatasetId=$trainingDatasetId, storageUri=$storageUri, gitCommitSha=$gitCommitSha, gitCommitRef=$gitCommitRef, gitCommitUrl=$gitCommitUrl, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val QUEUED = Status(JsonField.of("queued"))

            @JvmField val RUNNING = Status(JsonField.of("running"))

            @JvmField val PAUSED = Status(JsonField.of("paused"))

            @JvmField val FAILED = Status(JsonField.of("failed"))

            @JvmField val COMPLETED = Status(JsonField.of("completed"))

            @JvmField val UNKNOWN = Status(JsonField.of("unknown"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                PAUSED -> Value.PAUSED
                FAILED -> Value.FAILED
                COMPLETED -> Value.COMPLETED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                PAUSED -> Known.PAUSED
                FAILED -> Known.FAILED
                COMPLETED -> Known.COMPLETED
                UNKNOWN -> Known.UNKNOWN
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectCommitCreateParams && projectId == other.projectId && commit == other.commit && storageUri == other.storageUri && archived == other.archived && deploymentStatus == other.deploymentStatus && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, commit, storageUri, archived, deploymentStatus, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ProjectCommitCreateParams{projectId=$projectId, commit=$commit, storageUri=$storageUri, archived=$archived, deploymentStatus=$deploymentStatus, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
