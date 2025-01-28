// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.immutableEmptyMap
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Objects

@NoAutoDetect
class InferencePipelineDataStreamResponse
@JsonCreator
private constructor(
    @JsonProperty("success")
    @ExcludeMissing
    private val success: JsonField<Success> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun success(): Success = success.getRequired("success")

    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InferencePipelineDataStreamResponse = apply {
        if (validated) {
            return@apply
        }

        success()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var success: JsonField<Success>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferencePipelineDataStreamResponse: InferencePipelineDataStreamResponse
        ) = apply {
            success = inferencePipelineDataStreamResponse.success
            additionalProperties =
                inferencePipelineDataStreamResponse.additionalProperties.toMutableMap()
        }

        fun success(success: Success) = success(JsonField.of(success))

        fun success(success: JsonField<Success>) = apply { this.success = success }

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

        fun build(): InferencePipelineDataStreamResponse =
            InferencePipelineDataStreamResponse(
                checkRequired("success", success),
                additionalProperties.toImmutable()
            )
    }

    class Success
    @JsonCreator
    private constructor(
        private val value: JsonField<Boolean>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = Success(JsonField.of(value))
        }

        enum class Known {
            TRUE,
        }

        enum class Value {
            TRUE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                else -> throw OpenlayerInvalidDataException("Unknown Success: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Success && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferencePipelineDataStreamResponse && success == other.success && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(success, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferencePipelineDataStreamResponse{success=$success, additionalProperties=$additionalProperties}"
}
