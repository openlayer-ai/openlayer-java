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
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class CommitCreateParams
constructor(
    private val projectId: String,
    private val commit: Commit,
    private val storageUri: String,
    private val archived: Boolean?,
    private val deploymentStatus: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun projectId(): String = projectId

    fun commit(): Commit = commit

    fun storageUri(): String = storageUri

    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    fun deploymentStatus(): Optional<String> = Optional.ofNullable(deploymentStatus)

    @JvmSynthetic
    internal fun getBody(): CommitCreateBody {
        return CommitCreateBody(
            commit,
            storageUri,
            archived,
            deploymentStatus,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CommitCreateBody.Builder::class)
    @NoAutoDetect
    class CommitCreateBody
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
            internal fun from(commitCreateBody: CommitCreateBody) = apply {
                this.commit = commitCreateBody.commit
                this.storageUri = commitCreateBody.storageUri
                this.archived = commitCreateBody.archived
                this.deploymentStatus = commitCreateBody.deploymentStatus
                additionalProperties(commitCreateBody.additionalProperties)
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

            fun build(): CommitCreateBody =
                CommitCreateBody(
                    checkNotNull(commit) { "`commit` is required but was not set" },
                    checkNotNull(storageUri) { "`storageUri` is required but was not set" },
                    archived,
                    deploymentStatus,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CommitCreateBody && this.commit == other.commit && this.storageUri == other.storageUri && this.archived == other.archived && this.deploymentStatus == other.deploymentStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(commit, storageUri, archived, deploymentStatus, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CommitCreateBody{commit=$commit, storageUri=$storageUri, archived=$archived, deploymentStatus=$deploymentStatus, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitCreateParams && this.projectId == other.projectId && this.commit == other.commit && this.storageUri == other.storageUri && this.archived == other.archived && this.deploymentStatus == other.deploymentStatus && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(projectId, commit, storageUri, archived, deploymentStatus, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CommitCreateParams{projectId=$projectId, commit=$commit, storageUri=$storageUri, archived=$archived, deploymentStatus=$deploymentStatus, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitCreateParams: CommitCreateParams) = apply {
            this.projectId = commitCreateParams.projectId
            this.commit = commitCreateParams.commit
            this.storageUri = commitCreateParams.storageUri
            this.archived = commitCreateParams.archived
            this.deploymentStatus = commitCreateParams.deploymentStatus
            additionalQueryParams(commitCreateParams.additionalQueryParams)
            additionalHeaders(commitCreateParams.additionalHeaders)
            additionalBodyProperties(commitCreateParams.additionalBodyProperties)
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

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CommitCreateParams =
            CommitCreateParams(
                checkNotNull(projectId) { "`projectId` is required but was not set" },
                checkNotNull(commit) { "`commit` is required but was not set" },
                checkNotNull(storageUri) { "`storageUri` is required but was not set" },
                archived,
                deploymentStatus,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && this.id == other.id && this.authorId == other.authorId && this.dateCreated == other.dateCreated && this.fileSize == other.fileSize && this.message == other.message && this.mlModelId == other.mlModelId && this.validationDatasetId == other.validationDatasetId && this.trainingDatasetId == other.trainingDatasetId && this.storageUri == other.storageUri && this.gitCommitSha == other.gitCommitSha && this.gitCommitRef == other.gitCommitRef && this.gitCommitUrl == other.gitCommitUrl && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(id, authorId, dateCreated, fileSize, message, mlModelId, validationDatasetId, trainingDatasetId, storageUri, gitCommitSha, gitCommitRef, gitCommitUrl, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
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
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Links && this.app == other.app && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(app, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
    }
}
