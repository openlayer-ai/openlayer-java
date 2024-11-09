// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitTestResultListParamsTest {

    @Test
    fun createCommitTestResultListParams() {
        CommitTestResultListParams.builder()
            .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(true)
            .page(123L)
            .perPage(100L)
            .status(CommitTestResultListParams.Status.RUNNING)
            .type(CommitTestResultListParams.Type.INTEGRITY)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CommitTestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(true)
                .page(123L)
                .perPage(100L)
                .status(CommitTestResultListParams.Status.RUNNING)
                .type(CommitTestResultListParams.Type.INTEGRITY)
                .build()
        val expected = QueryParams.builder()
        expected.put("includeArchived", "true")
        expected.put("page", "123")
        expected.put("perPage", "100")
        expected.put("status", CommitTestResultListParams.Status.RUNNING.toString())
        expected.put("type", CommitTestResultListParams.Type.INTEGRITY.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CommitTestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CommitTestResultListParams.builder()
                .projectVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "projectVersionId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
