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
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ProjectCommitCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("commit")
    @ExcludeMissing
    private val commit: JsonField<Commit> = JsonMissing.of(),
    @JsonProperty("dateArchived")
    @ExcludeMissing
    private val dateArchived: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dateCreated")
    @ExcludeMissing
    private val dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("failingGoalCount")
    @ExcludeMissing
    private val failingGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("mlModelId")
    @ExcludeMissing
    private val mlModelId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("passingGoalCount")
    @ExcludeMissing
    private val passingGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("projectId")
    @ExcludeMissing
    private val projectId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("statusMessage")
    @ExcludeMissing
    private val statusMessage: JsonField<String> = JsonMissing.of(),
    @JsonProperty("storageUri")
    @ExcludeMissing
    private val storageUri: JsonField<String> = JsonMissing.of(),
    @JsonProperty("totalGoalCount")
    @ExcludeMissing
    private val totalGoalCount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("trainingDatasetId")
    @ExcludeMissing
    private val trainingDatasetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("validationDatasetId")
    @ExcludeMissing
    private val validationDatasetId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("archived")
    @ExcludeMissing
    private val archived: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("deploymentStatus")
    @ExcludeMissing
    private val deploymentStatus: JsonField<String> = JsonMissing.of(),
    @JsonProperty("links") @ExcludeMissing private val links: JsonField<Links> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The project version (commit) id. */
    fun id(): String = id.getRequired("id")

    /** The details of a commit (project version). */
    fun commit(): Commit = commit.getRequired("commit")

    /** The commit archive date. */
    fun dateArchived(): Optional<OffsetDateTime> =
        Optional.ofNullable(dateArchived.getNullable("dateArchived"))

    /** The project version (commit) creation date. */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /** The number of tests that are failing for the commit. */
    fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

    /** The model id. */
    fun mlModelId(): Optional<String> = Optional.ofNullable(mlModelId.getNullable("mlModelId"))

    /** The number of tests that are passing for the commit. */
    fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

    /** The project id. */
    fun projectId(): String = projectId.getRequired("projectId")

    /**
     * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
     * Finally, it can be `paused`, `failed`, or `completed`.
     */
    fun status(): Status = status.getRequired("status")

    /** The commit status message. */
    fun statusMessage(): Optional<String> =
        Optional.ofNullable(statusMessage.getNullable("statusMessage"))

    /** The storage URI where the commit bundle is stored. */
    fun storageUri(): String = storageUri.getRequired("storageUri")

    /** The total number of tests for the commit. */
    fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

    /** The training dataset id. */
    fun trainingDatasetId(): Optional<String> =
        Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

    /** The validation dataset id. */
    fun validationDatasetId(): Optional<String> =
        Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

    /** Whether the commit is archived. */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

    /** The deployment status associated with the commit's model. */
    fun deploymentStatus(): Optional<String> =
        Optional.ofNullable(deploymentStatus.getNullable("deploymentStatus"))

    fun links(): Optional<Links> = Optional.ofNullable(links.getNullable("links"))

    /** The project version (commit) id. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The details of a commit (project version). */
    @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

    /** The commit archive date. */
    @JsonProperty("dateArchived")
    @ExcludeMissing
    fun _dateArchived(): JsonField<OffsetDateTime> = dateArchived

    /** The project version (commit) creation date. */
    @JsonProperty("dateCreated")
    @ExcludeMissing
    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

    /** The number of tests that are failing for the commit. */
    @JsonProperty("failingGoalCount")
    @ExcludeMissing
    fun _failingGoalCount(): JsonField<Long> = failingGoalCount

    /** The model id. */
    @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId(): JsonField<String> = mlModelId

    /** The number of tests that are passing for the commit. */
    @JsonProperty("passingGoalCount")
    @ExcludeMissing
    fun _passingGoalCount(): JsonField<Long> = passingGoalCount

    /** The project id. */
    @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
     * Finally, it can be `paused`, `failed`, or `completed`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** The commit status message. */
    @JsonProperty("statusMessage")
    @ExcludeMissing
    fun _statusMessage(): JsonField<String> = statusMessage

    /** The storage URI where the commit bundle is stored. */
    @JsonProperty("storageUri") @ExcludeMissing fun _storageUri(): JsonField<String> = storageUri

    /** The total number of tests for the commit. */
    @JsonProperty("totalGoalCount")
    @ExcludeMissing
    fun _totalGoalCount(): JsonField<Long> = totalGoalCount

    /** The training dataset id. */
    @JsonProperty("trainingDatasetId")
    @ExcludeMissing
    fun _trainingDatasetId(): JsonField<String> = trainingDatasetId

    /** The validation dataset id. */
    @JsonProperty("validationDatasetId")
    @ExcludeMissing
    fun _validationDatasetId(): JsonField<String> = validationDatasetId

    /** Whether the commit is archived. */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /** The deployment status associated with the commit's model. */
    @JsonProperty("deploymentStatus")
    @ExcludeMissing
    fun _deploymentStatus(): JsonField<String> = deploymentStatus

    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProjectCommitCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        commit().validate()
        dateArchived()
        dateCreated()
        failingGoalCount()
        mlModelId()
        passingGoalCount()
        projectId()
        status()
        statusMessage()
        storageUri()
        totalGoalCount()
        trainingDatasetId()
        validationDatasetId()
        archived()
        deploymentStatus()
        links().ifPresent { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectCommitCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var commit: JsonField<Commit>? = null
        private var dateArchived: JsonField<OffsetDateTime>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var failingGoalCount: JsonField<Long>? = null
        private var mlModelId: JsonField<String>? = null
        private var passingGoalCount: JsonField<Long>? = null
        private var projectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var statusMessage: JsonField<String>? = null
        private var storageUri: JsonField<String>? = null
        private var totalGoalCount: JsonField<Long>? = null
        private var trainingDatasetId: JsonField<String>? = null
        private var validationDatasetId: JsonField<String>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var deploymentStatus: JsonField<String> = JsonMissing.of()
        private var links: JsonField<Links> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectCommitCreateResponse: ProjectCommitCreateResponse) = apply {
            id = projectCommitCreateResponse.id
            commit = projectCommitCreateResponse.commit
            dateArchived = projectCommitCreateResponse.dateArchived
            dateCreated = projectCommitCreateResponse.dateCreated
            failingGoalCount = projectCommitCreateResponse.failingGoalCount
            mlModelId = projectCommitCreateResponse.mlModelId
            passingGoalCount = projectCommitCreateResponse.passingGoalCount
            projectId = projectCommitCreateResponse.projectId
            status = projectCommitCreateResponse.status
            statusMessage = projectCommitCreateResponse.statusMessage
            storageUri = projectCommitCreateResponse.storageUri
            totalGoalCount = projectCommitCreateResponse.totalGoalCount
            trainingDatasetId = projectCommitCreateResponse.trainingDatasetId
            validationDatasetId = projectCommitCreateResponse.validationDatasetId
            archived = projectCommitCreateResponse.archived
            deploymentStatus = projectCommitCreateResponse.deploymentStatus
            links = projectCommitCreateResponse.links
            additionalProperties = projectCommitCreateResponse.additionalProperties.toMutableMap()
        }

        /** The project version (commit) id. */
        fun id(id: String) = id(JsonField.of(id))

        /** The project version (commit) id. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The details of a commit (project version). */
        fun commit(commit: Commit) = commit(JsonField.of(commit))

        /** The details of a commit (project version). */
        fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

        /** The commit archive date. */
        fun dateArchived(dateArchived: OffsetDateTime?) =
            dateArchived(JsonField.ofNullable(dateArchived))

        /** The commit archive date. */
        fun dateArchived(dateArchived: Optional<OffsetDateTime>) =
            dateArchived(dateArchived.orElse(null))

        /** The commit archive date. */
        fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
            this.dateArchived = dateArchived
        }

        /** The project version (commit) creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /** The project version (commit) creation date. */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /** The number of tests that are failing for the commit. */
        fun failingGoalCount(failingGoalCount: Long) =
            failingGoalCount(JsonField.of(failingGoalCount))

        /** The number of tests that are failing for the commit. */
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            this.failingGoalCount = failingGoalCount
        }

        /** The model id. */
        fun mlModelId(mlModelId: String?) = mlModelId(JsonField.ofNullable(mlModelId))

        /** The model id. */
        fun mlModelId(mlModelId: Optional<String>) = mlModelId(mlModelId.orElse(null))

        /** The model id. */
        fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

        /** The number of tests that are passing for the commit. */
        fun passingGoalCount(passingGoalCount: Long) =
            passingGoalCount(JsonField.of(passingGoalCount))

        /** The number of tests that are passing for the commit. */
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            this.passingGoalCount = passingGoalCount
        }

        /** The project id. */
        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /** The project id. */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The commit status message. */
        fun statusMessage(statusMessage: String?) =
            statusMessage(JsonField.ofNullable(statusMessage))

        /** The commit status message. */
        fun statusMessage(statusMessage: Optional<String>) =
            statusMessage(statusMessage.orElse(null))

        /** The commit status message. */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            this.statusMessage = statusMessage
        }

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

        /** The total number of tests for the commit. */
        fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

        /** The total number of tests for the commit. */
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            this.totalGoalCount = totalGoalCount
        }

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

        fun links(links: Links) = links(JsonField.of(links))

        fun links(links: JsonField<Links>) = apply { this.links = links }

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

        fun build(): ProjectCommitCreateResponse =
            ProjectCommitCreateResponse(
                checkRequired("id", id),
                checkRequired("commit", commit),
                checkRequired("dateArchived", dateArchived),
                checkRequired("dateCreated", dateCreated),
                checkRequired("failingGoalCount", failingGoalCount),
                checkRequired("mlModelId", mlModelId),
                checkRequired("passingGoalCount", passingGoalCount),
                checkRequired("projectId", projectId),
                checkRequired("status", status),
                checkRequired("statusMessage", statusMessage),
                checkRequired("storageUri", storageUri),
                checkRequired("totalGoalCount", totalGoalCount),
                checkRequired("trainingDatasetId", trainingDatasetId),
                checkRequired("validationDatasetId", validationDatasetId),
                archived,
                deploymentStatus,
                links,
                additionalProperties.toImmutable(),
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

        /** A builder for [Commit]. */
        class Builder internal constructor() {

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
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
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

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                OpenlayerInvalidDataException("Value is not a String")
            }

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

        /** A builder for [Links]. */
        class Builder internal constructor() {

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

        return /* spotless:off */ other is ProjectCommitCreateResponse && id == other.id && commit == other.commit && dateArchived == other.dateArchived && dateCreated == other.dateCreated && failingGoalCount == other.failingGoalCount && mlModelId == other.mlModelId && passingGoalCount == other.passingGoalCount && projectId == other.projectId && status == other.status && statusMessage == other.statusMessage && storageUri == other.storageUri && totalGoalCount == other.totalGoalCount && trainingDatasetId == other.trainingDatasetId && validationDatasetId == other.validationDatasetId && archived == other.archived && deploymentStatus == other.deploymentStatus && links == other.links && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, commit, dateArchived, dateCreated, failingGoalCount, mlModelId, passingGoalCount, projectId, status, statusMessage, storageUri, totalGoalCount, trainingDatasetId, validationDatasetId, archived, deploymentStatus, links, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectCommitCreateResponse{id=$id, commit=$commit, dateArchived=$dateArchived, dateCreated=$dateCreated, failingGoalCount=$failingGoalCount, mlModelId=$mlModelId, passingGoalCount=$passingGoalCount, projectId=$projectId, status=$status, statusMessage=$statusMessage, storageUri=$storageUri, totalGoalCount=$totalGoalCount, trainingDatasetId=$trainingDatasetId, validationDatasetId=$validationDatasetId, archived=$archived, deploymentStatus=$deploymentStatus, links=$links, additionalProperties=$additionalProperties}"
}
