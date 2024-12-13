// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class InferencePipelineUpdateParams
constructor(
    private val inferencePipelineId: String,
    private val description: String?,
    private val name: String?,
    private val referenceDatasetUri: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun referenceDatasetUri(): Optional<String> = Optional.ofNullable(referenceDatasetUri)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): InferencePipelineUpdateBody {
        return InferencePipelineUpdateBody(
            description,
            name,
            referenceDatasetUri,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InferencePipelineUpdateBody.Builder::class)
    @NoAutoDetect
    class InferencePipelineUpdateBody
    internal constructor(
        private val description: String?,
        private val name: String?,
        private val referenceDatasetUri: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The inference pipeline description. */
        @JsonProperty("description") fun description(): String? = description

        /** The inference pipeline name. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        @JsonProperty("referenceDatasetUri")
        fun referenceDatasetUri(): String? = referenceDatasetUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var name: String? = null
            private var referenceDatasetUri: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inferencePipelineUpdateBody: InferencePipelineUpdateBody) = apply {
                this.description = inferencePipelineUpdateBody.description
                this.name = inferencePipelineUpdateBody.name
                this.referenceDatasetUri = inferencePipelineUpdateBody.referenceDatasetUri
                additionalProperties(inferencePipelineUpdateBody.additionalProperties)
            }

            /** The inference pipeline description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The inference pipeline name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The storage uri of your reference dataset. We recommend using the Python SDK or the
             * UI to handle your reference dataset updates.
             */
            @JsonProperty("referenceDatasetUri")
            fun referenceDatasetUri(referenceDatasetUri: String) = apply {
                this.referenceDatasetUri = referenceDatasetUri
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InferencePipelineUpdateBody =
                InferencePipelineUpdateBody(
                    description,
                    name,
                    referenceDatasetUri,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferencePipelineUpdateBody && description == other.description && name == other.name && referenceDatasetUri == other.referenceDatasetUri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, referenceDatasetUri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferencePipelineUpdateBody{description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inferencePipelineId: String? = null
        private var description: String? = null
        private var name: String? = null
        private var referenceDatasetUri: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineUpdateParams: InferencePipelineUpdateParams) = apply {
            inferencePipelineId = inferencePipelineUpdateParams.inferencePipelineId
            description = inferencePipelineUpdateParams.description
            name = inferencePipelineUpdateParams.name
            referenceDatasetUri = inferencePipelineUpdateParams.referenceDatasetUri
            additionalHeaders = inferencePipelineUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferencePipelineUpdateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                inferencePipelineUpdateParams.additionalBodyProperties.toMutableMap()
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** The inference pipeline description. */
        fun description(description: String) = apply { this.description = description }

        /** The inference pipeline name. */
        fun name(name: String) = apply { this.name = name }

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        fun referenceDatasetUri(referenceDatasetUri: String) = apply {
            this.referenceDatasetUri = referenceDatasetUri
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): InferencePipelineUpdateParams =
            InferencePipelineUpdateParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                description,
                name,
                referenceDatasetUri,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineUpdateParams && inferencePipelineId == other.inferencePipelineId && description == other.description && name == other.name && referenceDatasetUri == other.referenceDatasetUri && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, description, name, referenceDatasetUri, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "InferencePipelineUpdateParams{inferencePipelineId=$inferencePipelineId, description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
