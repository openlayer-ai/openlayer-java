// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.openlayer.api.core.Params
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get aggregated user data for an inference pipeline with pagination and metadata.
 *
 * Returns a list of users who have interacted with the inference pipeline, including their activity
 * statistics such as session counts, record counts, token usage, and costs.
 */
class InferencePipelineRetrieveUsersParams
private constructor(
    private val inferencePipelineId: String?,
    private val page: Long?,
    private val perPage: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): Optional<String> = Optional.ofNullable(inferencePipelineId)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InferencePipelineRetrieveUsersParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InferencePipelineRetrieveUsersParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineRetrieveUsersParams]. */
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inferencePipelineRetrieveUsersParams: InferencePipelineRetrieveUsersParams
        ) = apply {
            inferencePipelineId = inferencePipelineRetrieveUsersParams.inferencePipelineId
            page = inferencePipelineRetrieveUsersParams.page
            perPage = inferencePipelineRetrieveUsersParams.perPage
            additionalHeaders = inferencePipelineRetrieveUsersParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inferencePipelineRetrieveUsersParams.additionalQueryParams.toBuilder()
        }

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
         * Returns an immutable instance of [InferencePipelineRetrieveUsersParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InferencePipelineRetrieveUsersParams =
            InferencePipelineRetrieveUsersParams(
                inferencePipelineId,
                page,
                perPage,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inferencePipelineId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferencePipelineRetrieveUsersParams &&
            inferencePipelineId == other.inferencePipelineId &&
            page == other.page &&
            perPage == other.perPage &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inferencePipelineId, page, perPage, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InferencePipelineRetrieveUsersParams{inferencePipelineId=$inferencePipelineId, page=$page, perPage=$perPage, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
