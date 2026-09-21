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
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a custom governance framework in a workspace.
 *
 * Use this to track compliance against an internal policy, or against a standard Openlayer does not
 * ship as a built-in framework. A new framework starts with no rules -- add them from the Openlayer
 * app, or map an existing rule to it.
 *
 * A framework is created disabled unless you pass `enabled: true`. While it is disabled its rules
 * are not evaluated and do not count towards compliance.
 */
class FrameworkCreateParams
private constructor(
    private val workspaceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /**
     * The framework name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * A short description of the framework.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Whether the framework is active. Rules of a disabled framework are not evaluated and do not
     * count towards compliance.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * Determines which projects the framework applies to. An empty or `null` `match` array applies
     * the framework to every project in the workspace.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectSelector(): Optional<ProjectSelector> = body.projectSelector()

    /**
     * Free-form labels on the framework.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [projectSelector].
     *
     * Unlike [projectSelector], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectSelector(): JsonField<ProjectSelector> = body._projectSelector()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FrameworkCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkCreateParams]. */
    class Builder internal constructor() {

        private var workspaceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(frameworkCreateParams: FrameworkCreateParams) = apply {
            workspaceId = frameworkCreateParams.workspaceId
            body = frameworkCreateParams.body.toBuilder()
            additionalHeaders = frameworkCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = frameworkCreateParams.additionalQueryParams.toBuilder()
        }

        fun workspaceId(workspaceId: String?) = apply { this.workspaceId = workspaceId }

        /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [description]
         * - [enabled]
         * - [projectSelector]
         * - [tags]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The framework name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** A short description of the framework. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Whether the framework is active. Rules of a disabled framework are not evaluated and do
         * not count towards compliance.
         */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        /**
         * Determines which projects the framework applies to. An empty or `null` `match` array
         * applies the framework to every project in the workspace.
         */
        fun projectSelector(projectSelector: ProjectSelector?) = apply {
            body.projectSelector(projectSelector)
        }

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
            body.projectSelector(projectSelector)
        }

        /** Free-form labels on the framework. */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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

        /**
         * Returns an immutable instance of [FrameworkCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FrameworkCreateParams =
            FrameworkCreateParams(
                workspaceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> workspaceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val enabled: JsonField<Boolean>,
        private val projectSelector: JsonField<ProjectSelector>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("projectSelector")
            @ExcludeMissing
            projectSelector: JsonField<ProjectSelector> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(name, description, enabled, projectSelector, tags, mutableMapOf())

        /**
         * The framework name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * A short description of the framework.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Whether the framework is active. Rules of a disabled framework are not evaluated and do
         * not count towards compliance.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * Determines which projects the framework applies to. An empty or `null` `match` array
         * applies the framework to every project in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectSelector(): Optional<ProjectSelector> =
            projectSelector.getOptional("projectSelector")

        /**
         * Free-form labels on the framework.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [projectSelector].
         *
         * Unlike [projectSelector], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectSelector")
        @ExcludeMissing
        fun _projectSelector(): JsonField<ProjectSelector> = projectSelector

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var projectSelector: JsonField<ProjectSelector> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                description = body.description
                enabled = body.enabled
                projectSelector = body.projectSelector
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The framework name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** A short description of the framework. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Whether the framework is active. Rules of a disabled framework are not evaluated and
             * do not count towards compliance.
             */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun projectSelector(projectSelector: JsonField<ProjectSelector>) = apply {
                this.projectSelector = projectSelector
            }

            /** Free-form labels on the framework. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    description,
                    enabled,
                    projectSelector,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            description()
            enabled()
            projectSelector().ifPresent { it.validate() }
            tags()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (projectSelector.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                description == other.description &&
                enabled == other.enabled &&
                projectSelector == other.projectSelector &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(name, description, enabled, projectSelector, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, description=$description, enabled=$enabled, projectSelector=$projectSelector, tags=$tags, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FrameworkCreateParams &&
            workspaceId == other.workspaceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(workspaceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FrameworkCreateParams{workspaceId=$workspaceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
