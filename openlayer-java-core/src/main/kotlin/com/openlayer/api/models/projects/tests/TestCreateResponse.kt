// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.allMaxBy
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TestCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val commentCount: JsonField<Long>,
    private val creatorId: JsonField<String>,
    private val dateArchived: JsonField<OffsetDateTime>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val description: JsonValue,
    private val name: JsonField<String>,
    private val number: JsonField<Long>,
    private val originProjectVersionId: JsonField<String>,
    private val subtype: JsonField<String>,
    private val suggested: JsonField<Boolean>,
    private val thresholds: JsonField<List<Threshold>>,
    private val type: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val delayWindow: JsonField<Double>,
    private val evaluationWindow: JsonField<Double>,
    private val usesMlModel: JsonField<Boolean>,
    private val usesProductionData: JsonField<Boolean>,
    private val usesReferenceDataset: JsonField<Boolean>,
    private val usesTrainingDataset: JsonField<Boolean>,
    private val usesValidationDataset: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commentCount")
        @ExcludeMissing
        commentCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creatorId") @ExcludeMissing creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateArchived")
        @ExcludeMissing
        dateArchived: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description") @ExcludeMissing description: JsonValue = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number") @ExcludeMissing number: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("originProjectVersionId")
        @ExcludeMissing
        originProjectVersionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subtype") @ExcludeMissing subtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suggested") @ExcludeMissing suggested: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("thresholds")
        @ExcludeMissing
        thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("delayWindow")
        @ExcludeMissing
        delayWindow: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("evaluationWindow")
        @ExcludeMissing
        evaluationWindow: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("usesMlModel")
        @ExcludeMissing
        usesMlModel: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesProductionData")
        @ExcludeMissing
        usesProductionData: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesReferenceDataset")
        @ExcludeMissing
        usesReferenceDataset: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesTrainingDataset")
        @ExcludeMissing
        usesTrainingDataset: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usesValidationDataset")
        @ExcludeMissing
        usesValidationDataset: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        commentCount,
        creatorId,
        dateArchived,
        dateCreated,
        dateUpdated,
        description,
        name,
        number,
        originProjectVersionId,
        subtype,
        suggested,
        thresholds,
        type,
        archived,
        delayWindow,
        evaluationWindow,
        usesMlModel,
        usesProductionData,
        usesReferenceDataset,
        usesTrainingDataset,
        usesValidationDataset,
        mutableMapOf(),
    )

    /**
     * The test id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The number of comments on the test.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commentCount(): Long = commentCount.getRequired("commentCount")

    /**
     * The test creator id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

    /**
     * The date the test was archived.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateArchived(): Optional<OffsetDateTime> = dateArchived.getOptional("dateArchived")

    /**
     * The creation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /**
     * The last updated date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /** The test description. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonValue = description

    /**
     * The test name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The test number.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun number(): Long = number.getRequired("number")

    /**
     * The project version (commit) id where the test was created.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originProjectVersionId(): Optional<String> =
        originProjectVersionId.getOptional("originProjectVersionId")

    /**
     * The test subtype.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subtype(): String = subtype.getRequired("subtype")

    /**
     * Whether the test is suggested or user-created.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun suggested(): Boolean = suggested.getRequired("suggested")

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

    /**
     * The test type.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Whether the test is archived.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * The delay window in seconds. Only applies to tests that use production data.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun delayWindow(): Optional<Double> = delayWindow.getOptional("delayWindow")

    /**
     * The evaluation window in seconds. Only applies to tests that use production data.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationWindow(): Optional<Double> = evaluationWindow.getOptional("evaluationWindow")

    /**
     * Whether the test uses an ML model.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesMlModel(): Optional<Boolean> = usesMlModel.getOptional("usesMlModel")

    /**
     * Whether the test uses production data (monitoring mode only).
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesProductionData(): Optional<Boolean> =
        usesProductionData.getOptional("usesProductionData")

    /**
     * Whether the test uses a reference dataset (monitoring mode only).
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesReferenceDataset(): Optional<Boolean> =
        usesReferenceDataset.getOptional("usesReferenceDataset")

    /**
     * Whether the test uses a training dataset.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesTrainingDataset(): Optional<Boolean> =
        usesTrainingDataset.getOptional("usesTrainingDataset")

    /**
     * Whether the test uses a validation dataset.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usesValidationDataset(): Optional<Boolean> =
        usesValidationDataset.getOptional("usesValidationDataset")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [commentCount].
     *
     * Unlike [commentCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commentCount")
    @ExcludeMissing
    fun _commentCount(): JsonField<Long> = commentCount

    /**
     * Returns the raw JSON value of [creatorId].
     *
     * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

    /**
     * Returns the raw JSON value of [dateArchived].
     *
     * Unlike [dateArchived], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateUpdated")
    @ExcludeMissing
    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [number].
     *
     * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<Long> = number

    /**
     * Returns the raw JSON value of [originProjectVersionId].
     *
     * Unlike [originProjectVersionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originProjectVersionId")
    @ExcludeMissing
    fun _originProjectVersionId(): JsonField<String> = originProjectVersionId

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtype") @ExcludeMissing fun _subtype(): JsonField<String> = subtype

    /**
     * Returns the raw JSON value of [suggested].
     *
     * Unlike [suggested], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suggested") @ExcludeMissing fun _suggested(): JsonField<Boolean> = suggested

    /**
     * Returns the raw JSON value of [thresholds].
     *
     * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thresholds")
    @ExcludeMissing
    fun _thresholds(): JsonField<List<Threshold>> = thresholds

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [delayWindow].
     *
     * Unlike [delayWindow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delayWindow") @ExcludeMissing fun _delayWindow(): JsonField<Double> = delayWindow

    /**
     * Returns the raw JSON value of [evaluationWindow].
     *
     * Unlike [evaluationWindow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluationWindow")
    @ExcludeMissing
    fun _evaluationWindow(): JsonField<Double> = evaluationWindow

    /**
     * Returns the raw JSON value of [usesMlModel].
     *
     * Unlike [usesMlModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usesMlModel")
    @ExcludeMissing
    fun _usesMlModel(): JsonField<Boolean> = usesMlModel

    /**
     * Returns the raw JSON value of [usesProductionData].
     *
     * Unlike [usesProductionData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usesProductionData")
    @ExcludeMissing
    fun _usesProductionData(): JsonField<Boolean> = usesProductionData

    /**
     * Returns the raw JSON value of [usesReferenceDataset].
     *
     * Unlike [usesReferenceDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usesReferenceDataset")
    @ExcludeMissing
    fun _usesReferenceDataset(): JsonField<Boolean> = usesReferenceDataset

    /**
     * Returns the raw JSON value of [usesTrainingDataset].
     *
     * Unlike [usesTrainingDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usesTrainingDataset")
    @ExcludeMissing
    fun _usesTrainingDataset(): JsonField<Boolean> = usesTrainingDataset

    /**
     * Returns the raw JSON value of [usesValidationDataset].
     *
     * Unlike [usesValidationDataset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usesValidationDataset")
    @ExcludeMissing
    fun _usesValidationDataset(): JsonField<Boolean> = usesValidationDataset

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commentCount()
         * .creatorId()
         * .dateArchived()
         * .dateCreated()
         * .dateUpdated()
         * .description()
         * .name()
         * .number()
         * .originProjectVersionId()
         * .subtype()
         * .suggested()
         * .thresholds()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var commentCount: JsonField<Long>? = null
        private var creatorId: JsonField<String>? = null
        private var dateArchived: JsonField<OffsetDateTime>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var description: JsonValue? = null
        private var name: JsonField<String>? = null
        private var number: JsonField<Long>? = null
        private var originProjectVersionId: JsonField<String>? = null
        private var subtype: JsonField<String>? = null
        private var suggested: JsonField<Boolean>? = null
        private var thresholds: JsonField<MutableList<Threshold>>? = null
        private var type: JsonField<String>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var delayWindow: JsonField<Double> = JsonMissing.of()
        private var evaluationWindow: JsonField<Double> = JsonMissing.of()
        private var usesMlModel: JsonField<Boolean> = JsonMissing.of()
        private var usesProductionData: JsonField<Boolean> = JsonMissing.of()
        private var usesReferenceDataset: JsonField<Boolean> = JsonMissing.of()
        private var usesTrainingDataset: JsonField<Boolean> = JsonMissing.of()
        private var usesValidationDataset: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(testCreateResponse: TestCreateResponse) = apply {
            id = testCreateResponse.id
            commentCount = testCreateResponse.commentCount
            creatorId = testCreateResponse.creatorId
            dateArchived = testCreateResponse.dateArchived
            dateCreated = testCreateResponse.dateCreated
            dateUpdated = testCreateResponse.dateUpdated
            description = testCreateResponse.description
            name = testCreateResponse.name
            number = testCreateResponse.number
            originProjectVersionId = testCreateResponse.originProjectVersionId
            subtype = testCreateResponse.subtype
            suggested = testCreateResponse.suggested
            thresholds = testCreateResponse.thresholds.map { it.toMutableList() }
            type = testCreateResponse.type
            archived = testCreateResponse.archived
            delayWindow = testCreateResponse.delayWindow
            evaluationWindow = testCreateResponse.evaluationWindow
            usesMlModel = testCreateResponse.usesMlModel
            usesProductionData = testCreateResponse.usesProductionData
            usesReferenceDataset = testCreateResponse.usesReferenceDataset
            usesTrainingDataset = testCreateResponse.usesTrainingDataset
            usesValidationDataset = testCreateResponse.usesValidationDataset
            additionalProperties = testCreateResponse.additionalProperties.toMutableMap()
        }

        /** The test id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The number of comments on the test. */
        fun commentCount(commentCount: Long) = commentCount(JsonField.of(commentCount))

        /**
         * Sets [Builder.commentCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commentCount(commentCount: JsonField<Long>) = apply { this.commentCount = commentCount }

        /** The test creator id. */
        fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

        /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
        fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

        /**
         * Sets [Builder.creatorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

        /** The date the test was archived. */
        fun dateArchived(dateArchived: OffsetDateTime?) =
            dateArchived(JsonField.ofNullable(dateArchived))

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
            this.dateArchived = dateArchived
        }

        /** The creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            this.dateCreated = dateCreated
        }

        /** The last updated date. */
        fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            this.dateUpdated = dateUpdated
        }

        /** The test description. */
        fun description(description: JsonValue) = apply { this.description = description }

        /** The test name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The test number. */
        fun number(number: Long) = number(JsonField.of(number))

        /**
         * Sets [Builder.number] to an arbitrary JSON value.
         *
         * You should usually call [Builder.number] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun number(number: JsonField<Long>) = apply { this.number = number }

        /** The project version (commit) id where the test was created. */
        fun originProjectVersionId(originProjectVersionId: String?) =
            originProjectVersionId(JsonField.ofNullable(originProjectVersionId))

        /**
         * Alias for calling [Builder.originProjectVersionId] with
         * `originProjectVersionId.orElse(null)`.
         */
        fun originProjectVersionId(originProjectVersionId: Optional<String>) =
            originProjectVersionId(originProjectVersionId.getOrNull())

        /**
         * Sets [Builder.originProjectVersionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originProjectVersionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originProjectVersionId(originProjectVersionId: JsonField<String>) = apply {
            this.originProjectVersionId = originProjectVersionId
        }

        /** The test subtype. */
        fun subtype(subtype: String) = subtype(JsonField.of(subtype))

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

        /** Whether the test is suggested or user-created. */
        fun suggested(suggested: Boolean) = suggested(JsonField.of(suggested))

        /**
         * Sets [Builder.suggested] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suggested] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun suggested(suggested: JsonField<Boolean>) = apply { this.suggested = suggested }

        fun thresholds(thresholds: List<Threshold>) = thresholds(JsonField.of(thresholds))

        /**
         * Sets [Builder.thresholds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
            this.thresholds = thresholds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Threshold] to [thresholds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThreshold(threshold: Threshold) = apply {
            thresholds =
                (thresholds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thresholds", it).add(threshold)
                }
        }

        /** The test type. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /** Whether the test is archived. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The delay window in seconds. Only applies to tests that use production data. */
        fun delayWindow(delayWindow: Double?) = delayWindow(JsonField.ofNullable(delayWindow))

        /**
         * Alias for [Builder.delayWindow].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun delayWindow(delayWindow: Double) = delayWindow(delayWindow as Double?)

        /** Alias for calling [Builder.delayWindow] with `delayWindow.orElse(null)`. */
        fun delayWindow(delayWindow: Optional<Double>) = delayWindow(delayWindow.getOrNull())

        /**
         * Sets [Builder.delayWindow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delayWindow] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun delayWindow(delayWindow: JsonField<Double>) = apply { this.delayWindow = delayWindow }

        /** The evaluation window in seconds. Only applies to tests that use production data. */
        fun evaluationWindow(evaluationWindow: Double?) =
            evaluationWindow(JsonField.ofNullable(evaluationWindow))

        /**
         * Alias for [Builder.evaluationWindow].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun evaluationWindow(evaluationWindow: Double) =
            evaluationWindow(evaluationWindow as Double?)

        /** Alias for calling [Builder.evaluationWindow] with `evaluationWindow.orElse(null)`. */
        fun evaluationWindow(evaluationWindow: Optional<Double>) =
            evaluationWindow(evaluationWindow.getOrNull())

        /**
         * Sets [Builder.evaluationWindow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationWindow] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluationWindow(evaluationWindow: JsonField<Double>) = apply {
            this.evaluationWindow = evaluationWindow
        }

        /** Whether the test uses an ML model. */
        fun usesMlModel(usesMlModel: Boolean) = usesMlModel(JsonField.of(usesMlModel))

        /**
         * Sets [Builder.usesMlModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesMlModel] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usesMlModel(usesMlModel: JsonField<Boolean>) = apply { this.usesMlModel = usesMlModel }

        /** Whether the test uses production data (monitoring mode only). */
        fun usesProductionData(usesProductionData: Boolean) =
            usesProductionData(JsonField.of(usesProductionData))

        /**
         * Sets [Builder.usesProductionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesProductionData] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usesProductionData(usesProductionData: JsonField<Boolean>) = apply {
            this.usesProductionData = usesProductionData
        }

        /** Whether the test uses a reference dataset (monitoring mode only). */
        fun usesReferenceDataset(usesReferenceDataset: Boolean) =
            usesReferenceDataset(JsonField.of(usesReferenceDataset))

        /**
         * Sets [Builder.usesReferenceDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesReferenceDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usesReferenceDataset(usesReferenceDataset: JsonField<Boolean>) = apply {
            this.usesReferenceDataset = usesReferenceDataset
        }

        /** Whether the test uses a training dataset. */
        fun usesTrainingDataset(usesTrainingDataset: Boolean) =
            usesTrainingDataset(JsonField.of(usesTrainingDataset))

        /**
         * Sets [Builder.usesTrainingDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesTrainingDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usesTrainingDataset(usesTrainingDataset: JsonField<Boolean>) = apply {
            this.usesTrainingDataset = usesTrainingDataset
        }

        /** Whether the test uses a validation dataset. */
        fun usesValidationDataset(usesValidationDataset: Boolean) =
            usesValidationDataset(JsonField.of(usesValidationDataset))

        /**
         * Sets [Builder.usesValidationDataset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usesValidationDataset] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usesValidationDataset(usesValidationDataset: JsonField<Boolean>) = apply {
            this.usesValidationDataset = usesValidationDataset
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

        /**
         * Returns an immutable instance of [TestCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .commentCount()
         * .creatorId()
         * .dateArchived()
         * .dateCreated()
         * .dateUpdated()
         * .description()
         * .name()
         * .number()
         * .originProjectVersionId()
         * .subtype()
         * .suggested()
         * .thresholds()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestCreateResponse =
            TestCreateResponse(
                checkRequired("id", id),
                checkRequired("commentCount", commentCount),
                checkRequired("creatorId", creatorId),
                checkRequired("dateArchived", dateArchived),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("number", number),
                checkRequired("originProjectVersionId", originProjectVersionId),
                checkRequired("subtype", subtype),
                checkRequired("suggested", suggested),
                checkRequired("thresholds", thresholds).map { it.toImmutable() },
                checkRequired("type", type),
                archived,
                delayWindow,
                evaluationWindow,
                usesMlModel,
                usesProductionData,
                usesReferenceDataset,
                usesTrainingDataset,
                usesValidationDataset,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TestCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        commentCount()
        creatorId()
        dateArchived()
        dateCreated()
        dateUpdated()
        name()
        number()
        originProjectVersionId()
        subtype()
        suggested()
        thresholds().forEach { it.validate() }
        type()
        archived()
        delayWindow()
        evaluationWindow()
        usesMlModel()
        usesProductionData()
        usesReferenceDataset()
        usesTrainingDataset()
        usesValidationDataset()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OpenlayerInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (commentCount.asKnown().isPresent) 1 else 0) +
            (if (creatorId.asKnown().isPresent) 1 else 0) +
            (if (dateArchived.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (number.asKnown().isPresent) 1 else 0) +
            (if (originProjectVersionId.asKnown().isPresent) 1 else 0) +
            (if (subtype.asKnown().isPresent) 1 else 0) +
            (if (suggested.asKnown().isPresent) 1 else 0) +
            (thresholds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (delayWindow.asKnown().isPresent) 1 else 0) +
            (if (evaluationWindow.asKnown().isPresent) 1 else 0) +
            (if (usesMlModel.asKnown().isPresent) 1 else 0) +
            (if (usesProductionData.asKnown().isPresent) 1 else 0) +
            (if (usesReferenceDataset.asKnown().isPresent) 1 else 0) +
            (if (usesTrainingDataset.asKnown().isPresent) 1 else 0) +
            (if (usesValidationDataset.asKnown().isPresent) 1 else 0)

    class Threshold
    private constructor(
        private val insightName: JsonField<String>,
        private val insightParameters: JsonField<List<InsightParameter>>,
        private val measurement: JsonField<String>,
        private val operator: JsonField<Operator>,
        private val thresholdMode: JsonField<ThresholdMode>,
        private val value: JsonField<Value>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("insightName")
            @ExcludeMissing
            insightName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("insightParameters")
            @ExcludeMissing
            insightParameters: JsonField<List<InsightParameter>> = JsonMissing.of(),
            @JsonProperty("measurement")
            @ExcludeMissing
            measurement: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("thresholdMode")
            @ExcludeMissing
            thresholdMode: JsonField<ThresholdMode> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        ) : this(
            insightName,
            insightParameters,
            measurement,
            operator,
            thresholdMode,
            value,
            mutableMapOf(),
        )

        /**
         * The insight name to be evaluated.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun insightName(): Optional<String> = insightName.getOptional("insightName")

        /**
         * The insight parameters. Required only for some test subtypes.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun insightParameters(): Optional<List<InsightParameter>> =
            insightParameters.getOptional("insightParameters")

        /**
         * The measurement to be evaluated.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun measurement(): Optional<String> = measurement.getOptional("measurement")

        /**
         * The operator to be used for the evaluation.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun operator(): Optional<Operator> = operator.getOptional("operator")

        /**
         * Whether to use automatic anomaly detection or manual thresholds
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun thresholdMode(): Optional<ThresholdMode> = thresholdMode.getOptional("thresholdMode")

        /**
         * The value to be compared.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<Value> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [insightName].
         *
         * Unlike [insightName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("insightName")
        @ExcludeMissing
        fun _insightName(): JsonField<String> = insightName

        /**
         * Returns the raw JSON value of [insightParameters].
         *
         * Unlike [insightParameters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("insightParameters")
        @ExcludeMissing
        fun _insightParameters(): JsonField<List<InsightParameter>> = insightParameters

        /**
         * Returns the raw JSON value of [measurement].
         *
         * Unlike [measurement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("measurement")
        @ExcludeMissing
        fun _measurement(): JsonField<String> = measurement

        /**
         * Returns the raw JSON value of [operator].
         *
         * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

        /**
         * Returns the raw JSON value of [thresholdMode].
         *
         * Unlike [thresholdMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("thresholdMode")
        @ExcludeMissing
        fun _thresholdMode(): JsonField<ThresholdMode> = thresholdMode

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Threshold]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Threshold]. */
        class Builder internal constructor() {

            private var insightName: JsonField<String> = JsonMissing.of()
            private var insightParameters: JsonField<MutableList<InsightParameter>>? = null
            private var measurement: JsonField<String> = JsonMissing.of()
            private var operator: JsonField<Operator> = JsonMissing.of()
            private var thresholdMode: JsonField<ThresholdMode> = JsonMissing.of()
            private var value: JsonField<Value> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(threshold: Threshold) = apply {
                insightName = threshold.insightName
                insightParameters = threshold.insightParameters.map { it.toMutableList() }
                measurement = threshold.measurement
                operator = threshold.operator
                thresholdMode = threshold.thresholdMode
                value = threshold.value
                additionalProperties = threshold.additionalProperties.toMutableMap()
            }

            /** The insight name to be evaluated. */
            fun insightName(insightName: String) = insightName(JsonField.of(insightName))

            /**
             * Sets [Builder.insightName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insightName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun insightName(insightName: JsonField<String>) = apply {
                this.insightName = insightName
            }

            /** The insight parameters. Required only for some test subtypes. */
            fun insightParameters(insightParameters: List<InsightParameter>?) =
                insightParameters(JsonField.ofNullable(insightParameters))

            /**
             * Alias for calling [Builder.insightParameters] with `insightParameters.orElse(null)`.
             */
            fun insightParameters(insightParameters: Optional<List<InsightParameter>>) =
                insightParameters(insightParameters.getOrNull())

            /**
             * Sets [Builder.insightParameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.insightParameters] with a well-typed
             * `List<InsightParameter>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun insightParameters(insightParameters: JsonField<List<InsightParameter>>) = apply {
                this.insightParameters = insightParameters.map { it.toMutableList() }
            }

            /**
             * Adds a single [InsightParameter] to [insightParameters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInsightParameter(insightParameter: InsightParameter) = apply {
                insightParameters =
                    (insightParameters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("insightParameters", it).add(insightParameter)
                    }
            }

            /** The measurement to be evaluated. */
            fun measurement(measurement: String) = measurement(JsonField.of(measurement))

            /**
             * Sets [Builder.measurement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.measurement] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun measurement(measurement: JsonField<String>) = apply {
                this.measurement = measurement
            }

            /** The operator to be used for the evaluation. */
            fun operator(operator: Operator) = operator(JsonField.of(operator))

            /**
             * Sets [Builder.operator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operator] with a well-typed [Operator] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

            /** Whether to use automatic anomaly detection or manual thresholds */
            fun thresholdMode(thresholdMode: ThresholdMode) =
                thresholdMode(JsonField.of(thresholdMode))

            /**
             * Sets [Builder.thresholdMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thresholdMode] with a well-typed [ThresholdMode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun thresholdMode(thresholdMode: JsonField<ThresholdMode>) = apply {
                this.thresholdMode = thresholdMode
            }

            /** The value to be compared. */
            fun value(value: Value) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Value>) = apply { this.value = value }

            /** Alias for calling [value] with `Value.ofNumber(number)`. */
            fun value(number: Double) = value(Value.ofNumber(number))

            /** Alias for calling [value] with `Value.ofBool(bool)`. */
            fun value(bool: Boolean) = value(Value.ofBool(bool))

            /** Alias for calling [value] with `Value.ofString(string)`. */
            fun value(string: String) = value(Value.ofString(string))

            /** Alias for calling [value] with `Value.ofStrings(strings)`. */
            fun valueOfStrings(strings: List<String>) = value(Value.ofStrings(strings))

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

            /**
             * Returns an immutable instance of [Threshold].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Threshold =
                Threshold(
                    insightName,
                    (insightParameters ?: JsonMissing.of()).map { it.toImmutable() },
                    measurement,
                    operator,
                    thresholdMode,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Threshold = apply {
            if (validated) {
                return@apply
            }

            insightName()
            insightParameters().ifPresent { it.forEach { it.validate() } }
            measurement()
            operator().ifPresent { it.validate() }
            thresholdMode().ifPresent { it.validate() }
            value().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenlayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (insightName.asKnown().isPresent) 1 else 0) +
                (insightParameters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (measurement.asKnown().isPresent) 1 else 0) +
                (operator.asKnown().getOrNull()?.validity() ?: 0) +
                (thresholdMode.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

        class InsightParameter
        private constructor(
            private val name: JsonField<String>,
            private val value: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
            ) : this(name, value, mutableMapOf())

            /**
             * The name of the insight filter.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [InsightParameter].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InsightParameter]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var value: JsonValue? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(insightParameter: InsightParameter) = apply {
                    name = insightParameter.name
                    value = insightParameter.value
                    additionalProperties = insightParameter.additionalProperties.toMutableMap()
                }

                /** The name of the insight filter. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun value(value: JsonValue) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InsightParameter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InsightParameter =
                    InsightParameter(
                        checkRequired("name", name),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InsightParameter = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InsightParameter && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InsightParameter{name=$name, value=$value, additionalProperties=$additionalProperties}"
        }

        /** The operator to be used for the evaluation. */
        class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val IS = of("is")

                @JvmField val GREATER = of(">")

                @JvmField val GREATER_OR_EQUALS = of(">=")

                @JvmField val LESS = of("<")

                @JvmField val LESS_OR_EQUALS = of("<=")

                @JvmField val NOT_EQUALS = of("!=")

                @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
            }

            /** An enum containing [Operator]'s known values. */
            enum class Known {
                IS,
                GREATER,
                GREATER_OR_EQUALS,
                LESS,
                LESS_OR_EQUALS,
                NOT_EQUALS,
            }

            /**
             * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Operator] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IS,
                GREATER,
                GREATER_OR_EQUALS,
                LESS,
                LESS_OR_EQUALS,
                NOT_EQUALS,
                /**
                 * An enum member indicating that [Operator] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IS -> Value.IS
                    GREATER -> Value.GREATER
                    GREATER_OR_EQUALS -> Value.GREATER_OR_EQUALS
                    LESS -> Value.LESS
                    LESS_OR_EQUALS -> Value.LESS_OR_EQUALS
                    NOT_EQUALS -> Value.NOT_EQUALS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IS -> Known.IS
                    GREATER -> Known.GREATER
                    GREATER_OR_EQUALS -> Known.GREATER_OR_EQUALS
                    LESS -> Known.LESS
                    LESS_OR_EQUALS -> Known.LESS_OR_EQUALS
                    NOT_EQUALS -> Known.NOT_EQUALS
                    else -> throw OpenlayerInvalidDataException("Unknown Operator: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Operator = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether to use automatic anomaly detection or manual thresholds */
        class ThresholdMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AUTOMATIC = of("automatic")

                @JvmField val MANUAL = of("manual")

                @JvmStatic fun of(value: String) = ThresholdMode(JsonField.of(value))
            }

            /** An enum containing [ThresholdMode]'s known values. */
            enum class Known {
                AUTOMATIC,
                MANUAL,
            }

            /**
             * An enum containing [ThresholdMode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ThresholdMode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTOMATIC,
                MANUAL,
                /**
                 * An enum member indicating that [ThresholdMode] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTOMATIC -> Value.AUTOMATIC
                    MANUAL -> Value.MANUAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AUTOMATIC -> Known.AUTOMATIC
                    MANUAL -> Known.MANUAL
                    else -> throw OpenlayerInvalidDataException("Unknown ThresholdMode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ThresholdMode = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThresholdMode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The value to be compared. */
        @JsonDeserialize(using = Value.Deserializer::class)
        @JsonSerialize(using = Value.Serializer::class)
        class Value
        private constructor(
            private val number: Double? = null,
            private val bool: Boolean? = null,
            private val string: String? = null,
            private val strings: List<String>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun number(): Optional<Double> = Optional.ofNullable(number)

            fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isNumber(): Boolean = number != null

            fun isBool(): Boolean = bool != null

            fun isString(): Boolean = string != null

            fun isStrings(): Boolean = strings != null

            fun asNumber(): Double = number.getOrThrow("number")

            fun asBool(): Boolean = bool.getOrThrow("bool")

            fun asString(): String = string.getOrThrow("string")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    number != null -> visitor.visitNumber(number)
                    bool != null -> visitor.visitBool(bool)
                    string != null -> visitor.visitString(string)
                    strings != null -> visitor.visitStrings(strings)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Value = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitNumber(number: Double) {}

                        override fun visitBool(bool: Boolean) {}

                        override fun visitString(string: String) {}

                        override fun visitStrings(strings: List<String>) {}
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: OpenlayerInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitNumber(number: Double) = 1

                        override fun visitBool(bool: Boolean) = 1

                        override fun visitString(string: String) = 1

                        override fun visitStrings(strings: List<String>) = strings.size

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Value && number == other.number && bool == other.bool && string == other.string && strings == other.strings /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(number, bool, string, strings) /* spotless:on */

            override fun toString(): String =
                when {
                    number != null -> "Value{number=$number}"
                    bool != null -> "Value{bool=$bool}"
                    string != null -> "Value{string=$string}"
                    strings != null -> "Value{strings=$strings}"
                    _json != null -> "Value{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Value")
                }

            companion object {

                @JvmStatic fun ofNumber(number: Double) = Value(number = number)

                @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)

                @JvmStatic fun ofString(string: String) = Value(string = string)

                @JvmStatic fun ofStrings(strings: List<String>) = Value(strings = strings)
            }

            /**
             * An interface that defines how to map each variant of [Value] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitNumber(number: Double): T

                fun visitBool(bool: Boolean): T

                fun visitString(string: String): T

                fun visitStrings(strings: List<String>): T

                /**
                 * Maps an unknown variant of [Value] to a value of type [T].
                 *
                 * An instance of [Value] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OpenlayerInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OpenlayerInvalidDataException("Unknown Value: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Value {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                    Value(number = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    Value(bool = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Value(string = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                    Value(strings = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> Value(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Value>(Value::class) {

                override fun serialize(
                    value: Value,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.number != null -> generator.writeObject(value.number)
                        value.bool != null -> generator.writeObject(value.bool)
                        value.string != null -> generator.writeObject(value.string)
                        value.strings != null -> generator.writeObject(value.strings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Value")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Threshold && insightName == other.insightName && insightParameters == other.insightParameters && measurement == other.measurement && operator == other.operator && thresholdMode == other.thresholdMode && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(insightName, insightParameters, measurement, operator, thresholdMode, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Threshold{insightName=$insightName, insightParameters=$insightParameters, measurement=$measurement, operator=$operator, thresholdMode=$thresholdMode, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TestCreateResponse && id == other.id && commentCount == other.commentCount && creatorId == other.creatorId && dateArchived == other.dateArchived && dateCreated == other.dateCreated && dateUpdated == other.dateUpdated && description == other.description && name == other.name && number == other.number && originProjectVersionId == other.originProjectVersionId && subtype == other.subtype && suggested == other.suggested && thresholds == other.thresholds && type == other.type && archived == other.archived && delayWindow == other.delayWindow && evaluationWindow == other.evaluationWindow && usesMlModel == other.usesMlModel && usesProductionData == other.usesProductionData && usesReferenceDataset == other.usesReferenceDataset && usesTrainingDataset == other.usesTrainingDataset && usesValidationDataset == other.usesValidationDataset && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, commentCount, creatorId, dateArchived, dateCreated, dateUpdated, description, name, number, originProjectVersionId, subtype, suggested, thresholds, type, archived, delayWindow, evaluationWindow, usesMlModel, usesProductionData, usesReferenceDataset, usesTrainingDataset, usesValidationDataset, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TestCreateResponse{id=$id, commentCount=$commentCount, creatorId=$creatorId, dateArchived=$dateArchived, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, name=$name, number=$number, originProjectVersionId=$originProjectVersionId, subtype=$subtype, suggested=$suggested, thresholds=$thresholds, type=$type, archived=$archived, delayWindow=$delayWindow, evaluationWindow=$evaluationWindow, usesMlModel=$usesMlModel, usesProductionData=$usesProductionData, usesReferenceDataset=$usesReferenceDataset, usesTrainingDataset=$usesTrainingDataset, usesValidationDataset=$usesValidationDataset, additionalProperties=$additionalProperties}"
}
