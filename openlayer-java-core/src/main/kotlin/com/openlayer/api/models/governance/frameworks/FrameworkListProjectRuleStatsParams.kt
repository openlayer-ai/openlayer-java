// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.Params
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List a framework's compliance stats per project. */
class FrameworkListProjectRuleStatsParams
private constructor(
    private val frameworkId: String?,
    private val asc: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val sortColumn: SortColumn?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun frameworkId(): Optional<String> = Optional.ofNullable(frameworkId)

    /** Whether to sort in ascending order. */
    fun asc(): Optional<Boolean> = Optional.ofNullable(asc)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** The column to sort on. */
    fun sortColumn(): Optional<SortColumn> = Optional.ofNullable(sortColumn)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FrameworkListProjectRuleStatsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [FrameworkListProjectRuleStatsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FrameworkListProjectRuleStatsParams]. */
    class Builder internal constructor() {

        private var frameworkId: String? = null
        private var asc: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var sortColumn: SortColumn? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            frameworkListProjectRuleStatsParams: FrameworkListProjectRuleStatsParams
        ) = apply {
            frameworkId = frameworkListProjectRuleStatsParams.frameworkId
            asc = frameworkListProjectRuleStatsParams.asc
            page = frameworkListProjectRuleStatsParams.page
            perPage = frameworkListProjectRuleStatsParams.perPage
            sortColumn = frameworkListProjectRuleStatsParams.sortColumn
            additionalHeaders = frameworkListProjectRuleStatsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                frameworkListProjectRuleStatsParams.additionalQueryParams.toBuilder()
        }

        fun frameworkId(frameworkId: String?) = apply { this.frameworkId = frameworkId }

        /** Alias for calling [Builder.frameworkId] with `frameworkId.orElse(null)`. */
        fun frameworkId(frameworkId: Optional<String>) = frameworkId(frameworkId.getOrNull())

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

        /** The column to sort on. */
        fun sortColumn(sortColumn: SortColumn?) = apply { this.sortColumn = sortColumn }

        /** Alias for calling [Builder.sortColumn] with `sortColumn.orElse(null)`. */
        fun sortColumn(sortColumn: Optional<SortColumn>) = sortColumn(sortColumn.getOrNull())

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
         * Returns an immutable instance of [FrameworkListProjectRuleStatsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FrameworkListProjectRuleStatsParams =
            FrameworkListProjectRuleStatsParams(
                frameworkId,
                asc,
                page,
                perPage,
                sortColumn,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> frameworkId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                asc?.let { put("asc", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                sortColumn?.let { put("sortColumn", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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

            @JvmField val PROJECT_NAME = of("projectName")

            @JvmField val TOTAL = of("total")

            @JvmField val OVERALL_COMPLETION = of("overallCompletion")

            @JvmField val TOTAL_PASSING = of("totalPassing")

            @JvmField val TOTAL_FAILING = of("totalFailing")

            @JvmField val TOTAL_SKIPPED = of("totalSkipped")

            @JvmField val TOTAL_RUNNING = of("totalRunning")

            @JvmField val TOTAL_ERROR = of("totalError")

            @JvmField val TOTAL_PENDING = of("totalPending")

            @JvmField val TOTAL_DUE_SOON = of("totalDueSoon")

            @JvmStatic fun of(value: String) = SortColumn(JsonField.of(value))
        }

        /** An enum containing [SortColumn]'s known values. */
        enum class Known {
            PROJECT_NAME,
            TOTAL,
            OVERALL_COMPLETION,
            TOTAL_PASSING,
            TOTAL_FAILING,
            TOTAL_SKIPPED,
            TOTAL_RUNNING,
            TOTAL_ERROR,
            TOTAL_PENDING,
            TOTAL_DUE_SOON,
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
            PROJECT_NAME,
            TOTAL,
            OVERALL_COMPLETION,
            TOTAL_PASSING,
            TOTAL_FAILING,
            TOTAL_SKIPPED,
            TOTAL_RUNNING,
            TOTAL_ERROR,
            TOTAL_PENDING,
            TOTAL_DUE_SOON,
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
                PROJECT_NAME -> Value.PROJECT_NAME
                TOTAL -> Value.TOTAL
                OVERALL_COMPLETION -> Value.OVERALL_COMPLETION
                TOTAL_PASSING -> Value.TOTAL_PASSING
                TOTAL_FAILING -> Value.TOTAL_FAILING
                TOTAL_SKIPPED -> Value.TOTAL_SKIPPED
                TOTAL_RUNNING -> Value.TOTAL_RUNNING
                TOTAL_ERROR -> Value.TOTAL_ERROR
                TOTAL_PENDING -> Value.TOTAL_PENDING
                TOTAL_DUE_SOON -> Value.TOTAL_DUE_SOON
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
                PROJECT_NAME -> Known.PROJECT_NAME
                TOTAL -> Known.TOTAL
                OVERALL_COMPLETION -> Known.OVERALL_COMPLETION
                TOTAL_PASSING -> Known.TOTAL_PASSING
                TOTAL_FAILING -> Known.TOTAL_FAILING
                TOTAL_SKIPPED -> Known.TOTAL_SKIPPED
                TOTAL_RUNNING -> Known.TOTAL_RUNNING
                TOTAL_ERROR -> Known.TOTAL_ERROR
                TOTAL_PENDING -> Known.TOTAL_PENDING
                TOTAL_DUE_SOON -> Known.TOTAL_DUE_SOON
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

        return other is FrameworkListProjectRuleStatsParams &&
            frameworkId == other.frameworkId &&
            asc == other.asc &&
            page == other.page &&
            perPage == other.perPage &&
            sortColumn == other.sortColumn &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            frameworkId,
            asc,
            page,
            perPage,
            sortColumn,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FrameworkListProjectRuleStatsParams{frameworkId=$frameworkId, asc=$asc, page=$page, perPage=$perPage, sortColumn=$sortColumn, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
