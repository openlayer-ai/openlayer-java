// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update inference pipeline. */
class InferencePipelineUpdateParams
private constructor(
    private val inferencePipelineId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): String = inferencePipelineId

    /** The inference pipeline description. */
    fun description(): Optional<String> = body.description()

    /** The inference pipeline name. */
    fun name(): Optional<String> = body.name()

    /**
     * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
     * handle your reference dataset updates.
     */
    fun referenceDatasetUri(): Optional<String> = body.referenceDatasetUri()

    /** The inference pipeline description. */
    fun _description(): JsonField<String> = body._description()

    /** The inference pipeline name. */
    fun _name(): JsonField<String> = body._name()

    /**
     * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
     * handle your reference dataset updates.
     */
    fun _referenceDatasetUri(): JsonField<String> = body._referenceDatasetUri()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referenceDatasetUri")
        @ExcludeMissing
        private val referenceDatasetUri: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The inference pipeline description. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The inference pipeline name. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        fun referenceDatasetUri(): Optional<String> =
            Optional.ofNullable(referenceDatasetUri.getNullable("referenceDatasetUri"))

        /** The inference pipeline description. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The inference pipeline name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        @JsonProperty("referenceDatasetUri")
        @ExcludeMissing
        fun _referenceDatasetUri(): JsonField<String> = referenceDatasetUri

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            name()
            referenceDatasetUri()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var referenceDatasetUri: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                name = body.name
                referenceDatasetUri = body.referenceDatasetUri
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The inference pipeline description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** The inference pipeline description. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /** The inference pipeline description. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The inference pipeline name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The inference pipeline name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The storage uri of your reference dataset. We recommend using the Python SDK or the
             * UI to handle your reference dataset updates.
             */
            fun referenceDatasetUri(referenceDatasetUri: String?) =
                referenceDatasetUri(JsonField.ofNullable(referenceDatasetUri))

            /**
             * The storage uri of your reference dataset. We recommend using the Python SDK or the
             * UI to handle your reference dataset updates.
             */
            fun referenceDatasetUri(referenceDatasetUri: Optional<String>) =
                referenceDatasetUri(referenceDatasetUri.getOrNull())

            /**
             * The storage uri of your reference dataset. We recommend using the Python SDK or the
             * UI to handle your reference dataset updates.
             */
            fun referenceDatasetUri(referenceDatasetUri: JsonField<String>) = apply {
                this.referenceDatasetUri = referenceDatasetUri
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(description, name, referenceDatasetUri, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && description == other.description && name == other.name && referenceDatasetUri == other.referenceDatasetUri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, referenceDatasetUri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InferencePipelineUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inferencePipelineUpdateParams: InferencePipelineUpdateParams) = apply {
            inferencePipelineId = inferencePipelineUpdateParams.inferencePipelineId
            body = inferencePipelineUpdateParams.body.toBuilder()
            additionalHeaders = inferencePipelineUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferencePipelineUpdateParams.additionalQueryParams.toBuilder()
        }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** The inference pipeline description. */
        fun description(description: String?) = apply { body.description(description) }

        /** The inference pipeline description. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /** The inference pipeline description. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The inference pipeline name. */
        fun name(name: String) = apply { body.name(name) }

        /** The inference pipeline name. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        fun referenceDatasetUri(referenceDatasetUri: String?) = apply {
            body.referenceDatasetUri(referenceDatasetUri)
        }

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        fun referenceDatasetUri(referenceDatasetUri: Optional<String>) =
            referenceDatasetUri(referenceDatasetUri.getOrNull())

        /**
         * The storage uri of your reference dataset. We recommend using the Python SDK or the UI to
         * handle your reference dataset updates.
         */
        fun referenceDatasetUri(referenceDatasetUri: JsonField<String>) = apply {
            body.referenceDatasetUri(referenceDatasetUri)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): InferencePipelineUpdateParams =
            InferencePipelineUpdateParams(
                checkRequired("inferencePipelineId", inferencePipelineId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineUpdateParams && inferencePipelineId == other.inferencePipelineId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferencePipelineUpdateParams{inferencePipelineId=$inferencePipelineId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
