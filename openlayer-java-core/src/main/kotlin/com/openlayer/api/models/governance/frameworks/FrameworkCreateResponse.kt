// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

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

class FrameworkCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val dateCreated: JsonField<OffsetDateTime>,
    private val dateUpdated: JsonField<OffsetDateTime>,
    private val enabled: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val workspaceId: JsonField<String>,
    private val avatar: JsonField<Avatar>,
    private val builtInSlug: JsonField<String>,
    private val creatorId: JsonField<String>,
    private val description: JsonField<String>,
    private val extendedDescription: JsonField<ExtendedDescription>,
    private val href: JsonField<String>,
    private val immutable: JsonField<Boolean>,
    private val projectSelector: JsonField<ProjectSelector>,
    private val ruleStats: JsonField<RuleStats>,
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
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("workspaceId")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avatar") @ExcludeMissing avatar: JsonField<Avatar> = JsonMissing.of(),
        @JsonProperty("builtInSlug")
        @ExcludeMissing
        builtInSlug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creatorId") @ExcludeMissing creatorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extendedDescription")
        @ExcludeMissing
        extendedDescription: JsonField<ExtendedDescription> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("immutable") @ExcludeMissing immutable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("projectSelector")
        @ExcludeMissing
        projectSelector: JsonField<ProjectSelector> = JsonMissing.of(),
        @JsonProperty("ruleStats")
        @ExcludeMissing
        ruleStats: JsonField<RuleStats> = JsonMissing.of(),
    ) : this(
        id,
        dateCreated,
        dateUpdated,
        enabled,
        name,
        tags,
        workspaceId,
        avatar,
        builtInSlug,
        creatorId,
        description,
        extendedDescription,
        href,
        immutable,
        projectSelector,
        ruleStats,
        mutableMapOf(),
    )

    /**
     * The framework id.
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
     * Whether the framework is active. Rules of a disabled framework are not evaluated and do not
     * count towards compliance.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /**
     * The framework name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Free-form labels on the framework.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = tags.getRequired("tags")

    /**
     * The id of the workspace the framework belongs to.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = workspaceId.getRequired("workspaceId")

    /**
     * The icon shown for the framework.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatar(): Optional<Avatar> = avatar.getOptional("avatar")

    /**
     * Identifies a framework that ships with Openlayer, for example `eu_ai_act`, `iso_42001`,
     * `nist_ai_rmf`, or `traiga`. `null` for frameworks you create yourself.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun builtInSlug(): Optional<String> = builtInSlug.getOptional("builtInSlug")

    /**
     * The user who created the framework. `null` for built-in frameworks.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

    /**
     * A short description of the framework.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * A longer, rich-text description, as a TipTap JSON document.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedDescription(): Optional<ExtendedDescription> =
        extendedDescription.getOptional("extendedDescription")

    /**
     * A link to the external standard or regulation the framework is based on.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): Optional<String> = href.getOptional("href")

    /**
     * Whether the framework definition is managed by Openlayer and cannot be edited.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun immutable(): Optional<Boolean> = immutable.getOptional("immutable")

    /**
     * Determines which projects the framework applies to. An empty or `null` `match` array applies
     * the framework to every project in the workspace.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectSelector(): Optional<ProjectSelector> =
        projectSelector.getOptional("projectSelector")

    /**
     * Compliance roll-up for the framework. Present only on `GET
     * /workspaces/{workspaceId}/frameworks` when the request sets `includeRuleStats=true`.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ruleStats(): Optional<RuleStats> = ruleStats.getOptional("ruleStats")

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
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspaceId") @ExcludeMissing fun _workspaceId(): JsonField<String> = workspaceId

    /**
     * Returns the raw JSON value of [avatar].
     *
     * Unlike [avatar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar") @ExcludeMissing fun _avatar(): JsonField<Avatar> = avatar

    /**
     * Returns the raw JSON value of [builtInSlug].
     *
     * Unlike [builtInSlug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("builtInSlug") @ExcludeMissing fun _builtInSlug(): JsonField<String> = builtInSlug

    /**
     * Returns the raw JSON value of [creatorId].
     *
     * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [extendedDescription].
     *
     * Unlike [extendedDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("extendedDescription")
    @ExcludeMissing
    fun _extendedDescription(): JsonField<ExtendedDescription> = extendedDescription

    /**
     * Returns the raw JSON value of [href].
     *
     * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

    /**
     * Returns the raw JSON value of [immutable].
     *
     * Unlike [immutable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("immutable") @ExcludeMissing fun _immutable(): JsonField<Boolean> = immutable

    /**
     * Returns the raw JSON value of [projectSelector].
     *
     * Unlike [projectSelector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectSelector")
    @ExcludeMissing
    fun _projectSelector(): JsonField<ProjectSelector> = projectSelector

    /**
     * Returns the raw JSON value of [ruleStats].
     *
     * Unlike [ruleStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleStats") @ExcludeMissing fun _ruleStats(): JsonField<RuleStats> = ruleStats

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
         * Returns a mutable builder for constructing an instance of [FrameworkCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .enabled()
         * .name()
         * .tags()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dateCreated: JsonField<OffsetDateTime>? = null
        private var dateUpdated: JsonField<OffsetDateTime>? = null
        private var enabled: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var workspaceId: JsonField<String>? = null
        private var avatar: JsonField<Avatar> = JsonMissing.of()
        private var builtInSlug: JsonField<String> = JsonMissing.of()
        private var creatorId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var extendedDescription: JsonField<ExtendedDescription> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var immutable: JsonField<Boolean> = JsonMissing.of()
        private var projectSelector: JsonField<ProjectSelector> = JsonMissing.of()
        private var ruleStats: JsonField<RuleStats> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(frameworkCreateResponse: FrameworkCreateResponse) = apply {
            id = frameworkCreateResponse.id
            dateCreated = frameworkCreateResponse.dateCreated
            dateUpdated = frameworkCreateResponse.dateUpdated
            enabled = frameworkCreateResponse.enabled
            name = frameworkCreateResponse.name
            tags = frameworkCreateResponse.tags.map { it.toMutableList() }
            workspaceId = frameworkCreateResponse.workspaceId
            avatar = frameworkCreateResponse.avatar
            builtInSlug = frameworkCreateResponse.builtInSlug
            creatorId = frameworkCreateResponse.creatorId
            description = frameworkCreateResponse.description
            extendedDescription = frameworkCreateResponse.extendedDescription
            href = frameworkCreateResponse.href
            immutable = frameworkCreateResponse.immutable
            projectSelector = frameworkCreateResponse.projectSelector
            ruleStats = frameworkCreateResponse.ruleStats
            additionalProperties = frameworkCreateResponse.additionalProperties.toMutableMap()
        }

        /** The framework id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /**
         * Whether the framework is active. Rules of a disabled framework are not evaluated and do
         * not count towards compliance.
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The framework name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Free-form labels on the framework. */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** The id of the workspace the framework belongs to. */
        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        /** The icon shown for the framework. */
        fun avatar(avatar: Avatar?) = avatar(JsonField.ofNullable(avatar))

        /** Alias for calling [Builder.avatar] with `avatar.orElse(null)`. */
        fun avatar(avatar: Optional<Avatar>) = avatar(avatar.getOrNull())

        /**
         * Sets [Builder.avatar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatar] with a well-typed [Avatar] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avatar(avatar: JsonField<Avatar>) = apply { this.avatar = avatar }

        /**
         * Identifies a framework that ships with Openlayer, for example `eu_ai_act`, `iso_42001`,
         * `nist_ai_rmf`, or `traiga`. `null` for frameworks you create yourself.
         */
        fun builtInSlug(builtInSlug: String?) = builtInSlug(JsonField.ofNullable(builtInSlug))

        /** Alias for calling [Builder.builtInSlug] with `builtInSlug.orElse(null)`. */
        fun builtInSlug(builtInSlug: Optional<String>) = builtInSlug(builtInSlug.getOrNull())

        /**
         * Sets [Builder.builtInSlug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.builtInSlug] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun builtInSlug(builtInSlug: JsonField<String>) = apply { this.builtInSlug = builtInSlug }

        /** The user who created the framework. `null` for built-in frameworks. */
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

        /** A short description of the framework. */
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

        /** A longer, rich-text description, as a TipTap JSON document. */
        fun extendedDescription(extendedDescription: ExtendedDescription?) =
            extendedDescription(JsonField.ofNullable(extendedDescription))

        /**
         * Alias for calling [Builder.extendedDescription] with `extendedDescription.orElse(null)`.
         */
        fun extendedDescription(extendedDescription: Optional<ExtendedDescription>) =
            extendedDescription(extendedDescription.getOrNull())

        /**
         * Sets [Builder.extendedDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedDescription] with a well-typed
         * [ExtendedDescription] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun extendedDescription(extendedDescription: JsonField<ExtendedDescription>) = apply {
            this.extendedDescription = extendedDescription
        }

        /** A link to the external standard or regulation the framework is based on. */
        fun href(href: String?) = href(JsonField.ofNullable(href))

        /** Alias for calling [Builder.href] with `href.orElse(null)`. */
        fun href(href: Optional<String>) = href(href.getOrNull())

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** Whether the framework definition is managed by Openlayer and cannot be edited. */
        fun immutable(immutable: Boolean) = immutable(JsonField.of(immutable))

        /**
         * Sets [Builder.immutable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.immutable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun immutable(immutable: JsonField<Boolean>) = apply { this.immutable = immutable }

        /**
         * Determines which projects the framework applies to. An empty or `null` `match` array
         * applies the framework to every project in the workspace.
         */
        fun projectSelector(projectSelector: ProjectSelector?) =
            projectSelector(JsonField.ofNullable(projectSelector))

        /** Alias for calling [Builder.projectSelector] with `projectSelector.orElse(null)`. */
        fun projectSelector(projectSelector: Optional<ProjectSelector>) =
            projectSelector(projectSelector.getOrNull())

        /**
         * Sets [Builder.projectSelector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectSelector] with a well-typed [ProjectSelector]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun projectSelector(projectSelector: JsonField<ProjectSelector>) = apply {
            this.projectSelector = projectSelector
        }

        /**
         * Compliance roll-up for the framework. Present only on `GET
         * /workspaces/{workspaceId}/frameworks` when the request sets `includeRuleStats=true`.
         */
        fun ruleStats(ruleStats: RuleStats) = ruleStats(JsonField.of(ruleStats))

        /**
         * Sets [Builder.ruleStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ruleStats] with a well-typed [RuleStats] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ruleStats(ruleStats: JsonField<RuleStats>) = apply { this.ruleStats = ruleStats }

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
         * Returns an immutable instance of [FrameworkCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateUpdated()
         * .enabled()
         * .name()
         * .tags()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FrameworkCreateResponse =
            FrameworkCreateResponse(
                checkRequired("id", id),
                checkRequired("dateCreated", dateCreated),
                checkRequired("dateUpdated", dateUpdated),
                checkRequired("enabled", enabled),
                checkRequired("name", name),
                checkRequired("tags", tags).map { it.toImmutable() },
                checkRequired("workspaceId", workspaceId),
                avatar,
                builtInSlug,
                creatorId,
                description,
                extendedDescription,
                href,
                immutable,
                projectSelector,
                ruleStats,
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
    fun validate(): FrameworkCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dateCreated()
        dateUpdated()
        enabled()
        name()
        tags()
        workspaceId()
        avatar().ifPresent { it.validate() }
        builtInSlug()
        creatorId()
        description()
        extendedDescription().ifPresent { it.validate() }
        href()
        immutable()
        projectSelector().ifPresent { it.validate() }
        ruleStats().ifPresent { it.validate() }
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
            (if (dateCreated.asKnown().isPresent) 1 else 0) +
            (if (dateUpdated.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (avatar.asKnown().getOrNull()?.validity() ?: 0) +
            (if (builtInSlug.asKnown().isPresent) 1 else 0) +
            (if (creatorId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (extendedDescription.asKnown().getOrNull()?.validity() ?: 0) +
            (if (href.asKnown().isPresent) 1 else 0) +
            (if (immutable.asKnown().isPresent) 1 else 0) +
            (projectSelector.asKnown().getOrNull()?.validity() ?: 0) +
            (ruleStats.asKnown().getOrNull()?.validity() ?: 0)

    /** The icon shown for the framework. */
    class Avatar
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(type, value, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [Avatar].
             *
             * The following fields are required:
             * ```java
             * .type()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Avatar]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avatar: Avatar) = apply {
                type = avatar.type
                value = avatar.value
                additionalProperties = avatar.additionalProperties.toMutableMap()
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Avatar].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Avatar =
                Avatar(
                    checkRequired("type", type),
                    checkRequired("value", value),
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
        fun validate(): Avatar = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            value()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val EMOJI = of("emoji")

                @JvmField val IMAGE_URL = of("imageUrl")

                @JvmField val BUILTIN_IMAGE = of("builtinImage")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                EMOJI,
                IMAGE_URL,
                BUILTIN_IMAGE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMOJI,
                IMAGE_URL,
                BUILTIN_IMAGE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    EMOJI -> Value.EMOJI
                    IMAGE_URL -> Value.IMAGE_URL
                    BUILTIN_IMAGE -> Value.BUILTIN_IMAGE
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
                    EMOJI -> Known.EMOJI
                    IMAGE_URL -> Known.IMAGE_URL
                    BUILTIN_IMAGE -> Known.BUILTIN_IMAGE
                    else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Avatar &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avatar{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** A longer, rich-text description, as a TipTap JSON document. */
    class ExtendedDescription
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

            /** Returns a mutable builder for constructing an instance of [ExtendedDescription]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExtendedDescription]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extendedDescription: ExtendedDescription) = apply {
                additionalProperties = extendedDescription.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtendedDescription].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtendedDescription =
                ExtendedDescription(additionalProperties.toImmutable())
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
        fun validate(): ExtendedDescription = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExtendedDescription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtendedDescription{additionalProperties=$additionalProperties}"
    }

    /**
     * Determines which projects the framework applies to. An empty or `null` `match` array applies
     * the framework to every project in the workspace.
     */
    class ProjectSelector
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val match: JsonField<List<Match>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("match") @ExcludeMissing match: JsonField<List<Match>> = JsonMissing.of()
        ) : this(match, mutableMapOf())

        /**
         * Match criteria, ANDed together.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun match(): Optional<List<Match>> = match.getOptional("match")

        /**
         * Returns the raw JSON value of [match].
         *
         * Unlike [match], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("match") @ExcludeMissing fun _match(): JsonField<List<Match>> = match

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

            /** Returns a mutable builder for constructing an instance of [ProjectSelector]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProjectSelector]. */
        class Builder internal constructor() {

            private var match: JsonField<MutableList<Match>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(projectSelector: ProjectSelector) = apply {
                match = projectSelector.match.map { it.toMutableList() }
                additionalProperties = projectSelector.additionalProperties.toMutableMap()
            }

            /** Match criteria, ANDed together. */
            fun match(match: List<Match>?) = match(JsonField.ofNullable(match))

            /** Alias for calling [Builder.match] with `match.orElse(null)`. */
            fun match(match: Optional<List<Match>>) = match(match.getOrNull())

            /**
             * Sets [Builder.match] to an arbitrary JSON value.
             *
             * You should usually call [Builder.match] with a well-typed `List<Match>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun match(match: JsonField<List<Match>>) = apply {
                this.match = match.map { it.toMutableList() }
            }

            /**
             * Adds a single [Match] to [Builder.match].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMatch(match: Match) = apply {
                this.match =
                    (this.match ?: JsonField.of(mutableListOf())).also {
                        checkKnown("match", it).add(match)
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
             * Returns an immutable instance of [ProjectSelector].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ProjectSelector =
                ProjectSelector(
                    (match ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): ProjectSelector = apply {
            if (validated) {
                return@apply
            }

            match().ifPresent { it.forEach { it.validate() } }
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
            (match.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Match
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val property: JsonField<Property>,
            private val value: JsonValue,
            private val operator: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("property")
                @ExcludeMissing
                property: JsonField<Property> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<String> = JsonMissing.of(),
            ) : this(property, value, operator, mutableMapOf())

            /**
             * The project property to match against.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun property(): Property = property.getRequired("property")

            /**
             * The value to match against. Pass an array to match any of several values, or `null`
             * to match projects where the property is unset. Omit it for `exists` and `notExists`.
             *
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = match.value().convert(MyClass.class);
             * ```
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

            /**
             * How to compare the project property with `value`. One of `equals`, `notEquals`,
             * `contains`, `notContains`, `startsWith`, `endsWith`, `in`, `notIn`, `greaterThan`,
             * `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`, `equalsIgnoreCase`,
             * `containsIgnoreCase`, `matches`, `exists`, or `notExists`.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun operator(): Optional<String> = operator.getOptional("operator")

            /**
             * Returns the raw JSON value of [property].
             *
             * Unlike [property], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("property")
            @ExcludeMissing
            fun _property(): JsonField<Property> = property

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

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
                 * Returns a mutable builder for constructing an instance of [Match].
                 *
                 * The following fields are required:
                 * ```java
                 * .property()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Match]. */
            class Builder internal constructor() {

                private var property: JsonField<Property>? = null
                private var value: JsonValue? = null
                private var operator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(match: Match) = apply {
                    property = match.property
                    value = match.value
                    operator = match.operator
                    additionalProperties = match.additionalProperties.toMutableMap()
                }

                /** The project property to match against. */
                fun property(property: Property) = property(JsonField.of(property))

                /**
                 * Sets [Builder.property] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.property] with a well-typed [Property] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun property(property: JsonField<Property>) = apply { this.property = property }

                /**
                 * The value to match against. Pass an array to match any of several values, or
                 * `null` to match projects where the property is unset. Omit it for `exists` and
                 * `notExists`.
                 */
                fun value(value: JsonValue) = apply { this.value = value }

                /**
                 * How to compare the project property with `value`. One of `equals`, `notEquals`,
                 * `contains`, `notContains`, `startsWith`, `endsWith`, `in`, `notIn`,
                 * `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`,
                 * `equalsIgnoreCase`, `containsIgnoreCase`, `matches`, `exists`, or `notExists`.
                 */
                fun operator(operator: String) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<String>) = apply { this.operator = operator }

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
                 * Returns an immutable instance of [Match].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .property()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Match =
                    Match(
                        checkRequired("property", property),
                        checkRequired("value", value),
                        operator,
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
            fun validate(): Match = apply {
                if (validated) {
                    return@apply
                }

                property().validate()
                operator()
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
                (property.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (operator.asKnown().isPresent) 1 else 0)

            /** The project property to match against. */
            class Property @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TASK_TYPE = of("taskType")

                    @JvmField val RISK_LEVEL = of("riskLevel")

                    @JvmField val RISK_TOTAL_SCORE = of("riskTotalScore")

                    @JvmField val NAME = of("name")

                    @JvmField val OWNER_ID = of("ownerId")

                    @JvmField val MODEL_TYPES = of("modelTypes")

                    @JvmStatic fun of(value: String) = Property(JsonField.of(value))
                }

                /** An enum containing [Property]'s known values. */
                enum class Known {
                    TASK_TYPE,
                    RISK_LEVEL,
                    RISK_TOTAL_SCORE,
                    NAME,
                    OWNER_ID,
                    MODEL_TYPES,
                }

                /**
                 * An enum containing [Property]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Property] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TASK_TYPE,
                    RISK_LEVEL,
                    RISK_TOTAL_SCORE,
                    NAME,
                    OWNER_ID,
                    MODEL_TYPES,
                    /**
                     * An enum member indicating that [Property] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TASK_TYPE -> Value.TASK_TYPE
                        RISK_LEVEL -> Value.RISK_LEVEL
                        RISK_TOTAL_SCORE -> Value.RISK_TOTAL_SCORE
                        NAME -> Value.NAME
                        OWNER_ID -> Value.OWNER_ID
                        MODEL_TYPES -> Value.MODEL_TYPES
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TASK_TYPE -> Known.TASK_TYPE
                        RISK_LEVEL -> Known.RISK_LEVEL
                        RISK_TOTAL_SCORE -> Known.RISK_TOTAL_SCORE
                        NAME -> Known.NAME
                        OWNER_ID -> Known.OWNER_ID
                        MODEL_TYPES -> Known.MODEL_TYPES
                        else -> throw OpenlayerInvalidDataException("Unknown Property: $value")
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
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OpenlayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Property = apply {
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

                    return other is Property && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Match &&
                    property == other.property &&
                    value == other.value &&
                    operator == other.operator &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(property, value, operator, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Match{property=$property, value=$value, operator=$operator, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProjectSelector &&
                match == other.match &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(match, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProjectSelector{match=$match, additionalProperties=$additionalProperties}"
    }

    /**
     * Compliance roll-up for the framework. Present only on `GET
     * /workspaces/{workspaceId}/frameworks` when the request sets `includeRuleStats=true`.
     */
    class RuleStats
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val projectCompletion: JsonField<ProjectCompletion>,
        private val ruleResults: JsonField<RuleResults>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("projectCompletion")
            @ExcludeMissing
            projectCompletion: JsonField<ProjectCompletion> = JsonMissing.of(),
            @JsonProperty("ruleResults")
            @ExcludeMissing
            ruleResults: JsonField<RuleResults> = JsonMissing.of(),
        ) : this(projectCompletion, ruleResults, mutableMapOf())

        /**
         * How many of the framework's projects fall into each completion band, where a project's
         * completion is the share of its rule results that are passing or skipped. Projects with no
         * evaluated results count as `low`.
         *
         * Zeroed when the request carries `projectId`: the bands compare a framework's projects
         * against each other, which says nothing about a single project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectCompletion(): ProjectCompletion =
            projectCompletion.getRequired("projectCompletion")

        /**
         * Rule result counts by status for this framework, matching what
         * `/workspaces/{workspaceId}/rule-stats?frameworkId=<id>` reports. Narrowed to a single
         * project when the request also carries `projectId`.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ruleResults(): RuleResults = ruleResults.getRequired("ruleResults")

        /**
         * Returns the raw JSON value of [projectCompletion].
         *
         * Unlike [projectCompletion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectCompletion")
        @ExcludeMissing
        fun _projectCompletion(): JsonField<ProjectCompletion> = projectCompletion

        /**
         * Returns the raw JSON value of [ruleResults].
         *
         * Unlike [ruleResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ruleResults")
        @ExcludeMissing
        fun _ruleResults(): JsonField<RuleResults> = ruleResults

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
             * Returns a mutable builder for constructing an instance of [RuleStats].
             *
             * The following fields are required:
             * ```java
             * .projectCompletion()
             * .ruleResults()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RuleStats]. */
        class Builder internal constructor() {

            private var projectCompletion: JsonField<ProjectCompletion>? = null
            private var ruleResults: JsonField<RuleResults>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ruleStats: RuleStats) = apply {
                projectCompletion = ruleStats.projectCompletion
                ruleResults = ruleStats.ruleResults
                additionalProperties = ruleStats.additionalProperties.toMutableMap()
            }

            /**
             * How many of the framework's projects fall into each completion band, where a
             * project's completion is the share of its rule results that are passing or skipped.
             * Projects with no evaluated results count as `low`.
             *
             * Zeroed when the request carries `projectId`: the bands compare a framework's projects
             * against each other, which says nothing about a single project.
             */
            fun projectCompletion(projectCompletion: ProjectCompletion) =
                projectCompletion(JsonField.of(projectCompletion))

            /**
             * Sets [Builder.projectCompletion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectCompletion] with a well-typed
             * [ProjectCompletion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun projectCompletion(projectCompletion: JsonField<ProjectCompletion>) = apply {
                this.projectCompletion = projectCompletion
            }

            /**
             * Rule result counts by status for this framework, matching what
             * `/workspaces/{workspaceId}/rule-stats?frameworkId=<id>` reports. Narrowed to a single
             * project when the request also carries `projectId`.
             */
            fun ruleResults(ruleResults: RuleResults) = ruleResults(JsonField.of(ruleResults))

            /**
             * Sets [Builder.ruleResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleResults] with a well-typed [RuleResults] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleResults(ruleResults: JsonField<RuleResults>) = apply {
                this.ruleResults = ruleResults
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
             * Returns an immutable instance of [RuleStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .projectCompletion()
             * .ruleResults()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RuleStats =
                RuleStats(
                    checkRequired("projectCompletion", projectCompletion),
                    checkRequired("ruleResults", ruleResults),
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
        fun validate(): RuleStats = apply {
            if (validated) {
                return@apply
            }

            projectCompletion().validate()
            ruleResults().validate()
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
            (projectCompletion.asKnown().getOrNull()?.validity() ?: 0) +
                (ruleResults.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * How many of the framework's projects fall into each completion band, where a project's
         * completion is the share of its rule results that are passing or skipped. Projects with no
         * evaluated results count as `low`.
         *
         * Zeroed when the request carries `projectId`: the bands compare a framework's projects
         * against each other, which says nothing about a single project.
         */
        class ProjectCompletion
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val high: JsonField<Long>,
            private val low: JsonField<Long>,
            private val mid: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("high") @ExcludeMissing high: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("low") @ExcludeMissing low: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("mid") @ExcludeMissing mid: JsonField<Long> = JsonMissing.of(),
            ) : this(high, low, mid, mutableMapOf())

            /**
             * Projects at 80% completion or above.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun high(): Long = high.getRequired("high")

            /**
             * Projects below 20% completion.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun low(): Long = low.getRequired("low")

            /**
             * Projects at or above 20% but below 80% completion.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mid(): Long = mid.getRequired("mid")

            /**
             * Returns the raw JSON value of [high].
             *
             * Unlike [high], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("high") @ExcludeMissing fun _high(): JsonField<Long> = high

            /**
             * Returns the raw JSON value of [low].
             *
             * Unlike [low], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("low") @ExcludeMissing fun _low(): JsonField<Long> = low

            /**
             * Returns the raw JSON value of [mid].
             *
             * Unlike [mid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mid") @ExcludeMissing fun _mid(): JsonField<Long> = mid

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
                 * Returns a mutable builder for constructing an instance of [ProjectCompletion].
                 *
                 * The following fields are required:
                 * ```java
                 * .high()
                 * .low()
                 * .mid()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProjectCompletion]. */
            class Builder internal constructor() {

                private var high: JsonField<Long>? = null
                private var low: JsonField<Long>? = null
                private var mid: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(projectCompletion: ProjectCompletion) = apply {
                    high = projectCompletion.high
                    low = projectCompletion.low
                    mid = projectCompletion.mid
                    additionalProperties = projectCompletion.additionalProperties.toMutableMap()
                }

                /** Projects at 80% completion or above. */
                fun high(high: Long) = high(JsonField.of(high))

                /**
                 * Sets [Builder.high] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.high] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun high(high: JsonField<Long>) = apply { this.high = high }

                /** Projects below 20% completion. */
                fun low(low: Long) = low(JsonField.of(low))

                /**
                 * Sets [Builder.low] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.low] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun low(low: JsonField<Long>) = apply { this.low = low }

                /** Projects at or above 20% but below 80% completion. */
                fun mid(mid: Long) = mid(JsonField.of(mid))

                /**
                 * Sets [Builder.mid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mid] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mid(mid: JsonField<Long>) = apply { this.mid = mid }

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
                 * Returns an immutable instance of [ProjectCompletion].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .high()
                 * .low()
                 * .mid()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProjectCompletion =
                    ProjectCompletion(
                        checkRequired("high", high),
                        checkRequired("low", low),
                        checkRequired("mid", mid),
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
            fun validate(): ProjectCompletion = apply {
                if (validated) {
                    return@apply
                }

                high()
                low()
                mid()
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
                (if (high.asKnown().isPresent) 1 else 0) +
                    (if (low.asKnown().isPresent) 1 else 0) +
                    (if (mid.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProjectCompletion &&
                    high == other.high &&
                    low == other.low &&
                    mid == other.mid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(high, low, mid, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProjectCompletion{high=$high, low=$low, mid=$mid, additionalProperties=$additionalProperties}"
        }

        /**
         * Rule result counts by status for this framework, matching what
         * `/workspaces/{workspaceId}/rule-stats?frameworkId=<id>` reports. Narrowed to a single
         * project when the request also carries `projectId`.
         */
        class RuleResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val total: JsonField<Long>,
            private val totalDueSoon: JsonField<Long>,
            private val totalError: JsonField<Long>,
            private val totalFailing: JsonField<Long>,
            private val totalPassing: JsonField<Long>,
            private val totalPending: JsonField<Long>,
            private val totalRunning: JsonField<Long>,
            private val totalSkipped: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalDueSoon")
                @ExcludeMissing
                totalDueSoon: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalError")
                @ExcludeMissing
                totalError: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalFailing")
                @ExcludeMissing
                totalFailing: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalPassing")
                @ExcludeMissing
                totalPassing: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalPending")
                @ExcludeMissing
                totalPending: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalRunning")
                @ExcludeMissing
                totalRunning: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalSkipped")
                @ExcludeMissing
                totalSkipped: JsonField<Long> = JsonMissing.of(),
            ) : this(
                total,
                totalDueSoon,
                totalError,
                totalFailing,
                totalPassing,
                totalPending,
                totalRunning,
                totalSkipped,
                mutableMapOf(),
            )

            /**
             * The total number of rule results.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Long = total.getRequired("total")

            /**
             * The number of rule results whose evidence is about to expire.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalDueSoon(): Long = totalDueSoon.getRequired("totalDueSoon")

            /**
             * The number of rule results that errored during evaluation.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalError(): Long = totalError.getRequired("totalError")

            /**
             * The number of failing rule results.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalFailing(): Long = totalFailing.getRequired("totalFailing")

            /**
             * The number of passing rule results.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalPassing(): Long = totalPassing.getRequired("totalPassing")

            /**
             * The number of rule results that have not been satisfied yet.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalPending(): Long = totalPending.getRequired("totalPending")

            /**
             * The number of rule results currently being evaluated.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalRunning(): Long = totalRunning.getRequired("totalRunning")

            /**
             * The number of skipped rule results.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun totalSkipped(): Long = totalSkipped.getRequired("totalSkipped")

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

            /**
             * Returns the raw JSON value of [totalDueSoon].
             *
             * Unlike [totalDueSoon], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalDueSoon")
            @ExcludeMissing
            fun _totalDueSoon(): JsonField<Long> = totalDueSoon

            /**
             * Returns the raw JSON value of [totalError].
             *
             * Unlike [totalError], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalError")
            @ExcludeMissing
            fun _totalError(): JsonField<Long> = totalError

            /**
             * Returns the raw JSON value of [totalFailing].
             *
             * Unlike [totalFailing], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalFailing")
            @ExcludeMissing
            fun _totalFailing(): JsonField<Long> = totalFailing

            /**
             * Returns the raw JSON value of [totalPassing].
             *
             * Unlike [totalPassing], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalPassing")
            @ExcludeMissing
            fun _totalPassing(): JsonField<Long> = totalPassing

            /**
             * Returns the raw JSON value of [totalPending].
             *
             * Unlike [totalPending], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalPending")
            @ExcludeMissing
            fun _totalPending(): JsonField<Long> = totalPending

            /**
             * Returns the raw JSON value of [totalRunning].
             *
             * Unlike [totalRunning], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalRunning")
            @ExcludeMissing
            fun _totalRunning(): JsonField<Long> = totalRunning

            /**
             * Returns the raw JSON value of [totalSkipped].
             *
             * Unlike [totalSkipped], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalSkipped")
            @ExcludeMissing
            fun _totalSkipped(): JsonField<Long> = totalSkipped

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
                 * Returns a mutable builder for constructing an instance of [RuleResults].
                 *
                 * The following fields are required:
                 * ```java
                 * .total()
                 * .totalDueSoon()
                 * .totalError()
                 * .totalFailing()
                 * .totalPassing()
                 * .totalPending()
                 * .totalRunning()
                 * .totalSkipped()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuleResults]. */
            class Builder internal constructor() {

                private var total: JsonField<Long>? = null
                private var totalDueSoon: JsonField<Long>? = null
                private var totalError: JsonField<Long>? = null
                private var totalFailing: JsonField<Long>? = null
                private var totalPassing: JsonField<Long>? = null
                private var totalPending: JsonField<Long>? = null
                private var totalRunning: JsonField<Long>? = null
                private var totalSkipped: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleResults: RuleResults) = apply {
                    total = ruleResults.total
                    totalDueSoon = ruleResults.totalDueSoon
                    totalError = ruleResults.totalError
                    totalFailing = ruleResults.totalFailing
                    totalPassing = ruleResults.totalPassing
                    totalPending = ruleResults.totalPending
                    totalRunning = ruleResults.totalRunning
                    totalSkipped = ruleResults.totalSkipped
                    additionalProperties = ruleResults.additionalProperties.toMutableMap()
                }

                /** The total number of rule results. */
                fun total(total: Long) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Long>) = apply { this.total = total }

                /** The number of rule results whose evidence is about to expire. */
                fun totalDueSoon(totalDueSoon: Long) = totalDueSoon(JsonField.of(totalDueSoon))

                /**
                 * Sets [Builder.totalDueSoon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalDueSoon] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalDueSoon(totalDueSoon: JsonField<Long>) = apply {
                    this.totalDueSoon = totalDueSoon
                }

                /** The number of rule results that errored during evaluation. */
                fun totalError(totalError: Long) = totalError(JsonField.of(totalError))

                /**
                 * Sets [Builder.totalError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalError] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalError(totalError: JsonField<Long>) = apply { this.totalError = totalError }

                /** The number of failing rule results. */
                fun totalFailing(totalFailing: Long) = totalFailing(JsonField.of(totalFailing))

                /**
                 * Sets [Builder.totalFailing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalFailing] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalFailing(totalFailing: JsonField<Long>) = apply {
                    this.totalFailing = totalFailing
                }

                /** The number of passing rule results. */
                fun totalPassing(totalPassing: Long) = totalPassing(JsonField.of(totalPassing))

                /**
                 * Sets [Builder.totalPassing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalPassing] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalPassing(totalPassing: JsonField<Long>) = apply {
                    this.totalPassing = totalPassing
                }

                /** The number of rule results that have not been satisfied yet. */
                fun totalPending(totalPending: Long) = totalPending(JsonField.of(totalPending))

                /**
                 * Sets [Builder.totalPending] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalPending] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalPending(totalPending: JsonField<Long>) = apply {
                    this.totalPending = totalPending
                }

                /** The number of rule results currently being evaluated. */
                fun totalRunning(totalRunning: Long) = totalRunning(JsonField.of(totalRunning))

                /**
                 * Sets [Builder.totalRunning] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalRunning] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalRunning(totalRunning: JsonField<Long>) = apply {
                    this.totalRunning = totalRunning
                }

                /** The number of skipped rule results. */
                fun totalSkipped(totalSkipped: Long) = totalSkipped(JsonField.of(totalSkipped))

                /**
                 * Sets [Builder.totalSkipped] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalSkipped] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalSkipped(totalSkipped: JsonField<Long>) = apply {
                    this.totalSkipped = totalSkipped
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
                 * Returns an immutable instance of [RuleResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .total()
                 * .totalDueSoon()
                 * .totalError()
                 * .totalFailing()
                 * .totalPassing()
                 * .totalPending()
                 * .totalRunning()
                 * .totalSkipped()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RuleResults =
                    RuleResults(
                        checkRequired("total", total),
                        checkRequired("totalDueSoon", totalDueSoon),
                        checkRequired("totalError", totalError),
                        checkRequired("totalFailing", totalFailing),
                        checkRequired("totalPassing", totalPassing),
                        checkRequired("totalPending", totalPending),
                        checkRequired("totalRunning", totalRunning),
                        checkRequired("totalSkipped", totalSkipped),
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
            fun validate(): RuleResults = apply {
                if (validated) {
                    return@apply
                }

                total()
                totalDueSoon()
                totalError()
                totalFailing()
                totalPassing()
                totalPending()
                totalRunning()
                totalSkipped()
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
                (if (total.asKnown().isPresent) 1 else 0) +
                    (if (totalDueSoon.asKnown().isPresent) 1 else 0) +
                    (if (totalError.asKnown().isPresent) 1 else 0) +
                    (if (totalFailing.asKnown().isPresent) 1 else 0) +
                    (if (totalPassing.asKnown().isPresent) 1 else 0) +
                    (if (totalPending.asKnown().isPresent) 1 else 0) +
                    (if (totalRunning.asKnown().isPresent) 1 else 0) +
                    (if (totalSkipped.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RuleResults &&
                    total == other.total &&
                    totalDueSoon == other.totalDueSoon &&
                    totalError == other.totalError &&
                    totalFailing == other.totalFailing &&
                    totalPassing == other.totalPassing &&
                    totalPending == other.totalPending &&
                    totalRunning == other.totalRunning &&
                    totalSkipped == other.totalSkipped &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    total,
                    totalDueSoon,
                    totalError,
                    totalFailing,
                    totalPassing,
                    totalPending,
                    totalRunning,
                    totalSkipped,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleResults{total=$total, totalDueSoon=$totalDueSoon, totalError=$totalError, totalFailing=$totalFailing, totalPassing=$totalPassing, totalPending=$totalPending, totalRunning=$totalRunning, totalSkipped=$totalSkipped, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RuleStats &&
                projectCompletion == other.projectCompletion &&
                ruleResults == other.ruleResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(projectCompletion, ruleResults, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RuleStats{projectCompletion=$projectCompletion, ruleResults=$ruleResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FrameworkCreateResponse &&
            id == other.id &&
            dateCreated == other.dateCreated &&
            dateUpdated == other.dateUpdated &&
            enabled == other.enabled &&
            name == other.name &&
            tags == other.tags &&
            workspaceId == other.workspaceId &&
            avatar == other.avatar &&
            builtInSlug == other.builtInSlug &&
            creatorId == other.creatorId &&
            description == other.description &&
            extendedDescription == other.extendedDescription &&
            href == other.href &&
            immutable == other.immutable &&
            projectSelector == other.projectSelector &&
            ruleStats == other.ruleStats &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            dateCreated,
            dateUpdated,
            enabled,
            name,
            tags,
            workspaceId,
            avatar,
            builtInSlug,
            creatorId,
            description,
            extendedDescription,
            href,
            immutable,
            projectSelector,
            ruleStats,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FrameworkCreateResponse{id=$id, dateCreated=$dateCreated, dateUpdated=$dateUpdated, enabled=$enabled, name=$name, tags=$tags, workspaceId=$workspaceId, avatar=$avatar, builtInSlug=$builtInSlug, creatorId=$creatorId, description=$description, extendedDescription=$extendedDescription, href=$href, immutable=$immutable, projectSelector=$projectSelector, ruleStats=$ruleStats, additionalProperties=$additionalProperties}"
}
