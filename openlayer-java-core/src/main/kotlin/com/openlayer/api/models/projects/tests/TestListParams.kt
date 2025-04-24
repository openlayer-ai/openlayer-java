// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.tests

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List tests under a project. */
class TestListParams
private constructor(
    private val projectId: String,
    private val includeArchived: Boolean?,
    private val originVersionId: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val suggested: Boolean?,
    private val type: Type?,
    private val usesProductionData: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun projectId(): String = projectId

    /** Filter for archived tests. */
    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    /** Retrive tests created by a specific project version. */
    fun originVersionId(): Optional<String> = Optional.ofNullable(originVersionId)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Filter for suggested tests. */
    fun suggested(): Optional<Boolean> = Optional.ofNullable(suggested)

    /**
     * Filter objects by test type. Available types are `integrity`, `consistency`, `performance`,
     * `fairness`, and `robustness`.
     */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** Retrive tests with usesProductionData (monitoring). */
    fun usesProductionData(): Optional<Boolean> = Optional.ofNullable(usesProductionData)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TestListParams].
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestListParams]. */
    class Builder internal constructor() {

        private var projectId: String? = null
        private var includeArchived: Boolean? = null
        private var originVersionId: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var suggested: Boolean? = null
        private var type: Type? = null
        private var usesProductionData: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testListParams: TestListParams) = apply {
            projectId = testListParams.projectId
            includeArchived = testListParams.includeArchived
            originVersionId = testListParams.originVersionId
            page = testListParams.page
            perPage = testListParams.perPage
            suggested = testListParams.suggested
            type = testListParams.type
            usesProductionData = testListParams.usesProductionData
            additionalHeaders = testListParams.additionalHeaders.toBuilder()
            additionalQueryParams = testListParams.additionalQueryParams.toBuilder()
        }

        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /** Filter for archived tests. */
        fun includeArchived(includeArchived: Boolean?) = apply {
            this.includeArchived = includeArchived
        }

        /**
         * Alias for [Builder.includeArchived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeArchived(includeArchived: Boolean) = includeArchived(includeArchived as Boolean?)

        /** Alias for calling [Builder.includeArchived] with `includeArchived.orElse(null)`. */
        fun includeArchived(includeArchived: Optional<Boolean>) =
            includeArchived(includeArchived.getOrNull())

        /** Retrive tests created by a specific project version. */
        fun originVersionId(originVersionId: String?) = apply {
            this.originVersionId = originVersionId
        }

        /** Alias for calling [Builder.originVersionId] with `originVersionId.orElse(null)`. */
        fun originVersionId(originVersionId: Optional<String>) =
            originVersionId(originVersionId.getOrNull())

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

        /** Filter for suggested tests. */
        fun suggested(suggested: Boolean?) = apply { this.suggested = suggested }

        /**
         * Alias for [Builder.suggested].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun suggested(suggested: Boolean) = suggested(suggested as Boolean?)

        /** Alias for calling [Builder.suggested] with `suggested.orElse(null)`. */
        fun suggested(suggested: Optional<Boolean>) = suggested(suggested.getOrNull())

        /**
         * Filter objects by test type. Available types are `integrity`, `consistency`,
         * `performance`, `fairness`, and `robustness`.
         */
        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

        /** Retrive tests with usesProductionData (monitoring). */
        fun usesProductionData(usesProductionData: Boolean?) = apply {
            this.usesProductionData = usesProductionData
        }

        /**
         * Alias for [Builder.usesProductionData].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usesProductionData(usesProductionData: Boolean) =
            usesProductionData(usesProductionData as Boolean?)

        /**
         * Alias for calling [Builder.usesProductionData] with `usesProductionData.orElse(null)`.
         */
        fun usesProductionData(usesProductionData: Optional<Boolean>) =
            usesProductionData(usesProductionData.getOrNull())

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
         * Returns an immutable instance of [TestListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TestListParams =
            TestListParams(
                checkRequired("projectId", projectId),
                includeArchived,
                originVersionId,
                page,
                perPage,
                suggested,
                type,
                usesProductionData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> projectId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeArchived?.let { put("includeArchived", it.toString()) }
                originVersionId?.let { put("originVersionId", it) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                suggested?.let { put("suggested", it.toString()) }
                type?.let { put("type", it.toString()) }
                usesProductionData?.let { put("usesProductionData", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Filter objects by test type. Available types are `integrity`, `consistency`, `performance`,
     * `fairness`, and `robustness`.
     */
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

            @JvmField val INTEGRITY = of("integrity")

            @JvmField val CONSISTENCY = of("consistency")

            @JvmField val PERFORMANCE = of("performance")

            @JvmField val FAIRNESS = of("fairness")

            @JvmField val ROBUSTNESS = of("robustness")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
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
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
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
                INTEGRITY -> Value.INTEGRITY
                CONSISTENCY -> Value.CONSISTENCY
                PERFORMANCE -> Value.PERFORMANCE
                FAIRNESS -> Value.FAIRNESS
                ROBUSTNESS -> Value.ROBUSTNESS
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
                INTEGRITY -> Known.INTEGRITY
                CONSISTENCY -> Known.CONSISTENCY
                PERFORMANCE -> Known.PERFORMANCE
                FAIRNESS -> Known.FAIRNESS
                ROBUSTNESS -> Known.ROBUSTNESS
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TestListParams && projectId == other.projectId && includeArchived == other.includeArchived && originVersionId == other.originVersionId && page == other.page && perPage == other.perPage && suggested == other.suggested && type == other.type && usesProductionData == other.usesProductionData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectId, includeArchived, originVersionId, page, perPage, suggested, type, usesProductionData, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TestListParams{projectId=$projectId, includeArchived=$includeArchived, originVersionId=$originVersionId, page=$page, perPage=$perPage, suggested=$suggested, type=$type, usesProductionData=$usesProductionData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
