// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance.frameworks

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesParams
import com.openlayer.api.models.governance.frameworks.sections.SectionListRulesResponse
import java.util.function.Consumer

interface SectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionService

    /**
     * List the rules mapped to a section of a framework document.
     *
     * Pass `includeSubsectionRules=true` to also return the rules mapped to the section's
     * subsections, which is how you get every rule covering a requirement and everything under it.
     */
    fun listRules(sectionId: String, params: SectionListRulesParams): SectionListRulesResponse =
        listRules(sectionId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        sectionId: String,
        params: SectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SectionListRulesResponse =
        listRules(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see listRules */
    fun listRules(params: SectionListRulesParams): SectionListRulesResponse =
        listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: SectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SectionListRulesResponse

    /** A view of [SectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /frameworks/{frameworkId}/sections/{sectionId}/rules`, but is otherwise the same as
         * [SectionService.listRules].
         */
        @MustBeClosed
        fun listRules(
            sectionId: String,
            params: SectionListRulesParams,
        ): HttpResponseFor<SectionListRulesResponse> =
            listRules(sectionId, params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            sectionId: String,
            params: SectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SectionListRulesResponse> =
            listRules(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        fun listRules(params: SectionListRulesParams): HttpResponseFor<SectionListRulesResponse> =
            listRules(params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: SectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SectionListRulesResponse>
    }
}
