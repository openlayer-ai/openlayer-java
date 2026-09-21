// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruleresults

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkRequired
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RuleResultCreateEvidenceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val creatorId: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val storageUri: JsonField<String>,
    private val text: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creatorId") @ExcludeMissing creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateCreated")
        @ExcludeMissing
        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("storageUri")
        @ExcludeMissing
        storageUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        creatorId,
        dateCreated,
        dateUpdated,
        description,
        name,
        storageUri,
        text,
        url,
        mutableMapOf(),
    )

    /**
     * The evidence id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The user who attached the evidence.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

    /**
     * The creation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

    /**
     * The last update date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

    /**
     * A description of what the evidence shows.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The evidence name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Where the uploaded file is stored. Set when the rule's `evidenceType` is `document`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storageUri(): Optional<String> = storageUri.getOptional("storageUri")

    /**
     * The evidence text. Set when the rule's `evidenceType` is `text`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * A link to the evidence. Set when the rule's `evidenceType` is `url`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [creatorId].
     *
     * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [storageUri].
     *
     * Unlike [storageUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("storageUri") @ExcludeMissing fun _storageUri(): JsonField<String> = storageUri

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of
         * [RuleResultCreateEvidenceResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .creatorId()
         * .dateCreated()
         * .dateUpdated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleResultCreateEvidenceResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var creatorId: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var storageUri: JsonField<String> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleResultCreateEvidenceResponse: RuleResultCreateEvidenceResponse) =
            apply {
                id = ruleResultCreateEvidenceResponse.id
                creatorId = ruleResultCreateEvidenceResponse.creatorId
                dateCreated = ruleResultCreateEvidenceResponse.dateCreated
                dateUpdated = ruleResultCreateEvidenceResponse.dateUpdated
                description = ruleResultCreateEvidenceResponse.description
                name = ruleResultCreateEvidenceResponse.name
                storageUri = ruleResultCreateEvidenceResponse.storageUri
                text = ruleResultCreateEvidenceResponse.text
                url = ruleResultCreateEvidenceResponse.url
                additionalProperties =
                    ruleResultCreateEvidenceResponse.additionalProperties.toMutableMap()
            }

        /** The evidence id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The user who attached the evidence. */
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

        /** The last update date. */
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

        /** A description of what the evidence shows. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The evidence name. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Where the uploaded file is stored. Set when the rule's `evidenceType` is `document`. */
        fun storageUri(storageUri: String?) = storageUri(JsonField.ofNullable(storageUri))

        /** Alias for calling [Builder.storageUri] with `storageUri.orElse(null)`. */
        fun storageUri(storageUri: Optional<String>) = storageUri(storageUri.getOrNull())

        /**
         * Sets [Builder.storageUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storageUri(storageUri: JsonField<String>) = apply { this.storageUri = storageUri }

        /** The evidence text. Set when the rule's `evidenceType` is `text`. */
        fun text(text: String?) = text(JsonField.ofNullable(text))

        /** Alias for calling [Builder.text] with `text.orElse(null)`. */
        fun text(text: Optional<String>) = text(text.getOrNull())

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        /** A link to the evidence. Set when the rule's `evidenceType` is `url`. */
        fun url(url: String?) = url(JsonField.ofNullable(url))

        /** Alias for calling [Builder.url] with `url.orElse(null)`. */
        fun url(url: Optional<String>) = url(url.getOrNull())

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [RuleResultCreateEvidenceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .creatorId()
         * .dateCreated()
         * .dateUpdated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleResultCreateEvidenceResponse =
            RuleResultCreateEvidenceResponse(
                checkRequired("id", id),
                checkRequired("creatorId", creatorId),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                description,
                name,
                storageUri,
                text,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RuleResultCreateEvidenceResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        creatorId()
        dateCreated()
        dateUpdated()
        description()
        name()
        storageUri()
        text()
        url()
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
            (if (creatorId.asKnown().isPresent) 1 else 0) +
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (storageUri.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleResultCreateEvidenceResponse &&
            id == other.id &&
            creatorId == other.creatorId &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            description == other.description &&
            name == other.name &&
            storageUri == other.storageUri &&
            text == other.text &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            description,
            name,
            storageUri,
            text,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleResultCreateEvidenceResponse{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, description=$description, name=$name, storageUri=$storageUri, text=$text, url=$url, additionalProperties=$additionalProperties}"
}
