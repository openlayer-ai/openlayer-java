// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toUnmodifiable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import com.openlayer.api.models.*
import java.util.Objects
import java.util.Optional

class ProjectInferencePipelineCreateParams
constructor(
    private val id: String,
    private val description: String?,
    private val name: String,
    private val referenceDatasetUri: String?,
    private val storageType: StorageType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): String = id

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): String = name

    fun referenceDatasetUri(): Optional<String> = Optional.ofNullable(referenceDatasetUri)

    fun storageType(): Optional<StorageType> = Optional.ofNullable(storageType)

    @JvmSynthetic
    internal fun getBody(): ProjectInferencePipelineCreateBody {
        return ProjectInferencePipelineCreateBody(
            description,
            name,
            referenceDatasetUri,
            storageType,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> id
            else -> ""
        }
    }

    @JsonDeserialize(builder = ProjectInferencePipelineCreateBody.Builder::class)
    @NoAutoDetect
    class ProjectInferencePipelineCreateBody
    internal constructor(
        private val description: String?,
        private val name: String?,
        private val referenceDatasetUri: String?,
        private val storageType: StorageType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The inference pipeline description. */
        @JsonProperty("description") fun description(): String? = description

        /** The inference pipeline name. */
        @JsonProperty("name") fun name(): String? = name

        /** The reference dataset URI. */
        @JsonProperty("referenceDatasetUri")
        fun referenceDatasetUri(): String? = referenceDatasetUri

        /** The storage type. */
        @JsonProperty("storageType") fun storageType(): StorageType? = storageType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProjectInferencePipelineCreateBody &&
                this.description == other.description &&
                this.name == other.name &&
                this.referenceDatasetUri == other.referenceDatasetUri &&
                this.storageType == other.storageType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        name,
                        referenceDatasetUri,
                        storageType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ProjectInferencePipelineCreateBody{description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, storageType=$storageType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var name: String? = null
            private var referenceDatasetUri: String? = null
            private var storageType: StorageType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                projectInferencePipelineCreateBody: ProjectInferencePipelineCreateBody
            ) = apply {
                this.description = projectInferencePipelineCreateBody.description
                this.name = projectInferencePipelineCreateBody.name
                this.referenceDatasetUri = projectInferencePipelineCreateBody.referenceDatasetUri
                this.storageType = projectInferencePipelineCreateBody.storageType
                additionalProperties(projectInferencePipelineCreateBody.additionalProperties)
            }

            /** The inference pipeline description. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The inference pipeline name. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The reference dataset URI. */
            @JsonProperty("referenceDatasetUri")
            fun referenceDatasetUri(referenceDatasetUri: String) = apply {
                this.referenceDatasetUri = referenceDatasetUri
            }

            /** The storage type. */
            @JsonProperty("storageType")
            fun storageType(storageType: StorageType) = apply { this.storageType = storageType }

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

            fun build(): ProjectInferencePipelineCreateBody =
                ProjectInferencePipelineCreateBody(
                    description,
                    checkNotNull(name) { "`name` is required but was not set" },
                    referenceDatasetUri,
                    storageType,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectInferencePipelineCreateParams &&
            this.id == other.id &&
            this.description == other.description &&
            this.name == other.name &&
            this.referenceDatasetUri == other.referenceDatasetUri &&
            this.storageType == other.storageType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            description,
            name,
            referenceDatasetUri,
            storageType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ProjectInferencePipelineCreateParams{id=$id, description=$description, name=$name, referenceDatasetUri=$referenceDatasetUri, storageType=$storageType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
        private var description: String? = null
        private var name: String? = null
        private var referenceDatasetUri: String? = null
        private var storageType: StorageType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            projectInferencePipelineCreateParams: ProjectInferencePipelineCreateParams
        ) = apply {
            this.id = projectInferencePipelineCreateParams.id
            this.description = projectInferencePipelineCreateParams.description
            this.name = projectInferencePipelineCreateParams.name
            this.referenceDatasetUri = projectInferencePipelineCreateParams.referenceDatasetUri
            this.storageType = projectInferencePipelineCreateParams.storageType
            additionalQueryParams(projectInferencePipelineCreateParams.additionalQueryParams)
            additionalHeaders(projectInferencePipelineCreateParams.additionalHeaders)
            additionalBodyProperties(projectInferencePipelineCreateParams.additionalBodyProperties)
        }

        fun id(id: String) = apply { this.id = id }

        /** The inference pipeline description. */
        fun description(description: String) = apply { this.description = description }

        /** The inference pipeline name. */
        fun name(name: String) = apply { this.name = name }

        /** The reference dataset URI. */
        fun referenceDatasetUri(referenceDatasetUri: String) = apply {
            this.referenceDatasetUri = referenceDatasetUri
        }

        /** The storage type. */
        fun storageType(storageType: StorageType) = apply { this.storageType = storageType }

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

        fun build(): ProjectInferencePipelineCreateParams =
            ProjectInferencePipelineCreateParams(
                checkNotNull(id) { "`id` is required but was not set" },
                description,
                checkNotNull(name) { "`name` is required but was not set" },
                referenceDatasetUri,
                storageType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Links.Builder::class)
    @NoAutoDetect
    class Links
    private constructor(
        private val app: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("app") fun app(): String? = app

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Links &&
                this.app == other.app &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(app, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var app: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                this.app = links.app
                additionalProperties(links.additionalProperties)
            }

            @JsonProperty("app") fun app(app: String) = apply { this.app = app }

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

            fun build(): Links =
                Links(
                    checkNotNull(app) { "`app` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val QUEUED = Status(JsonField.of("queued"))

            @JvmField val RUNNING = Status(JsonField.of("running"))

            @JvmField val PAUSED = Status(JsonField.of("paused"))

            @JvmField val FAILED = Status(JsonField.of("failed"))

            @JvmField val COMPLETED = Status(JsonField.of("completed"))

            @JvmField val UNKNOWN = Status(JsonField.of("unknown"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                PAUSED -> Value.PAUSED
                FAILED -> Value.FAILED
                COMPLETED -> Value.COMPLETED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                PAUSED -> Known.PAUSED
                FAILED -> Known.FAILED
                COMPLETED -> Known.COMPLETED
                UNKNOWN -> Known.UNKNOWN
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StorageType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StorageType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LOCAL = StorageType(JsonField.of("local"))

            @JvmField val S3 = StorageType(JsonField.of("s3"))

            @JvmField val GCS = StorageType(JsonField.of("gcs"))

            @JvmField val AZURE = StorageType(JsonField.of("azure"))

            @JvmStatic fun of(value: String) = StorageType(JsonField.of(value))
        }

        enum class Known {
            LOCAL,
            S3,
            GCS,
            AZURE,
        }

        enum class Value {
            LOCAL,
            S3,
            GCS,
            AZURE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LOCAL -> Value.LOCAL
                S3 -> Value.S3
                GCS -> Value.GCS
                AZURE -> Value.AZURE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LOCAL -> Known.LOCAL
                S3 -> Known.S3
                GCS -> Known.GCS
                AZURE -> Known.AZURE
                else -> throw OpenlayerInvalidDataException("Unknown StorageType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
