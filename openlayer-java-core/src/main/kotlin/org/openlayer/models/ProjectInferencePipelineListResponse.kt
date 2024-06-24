// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import org.openlayer.core.Enum
import org.openlayer.core.ExcludeMissing
import org.openlayer.core.JsonField
import org.openlayer.core.JsonMissing
import org.openlayer.core.JsonValue
import org.openlayer.core.NoAutoDetect
import org.openlayer.core.toUnmodifiable
import org.openlayer.errors.OpenlayerInvalidDataException

@JsonDeserialize(builder = ProjectInferencePipelineListResponse.Builder::class)
@NoAutoDetect
class ProjectInferencePipelineListResponse
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

    fun validate(): ProjectInferencePipelineListResponse = apply {
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

        return other is ProjectInferencePipelineListResponse &&
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
        "ProjectInferencePipelineListResponse{_meta=$_meta, items=$items, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var _meta: JsonField<_Meta> = JsonMissing.of()
        private var items: JsonField<List<Item>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            projectInferencePipelineListResponse: ProjectInferencePipelineListResponse
        ) = apply {
            this._meta = projectInferencePipelineListResponse._meta
            this.items = projectInferencePipelineListResponse.items
            additionalProperties(projectInferencePipelineListResponse.additionalProperties)
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

        fun build(): ProjectInferencePipelineListResponse =
            ProjectInferencePipelineListResponse(
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
        private val projectId: JsonField<String>,
        private val name: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val dateLastSampleReceived: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val dateLastEvaluated: JsonField<OffsetDateTime>,
        private val dateOfNextEvaluation: JsonField<OffsetDateTime>,
        private val passingGoalCount: JsonField<Long>,
        private val failingGoalCount: JsonField<Long>,
        private val totalGoalCount: JsonField<Long>,
        private val referenceDatasetUri: JsonField<String>,
        private val status: JsonField<Status>,
        private val statusMessage: JsonField<String>,
        private val storageType: JsonField<StorageType>,
        private val links: JsonField<Links>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The inference pipeline id. */
        fun id(): String = id.getRequired("id")

        /** The project id. */
        fun projectId(): String = projectId.getRequired("projectId")

        /** The inference pipeline name. */
        fun name(): String = name.getRequired("name")

        /** The creation date. */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /** The last updated date. */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /** The last data sample received date. */
        fun dateLastSampleReceived(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateLastSampleReceived.getNullable("dateLastSampleReceived"))

        /** The inference pipeline description. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The last test evaluation date. */
        fun dateLastEvaluated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateLastEvaluated.getNullable("dateLastEvaluated"))

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
            Optional.ofNullable(dateOfNextEvaluation.getNullable("dateOfNextEvaluation"))

        /** The number of tests passing. */
        fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

        /** The number of tests failing. */
        fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

        /** The total number of tests. */
        fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

        /** The reference dataset URI. */
        fun referenceDatasetUri(): Optional<String> =
            Optional.ofNullable(referenceDatasetUri.getNullable("referenceDatasetUri"))

        /** The status of test evaluation for the inference pipeline. */
        fun status(): Status = status.getRequired("status")

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(): Optional<String> =
            Optional.ofNullable(statusMessage.getNullable("statusMessage"))

        /** The storage type. */
        fun storageType(): Optional<StorageType> =
            Optional.ofNullable(storageType.getNullable("storageType"))

        fun links(): Links = links.getRequired("links")

        /** The inference pipeline id. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The project id. */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId() = projectId

        /** The inference pipeline name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The creation date. */
        @JsonProperty("dateCreated") @ExcludeMissing fun _dateCreated() = dateCreated

        /** The last updated date. */
        @JsonProperty("dateUpdated") @ExcludeMissing fun _dateUpdated() = dateUpdated

        /** The last data sample received date. */
        @JsonProperty("dateLastSampleReceived")
        @ExcludeMissing
        fun _dateLastSampleReceived() = dateLastSampleReceived

        /** The inference pipeline description. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The last test evaluation date. */
        @JsonProperty("dateLastEvaluated")
        @ExcludeMissing
        fun _dateLastEvaluated() = dateLastEvaluated

        /** The next test evaluation date. */
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        fun _dateOfNextEvaluation() = dateOfNextEvaluation

        /** The number of tests passing. */
        @JsonProperty("passingGoalCount") @ExcludeMissing fun _passingGoalCount() = passingGoalCount

        /** The number of tests failing. */
        @JsonProperty("failingGoalCount") @ExcludeMissing fun _failingGoalCount() = failingGoalCount

        /** The total number of tests. */
        @JsonProperty("totalGoalCount") @ExcludeMissing fun _totalGoalCount() = totalGoalCount

        /** The reference dataset URI. */
        @JsonProperty("referenceDatasetUri")
        @ExcludeMissing
        fun _referenceDatasetUri() = referenceDatasetUri

        /** The status of test evaluation for the inference pipeline. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /** The status message of test evaluation for the inference pipeline. */
        @JsonProperty("statusMessage") @ExcludeMissing fun _statusMessage() = statusMessage

        /** The storage type. */
        @JsonProperty("storageType") @ExcludeMissing fun _storageType() = storageType

        @JsonProperty("links") @ExcludeMissing fun _links() = links

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Item = apply {
            if (!validated) {
                id()
                projectId()
                name()
                dateCreated()
                dateUpdated()
                dateLastSampleReceived()
                description()
                dateLastEvaluated()
                dateOfNextEvaluation()
                passingGoalCount()
                failingGoalCount()
                totalGoalCount()
                referenceDatasetUri()
                status()
                statusMessage()
                storageType()
                links().validate()
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
                this.projectId == other.projectId &&
                this.name == other.name &&
                this.dateCreated == other.dateCreated &&
                this.dateUpdated == other.dateUpdated &&
                this.dateLastSampleReceived == other.dateLastSampleReceived &&
                this.description == other.description &&
                this.dateLastEvaluated == other.dateLastEvaluated &&
                this.dateOfNextEvaluation == other.dateOfNextEvaluation &&
                this.passingGoalCount == other.passingGoalCount &&
                this.failingGoalCount == other.failingGoalCount &&
                this.totalGoalCount == other.totalGoalCount &&
                this.referenceDatasetUri == other.referenceDatasetUri &&
                this.status == other.status &&
                this.statusMessage == other.statusMessage &&
                this.storageType == other.storageType &&
                this.links == other.links &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        projectId,
                        name,
                        dateCreated,
                        dateUpdated,
                        dateLastSampleReceived,
                        description,
                        dateLastEvaluated,
                        dateOfNextEvaluation,
                        passingGoalCount,
                        failingGoalCount,
                        totalGoalCount,
                        referenceDatasetUri,
                        status,
                        statusMessage,
                        storageType,
                        links,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Item{id=$id, projectId=$projectId, name=$name, dateCreated=$dateCreated, dateUpdated=$dateUpdated, dateLastSampleReceived=$dateLastSampleReceived, description=$description, dateLastEvaluated=$dateLastEvaluated, dateOfNextEvaluation=$dateOfNextEvaluation, passingGoalCount=$passingGoalCount, failingGoalCount=$failingGoalCount, totalGoalCount=$totalGoalCount, referenceDatasetUri=$referenceDatasetUri, status=$status, statusMessage=$statusMessage, storageType=$storageType, links=$links, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateLastSampleReceived: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of()
            private var passingGoalCount: JsonField<Long> = JsonMissing.of()
            private var failingGoalCount: JsonField<Long> = JsonMissing.of()
            private var totalGoalCount: JsonField<Long> = JsonMissing.of()
            private var referenceDatasetUri: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var statusMessage: JsonField<String> = JsonMissing.of()
            private var storageType: JsonField<StorageType> = JsonMissing.of()
            private var links: JsonField<Links> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                this.id = item.id
                this.projectId = item.projectId
                this.name = item.name
                this.dateCreated = item.dateCreated
                this.dateUpdated = item.dateUpdated
                this.dateLastSampleReceived = item.dateLastSampleReceived
                this.description = item.description
                this.dateLastEvaluated = item.dateLastEvaluated
                this.dateOfNextEvaluation = item.dateOfNextEvaluation
                this.passingGoalCount = item.passingGoalCount
                this.failingGoalCount = item.failingGoalCount
                this.totalGoalCount = item.totalGoalCount
                this.referenceDatasetUri = item.referenceDatasetUri
                this.status = item.status
                this.statusMessage = item.statusMessage
                this.storageType = item.storageType
                this.links = item.links
                additionalProperties(item.additionalProperties)
            }

            /** The inference pipeline id. */
            fun id(id: String) = id(JsonField.of(id))

            /** The inference pipeline id. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The project id. */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /** The project id. */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            /** The inference pipeline name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The inference pipeline name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /** The creation date. */
            @JsonProperty("dateCreated")
            @ExcludeMissing
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /** The last updated date. */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The last data sample received date. */
            fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime) =
                dateLastSampleReceived(JsonField.of(dateLastSampleReceived))

            /** The last data sample received date. */
            @JsonProperty("dateLastSampleReceived")
            @ExcludeMissing
            fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
                this.dateLastSampleReceived = dateLastSampleReceived
            }

            /** The inference pipeline description. */
            fun description(description: String) = description(JsonField.of(description))

            /** The inference pipeline description. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The last test evaluation date. */
            fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime) =
                dateLastEvaluated(JsonField.of(dateLastEvaluated))

            /** The last test evaluation date. */
            @JsonProperty("dateLastEvaluated")
            @ExcludeMissing
            fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
                this.dateLastEvaluated = dateLastEvaluated
            }

            /** The next test evaluation date. */
            fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime) =
                dateOfNextEvaluation(JsonField.of(dateOfNextEvaluation))

            /** The next test evaluation date. */
            @JsonProperty("dateOfNextEvaluation")
            @ExcludeMissing
            fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
                this.dateOfNextEvaluation = dateOfNextEvaluation
            }

            /** The number of tests passing. */
            fun passingGoalCount(passingGoalCount: Long) =
                passingGoalCount(JsonField.of(passingGoalCount))

            /** The number of tests passing. */
            @JsonProperty("passingGoalCount")
            @ExcludeMissing
            fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
                this.passingGoalCount = passingGoalCount
            }

            /** The number of tests failing. */
            fun failingGoalCount(failingGoalCount: Long) =
                failingGoalCount(JsonField.of(failingGoalCount))

            /** The number of tests failing. */
            @JsonProperty("failingGoalCount")
            @ExcludeMissing
            fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
                this.failingGoalCount = failingGoalCount
            }

            /** The total number of tests. */
            fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

            /** The total number of tests. */
            @JsonProperty("totalGoalCount")
            @ExcludeMissing
            fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
                this.totalGoalCount = totalGoalCount
            }

            /** The reference dataset URI. */
            fun referenceDatasetUri(referenceDatasetUri: String) =
                referenceDatasetUri(JsonField.of(referenceDatasetUri))

            /** The reference dataset URI. */
            @JsonProperty("referenceDatasetUri")
            @ExcludeMissing
            fun referenceDatasetUri(referenceDatasetUri: JsonField<String>) = apply {
                this.referenceDatasetUri = referenceDatasetUri
            }

            /** The status of test evaluation for the inference pipeline. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of test evaluation for the inference pipeline. */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The status message of test evaluation for the inference pipeline. */
            fun statusMessage(statusMessage: String) = statusMessage(JsonField.of(statusMessage))

            /** The status message of test evaluation for the inference pipeline. */
            @JsonProperty("statusMessage")
            @ExcludeMissing
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            /** The storage type. */
            fun storageType(storageType: StorageType) = storageType(JsonField.of(storageType))

            /** The storage type. */
            @JsonProperty("storageType")
            @ExcludeMissing
            fun storageType(storageType: JsonField<StorageType>) = apply {
                this.storageType = storageType
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
                    projectId,
                    name,
                    dateCreated,
                    dateUpdated,
                    dateLastSampleReceived,
                    description,
                    dateLastEvaluated,
                    dateOfNextEvaluation,
                    passingGoalCount,
                    failingGoalCount,
                    totalGoalCount,
                    referenceDatasetUri,
                    status,
                    statusMessage,
                    storageType,
                    links,
                    additionalProperties.toUnmodifiable(),
                )
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

        class StorageType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StorageType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val LOCAL = StorageType(JsonField.of("local"))

                @JvmField val S3 = StorageType(JsonField.of("s3"))

                @JvmField val GCS = StorageType(JsonField.of("gcs"))

                @JvmField val AZURE = StorageType(JsonField.of("azure"))

                @JvmStatic fun of(value: String) = StorageType(JsonField.of(value))
            }

            enum class Known {
                LOCAL,
                S3,
                GCS,
                AZURE,
            }

            enum class Value {
                LOCAL,
                S3,
                GCS,
                AZURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LOCAL -> Value.LOCAL
                    S3 -> Value.S3
                    GCS -> Value.GCS
                    AZURE -> Value.AZURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LOCAL -> Known.LOCAL
                    S3 -> Known.S3
                    GCS -> Known.GCS
                    AZURE -> Known.AZURE
                    else -> throw OpenlayerInvalidDataException("Unknown StorageType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
