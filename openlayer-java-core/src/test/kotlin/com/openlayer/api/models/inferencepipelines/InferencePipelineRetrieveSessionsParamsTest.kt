// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.openlayer.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferencePipelineRetrieveSessionsParamsTest {

    @Test
    fun create() {
        InferencePipelineRetrieveSessionsParams.builder()
            .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asc(true)
            .page(1L)
            .perPage(1L)
            .sortColumn("sortColumn")
            .addColumnFilter(
                InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter.builder()
                    .measurement("openlayer_token_set")
                    .operator(
                        InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                            .Operator
                            .CONTAINS_NONE
                    )
                    .addValue("cat")
                    .build()
            )
            .addExcludeRowIdList(0L)
            .addNotSearchQueryAnd("string")
            .addNotSearchQueryOr("string")
            .addRowIdList(0L)
            .addSearchQueryAnd("string")
            .addSearchQueryOr("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InferencePipelineRetrieveSessionsParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InferencePipelineRetrieveSessionsParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asc(true)
                .page(1L)
                .perPage(1L)
                .sortColumn("sortColumn")
                .addColumnFilter(
                    InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter.builder()
                        .measurement("openlayer_token_set")
                        .operator(
                            InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                                .Operator
                                .CONTAINS_NONE
                        )
                        .addValue("cat")
                        .build()
                )
                .addExcludeRowIdList(0L)
                .addNotSearchQueryAnd("string")
                .addNotSearchQueryOr("string")
                .addRowIdList(0L)
                .addSearchQueryAnd("string")
                .addSearchQueryOr("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("asc", "true")
                    .put("page", "1")
                    .put("perPage", "1")
                    .put("sortColumn", "sortColumn")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InferencePipelineRetrieveSessionsParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            InferencePipelineRetrieveSessionsParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asc(true)
                .page(1L)
                .perPage(1L)
                .sortColumn("sortColumn")
                .addColumnFilter(
                    InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter.builder()
                        .measurement("openlayer_token_set")
                        .operator(
                            InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                                .Operator
                                .CONTAINS_NONE
                        )
                        .addValue("cat")
                        .build()
                )
                .addExcludeRowIdList(0L)
                .addNotSearchQueryAnd("string")
                .addNotSearchQueryOr("string")
                .addRowIdList(0L)
                .addSearchQueryAnd("string")
                .addSearchQueryOr("string")
                .build()

        val body = params._body()

        assertThat(body.columnFilters().getOrNull())
            .containsExactly(
                InferencePipelineRetrieveSessionsParams.ColumnFilter.ofSet(
                    InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter.builder()
                        .measurement("openlayer_token_set")
                        .operator(
                            InferencePipelineRetrieveSessionsParams.ColumnFilter.SetColumnFilter
                                .Operator
                                .CONTAINS_NONE
                        )
                        .addValue("cat")
                        .build()
                )
            )
        assertThat(body.excludeRowIdList().getOrNull()).containsExactly(0L)
        assertThat(body.notSearchQueryAnd().getOrNull()).containsExactly("string")
        assertThat(body.notSearchQueryOr().getOrNull()).containsExactly("string")
        assertThat(body.rowIdList().getOrNull()).containsExactly(0L)
        assertThat(body.searchQueryAnd().getOrNull()).containsExactly("string")
        assertThat(body.searchQueryOr().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferencePipelineRetrieveSessionsParams.builder()
                .inferencePipelineId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
