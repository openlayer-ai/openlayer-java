// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toImmutable
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
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun page(): Optional<Long> = Optional.ofNullable(page)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.page?.let { params.put("page", listOf(it.toString())) }
        this.perPage?.let { params.put("perPage", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.type?.let { params.put("type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineTestResultListParams && this.inferencePipelineId == other.inferencePipelineId && this.page == other.page && this.perPage == other.perPage && this.status == other.status && this.type == other.type && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inferencePipelineId, page, perPage, status, type, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "InferencePipelineTestResultListParams{inferencePipelineId=$inferencePipelineId, page=$page, perPage=$perPage, status=$status, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferencePipelineTestResultListParams: InferencePipelineTestResultListParams
        ) = apply {
            this.inferencePipelineId = inferencePipelineTestResultListParams.inferencePipelineId
            this.page = inferencePipelineTestResultListParams.page
            this.perPage = inferencePipelineTestResultListParams.perPage
            this.status = inferencePipelineTestResultListParams.status
            this.type = inferencePipelineTestResultListParams.type
            additionalQueryParams(inferencePipelineTestResultListParams.additionalQueryParams)
            additionalHeaders(inferencePipelineTestResultListParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): InferencePipelineTestResultListParams =
            InferencePipelineTestResultListParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                page,
                perPage,
                status,
                type,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
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

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
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
}
