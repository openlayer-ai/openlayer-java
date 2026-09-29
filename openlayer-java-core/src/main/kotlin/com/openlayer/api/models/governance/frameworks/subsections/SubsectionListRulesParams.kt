// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks.subsections

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

/** List the rules mapped to a document subsection. */
class SubsectionListRulesParams
private constructor(
    private val frameworkId: String,
    private val subsectionId: String?,
    private val includeResults: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val projectId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun frameworkId(): String = frameworkId

    fun subsectionId(): Optional<String> = Optional.ofNullable(subsectionId)

    /** Whether to include each rule's results inline, in a `results` array. */
    fun includeResults(): Optional<Boolean> = Optional.ofNullable(includeResults)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Only include items that apply to this project. */
    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /** Only include items whose rule result has this compliance status. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubsectionListRulesParams].
         *
         * The following fields are required:
         * ```java
         * .frameworkId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubsectionListRulesParams]. */
    class Builder internal constructor() {

        private var frameworkId: String? = null
        private var subsectionId: String? = null
        private var includeResults: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var projectId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subsectionListRulesParams: SubsectionListRulesParams) = apply {
            frameworkId = subsectionListRulesParams.frameworkId
            subsectionId = subsectionListRulesParams.subsectionId
            includeResults = subsectionListRulesParams.includeResults
            page = subsectionListRulesParams.page
            perPage = subsectionListRulesParams.perPage
            projectId = subsectionListRulesParams.projectId
            status = subsectionListRulesParams.status
            additionalHeaders = subsectionListRulesParams.additionalHeaders.toBuilder()
            additionalQueryParams = subsectionListRulesParams.additionalQueryParams.toBuilder()
        }

        fun frameworkId(frameworkId: String) = apply { this.frameworkId = frameworkId }

        fun subsectionId(subsectionId: String?) = apply { this.subsectionId = subsectionId }

        /** Alias for calling [Builder.subsectionId] with `subsectionId.orElse(null)`. */
        fun subsectionId(subsectionId: Optional<String>) = subsectionId(subsectionId.getOrNull())

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

        /** Only include items whose rule result has this compliance status. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [SubsectionListRulesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .frameworkId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubsectionListRulesParams =
            SubsectionListRulesParams(
                checkRequired("frameworkId", frameworkId),
                subsectionId,
                includeResults,
                page,
                perPage,
                projectId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> frameworkId
            1 -> subsectionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeResults?.let { put("includeResults", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                projectId?.let { put("projectId", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubsectionListRulesParams &&
            frameworkId == other.frameworkId &&
            subsectionId == other.subsectionId &&
            includeResults == other.includeResults &&
            page == other.page &&
            perPage == other.perPage &&
            projectId == other.projectId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            frameworkId,
            subsectionId,
            includeResults,
            page,
            perPage,
            projectId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubsectionListRulesParams{frameworkId=$frameworkId, subsectionId=$subsectionId, includeResults=$includeResults, page=$page, perPage=$perPage, projectId=$projectId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
