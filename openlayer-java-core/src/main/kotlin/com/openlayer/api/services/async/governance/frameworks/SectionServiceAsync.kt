// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance.frameworks

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesParams
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionServiceAsync

    /**
     * List the rules mapped to a section of a framework document.
     *
     * Pass `includeSubsectionRules=true` to also return the rules mapped to the section's
     * subsections, which is how you get every rule covering a requirement and everything under it.
     */
    fun listRules(
        sectionId: String,
        params: SectionListRulesParams,
    ): CompletableFuture<SectionListRulesResponse> =
        listRules(sectionId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        sectionId: String,
        params: SectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SectionListRulesResponse> =
        listRules(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see listRules */
    fun listRules(params: SectionListRulesParams): CompletableFuture<SectionListRulesResponse> =
        listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: SectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SectionListRulesResponse>

    /**
     * A view of [SectionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /frameworks/{frameworkId}/sections/{sectionId}/rules`, but is otherwise the same as
         * [SectionServiceAsync.listRules].
         */
        fun listRules(
            sectionId: String,
            params: SectionListRulesParams,
        ): CompletableFuture<HttpResponseFor<SectionListRulesResponse>> =
            listRules(sectionId, params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            sectionId: String,
            params: SectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SectionListRulesResponse>> =
            listRules(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see listRules */
        fun listRules(
            params: SectionListRulesParams
        ): CompletableFuture<HttpResponseFor<SectionListRulesResponse>> =
            listRules(params, RequestOptions.none())

        /** @see listRules */
        fun listRules(
            params: SectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SectionListRulesResponse>>
    }
}
