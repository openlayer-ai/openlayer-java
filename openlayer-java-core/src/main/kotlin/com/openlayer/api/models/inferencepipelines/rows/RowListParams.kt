// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines.rows

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.allMaxBy
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A list of rows for an inference pipeline. */
class RowListParams
private constructor(
    private val inferencePipelineId: String?,
    private val asc: Boolean?,
    private val page: Long?,
    private val perPage: Long?,
    private val sortColumn: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): Optional<String> = Optional.ofNullable(inferencePipelineId)

    /** Whether or not to sort on the sortColumn in ascending order. */
    fun asc(): Optional<Boolean> = Optional.ofNullable(asc)

    /** The page to return in a paginated query. */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Maximum number of items to return per page. */
    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /** Name of the column to sort on */
    fun sortColumn(): Optional<String> = Optional.ofNullable(sortColumn)

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun columnFilters(): Optional<List<ColumnFilter>> = body.columnFilters()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeRowIdList(): Optional<List<Long>> = body.excludeRowIdList()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notSearchQueryAnd(): Optional<List<String>> = body.notSearchQueryAnd()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun notSearchQueryOr(): Optional<List<String>> = body.notSearchQueryOr()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rowIdList(): Optional<List<Long>> = body.rowIdList()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchQueryAnd(): Optional<List<String>> = body.searchQueryAnd()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchQueryOr(): Optional<List<String>> = body.searchQueryOr()

    /**
     * Returns the raw JSON value of [columnFilters].
     *
     * Unlike [columnFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _columnFilters(): JsonField<List<ColumnFilter>> = body._columnFilters()

    /**
     * Returns the raw JSON value of [excludeRowIdList].
     *
     * Unlike [excludeRowIdList], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _excludeRowIdList(): JsonField<List<Long>> = body._excludeRowIdList()

    /**
     * Returns the raw JSON value of [notSearchQueryAnd].
     *
     * Unlike [notSearchQueryAnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _notSearchQueryAnd(): JsonField<List<String>> = body._notSearchQueryAnd()

    /**
     * Returns the raw JSON value of [notSearchQueryOr].
     *
     * Unlike [notSearchQueryOr], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _notSearchQueryOr(): JsonField<List<String>> = body._notSearchQueryOr()

    /**
     * Returns the raw JSON value of [rowIdList].
     *
     * Unlike [rowIdList], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rowIdList(): JsonField<List<Long>> = body._rowIdList()

    /**
     * Returns the raw JSON value of [searchQueryAnd].
     *
     * Unlike [searchQueryAnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _searchQueryAnd(): JsonField<List<String>> = body._searchQueryAnd()

    /**
     * Returns the raw JSON value of [searchQueryOr].
     *
     * Unlike [searchQueryOr], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _searchQueryOr(): JsonField<List<String>> = body._searchQueryOr()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RowListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RowListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowListParams]. */
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var asc: Boolean? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var sortColumn: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(rowListParams: RowListParams) = apply {
            inferencePipelineId = rowListParams.inferencePipelineId
            asc = rowListParams.asc
            page = rowListParams.page
            perPage = rowListParams.perPage
            sortColumn = rowListParams.sortColumn
            body = rowListParams.body.toBuilder()
            additionalHeaders = rowListParams.additionalHeaders.toBuilder()
            additionalQueryParams = rowListParams.additionalQueryParams.toBuilder()
        }

        fun inferencePipelineId(inferencePipelineId: String?) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /**
         * Alias for calling [Builder.inferencePipelineId] with `inferencePipelineId.orElse(null)`.
         */
        fun inferencePipelineId(inferencePipelineId: Optional<String>) =
            inferencePipelineId(inferencePipelineId.getOrNull())

        /** Whether or not to sort on the sortColumn in ascending order. */
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

        /** Name of the column to sort on */
        fun sortColumn(sortColumn: String?) = apply { this.sortColumn = sortColumn }

        /** Alias for calling [Builder.sortColumn] with `sortColumn.orElse(null)`. */
        fun sortColumn(sortColumn: Optional<String>) = sortColumn(sortColumn.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [columnFilters]
         * - [excludeRowIdList]
         * - [notSearchQueryAnd]
         * - [notSearchQueryOr]
         * - [rowIdList]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun columnFilters(columnFilters: List<ColumnFilter>?) = apply {
            body.columnFilters(columnFilters)
        }

        /** Alias for calling [Builder.columnFilters] with `columnFilters.orElse(null)`. */
        fun columnFilters(columnFilters: Optional<List<ColumnFilter>>) =
            columnFilters(columnFilters.getOrNull())

        /**
         * Sets [Builder.columnFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.columnFilters] with a well-typed `List<ColumnFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun columnFilters(columnFilters: JsonField<List<ColumnFilter>>) = apply {
            body.columnFilters(columnFilters)
        }

        /**
         * Adds a single [ColumnFilter] to [columnFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColumnFilter(columnFilter: ColumnFilter) = apply {
            body.addColumnFilter(columnFilter)
        }

        /** Alias for calling [addColumnFilter] with `ColumnFilter.ofSet(set)`. */
        fun addColumnFilter(set: ColumnFilter.SetColumnFilter) = apply { body.addColumnFilter(set) }

        /** Alias for calling [addColumnFilter] with `ColumnFilter.ofNumeric(numeric)`. */
        fun addColumnFilter(numeric: ColumnFilter.NumericColumnFilter) = apply {
            body.addColumnFilter(numeric)
        }

        /** Alias for calling [addColumnFilter] with `ColumnFilter.ofString(string)`. */
        fun addColumnFilter(string: ColumnFilter.StringColumnFilter) = apply {
            body.addColumnFilter(string)
        }

        fun excludeRowIdList(excludeRowIdList: List<Long>?) = apply {
            body.excludeRowIdList(excludeRowIdList)
        }

        /** Alias for calling [Builder.excludeRowIdList] with `excludeRowIdList.orElse(null)`. */
        fun excludeRowIdList(excludeRowIdList: Optional<List<Long>>) =
            excludeRowIdList(excludeRowIdList.getOrNull())

        /**
         * Sets [Builder.excludeRowIdList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeRowIdList] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeRowIdList(excludeRowIdList: JsonField<List<Long>>) = apply {
            body.excludeRowIdList(excludeRowIdList)
        }

        /**
         * Adds a single [Long] to [Builder.excludeRowIdList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeRowIdList(excludeRowIdList: Long) = apply {
            body.addExcludeRowIdList(excludeRowIdList)
        }

        fun notSearchQueryAnd(notSearchQueryAnd: List<String>?) = apply {
            body.notSearchQueryAnd(notSearchQueryAnd)
        }

        /** Alias for calling [Builder.notSearchQueryAnd] with `notSearchQueryAnd.orElse(null)`. */
        fun notSearchQueryAnd(notSearchQueryAnd: Optional<List<String>>) =
            notSearchQueryAnd(notSearchQueryAnd.getOrNull())

        /**
         * Sets [Builder.notSearchQueryAnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notSearchQueryAnd] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun notSearchQueryAnd(notSearchQueryAnd: JsonField<List<String>>) = apply {
            body.notSearchQueryAnd(notSearchQueryAnd)
        }

        /**
         * Adds a single [String] to [Builder.notSearchQueryAnd].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotSearchQueryAnd(notSearchQueryAnd: String) = apply {
            body.addNotSearchQueryAnd(notSearchQueryAnd)
        }

        fun notSearchQueryOr(notSearchQueryOr: List<String>?) = apply {
            body.notSearchQueryOr(notSearchQueryOr)
        }

        /** Alias for calling [Builder.notSearchQueryOr] with `notSearchQueryOr.orElse(null)`. */
        fun notSearchQueryOr(notSearchQueryOr: Optional<List<String>>) =
            notSearchQueryOr(notSearchQueryOr.getOrNull())

        /**
         * Sets [Builder.notSearchQueryOr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notSearchQueryOr] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notSearchQueryOr(notSearchQueryOr: JsonField<List<String>>) = apply {
            body.notSearchQueryOr(notSearchQueryOr)
        }

        /**
         * Adds a single [String] to [Builder.notSearchQueryOr].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotSearchQueryOr(notSearchQueryOr: String) = apply {
            body.addNotSearchQueryOr(notSearchQueryOr)
        }

        fun rowIdList(rowIdList: List<Long>?) = apply { body.rowIdList(rowIdList) }

        /** Alias for calling [Builder.rowIdList] with `rowIdList.orElse(null)`. */
        fun rowIdList(rowIdList: Optional<List<Long>>) = rowIdList(rowIdList.getOrNull())

        /**
         * Sets [Builder.rowIdList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowIdList] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rowIdList(rowIdList: JsonField<List<Long>>) = apply { body.rowIdList(rowIdList) }

        /**
         * Adds a single [Long] to [Builder.rowIdList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRowIdList(rowIdList: Long) = apply { body.addRowIdList(rowIdList) }

        fun searchQueryAnd(searchQueryAnd: List<String>?) = apply {
            body.searchQueryAnd(searchQueryAnd)
        }

        /** Alias for calling [Builder.searchQueryAnd] with `searchQueryAnd.orElse(null)`. */
        fun searchQueryAnd(searchQueryAnd: Optional<List<String>>) =
            searchQueryAnd(searchQueryAnd.getOrNull())

        /**
         * Sets [Builder.searchQueryAnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchQueryAnd] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchQueryAnd(searchQueryAnd: JsonField<List<String>>) = apply {
            body.searchQueryAnd(searchQueryAnd)
        }

        /**
         * Adds a single [String] to [Builder.searchQueryAnd].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSearchQueryAnd(searchQueryAnd: String) = apply {
            body.addSearchQueryAnd(searchQueryAnd)
        }

        fun searchQueryOr(searchQueryOr: List<String>?) = apply {
            body.searchQueryOr(searchQueryOr)
        }

        /** Alias for calling [Builder.searchQueryOr] with `searchQueryOr.orElse(null)`. */
        fun searchQueryOr(searchQueryOr: Optional<List<String>>) =
            searchQueryOr(searchQueryOr.getOrNull())

        /**
         * Sets [Builder.searchQueryOr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchQueryOr] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchQueryOr(searchQueryOr: JsonField<List<String>>) = apply {
            body.searchQueryOr(searchQueryOr)
        }

        /**
         * Adds a single [String] to [Builder.searchQueryOr].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSearchQueryOr(searchQueryOr: String) = apply { body.addSearchQueryOr(searchQueryOr) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [RowListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RowListParams =
            RowListParams(
                inferencePipelineId,
                asc,
                page,
                perPage,
                sortColumn,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inferencePipelineId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                asc?.let { put("asc", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("perPage", it.toString()) }
                sortColumn?.let { put("sortColumn", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val columnFilters: JsonField<List<ColumnFilter>>,
        private val excludeRowIdList: JsonField<List<Long>>,
        private val notSearchQueryAnd: JsonField<List<String>>,
        private val notSearchQueryOr: JsonField<List<String>>,
        private val rowIdList: JsonField<List<Long>>,
        private val searchQueryAnd: JsonField<List<String>>,
        private val searchQueryOr: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("columnFilters")
            @ExcludeMissing
            columnFilters: JsonField<List<ColumnFilter>> = JsonMissing.of(),
            @JsonProperty("excludeRowIdList")
            @ExcludeMissing
            excludeRowIdList: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("notSearchQueryAnd")
            @ExcludeMissing
            notSearchQueryAnd: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("notSearchQueryOr")
            @ExcludeMissing
            notSearchQueryOr: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rowIdList")
            @ExcludeMissing
            rowIdList: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("searchQueryAnd")
            @ExcludeMissing
            searchQueryAnd: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("searchQueryOr")
            @ExcludeMissing
            searchQueryOr: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            columnFilters,
            excludeRowIdList,
            notSearchQueryAnd,
            notSearchQueryOr,
            rowIdList,
            searchQueryAnd,
            searchQueryOr,
            mutableMapOf(),
        )

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun columnFilters(): Optional<List<ColumnFilter>> =
            columnFilters.getOptional("columnFilters")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludeRowIdList(): Optional<List<Long>> =
            excludeRowIdList.getOptional("excludeRowIdList")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notSearchQueryAnd(): Optional<List<String>> =
            notSearchQueryAnd.getOptional("notSearchQueryAnd")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notSearchQueryOr(): Optional<List<String>> =
            notSearchQueryOr.getOptional("notSearchQueryOr")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rowIdList(): Optional<List<Long>> = rowIdList.getOptional("rowIdList")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun searchQueryAnd(): Optional<List<String>> = searchQueryAnd.getOptional("searchQueryAnd")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun searchQueryOr(): Optional<List<String>> = searchQueryOr.getOptional("searchQueryOr")

        /**
         * Returns the raw JSON value of [columnFilters].
         *
         * Unlike [columnFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("columnFilters")
        @ExcludeMissing
        fun _columnFilters(): JsonField<List<ColumnFilter>> = columnFilters

        /**
         * Returns the raw JSON value of [excludeRowIdList].
         *
         * Unlike [excludeRowIdList], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("excludeRowIdList")
        @ExcludeMissing
        fun _excludeRowIdList(): JsonField<List<Long>> = excludeRowIdList

        /**
         * Returns the raw JSON value of [notSearchQueryAnd].
         *
         * Unlike [notSearchQueryAnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notSearchQueryAnd")
        @ExcludeMissing
        fun _notSearchQueryAnd(): JsonField<List<String>> = notSearchQueryAnd

        /**
         * Returns the raw JSON value of [notSearchQueryOr].
         *
         * Unlike [notSearchQueryOr], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notSearchQueryOr")
        @ExcludeMissing
        fun _notSearchQueryOr(): JsonField<List<String>> = notSearchQueryOr

        /**
         * Returns the raw JSON value of [rowIdList].
         *
         * Unlike [rowIdList], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rowIdList")
        @ExcludeMissing
        fun _rowIdList(): JsonField<List<Long>> = rowIdList

        /**
         * Returns the raw JSON value of [searchQueryAnd].
         *
         * Unlike [searchQueryAnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("searchQueryAnd")
        @ExcludeMissing
        fun _searchQueryAnd(): JsonField<List<String>> = searchQueryAnd

        /**
         * Returns the raw JSON value of [searchQueryOr].
         *
         * Unlike [searchQueryOr], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("searchQueryOr")
        @ExcludeMissing
        fun _searchQueryOr(): JsonField<List<String>> = searchQueryOr

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var columnFilters: JsonField<MutableList<ColumnFilter>>? = null
            private var excludeRowIdList: JsonField<MutableList<Long>>? = null
            private var notSearchQueryAnd: JsonField<MutableList<String>>? = null
            private var notSearchQueryOr: JsonField<MutableList<String>>? = null
            private var rowIdList: JsonField<MutableList<Long>>? = null
            private var searchQueryAnd: JsonField<MutableList<String>>? = null
            private var searchQueryOr: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                columnFilters = body.columnFilters.map { it.toMutableList() }
                excludeRowIdList = body.excludeRowIdList.map { it.toMutableList() }
                notSearchQueryAnd = body.notSearchQueryAnd.map { it.toMutableList() }
                notSearchQueryOr = body.notSearchQueryOr.map { it.toMutableList() }
                rowIdList = body.rowIdList.map { it.toMutableList() }
                searchQueryAnd = body.searchQueryAnd.map { it.toMutableList() }
                searchQueryOr = body.searchQueryOr.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun columnFilters(columnFilters: List<ColumnFilter>?) =
                columnFilters(JsonField.ofNullable(columnFilters))

            /** Alias for calling [Builder.columnFilters] with `columnFilters.orElse(null)`. */
            fun columnFilters(columnFilters: Optional<List<ColumnFilter>>) =
                columnFilters(columnFilters.getOrNull())

            /**
             * Sets [Builder.columnFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.columnFilters] with a well-typed
             * `List<ColumnFilter>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun columnFilters(columnFilters: JsonField<List<ColumnFilter>>) = apply {
                this.columnFilters = columnFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [ColumnFilter] to [columnFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColumnFilter(columnFilter: ColumnFilter) = apply {
                columnFilters =
                    (columnFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("columnFilters", it).add(columnFilter)
                    }
            }

            /** Alias for calling [addColumnFilter] with `ColumnFilter.ofSet(set)`. */
            fun addColumnFilter(set: ColumnFilter.SetColumnFilter) =
                addColumnFilter(ColumnFilter.ofSet(set))

            /** Alias for calling [addColumnFilter] with `ColumnFilter.ofNumeric(numeric)`. */
            fun addColumnFilter(numeric: ColumnFilter.NumericColumnFilter) =
                addColumnFilter(ColumnFilter.ofNumeric(numeric))

            /** Alias for calling [addColumnFilter] with `ColumnFilter.ofString(string)`. */
            fun addColumnFilter(string: ColumnFilter.StringColumnFilter) =
                addColumnFilter(ColumnFilter.ofString(string))

            fun excludeRowIdList(excludeRowIdList: List<Long>?) =
                excludeRowIdList(JsonField.ofNullable(excludeRowIdList))

            /**
             * Alias for calling [Builder.excludeRowIdList] with `excludeRowIdList.orElse(null)`.
             */
            fun excludeRowIdList(excludeRowIdList: Optional<List<Long>>) =
                excludeRowIdList(excludeRowIdList.getOrNull())

            /**
             * Sets [Builder.excludeRowIdList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeRowIdList] with a well-typed `List<Long>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludeRowIdList(excludeRowIdList: JsonField<List<Long>>) = apply {
                this.excludeRowIdList = excludeRowIdList.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.excludeRowIdList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludeRowIdList(excludeRowIdList: Long) = apply {
                this.excludeRowIdList =
                    (this.excludeRowIdList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludeRowIdList", it).add(excludeRowIdList)
                    }
            }

            fun notSearchQueryAnd(notSearchQueryAnd: List<String>?) =
                notSearchQueryAnd(JsonField.ofNullable(notSearchQueryAnd))

            /**
             * Alias for calling [Builder.notSearchQueryAnd] with `notSearchQueryAnd.orElse(null)`.
             */
            fun notSearchQueryAnd(notSearchQueryAnd: Optional<List<String>>) =
                notSearchQueryAnd(notSearchQueryAnd.getOrNull())

            /**
             * Sets [Builder.notSearchQueryAnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notSearchQueryAnd] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notSearchQueryAnd(notSearchQueryAnd: JsonField<List<String>>) = apply {
                this.notSearchQueryAnd = notSearchQueryAnd.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.notSearchQueryAnd].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNotSearchQueryAnd(notSearchQueryAnd: String) = apply {
                this.notSearchQueryAnd =
                    (this.notSearchQueryAnd ?: JsonField.of(mutableListOf())).also {
                        checkKnown("notSearchQueryAnd", it).add(notSearchQueryAnd)
                    }
            }

            fun notSearchQueryOr(notSearchQueryOr: List<String>?) =
                notSearchQueryOr(JsonField.ofNullable(notSearchQueryOr))

            /**
             * Alias for calling [Builder.notSearchQueryOr] with `notSearchQueryOr.orElse(null)`.
             */
            fun notSearchQueryOr(notSearchQueryOr: Optional<List<String>>) =
                notSearchQueryOr(notSearchQueryOr.getOrNull())

            /**
             * Sets [Builder.notSearchQueryOr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notSearchQueryOr] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notSearchQueryOr(notSearchQueryOr: JsonField<List<String>>) = apply {
                this.notSearchQueryOr = notSearchQueryOr.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.notSearchQueryOr].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNotSearchQueryOr(notSearchQueryOr: String) = apply {
                this.notSearchQueryOr =
                    (this.notSearchQueryOr ?: JsonField.of(mutableListOf())).also {
                        checkKnown("notSearchQueryOr", it).add(notSearchQueryOr)
                    }
            }

            fun rowIdList(rowIdList: List<Long>?) = rowIdList(JsonField.ofNullable(rowIdList))

            /** Alias for calling [Builder.rowIdList] with `rowIdList.orElse(null)`. */
            fun rowIdList(rowIdList: Optional<List<Long>>) = rowIdList(rowIdList.getOrNull())

            /**
             * Sets [Builder.rowIdList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rowIdList] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rowIdList(rowIdList: JsonField<List<Long>>) = apply {
                this.rowIdList = rowIdList.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [Builder.rowIdList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRowIdList(rowIdList: Long) = apply {
                this.rowIdList =
                    (this.rowIdList ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rowIdList", it).add(rowIdList)
                    }
            }

            fun searchQueryAnd(searchQueryAnd: List<String>?) =
                searchQueryAnd(JsonField.ofNullable(searchQueryAnd))

            /** Alias for calling [Builder.searchQueryAnd] with `searchQueryAnd.orElse(null)`. */
            fun searchQueryAnd(searchQueryAnd: Optional<List<String>>) =
                searchQueryAnd(searchQueryAnd.getOrNull())

            /**
             * Sets [Builder.searchQueryAnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchQueryAnd] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun searchQueryAnd(searchQueryAnd: JsonField<List<String>>) = apply {
                this.searchQueryAnd = searchQueryAnd.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.searchQueryAnd].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSearchQueryAnd(searchQueryAnd: String) = apply {
                this.searchQueryAnd =
                    (this.searchQueryAnd ?: JsonField.of(mutableListOf())).also {
                        checkKnown("searchQueryAnd", it).add(searchQueryAnd)
                    }
            }

            fun searchQueryOr(searchQueryOr: List<String>?) =
                searchQueryOr(JsonField.ofNullable(searchQueryOr))

            /** Alias for calling [Builder.searchQueryOr] with `searchQueryOr.orElse(null)`. */
            fun searchQueryOr(searchQueryOr: Optional<List<String>>) =
                searchQueryOr(searchQueryOr.getOrNull())

            /**
             * Sets [Builder.searchQueryOr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchQueryOr] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun searchQueryOr(searchQueryOr: JsonField<List<String>>) = apply {
                this.searchQueryOr = searchQueryOr.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.searchQueryOr].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSearchQueryOr(searchQueryOr: String) = apply {
                this.searchQueryOr =
                    (this.searchQueryOr ?: JsonField.of(mutableListOf())).also {
                        checkKnown("searchQueryOr", it).add(searchQueryOr)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (columnFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    (excludeRowIdList ?: JsonMissing.of()).map { it.toImmutable() },
                    (notSearchQueryAnd ?: JsonMissing.of()).map { it.toImmutable() },
                    (notSearchQueryOr ?: JsonMissing.of()).map { it.toImmutable() },
                    (rowIdList ?: JsonMissing.of()).map { it.toImmutable() },
                    (searchQueryAnd ?: JsonMissing.of()).map { it.toImmutable() },
                    (searchQueryOr ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            columnFilters().ifPresent { it.forEach { it.validate() } }
            excludeRowIdList()
            notSearchQueryAnd()
            notSearchQueryOr()
            rowIdList()
            searchQueryAnd()
            searchQueryOr()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (columnFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (excludeRowIdList.asKnown().getOrNull()?.size ?: 0) +
                (notSearchQueryAnd.asKnown().getOrNull()?.size ?: 0) +
                (notSearchQueryOr.asKnown().getOrNull()?.size ?: 0) +
                (rowIdList.asKnown().getOrNull()?.size ?: 0) +
                (searchQueryAnd.asKnown().getOrNull()?.size ?: 0) +
                (searchQueryOr.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                columnFilters == other.columnFilters &&
                excludeRowIdList == other.excludeRowIdList &&
                notSearchQueryAnd == other.notSearchQueryAnd &&
                notSearchQueryOr == other.notSearchQueryOr &&
                rowIdList == other.rowIdList &&
                searchQueryAnd == other.searchQueryAnd &&
                searchQueryOr == other.searchQueryOr &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                columnFilters,
                excludeRowIdList,
                notSearchQueryAnd,
                notSearchQueryOr,
                rowIdList,
                searchQueryAnd,
                searchQueryOr,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{columnFilters=$columnFilters, excludeRowIdList=$excludeRowIdList, notSearchQueryAnd=$notSearchQueryAnd, notSearchQueryOr=$notSearchQueryOr, rowIdList=$rowIdList, searchQueryAnd=$searchQueryAnd, searchQueryOr=$searchQueryOr, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ColumnFilter.Deserializer::class)
    @JsonSerialize(using = ColumnFilter.Serializer::class)
    class ColumnFilter
    private constructor(
        private val set: SetColumnFilter? = null,
        private val numeric: NumericColumnFilter? = null,
        private val string: StringColumnFilter? = null,
        private val _json: JsonValue? = null,
    ) {

        fun set(): Optional<SetColumnFilter> = Optional.ofNullable(set)

        fun numeric(): Optional<NumericColumnFilter> = Optional.ofNullable(numeric)

        fun string(): Optional<StringColumnFilter> = Optional.ofNullable(string)

        fun isSet(): Boolean = set != null

        fun isNumeric(): Boolean = numeric != null

        fun isString(): Boolean = string != null

        fun asSet(): SetColumnFilter = set.getOrThrow("set")

        fun asNumeric(): NumericColumnFilter = numeric.getOrThrow("numeric")

        fun asString(): StringColumnFilter = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                set != null -> visitor.visitSet(set)
                numeric != null -> visitor.visitNumeric(numeric)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ColumnFilter = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitSet(set: SetColumnFilter) {
                        set.validate()
                    }

                    override fun visitNumeric(numeric: NumericColumnFilter) {
                        numeric.validate()
                    }

                    override fun visitString(string: StringColumnFilter) {
                        string.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitSet(set: SetColumnFilter) = set.validity()

                    override fun visitNumeric(numeric: NumericColumnFilter) = numeric.validity()

                    override fun visitString(string: StringColumnFilter) = string.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ColumnFilter &&
                set == other.set &&
                numeric == other.numeric &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(set, numeric, string)

        override fun toString(): String =
            when {
                set != null -> "ColumnFilter{set=$set}"
                numeric != null -> "ColumnFilter{numeric=$numeric}"
                string != null -> "ColumnFilter{string=$string}"
                _json != null -> "ColumnFilter{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ColumnFilter")
            }

        companion object {

            @JvmStatic fun ofSet(set: SetColumnFilter) = ColumnFilter(set = set)

            @JvmStatic fun ofNumeric(numeric: NumericColumnFilter) = ColumnFilter(numeric = numeric)

            @JvmStatic fun ofString(string: StringColumnFilter) = ColumnFilter(string = string)
        }

        /**
         * An interface that defines how to map each variant of [ColumnFilter] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitSet(set: SetColumnFilter): T

            fun visitNumeric(numeric: NumericColumnFilter): T

            fun visitString(string: StringColumnFilter): T

            /**
             * Maps an unknown variant of [ColumnFilter] to a value of type [T].
             *
             * An instance of [ColumnFilter] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OpenlayerInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OpenlayerInvalidDataException("Unknown ColumnFilter: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ColumnFilter>(ColumnFilter::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ColumnFilter {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<SetColumnFilter>())?.let {
                                ColumnFilter(set = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumericColumnFilter>())?.let {
                                ColumnFilter(numeric = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<StringColumnFilter>())?.let {
                                ColumnFilter(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ColumnFilter(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ColumnFilter>(ColumnFilter::class) {

            override fun serialize(
                value: ColumnFilter,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.set != null -> generator.writeObject(value.set)
                    value.numeric != null -> generator.writeObject(value.numeric)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ColumnFilter")
                }
            }
        }

        class SetColumnFilter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val measurement: JsonField<String>,
            private val operator: JsonField<Operator>,
            private val value: JsonField<List<Value>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("measurement")
                @ExcludeMissing
                measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("value")
                @ExcludeMissing
                value: JsonField<List<Value>> = JsonMissing.of(),
            ) : this(measurement, operator, value, mutableMapOf())

            /**
             * The name of the column.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun measurement(): String = measurement.getRequired("measurement")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): List<Value> = value.getRequired("value")

            /**
             * Returns the raw JSON value of [measurement].
             *
             * Unlike [measurement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("measurement")
            @ExcludeMissing
            fun _measurement(): JsonField<String> = measurement

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<List<Value>> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SetColumnFilter].
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SetColumnFilter]. */
            class Builder internal constructor() {

                private var measurement: JsonField<String>? = null
                private var operator: JsonField<Operator>? = null
                private var value: JsonField<MutableList<Value>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(setColumnFilter: SetColumnFilter) = apply {
                    measurement = setColumnFilter.measurement
                    operator = setColumnFilter.operator
                    value = setColumnFilter.value.map { it.toMutableList() }
                    additionalProperties = setColumnFilter.additionalProperties.toMutableMap()
                }

                /** The name of the column. */
                fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                /**
                 * Sets [Builder.measurement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.measurement] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun measurement(measurement: JsonField<String>) = apply {
                    this.measurement = measurement
                }

                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun value(value: List<Value>) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed `List<Value>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun value(value: JsonField<List<Value>>) = apply {
                    this.value = value.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Value] to [Builder.value].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: Value) = apply {
                    this.value =
                        (this.value ?: JsonField.of(mutableListOf())).also {
                            checkKnown("value", it).add(value)
                        }
                }

                /** Alias for calling [addValue] with `Value.ofString(string)`. */
                fun addValue(string: String) = addValue(Value.ofString(string))

                /** Alias for calling [addValue] with `Value.ofNumber(number)`. */
                fun addValue(number: Double) = addValue(Value.ofNumber(number))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SetColumnFilter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SetColumnFilter =
                    SetColumnFilter(
                        checkRequired("measurement", measurement),
                        checkRequired("operator", operator),
                        checkRequired("value", value).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SetColumnFilter = apply {
                if (validated) {
                    return@apply
                }

                measurement()
                operator().validate()
                value().forEach { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (measurement.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (value.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONTAINS_NONE = of("contains_none")

                    @JvmField val CONTAINS_ANY = of("contains_any")

                    @JvmField val CONTAINS_ALL = of("contains_all")

                    @JvmField val ONE_OF = of("one_of")

                    @JvmField val NONE_OF = of("none_of")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    CONTAINS_NONE,
                    CONTAINS_ANY,
                    CONTAINS_ALL,
                    ONE_OF,
                    NONE_OF,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTAINS_NONE,
                    CONTAINS_ANY,
                    CONTAINS_ALL,
                    ONE_OF,
                    NONE_OF,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONTAINS_NONE -> Value.CONTAINS_NONE
                        CONTAINS_ANY -> Value.CONTAINS_ANY
                        CONTAINS_ALL -> Value.CONTAINS_ALL
                        ONE_OF -> Value.ONE_OF
                        NONE_OF -> Value.NONE_OF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONTAINS_NONE -> Known.CONTAINS_NONE
                        CONTAINS_ANY -> Known.CONTAINS_ANY
                        CONTAINS_ALL -> Known.CONTAINS_ALL
                        ONE_OF -> Known.ONE_OF
                        NONE_OF -> Known.NONE_OF
                        else -> throw OpenlayerInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val string: String? = null,
                private val number: Double? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun number(): Optional<Double> = Optional.ofNullable(number)

                fun isString(): Boolean = string != null

                fun isNumber(): Boolean = number != null

                fun asString(): String = string.getOrThrow("string")

                fun asNumber(): Double = number.getOrThrow("number")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        number != null -> visitor.visitNumber(number)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitNumber(number: Double) {}
                        }
                    )
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
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitNumber(number: Double) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value && string == other.string && number == other.number
                }

                override fun hashCode(): Int = Objects.hash(string, number)

                override fun toString(): String =
                    when {
                        string != null -> "Value{string=$string}"
                        number != null -> "Value{number=$number}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Value(string = string)

                    @JvmStatic fun ofNumber(number: Double) = Value(number = number)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitNumber(number: Double): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws OpenlayerInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw OpenlayerInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                        Value(number = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.number != null -> generator.writeObject(value.number)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SetColumnFilter &&
                    measurement == other.measurement &&
                    operator == other.operator &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(measurement, operator, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SetColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
        }

        class NumericColumnFilter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val measurement: JsonField<String>,
            private val operator: JsonField<Operator>,
            private val value: JsonField<Float>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("measurement")
                @ExcludeMissing
                measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Float> = JsonMissing.of(),
            ) : this(measurement, operator, value, mutableMapOf())

            /**
             * The name of the column.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun measurement(): String = measurement.getRequired("measurement")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun value(): Optional<Float> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [measurement].
             *
             * Unlike [measurement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("measurement")
            @ExcludeMissing
            fun _measurement(): JsonField<String> = measurement

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Float> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NumericColumnFilter].
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NumericColumnFilter]. */
            class Builder internal constructor() {

                private var measurement: JsonField<String>? = null
                private var operator: JsonField<Operator>? = null
                private var value: JsonField<Float>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(numericColumnFilter: NumericColumnFilter) = apply {
                    measurement = numericColumnFilter.measurement
                    operator = numericColumnFilter.operator
                    value = numericColumnFilter.value
                    additionalProperties = numericColumnFilter.additionalProperties.toMutableMap()
                }

                /** The name of the column. */
                fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                /**
                 * Sets [Builder.measurement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.measurement] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun measurement(measurement: JsonField<String>) = apply {
                    this.measurement = measurement
                }

                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun value(value: Float?) = value(JsonField.ofNullable(value))

                /**
                 * Alias for [Builder.value].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun value(value: Float) = value(value as Float?)

                /** Alias for calling [Builder.value] with `value.orElse(null)`. */
                fun value(value: Optional<Float>) = value(value.getOrNull())

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Float] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Float>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NumericColumnFilter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NumericColumnFilter =
                    NumericColumnFilter(
                        checkRequired("measurement", measurement),
                        checkRequired("operator", operator),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NumericColumnFilter = apply {
                if (validated) {
                    return@apply
                }

                measurement()
                operator().validate()
                value()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (measurement.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GREATER = of(">")

                    @JvmField val GREATER_OR_EQUALS = of(">=")

                    @JvmField val IS = of("is")

                    @JvmField val LESS = of("<")

                    @JvmField val LESS_OR_EQUALS = of("<=")

                    @JvmField val NOT_EQUALS = of("!=")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    GREATER,
                    GREATER_OR_EQUALS,
                    IS,
                    LESS,
                    LESS_OR_EQUALS,
                    NOT_EQUALS,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GREATER,
                    GREATER_OR_EQUALS,
                    IS,
                    LESS,
                    LESS_OR_EQUALS,
                    NOT_EQUALS,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GREATER -> Value.GREATER
                        GREATER_OR_EQUALS -> Value.GREATER_OR_EQUALS
                        IS -> Value.IS
                        LESS -> Value.LESS
                        LESS_OR_EQUALS -> Value.LESS_OR_EQUALS
                        NOT_EQUALS -> Value.NOT_EQUALS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GREATER -> Known.GREATER
                        GREATER_OR_EQUALS -> Known.GREATER_OR_EQUALS
                        IS -> Known.IS
                        LESS -> Known.LESS
                        LESS_OR_EQUALS -> Known.LESS_OR_EQUALS
                        NOT_EQUALS -> Known.NOT_EQUALS
                        else -> throw OpenlayerInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NumericColumnFilter &&
                    measurement == other.measurement &&
                    operator == other.operator &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(measurement, operator, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NumericColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
        }

        class StringColumnFilter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val measurement: JsonField<String>,
            private val operator: JsonField<Operator>,
            private val value: JsonField<Value>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("measurement")
                @ExcludeMissing
                measurement: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
            ) : this(measurement, operator, value, mutableMapOf())

            /**
             * The name of the column.
             *
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun measurement(): String = measurement.getRequired("measurement")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Value = value.getRequired("value")

            /**
             * Returns the raw JSON value of [measurement].
             *
             * Unlike [measurement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("measurement")
            @ExcludeMissing
            fun _measurement(): JsonField<String> = measurement

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [StringColumnFilter].
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StringColumnFilter]. */
            class Builder internal constructor() {

                private var measurement: JsonField<String>? = null
                private var operator: JsonField<Operator>? = null
                private var value: JsonField<Value>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stringColumnFilter: StringColumnFilter) = apply {
                    measurement = stringColumnFilter.measurement
                    operator = stringColumnFilter.operator
                    value = stringColumnFilter.value
                    additionalProperties = stringColumnFilter.additionalProperties.toMutableMap()
                }

                /** The name of the column. */
                fun measurement(measurement: String) = measurement(JsonField.of(measurement))

                /**
                 * Sets [Builder.measurement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.measurement] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun measurement(measurement: JsonField<String>) = apply {
                    this.measurement = measurement
                }

                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                fun value(value: Value) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Value] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Value>) = apply { this.value = value }

                /** Alias for calling [value] with `Value.ofString(string)`. */
                fun value(string: String) = value(Value.ofString(string))

                /** Alias for calling [value] with `Value.ofBool(bool)`. */
                fun value(bool: Boolean) = value(Value.ofBool(bool))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [StringColumnFilter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .measurement()
                 * .operator()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StringColumnFilter =
                    StringColumnFilter(
                        checkRequired("measurement", measurement),
                        checkRequired("operator", operator),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StringColumnFilter = apply {
                if (validated) {
                    return@apply
                }

                measurement()
                operator().validate()
                value().validate()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (measurement.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (value.asKnown().getOrNull()?.validity() ?: 0)

            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val IS = of("is")

                    @JvmField val NOT_EQUALS = of("!=")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    IS,
                    NOT_EQUALS,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IS,
                    NOT_EQUALS,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IS -> Value.IS
                        NOT_EQUALS -> Value.NOT_EQUALS
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IS -> Known.IS
                        NOT_EQUALS -> Known.NOT_EQUALS
                        else -> throw OpenlayerInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(using = Value.Deserializer::class)
            @JsonSerialize(using = Value.Serializer::class)
            class Value
            private constructor(
                private val string: String? = null,
                private val bool: Boolean? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun isString(): Boolean = string != null

                fun isBool(): Boolean = bool != null

                fun asString(): String = string.getOrThrow("string")

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        bool != null -> visitor.visitBool(bool)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Value = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitBool(bool: Boolean) {}
                        }
                    )
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
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitBool(bool: Boolean) = 1

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Value && string == other.string && bool == other.bool
                }

                override fun hashCode(): Int = Objects.hash(string, bool)

                override fun toString(): String =
                    when {
                        string != null -> "Value{string=$string}"
                        bool != null -> "Value{bool=$bool}"
                        _json != null -> "Value{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Value")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Value(string = string)

                    @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)
                }

                /**
                 * An interface that defines how to map each variant of [Value] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitBool(bool: Boolean): T

                    /**
                     * Maps an unknown variant of [Value] to a value of type [T].
                     *
                     * An instance of [Value] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws OpenlayerInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw OpenlayerInvalidDataException("Unknown Value: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Value>(Value::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Value {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Value(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        Value(bool = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // integer).
                            0 -> Value(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Value>(Value::class) {

                    override fun serialize(
                        value: Value,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.bool != null -> generator.writeObject(value.bool)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Value")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StringColumnFilter &&
                    measurement == other.measurement &&
                    operator == other.operator &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(measurement, operator, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StringColumnFilter{measurement=$measurement, operator=$operator, value=$value, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowListParams &&
            inferencePipelineId == other.inferencePipelineId &&
            asc == other.asc &&
            page == other.page &&
            perPage == other.perPage &&
            sortColumn == other.sortColumn &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            inferencePipelineId,
            asc,
            page,
            perPage,
            sortColumn,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RowListParams{inferencePipelineId=$inferencePipelineId, asc=$asc, page=$page, perPage=$perPage, sortColumn=$sortColumn, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
