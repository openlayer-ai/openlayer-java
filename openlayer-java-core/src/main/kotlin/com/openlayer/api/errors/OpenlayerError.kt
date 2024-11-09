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
private constructor(
    @JsonAnyGetter
    @get:JvmName("additionalProperties")
    val additionalProperties: Map<String, JsonValue>,
) {

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openlayerError: OpenlayerError) = apply {
            additionalProperties = openlayerError.additionalProperties.toMutableMap()
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): OpenlayerError = OpenlayerError(additionalProperties.toImmutable())
    }
}
