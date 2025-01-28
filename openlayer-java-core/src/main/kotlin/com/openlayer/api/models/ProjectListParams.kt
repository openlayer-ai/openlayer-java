// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional

/** List your workspace's projects. */
class ProjectListParams
private constructor(
    private val name: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val taskType: TaskType?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
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

        @JvmStatic fun builder() = Builder()
    }

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
        fun name(name: Optional<String>) = name(name.orElse(null))

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

        /** Filter list of items by task type. */
        fun taskType(taskType: TaskType?) = apply { this.taskType = taskType }

        /** Filter list of items by task type. */
        fun taskType(taskType: Optional<TaskType>) = taskType(taskType.orElse(null))

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
    class TaskType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LLM_BASE = of("llm-base")

            @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

            @JvmField val TABULAR_REGRESSION = of("tabular-regression")

            @JvmField val TEXT_CLASSIFICATION = of("text-classification")

            @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
        }

        enum class Known {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
        }

        enum class Value {
            LLM_BASE,
            TABULAR_CLASSIFICATION,
            TABULAR_REGRESSION,
            TEXT_CLASSIFICATION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LLM_BASE -> Value.LLM_BASE
                TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LLM_BASE -> Known.LLM_BASE
                TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
