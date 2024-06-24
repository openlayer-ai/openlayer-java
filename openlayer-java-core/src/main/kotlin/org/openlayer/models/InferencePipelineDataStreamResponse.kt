// File generated from our OpenAPI spec by Stainless.

package org.openlayer.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import org.openlayer.core.Enum
import org.openlayer.core.ExcludeMissing
import org.openlayer.core.JsonField
import org.openlayer.core.JsonMissing
import org.openlayer.core.JsonValue
import org.openlayer.core.NoAutoDetect
import org.openlayer.core.toUnmodifiable
import org.openlayer.errors.OpenlayerInvalidDataException

@JsonDeserialize(builder = InferencePipelineDataStreamResponse.Builder::class)
@NoAutoDetect
class InferencePipelineDataStreamResponse
private constructor(
    private val success: JsonField<Success>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun success(): Success = success.getRequired("success")

    @JsonProperty("success") @ExcludeMissing fun _success() = success

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InferencePipelineDataStreamResponse = apply {
        if (!validated) {
            success()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferencePipelineDataStreamResponse &&
            this.success == other.success &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(success, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "InferencePipelineDataStreamResponse{success=$success, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var success: JsonField<Success> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inferencePipelineDataStreamResponse: InferencePipelineDataStreamResponse
        ) = apply {
            this.success = inferencePipelineDataStreamResponse.success
            additionalProperties(inferencePipelineDataStreamResponse.additionalProperties)
        }

        fun success(success: Success) = success(JsonField.of(success))

        @JsonProperty("success")
        @ExcludeMissing
        fun success(success: JsonField<Success>) = apply { this.success = success }

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

        fun build(): InferencePipelineDataStreamResponse =
            InferencePipelineDataStreamResponse(success, additionalProperties.toUnmodifiable())
    }

    class Success
    @JsonCreator
    private constructor(
        private val value: JsonField<Boolean>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Success && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TRUE = Success(JsonField.of(true))

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
    }
}
