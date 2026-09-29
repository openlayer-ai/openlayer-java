// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.rules

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

/** List the rules in a workspace. */
class RuleListParams
private constructor(
    private val workspaceId: String?,
    private val asc: Boolean?,
    private val assigneeId: String?,
    private val deactivated: Boolean?,
    private val enabledFrameworkOnly: Boolean?,
    private val frameworkId: String?,
    private val group: Group?,
    private val includeResults: Boolean?,
    private val includeUnframed: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val projectId: String?,
    private val scope: Scope?,
    private val searchQuery: String?,
    private val sortBy: SortBy?,
    private val status: Status?,
    private val tags: List<String>?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun workspaceId(): Optional<String> = Optional.ofNullable(workspaceId)

    /** Whether to sort in ascending order. */
    fun asc(): Optional<Boolean> = Optional.ofNullable(asc)

    /** Only include rules assigned to this user. */
    fun assigneeId(): Optional<String> = Optional.ofNullable(assigneeId)

    /** Only include rules that are deactivated (or active). */
    fun deactivated(): Optional<Boolean> = Optional.ofNullable(deactivated)

    /** Only include items belonging to at least one enabled framework. */
    fun enabledFrameworkOnly(): Optional<Boolean> = Optional.ofNullable(enabledFrameworkOnly)

    /** Only include items belonging to this framework. */
    fun frameworkId(): Optional<String> = Optional.ofNullable(frameworkId)

    /**
     * Only include rules in one bucket of the compliance workflow. `open` covers rules that still
     * need attention, `done` covers rules that are fully satisfied, and `excluded` covers rules
     * that have been deactivated.
     */
    fun group(): Optional<Group> = Optional.ofNullable(group)

    /** Whether to include each rule's results inline, in a `results` array. */
    fun includeResults(): Optional<Boolean> = Optional.ofNullable(includeResults)

    /** Whether to include rules that are not part of any framework. */
    fun includeUnframed(): Optional<Boolean> = Optional.ofNullable(includeUnframed)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Only include items that apply to this project. */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Only include rules with this scope. */
    fun scope(): Optional<Scope> = Optional.ofNullable(scope)

    /** Filter by a free-text search over names and descriptions. */
    fun searchQuery(): Optional<String> = Optional.ofNullable(searchQuery)

    /** The field to sort on. */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /** Only include items whose rule result has this compliance status. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /**
     * Only include rules carrying all of these rule tags. Pass tag ids, which you can look up with
     * [List rule tags](/api-reference/rest/governance/list-rule-tags).
     */
    fun tags(): Optional<List<String>> = Optional.ofNullable(tags)

    /** Only include rules of this type. */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RuleListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleListParams]. */
    class Builder internal constructor() {

        private var workspaceId: String? = null
        private var asc: Boolean? = null
        private var assigneeId: String? = null
        private var deactivated: Boolean? = null
        private var enabledFrameworkOnly: Boolean? = null
        private var frameworkId: String? = null
        private var group: Group? = null
        private var includeResults: Boolean? = null
        private var includeUnframed: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var projectId: String? = null
        private var scope: Scope? = null
        private var searchQuery: String? = null
        private var sortBy: SortBy? = null
        private var status: Status? = null
        private var tags: MutableList<String>? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleListParams: RuleListParams) = apply {
            workspaceId = ruleListParams.workspaceId
            asc = ruleListParams.asc
            assigneeId = ruleListParams.assigneeId
            deactivated = ruleListParams.deactivated
            enabledFrameworkOnly = ruleListParams.enabledFrameworkOnly
            frameworkId = ruleListParams.frameworkId
            group = ruleListParams.group
            includeResults = ruleListParams.includeResults
            includeUnframed = ruleListParams.includeUnframed
            page = ruleListParams.page
            perPage = ruleListParams.perPage
            projectId = ruleListParams.projectId
            scope = ruleListParams.scope
            searchQuery = ruleListParams.searchQuery
            sortBy = ruleListParams.sortBy
            status = ruleListParams.status
            tags = ruleListParams.tags?.toMutableList()
            type = ruleListParams.type
            additionalHeaders = ruleListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleListParams.additionalQueryParams.toBuilder()
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

        /** Only include rules assigned to this user. */
        fun assigneeId(assigneeId: String?) = apply { this.assigneeId = assigneeId }

        /** Alias for calling [Builder.assigneeId] with `assigneeId.orElse(null)`. */
        fun assigneeId(assigneeId: Optional<String>) = assigneeId(assigneeId.getOrNull())

        /** Only include rules that are deactivated (or active). */
        fun deactivated(deactivated: Boolean?) = apply { this.deactivated = deactivated }

        /**
         * Alias for [Builder.deactivated].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun deactivated(deactivated: Boolean) = deactivated(deactivated as Boolean?)

        /** Alias for calling [Builder.deactivated] with `deactivated.orElse(null)`. */
        fun deactivated(deactivated: Optional<Boolean>) = deactivated(deactivated.getOrNull())

        /** Only include items belonging to at least one enabled framework. */
        fun enabledFrameworkOnly(enabledFrameworkOnly: Boolean?) = apply {
            this.enabledFrameworkOnly = enabledFrameworkOnly
        }

        /**
         * Alias for [Builder.enabledFrameworkOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun enabledFrameworkOnly(enabledFrameworkOnly: Boolean) =
            enabledFrameworkOnly(enabledFrameworkOnly as Boolean?)

        /**
         * Alias for calling [Builder.enabledFrameworkOnly] with
         * `enabledFrameworkOnly.orElse(null)`.
         */
        fun enabledFrameworkOnly(enabledFrameworkOnly: Optional<Boolean>) =
            enabledFrameworkOnly(enabledFrameworkOnly.getOrNull())

        /** Only include items belonging to this framework. */
        fun frameworkId(frameworkId: String?) = apply { this.frameworkId = frameworkId }

        /** Alias for calling [Builder.frameworkId] with `frameworkId.orElse(null)`. */
        fun frameworkId(frameworkId: Optional<String>) = frameworkId(frameworkId.getOrNull())

        /**
         * Only include rules in one bucket of the compliance workflow. `open` covers rules that
         * still need attention, `done` covers rules that are fully satisfied, and `excluded` covers
         * rules that have been deactivated.
         */
        fun group(group: Group?) = apply { this.group = group }

        /** Alias for calling [Builder.group] with `group.orElse(null)`. */
        fun group(group: Optional<Group>) = group(group.getOrNull())

        /** Whether to include each rule's results inline, in a `results` array. */
        fun includeResults(includeResults: Boolean?) = apply {
            this.includeResults = includeResults
        }

        /**
         * Alias for [Builder.includeResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeResults(includeResults: Boolean) = includeResults(includeResults as Boolean?)

        /** Alias for calling [Builder.includeResults] with `includeResults.orElse(null)`. */
        fun includeResults(includeResults: Optional<Boolean>) =
            includeResults(includeResults.getOrNull())

        /** Whether to include rules that are not part of any framework. */
        fun includeUnframed(includeUnframed: Boolean?) = apply {
            this.includeUnframed = includeUnframed
        }

        /**
         * Alias for [Builder.includeUnframed].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUnframed(includeUnframed: Boolean) = includeUnframed(includeUnframed as Boolean?)

        /** Alias for calling [Builder.includeUnframed] with `includeUnframed.orElse(null)`. */
        fun includeUnframed(includeUnframed: Optional<Boolean>) =
            includeUnframed(includeUnframed.getOrNull())

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

        /** Only include rules with this scope. */
        fun scope(scope: Scope?) = apply { this.scope = scope }

        /** Alias for calling [Builder.scope] with `scope.orElse(null)`. */
        fun scope(scope: Optional<Scope>) = scope(scope.getOrNull())

        /** Filter by a free-text search over names and descriptions. */
        fun searchQuery(searchQuery: String?) = apply { this.searchQuery = searchQuery }

        /** Alias for calling [Builder.searchQuery] with `searchQuery.orElse(null)`. */
        fun searchQuery(searchQuery: Optional<String>) = searchQuery(searchQuery.getOrNull())

        /** The field to sort on. */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

        /** Only include items whose rule result has this compliance status. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Only include rules carrying all of these rule tags. Pass tag ids, which you can look up
         * with [List rule tags](/api-reference/rest/governance/list-rule-tags).
         */
        fun tags(tags: List<String>?) = apply { this.tags = tags?.toMutableList() }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<List<String>>) = tags(tags.getOrNull())

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { tags = (tags ?: mutableListOf()).apply { add(tag) } }

        /** Only include rules of this type. */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

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
         * Returns an immutable instance of [RuleListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleListParams =
            RuleListParams(
                workspaceId,
                asc,
                assigneeId,
                deactivated,
                enabledFrameworkOnly,
                frameworkId,
                group,
                includeResults,
                includeUnframed,
                page,
                perPage,
                projectId,
                scope,
                searchQuery,
                sortBy,
                status,
                tags?.toImmutable(),
                type,
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
                assigneeId?.let { put("assigneeId", it) }
                deactivated?.let { put("deactivated", it.toString()) }
                enabledFrameworkOnly?.let { put("enabledFrameworkOnly", it.toString()) }
                frameworkId?.let { put("frameworkId", it) }
                group?.let { put("group", it.toString()) }
                includeResults?.let { put("includeResults", it.toString()) }
                includeUnframed?.let { put("includeUnframed", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                projectId?.let { put("projectId", it) }
                scope?.let { put("scope", it.toString()) }
                searchQuery?.let { put("searchQuery", it) }
                sortBy?.let { put("sortBy", it.toString()) }
                status?.let { put("status", it.toString()) }
                tags?.let { put("tags", it.joinToString(",")) }
                type?.let { put("type", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Only include rules in one bucket of the compliance workflow. `open` covers rules that still
     * need attention, `done` covers rules that are fully satisfied, and `excluded` covers rules
     * that have been deactivated.
     */
    class Group @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPEN = of("open")

            @JvmField val EXCLUDED = of("excluded")

            @JvmField val DONE = of("done")

            @JvmStatic fun of(value: String) = Group(JsonField.of(value))
        }

        /** An enum containing [Group]'s known values. */
        enum class Known {
            OPEN,
            EXCLUDED,
            DONE,
        }

        /**
         * An enum containing [Group]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Group] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            EXCLUDED,
            DONE,
            /** An enum member indicating that [Group] was instantiated with an unknown value. */
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
                OPEN -> Value.OPEN
                EXCLUDED -> Value.EXCLUDED
                DONE -> Value.DONE
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
                OPEN -> Known.OPEN
                EXCLUDED -> Known.EXCLUDED
                DONE -> Known.DONE
                else -> throw OpenlayerInvalidDataException("Unknown Group: $value")
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
        fun validate(): Group = apply {
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

            return other is Group && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only include rules with this scope. */
    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECT,
            WORKSPACE,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
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
                PROJECT -> Value.PROJECT
                WORKSPACE -> Value.WORKSPACE
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
                PROJECT -> Known.PROJECT
                WORKSPACE -> Known.WORKSPACE
                else -> throw OpenlayerInvalidDataException("Unknown Scope: $value")
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The field to sort on. */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STATUS = of("status")

            @JvmField val FRAMEWORKS = of("frameworks")

            @JvmField val SCOPE = of("scope")

            @JvmField val DATE_CREATED = of("dateCreated")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            NAME,
            STATUS,
            FRAMEWORKS,
            SCOPE,
            DATE_CREATED,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NAME,
            STATUS,
            FRAMEWORKS,
            SCOPE,
            DATE_CREATED,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                STATUS -> Value.STATUS
                FRAMEWORKS -> Value.FRAMEWORKS
                SCOPE -> Value.SCOPE
                DATE_CREATED -> Value.DATE_CREATED
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
                STATUS -> Known.STATUS
                FRAMEWORKS -> Known.FRAMEWORKS
                SCOPE -> Known.SCOPE
                DATE_CREATED -> Known.DATE_CREATED
                else -> throw OpenlayerInvalidDataException("Unknown SortBy: $value")
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
        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only include items whose rule result has this compliance status. */
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

            @JvmField val RUNNING = of("running")

            @JvmField val PASSING = of("passing")

            @JvmField val FAILING = of("failing")

            @JvmField val SKIPPED = of("skipped")

            @JvmField val ERROR = of("error")

            @JvmField val PENDING = of("pending")

            @JvmField val DUE_SOON = of("due_soon")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            PENDING,
            DUE_SOON,
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
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            PENDING,
            DUE_SOON,
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
                RUNNING -> Value.RUNNING
                PASSING -> Value.PASSING
                FAILING -> Value.FAILING
                SKIPPED -> Value.SKIPPED
                ERROR -> Value.ERROR
                PENDING -> Value.PENDING
                DUE_SOON -> Value.DUE_SOON
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
                RUNNING -> Known.RUNNING
                PASSING -> Known.PASSING
                FAILING -> Known.FAILING
                SKIPPED -> Known.SKIPPED
                ERROR -> Known.ERROR
                PENDING -> Known.PENDING
                DUE_SOON -> Known.DUE_SOON
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only include rules of this type. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PLATFORM,
            EVIDENCE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PLATFORM -> Value.PLATFORM
                EVIDENCE -> Value.EVIDENCE
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
                PLATFORM -> Known.PLATFORM
                EVIDENCE -> Known.EVIDENCE
                else -> throw OpenlayerInvalidDataException("Unknown Type: $value")
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

        return other is RuleListParams &&
            workspaceId == other.workspaceId &&
            asc == other.asc &&
            assigneeId == other.assigneeId &&
            deactivated == other.deactivated &&
            enabledFrameworkOnly == other.enabledFrameworkOnly &&
            frameworkId == other.frameworkId &&
            group == other.group &&
            includeResults == other.includeResults &&
            includeUnframed == other.includeUnframed &&
            page == other.page &&
            perPage == other.perPage &&
            projectId == other.projectId &&
            scope == other.scope &&
            searchQuery == other.searchQuery &&
            sortBy == other.sortBy &&
            status == other.status &&
            tags == other.tags &&
            type == other.type &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            workspaceId,
            asc,
            assigneeId,
            deactivated,
            enabledFrameworkOnly,
            frameworkId,
            group,
            includeResults,
            includeUnframed,
            page,
            perPage,
            projectId,
            scope,
            searchQuery,
            sortBy,
            status,
            tags,
            type,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RuleListParams{workspaceId=$workspaceId, asc=$asc, assigneeId=$assigneeId, deactivated=$deactivated, enabledFrameworkOnly=$enabledFrameworkOnly, frameworkId=$frameworkId, group=$group, includeResults=$includeResults, includeUnframed=$includeUnframed, page=$page, perPage=$perPage, projectId=$projectId, scope=$scope, searchQuery=$searchQuery, sortBy=$sortBy, status=$status, tags=$tags, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
