// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance.frameworks

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesParams
import com.openlayer.api.models.governance.frameworks.subsections.SubsectionListRulesResponse
import java.util.function.Consumer

interface SubsectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubsectionService

    /** List the rules mapped to a document subsection. */
    fun listRules(
        subsectionId: String,
        params: SubsectionListRulesParams,
    ): SubsectionListRulesResponse = listRules(subsectionId, params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        subsectionId: String,
        params: SubsectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubsectionListRulesResponse =
        listRules(params.toBuilder().subsectionId(subsectionId).build(), requestOptions)

    /** @see listRules */
    fun listRules(params: SubsectionListRulesParams): SubsectionListRulesResponse =
        listRules(params, RequestOptions.none())

    /** @see listRules */
    fun listRules(
        params: SubsectionListRulesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubsectionListRulesResponse

    /** A view of [SubsectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubsectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /frameworks/{frameworkId}/subsections/{subsectionId}/rules`, but is otherwise the same as
         * [SubsectionService.listRules].
         */
        @MustBeClosed
        fun listRules(
            subsectionId: String,
            params: SubsectionListRulesParams,
        ): HttpResponseFor<SubsectionListRulesResponse> =
            listRules(subsectionId, params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            subsectionId: String,
            params: SubsectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubsectionListRulesResponse> =
            listRules(params.toBuilder().subsectionId(subsectionId).build(), requestOptions)

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: SubsectionListRulesParams
        ): HttpResponseFor<SubsectionListRulesResponse> = listRules(params, RequestOptions.none())

        /** @see listRules */
        @MustBeClosed
        fun listRules(
            params: SubsectionListRulesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubsectionListRulesResponse>
    }
}
