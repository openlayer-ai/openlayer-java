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
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProjectCommitListResponse.Builder::class)
@NoAutoDetect
class ProjectCommitListResponse
private constructor(
    private val _meta: JsonField<_Meta>,
    private val items: JsonField<List<Item>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun _meta(): _Meta = _meta.getRequired("_meta")

    fun items(): List<Item> = items.getRequired("items")

    @JsonProperty("_meta") @ExcludeMissing fun __meta() = _meta

    @JsonProperty("items") @ExcludeMissing fun _items() = items

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectCommitListResponse = apply {
        if (!validated) {
            _meta().validate()
            items().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectCommitListResponse &&
            this._meta == other._meta &&
            this.items == other.items &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    _meta,
                    items,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ProjectCommitListResponse{_meta=$_meta, items=$items, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var _meta: JsonField<_Meta> = JsonMissing.of()
        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectCommitListResponse: ProjectCommitListResponse) = apply {
            this._meta = projectCommitListResponse._meta
            this.items = projectCommitListResponse.items
            additionalProperties(projectCommitListResponse.additionalProperties)
        }

        fun _meta(_meta: _Meta) = _meta(JsonField.of(_meta))

        @JsonProperty("_meta")
        @ExcludeMissing
        fun _meta(_meta: JsonField<_Meta>) = apply { this._meta = _meta }

        fun items(items: List<Item>) = items(JsonField.of(items))

        @JsonProperty("items")
        @ExcludeMissing
        fun items(items: JsonField<List<Item>>) = apply { this.items = items }

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

        fun build(): ProjectCommitListResponse =
            ProjectCommitListResponse(
                _meta,
                items.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = _Meta.Builder::class)
    @NoAutoDetect
    class _Meta
    private constructor(
        private val page: JsonField<Long>,
        private val perPage: JsonField<Long>,
        private val totalItems: JsonField<Long>,
        private val totalPages: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The current page. */
        fun page(): Long = page.getRequired("page")

        /** The number of items per page. */
        fun perPage(): Long = perPage.getRequired("perPage")

        /** The total number of items. */
        fun totalItems(): Long = totalItems.getRequired("totalItems")

        /** The total number of pages. */
        fun totalPages(): Long = totalPages.getRequired("totalPages")

        /** The current page. */
        @JsonProperty("page") @ExcludeMissing fun _page() = page

        /** The number of items per page. */
        @JsonProperty("perPage") @ExcludeMissing fun _perPage() = perPage

        /** The total number of items. */
        @JsonProperty("totalItems") @ExcludeMissing fun _totalItems() = totalItems

        /** The total number of pages. */
        @JsonProperty("totalPages") @ExcludeMissing fun _totalPages() = totalPages

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): _Meta = apply {
            if (!validated) {
                page()
                perPage()
                totalItems()
                totalPages()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is _Meta &&
                this.page == other.page &&
                this.perPage == other.perPage &&
                this.totalItems == other.totalItems &&
                this.totalPages == other.totalPages &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        page,
                        perPage,
                        totalItems,
                        totalPages,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "_Meta{page=$page, perPage=$perPage, totalItems=$totalItems, totalPages=$totalPages, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var page: JsonField<Long> = JsonMissing.of()
            private var perPage: JsonField<Long> = JsonMissing.of()
            private var totalItems: JsonField<Long> = JsonMissing.of()
            private var totalPages: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(_meta: _Meta) = apply {
                this.page = _meta.page
                this.perPage = _meta.perPage
                this.totalItems = _meta.totalItems
                this.totalPages = _meta.totalPages
                additionalProperties(_meta.additionalProperties)
            }

            /** The current page. */
            fun page(page: Long) = page(JsonField.of(page))

            /** The current page. */
            @JsonProperty("page")
            @ExcludeMissing
            fun page(page: JsonField<Long>) = apply { this.page = page }

            /** The number of items per page. */
            fun perPage(perPage: Long) = perPage(JsonField.of(perPage))

            /** The number of items per page. */
            @JsonProperty("perPage")
            @ExcludeMissing
            fun perPage(perPage: JsonField<Long>) = apply { this.perPage = perPage }

            /** The total number of items. */
            fun totalItems(totalItems: Long) = totalItems(JsonField.of(totalItems))

            /** The total number of items. */
            @JsonProperty("totalItems")
            @ExcludeMissing
            fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

            /** The total number of pages. */
            fun totalPages(totalPages: Long) = totalPages(JsonField.of(totalPages))

            /** The total number of pages. */
            @JsonProperty("totalPages")
            @ExcludeMissing
            fun totalPages(totalPages: JsonField<Long>) = apply { this.totalPages = totalPages }

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

            fun build(): _Meta =
                _Meta(
                    page,
                    perPage,
                    totalItems,
                    totalPages,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(builder = Item.Builder::class)
    @NoAutoDetect
    class Item
    private constructor(
        private val id: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val statusMessage: JsonField<String>,
        private val projectId: JsonField<String>,
        private val storageUri: JsonField<String>,
        private val commit: JsonField<Commit>,
        private val deploymentStatus: JsonField<String>,
        private val mlModelId: JsonField<String>,
        private val validationDatasetId: JsonField<String>,
        private val trainingDatasetId: JsonField<String>,
        private val archived: JsonField<Boolean>,
        private val dateArchived: JsonField<OffsetDateTime>,
        private val passingGoalCount: JsonField<Long>,
        private val failingGoalCount: JsonField<Long>,
        private val totalGoalCount: JsonField<Long>,
        private val links: JsonField<Links>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The project version (commit) id. */
        fun id(): String = id.getRequired("id")

        /** The project version (commit) creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         */
        fun status(): Status = status.getRequired("status")

        /** The commit status message. */
        fun statusMessage(): Optional<String> =
            Optional.ofNullable(statusMessage.getNullable("statusMessage"))

        /** The project id. */
        fun projectId(): String = projectId.getRequired("projectId")

        /** The storage URI where the commit bundle is stored. */
        fun storageUri(): String = storageUri.getRequired("storageUri")

        /** The details of a commit (project version). */
        fun commit(): Commit = commit.getRequired("commit")

        /** The deployment status associated with the commit's model. */
        fun deploymentStatus(): Optional<String> =
            Optional.ofNullable(deploymentStatus.getNullable("deploymentStatus"))

        /** The model id. */
        fun mlModelId(): Optional<String> = Optional.ofNullable(mlModelId.getNullable("mlModelId"))

        /** The validation dataset id. */
        fun validationDatasetId(): Optional<String> =
            Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

        /** The training dataset id. */
        fun trainingDatasetId(): Optional<String> =
            Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

        /** Whether the commit is archived. */
        fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

        /** The commit archive date. */
        fun dateArchived(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateArchived.getNullable("dateArchived"))

        /** The number of tests that are passing for the commit. */
        fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

        /** The number of tests that are failing for the commit. */
        fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

        /** The total number of tests for the commit. */
        fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

        fun links(): Optional<Links> = Optional.ofNullable(links.getNullable("links"))

        /** The project version (commit) id. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The project version (commit) creation date. */
        @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

        /**
         * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
         * Finally, it can be `paused`, `failed`, or `completed`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** The commit status message. */
        @JsonProperty("statusMessage") @ExcludeMissing fun _statusMessage() = statusMessage

        /** The project id. */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId() = projectId

        /** The storage URI where the commit bundle is stored. */
        @JsonProperty("storageUri") @ExcludeMissing fun _storageUri() = storageUri

        /** The details of a commit (project version). */
        @JsonProperty("commit") @ExcludeMissing fun _commit() = commit

        /** The deployment status associated with the commit's model. */
        @JsonProperty("deploymentStatus") @ExcludeMissing fun _deploymentStatus() = deploymentStatus

        /** The model id. */
        @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId() = mlModelId

        /** The validation dataset id. */
        @JsonProperty("validationDatasetId")
        @ExcludeMissing
        fun _validationDatasetId() = validationDatasetId

        /** The training dataset id. */
        @JsonProperty("trainingDatasetId")
        @ExcludeMissing
        fun _trainingDatasetId() = trainingDatasetId

        /** Whether the commit is archived. */
        @JsonProperty("archived") @ExcludeMissing fun _archived() = archived

        /** The commit archive date. */
        @JsonProperty("dateArchived") @ExcludeMissing fun _dateArchived() = dateArchived

        /** The number of tests that are passing for the commit. */
        @JsonProperty("passingGoalCount") @ExcludeMissing fun _passingGoalCount() = passingGoalCount

        /** The number of tests that are failing for the commit. */
        @JsonProperty("failingGoalCount") @ExcludeMissing fun _failingGoalCount() = failingGoalCount

        /** The total number of tests for the commit. */
        @JsonProperty("totalGoalCount") @ExcludeMissing fun _totalGoalCount() = totalGoalCount

        @JsonProperty("links") @ExcludeMissing fun _links() = links

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Item = apply {
            if (!validated) {
                id()
                dateCreated()
                status()
                statusMessage()
                projectId()
                storageUri()
                commit().validate()
                deploymentStatus()
                mlModelId()
                validationDatasetId()
                trainingDatasetId()
                archived()
                dateArchived()
                passingGoalCount()
                failingGoalCount()
                totalGoalCount()
                links().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                this.id == other.id &&
                this.dateCreated == other.dateCreated &&
                this.status == other.status &&
                this.statusMessage == other.statusMessage &&
                this.projectId == other.projectId &&
                this.storageUri == other.storageUri &&
                this.commit == other.commit &&
                this.deploymentStatus == other.deploymentStatus &&
                this.mlModelId == other.mlModelId &&
                this.validationDatasetId == other.validationDatasetId &&
                this.trainingDatasetId == other.trainingDatasetId &&
                this.archived == other.archived &&
                this.dateArchived == other.dateArchived &&
                this.passingGoalCount == other.passingGoalCount &&
                this.failingGoalCount == other.failingGoalCount &&
                this.totalGoalCount == other.totalGoalCount &&
                this.links == other.links &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        dateCreated,
                        status,
                        statusMessage,
                        projectId,
                        storageUri,
                        commit,
                        deploymentStatus,
                        mlModelId,
                        validationDatasetId,
                        trainingDatasetId,
                        archived,
                        dateArchived,
                        passingGoalCount,
                        failingGoalCount,
                        totalGoalCount,
                        links,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Item{id=$id, dateCreated=$dateCreated, status=$status, statusMessage=$statusMessage, projectId=$projectId, storageUri=$storageUri, commit=$commit, deploymentStatus=$deploymentStatus, mlModelId=$mlModelId, validationDatasetId=$validationDatasetId, trainingDatasetId=$trainingDatasetId, archived=$archived, dateArchived=$dateArchived, passingGoalCount=$passingGoalCount, failingGoalCount=$failingGoalCount, totalGoalCount=$totalGoalCount, links=$links, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusMessage: JsonField<String> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var storageUri: JsonField<String> = JsonMissing.of()
            private var commit: JsonField<Commit> = JsonMissing.of()
            private var deploymentStatus: JsonField<String> = JsonMissing.of()
            private var mlModelId: JsonField<String> = JsonMissing.of()
            private var validationDatasetId: JsonField<String> = JsonMissing.of()
            private var trainingDatasetId: JsonField<String> = JsonMissing.of()
            private var archived: JsonField<Boolean> = JsonMissing.of()
            private var dateArchived: JsonField<OffsetDateTime> = JsonMissing.of()
            private var passingGoalCount: JsonField<Long> = JsonMissing.of()
            private var failingGoalCount: JsonField<Long> = JsonMissing.of()
            private var totalGoalCount: JsonField<Long> = JsonMissing.of()
            private var links: JsonField<Links> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                this.id = item.id
                this.dateCreated = item.dateCreated
                this.status = item.status
                this.statusMessage = item.statusMessage
                this.projectId = item.projectId
                this.storageUri = item.storageUri
                this.commit = item.commit
                this.deploymentStatus = item.deploymentStatus
                this.mlModelId = item.mlModelId
                this.validationDatasetId = item.validationDatasetId
                this.trainingDatasetId = item.trainingDatasetId
                this.archived = item.archived
                this.dateArchived = item.dateArchived
                this.passingGoalCount = item.passingGoalCount
                this.failingGoalCount = item.failingGoalCount
                this.totalGoalCount = item.totalGoalCount
                this.links = item.links
                additionalProperties(item.additionalProperties)
            }

            /** The project version (commit) id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The project version (commit) id. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The project version (commit) creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The project version (commit) creation date. */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /**
             * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
             * Finally, it can be `paused`, `failed`, or `completed`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * The commit status. Initially, the commit is `queued`, then, it switches to `running`.
             * Finally, it can be `paused`, `failed`, or `completed`.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The commit status message. */
            fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

            /** The commit status message. */
            @JsonProperty("statusMessage")
            @ExcludeMissing
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            /** The project id. */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** The project id. */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

            /** The storage URI where the commit bundle is stored. */
            @JsonProperty("storageUri")
            @ExcludeMissing
            fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

            /** The details of a commit (project version). */
            fun commit(commit: Commit) = commit(JsonField.of(commit))

            /** The details of a commit (project version). */
            @JsonProperty("commit")
            @ExcludeMissing
            fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

            /** The deployment status associated with the commit's model. */
            fun deploymentStatus(deploymentStatus: String) =
                deploymentStatus(JsonField.of(deploymentStatus))

            /** The deployment status associated with the commit's model. */
            @JsonProperty("deploymentStatus")
            @ExcludeMissing
            fun deploymentStatus(deploymentStatus: JsonField<String>) = apply {
                this.deploymentStatus = deploymentStatus
            }

            /** The model id. */
            fun mlModelId(mlModelId: String) = mlModelId(JsonField.of(mlModelId))

            /** The model id. */
            @JsonProperty("mlModelId")
            @ExcludeMissing
            fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

            /** The validation dataset id. */
            fun validationDatasetId(validationDatasetId: String) =
                validationDatasetId(JsonField.of(validationDatasetId))

            /** The validation dataset id. */
            @JsonProperty("validationDatasetId")
            @ExcludeMissing
            fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                this.validationDatasetId = validationDatasetId
            }

            /** The training dataset id. */
            fun trainingDatasetId(trainingDatasetId: String) =
                trainingDatasetId(JsonField.of(trainingDatasetId))

            /** The training dataset id. */
            @JsonProperty("trainingDatasetId")
            @ExcludeMissing
            fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
                this.trainingDatasetId = trainingDatasetId
            }

            /** Whether the commit is archived. */
            fun archived(archived: Boolean) = archived(JsonField.of(archived))

            /** Whether the commit is archived. */
            @JsonProperty("archived")
            @ExcludeMissing
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            /** The commit archive date. */
            fun dateArchived(dateArchived: OffsetDateTime) =
                dateArchived(JsonField.of(dateArchived))

            /** The commit archive date. */
            @JsonProperty("dateArchived")
            @ExcludeMissing
            fun dateArchived(dateArchived: JsonField<OffsetDateTime>) = apply {
                this.dateArchived = dateArchived
            }

            /** The number of tests that are passing for the commit. */
            fun passingGoalCount(passingGoalCount: Long) =
                passingGoalCount(JsonField.of(passingGoalCount))

            /** The number of tests that are passing for the commit. */
            @JsonProperty("passingGoalCount")
            @ExcludeMissing
            fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
                this.passingGoalCount = passingGoalCount
            }

            /** The number of tests that are failing for the commit. */
            fun failingGoalCount(failingGoalCount: Long) =
                failingGoalCount(JsonField.of(failingGoalCount))

            /** The number of tests that are failing for the commit. */
            @JsonProperty("failingGoalCount")
            @ExcludeMissing
            fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
                this.failingGoalCount = failingGoalCount
            }

            /** The total number of tests for the commit. */
            fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

            /** The total number of tests for the commit. */
            @JsonProperty("totalGoalCount")
            @ExcludeMissing
            fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
                this.totalGoalCount = totalGoalCount
            }

            fun links(links: Links) = links(JsonField.of(links))

            @JsonProperty("links")
            @ExcludeMissing
            fun links(links: JsonField<Links>) = apply { this.links = links }

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

            fun build(): Item =
                Item(
                    id,
                    dateCreated,
                    status,
                    statusMessage,
                    projectId,
                    storageUri,
                    commit,
                    deploymentStatus,
                    mlModelId,
                    validationDatasetId,
                    trainingDatasetId,
                    archived,
                    dateArchived,
                    passingGoalCount,
                    failingGoalCount,
                    totalGoalCount,
                    links,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** The details of a commit (project version). */
        @JsonDeserialize(builder = Commit.Builder::class)
        @NoAutoDetect
        class Commit
        private constructor(
            private val id: JsonField<String>,
            private val authorId: JsonField<String>,
            private val dateCreated: JsonField<OffsetDateTime>,
            private val fileSize: JsonField<Long>,
            private val message: JsonField<String>,
            private val mlModelId: JsonField<String>,
            private val validationDatasetId: JsonField<String>,
            private val trainingDatasetId: JsonField<String>,
            private val storageUri: JsonField<String>,
            private val gitCommitSha: JsonField<Long>,
            private val gitCommitRef: JsonField<String>,
            private val gitCommitUrl: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The commit id. */
            fun id(): String = id.getRequired("id")

            /** The author id of the commit. */
            fun authorId(): String = authorId.getRequired("authorId")

            /** The commit creation date. */
            fun dateCreated(): Optional<OffsetDateTime> =
                Optional.ofNullable(dateCreated.getNullable("dateCreated"))

            /** The size of the commit bundle in bytes. */
            fun fileSize(): Optional<Long> = Optional.ofNullable(fileSize.getNullable("fileSize"))

            /** The commit message. */
            fun message(): String = message.getRequired("message")

            /** The model id. */
            fun mlModelId(): Optional<String> =
                Optional.ofNullable(mlModelId.getNullable("mlModelId"))

            /** The validation dataset id. */
            fun validationDatasetId(): Optional<String> =
                Optional.ofNullable(validationDatasetId.getNullable("validationDatasetId"))

            /** The training dataset id. */
            fun trainingDatasetId(): Optional<String> =
                Optional.ofNullable(trainingDatasetId.getNullable("trainingDatasetId"))

            /** The storage URI where the commit bundle is stored. */
            fun storageUri(): String = storageUri.getRequired("storageUri")

            /** The SHA of the corresponding git commit. */
            fun gitCommitSha(): Optional<Long> =
                Optional.ofNullable(gitCommitSha.getNullable("gitCommitSha"))

            /** The ref of the corresponding git commit. */
            fun gitCommitRef(): Optional<String> =
                Optional.ofNullable(gitCommitRef.getNullable("gitCommitRef"))

            /** The URL of the corresponding git commit. */
            fun gitCommitUrl(): Optional<String> =
                Optional.ofNullable(gitCommitUrl.getNullable("gitCommitUrl"))

            /** The commit id. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The author id of the commit. */
            @JsonProperty("authorId") @ExcludeMissing fun _authorId() = authorId

            /** The commit creation date. */
            @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

            /** The size of the commit bundle in bytes. */
            @JsonProperty("fileSize") @ExcludeMissing fun _fileSize() = fileSize

            /** The commit message. */
            @JsonProperty("message") @ExcludeMissing fun _message() = message

            /** The model id. */
            @JsonProperty("mlModelId") @ExcludeMissing fun _mlModelId() = mlModelId

            /** The validation dataset id. */
            @JsonProperty("validationDatasetId")
            @ExcludeMissing
            fun _validationDatasetId() = validationDatasetId

            /** The training dataset id. */
            @JsonProperty("trainingDatasetId")
            @ExcludeMissing
            fun _trainingDatasetId() = trainingDatasetId

            /** The storage URI where the commit bundle is stored. */
            @JsonProperty("storageUri") @ExcludeMissing fun _storageUri() = storageUri

            /** The SHA of the corresponding git commit. */
            @JsonProperty("gitCommitSha") @ExcludeMissing fun _gitCommitSha() = gitCommitSha

            /** The ref of the corresponding git commit. */
            @JsonProperty("gitCommitRef") @ExcludeMissing fun _gitCommitRef() = gitCommitRef

            /** The URL of the corresponding git commit. */
            @JsonProperty("gitCommitUrl") @ExcludeMissing fun _gitCommitUrl() = gitCommitUrl

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Commit = apply {
                if (!validated) {
                    id()
                    authorId()
                    dateCreated()
                    fileSize()
                    message()
                    mlModelId()
                    validationDatasetId()
                    trainingDatasetId()
                    storageUri()
                    gitCommitSha()
                    gitCommitRef()
                    gitCommitUrl()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Commit &&
                    this.id == other.id &&
                    this.authorId == other.authorId &&
                    this.dateCreated == other.dateCreated &&
                    this.fileSize == other.fileSize &&
                    this.message == other.message &&
                    this.mlModelId == other.mlModelId &&
                    this.validationDatasetId == other.validationDatasetId &&
                    this.trainingDatasetId == other.trainingDatasetId &&
                    this.storageUri == other.storageUri &&
                    this.gitCommitSha == other.gitCommitSha &&
                    this.gitCommitRef == other.gitCommitRef &&
                    this.gitCommitUrl == other.gitCommitUrl &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            authorId,
                            dateCreated,
                            fileSize,
                            message,
                            mlModelId,
                            validationDatasetId,
                            trainingDatasetId,
                            storageUri,
                            gitCommitSha,
                            gitCommitRef,
                            gitCommitUrl,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Commit{id=$id, authorId=$authorId, dateCreated=$dateCreated, fileSize=$fileSize, message=$message, mlModelId=$mlModelId, validationDatasetId=$validationDatasetId, trainingDatasetId=$trainingDatasetId, storageUri=$storageUri, gitCommitSha=$gitCommitSha, gitCommitRef=$gitCommitRef, gitCommitUrl=$gitCommitUrl, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var authorId: JsonField<String> = JsonMissing.of()
                private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fileSize: JsonField<Long> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var mlModelId: JsonField<String> = JsonMissing.of()
                private var validationDatasetId: JsonField<String> = JsonMissing.of()
                private var trainingDatasetId: JsonField<String> = JsonMissing.of()
                private var storageUri: JsonField<String> = JsonMissing.of()
                private var gitCommitSha: JsonField<Long> = JsonMissing.of()
                private var gitCommitRef: JsonField<String> = JsonMissing.of()
                private var gitCommitUrl: JsonField<String> = JsonMissing.of()
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
                fun id(id: String) = id(JsonField.of(id))

                /** The commit id. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The author id of the commit. */
                fun authorId(authorId: String) = authorId(JsonField.of(authorId))

                /** The author id of the commit. */
                @JsonProperty("authorId")
                @ExcludeMissing
                fun authorId(authorId: JsonField<String>) = apply { this.authorId = authorId }

                /** The commit creation date. */
                fun dateCreated(dateCreated: OffsetDateTime) =
                    dateCreated(JsonField.of(dateCreated))

                /** The commit creation date. */
                @JsonProperty("dateCreated")
                @ExcludeMissing
                fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                    this.dateCreated = dateCreated
                }

                /** The size of the commit bundle in bytes. */
                fun fileSize(fileSize: Long) = fileSize(JsonField.of(fileSize))

                /** The size of the commit bundle in bytes. */
                @JsonProperty("fileSize")
                @ExcludeMissing
                fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

                /** The commit message. */
                fun message(message: String) = message(JsonField.of(message))

                /** The commit message. */
                @JsonProperty("message")
                @ExcludeMissing
                fun message(message: JsonField<String>) = apply { this.message = message }

                /** The model id. */
                fun mlModelId(mlModelId: String) = mlModelId(JsonField.of(mlModelId))

                /** The model id. */
                @JsonProperty("mlModelId")
                @ExcludeMissing
                fun mlModelId(mlModelId: JsonField<String>) = apply { this.mlModelId = mlModelId }

                /** The validation dataset id. */
                fun validationDatasetId(validationDatasetId: String) =
                    validationDatasetId(JsonField.of(validationDatasetId))

                /** The validation dataset id. */
                @JsonProperty("validationDatasetId")
                @ExcludeMissing
                fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                    this.validationDatasetId = validationDatasetId
                }

                /** The training dataset id. */
                fun trainingDatasetId(trainingDatasetId: String) =
                    trainingDatasetId(JsonField.of(trainingDatasetId))

                /** The training dataset id. */
                @JsonProperty("trainingDatasetId")
                @ExcludeMissing
                fun trainingDatasetId(trainingDatasetId: JsonField<String>) = apply {
                    this.trainingDatasetId = trainingDatasetId
                }

                /** The storage URI where the commit bundle is stored. */
                fun storageUri(storageUri: String) = storageUri(JsonField.of(storageUri))

                /** The storage URI where the commit bundle is stored. */
                @JsonProperty("storageUri")
                @ExcludeMissing
                fun storageUri(storageUri: JsonField<String>) = apply {
                    this.storageUri = storageUri
                }

                /** The SHA of the corresponding git commit. */
                fun gitCommitSha(gitCommitSha: Long) = gitCommitSha(JsonField.of(gitCommitSha))

                /** The SHA of the corresponding git commit. */
                @JsonProperty("gitCommitSha")
                @ExcludeMissing
                fun gitCommitSha(gitCommitSha: JsonField<Long>) = apply {
                    this.gitCommitSha = gitCommitSha
                }

                /** The ref of the corresponding git commit. */
                fun gitCommitRef(gitCommitRef: String) = gitCommitRef(JsonField.of(gitCommitRef))

                /** The ref of the corresponding git commit. */
                @JsonProperty("gitCommitRef")
                @ExcludeMissing
                fun gitCommitRef(gitCommitRef: JsonField<String>) = apply {
                    this.gitCommitRef = gitCommitRef
                }

                /** The URL of the corresponding git commit. */
                fun gitCommitUrl(gitCommitUrl: String) = gitCommitUrl(JsonField.of(gitCommitUrl))

                /** The URL of the corresponding git commit. */
                @JsonProperty("gitCommitUrl")
                @ExcludeMissing
                fun gitCommitUrl(gitCommitUrl: JsonField<String>) = apply {
                    this.gitCommitUrl = gitCommitUrl
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Commit =
                    Commit(
                        id,
                        authorId,
                        dateCreated,
                        fileSize,
                        message,
                        mlModelId,
                        validationDatasetId,
                        trainingDatasetId,
                        storageUri,
                        gitCommitSha,
                        gitCommitRef,
                        gitCommitUrl,
                        additionalProperties.toUnmodifiable(),
                    )
            }
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

                return other is Status && this.value == other.value
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
            private val app: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun app(): String = app.getRequired("app")

            @JsonProperty("app") @ExcludeMissing fun _app() = app

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Links = apply {
                if (!validated) {
                    app()
                    validated = true
                }
            }

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

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var app: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    this.app = links.app
                    additionalProperties(links.additionalProperties)
                }

                fun app(app: String) = app(JsonField.of(app))

                @JsonProperty("app")
                @ExcludeMissing
                fun app(app: JsonField<String>) = apply { this.app = app }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Links = Links(app, additionalProperties.toUnmodifiable())
            }
        }
    }
}
