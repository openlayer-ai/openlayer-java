// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.Params
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List your workspace's projects. */
class ProjectListParams
private constructor(
    private val name: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val taskType: TaskType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter list of items by project name. */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Filter list of items by task type. */
    fun taskType(): Optional<TaskType> = Optional.ofNullable(taskType)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.name?.let { queryParams.put("name", listOf(it.toString())) }
        this.page?.let { queryParams.put("page", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("perPage", listOf(it.toString())) }
        this.taskType?.let { queryParams.put("taskType", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProjectListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProjectListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var name: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var taskType: TaskType? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectListParams: ProjectListParams) = apply {
            name = projectListParams.name
            page = projectListParams.page
            perPage = projectListParams.perPage
            taskType = projectListParams.taskType
            additionalHeaders = projectListParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectListParams.additionalQueryParams.toBuilder()
        }

        /** Filter list of items by project name. */
        fun name(name: String?) = apply { this.name = name }

        /** Filter list of items by project name. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** The page to return in a paginated query. */
        fun page(page: Long?) = apply { this.page = page }

        /** The page to return in a paginated query. */
        fun page(page: Long) = page(page as Long?)

        /** The page to return in a paginated query. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Maximum number of items to return per page. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        /** Filter list of items by task type. */
        fun taskType(taskType: TaskType?) = apply { this.taskType = taskType }

        /** Filter list of items by task type. */
        fun taskType(taskType: Optional<TaskType>) = taskType(taskType.getOrNull())

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

        fun build(): ProjectListParams =
            ProjectListParams(
                name,
                page,
                perPage,
                taskType,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Filter list of items by task type. */
    class TaskType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LLM_BASE = of("llm-base")

            @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

            @JvmField val TABULAR_REGRESSION = of("tabular-regression")

            @JvmField val TEXT_CLASSIFICATION = of("text-classification")

            @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
        }

        /** An enum containing [TaskType]'s known values. */
        enum class Known {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
        }

        /**
         * An enum containing [TaskType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaskType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
            /** An enum member indicating that [TaskType] was instantiated with an unknown value. */
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
                LLM_BASE -> Value.LLM_BASE
                TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
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
                LLM_BASE -> Known.LLM_BASE
                TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaskType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectListParams && name == other.name && page == other.page && perPage == other.perPage && taskType == other.taskType && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, page, perPage, taskType, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProjectListParams{name=$name, page=$page, perPage=$perPage, taskType=$taskType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
