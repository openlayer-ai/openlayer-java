// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import java.util.Objects
import java.util.Optional

class InferencePipelineTestResultListParams
constructor(
    private val inferencePipelineId: String,
    private val page: Long?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.page?.let { queryParams.put("page", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("perPage", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inferencePipelineId: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inferencePipelineTestResultListParams: InferencePipelineTestResultListParams
        ) = apply {
            inferencePipelineId = inferencePipelineTestResultListParams.inferencePipelineId
            page = inferencePipelineTestResultListParams.page
            perPage = inferencePipelineTestResultListParams.perPage
            status = inferencePipelineTestResultListParams.status
            type = inferencePipelineTestResultListParams.type
            additionalHeaders = inferencePipelineTestResultListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inferencePipelineTestResultListParams.additionalQueryParams.toBuilder()
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** The page to return in a paginated query. */
        fun page(page: Long) = apply { this.page = page }

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Filter list of test results by status. Available statuses are `running`, `passing`,
         * `failing`, `skipped`, and `error`.
         */
        fun status(status: Status) = apply { this.status = status }

        /**
         * Filter objects by test type. Available types are `integrity`, `consistency`,
         * `performance`, `fairness`, and `robustness`.
         */
        fun type(type: Type) = apply { this.type = type }

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

        fun build(): InferencePipelineTestResultListParams =
            InferencePipelineTestResultListParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                page,
                perPage,
                status,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val RUNNING = Status(JsonField.of("running"))

            @JvmField val PASSING = Status(JsonField.of("passing"))

            @JvmField val FAILING = Status(JsonField.of("failing"))

            @JvmField val SKIPPED = Status(JsonField.of("skipped"))

            @JvmField val ERROR = Status(JsonField.of("error"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
        }

        enum class Value {
            RUNNING,
            PASSING,
            FAILING,
            SKIPPED,
            ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                RUNNING -> Value.RUNNING
                PASSING -> Value.PASSING
                FAILING -> Value.FAILING
                SKIPPED -> Value.SKIPPED
                ERROR -> Value.ERROR
                else -> Value._UNKNOWN
            }

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTEGRITY = Type(JsonField.of("integrity"))

            @JvmField val CONSISTENCY = Type(JsonField.of("consistency"))

            @JvmField val PERFORMANCE = Type(JsonField.of("performance"))

            @JvmField val FAIRNESS = Type(JsonField.of("fairness"))

            @JvmField val ROBUSTNESS = Type(JsonField.of("robustness"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
        }

        enum class Value {
            INTEGRITY,
            CONSISTENCY,
            PERFORMANCE,
            FAIRNESS,
            ROBUSTNESS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTEGRITY -> Value.INTEGRITY
                CONSISTENCY -> Value.CONSISTENCY
                PERFORMANCE -> Value.PERFORMANCE
                FAIRNESS -> Value.FAIRNESS
                ROBUSTNESS -> Value.ROBUSTNESS
                else -> Value._UNKNOWN
            }

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineTestResultListParams && inferencePipelineId == other.inferencePipelineId && page == other.page && perPage == other.perPage && status == other.status && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, page, perPage, status, type, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferencePipelineTestResultListParams{inferencePipelineId=$inferencePipelineId, page=$page, perPage=$perPage, status=$status, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
