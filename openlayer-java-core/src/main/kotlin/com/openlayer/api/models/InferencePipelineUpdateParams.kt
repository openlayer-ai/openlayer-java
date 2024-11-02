// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toImmutable
import com.openlayer.api.models.*
import java.util.Objects
import java.util.Optional

class InferencePipelineUpdateParams
constructor(
    private val inferencePipelineId: String,
    private val description: String?,
    private val name: String?,
    private val referenceDatasetUri: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inferencePipelineId(): String = inferencePipelineId

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun referenceDatasetUri(): Optional<String> = Optional.ofNullable(referenceDatasetUri)

    @JvmSynthetic
    internal fun getBody(): InferencePipelineUpdateBody {
        return InferencePipelineUpdateBody(
            description,
            name,
            referenceDatasetUri,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

            return /* spotless:off */ other is InferencePipelineUpdateBody && this.description == other.description && this.name == other.name && this.referenceDatasetUri == other.referenceDatasetUri && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, name, referenceDatasetUri, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InferencePipelineUpdateBody{description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineUpdateParams && this.inferencePipelineId == other.inferencePipelineId && this.description == other.description && this.name == other.name && this.referenceDatasetUri == other.referenceDatasetUri && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inferencePipelineId, description, name, referenceDatasetUri, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InferencePipelineUpdateParams{inferencePipelineId=$inferencePipelineId, description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inferencePipelineUpdateParams: InferencePipelineUpdateParams) = apply {
            this.inferencePipelineId = inferencePipelineUpdateParams.inferencePipelineId
            this.description = inferencePipelineUpdateParams.description
            this.name = inferencePipelineUpdateParams.name
            this.referenceDatasetUri = inferencePipelineUpdateParams.referenceDatasetUri
            additionalQueryParams(inferencePipelineUpdateParams.additionalQueryParams)
            additionalHeaders(inferencePipelineUpdateParams.additionalHeaders)
            additionalBodyProperties(inferencePipelineUpdateParams.additionalBodyProperties)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): InferencePipelineUpdateParams =
            InferencePipelineUpdateParams(
                checkNotNull(inferencePipelineId) {
                    "`inferencePipelineId` is required but was not set"
                },
                description,
                name,
                referenceDatasetUri,
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
