// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional

/** List the test results for a project commit (project version). */
class CommitTestResultListParams
private constructor(
    private val projectVersionId: String,
    private val includeArchived: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun projectVersionId(): String = projectVersionId

    /** Include archived goals. */
    fun includeArchived(): Optional<Boolean> = Optional.ofNullable(includeArchived)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /**
     * Filter list of test results by status. Available statuses are `running`, `passing`,
     * `failing`, `skipped`, and `error`.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /**
     * Filter objects by test type. Available types are `integrity`, `consistency`, `performance`,
     * `fairness`, and `robustness`.
     */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.includeArchived?.let { queryParams.put("includeArchived", listOf(it.toString())) }
        this.page?.let { queryParams.put("page", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("perPage", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> projectVersionId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitTestResultListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var projectVersionId: String? = null
        private var includeArchived: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitTestResultListParams: CommitTestResultListParams) = apply {
            projectVersionId = commitTestResultListParams.projectVersionId
            includeArchived = commitTestResultListParams.includeArchived
            page = commitTestResultListParams.page
            perPage = commitTestResultListParams.perPage
            status = commitTestResultListParams.status
            type = commitTestResultListParams.type
            additionalHeaders = commitTestResultListParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitTestResultListParams.additionalQueryParams.toBuilder()
        }

        fun projectVersionId(projectVersionId: String) = apply {
            this.projectVersionId = projectVersionId
        }

        /** Include archived goals. */
        fun includeArchived(includeArchived: Boolean?) = apply {
            this.includeArchived = includeArchived
        }

        /** Include archived goals. */
        fun includeArchived(includeArchived: Boolean) = includeArchived(includeArchived as Boolean?)

        /** Include archived goals. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun includeArchived(includeArchived: Optional<Boolean>) =
            includeArchived(includeArchived.orElse(null) as Boolean?)

        /** The page to return in a paginated query. */
        fun page(page: Long?) = apply { this.page = page }

        /** The page to return in a paginated query. */
        fun page(page: Long) = page(page as Long?)

        /** The page to return in a paginated query. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun page(page: Optional<Long>) = page(page.orElse(null) as Long?)

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Maximum number of items to return per page. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun perPage(perPage: Optional<Long>) = perPage(perPage.orElse(null) as Long?)

        /**
         * Filter list of test results by status. Available statuses are `running`, `passing`,
         * `failing`, `skipped`, and `error`.
         */
        fun status(status: Status?) = apply { this.status = status }

        /**
         * Filter list of test results by status. Available statuses are `running`, `passing`,
         * `failing`, `skipped`, and `error`.
         */
        fun status(status: Optional<Status>) = status(status.orElse(null))

        /**
         * Filter objects by test type. Available types are `integrity`, `consistency`,
         * `performance`, `fairness`, and `robustness`.
         */
        fun type(type: Type?) = apply { this.type = type }

        /**
         * Filter objects by test type. Available types are `integrity`, `consistency`,
         * `performance`, `fairness`, and `robustness`.
         */
        fun type(type: Optional<Type>) = type(type.orElse(null))

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

        fun build(): CommitTestResultListParams =
            CommitTestResultListParams(
                checkRequired("projectVersionId", projectVersionId),
                includeArchived,
                page,
                perPage,
                status,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Filter list of test results by status. Available statuses are `running`, `passing`,
     * `failing`, `skipped`, and `error`.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
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
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Filter objects by test type. Available types are `integrity`, `consistency`, `performance`,
     * `fairness`, and `robustness`.
     */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is CommitTestResultListParams && projectVersionId == other.projectVersionId && includeArchived == other.includeArchived && page == other.page && perPage == other.perPage && status == other.status && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(projectVersionId, includeArchived, page, perPage, status, type, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CommitTestResultListParams{projectVersionId=$projectVersionId, includeArchived=$includeArchived, page=$page, perPage=$perPage, status=$status, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
