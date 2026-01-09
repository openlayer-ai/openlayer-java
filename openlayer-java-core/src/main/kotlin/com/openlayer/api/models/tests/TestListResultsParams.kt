// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.tests

import com.openlayer.api.core.Params
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List the test results for a test. */
class TestListResultsParams
private constructor(
    private val testId: String?,
    private val endTimestamp: Double?,
    private val includeInsights: Boolean?,
    private val inferencePipelineId: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val projectVersionId: String?,
    private val startTimestamp: Double?,
    private val status: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun testId(): Optional<String> = Optional.ofNullable(testId)

    /** Filter for results that use data starting before the end timestamp. */
    fun endTimestamp(): Optional<Double> = Optional.ofNullable(endTimestamp)

    /** Include the insights linked to each test result */
    fun includeInsights(): Optional<Boolean> = Optional.ofNullable(includeInsights)

    /** Retrive test results for a specific inference pipeline. */
    fun inferencePipelineId(): Optional<String> = Optional.ofNullable(inferencePipelineId)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Retrive test results for a specific project version. */
    fun projectVersionId(): Optional<String> = Optional.ofNullable(projectVersionId)

    /** Filter for results that use data ending after the start timestamp. */
    fun startTimestamp(): Optional<Double> = Optional.ofNullable(startTimestamp)

    /** Filter by status(es). */
    fun status(): Optional<List<String>> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TestListResultsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [TestListResultsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TestListResultsParams]. */
    class Builder internal constructor() {

        private var testId: String? = null
        private var endTimestamp: Double? = null
        private var includeInsights: Boolean? = null
        private var inferencePipelineId: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var projectVersionId: String? = null
        private var startTimestamp: Double? = null
        private var status: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(testListResultsParams: TestListResultsParams) = apply {
            testId = testListResultsParams.testId
            endTimestamp = testListResultsParams.endTimestamp
            includeInsights = testListResultsParams.includeInsights
            inferencePipelineId = testListResultsParams.inferencePipelineId
            page = testListResultsParams.page
            perPage = testListResultsParams.perPage
            projectVersionId = testListResultsParams.projectVersionId
            startTimestamp = testListResultsParams.startTimestamp
            status = testListResultsParams.status?.toMutableList()
            additionalHeaders = testListResultsParams.additionalHeaders.toBuilder()
            additionalQueryParams = testListResultsParams.additionalQueryParams.toBuilder()
        }

        fun testId(testId: String?) = apply { this.testId = testId }

        /** Alias for calling [Builder.testId] with `testId.orElse(null)`. */
        fun testId(testId: Optional<String>) = testId(testId.getOrNull())

        /** Filter for results that use data starting before the end timestamp. */
        fun endTimestamp(endTimestamp: Double?) = apply { this.endTimestamp = endTimestamp }

        /**
         * Alias for [Builder.endTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun endTimestamp(endTimestamp: Double) = endTimestamp(endTimestamp as Double?)

        /** Alias for calling [Builder.endTimestamp] with `endTimestamp.orElse(null)`. */
        fun endTimestamp(endTimestamp: Optional<Double>) = endTimestamp(endTimestamp.getOrNull())

        /** Include the insights linked to each test result */
        fun includeInsights(includeInsights: Boolean?) = apply {
            this.includeInsights = includeInsights
        }

        /**
         * Alias for [Builder.includeInsights].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeInsights(includeInsights: Boolean) = includeInsights(includeInsights as Boolean?)

        /** Alias for calling [Builder.includeInsights] with `includeInsights.orElse(null)`. */
        fun includeInsights(includeInsights: Optional<Boolean>) =
            includeInsights(includeInsights.getOrNull())

        /** Retrive test results for a specific inference pipeline. */
        fun inferencePipelineId(inferencePipelineId: String?) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /**
         * Alias for calling [Builder.inferencePipelineId] with `inferencePipelineId.orElse(null)`.
         */
        fun inferencePipelineId(inferencePipelineId: Optional<String>) =
            inferencePipelineId(inferencePipelineId.getOrNull())

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

        /** Retrive test results for a specific project version. */
        fun projectVersionId(projectVersionId: String?) = apply {
            this.projectVersionId = projectVersionId
        }

        /** Alias for calling [Builder.projectVersionId] with `projectVersionId.orElse(null)`. */
        fun projectVersionId(projectVersionId: Optional<String>) =
            projectVersionId(projectVersionId.getOrNull())

        /** Filter for results that use data ending after the start timestamp. */
        fun startTimestamp(startTimestamp: Double?) = apply { this.startTimestamp = startTimestamp }

        /**
         * Alias for [Builder.startTimestamp].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun startTimestamp(startTimestamp: Double) = startTimestamp(startTimestamp as Double?)

        /** Alias for calling [Builder.startTimestamp] with `startTimestamp.orElse(null)`. */
        fun startTimestamp(startTimestamp: Optional<Double>) =
            startTimestamp(startTimestamp.getOrNull())

        /** Filter by status(es). */
        fun status(status: List<String>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<String>>) = status(status.getOrNull())

        /**
         * Adds a single [String] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: String) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

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
         * Returns an immutable instance of [TestListResultsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TestListResultsParams =
            TestListResultsParams(
                testId,
                endTimestamp,
                includeInsights,
                inferencePipelineId,
                page,
                perPage,
                projectVersionId,
                startTimestamp,
                status?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> testId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endTimestamp?.let { put("endTimestamp", it.toString()) }
                includeInsights?.let { put("includeInsights", it.toString()) }
                inferencePipelineId?.let { put("inferencePipelineId", it) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                projectVersionId?.let { put("projectVersionId", it) }
                startTimestamp?.let { put("startTimestamp", it.toString()) }
                status?.let { put("status", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TestListResultsParams &&
            testId == other.testId &&
            endTimestamp == other.endTimestamp &&
            includeInsights == other.includeInsights &&
            inferencePipelineId == other.inferencePipelineId &&
            page == other.page &&
            perPage == other.perPage &&
            projectVersionId == other.projectVersionId &&
            startTimestamp == other.startTimestamp &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            testId,
            endTimestamp,
            includeInsights,
            inferencePipelineId,
            page,
            perPage,
            projectVersionId,
            startTimestamp,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TestListResultsParams{testId=$testId, endTimestamp=$endTimestamp, includeInsights=$includeInsights, inferencePipelineId=$inferencePipelineId, page=$page, perPage=$perPage, projectVersionId=$projectVersionId, startTimestamp=$startTimestamp, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
