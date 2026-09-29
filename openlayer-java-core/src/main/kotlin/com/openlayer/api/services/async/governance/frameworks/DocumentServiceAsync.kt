// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance.frameworks

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.core.RequestOptions
import com.openlayer.api.core.http.HttpResponseFor
import com.openlayer.api.models.governance.frameworks.documents.DocumentListParams
import com.openlayer.api.models.governance.frameworks.documents.DocumentListResponse
import com.openlayer.api.models.governance.frameworks.documents.DocumentRetrieveParams
import com.openlayer.api.models.governance.frameworks.documents.DocumentRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DocumentServiceAsync

    /** Retrieve a framework document with its sections and rules. */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams,
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(documentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<DocumentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentRetrieveResponse>

    /** List the documents attached to a framework. */
    fun list(frameworkId: String): CompletableFuture<DocumentListResponse> =
        list(frameworkId, DocumentListParams.none())

    /** @see list */
    fun list(
        frameworkId: String,
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse> =
        list(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

    /** @see list */
    fun list(
        frameworkId: String,
        params: DocumentListParams = DocumentListParams.none(),
    ): CompletableFuture<DocumentListResponse> = list(frameworkId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListResponse>

    /** @see list */
    fun list(params: DocumentListParams): CompletableFuture<DocumentListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        frameworkId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DocumentListResponse> =
        list(frameworkId, DocumentListParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/documents/{documentId}`,
         * but is otherwise the same as [DocumentServiceAsync.retrieve].
         */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams,
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(documentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /frameworks/{frameworkId}/documents`, but is
         * otherwise the same as [DocumentServiceAsync.list].
         */
        fun list(frameworkId: String): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(frameworkId, DocumentListParams.none())

        /** @see list */
        fun list(
            frameworkId: String,
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params.toBuilder().frameworkId(frameworkId).build(), requestOptions)

        /** @see list */
        fun list(
            frameworkId: String,
            params: DocumentListParams = DocumentListParams.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(frameworkId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DocumentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>>

        /** @see list */
        fun list(
            params: DocumentListParams
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            frameworkId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DocumentListResponse>> =
            list(frameworkId, DocumentListParams.none(), requestOptions)
    }
}
