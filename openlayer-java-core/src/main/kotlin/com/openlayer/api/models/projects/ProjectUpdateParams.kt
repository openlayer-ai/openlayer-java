// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a project's metadata. */
class ProjectUpdateParams
private constructor(
    private val projectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun projectId(): Optional<String> = Optional.ofNullable(projectId)

    /**
     * Number of days to retain monitoring data for this project. Null means data is retained
     * indefinitely.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataRetentionDays(): Optional<Long> = body.dataRetentionDays()

    /**
     * The project description.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Who developed the model used in this project.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelDeveloper(): Optional<String> = body.modelDeveloper()

    /**
     * The kinds of model used in this project.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelTypes(): Optional<List<String>> = body.modelTypes()

    /**
     * The project name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * What the system in this project is intended to do.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = body.purpose()

    /**
     * Returns the raw JSON value of [dataRetentionDays].
     *
     * Unlike [dataRetentionDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dataRetentionDays(): JsonField<Long> = body._dataRetentionDays()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [modelDeveloper].
     *
     * Unlike [modelDeveloper], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelDeveloper(): JsonField<String> = body._modelDeveloper()

    /**
     * Returns the raw JSON value of [modelTypes].
     *
     * Unlike [modelTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelTypes(): JsonField<List<String>> = body._modelTypes()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _purpose(): JsonField<String> = body._purpose()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProjectUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProjectUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectUpdateParams]. */
    class Builder internal constructor() {

        private var projectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectUpdateParams: ProjectUpdateParams) = apply {
            projectId = projectUpdateParams.projectId
            body = projectUpdateParams.body.toBuilder()
            additionalHeaders = projectUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectUpdateParams.additionalQueryParams.toBuilder()
        }

        fun projectId(projectId: String?) = apply { this.projectId = projectId }

        /** Alias for calling [Builder.projectId] with `projectId.orElse(null)`. */
        fun projectId(projectId: Optional<String>) = projectId(projectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dataRetentionDays]
         * - [description]
         * - [modelDeveloper]
         * - [modelTypes]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Number of days to retain monitoring data for this project. Null means data is retained
         * indefinitely.
         */
        fun dataRetentionDays(dataRetentionDays: Long?) = apply {
            body.dataRetentionDays(dataRetentionDays)
        }

        /**
         * Alias for [Builder.dataRetentionDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dataRetentionDays(dataRetentionDays: Long) =
            dataRetentionDays(dataRetentionDays as Long?)

        /** Alias for calling [Builder.dataRetentionDays] with `dataRetentionDays.orElse(null)`. */
        fun dataRetentionDays(dataRetentionDays: Optional<Long>) =
            dataRetentionDays(dataRetentionDays.getOrNull())

        /**
         * Sets [Builder.dataRetentionDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRetentionDays] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataRetentionDays(dataRetentionDays: JsonField<Long>) = apply {
            body.dataRetentionDays(dataRetentionDays)
        }

        /** The project description. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Who developed the model used in this project. */
        fun modelDeveloper(modelDeveloper: String?) = apply { body.modelDeveloper(modelDeveloper) }

        /** Alias for calling [Builder.modelDeveloper] with `modelDeveloper.orElse(null)`. */
        fun modelDeveloper(modelDeveloper: Optional<String>) =
            modelDeveloper(modelDeveloper.getOrNull())

        /**
         * Sets [Builder.modelDeveloper] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelDeveloper] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelDeveloper(modelDeveloper: JsonField<String>) = apply {
            body.modelDeveloper(modelDeveloper)
        }

        /** The kinds of model used in this project. */
        fun modelTypes(modelTypes: List<String>?) = apply { body.modelTypes(modelTypes) }

        /** Alias for calling [Builder.modelTypes] with `modelTypes.orElse(null)`. */
        fun modelTypes(modelTypes: Optional<List<String>>) = modelTypes(modelTypes.getOrNull())

        /**
         * Sets [Builder.modelTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modelTypes(modelTypes: JsonField<List<String>>) = apply { body.modelTypes(modelTypes) }

        /**
         * Adds a single [String] to [modelTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModelType(modelType: String) = apply { body.addModelType(modelType) }

        /** The project name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** What the system in this project is intended to do. */
        fun purpose(purpose: String?) = apply { body.purpose(purpose) }

        /** Alias for calling [Builder.purpose] with `purpose.orElse(null)`. */
        fun purpose(purpose: Optional<String>) = purpose(purpose.getOrNull())

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { body.purpose(purpose) }

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

        /**
         * Returns an immutable instance of [ProjectUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProjectUpdateParams =
            ProjectUpdateParams(
                projectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> projectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dataRetentionDays: JsonField<Long>,
        private val description: JsonField<String>,
        private val modelDeveloper: JsonField<String>,
        private val modelTypes: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val purpose: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataRetentionDays")
            @ExcludeMissing
            dataRetentionDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modelDeveloper")
            @ExcludeMissing
            modelDeveloper: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modelTypes")
            @ExcludeMissing
            modelTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
        ) : this(
            dataRetentionDays,
            description,
            modelDeveloper,
            modelTypes,
            name,
            purpose,
            mutableMapOf(),
        )

        /**
         * Number of days to retain monitoring data for this project. Null means data is retained
         * indefinitely.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataRetentionDays(): Optional<Long> = dataRetentionDays.getOptional("dataRetentionDays")

        /**
         * The project description.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Who developed the model used in this project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelDeveloper(): Optional<String> = modelDeveloper.getOptional("modelDeveloper")

        /**
         * The kinds of model used in this project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelTypes(): Optional<List<String>> = modelTypes.getOptional("modelTypes")

        /**
         * The project name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * What the system in this project is intended to do.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun purpose(): Optional<String> = purpose.getOptional("purpose")

        /**
         * Returns the raw JSON value of [dataRetentionDays].
         *
         * Unlike [dataRetentionDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dataRetentionDays")
        @ExcludeMissing
        fun _dataRetentionDays(): JsonField<Long> = dataRetentionDays

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [modelDeveloper].
         *
         * Unlike [modelDeveloper], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("modelDeveloper")
        @ExcludeMissing
        fun _modelDeveloper(): JsonField<String> = modelDeveloper

        /**
         * Returns the raw JSON value of [modelTypes].
         *
         * Unlike [modelTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelTypes")
        @ExcludeMissing
        fun _modelTypes(): JsonField<List<String>> = modelTypes

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [purpose].
         *
         * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var dataRetentionDays: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var modelDeveloper: JsonField<String> = JsonMissing.of()
            private var modelTypes: JsonField<MutableList<String>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var purpose: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                dataRetentionDays = body.dataRetentionDays
                description = body.description
                modelDeveloper = body.modelDeveloper
                modelTypes = body.modelTypes.map { it.toMutableList() }
                name = body.name
                purpose = body.purpose
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Number of days to retain monitoring data for this project. Null means data is
             * retained indefinitely.
             */
            fun dataRetentionDays(dataRetentionDays: Long?) =
                dataRetentionDays(JsonField.ofNullable(dataRetentionDays))

            /**
             * Alias for [Builder.dataRetentionDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun dataRetentionDays(dataRetentionDays: Long) =
                dataRetentionDays(dataRetentionDays as Long?)

            /**
             * Alias for calling [Builder.dataRetentionDays] with `dataRetentionDays.orElse(null)`.
             */
            fun dataRetentionDays(dataRetentionDays: Optional<Long>) =
                dataRetentionDays(dataRetentionDays.getOrNull())

            /**
             * Sets [Builder.dataRetentionDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataRetentionDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataRetentionDays(dataRetentionDays: JsonField<Long>) = apply {
                this.dataRetentionDays = dataRetentionDays
            }

            /** The project description. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Who developed the model used in this project. */
            fun modelDeveloper(modelDeveloper: String?) =
                modelDeveloper(JsonField.ofNullable(modelDeveloper))

            /** Alias for calling [Builder.modelDeveloper] with `modelDeveloper.orElse(null)`. */
            fun modelDeveloper(modelDeveloper: Optional<String>) =
                modelDeveloper(modelDeveloper.getOrNull())

            /**
             * Sets [Builder.modelDeveloper] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelDeveloper] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelDeveloper(modelDeveloper: JsonField<String>) = apply {
                this.modelDeveloper = modelDeveloper
            }

            /** The kinds of model used in this project. */
            fun modelTypes(modelTypes: List<String>?) = modelTypes(JsonField.ofNullable(modelTypes))

            /** Alias for calling [Builder.modelTypes] with `modelTypes.orElse(null)`. */
            fun modelTypes(modelTypes: Optional<List<String>>) = modelTypes(modelTypes.getOrNull())

            /**
             * Sets [Builder.modelTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelTypes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelTypes(modelTypes: JsonField<List<String>>) = apply {
                this.modelTypes = modelTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [modelTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addModelType(modelType: String) = apply {
                modelTypes =
                    (modelTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("modelTypes", it).add(modelType)
                    }
            }

            /** The project name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** What the system in this project is intended to do. */
            fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

            /** Alias for calling [Builder.purpose] with `purpose.orElse(null)`. */
            fun purpose(purpose: Optional<String>) = purpose(purpose.getOrNull())

            /**
             * Sets [Builder.purpose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purpose] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    dataRetentionDays,
                    description,
                    modelDeveloper,
                    (modelTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    purpose,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OpenlayerInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dataRetentionDays()
            description()
            modelDeveloper()
            modelTypes()
            name()
            purpose()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OpenlayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (dataRetentionDays.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (modelDeveloper.asKnown().isPresent) 1 else 0) +
                (modelTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (purpose.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dataRetentionDays == other.dataRetentionDays &&
                description == other.description &&
                modelDeveloper == other.modelDeveloper &&
                modelTypes == other.modelTypes &&
                name == other.name &&
                purpose == other.purpose &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dataRetentionDays,
                description,
                modelDeveloper,
                modelTypes,
                name,
                purpose,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dataRetentionDays=$dataRetentionDays, description=$description, modelDeveloper=$modelDeveloper, modelTypes=$modelTypes, name=$name, purpose=$purpose, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectUpdateParams &&
            projectId == other.projectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(projectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProjectUpdateParams{projectId=$projectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
