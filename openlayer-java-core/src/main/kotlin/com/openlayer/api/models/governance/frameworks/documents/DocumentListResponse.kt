// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks.documents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DocumentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of [DocumentListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocumentListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(documentListResponse: DocumentListResponse) = apply {
            items = documentListResponse.items.map { it.toMutableList() }
            additionalProperties = documentListResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [DocumentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DocumentListResponse =
            DocumentListResponse(
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): DocumentListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val frameworkId: JsonField<String>,
        private val title: JsonField<String>,
        private val sections: JsonField<List<Section>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("frameworkId")
            @ExcludeMissing
            frameworkId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sections")
            @ExcludeMissing
            sections: JsonField<List<Section>> = JsonMissing.of(),
        ) : this(id, dateCreated, dateUpdated, frameworkId, title, sections, mutableMapOf())

        /**
         * The document id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

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
         * The framework the document belongs to.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun frameworkId(): String = frameworkId.getRequired("frameworkId")

        /**
         * The document title.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun title(): String = title.getRequired("title")

        /**
         * The document's sections, in display order. Only returned when retrieving a single
         * document.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sections(): Optional<List<Section>> = sections.getOptional("sections")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [frameworkId].
         *
         * Unlike [frameworkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frameworkId")
        @ExcludeMissing
        fun _frameworkId(): JsonField<String> = frameworkId

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

        /**
         * Returns the raw JSON value of [sections].
         *
         * Unlike [sections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sections")
        @ExcludeMissing
        fun _sections(): JsonField<List<Section>> = sections

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dateCreated()
             * .dateUpdated()
             * .frameworkId()
             * .title()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var frameworkId: JsonField<String>? = null
            private var title: JsonField<String>? = null
            private var sections: JsonField<MutableList<Section>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                dateCreated = item.dateCreated
                dateUpdated = item.dateUpdated
                frameworkId = item.frameworkId
                title = item.title
                sections = item.sections.map { it.toMutableList() }
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The document id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation date. */
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

            /** The last update date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The framework the document belongs to. */
            fun frameworkId(frameworkId: String) = frameworkId(JsonField.of(frameworkId))

            /**
             * Sets [Builder.frameworkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frameworkId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frameworkId(frameworkId: JsonField<String>) = apply {
                this.frameworkId = frameworkId
            }

            /** The document title. */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /**
             * The document's sections, in display order. Only returned when retrieving a single
             * document.
             */
            fun sections(sections: List<Section>) = sections(JsonField.of(sections))

            /**
             * Sets [Builder.sections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sections] with a well-typed `List<Section>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sections(sections: JsonField<List<Section>>) = apply {
                this.sections = sections.map { it.toMutableList() }
            }

            /**
             * Adds a single [Section] to [sections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSection(section: Section) = apply {
                sections =
                    (sections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sections", it).add(section)
                    }
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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dateCreated()
             * .dateUpdated()
             * .frameworkId()
             * .title()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("frameworkId", frameworkId),
                    checkRequired("title", title),
                    (sections ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            id()
            dateCreated()
            dateUpdated()
            frameworkId()
            title()
            sections().ifPresent { it.forEach { it.validate() } }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (frameworkId.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (sections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Section
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val documentId: JsonField<String>,
            private val number: JsonField<String>,
            private val sortOrder: JsonField<Long>,
            private val title: JsonField<String>,
            private val ruleCount: JsonField<Long>,
            private val rules: JsonField<List<Rule>>,
            private val subsections: JsonField<List<Subsection>>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("documentId")
                @ExcludeMissing
                documentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("number")
                @ExcludeMissing
                number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sortOrder")
                @ExcludeMissing
                sortOrder: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ruleCount")
                @ExcludeMissing
                ruleCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("rules")
                @ExcludeMissing
                rules: JsonField<List<Rule>> = JsonMissing.of(),
                @JsonProperty("subsections")
                @ExcludeMissing
                subsections: JsonField<List<Subsection>> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                documentId,
                number,
                sortOrder,
                title,
                ruleCount,
                rules,
                subsections,
                text,
                mutableMapOf(),
            )

            /**
             * The section id.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The document the section belongs to.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun documentId(): String = documentId.getRequired("documentId")

            /**
             * The section number as it appears in the source standard.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun number(): String = number.getRequired("number")

            /**
             * The position of the section within the document.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sortOrder(): Long = sortOrder.getRequired("sortOrder")

            /**
             * The section title.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * How many rules are linked to this section, including its subsections. Use it to
             * decide whether to fetch the section's rules.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ruleCount(): Optional<Long> = ruleCount.getOptional("ruleCount")

            /**
             * The rules linked directly to this section.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rules(): Optional<List<Rule>> = rules.getOptional("rules")

            /**
             * The section's subsections, in display order.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun subsections(): Optional<List<Subsection>> = subsections.getOptional("subsections")

            /**
             * The section text.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [documentId].
             *
             * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("documentId")
            @ExcludeMissing
            fun _documentId(): JsonField<String> = documentId

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Returns the raw JSON value of [sortOrder].
             *
             * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sortOrder") @ExcludeMissing fun _sortOrder(): JsonField<Long> = sortOrder

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [ruleCount].
             *
             * Unlike [ruleCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ruleCount") @ExcludeMissing fun _ruleCount(): JsonField<Long> = ruleCount

            /**
             * Returns the raw JSON value of [rules].
             *
             * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

            /**
             * Returns the raw JSON value of [subsections].
             *
             * Unlike [subsections], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subsections")
            @ExcludeMissing
            fun _subsections(): JsonField<List<Subsection>> = subsections

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                 * Returns a mutable builder for constructing an instance of [Section].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .documentId()
                 * .number()
                 * .sortOrder()
                 * .title()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Section]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var documentId: JsonField<String>? = null
                private var number: JsonField<String>? = null
                private var sortOrder: JsonField<Long>? = null
                private var title: JsonField<String>? = null
                private var ruleCount: JsonField<Long> = JsonMissing.of()
                private var rules: JsonField<MutableList<Rule>>? = null
                private var subsections: JsonField<MutableList<Subsection>>? = null
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(section: Section) = apply {
                    id = section.id
                    documentId = section.documentId
                    number = section.number
                    sortOrder = section.sortOrder
                    title = section.title
                    ruleCount = section.ruleCount
                    rules = section.rules.map { it.toMutableList() }
                    subsections = section.subsections.map { it.toMutableList() }
                    text = section.text
                    additionalProperties = section.additionalProperties.toMutableMap()
                }

                /** The section id. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The document the section belongs to. */
                fun documentId(documentId: String) = documentId(JsonField.of(documentId))

                /**
                 * Sets [Builder.documentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentId(documentId: JsonField<String>) = apply {
                    this.documentId = documentId
                }

                /** The section number as it appears in the source standard. */
                fun number(number: String) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                /** The position of the section within the document. */
                fun sortOrder(sortOrder: Long) = sortOrder(JsonField.of(sortOrder))

                /**
                 * Sets [Builder.sortOrder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sortOrder] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sortOrder(sortOrder: JsonField<Long>) = apply { this.sortOrder = sortOrder }

                /** The section title. */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                /**
                 * How many rules are linked to this section, including its subsections. Use it to
                 * decide whether to fetch the section's rules.
                 */
                fun ruleCount(ruleCount: Long) = ruleCount(JsonField.of(ruleCount))

                /**
                 * Sets [Builder.ruleCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ruleCount(ruleCount: JsonField<Long>) = apply { this.ruleCount = ruleCount }

                /** The rules linked directly to this section. */
                fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

                /**
                 * Sets [Builder.rules] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rules] with a well-typed `List<Rule>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rules(rules: JsonField<List<Rule>>) = apply {
                    this.rules = rules.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Rule] to [rules].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRule(rule: Rule) = apply {
                    rules =
                        (rules ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rules", it).add(rule)
                        }
                }

                /** The section's subsections, in display order. */
                fun subsections(subsections: List<Subsection>) =
                    subsections(JsonField.of(subsections))

                /**
                 * Sets [Builder.subsections] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subsections] with a well-typed
                 * `List<Subsection>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun subsections(subsections: JsonField<List<Subsection>>) = apply {
                    this.subsections = subsections.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Subsection] to [subsections].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSubsection(subsection: Subsection) = apply {
                    subsections =
                        (subsections ?: JsonField.of(mutableListOf())).also {
                            checkKnown("subsections", it).add(subsection)
                        }
                }

                /** The section text. */
                fun text(text: String?) = text(JsonField.ofNullable(text))

                /** Alias for calling [Builder.text] with `text.orElse(null)`. */
                fun text(text: Optional<String>) = text(text.getOrNull())

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

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
                 * Returns an immutable instance of [Section].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .documentId()
                 * .number()
                 * .sortOrder()
                 * .title()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Section =
                    Section(
                        checkRequired("id", id),
                        checkRequired("documentId", documentId),
                        checkRequired("number", number),
                        checkRequired("sortOrder", sortOrder),
                        checkRequired("title", title),
                        ruleCount,
                        (rules ?: JsonMissing.of()).map { it.toImmutable() },
                        (subsections ?: JsonMissing.of()).map { it.toImmutable() },
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OpenlayerInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Section = apply {
                if (validated) {
                    return@apply
                }

                id()
                documentId()
                number()
                sortOrder()
                title()
                ruleCount()
                rules().ifPresent { it.forEach { it.validate() } }
                subsections().ifPresent { it.forEach { it.validate() } }
                text()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (documentId.asKnown().isPresent) 1 else 0) +
                    (if (number.asKnown().isPresent) 1 else 0) +
                    (if (sortOrder.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0) +
                    (if (ruleCount.asKnown().isPresent) 1 else 0) +
                    (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (subsections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            class Rule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val scope: JsonField<Scope>,
                private val type: JsonField<Type>,
                private val automationParams: JsonField<AutomationParams>,
                private val automationType: JsonField<String>,
                private val dateCreated: JsonField<OffsetDateTime>,
                private val dateUpdated: JsonField<OffsetDateTime>,
                private val deactivated: JsonField<Boolean>,
                private val description: JsonField<String>,
                private val evidenceType: JsonField<EvidenceType>,
                private val immutable: JsonField<Boolean>,
                private val renewalCadenceDays: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("scope")
                    @ExcludeMissing
                    scope: JsonField<Scope> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("automationParams")
                    @ExcludeMissing
                    automationParams: JsonField<AutomationParams> = JsonMissing.of(),
                    @JsonProperty("automationType")
                    @ExcludeMissing
                    automationType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dateCreated")
                    @ExcludeMissing
                    dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("dateUpdated")
                    @ExcludeMissing
                    dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("deactivated")
                    @ExcludeMissing
                    deactivated: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("evidenceType")
                    @ExcludeMissing
                    evidenceType: JsonField<EvidenceType> = JsonMissing.of(),
                    @JsonProperty("immutable")
                    @ExcludeMissing
                    immutable: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("renewalCadenceDays")
                    @ExcludeMissing
                    renewalCadenceDays: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    id,
                    name,
                    scope,
                    type,
                    automationParams,
                    automationType,
                    dateCreated,
                    dateUpdated,
                    deactivated,
                    description,
                    evidenceType,
                    immutable,
                    renewalCadenceDays,
                    mutableMapOf(),
                )

                /**
                 * The rule id.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The rule name.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Whether the rule is evaluated once for the whole workspace, or once per project
                 * the rule's frameworks apply to.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun scope(): Scope = scope.getRequired("scope")

                /**
                 * `platform` rules are evaluated automatically from the state of your Openlayer
                 * workspace. `evidence` rules are satisfied by attaching evidence.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): Type = type.getRequired("type")

                /**
                 * Configuration for the platform check, when the automation takes parameters.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun automationParams(): Optional<AutomationParams> =
                    automationParams.getOptional("automationParams")

                /**
                 * Which workspace signal a platform rule checks, for example
                 * `monitoring_mode_enabled`, `test_setup`, or `project_owner_set`. `null` for
                 * evidence rules.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun automationType(): Optional<String> =
                    automationType.getOptional("automationType")

                /**
                 * The creation date.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun dateCreated(): Optional<OffsetDateTime> = dateCreated.getOptional("dateCreated")

                /**
                 * The last update date.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun dateUpdated(): Optional<OffsetDateTime> = dateUpdated.getOptional("dateUpdated")

                /**
                 * Whether the rule is excluded from compliance calculations.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

                /**
                 * What the rule requires.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * The kind of evidence that satisfies the rule. `null` for platform rules.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun evidenceType(): Optional<EvidenceType> =
                    evidenceType.getOptional("evidenceType")

                /**
                 * Whether the rule is managed by Openlayer and cannot be edited.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun immutable(): Optional<Boolean> = immutable.getOptional("immutable")

                /**
                 * How often evidence must be renewed, in days. Once evidence is older than this,
                 * the rule result becomes `due_soon` and then `failing`.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun renewalCadenceDays(): Optional<Long> =
                    renewalCadenceDays.getOptional("renewalCadenceDays")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [scope].
                 *
                 * Unlike [scope], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                /**
                 * Returns the raw JSON value of [automationParams].
                 *
                 * Unlike [automationParams], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("automationParams")
                @ExcludeMissing
                fun _automationParams(): JsonField<AutomationParams> = automationParams

                /**
                 * Returns the raw JSON value of [automationType].
                 *
                 * Unlike [automationType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("automationType")
                @ExcludeMissing
                fun _automationType(): JsonField<String> = automationType

                /**
                 * Returns the raw JSON value of [dateCreated].
                 *
                 * Unlike [dateCreated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dateCreated")
                @ExcludeMissing
                fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

                /**
                 * Returns the raw JSON value of [dateUpdated].
                 *
                 * Unlike [dateUpdated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dateUpdated")
                @ExcludeMissing
                fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

                /**
                 * Returns the raw JSON value of [deactivated].
                 *
                 * Unlike [deactivated], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("deactivated")
                @ExcludeMissing
                fun _deactivated(): JsonField<Boolean> = deactivated

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [evidenceType].
                 *
                 * Unlike [evidenceType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("evidenceType")
                @ExcludeMissing
                fun _evidenceType(): JsonField<EvidenceType> = evidenceType

                /**
                 * Returns the raw JSON value of [immutable].
                 *
                 * Unlike [immutable], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("immutable")
                @ExcludeMissing
                fun _immutable(): JsonField<Boolean> = immutable

                /**
                 * Returns the raw JSON value of [renewalCadenceDays].
                 *
                 * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("renewalCadenceDays")
                @ExcludeMissing
                fun _renewalCadenceDays(): JsonField<Long> = renewalCadenceDays

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
                     * Returns a mutable builder for constructing an instance of [Rule].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * .scope()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Rule]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var scope: JsonField<Scope>? = null
                    private var type: JsonField<Type>? = null
                    private var automationParams: JsonField<AutomationParams> = JsonMissing.of()
                    private var automationType: JsonField<String> = JsonMissing.of()
                    private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var deactivated: JsonField<Boolean> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var evidenceType: JsonField<EvidenceType> = JsonMissing.of()
                    private var immutable: JsonField<Boolean> = JsonMissing.of()
                    private var renewalCadenceDays: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(rule: Rule) = apply {
                        id = rule.id
                        name = rule.name
                        scope = rule.scope
                        type = rule.type
                        automationParams = rule.automationParams
                        automationType = rule.automationType
                        dateCreated = rule.dateCreated
                        dateUpdated = rule.dateUpdated
                        deactivated = rule.deactivated
                        description = rule.description
                        evidenceType = rule.evidenceType
                        immutable = rule.immutable
                        renewalCadenceDays = rule.renewalCadenceDays
                        additionalProperties = rule.additionalProperties.toMutableMap()
                    }

                    /** The rule id. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The rule name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Whether the rule is evaluated once for the whole workspace, or once per
                     * project the rule's frameworks apply to.
                     */
                    fun scope(scope: Scope) = scope(JsonField.of(scope))

                    /**
                     * Sets [Builder.scope] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.scope] with a well-typed [Scope] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

                    /**
                     * `platform` rules are evaluated automatically from the state of your Openlayer
                     * workspace. `evidence` rules are satisfied by attaching evidence.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /**
                     * Configuration for the platform check, when the automation takes parameters.
                     */
                    fun automationParams(automationParams: AutomationParams?) =
                        automationParams(JsonField.ofNullable(automationParams))

                    /**
                     * Alias for calling [Builder.automationParams] with
                     * `automationParams.orElse(null)`.
                     */
                    fun automationParams(automationParams: Optional<AutomationParams>) =
                        automationParams(automationParams.getOrNull())

                    /**
                     * Sets [Builder.automationParams] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.automationParams] with a well-typed
                     * [AutomationParams] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun automationParams(automationParams: JsonField<AutomationParams>) = apply {
                        this.automationParams = automationParams
                    }

                    /**
                     * Which workspace signal a platform rule checks, for example
                     * `monitoring_mode_enabled`, `test_setup`, or `project_owner_set`. `null` for
                     * evidence rules.
                     */
                    fun automationType(automationType: String?) =
                        automationType(JsonField.ofNullable(automationType))

                    /**
                     * Alias for calling [Builder.automationType] with
                     * `automationType.orElse(null)`.
                     */
                    fun automationType(automationType: Optional<String>) =
                        automationType(automationType.getOrNull())

                    /**
                     * Sets [Builder.automationType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.automationType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun automationType(automationType: JsonField<String>) = apply {
                        this.automationType = automationType
                    }

                    /** The creation date. */
                    fun dateCreated(dateCreated: OffsetDateTime) =
                        dateCreated(JsonField.of(dateCreated))

                    /**
                     * Sets [Builder.dateCreated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateCreated] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                        this.dateCreated = dateCreated
                    }

                    /** The last update date. */
                    fun dateUpdated(dateUpdated: OffsetDateTime) =
                        dateUpdated(JsonField.of(dateUpdated))

                    /**
                     * Sets [Builder.dateUpdated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateUpdated] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                        this.dateUpdated = dateUpdated
                    }

                    /** Whether the rule is excluded from compliance calculations. */
                    fun deactivated(deactivated: Boolean) = deactivated(JsonField.of(deactivated))

                    /**
                     * Sets [Builder.deactivated] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deactivated] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun deactivated(deactivated: JsonField<Boolean>) = apply {
                        this.deactivated = deactivated
                    }

                    /** What the rule requires. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                    fun description(description: Optional<String>) =
                        description(description.getOrNull())

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** The kind of evidence that satisfies the rule. `null` for platform rules. */
                    fun evidenceType(evidenceType: EvidenceType?) =
                        evidenceType(JsonField.ofNullable(evidenceType))

                    /**
                     * Alias for calling [Builder.evidenceType] with `evidenceType.orElse(null)`.
                     */
                    fun evidenceType(evidenceType: Optional<EvidenceType>) =
                        evidenceType(evidenceType.getOrNull())

                    /**
                     * Sets [Builder.evidenceType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.evidenceType] with a well-typed
                     * [EvidenceType] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun evidenceType(evidenceType: JsonField<EvidenceType>) = apply {
                        this.evidenceType = evidenceType
                    }

                    /** Whether the rule is managed by Openlayer and cannot be edited. */
                    fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

                    /**
                     * Sets [Builder.immutable] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.immutable] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun immutable(immutable: JsonField<Boolean>) = apply {
                        this.immutable = immutable
                    }

                    /**
                     * How often evidence must be renewed, in days. Once evidence is older than
                     * this, the rule result becomes `due_soon` and then `failing`.
                     */
                    fun renewalCadenceDays(renewalCadenceDays: Long?) =
                        renewalCadenceDays(JsonField.ofNullable(renewalCadenceDays))

                    /**
                     * Alias for [Builder.renewalCadenceDays].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun renewalCadenceDays(renewalCadenceDays: Long) =
                        renewalCadenceDays(renewalCadenceDays as Long?)

                    /**
                     * Alias for calling [Builder.renewalCadenceDays] with
                     * `renewalCadenceDays.orElse(null)`.
                     */
                    fun renewalCadenceDays(renewalCadenceDays: Optional<Long>) =
                        renewalCadenceDays(renewalCadenceDays.getOrNull())

                    /**
                     * Sets [Builder.renewalCadenceDays] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.renewalCadenceDays] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun renewalCadenceDays(renewalCadenceDays: JsonField<Long>) = apply {
                        this.renewalCadenceDays = renewalCadenceDays
                    }

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
                     * Returns an immutable instance of [Rule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .name()
                     * .scope()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Rule =
                        Rule(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            checkRequired("scope", scope),
                            checkRequired("type", type),
                            automationParams,
                            automationType,
                            dateCreated,
                            dateUpdated,
                            deactivated,
                            description,
                            evidenceType,
                            immutable,
                            renewalCadenceDays,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Rule = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    scope().validate()
                    type().validate()
                    automationParams().ifPresent { it.validate() }
                    automationType()
                    dateCreated()
                    dateUpdated()
                    deactivated()
                    description()
                    evidenceType().ifPresent { it.validate() }
                    immutable()
                    renewalCadenceDays()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (name.asKnown().isPresent) 1 else 0) +
                        (scope.asKnown().getOrNull()?.validity() ?: 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (automationParams.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (automationType.asKnown().isPresent) 1 else 0) +
                        (if (dateCreated.asKnown().isPresent) 1 else 0) +
                        (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                        (if (deactivated.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (evidenceType.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (immutable.asKnown().isPresent) 1 else 0) +
                        (if (renewalCadenceDays.asKnown().isPresent) 1 else 0)

                /**
                 * Whether the rule is evaluated once for the whole workspace, or once per project
                 * the rule's frameworks apply to.
                 */
                class Scope @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PROJECT = of("project")

                        @JvmField val WORKSPACE = of("workspace")

                        @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
                    }

                    /** An enum containing [Scope]'s known values. */
                    enum class Known {
                        PROJECT,
                        WORKSPACE,
                    }

                    /**
                     * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Scope] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PROJECT,
                        WORKSPACE,
                        /**
                         * An enum member indicating that [Scope] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PROJECT -> Value.PROJECT
                            WORKSPACE -> Value.WORKSPACE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PROJECT -> Known.PROJECT
                            WORKSPACE -> Known.WORKSPACE
                            else -> throw OpenlayerInvalidDataException("Unknown Scope: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OpenlayerInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OpenlayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Scope = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Scope && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * `platform` rules are evaluated automatically from the state of your Openlayer
                 * workspace. `evidence` rules are satisfied by attaching evidence.
                 */
                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val PLATFORM = of("platform")

                        @JvmField val EVIDENCE = of("evidence")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        PLATFORM,
                        EVIDENCE,
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PLATFORM,
                        EVIDENCE,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PLATFORM -> Value.PLATFORM
                            EVIDENCE -> Value.EVIDENCE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PLATFORM -> Known.PLATFORM
                            EVIDENCE -> Known.EVIDENCE
                            else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OpenlayerInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OpenlayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Type = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for the platform check, when the automation takes parameters. */
                class AutomationParams
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [AutomationParams].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AutomationParams]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(automationParams: AutomationParams) = apply {
                            additionalProperties =
                                automationParams.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [AutomationParams].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): AutomationParams =
                            AutomationParams(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OpenlayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AutomationParams = apply {
                        if (validated) {
                            return@apply
                        }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AutomationParams &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AutomationParams{additionalProperties=$additionalProperties}"
                }

                /** The kind of evidence that satisfies the rule. `null` for platform rules. */
                class EvidenceType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DOCUMENT = of("document")

                        @JvmField val TEXT = of("text")

                        @JvmField val URL = of("url")

                        @JvmField val CATEGORY_VALUE = of("categoryValue")

                        @JvmStatic fun of(value: String) = EvidenceType(JsonField.of(value))
                    }

                    /** An enum containing [EvidenceType]'s known values. */
                    enum class Known {
                        DOCUMENT,
                        TEXT,
                        URL,
                        CATEGORY_VALUE,
                    }

                    /**
                     * An enum containing [EvidenceType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [EvidenceType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DOCUMENT,
                        TEXT,
                        URL,
                        CATEGORY_VALUE,
                        /**
                         * An enum member indicating that [EvidenceType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DOCUMENT -> Value.DOCUMENT
                            TEXT -> Value.TEXT
                            URL -> Value.URL
                            CATEGORY_VALUE -> Value.CATEGORY_VALUE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DOCUMENT -> Known.DOCUMENT
                            TEXT -> Known.TEXT
                            URL -> Known.URL
                            CATEGORY_VALUE -> Known.CATEGORY_VALUE
                            else ->
                                throw OpenlayerInvalidDataException("Unknown EvidenceType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OpenlayerInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            OpenlayerInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OpenlayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): EvidenceType = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is EvidenceType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Rule &&
                        id == other.id &&
                        name == other.name &&
                        scope == other.scope &&
                        type == other.type &&
                        automationParams == other.automationParams &&
                        automationType == other.automationType &&
                        dateCreated == other.dateCreated &&
                        dateUpdated == other.dateUpdated &&
                        deactivated == other.deactivated &&
                        description == other.description &&
                        evidenceType == other.evidenceType &&
                        immutable == other.immutable &&
                        renewalCadenceDays == other.renewalCadenceDays &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        name,
                        scope,
                        type,
                        automationParams,
                        automationType,
                        dateCreated,
                        dateUpdated,
                        deactivated,
                        description,
                        evidenceType,
                        immutable,
                        renewalCadenceDays,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Rule{id=$id, name=$name, scope=$scope, type=$type, automationParams=$automationParams, automationType=$automationType, dateCreated=$dateCreated, dateUpdated=$dateUpdated, deactivated=$deactivated, description=$description, evidenceType=$evidenceType, immutable=$immutable, renewalCadenceDays=$renewalCadenceDays, additionalProperties=$additionalProperties}"
            }

            class Subsection
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val number: JsonField<String>,
                private val sectionId: JsonField<String>,
                private val sortOrder: JsonField<Long>,
                private val title: JsonField<String>,
                private val ruleCount: JsonField<Long>,
                private val rules: JsonField<List<Rule>>,
                private val text: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("number")
                    @ExcludeMissing
                    number: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sectionId")
                    @ExcludeMissing
                    sectionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sortOrder")
                    @ExcludeMissing
                    sortOrder: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("title")
                    @ExcludeMissing
                    title: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ruleCount")
                    @ExcludeMissing
                    ruleCount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("rules")
                    @ExcludeMissing
                    rules: JsonField<List<Rule>> = JsonMissing.of(),
                    @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    number,
                    sectionId,
                    sortOrder,
                    title,
                    ruleCount,
                    rules,
                    text,
                    mutableMapOf(),
                )

                /**
                 * The subsection id.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * The subsection number as it appears in the source standard.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun number(): String = number.getRequired("number")

                /**
                 * The section the subsection belongs to.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sectionId(): String = sectionId.getRequired("sectionId")

                /**
                 * The position of the subsection within its section.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun sortOrder(): Long = sortOrder.getRequired("sortOrder")

                /**
                 * The subsection title.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun title(): String = title.getRequired("title")

                /**
                 * How many rules are linked to this subsection.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun ruleCount(): Optional<Long> = ruleCount.getOptional("ruleCount")

                /**
                 * The rules linked to this subsection.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun rules(): Optional<List<Rule>> = rules.getOptional("rules")

                /**
                 * The subsection text. This is the requirement your rules are mapped against.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun text(): Optional<String> = text.getOptional("text")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [number].
                 *
                 * Unlike [number], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

                /**
                 * Returns the raw JSON value of [sectionId].
                 *
                 * Unlike [sectionId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sectionId")
                @ExcludeMissing
                fun _sectionId(): JsonField<String> = sectionId

                /**
                 * Returns the raw JSON value of [sortOrder].
                 *
                 * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("sortOrder")
                @ExcludeMissing
                fun _sortOrder(): JsonField<Long> = sortOrder

                /**
                 * Returns the raw JSON value of [title].
                 *
                 * Unlike [title], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

                /**
                 * Returns the raw JSON value of [ruleCount].
                 *
                 * Unlike [ruleCount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("ruleCount")
                @ExcludeMissing
                fun _ruleCount(): JsonField<Long> = ruleCount

                /**
                 * Returns the raw JSON value of [rules].
                 *
                 * Unlike [rules], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                     * Returns a mutable builder for constructing an instance of [Subsection].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .number()
                     * .sectionId()
                     * .sortOrder()
                     * .title()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Subsection]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var number: JsonField<String>? = null
                    private var sectionId: JsonField<String>? = null
                    private var sortOrder: JsonField<Long>? = null
                    private var title: JsonField<String>? = null
                    private var ruleCount: JsonField<Long> = JsonMissing.of()
                    private var rules: JsonField<MutableList<Rule>>? = null
                    private var text: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(subsection: Subsection) = apply {
                        id = subsection.id
                        number = subsection.number
                        sectionId = subsection.sectionId
                        sortOrder = subsection.sortOrder
                        title = subsection.title
                        ruleCount = subsection.ruleCount
                        rules = subsection.rules.map { it.toMutableList() }
                        text = subsection.text
                        additionalProperties = subsection.additionalProperties.toMutableMap()
                    }

                    /** The subsection id. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The subsection number as it appears in the source standard. */
                    fun number(number: String) = number(JsonField.of(number))

                    /**
                     * Sets [Builder.number] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.number] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun number(number: JsonField<String>) = apply { this.number = number }

                    /** The section the subsection belongs to. */
                    fun sectionId(sectionId: String) = sectionId(JsonField.of(sectionId))

                    /**
                     * Sets [Builder.sectionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sectionId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sectionId(sectionId: JsonField<String>) = apply {
                        this.sectionId = sectionId
                    }

                    /** The position of the subsection within its section. */
                    fun sortOrder(sortOrder: Long) = sortOrder(JsonField.of(sortOrder))

                    /**
                     * Sets [Builder.sortOrder] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.sortOrder] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun sortOrder(sortOrder: JsonField<Long>) = apply { this.sortOrder = sortOrder }

                    /** The subsection title. */
                    fun title(title: String) = title(JsonField.of(title))

                    /**
                     * Sets [Builder.title] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.title] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun title(title: JsonField<String>) = apply { this.title = title }

                    /** How many rules are linked to this subsection. */
                    fun ruleCount(ruleCount: Long) = ruleCount(JsonField.of(ruleCount))

                    /**
                     * Sets [Builder.ruleCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ruleCount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ruleCount(ruleCount: JsonField<Long>) = apply { this.ruleCount = ruleCount }

                    /** The rules linked to this subsection. */
                    fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

                    /**
                     * Sets [Builder.rules] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.rules] with a well-typed `List<Rule>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun rules(rules: JsonField<List<Rule>>) = apply {
                        this.rules = rules.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Rule] to [rules].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRule(rule: Rule) = apply {
                        rules =
                            (rules ?: JsonField.of(mutableListOf())).also {
                                checkKnown("rules", it).add(rule)
                            }
                    }

                    /**
                     * The subsection text. This is the requirement your rules are mapped against.
                     */
                    fun text(text: String?) = text(JsonField.ofNullable(text))

                    /** Alias for calling [Builder.text] with `text.orElse(null)`. */
                    fun text(text: Optional<String>) = text(text.getOrNull())

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

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
                     * Returns an immutable instance of [Subsection].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .number()
                     * .sectionId()
                     * .sortOrder()
                     * .title()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Subsection =
                        Subsection(
                            checkRequired("id", id),
                            checkRequired("number", number),
                            checkRequired("sectionId", sectionId),
                            checkRequired("sortOrder", sortOrder),
                            checkRequired("title", title),
                            ruleCount,
                            (rules ?: JsonMissing.of()).map { it.toImmutable() },
                            text,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Subsection = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    number()
                    sectionId()
                    sortOrder()
                    title()
                    ruleCount()
                    rules().ifPresent { it.forEach { it.validate() } }
                    text()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (number.asKnown().isPresent) 1 else 0) +
                        (if (sectionId.asKnown().isPresent) 1 else 0) +
                        (if (sortOrder.asKnown().isPresent) 1 else 0) +
                        (if (title.asKnown().isPresent) 1 else 0) +
                        (if (ruleCount.asKnown().isPresent) 1 else 0) +
                        (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (text.asKnown().isPresent) 1 else 0)

                class Rule
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val name: JsonField<String>,
                    private val scope: JsonField<Scope>,
                    private val type: JsonField<Type>,
                    private val automationParams: JsonField<AutomationParams>,
                    private val automationType: JsonField<String>,
                    private val dateCreated: JsonField<OffsetDateTime>,
                    private val dateUpdated: JsonField<OffsetDateTime>,
                    private val deactivated: JsonField<Boolean>,
                    private val description: JsonField<String>,
                    private val evidenceType: JsonField<EvidenceType>,
                    private val immutable: JsonField<Boolean>,
                    private val renewalCadenceDays: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("scope")
                        @ExcludeMissing
                        scope: JsonField<Scope> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<Type> = JsonMissing.of(),
                        @JsonProperty("automationParams")
                        @ExcludeMissing
                        automationParams: JsonField<AutomationParams> = JsonMissing.of(),
                        @JsonProperty("automationType")
                        @ExcludeMissing
                        automationType: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("dateCreated")
                        @ExcludeMissing
                        dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("dateUpdated")
                        @ExcludeMissing
                        dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("deactivated")
                        @ExcludeMissing
                        deactivated: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("evidenceType")
                        @ExcludeMissing
                        evidenceType: JsonField<EvidenceType> = JsonMissing.of(),
                        @JsonProperty("immutable")
                        @ExcludeMissing
                        immutable: JsonField<Boolean> = JsonMissing.of(),
                        @JsonProperty("renewalCadenceDays")
                        @ExcludeMissing
                        renewalCadenceDays: JsonField<Long> = JsonMissing.of(),
                    ) : this(
                        id,
                        name,
                        scope,
                        type,
                        automationParams,
                        automationType,
                        dateCreated,
                        dateUpdated,
                        deactivated,
                        description,
                        evidenceType,
                        immutable,
                        renewalCadenceDays,
                        mutableMapOf(),
                    )

                    /**
                     * The rule id.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * The rule name.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Whether the rule is evaluated once for the whole workspace, or once per
                     * project the rule's frameworks apply to.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun scope(): Scope = scope.getRequired("scope")

                    /**
                     * `platform` rules are evaluated automatically from the state of your Openlayer
                     * workspace. `evidence` rules are satisfied by attaching evidence.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun type(): Type = type.getRequired("type")

                    /**
                     * Configuration for the platform check, when the automation takes parameters.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun automationParams(): Optional<AutomationParams> =
                        automationParams.getOptional("automationParams")

                    /**
                     * Which workspace signal a platform rule checks, for example
                     * `monitoring_mode_enabled`, `test_setup`, or `project_owner_set`. `null` for
                     * evidence rules.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun automationType(): Optional<String> =
                        automationType.getOptional("automationType")

                    /**
                     * The creation date.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun dateCreated(): Optional<OffsetDateTime> =
                        dateCreated.getOptional("dateCreated")

                    /**
                     * The last update date.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun dateUpdated(): Optional<OffsetDateTime> =
                        dateUpdated.getOptional("dateUpdated")

                    /**
                     * Whether the rule is excluded from compliance calculations.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun deactivated(): Optional<Boolean> = deactivated.getOptional("deactivated")

                    /**
                     * What the rule requires.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): Optional<String> = description.getOptional("description")

                    /**
                     * The kind of evidence that satisfies the rule. `null` for platform rules.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun evidenceType(): Optional<EvidenceType> =
                        evidenceType.getOptional("evidenceType")

                    /**
                     * Whether the rule is managed by Openlayer and cannot be edited.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun immutable(): Optional<Boolean> = immutable.getOptional("immutable")

                    /**
                     * How often evidence must be renewed, in days. Once evidence is older than
                     * this, the rule result becomes `due_soon` and then `failing`.
                     *
                     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun renewalCadenceDays(): Optional<Long> =
                        renewalCadenceDays.getOptional("renewalCadenceDays")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [scope].
                     *
                     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    /**
                     * Returns the raw JSON value of [automationParams].
                     *
                     * Unlike [automationParams], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("automationParams")
                    @ExcludeMissing
                    fun _automationParams(): JsonField<AutomationParams> = automationParams

                    /**
                     * Returns the raw JSON value of [automationType].
                     *
                     * Unlike [automationType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("automationType")
                    @ExcludeMissing
                    fun _automationType(): JsonField<String> = automationType

                    /**
                     * Returns the raw JSON value of [dateCreated].
                     *
                     * Unlike [dateCreated], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dateCreated")
                    @ExcludeMissing
                    fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

                    /**
                     * Returns the raw JSON value of [dateUpdated].
                     *
                     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dateUpdated")
                    @ExcludeMissing
                    fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

                    /**
                     * Returns the raw JSON value of [deactivated].
                     *
                     * Unlike [deactivated], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("deactivated")
                    @ExcludeMissing
                    fun _deactivated(): JsonField<Boolean> = deactivated

                    /**
                     * Returns the raw JSON value of [description].
                     *
                     * Unlike [description], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /**
                     * Returns the raw JSON value of [evidenceType].
                     *
                     * Unlike [evidenceType], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("evidenceType")
                    @ExcludeMissing
                    fun _evidenceType(): JsonField<EvidenceType> = evidenceType

                    /**
                     * Returns the raw JSON value of [immutable].
                     *
                     * Unlike [immutable], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("immutable")
                    @ExcludeMissing
                    fun _immutable(): JsonField<Boolean> = immutable

                    /**
                     * Returns the raw JSON value of [renewalCadenceDays].
                     *
                     * Unlike [renewalCadenceDays], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("renewalCadenceDays")
                    @ExcludeMissing
                    fun _renewalCadenceDays(): JsonField<Long> = renewalCadenceDays

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
                         * Returns a mutable builder for constructing an instance of [Rule].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * .scope()
                         * .type()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Rule]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var scope: JsonField<Scope>? = null
                        private var type: JsonField<Type>? = null
                        private var automationParams: JsonField<AutomationParams> = JsonMissing.of()
                        private var automationType: JsonField<String> = JsonMissing.of()
                        private var dateCreated: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var deactivated: JsonField<Boolean> = JsonMissing.of()
                        private var description: JsonField<String> = JsonMissing.of()
                        private var evidenceType: JsonField<EvidenceType> = JsonMissing.of()
                        private var immutable: JsonField<Boolean> = JsonMissing.of()
                        private var renewalCadenceDays: JsonField<Long> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(rule: Rule) = apply {
                            id = rule.id
                            name = rule.name
                            scope = rule.scope
                            type = rule.type
                            automationParams = rule.automationParams
                            automationType = rule.automationType
                            dateCreated = rule.dateCreated
                            dateUpdated = rule.dateUpdated
                            deactivated = rule.deactivated
                            description = rule.description
                            evidenceType = rule.evidenceType
                            immutable = rule.immutable
                            renewalCadenceDays = rule.renewalCadenceDays
                            additionalProperties = rule.additionalProperties.toMutableMap()
                        }

                        /** The rule id. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** The rule name. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /**
                         * Whether the rule is evaluated once for the whole workspace, or once per
                         * project the rule's frameworks apply to.
                         */
                        fun scope(scope: Scope) = scope(JsonField.of(scope))

                        /**
                         * Sets [Builder.scope] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.scope] with a well-typed [Scope] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

                        /**
                         * `platform` rules are evaluated automatically from the state of your
                         * Openlayer workspace. `evidence` rules are satisfied by attaching
                         * evidence.
                         */
                        fun type(type: Type) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [Type] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        /**
                         * Configuration for the platform check, when the automation takes
                         * parameters.
                         */
                        fun automationParams(automationParams: AutomationParams?) =
                            automationParams(JsonField.ofNullable(automationParams))

                        /**
                         * Alias for calling [Builder.automationParams] with
                         * `automationParams.orElse(null)`.
                         */
                        fun automationParams(automationParams: Optional<AutomationParams>) =
                            automationParams(automationParams.getOrNull())

                        /**
                         * Sets [Builder.automationParams] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.automationParams] with a well-typed
                         * [AutomationParams] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun automationParams(automationParams: JsonField<AutomationParams>) =
                            apply {
                                this.automationParams = automationParams
                            }

                        /**
                         * Which workspace signal a platform rule checks, for example
                         * `monitoring_mode_enabled`, `test_setup`, or `project_owner_set`. `null`
                         * for evidence rules.
                         */
                        fun automationType(automationType: String?) =
                            automationType(JsonField.ofNullable(automationType))

                        /**
                         * Alias for calling [Builder.automationType] with
                         * `automationType.orElse(null)`.
                         */
                        fun automationType(automationType: Optional<String>) =
                            automationType(automationType.getOrNull())

                        /**
                         * Sets [Builder.automationType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.automationType] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun automationType(automationType: JsonField<String>) = apply {
                            this.automationType = automationType
                        }

                        /** The creation date. */
                        fun dateCreated(dateCreated: OffsetDateTime) =
                            dateCreated(JsonField.of(dateCreated))

                        /**
                         * Sets [Builder.dateCreated] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dateCreated] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                            this.dateCreated = dateCreated
                        }

                        /** The last update date. */
                        fun dateUpdated(dateUpdated: OffsetDateTime) =
                            dateUpdated(JsonField.of(dateUpdated))

                        /**
                         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dateUpdated] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                            this.dateUpdated = dateUpdated
                        }

                        /** Whether the rule is excluded from compliance calculations. */
                        fun deactivated(deactivated: Boolean) =
                            deactivated(JsonField.of(deactivated))

                        /**
                         * Sets [Builder.deactivated] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.deactivated] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun deactivated(deactivated: JsonField<Boolean>) = apply {
                            this.deactivated = deactivated
                        }

                        /** What the rule requires. */
                        fun description(description: String?) =
                            description(JsonField.ofNullable(description))

                        /**
                         * Alias for calling [Builder.description] with `description.orElse(null)`.
                         */
                        fun description(description: Optional<String>) =
                            description(description.getOrNull())

                        /**
                         * Sets [Builder.description] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.description] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /**
                         * The kind of evidence that satisfies the rule. `null` for platform rules.
                         */
                        fun evidenceType(evidenceType: EvidenceType?) =
                            evidenceType(JsonField.ofNullable(evidenceType))

                        /**
                         * Alias for calling [Builder.evidenceType] with
                         * `evidenceType.orElse(null)`.
                         */
                        fun evidenceType(evidenceType: Optional<EvidenceType>) =
                            evidenceType(evidenceType.getOrNull())

                        /**
                         * Sets [Builder.evidenceType] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.evidenceType] with a well-typed
                         * [EvidenceType] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun evidenceType(evidenceType: JsonField<EvidenceType>) = apply {
                            this.evidenceType = evidenceType
                        }

                        /** Whether the rule is managed by Openlayer and cannot be edited. */
                        fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

                        /**
                         * Sets [Builder.immutable] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.immutable] with a well-typed [Boolean]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun immutable(immutable: JsonField<Boolean>) = apply {
                            this.immutable = immutable
                        }

                        /**
                         * How often evidence must be renewed, in days. Once evidence is older than
                         * this, the rule result becomes `due_soon` and then `failing`.
                         */
                        fun renewalCadenceDays(renewalCadenceDays: Long?) =
                            renewalCadenceDays(JsonField.ofNullable(renewalCadenceDays))

                        /**
                         * Alias for [Builder.renewalCadenceDays].
                         *
                         * This unboxed primitive overload exists for backwards compatibility.
                         */
                        fun renewalCadenceDays(renewalCadenceDays: Long) =
                            renewalCadenceDays(renewalCadenceDays as Long?)

                        /**
                         * Alias for calling [Builder.renewalCadenceDays] with
                         * `renewalCadenceDays.orElse(null)`.
                         */
                        fun renewalCadenceDays(renewalCadenceDays: Optional<Long>) =
                            renewalCadenceDays(renewalCadenceDays.getOrNull())

                        /**
                         * Sets [Builder.renewalCadenceDays] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.renewalCadenceDays] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun renewalCadenceDays(renewalCadenceDays: JsonField<Long>) = apply {
                            this.renewalCadenceDays = renewalCadenceDays
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Rule].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * .scope()
                         * .type()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Rule =
                            Rule(
                                checkRequired("id", id),
                                checkRequired("name", name),
                                checkRequired("scope", scope),
                                checkRequired("type", type),
                                automationParams,
                                automationType,
                                dateCreated,
                                dateUpdated,
                                deactivated,
                                description,
                                evidenceType,
                                immutable,
                                renewalCadenceDays,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OpenlayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Rule = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        name()
                        scope().validate()
                        type().validate()
                        automationParams().ifPresent { it.validate() }
                        automationType()
                        dateCreated()
                        dateUpdated()
                        deactivated()
                        description()
                        evidenceType().ifPresent { it.validate() }
                        immutable()
                        renewalCadenceDays()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (scope.asKnown().getOrNull()?.validity() ?: 0) +
                            (type.asKnown().getOrNull()?.validity() ?: 0) +
                            (automationParams.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (automationType.asKnown().isPresent) 1 else 0) +
                            (if (dateCreated.asKnown().isPresent) 1 else 0) +
                            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                            (if (deactivated.asKnown().isPresent) 1 else 0) +
                            (if (description.asKnown().isPresent) 1 else 0) +
                            (evidenceType.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (immutable.asKnown().isPresent) 1 else 0) +
                            (if (renewalCadenceDays.asKnown().isPresent) 1 else 0)

                    /**
                     * Whether the rule is evaluated once for the whole workspace, or once per
                     * project the rule's frameworks apply to.
                     */
                    class Scope
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PROJECT = of("project")

                            @JvmField val WORKSPACE = of("workspace")

                            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
                        }

                        /** An enum containing [Scope]'s known values. */
                        enum class Known {
                            PROJECT,
                            WORKSPACE,
                        }

                        /**
                         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Scope] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PROJECT,
                            WORKSPACE,
                            /**
                             * An enum member indicating that [Scope] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PROJECT -> Value.PROJECT
                                WORKSPACE -> Value.WORKSPACE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PROJECT -> Known.PROJECT
                                WORKSPACE -> Known.WORKSPACE
                                else -> throw OpenlayerInvalidDataException("Unknown Scope: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OpenlayerInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws OpenlayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Scope = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Scope && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * `platform` rules are evaluated automatically from the state of your Openlayer
                     * workspace. `evidence` rules are satisfied by attaching evidence.
                     */
                    class Type
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val PLATFORM = of("platform")

                            @JvmField val EVIDENCE = of("evidence")

                            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                        }

                        /** An enum containing [Type]'s known values. */
                        enum class Known {
                            PLATFORM,
                            EVIDENCE,
                        }

                        /**
                         * An enum containing [Type]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Type] can contain an unknown value in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            PLATFORM,
                            EVIDENCE,
                            /**
                             * An enum member indicating that [Type] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                PLATFORM -> Value.PLATFORM
                                EVIDENCE -> Value.EVIDENCE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                PLATFORM -> Known.PLATFORM
                                EVIDENCE -> Known.EVIDENCE
                                else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OpenlayerInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws OpenlayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Type = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * Configuration for the platform check, when the automation takes parameters.
                     */
                    class AutomationParams
                    @JsonCreator
                    private constructor(
                        @com.fasterxml.jackson.annotation.JsonValue
                        private val additionalProperties: Map<String, JsonValue>
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [AutomationParams].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [AutomationParams]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(automationParams: AutomationParams) = apply {
                                additionalProperties =
                                    automationParams.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [AutomationParams].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): AutomationParams =
                                AutomationParams(additionalProperties.toImmutable())
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws OpenlayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): AutomationParams = apply {
                            if (validated) {
                                return@apply
                            }

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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            additionalProperties.count { (_, value) ->
                                !value.isNull() && !value.isMissing()
                            }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is AutomationParams &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "AutomationParams{additionalProperties=$additionalProperties}"
                    }

                    /** The kind of evidence that satisfies the rule. `null` for platform rules. */
                    class EvidenceType
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DOCUMENT = of("document")

                            @JvmField val TEXT = of("text")

                            @JvmField val URL = of("url")

                            @JvmField val CATEGORY_VALUE = of("categoryValue")

                            @JvmStatic fun of(value: String) = EvidenceType(JsonField.of(value))
                        }

                        /** An enum containing [EvidenceType]'s known values. */
                        enum class Known {
                            DOCUMENT,
                            TEXT,
                            URL,
                            CATEGORY_VALUE,
                        }

                        /**
                         * An enum containing [EvidenceType]'s known values, as well as an
                         * [_UNKNOWN] member.
                         *
                         * An instance of [EvidenceType] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DOCUMENT,
                            TEXT,
                            URL,
                            CATEGORY_VALUE,
                            /**
                             * An enum member indicating that [EvidenceType] was instantiated with
                             * an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                DOCUMENT -> Value.DOCUMENT
                                TEXT -> Value.TEXT
                                URL -> Value.URL
                                CATEGORY_VALUE -> Value.CATEGORY_VALUE
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                DOCUMENT -> Known.DOCUMENT
                                TEXT -> Known.TEXT
                                URL -> Known.URL
                                CATEGORY_VALUE -> Known.CATEGORY_VALUE
                                else ->
                                    throw OpenlayerInvalidDataException(
                                        "Unknown EvidenceType: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws OpenlayerInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                OpenlayerInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws OpenlayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): EvidenceType = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is EvidenceType && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Rule &&
                            id == other.id &&
                            name == other.name &&
                            scope == other.scope &&
                            type == other.type &&
                            automationParams == other.automationParams &&
                            automationType == other.automationType &&
                            dateCreated == other.dateCreated &&
                            dateUpdated == other.dateUpdated &&
                            deactivated == other.deactivated &&
                            description == other.description &&
                            evidenceType == other.evidenceType &&
                            immutable == other.immutable &&
                            renewalCadenceDays == other.renewalCadenceDays &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            id,
                            name,
                            scope,
                            type,
                            automationParams,
                            automationType,
                            dateCreated,
                            dateUpdated,
                            deactivated,
                            description,
                            evidenceType,
                            immutable,
                            renewalCadenceDays,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Rule{id=$id, name=$name, scope=$scope, type=$type, automationParams=$automationParams, automationType=$automationType, dateCreated=$dateCreated, dateUpdated=$dateUpdated, deactivated=$deactivated, description=$description, evidenceType=$evidenceType, immutable=$immutable, renewalCadenceDays=$renewalCadenceDays, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Subsection &&
                        id == other.id &&
                        number == other.number &&
                        sectionId == other.sectionId &&
                        sortOrder == other.sortOrder &&
                        title == other.title &&
                        ruleCount == other.ruleCount &&
                        rules == other.rules &&
                        text == other.text &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        number,
                        sectionId,
                        sortOrder,
                        title,
                        ruleCount,
                        rules,
                        text,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Subsection{id=$id, number=$number, sectionId=$sectionId, sortOrder=$sortOrder, title=$title, ruleCount=$ruleCount, rules=$rules, text=$text, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Section &&
                    id == other.id &&
                    documentId == other.documentId &&
                    number == other.number &&
                    sortOrder == other.sortOrder &&
                    title == other.title &&
                    ruleCount == other.ruleCount &&
                    rules == other.rules &&
                    subsections == other.subsections &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    documentId,
                    number,
                    sortOrder,
                    title,
                    ruleCount,
                    rules,
                    subsections,
                    text,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Section{id=$id, documentId=$documentId, number=$number, sortOrder=$sortOrder, title=$title, ruleCount=$ruleCount, rules=$rules, subsections=$subsections, text=$text, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                frameworkId == other.frameworkId &&
                title == other.title &&
                sections == other.sections &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                dateCreated,
                dateUpdated,
                frameworkId,
                title,
                sections,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, dateCreated=$dateCreated, dateUpdated=$dateUpdated, frameworkId=$frameworkId, title=$title, sections=$sections, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DocumentListResponse{items=$items, additionalProperties=$additionalProperties}"
}
