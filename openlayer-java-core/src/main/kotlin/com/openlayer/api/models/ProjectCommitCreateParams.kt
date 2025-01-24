// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create a new commit (project version) in a project. */
class ProjectCommitCreateParams
constructor(
    private val projectId: String,
    private val body: ProjectCommitCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun projectId(): String = projectId

    /** The details of a commit (project version). */
    fun commit(): Commit = body.commit()

    /** The storage URI where the commit bundle is stored. */
    fun storageUri(): String = body.storageUri()

    /** Whether the commit is archived. */
    fun archived(): Optional<Boolean> = body.archived()

    /** The deployment status associated with the commit's model. */
    fun deploymentStatus(): Optional<String> = body.deploymentStatus()

    /** The details of a commit (project version). */
    fun _commit(): JsonField<Commit> = body._commit()

    /** The storage URI where the commit bundle is stored. */
    fun _storageUri(): JsonField<String> = body._storageUri()

    /** Whether the commit is archived. */
    fun _archived(): JsonField<Boolean> = body._archived()

    /** The deployment status associated with the commit's model. */
    fun _deploymentStatus(): JsonField<String> = body._deploymentStatus()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ProjectCommitCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectId
            else -> ""
        }
    }

    @NoAutoDetect
    class ProjectCommitCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("commit")
        @ExcludeMissing
        private val commit: JsonField<Commit> = JsonMissing.of(),
        @JsonProperty("storageUri")
        @ExcludeMissing
        private val storageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived")
        @ExcludeMissing
        private val archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("deploymentStatus")
        @ExcludeMissing
        private val deploymentStatus: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The details of a commit (project version). */
        fun commit(): Commit = commit.getRequired("commit")

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(): String = storageUri.getRequired("storageUri")

        /** Whether the commit is archived. */
        fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(): Optional<String> =
            Optional.ofNullable(deploymentStatus.getNullable("deploymentStatus"))

        /** The details of a commit (project version). */
        @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

        /** The storage URI where the commit bundle is stored. */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun _storageUri(): JsonField<String> = storageUri

        /** Whether the commit is archived. */
        @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

        /** The deployment status associated with the commit's model. */
        @JsonProperty("deploymentStatus")
        @ExcludeMissing
        fun _deploymentStatus(): JsonField<String> = deploymentStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ProjectCommitCreateBody = apply {
            if (validated) {
                return@apply
            }

            commit().validate()
            storageUri()
            archived()
            deploymentStatus()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var commit: JsonField<Commit>? = null
            private var storageUri: JsonField<String>? = null
            private var archived: JsonField<Boolean> = JsonMissing.of()
            private var deploymentStatus: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectCommitCreateBody: ProjectCommitCreateBody) = apply {
                commit = projectCommitCreateBody.commit
                storageUri = projectCommitCreateBody.storageUri
                archived = projectCommitCreateBody.archived
                deploymentStatus = projectCommitCreateBody.deploymentStatus
                additionalProperties = projectCommitCreateBody.additionalProperties.toMutableMap()
            }

            /** The details of a commit (project version). */
            fun commit(commit: Commit) = commit(JsonField.of(commit))

            /** The details of a commit (project version). */
            fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

            /** Whether the commit is archived. */
            fun archived(archived: Boolean?) = archived(JsonField.ofNullable(archived))

            /** Whether the commit is archived. */
            fun archived(archived: Boolean) = archived(archived as Boolean?)

            /** Whether the commit is archived. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun archived(archived: Optional<Boolean>) = archived(archived.orElse(null) as Boolean?)

            /** Whether the commit is archived. */
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            /** The deployment status associated with the commit's model. */
            fun deploymentStatus(deploymentStatus: String) =
                deploymentStatus(JsonField.of(deploymentStatus))

            /** The deployment status associated with the commit's model. */
            fun deploymentStatus(deploymentStatus: JsonField<String>) = apply {
                this.deploymentStatus = deploymentStatus
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

            fun build(): ProjectCommitCreateBody =
                ProjectCommitCreateBody(
                    checkRequired("commit", commit),
                    checkRequired("storageUri", storageUri),
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
        private var body: ProjectCommitCreateBody.Builder = ProjectCommitCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectCommitCreateParams: ProjectCommitCreateParams) = apply {
            projectId = projectCommitCreateParams.projectId
            body = projectCommitCreateParams.body.toBuilder()
            additionalHeaders = projectCommitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectCommitCreateParams.additionalQueryParams.toBuilder()
        }

        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** The details of a commit (project version). */
        fun commit(commit: Commit) = apply { body.commit(commit) }

        /** The details of a commit (project version). */
        fun commit(commit: JsonField<Commit>) = apply { body.commit(commit) }

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: String) = apply { body.storageUri(storageUri) }

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: JsonField<String>) = apply { body.storageUri(storageUri) }

        /** Whether the commit is archived. */
        fun archived(archived: Boolean?) = apply { body.archived(archived) }

        /** Whether the commit is archived. */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Whether the commit is archived. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun archived(archived: Optional<Boolean>) = archived(archived.orElse(null) as Boolean?)

        /** Whether the commit is archived. */
        fun archived(archived: JsonField<Boolean>) = apply { body.archived(archived) }

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(deploymentStatus: String) = apply {
            body.deploymentStatus(deploymentStatus)
        }

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(deploymentStatus: JsonField<String>) = apply {
            body.deploymentStatus(deploymentStatus)
        }

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

        fun build(): ProjectCommitCreateParams =
            ProjectCommitCreateParams(
                checkRequired("projectId", projectId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The details of a commit (project version). */
    @NoAutoDetect
    class Commit
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("authorId")
        @ExcludeMissing
        private val authorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileSize")
        @ExcludeMissing
        private val fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message")
        @ExcludeMissing
        private val message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mlModelId")
        @ExcludeMissing
        private val mlModelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("storageUri")
        @ExcludeMissing
        private val storageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trainingDatasetId")
        @ExcludeMissing
        private val trainingDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validationDatasetId")
        @ExcludeMissing
        private val validationDatasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("gitCommitRef")
        @ExcludeMissing
        private val gitCommitRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gitCommitSha")
        @ExcludeMissing
        private val gitCommitSha: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gitCommitUrl")
        @ExcludeMissing
        private val gitCommitUrl: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The commit id. */
        fun id(): String = id.getRequired("id")

        /** The author id of the commit. */
        fun authorId(): String = authorId.getRequired("authorId")

        /** The size of the commit bundle in bytes. */
        fun fileSize(): Optional<Long> = Optional.ofNullable(fileSize.getNullable("fileSize"))

        /** The commit message. */
        fun message(): String = message.getRequired("message")

        /** The model id. */
        fun mlModelId(): Optional<String> = Optional.ofNullable(mlModelId.getNullable("mlModelId"))

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(): String = storageUri.getRequired("storageUri")

        /** The training dataset id. */
        fun trainingDatasetId(): Optional<String> =
            Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

        /** The validation dataset id. */
        fun validationDatasetId(): Optional<String> =
            Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

        /** The commit creation date. */
        fun dateCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateCreated.getNullable("dateCreated"))

        /** The ref of the corresponding git commit. */
        fun gitCommitRef(): Optional<String> =
            Optional.ofNullable(gitCommitRef.getNullable("gitCommitRef"))

        /** The SHA of the corresponding git commit. */
        fun gitCommitSha(): Optional<Long> =
            Optional.ofNullable(gitCommitSha.getNullable("gitCommitSha"))

        /** The URL of the corresponding git commit. */
        fun gitCommitUrl(): Optional<String> =
            Optional.ofNullable(gitCommitUrl.getNullable("gitCommitUrl"))

        /** The commit id. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The author id of the commit. */
        @JsonProperty("authorId") @ExcludeMissing fun _authorId(): JsonField<String> = authorId

        /** The size of the commit bundle in bytes. */
        @JsonProperty("fileSize") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

        /** The commit message. */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /** The model id. */
        @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId(): JsonField<String> = mlModelId

        /** The storage URI where the commit bundle is stored. */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun _storageUri(): JsonField<String> = storageUri

        /** The training dataset id. */
        @JsonProperty("trainingDatasetId")
        @ExcludeMissing
        fun _trainingDatasetId(): JsonField<String> = trainingDatasetId

        /** The validation dataset id. */
        @JsonProperty("validationDatasetId")
        @ExcludeMissing
        fun _validationDatasetId(): JsonField<String> = validationDatasetId

        /** The commit creation date. */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /** The ref of the corresponding git commit. */
        @JsonProperty("gitCommitRef")
        @ExcludeMissing
        fun _gitCommitRef(): JsonField<String> = gitCommitRef

        /** The SHA of the corresponding git commit. */
        @JsonProperty("gitCommitSha")
        @ExcludeMissing
        fun _gitCommitSha(): JsonField<Long> = gitCommitSha

        /** The URL of the corresponding git commit. */
        @JsonProperty("gitCommitUrl")
        @ExcludeMissing
        fun _gitCommitUrl(): JsonField<String> = gitCommitUrl

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            id()
            authorId()
            fileSize()
            message()
            mlModelId()
            storageUri()
            trainingDatasetId()
            validationDatasetId()
            dateCreated()
            gitCommitRef()
            gitCommitSha()
            gitCommitUrl()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var authorId: JsonField<String>? = null
            private var fileSize: JsonField<Long>? = null
            private var message: JsonField<String>? = null
            private var mlModelId: JsonField<String>? = null
            private var storageUri: JsonField<String>? = null
            private var trainingDatasetId: JsonField<String>? = null
            private var validationDatasetId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gitCommitRef: JsonField<String> = JsonMissing.of()
            private var gitCommitSha: JsonField<Long> = JsonMissing.of()
            private var gitCommitUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                id = commit.id
                authorId = commit.authorId
                fileSize = commit.fileSize
                message = commit.message
                mlModelId = commit.mlModelId
                storageUri = commit.storageUri
                trainingDatasetId = commit.trainingDatasetId
                validationDatasetId = commit.validationDatasetId
                dateCreated = commit.dateCreated
                gitCommitRef = commit.gitCommitRef
                gitCommitSha = commit.gitCommitSha
                gitCommitUrl = commit.gitCommitUrl
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            /** The commit id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The commit id. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The author id of the commit. */
            fun authorId(authorId: String) = authorId(JsonField.of(authorId))

            /** The author id of the commit. */
            fun authorId(authorId: JsonField<String>) = apply { this.authorId = authorId }

            /** The size of the commit bundle in bytes. */
            fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

            /** The size of the commit bundle in bytes. */
            fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

            /** The size of the commit bundle in bytes. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun fileSize(fileSize: Optional<Long>) = fileSize(fileSize.orElse(null) as Long?)

            /** The size of the commit bundle in bytes. */
            fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

            /** The commit message. */
            fun message(message: String) = message(JsonField.of(message))

            /** The commit message. */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** The model id. */
            fun mlModelId(mlModelId: String?) = mlModelId(JsonField.ofNullable(mlModelId))

            /** The model id. */
            fun mlModelId(mlModelId: Optional<String>) = mlModelId(mlModelId.orElse(null))

            /** The model id. */
            fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: String?) =
                trainingDatasetId(JsonField.ofNullable(trainingDatasetId))

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: Optional<String>) =
                trainingDatasetId(trainingDatasetId.orElse(null))

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
                this.trainingDatasetId = trainingDatasetId
            }

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: String?) =
                validationDatasetId(JsonField.ofNullable(validationDatasetId))

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: Optional<String>) =
                validationDatasetId(validationDatasetId.orElse(null))

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                this.validationDatasetId = validationDatasetId
            }

            /** The commit creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The commit creation date. */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The ref of the corresponding git commit. */
            fun gitCommitRef(gitCommitRef: String) = gitCommitRef(JsonField.of(gitCommitRef))

            /** The ref of the corresponding git commit. */
            fun gitCommitRef(gitCommitRef: JsonField<String>) = apply {
                this.gitCommitRef = gitCommitRef
            }

            /** The SHA of the corresponding git commit. */
            fun gitCommitSha(gitCommitSha: Long) = gitCommitSha(JsonField.of(gitCommitSha))

            /** The SHA of the corresponding git commit. */
            fun gitCommitSha(gitCommitSha: JsonField<Long>) = apply {
                this.gitCommitSha = gitCommitSha
            }

            /** The URL of the corresponding git commit. */
            fun gitCommitUrl(gitCommitUrl: String) = gitCommitUrl(JsonField.of(gitCommitUrl))

            /** The URL of the corresponding git commit. */
            fun gitCommitUrl(gitCommitUrl: JsonField<String>) = apply {
                this.gitCommitUrl = gitCommitUrl
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

            fun build(): Commit =
                Commit(
                    checkRequired("id", id),
                    checkRequired("authorId", authorId),
                    checkRequired("fileSize", fileSize),
                    checkRequired("message", message),
                    checkRequired("mlModelId", mlModelId),
                    checkRequired("storageUri", storageUri),
                    checkRequired("trainingDatasetId", trainingDatasetId),
                    checkRequired("validationDatasetId", validationDatasetId),
                    dateCreated,
                    gitCommitRef,
                    gitCommitSha,
                    gitCommitUrl,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && id == other.id && authorId == other.authorId && fileSize == other.fileSize && message == other.message && mlModelId == other.mlModelId && storageUri == other.storageUri && trainingDatasetId == other.trainingDatasetId && validationDatasetId == other.validationDatasetId && dateCreated == other.dateCreated && gitCommitRef == other.gitCommitRef && gitCommitSha == other.gitCommitSha && gitCommitUrl == other.gitCommitUrl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, authorId, fileSize, message, mlModelId, storageUri, trainingDatasetId, validationDatasetId, dateCreated, gitCommitRef, gitCommitSha, gitCommitUrl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{id=$id, authorId=$authorId, fileSize=$fileSize, message=$message, mlModelId=$mlModelId, storageUri=$storageUri, trainingDatasetId=$trainingDatasetId, validationDatasetId=$validationDatasetId, dateCreated=$dateCreated, gitCommitRef=$gitCommitRef, gitCommitSha=$gitCommitSha, gitCommitUrl=$gitCommitUrl, additionalProperties=$additionalProperties}"
    }

    /**
     * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
     * Finally, it can be `paused`, `failed`, or `completed`.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val PAUSED = of("paused")

            @JvmField val FAILED = of("failed")

            @JvmField val COMPLETED = of("completed")

            @JvmField val UNKNOWN = of("unknown")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Links
    @JsonCreator
    private constructor(
        @JsonProperty("app") @ExcludeMissing private val app: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun app(): String = app.getRequired("app")

        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Links = apply {
            if (validated) {
                return@apply
            }

            app()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                app = links.app
                additionalProperties = links.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            fun app(app: JsonField<String>) = apply { this.app = app }

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

            fun build(): Links =
                Links(checkRequired("app", app), additionalProperties.toImmutable())
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

        return /* spotless:off */ other is ProjectCommitCreateParams && projectId == other.projectId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectCommitCreateParams{projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
