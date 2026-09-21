// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance.frameworks

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesParams
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubsectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubsectionServiceAsync

    /**
     * List the rules mapped to a subsection of a framework document.
     *
     * A subsection is usually the level at which a standard states an individual requirement, so
     * this is the endpoint to use when you want to show which rules cover a specific clause.
     */
    fun listRules(
        subsectionId: String,
        params: SubsectionListRulesParams,
    ): CompletableFuture<SubsectionListRulesResponse> =
        listRules(subsectionId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        subsectionId: String,
        params: SubsectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubsectionListRulesResponse> =
        listRules(params.toBuilder().subsectionId(subsectionId).build(), requestOptions)

    /** @see listRules */
    fun listRules(
        params: SubsectionListRulesParams
    ): CompletableFuture<SubsectionListRulesResponse> = listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: SubsectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubsectionListRulesResponse>

    /**
     * A view of [SubsectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubsectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /frameworks/{frameworkId}/subsections/{subsectionId}/rules`, but is otherwise the same as
         * [SubsectionServiceAsync.listRules].
         */
        fun listRules(
            subsectionId: String,
            params: SubsectionListRulesParams,
        ): CompletableFuture<HttpResponseFor<SubsectionListRulesResponse>> =
            listRules(subsectionId, params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            subsectionId: String,
            params: SubsectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubsectionListRulesResponse>> =
            listRules(params.toBuilder().subsectionId(subsectionId).build(), requestOptions)

        /** @see listRules */
        fun listRules(
            params: SubsectionListRulesParams
        ): CompletableFuture<HttpResponseFor<SubsectionListRulesResponse>> =
            listRules(params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            params: SubsectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubsectionListRulesResponse>>
    }
}
