// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.inferencepipelines

import com.fasterxml.jackson.annotation.JsonCreator
import com.openlayer.api.core.Enum
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve inference pipeline. */
class InferencePipelineRetrieveParams
private constructor(
    private val inferencePipelineId: String,
    private val expand: List<Expand>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inferencePipelineId(): String = inferencePipelineId

    /** Expand specific nested objects. */
    fun expand(): Optional<List<Expand>> = Optional.ofNullable(expand)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.expand?.let { queryParams.put("expand", listOf(it.joinToString(separator = ","))) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inferencePipelineId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InferencePipelineRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .inferencePipelineId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineRetrieveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var inferencePipelineId: String? = null
        private var expand: MutableList<Expand>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inferencePipelineRetrieveParams: InferencePipelineRetrieveParams) =
            apply {
                inferencePipelineId = inferencePipelineRetrieveParams.inferencePipelineId
                expand = inferencePipelineRetrieveParams.expand?.toMutableList()
                additionalHeaders = inferencePipelineRetrieveParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inferencePipelineRetrieveParams.additionalQueryParams.toBuilder()
            }

        fun inferencePipelineId(inferencePipelineId: String) = apply {
            this.inferencePipelineId = inferencePipelineId
        }

        /** Expand specific nested objects. */
        fun expand(expand: List<Expand>?) = apply { this.expand = expand?.toMutableList() }

        /** Expand specific nested objects. */
        fun expand(expand: Optional<List<Expand>>) = expand(expand.getOrNull())

        /** Expand specific nested objects. */
        fun addExpand(expand: Expand) = apply {
            this.expand = (this.expand ?: mutableListOf()).apply { add(expand) }
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

        fun build(): InferencePipelineRetrieveParams =
            InferencePipelineRetrieveParams(
                checkRequired("inferencePipelineId", inferencePipelineId),
                expand?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Expand @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROJECT = of("project")

            @JvmField val WORKSPACE = of("workspace")

            @JvmStatic fun of(value: String) = Expand(JsonField.of(value))
        }

        /** An enum containing [Expand]'s known values. */
        enum class Known {
            PROJECT,
            WORKSPACE,
        }

        /**
         * An enum containing [Expand]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Expand] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROJECT,
            WORKSPACE,
            /** An enum member indicating that [Expand] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PROJECT -> Value.PROJECT
                WORKSPACE -> Value.WORKSPACE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROJECT -> Known.PROJECT
                WORKSPACE -> Known.WORKSPACE
                else -> throw OpenlayerInvalidDataException("Unknown Expand: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OpenlayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                OpenlayerInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Expand && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineRetrieveParams && inferencePipelineId == other.inferencePipelineId && expand == other.expand && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferencePipelineId, expand, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferencePipelineRetrieveParams{inferencePipelineId=$inferencePipelineId, expand=$expand, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
