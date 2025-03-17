// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.commits

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
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new commit (project version) in a project. */
class CommitCreateParams
private constructor(
    private val pathProjectId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathProjectId(): String = pathProjectId

    /**
     * The project version (commit) id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * The details of a commit (project version).
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commit(): Commit = body.commit()

    /**
     * The commit archive date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateArchived(): Optional<OffsetDateTime> = body.dateArchived()

    /**
     * The project version (commit) creation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = body.dateCreated()

    /**
     * The number of tests that are failing for the commit.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failingGoalCount(): Long = body.failingGoalCount()

    /**
     * The model id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mlModelId(): Optional<String> = body.mlModelId()

    /**
     * The number of tests that are passing for the commit.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun passingGoalCount(): Long = body.passingGoalCount()

    /**
     * The project id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyProjectId(): String = body.bodyProjectId()

    /**
     * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
     * Finally, it can be `paused`, `failed`, or `completed`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = body.status()

    /**
     * The commit status message.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> = body.statusMessage()

    /**
     * The storage URI where the commit bundle is stored.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun storageUri(): String = body.storageUri()

    /**
     * The total number of tests for the commit.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalGoalCount(): Long = body.totalGoalCount()

    /**
     * The training dataset id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trainingDatasetId(): Optional<String> = body.trainingDatasetId()

    /**
     * The validation dataset id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun validationDatasetId(): Optional<String> = body.validationDatasetId()

    /**
     * Whether the commit is archived.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = body.archived()

    /**
     * The deployment status associated with the commit's model.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deploymentStatus(): Optional<String> = body.deploymentStatus()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun links(): Optional<Links> = body.links()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [commit].
     *
     * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commit(): JsonField<Commit> = body._commit()

    /**
     * Returns the raw JSON value of [dateArchived].
     *
     * Unlike [dateArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateArchived(): JsonField<OffsetDateTime> = body._dateArchived()

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateCreated(): JsonField<OffsetDateTime> = body._dateCreated()

    /**
     * Returns the raw JSON value of [failingGoalCount].
     *
     * Unlike [failingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _failingGoalCount(): JsonField<Long> = body._failingGoalCount()

    /**
     * Returns the raw JSON value of [mlModelId].
     *
     * Unlike [mlModelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mlModelId(): JsonField<String> = body._mlModelId()

    /**
     * Returns the raw JSON value of [passingGoalCount].
     *
     * Unlike [passingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _passingGoalCount(): JsonField<Long> = body._passingGoalCount()

    /**
     * Returns the raw JSON value of [bodyProjectId].
     *
     * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyProjectId(): JsonField<String> = body._bodyProjectId()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusMessage(): JsonField<String> = body._statusMessage()

    /**
     * Returns the raw JSON value of [storageUri].
     *
     * Unlike [storageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _storageUri(): JsonField<String> = body._storageUri()

    /**
     * Returns the raw JSON value of [totalGoalCount].
     *
     * Unlike [totalGoalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _totalGoalCount(): JsonField<Long> = body._totalGoalCount()

    /**
     * Returns the raw JSON value of [trainingDatasetId].
     *
     * Unlike [trainingDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _trainingDatasetId(): JsonField<String> = body._trainingDatasetId()

    /**
     * Returns the raw JSON value of [validationDatasetId].
     *
     * Unlike [validationDatasetId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _validationDatasetId(): JsonField<String> = body._validationDatasetId()

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _archived(): JsonField<Boolean> = body._archived()

    /**
     * Returns the raw JSON value of [deploymentStatus].
     *
     * Unlike [deploymentStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deploymentStatus(): JsonField<String> = body._deploymentStatus()

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _links(): JsonField<Links> = body._links()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> pathProjectId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
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
        private val bodyProjectId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("links")
        @ExcludeMissing
        private val links: JsonField<Links> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The project version (commit) id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The details of a commit (project version).
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commit(): Commit = commit.getRequired("commit")

        /**
         * The commit archive date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateArchived(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateArchived.getNullable("dateArchived"))

        /**
         * The project version (commit) creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The number of tests that are failing for the commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

        /**
         * The model id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mlModelId(): Optional<String> = Optional.ofNullable(mlModelId.getNullable("mlModelId"))

        /**
         * The number of tests that are passing for the commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

        /**
         * The project id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bodyProjectId(): String = bodyProjectId.getRequired("projectId")

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The commit status message.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statusMessage(): Optional<String> =
            Optional.ofNullable(statusMessage.getNullable("statusMessage"))

        /**
         * The storage URI where the commit bundle is stored.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun storageUri(): String = storageUri.getRequired("storageUri")

        /**
         * The total number of tests for the commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

        /**
         * The training dataset id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trainingDatasetId(): Optional<String> =
            Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

        /**
         * The validation dataset id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun validationDatasetId(): Optional<String> =
            Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

        /**
         * Whether the commit is archived.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

        /**
         * The deployment status associated with the commit's model.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deploymentStatus(): Optional<String> =
            Optional.ofNullable(deploymentStatus.getNullable("deploymentStatus"))

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun links(): Optional<Links> = Optional.ofNullable(links.getNullable("links"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [commit].
         *
         * Unlike [commit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

        /**
         * Returns the raw JSON value of [dateArchived].
         *
         * Unlike [dateArchived], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateArchived")
        @ExcludeMissing
        fun _dateArchived(): JsonField<OffsetDateTime> = dateArchived

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [failingGoalCount].
         *
         * Unlike [failingGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failingGoalCount")
        @ExcludeMissing
        fun _failingGoalCount(): JsonField<Long> = failingGoalCount

        /**
         * Returns the raw JSON value of [mlModelId].
         *
         * Unlike [mlModelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId(): JsonField<String> = mlModelId

        /**
         * Returns the raw JSON value of [passingGoalCount].
         *
         * Unlike [passingGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("passingGoalCount")
        @ExcludeMissing
        fun _passingGoalCount(): JsonField<Long> = passingGoalCount

        /**
         * Returns the raw JSON value of [bodyProjectId].
         *
         * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectId")
        @ExcludeMissing
        fun _bodyProjectId(): JsonField<String> = bodyProjectId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [statusMessage].
         *
         * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("statusMessage")
        @ExcludeMissing
        fun _statusMessage(): JsonField<String> = statusMessage

        /**
         * Returns the raw JSON value of [storageUri].
         *
         * Unlike [storageUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun _storageUri(): JsonField<String> = storageUri

        /**
         * Returns the raw JSON value of [totalGoalCount].
         *
         * Unlike [totalGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalGoalCount")
        @ExcludeMissing
        fun _totalGoalCount(): JsonField<Long> = totalGoalCount

        /**
         * Returns the raw JSON value of [trainingDatasetId].
         *
         * Unlike [trainingDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trainingDatasetId")
        @ExcludeMissing
        fun _trainingDatasetId(): JsonField<String> = trainingDatasetId

        /**
         * Returns the raw JSON value of [validationDatasetId].
         *
         * Unlike [validationDatasetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("validationDatasetId")
        @ExcludeMissing
        fun _validationDatasetId(): JsonField<String> = validationDatasetId

        /**
         * Returns the raw JSON value of [archived].
         *
         * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

        /**
         * Returns the raw JSON value of [deploymentStatus].
         *
         * Unlike [deploymentStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("deploymentStatus")
        @ExcludeMissing
        fun _deploymentStatus(): JsonField<String> = deploymentStatus

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            bodyProjectId()
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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .commit()
             * .dateArchived()
             * .dateCreated()
             * .failingGoalCount()
             * .mlModelId()
             * .passingGoalCount()
             * .bodyProjectId()
             * .status()
             * .statusMessage()
             * .storageUri()
             * .totalGoalCount()
             * .trainingDatasetId()
             * .validationDatasetId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var commit: JsonField<Commit>? = null
            private var dateArchived: JsonField<OffsetDateTime>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var failingGoalCount: JsonField<Long>? = null
            private var mlModelId: JsonField<String>? = null
            private var passingGoalCount: JsonField<Long>? = null
            private var bodyProjectId: JsonField<String>? = null
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
            internal fun from(body: Body) = apply {
                id = body.id
                commit = body.commit
                dateArchived = body.dateArchived
                dateCreated = body.dateCreated
                failingGoalCount = body.failingGoalCount
                mlModelId = body.mlModelId
                passingGoalCount = body.passingGoalCount
                bodyProjectId = body.bodyProjectId
                status = body.status
                statusMessage = body.statusMessage
                storageUri = body.storageUri
                totalGoalCount = body.totalGoalCount
                trainingDatasetId = body.trainingDatasetId
                validationDatasetId = body.validationDatasetId
                archived = body.archived
                deploymentStatus = body.deploymentStatus
                links = body.links
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The project version (commit) id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The details of a commit (project version). */
            fun commit(commit: Commit) = commit(JsonField.of(commit))

            /**
             * Sets [Builder.commit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commit] with a well-typed [Commit] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

            /** The commit archive date. */
            fun dateArchived(dateArchived: OffsetDateTime?) =
                dateArchived(JsonField.ofNullable(dateArchived))

            /** Alias for calling [Builder.dateArchived] with `dateArchived.orElse(null)`. */
            fun dateArchived(dateArchived: Optional<OffsetDateTime>) =
                dateArchived(dateArchived.getOrNull())

            /**
             * Sets [Builder.dateArchived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateArchived] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
                this.dateArchived = dateArchived
            }

            /** The project version (commit) creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The number of tests that are failing for the commit. */
            fun failingGoalCount(failingGoalCount: Long) =
                failingGoalCount(JsonField.of(failingGoalCount))

            /**
             * Sets [Builder.failingGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failingGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
                this.failingGoalCount = failingGoalCount
            }

            /** The model id. */
            fun mlModelId(mlModelId: String?) = mlModelId(JsonField.ofNullable(mlModelId))

            /** Alias for calling [Builder.mlModelId] with `mlModelId.orElse(null)`. */
            fun mlModelId(mlModelId: Optional<String>) = mlModelId(mlModelId.getOrNull())

            /**
             * Sets [Builder.mlModelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mlModelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

            /** The number of tests that are passing for the commit. */
            fun passingGoalCount(passingGoalCount: Long) =
                passingGoalCount(JsonField.of(passingGoalCount))

            /**
             * Sets [Builder.passingGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passingGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
                this.passingGoalCount = passingGoalCount
            }

            /** The project id. */
            fun bodyProjectId(bodyProjectId: String) = bodyProjectId(JsonField.of(bodyProjectId))

            /**
             * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyProjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
                this.bodyProjectId = bodyProjectId
            }

            /**
             * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
             * Finally, it can be `paused`, `failed`, or `completed`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The commit status message. */
            fun statusMessage(statusMessage: String?) =
                statusMessage(JsonField.ofNullable(statusMessage))

            /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
            fun statusMessage(statusMessage: Optional<String>) =
                statusMessage(statusMessage.getOrNull())

            /**
             * Sets [Builder.statusMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

            /**
             * Sets [Builder.storageUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

            /** The total number of tests for the commit. */
            fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

            /**
             * Sets [Builder.totalGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
                this.totalGoalCount = totalGoalCount
            }

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: String?) =
                trainingDatasetId(JsonField.ofNullable(trainingDatasetId))

            /**
             * Alias for calling [Builder.trainingDatasetId] with `trainingDatasetId.orElse(null)`.
             */
            fun trainingDatasetId(trainingDatasetId: Optional<String>) =
                trainingDatasetId(trainingDatasetId.getOrNull())

            /**
             * Sets [Builder.trainingDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
                this.trainingDatasetId = trainingDatasetId
            }

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: String?) =
                validationDatasetId(JsonField.ofNullable(validationDatasetId))

            /**
             * Alias for calling [Builder.validationDatasetId] with
             * `validationDatasetId.orElse(null)`.
             */
            fun validationDatasetId(validationDatasetId: Optional<String>) =
                validationDatasetId(validationDatasetId.getOrNull())

            /**
             * Sets [Builder.validationDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validationDatasetId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                this.validationDatasetId = validationDatasetId
            }

            /** Whether the commit is archived. */
            fun archived(archived: Boolean?) = archived(JsonField.ofNullable(archived))

            /**
             * Alias for [Builder.archived].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun archived(archived: Boolean) = archived(archived as Boolean?)

            /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
            fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

            /**
             * Sets [Builder.archived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            /** The deployment status associated with the commit's model. */
            fun deploymentStatus(deploymentStatus: String) =
                deploymentStatus(JsonField.of(deploymentStatus))

            /**
             * Sets [Builder.deploymentStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deploymentStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deploymentStatus(deploymentStatus: JsonField<String>) = apply {
                this.deploymentStatus = deploymentStatus
            }

            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("commit", commit),
                    checkRequired("dateArchived", dateArchived),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("failingGoalCount", failingGoalCount),
                    checkRequired("mlModelId", mlModelId),
                    checkRequired("passingGoalCount", passingGoalCount),
                    checkRequired("bodyProjectId", bodyProjectId),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && id == other.id && commit == other.commit && dateArchived == other.dateArchived && dateCreated == other.dateCreated && failingGoalCount == other.failingGoalCount && mlModelId == other.mlModelId && passingGoalCount == other.passingGoalCount && bodyProjectId == other.bodyProjectId && status == other.status && statusMessage == other.statusMessage && storageUri == other.storageUri && totalGoalCount == other.totalGoalCount && trainingDatasetId == other.trainingDatasetId && validationDatasetId == other.validationDatasetId && archived == other.archived && deploymentStatus == other.deploymentStatus && links == other.links && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, commit, dateArchived, dateCreated, failingGoalCount, mlModelId, passingGoalCount, bodyProjectId, status, statusMessage, storageUri, totalGoalCount, trainingDatasetId, validationDatasetId, archived, deploymentStatus, links, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, commit=$commit, dateArchived=$dateArchived, dateCreated=$dateCreated, failingGoalCount=$failingGoalCount, mlModelId=$mlModelId, passingGoalCount=$passingGoalCount, bodyProjectId=$bodyProjectId, status=$status, statusMessage=$statusMessage, storageUri=$storageUri, totalGoalCount=$totalGoalCount, trainingDatasetId=$trainingDatasetId, validationDatasetId=$validationDatasetId, archived=$archived, deploymentStatus=$deploymentStatus, links=$links, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitCreateParams].
         *
         * The following fields are required:
         * ```java
         * .pathProjectId()
         * .id()
         * .commit()
         * .dateArchived()
         * .dateCreated()
         * .failingGoalCount()
         * .mlModelId()
         * .passingGoalCount()
         * .bodyProjectId()
         * .status()
         * .statusMessage()
         * .storageUri()
         * .totalGoalCount()
         * .trainingDatasetId()
         * .validationDatasetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var pathProjectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitCreateParams: CommitCreateParams) = apply {
            pathProjectId = commitCreateParams.pathProjectId
            body = commitCreateParams.body.toBuilder()
            additionalHeaders = commitCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitCreateParams.additionalQueryParams.toBuilder()
        }

        fun pathProjectId(pathProjectId: String) = apply { this.pathProjectId = pathProjectId }

        /** The project version (commit) id. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** The details of a commit (project version). */
        fun commit(commit: Commit) = apply { body.commit(commit) }

        /**
         * Sets [Builder.commit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commit] with a well-typed [Commit] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun commit(commit: JsonField<Commit>) = apply { body.commit(commit) }

        /** The commit archive date. */
        fun dateArchived(dateArchived: OffsetDateTime?) = apply { body.dateArchived(dateArchived) }

        /** Alias for calling [Builder.dateArchived] with `dateArchived.orElse(null)`. */
        fun dateArchived(dateArchived: Optional<OffsetDateTime>) =
            dateArchived(dateArchived.getOrNull())

        /**
         * Sets [Builder.dateArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateArchived] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
            body.dateArchived(dateArchived)
        }

        /** The project version (commit) creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = apply { body.dateCreated(dateCreated) }

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            body.dateCreated(dateCreated)
        }

        /** The number of tests that are failing for the commit. */
        fun failingGoalCount(failingGoalCount: Long) = apply {
            body.failingGoalCount(failingGoalCount)
        }

        /**
         * Sets [Builder.failingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            body.failingGoalCount(failingGoalCount)
        }

        /** The model id. */
        fun mlModelId(mlModelId: String?) = apply { body.mlModelId(mlModelId) }

        /** Alias for calling [Builder.mlModelId] with `mlModelId.orElse(null)`. */
        fun mlModelId(mlModelId: Optional<String>) = mlModelId(mlModelId.getOrNull())

        /**
         * Sets [Builder.mlModelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mlModelId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mlModelId(mlModelId: JsonField<String>) = apply { body.mlModelId(mlModelId) }

        /** The number of tests that are passing for the commit. */
        fun passingGoalCount(passingGoalCount: Long) = apply {
            body.passingGoalCount(passingGoalCount)
        }

        /**
         * Sets [Builder.passingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            body.passingGoalCount(passingGoalCount)
        }

        /** The project id. */
        fun bodyProjectId(bodyProjectId: String) = apply { body.bodyProjectId(bodyProjectId) }

        /**
         * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyProjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
            body.bodyProjectId(bodyProjectId)
        }

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /** The commit status message. */
        fun statusMessage(statusMessage: String?) = apply { body.statusMessage(statusMessage) }

        /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
        fun statusMessage(statusMessage: Optional<String>) =
            statusMessage(statusMessage.getOrNull())

        /**
         * Sets [Builder.statusMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            body.statusMessage(statusMessage)
        }

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(storageUri: String) = apply { body.storageUri(storageUri) }

        /**
         * Sets [Builder.storageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storageUri(storageUri: JsonField<String>) = apply { body.storageUri(storageUri) }

        /** The total number of tests for the commit. */
        fun totalGoalCount(totalGoalCount: Long) = apply { body.totalGoalCount(totalGoalCount) }

        /**
         * Sets [Builder.totalGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalGoalCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            body.totalGoalCount(totalGoalCount)
        }

        /** The training dataset id. */
        fun trainingDatasetId(trainingDatasetId: String?) = apply {
            body.trainingDatasetId(trainingDatasetId)
        }

        /** Alias for calling [Builder.trainingDatasetId] with `trainingDatasetId.orElse(null)`. */
        fun trainingDatasetId(trainingDatasetId: Optional<String>) =
            trainingDatasetId(trainingDatasetId.getOrNull())

        /**
         * Sets [Builder.trainingDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trainingDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
            body.trainingDatasetId(trainingDatasetId)
        }

        /** The validation dataset id. */
        fun validationDatasetId(validationDatasetId: String?) = apply {
            body.validationDatasetId(validationDatasetId)
        }

        /**
         * Alias for calling [Builder.validationDatasetId] with `validationDatasetId.orElse(null)`.
         */
        fun validationDatasetId(validationDatasetId: Optional<String>) =
            validationDatasetId(validationDatasetId.getOrNull())

        /**
         * Sets [Builder.validationDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validationDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
            body.validationDatasetId(validationDatasetId)
        }

        /** Whether the commit is archived. */
        fun archived(archived: Boolean?) = apply { body.archived(archived) }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { body.archived(archived) }

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(deploymentStatus: String) = apply {
            body.deploymentStatus(deploymentStatus)
        }

        /**
         * Sets [Builder.deploymentStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentStatus(deploymentStatus: JsonField<String>) = apply {
            body.deploymentStatus(deploymentStatus)
        }

        fun links(links: Links) = apply { body.links(links) }

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [Links] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<Links>) = apply { body.links(links) }

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

        fun build(): CommitCreateParams =
            CommitCreateParams(
                checkRequired("pathProjectId", pathProjectId),
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

        /**
         * The commit id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The author id of the commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorId(): String = authorId.getRequired("authorId")

        /**
         * The size of the commit bundle in bytes.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileSize(): Optional<Long> = Optional.ofNullable(fileSize.getNullable("fileSize"))

        /**
         * The commit message.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * The model id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mlModelId(): Optional<String> = Optional.ofNullable(mlModelId.getNullable("mlModelId"))

        /**
         * The storage URI where the commit bundle is stored.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun storageUri(): String = storageUri.getRequired("storageUri")

        /**
         * The training dataset id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trainingDatasetId(): Optional<String> =
            Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

        /**
         * The validation dataset id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun validationDatasetId(): Optional<String> =
            Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

        /**
         * The commit creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateCreated.getNullable("dateCreated"))

        /**
         * The ref of the corresponding git commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitCommitRef(): Optional<String> =
            Optional.ofNullable(gitCommitRef.getNullable("gitCommitRef"))

        /**
         * The SHA of the corresponding git commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitCommitSha(): Optional<Long> =
            Optional.ofNullable(gitCommitSha.getNullable("gitCommitSha"))

        /**
         * The URL of the corresponding git commit.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitCommitUrl(): Optional<String> =
            Optional.ofNullable(gitCommitUrl.getNullable("gitCommitUrl"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [authorId].
         *
         * Unlike [authorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("authorId") @ExcludeMissing fun _authorId(): JsonField<String> = authorId

        /**
         * Returns the raw JSON value of [fileSize].
         *
         * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fileSize") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [mlModelId].
         *
         * Unlike [mlModelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId(): JsonField<String> = mlModelId

        /**
         * Returns the raw JSON value of [storageUri].
         *
         * Unlike [storageUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("storageUri")
        @ExcludeMissing
        fun _storageUri(): JsonField<String> = storageUri

        /**
         * Returns the raw JSON value of [trainingDatasetId].
         *
         * Unlike [trainingDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trainingDatasetId")
        @ExcludeMissing
        fun _trainingDatasetId(): JsonField<String> = trainingDatasetId

        /**
         * Returns the raw JSON value of [validationDatasetId].
         *
         * Unlike [validationDatasetId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("validationDatasetId")
        @ExcludeMissing
        fun _validationDatasetId(): JsonField<String> = validationDatasetId

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [gitCommitRef].
         *
         * Unlike [gitCommitRef], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gitCommitRef")
        @ExcludeMissing
        fun _gitCommitRef(): JsonField<String> = gitCommitRef

        /**
         * Returns the raw JSON value of [gitCommitSha].
         *
         * Unlike [gitCommitSha], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gitCommitSha")
        @ExcludeMissing
        fun _gitCommitSha(): JsonField<Long> = gitCommitSha

        /**
         * Returns the raw JSON value of [gitCommitUrl].
         *
         * Unlike [gitCommitUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [Commit].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .authorId()
             * .fileSize()
             * .message()
             * .mlModelId()
             * .storageUri()
             * .trainingDatasetId()
             * .validationDatasetId()
             * ```
             */
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

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The author id of the commit. */
            fun authorId(authorId: String) = authorId(JsonField.of(authorId))

            /**
             * Sets [Builder.authorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authorId(authorId: JsonField<String>) = apply { this.authorId = authorId }

            /** The size of the commit bundle in bytes. */
            fun fileSize(fileSize: Long?) = fileSize(JsonField.ofNullable(fileSize))

            /**
             * Alias for [Builder.fileSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun fileSize(fileSize: Long) = fileSize(fileSize as Long?)

            /** Alias for calling [Builder.fileSize] with `fileSize.orElse(null)`. */
            fun fileSize(fileSize: Optional<Long>) = fileSize(fileSize.getOrNull())

            /**
             * Sets [Builder.fileSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

            /** The commit message. */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            /** The model id. */
            fun mlModelId(mlModelId: String?) = mlModelId(JsonField.ofNullable(mlModelId))

            /** Alias for calling [Builder.mlModelId] with `mlModelId.orElse(null)`. */
            fun mlModelId(mlModelId: Optional<String>) = mlModelId(mlModelId.getOrNull())

            /**
             * Sets [Builder.mlModelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mlModelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

            /**
             * Sets [Builder.storageUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: String?) =
                trainingDatasetId(JsonField.ofNullable(trainingDatasetId))

            /**
             * Alias for calling [Builder.trainingDatasetId] with `trainingDatasetId.orElse(null)`.
             */
            fun trainingDatasetId(trainingDatasetId: Optional<String>) =
                trainingDatasetId(trainingDatasetId.getOrNull())

            /**
             * Sets [Builder.trainingDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trainingDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
                this.trainingDatasetId = trainingDatasetId
            }

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: String?) =
                validationDatasetId(JsonField.ofNullable(validationDatasetId))

            /**
             * Alias for calling [Builder.validationDatasetId] with
             * `validationDatasetId.orElse(null)`.
             */
            fun validationDatasetId(validationDatasetId: Optional<String>) =
                validationDatasetId(validationDatasetId.getOrNull())

            /**
             * Sets [Builder.validationDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validationDatasetId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                this.validationDatasetId = validationDatasetId
            }

            /** The commit creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The ref of the corresponding git commit. */
            fun gitCommitRef(gitCommitRef: String) = gitCommitRef(JsonField.of(gitCommitRef))

            /**
             * Sets [Builder.gitCommitRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitCommitRef] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitCommitRef(gitCommitRef: JsonField<String>) = apply {
                this.gitCommitRef = gitCommitRef
            }

            /** The SHA of the corresponding git commit. */
            fun gitCommitSha(gitCommitSha: Long) = gitCommitSha(JsonField.of(gitCommitSha))

            /**
             * Sets [Builder.gitCommitSha] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitCommitSha] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitCommitSha(gitCommitSha: JsonField<Long>) = apply {
                this.gitCommitSha = gitCommitSha
            }

            /** The URL of the corresponding git commit. */
            fun gitCommitUrl(gitCommitUrl: String) = gitCommitUrl(JsonField.of(gitCommitUrl))

            /**
             * Sets [Builder.gitCommitUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitCommitUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun app(): String = app.getRequired("app")

        /**
         * Returns the raw JSON value of [app].
         *
         * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [Links].
             *
             * The following fields are required:
             * ```java
             * .app()
             * ```
             */
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

            /**
             * Sets [Builder.app] to an arbitrary JSON value.
             *
             * You should usually call [Builder.app] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

        return /* spotless:off */ other is CommitCreateParams && pathProjectId == other.pathProjectId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pathProjectId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CommitCreateParams{pathProjectId=$pathProjectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
