// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.Params
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List the governance frameworks in a workspace.
 *
 * A framework is a set of rules -- drawn from a regulation, a standard, or your own internal policy
 * -- that Openlayer tracks compliance against. Use this endpoint to find the framework you want to
 * report on, then read its rules and rule results.
 */
class FrameworkListParams
private constructor(
    private val workspaceId: String?,
    private val asc: Boolean?,
    private val completionOperator: CompletionOperator?,
    private val completionValue: Long?,
    private val enabled: Boolean?,
    private val includeRuleStats: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val projectId: String?,
    private val searchQuery: String?,
    private val sortColumn: SortColumn?,
    private val tags: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /** Whether to sort in ascending order. */
    fun asc(): Optional<Boolean> = Optional.ofNullable(asc)

    /**
     * How to compare each framework's completion percentage with `completionValue`. Must be sent
     * together with `completionValue`.
     */
    fun completionOperator(): Optional<CompletionOperator> = Optional.ofNullable(completionOperator)

    /** The completion percentage to compare against, from 0 to 100. */
    fun completionValue(): Optional<Long> = Optional.ofNullable(completionValue)

    /** Only include frameworks that are enabled (or disabled). */
    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled)

    /**
     * Whether to include a `ruleStats` object on each framework, with its rule result status counts
     * and its per-project completion buckets. Computed over the returned page only.
     */
    fun includeRuleStats(): Optional<Boolean> = Optional.ofNullable(includeRuleStats)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Only include items that apply to this project. */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Filter by a free-text search over names and descriptions. */
    fun searchQuery(): Optional<String> = Optional.ofNullable(searchQuery)

    /** The column to sort on. */
    fun sortColumn(): Optional<SortColumn> = Optional.ofNullable(sortColumn)

    /** Only include frameworks carrying all of these tags. */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FrameworkListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FrameworkListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkListParams]. */
    class Builder internal constructor() {

        private var workspaceId: String? = null
        private var asc: Boolean? = null
        private var completionOperator: CompletionOperator? = null
        private var completionValue: Long? = null
        private var enabled: Boolean? = null
        private var includeRuleStats: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var projectId: String? = null
        private var searchQuery: String? = null
        private var sortColumn: SortColumn? = null
        private var tags: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(frameworkListParams: FrameworkListParams) = apply {
            workspaceId = frameworkListParams.workspaceId
            asc = frameworkListParams.asc
            completionOperator = frameworkListParams.completionOperator
            completionValue = frameworkListParams.completionValue
            enabled = frameworkListParams.enabled
            includeRuleStats = frameworkListParams.includeRuleStats
            page = frameworkListParams.page
            perPage = frameworkListParams.perPage
            projectId = frameworkListParams.projectId
            searchQuery = frameworkListParams.searchQuery
            sortColumn = frameworkListParams.sortColumn
            tags = frameworkListParams.tags?.toMutableList()
            additionalHeaders = frameworkListParams.additionalHeaders.toBuilder()
            additionalQueryParams = frameworkListParams.additionalQueryParams.toBuilder()
        }

        fun workspaceId(workspaceId: String?) = apply { this.workspaceId = workspaceId }

        /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
        fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

        /** Whether to sort in ascending order. */
        fun asc(asc: Boolean?) = apply { this.asc = asc }

        /**
         * Alias for [Builder.asc].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun asc(asc: Boolean) = asc(asc as Boolean?)

        /** Alias for calling [Builder.asc] with `asc.orElse(null)`. */
        fun asc(asc: Optional<Boolean>) = asc(asc.getOrNull())

        /**
         * How to compare each framework's completion percentage with `completionValue`. Must be
         * sent together with `completionValue`.
         */
        fun completionOperator(completionOperator: CompletionOperator?) = apply {
            this.completionOperator = completionOperator
        }

        /**
         * Alias for calling [Builder.completionOperator] with `completionOperator.orElse(null)`.
         */
        fun completionOperator(completionOperator: Optional<CompletionOperator>) =
            completionOperator(completionOperator.getOrNull())

        /** The completion percentage to compare against, from 0 to 100. */
        fun completionValue(completionValue: Long?) = apply {
            this.completionValue = completionValue
        }

        /**
         * Alias for [Builder.completionValue].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun completionValue(completionValue: Long) = completionValue(completionValue as Long?)

        /** Alias for calling [Builder.completionValue] with `completionValue.orElse(null)`. */
        fun completionValue(completionValue: Optional<Long>) =
            completionValue(completionValue.getOrNull())

        /** Only include frameworks that are enabled (or disabled). */
        fun enabled(enabled: Boolean?) = apply { this.enabled = enabled }

        /**
         * Alias for [Builder.enabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

        /** Alias for calling [Builder.enabled] with `enabled.orElse(null)`. */
        fun enabled(enabled: Optional<Boolean>) = enabled(enabled.getOrNull())

        /**
         * Whether to include a `ruleStats` object on each framework, with its rule result status
         * counts and its per-project completion buckets. Computed over the returned page only.
         */
        fun includeRuleStats(includeRuleStats: Boolean?) = apply {
            this.includeRuleStats = includeRuleStats
        }

        /**
         * Alias for [Builder.includeRuleStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeRuleStats(includeRuleStats: Boolean) =
            includeRuleStats(includeRuleStats as Boolean?)

        /** Alias for calling [Builder.includeRuleStats] with `includeRuleStats.orElse(null)`. */
        fun includeRuleStats(includeRuleStats: Optional<Boolean>) =
            includeRuleStats(includeRuleStats.getOrNull())

        /** The page to return in a paginated query. */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        /** Only include items that apply to this project. */
        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /** Filter by a free-text search over names and descriptions. */
        fun searchQuery(searchQuery: String?) = apply { this.searchQuery = searchQuery }

        /** Alias for calling [Builder.searchQuery] with `searchQuery.orElse(null)`. */
        fun searchQuery(searchQuery: Optional<String>) = searchQuery(searchQuery.getOrNull())

        /** The column to sort on. */
        fun sortColumn(sortColumn: SortColumn?) = apply { this.sortColumn = sortColumn }

        /** Alias for calling [Builder.sortColumn] with `sortColumn.orElse(null)`. */
        fun sortColumn(sortColumn: Optional<SortColumn>) = sortColumn(sortColumn.getOrNull())

        /** Only include frameworks carrying all of these tags. */
        fun tags(tags: List<String>?) = apply { this.tags = tags?.toMutableList() }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

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
         * Returns an immutable instance of [FrameworkListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FrameworkListParams =
            FrameworkListParams(
                workspaceId,
                asc,
                completionOperator,
                completionValue,
                enabled,
                includeRuleStats,
                page,
                perPage,
                projectId,
                searchQuery,
                sortColumn,
                tags?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> workspaceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                asc?.let { put("asc", it.toString()) }
                completionOperator?.let { put("completionOperator", it.toString()) }
                completionValue?.let { put("completionValue", it.toString()) }
                enabled?.let { put("enabled", it.toString()) }
                includeRuleStats?.let { put("includeRuleStats", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                projectId?.let { put("projectId", it) }
                searchQuery?.let { put("searchQuery", it) }
                sortColumn?.let { put("sortColumn", it.toString()) }
                tags?.let { put("tags", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * How to compare each framework's completion percentage with `completionValue`. Must be sent
     * together with `completionValue`.
     */
    class CompletionOperator
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IS = of("is")

            @JvmField val GREATER = of(">")

            @JvmField val GREATER_OR_EQUALS = of(">=")

            @JvmField val LESS = of("<")

            @JvmField val LESS_OR_EQUALS = of("<=")

            @JvmField val NOT_EQUALS = of("!=")

            @JvmStatic fun of(value: String) = CompletionOperator(JsonField.of(value))
        }

        /** An enum containing [CompletionOperator]'s known values. */
        enum class Known {
            IS,
            GREATER,
            GREATER_OR_EQUALS,
            LESS,
            LESS_OR_EQUALS,
            NOT_EQUALS,
        }

        /**
         * An enum containing [CompletionOperator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CompletionOperator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
             * An enum member indicating that [CompletionOperator] was instantiated with an unknown
             * value.
             */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                else -> throw OpenlayerInvalidDataException("Unknown CompletionOperator: $value")
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
        fun validate(): CompletionOperator = apply {
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

            return other is CompletionOperator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The column to sort on. */
    class SortColumn @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NAME = of("name")

            @JvmField val ENABLED = of("enabled")

            @JvmField val DATE_CREATED = of("dateCreated")

            @JvmField val DATE_UPDATED = of("dateUpdated")

            @JvmField val OVERALL_COMPLETION = of("overallCompletion")

            @JvmField val PROJECT_COMPLETION_BUCKETS = of("projectCompletionBuckets")

            @JvmStatic fun of(value: String) = SortColumn(JsonField.of(value))
        }

        /** An enum containing [SortColumn]'s known values. */
        enum class Known {
            NAME,
            ENABLED,
            DATE_CREATED,
            DATE_UPDATED,
            OVERALL_COMPLETION,
            PROJECT_COMPLETION_BUCKETS,
        }

        /**
         * An enum containing [SortColumn]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortColumn] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            ENABLED,
            DATE_CREATED,
            DATE_UPDATED,
            OVERALL_COMPLETION,
            PROJECT_COMPLETION_BUCKETS,
            /**
             * An enum member indicating that [SortColumn] was instantiated with an unknown value.
             */
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
                NAME -> Value.NAME
                ENABLED -> Value.ENABLED
                DATE_CREATED -> Value.DATE_CREATED
                DATE_UPDATED -> Value.DATE_UPDATED
                OVERALL_COMPLETION -> Value.OVERALL_COMPLETION
                PROJECT_COMPLETION_BUCKETS -> Value.PROJECT_COMPLETION_BUCKETS
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
                NAME -> Known.NAME
                ENABLED -> Known.ENABLED
                DATE_CREATED -> Known.DATE_CREATED
                DATE_UPDATED -> Known.DATE_UPDATED
                OVERALL_COMPLETION -> Known.OVERALL_COMPLETION
                PROJECT_COMPLETION_BUCKETS -> Known.PROJECT_COMPLETION_BUCKETS
                else -> throw OpenlayerInvalidDataException("Unknown SortColumn: $value")
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
        fun validate(): SortColumn = apply {
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

            return other is SortColumn && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FrameworkListParams &&
            workspaceId == other.workspaceId &&
            asc == other.asc &&
            completionOperator == other.completionOperator &&
            completionValue == other.completionValue &&
            enabled == other.enabled &&
            includeRuleStats == other.includeRuleStats &&
            page == other.page &&
            perPage == other.perPage &&
            projectId == other.projectId &&
            searchQuery == other.searchQuery &&
            sortColumn == other.sortColumn &&
            tags == other.tags &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            workspaceId,
            asc,
            completionOperator,
            completionValue,
            enabled,
            includeRuleStats,
            page,
            perPage,
            projectId,
            searchQuery,
            sortColumn,
            tags,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FrameworkListParams{workspaceId=$workspaceId, asc=$asc, completionOperator=$completionOperator, completionValue=$completionValue, enabled=$enabled, includeRuleStats=$includeRuleStats, page=$page, perPage=$perPage, projectId=$projectId, searchQuery=$searchQuery, sortColumn=$sortColumn, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
