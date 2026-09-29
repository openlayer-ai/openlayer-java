// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.ruletags

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class RuleTagListResponse
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
         * Returns a mutable builder for constructing an instance of [RuleTagListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleTagListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleTagListResponse: RuleTagListResponse) = apply {
            items = ruleTagListResponse.items.map { it.toMutableList() }
            additionalProperties = ruleTagListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [RuleTagListResponse].
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
        fun build(): RuleTagListResponse =
            RuleTagListResponse(
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
    fun validate(): RuleTagListResponse = apply {
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

    /** A label that groups rules across frameworks, for example by team or control family. */
    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val immutable: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val workspaceId: JsonField<String>,
        private val color: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("immutable")
            @ExcludeMissing
            immutable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("workspaceId")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            immutable,
            name,
            workspaceId,
            color,
            mutableMapOf(),
        )

        /**
         * The rule tag id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The user who created the tag. `null` for tags that ship with Openlayer.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Whether the tag is managed by Openlayer. These tags can't be deleted.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun immutable(): Boolean = immutable.getRequired("immutable")

        /**
         * The tag name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The id of the workspace the tag belongs to.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun workspaceId(): String = workspaceId.getRequired("workspaceId")

        /**
         * The color the tag is displayed with.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun color(): Optional<String> = color.getOptional("color")

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
         * Returns the raw JSON value of [immutable].
         *
         * Unlike [immutable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("immutable") @ExcludeMissing fun _immutable(): JsonField<Boolean> = immutable

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [color].
         *
         * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

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
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .immutable()
             * .name()
             * .workspaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var immutable: JsonField<Boolean>? = null
            private var name: JsonField<String>? = null
            private var workspaceId: JsonField<String>? = null
            private var color: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                id = item.id
                creatorId = item.creatorId
                dateCreated = item.dateCreated
                dateUpdated = item.dateUpdated
                immutable = item.immutable
                name = item.name
                workspaceId = item.workspaceId
                color = item.color
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** The rule tag id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The user who created the tag. `null` for tags that ship with Openlayer. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

            /**
             * Sets [Builder.creatorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

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

            /** Whether the tag is managed by Openlayer. These tags can't be deleted. */
            fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

            /**
             * Sets [Builder.immutable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.immutable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun immutable(immutable: JsonField<Boolean>) = apply { this.immutable = immutable }

            /** The tag name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The id of the workspace the tag belongs to. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
            }

            /** The color the tag is displayed with. */
            fun color(color: String?) = color(JsonField.ofNullable(color))

            /** Alias for calling [Builder.color] with `color.orElse(null)`. */
            fun color(color: Optional<String>) = color(color.getOrNull())

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

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
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .immutable()
             * .name()
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("immutable", immutable),
                    checkRequired("name", name),
                    checkRequired("workspaceId", workspaceId),
                    color,
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
            creatorId()
            dateCreated()
            dateUpdated()
            immutable()
            name()
            workspaceId()
            color()
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
                (if (creatorId.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (immutable.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0) +
                (if (color.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                id == other.id &&
                creatorId == other.creatorId &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                immutable == other.immutable &&
                name == other.name &&
                workspaceId == other.workspaceId &&
                color == other.color &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creatorId,
                dateCreated,
                dateUpdated,
                immutable,
                name,
                workspaceId,
                color,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, immutable=$immutable, name=$name, workspaceId=$workspaceId, color=$color, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleTagListResponse &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleTagListResponse{items=$items, additionalProperties=$additionalProperties}"
}
