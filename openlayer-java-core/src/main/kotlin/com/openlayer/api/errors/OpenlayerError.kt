// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.NoAutoDetect
import com.openlayer.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = OpenlayerError.Builder::class)
@NoAutoDetect
class OpenlayerError
constructor(
    private val additionalProperties: Map<String, JsonValue>,
) {

    @JsonAnyGetter fun additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OpenlayerError && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
    }

    override fun toString() = "OpenlayerError{additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        fun from(error: OpenlayerError) = apply { additionalProperties(error.additionalProperties) }

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

        fun build(): OpenlayerError = OpenlayerError(additionalProperties.toImmutable())
    }
}
