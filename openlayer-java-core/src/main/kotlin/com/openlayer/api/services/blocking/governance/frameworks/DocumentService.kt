// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking.governance.frameworks

import com.google.errorprone.annotations.MustBeClosed
import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.documents.DocumentListParams
import com.openlayer.api.models.governance.frameworks.documents.DocumentListResponse
import com.openlayer.api.models.governance.frameworks.documents.DocumentRetrieveParams
import com.openlayer.api.models.governance.frameworks.documents.DocumentRetrieveResponse
import java.util.function.Consumer

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService

    /** Retrieve a framework document with its sections and rules. */
    fun retrieve(documentId: String, params: DocumentRetrieveParams): DocumentRetrieveResponse =
        retrieve(documentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): DocumentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentRetrieveResponse

    /** List the documents attached to a framework. */
    fun list(frameworkId: String): DocumentListResponse =
        list(frameworkId, DocumentListParams.none())

    /** @see list */
    fun list(
        frameworkId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse =
        list(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see list */
    fun list(
        frameworkId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): DocumentListResponse = list(frameworkId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** @see list */
    fun list(params: DocumentListParams): DocumentListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(frameworkId: String, requestOptions: RequestOptions): DocumentListResponse =
        list(frameworkId, DocumentListParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/documents/{documentId}`,
         * but is otherwise the same as [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams,
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): HttpResponseFor<DocumentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/documents`, but is
         * otherwise the same as [DocumentService.list].
         */
        @MustBeClosed
        fun list(frameworkId: String): HttpResponseFor<DocumentListResponse> =
            list(frameworkId, DocumentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            frameworkId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse> =
            list(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            frameworkId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): HttpResponseFor<DocumentListResponse> = list(frameworkId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: DocumentListParams): HttpResponseFor<DocumentListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DocumentListResponse> =
            list(frameworkId, DocumentListParams.none(), requestOptions)
    }
}
