// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.projects.inferencepipelines

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.BaseDeserializer
import com.openlayer.api.core.BaseSerializer
import com.openlayer.api.core.Enum
import com.openlayer.api.core.ExcludeMissing
import com.openlayer.api.core.JsonField
import com.openlayer.api.core.JsonMissing
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.Params
import com.openlayer.api.core.allMaxBy
import com.openlayer.api.core.checkKnown
import com.openlayer.api.core.checkRequired
import com.openlayer.api.core.getOrThrow
import com.openlayer.api.core.http.Headers
import com.openlayer.api.core.http.QueryParams
import com.openlayer.api.core.toImmutable
import com.openlayer.api.errors.OpenlayerInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an inference pipeline in a project. */
class InferencePipelineCreateParams
private constructor(
    private val pathProjectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun pathProjectId(): Optional<String> = Optional.ofNullable(pathProjectId)

    /**
     * The inference pipeline id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = body.id()

    /**
     * The creation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateCreated(): OffsetDateTime = body.dateCreated()

    /**
     * The last test evaluation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastEvaluated(): Optional<OffsetDateTime> = body.dateLastEvaluated()

    /**
     * The last data sample received date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastSampleReceived(): Optional<OffsetDateTime> = body.dateLastSampleReceived()

    /**
     * The next test evaluation date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateOfNextEvaluation(): Optional<OffsetDateTime> = body.dateOfNextEvaluation()

    /**
     * The last updated date.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUpdated(): OffsetDateTime = body.dateUpdated()

    /**
     * The inference pipeline description.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The number of tests failing.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun failingGoalCount(): Long = body.failingGoalCount()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun links(): Links = body.links()

    /**
     * The inference pipeline name.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The number of tests passing.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun passingGoalCount(): Long = body.passingGoalCount()

    /**
     * The project id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bodyProjectId(): String = body.bodyProjectId()

    /**
     * The status of test evaluation for the inference pipeline.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = body.status()

    /**
     * The status message of test evaluation for the inference pipeline.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusMessage(): Optional<String> = body.statusMessage()

    /**
     * The total number of tests.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalGoalCount(): Long = body.totalGoalCount()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataBackend(): Optional<DataBackend> = body.dataBackend()

    /**
     * The last time the data was polled.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateLastPolled(): Optional<OffsetDateTime> = body.dateLastPolled()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun project(): Optional<Project> = body.project()

    /**
     * The total number of records in the data backend.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRecordsCount(): Optional<Long> = body.totalRecordsCount()

    /**
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspace(): Optional<Workspace> = body.workspace()

    /**
     * The workspace id.
     *
     * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceId(): Optional<String> = body.workspaceId()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [dateCreated].
     *
     * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateCreated(): JsonField<OffsetDateTime> = body._dateCreated()

    /**
     * Returns the raw JSON value of [dateLastEvaluated].
     *
     * Unlike [dateLastEvaluated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dateLastEvaluated(): JsonField<OffsetDateTime> = body._dateLastEvaluated()

    /**
     * Returns the raw JSON value of [dateLastSampleReceived].
     *
     * Unlike [dateLastSampleReceived], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _dateLastSampleReceived(): JsonField<OffsetDateTime> = body._dateLastSampleReceived()

    /**
     * Returns the raw JSON value of [dateOfNextEvaluation].
     *
     * Unlike [dateOfNextEvaluation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dateOfNextEvaluation(): JsonField<OffsetDateTime> = body._dateOfNextEvaluation()

    /**
     * Returns the raw JSON value of [dateUpdated].
     *
     * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateUpdated(): JsonField<OffsetDateTime> = body._dateUpdated()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [failingGoalCount].
     *
     * Unlike [failingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _failingGoalCount(): JsonField<Long> = body._failingGoalCount()

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _links(): JsonField<Links> = body._links()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [passingGoalCount].
     *
     * Unlike [passingGoalCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _passingGoalCount(): JsonField<Long> = body._passingGoalCount()

    /**
     * Returns the raw JSON value of [bodyProjectId].
     *
     * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bodyProjectId(): JsonField<String> = body._bodyProjectId()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    /**
     * Returns the raw JSON value of [statusMessage].
     *
     * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusMessage(): JsonField<String> = body._statusMessage()

    /**
     * Returns the raw JSON value of [totalGoalCount].
     *
     * Unlike [totalGoalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _totalGoalCount(): JsonField<Long> = body._totalGoalCount()

    /**
     * Returns the raw JSON value of [dataBackend].
     *
     * Unlike [dataBackend], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataBackend(): JsonField<DataBackend> = body._dataBackend()

    /**
     * Returns the raw JSON value of [dateLastPolled].
     *
     * Unlike [dateLastPolled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateLastPolled(): JsonField<OffsetDateTime> = body._dateLastPolled()

    /**
     * Returns the raw JSON value of [project].
     *
     * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _project(): JsonField<Project> = body._project()

    /**
     * Returns the raw JSON value of [totalRecordsCount].
     *
     * Unlike [totalRecordsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _totalRecordsCount(): JsonField<Long> = body._totalRecordsCount()

    /**
     * Returns the raw JSON value of [workspace].
     *
     * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _workspace(): JsonField<Workspace> = body._workspace()

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _workspaceId(): JsonField<String> = body._workspaceId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InferencePipelineCreateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastEvaluated()
         * .dateLastSampleReceived()
         * .dateOfNextEvaluation()
         * .dateUpdated()
         * .description()
         * .failingGoalCount()
         * .links()
         * .name()
         * .passingGoalCount()
         * .bodyProjectId()
         * .status()
         * .statusMessage()
         * .totalGoalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InferencePipelineCreateParams]. */
    class Builder internal constructor() {

        private var pathProjectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inferencePipelineCreateParams: InferencePipelineCreateParams) = apply {
            pathProjectId = inferencePipelineCreateParams.pathProjectId
            body = inferencePipelineCreateParams.body.toBuilder()
            additionalHeaders = inferencePipelineCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferencePipelineCreateParams.additionalQueryParams.toBuilder()
        }

        fun pathProjectId(pathProjectId: String?) = apply { this.pathProjectId = pathProjectId }

        /** Alias for calling [Builder.pathProjectId] with `pathProjectId.orElse(null)`. */
        fun pathProjectId(pathProjectId: Optional<String>) =
            pathProjectId(pathProjectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [dateCreated]
         * - [dateLastEvaluated]
         * - [dateLastSampleReceived]
         * - [dateOfNextEvaluation]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The inference pipeline id. */
        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        /** The creation date. */
        fun dateCreated(dateCreated: OffsetDateTime) = apply { body.dateCreated(dateCreated) }

        /**
         * Sets [Builder.dateCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
            body.dateCreated(dateCreated)
        }

        /** The last test evaluation date. */
        fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime?) = apply {
            body.dateLastEvaluated(dateLastEvaluated)
        }

        /** Alias for calling [Builder.dateLastEvaluated] with `dateLastEvaluated.orElse(null)`. */
        fun dateLastEvaluated(dateLastEvaluated: Optional<OffsetDateTime>) =
            dateLastEvaluated(dateLastEvaluated.getOrNull())

        /**
         * Sets [Builder.dateLastEvaluated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastEvaluated] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
            body.dateLastEvaluated(dateLastEvaluated)
        }

        /** The last data sample received date. */
        fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime?) = apply {
            body.dateLastSampleReceived(dateLastSampleReceived)
        }

        /**
         * Alias for calling [Builder.dateLastSampleReceived] with
         * `dateLastSampleReceived.orElse(null)`.
         */
        fun dateLastSampleReceived(dateLastSampleReceived: Optional<OffsetDateTime>) =
            dateLastSampleReceived(dateLastSampleReceived.getOrNull())

        /**
         * Sets [Builder.dateLastSampleReceived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastSampleReceived] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
            body.dateLastSampleReceived(dateLastSampleReceived)
        }

        /** The next test evaluation date. */
        fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime?) = apply {
            body.dateOfNextEvaluation(dateOfNextEvaluation)
        }

        /**
         * Alias for calling [Builder.dateOfNextEvaluation] with
         * `dateOfNextEvaluation.orElse(null)`.
         */
        fun dateOfNextEvaluation(dateOfNextEvaluation: Optional<OffsetDateTime>) =
            dateOfNextEvaluation(dateOfNextEvaluation.getOrNull())

        /**
         * Sets [Builder.dateOfNextEvaluation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateOfNextEvaluation] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
            body.dateOfNextEvaluation(dateOfNextEvaluation)
        }

        /** The last updated date. */
        fun dateUpdated(dateUpdated: OffsetDateTime) = apply { body.dateUpdated(dateUpdated) }

        /**
         * Sets [Builder.dateUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
            body.dateUpdated(dateUpdated)
        }

        /** The inference pipeline description. */
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

        /** The number of tests failing. */
        fun failingGoalCount(failingGoalCount: Long) = apply {
            body.failingGoalCount(failingGoalCount)
        }

        /**
         * Sets [Builder.failingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
            body.failingGoalCount(failingGoalCount)
        }

        fun links(links: Links) = apply { body.links(links) }

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [Links] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<Links>) = apply { body.links(links) }

        /** The inference pipeline name. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** The number of tests passing. */
        fun passingGoalCount(passingGoalCount: Long) = apply {
            body.passingGoalCount(passingGoalCount)
        }

        /**
         * Sets [Builder.passingGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passingGoalCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
            body.passingGoalCount(passingGoalCount)
        }

        /** The project id. */
        fun bodyProjectId(bodyProjectId: String) = apply { body.bodyProjectId(bodyProjectId) }

        /**
         * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bodyProjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
            body.bodyProjectId(bodyProjectId)
        }

        /** The status of test evaluation for the inference pipeline. */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /** The status message of test evaluation for the inference pipeline. */
        fun statusMessage(statusMessage: String?) = apply { body.statusMessage(statusMessage) }

        /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
        fun statusMessage(statusMessage: Optional<String>) =
            statusMessage(statusMessage.getOrNull())

        /**
         * Sets [Builder.statusMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun statusMessage(statusMessage: JsonField<String>) = apply {
            body.statusMessage(statusMessage)
        }

        /** The total number of tests. */
        fun totalGoalCount(totalGoalCount: Long) = apply { body.totalGoalCount(totalGoalCount) }

        /**
         * Sets [Builder.totalGoalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalGoalCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
            body.totalGoalCount(totalGoalCount)
        }

        fun dataBackend(dataBackend: DataBackend?) = apply { body.dataBackend(dataBackend) }

        /** Alias for calling [Builder.dataBackend] with `dataBackend.orElse(null)`. */
        fun dataBackend(dataBackend: Optional<DataBackend>) = dataBackend(dataBackend.getOrNull())

        /**
         * Sets [Builder.dataBackend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataBackend] with a well-typed [DataBackend] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataBackend(dataBackend: JsonField<DataBackend>) = apply {
            body.dataBackend(dataBackend)
        }

        /** Alias for calling [dataBackend] with `DataBackend.ofBigQuery(bigQuery)`. */
        fun dataBackend(bigQuery: DataBackend.BigQueryDataBackend) = apply {
            body.dataBackend(bigQuery)
        }

        /**
         * Alias for calling [dataBackend] with
         * `DataBackend.ofDefaultDataBackend(defaultDataBackend)`.
         */
        fun dataBackend(defaultDataBackend: DataBackend.DefaultDataBackend) = apply {
            body.dataBackend(defaultDataBackend)
        }

        /** Alias for calling [dataBackend] with `DataBackend.ofSnowflake(snowflake)`. */
        fun dataBackend(snowflake: DataBackend.SnowflakeDataBackend) = apply {
            body.dataBackend(snowflake)
        }

        /** Alias for calling [dataBackend] with `DataBackend.ofDatabricksDtl(databricksDtl)`. */
        fun dataBackend(databricksDtl: DataBackend.DatabricksDtlDataBackend) = apply {
            body.dataBackend(databricksDtl)
        }

        /** Alias for calling [dataBackend] with `DataBackend.ofRedshift(redshift)`. */
        fun dataBackend(redshift: DataBackend.RedshiftDataBackend) = apply {
            body.dataBackend(redshift)
        }

        /** Alias for calling [dataBackend] with `DataBackend.ofPostgres(postgres)`. */
        fun dataBackend(postgres: DataBackend.PostgresDataBackend) = apply {
            body.dataBackend(postgres)
        }

        /** The last time the data was polled. */
        fun dateLastPolled(dateLastPolled: OffsetDateTime?) = apply {
            body.dateLastPolled(dateLastPolled)
        }

        /** Alias for calling [Builder.dateLastPolled] with `dateLastPolled.orElse(null)`. */
        fun dateLastPolled(dateLastPolled: Optional<OffsetDateTime>) =
            dateLastPolled(dateLastPolled.getOrNull())

        /**
         * Sets [Builder.dateLastPolled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateLastPolled] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateLastPolled(dateLastPolled: JsonField<OffsetDateTime>) = apply {
            body.dateLastPolled(dateLastPolled)
        }

        fun project(project: Project?) = apply { body.project(project) }

        /** Alias for calling [Builder.project] with `project.orElse(null)`. */
        fun project(project: Optional<Project>) = project(project.getOrNull())

        /**
         * Sets [Builder.project] to an arbitrary JSON value.
         *
         * You should usually call [Builder.project] with a well-typed [Project] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun project(project: JsonField<Project>) = apply { body.project(project) }

        /** The total number of records in the data backend. */
        fun totalRecordsCount(totalRecordsCount: Long?) = apply {
            body.totalRecordsCount(totalRecordsCount)
        }

        /**
         * Alias for [Builder.totalRecordsCount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun totalRecordsCount(totalRecordsCount: Long) =
            totalRecordsCount(totalRecordsCount as Long?)

        /** Alias for calling [Builder.totalRecordsCount] with `totalRecordsCount.orElse(null)`. */
        fun totalRecordsCount(totalRecordsCount: Optional<Long>) =
            totalRecordsCount(totalRecordsCount.getOrNull())

        /**
         * Sets [Builder.totalRecordsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRecordsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalRecordsCount(totalRecordsCount: JsonField<Long>) = apply {
            body.totalRecordsCount(totalRecordsCount)
        }

        fun workspace(workspace: Workspace?) = apply { body.workspace(workspace) }

        /** Alias for calling [Builder.workspace] with `workspace.orElse(null)`. */
        fun workspace(workspace: Optional<Workspace>) = workspace(workspace.getOrNull())

        /**
         * Sets [Builder.workspace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspace] with a well-typed [Workspace] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspace(workspace: JsonField<Workspace>) = apply { body.workspace(workspace) }

        /** The workspace id. */
        fun workspaceId(workspaceId: String) = apply { body.workspaceId(workspaceId) }

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { body.workspaceId(workspaceId) }

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
         * Returns an immutable instance of [InferencePipelineCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dateCreated()
         * .dateLastEvaluated()
         * .dateLastSampleReceived()
         * .dateOfNextEvaluation()
         * .dateUpdated()
         * .description()
         * .failingGoalCount()
         * .links()
         * .name()
         * .passingGoalCount()
         * .bodyProjectId()
         * .status()
         * .statusMessage()
         * .totalGoalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferencePipelineCreateParams =
            InferencePipelineCreateParams(
                pathProjectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> pathProjectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateLastEvaluated: JsonField<OffsetDateTime>,
        private val dateLastSampleReceived: JsonField<OffsetDateTime>,
        private val dateOfNextEvaluation: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val failingGoalCount: JsonField<Long>,
        private val links: JsonField<Links>,
        private val name: JsonField<String>,
        private val passingGoalCount: JsonField<Long>,
        private val bodyProjectId: JsonField<String>,
        private val status: JsonField<Status>,
        private val statusMessage: JsonField<String>,
        private val totalGoalCount: JsonField<Long>,
        private val dataBackend: JsonField<DataBackend>,
        private val dateLastPolled: JsonField<OffsetDateTime>,
        private val project: JsonField<Project>,
        private val totalRecordsCount: JsonField<Long>,
        private val workspace: JsonField<Workspace>,
        private val workspaceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateLastEvaluated")
            @ExcludeMissing
            dateLastEvaluated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateLastSampleReceived")
            @ExcludeMissing
            dateLastSampleReceived: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateOfNextEvaluation")
            @ExcludeMissing
            dateOfNextEvaluation: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("failingGoalCount")
            @ExcludeMissing
            failingGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("passingGoalCount")
            @ExcludeMissing
            passingGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            bodyProjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("statusMessage")
            @ExcludeMissing
            statusMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalGoalCount")
            @ExcludeMissing
            totalGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("dataBackend")
            @ExcludeMissing
            dataBackend: JsonField<DataBackend> = JsonMissing.of(),
            @JsonProperty("dateLastPolled")
            @ExcludeMissing
            dateLastPolled: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("project") @ExcludeMissing project: JsonField<Project> = JsonMissing.of(),
            @JsonProperty("totalRecordsCount")
            @ExcludeMissing
            totalRecordsCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("workspace")
            @ExcludeMissing
            workspace: JsonField<Workspace> = JsonMissing.of(),
            @JsonProperty("workspaceId")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            dateCreated,
            dateLastEvaluated,
            dateLastSampleReceived,
            dateOfNextEvaluation,
            dateUpdated,
            description,
            failingGoalCount,
            links,
            name,
            passingGoalCount,
            bodyProjectId,
            status,
            statusMessage,
            totalGoalCount,
            dataBackend,
            dateLastPolled,
            project,
            totalRecordsCount,
            workspace,
            workspaceId,
            mutableMapOf(),
        )

        /**
         * The inference pipeline id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The last test evaluation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateLastEvaluated(): Optional<OffsetDateTime> =
            dateLastEvaluated.getOptional("dateLastEvaluated")

        /**
         * The last data sample received date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateLastSampleReceived(): Optional<OffsetDateTime> =
            dateLastSampleReceived.getOptional("dateLastSampleReceived")

        /**
         * The next test evaluation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateOfNextEvaluation(): Optional<OffsetDateTime> =
            dateOfNextEvaluation.getOptional("dateOfNextEvaluation")

        /**
         * The last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The inference pipeline description.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The number of tests failing.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun failingGoalCount(): Long = failingGoalCount.getRequired("failingGoalCount")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun links(): Links = links.getRequired("links")

        /**
         * The inference pipeline name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The number of tests passing.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun passingGoalCount(): Long = passingGoalCount.getRequired("passingGoalCount")

        /**
         * The project id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bodyProjectId(): String = bodyProjectId.getRequired("projectId")

        /**
         * The status of test evaluation for the inference pipeline.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The status message of test evaluation for the inference pipeline.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun statusMessage(): Optional<String> = statusMessage.getOptional("statusMessage")

        /**
         * The total number of tests.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalGoalCount(): Long = totalGoalCount.getRequired("totalGoalCount")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataBackend(): Optional<DataBackend> = dataBackend.getOptional("dataBackend")

        /**
         * The last time the data was polled.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dateLastPolled(): Optional<OffsetDateTime> =
            dateLastPolled.getOptional("dateLastPolled")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun project(): Optional<Project> = project.getOptional("project")

        /**
         * The total number of records in the data backend.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalRecordsCount(): Optional<Long> = totalRecordsCount.getOptional("totalRecordsCount")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspace(): Optional<Workspace> = workspace.getOptional("workspace")

        /**
         * The workspace id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> = workspaceId.getOptional("workspaceId")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateLastEvaluated].
         *
         * Unlike [dateLastEvaluated], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateLastEvaluated")
        @ExcludeMissing
        fun _dateLastEvaluated(): JsonField<OffsetDateTime> = dateLastEvaluated

        /**
         * Returns the raw JSON value of [dateLastSampleReceived].
         *
         * Unlike [dateLastSampleReceived], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dateLastSampleReceived")
        @ExcludeMissing
        fun _dateLastSampleReceived(): JsonField<OffsetDateTime> = dateLastSampleReceived

        /**
         * Returns the raw JSON value of [dateOfNextEvaluation].
         *
         * Unlike [dateOfNextEvaluation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("dateOfNextEvaluation")
        @ExcludeMissing
        fun _dateOfNextEvaluation(): JsonField<OffsetDateTime> = dateOfNextEvaluation

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [failingGoalCount].
         *
         * Unlike [failingGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("failingGoalCount")
        @ExcludeMissing
        fun _failingGoalCount(): JsonField<Long> = failingGoalCount

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [passingGoalCount].
         *
         * Unlike [passingGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("passingGoalCount")
        @ExcludeMissing
        fun _passingGoalCount(): JsonField<Long> = passingGoalCount

        /**
         * Returns the raw JSON value of [bodyProjectId].
         *
         * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectId")
        @ExcludeMissing
        fun _bodyProjectId(): JsonField<String> = bodyProjectId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [statusMessage].
         *
         * Unlike [statusMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("statusMessage")
        @ExcludeMissing
        fun _statusMessage(): JsonField<String> = statusMessage

        /**
         * Returns the raw JSON value of [totalGoalCount].
         *
         * Unlike [totalGoalCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalGoalCount")
        @ExcludeMissing
        fun _totalGoalCount(): JsonField<Long> = totalGoalCount

        /**
         * Returns the raw JSON value of [dataBackend].
         *
         * Unlike [dataBackend], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataBackend")
        @ExcludeMissing
        fun _dataBackend(): JsonField<DataBackend> = dataBackend

        /**
         * Returns the raw JSON value of [dateLastPolled].
         *
         * Unlike [dateLastPolled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateLastPolled")
        @ExcludeMissing
        fun _dateLastPolled(): JsonField<OffsetDateTime> = dateLastPolled

        /**
         * Returns the raw JSON value of [project].
         *
         * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Project> = project

        /**
         * Returns the raw JSON value of [totalRecordsCount].
         *
         * Unlike [totalRecordsCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalRecordsCount")
        @ExcludeMissing
        fun _totalRecordsCount(): JsonField<Long> = totalRecordsCount

        /**
         * Returns the raw JSON value of [workspace].
         *
         * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace")
        @ExcludeMissing
        fun _workspace(): JsonField<Workspace> = workspace

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dateCreated()
             * .dateLastEvaluated()
             * .dateLastSampleReceived()
             * .dateOfNextEvaluation()
             * .dateUpdated()
             * .description()
             * .failingGoalCount()
             * .links()
             * .name()
             * .passingGoalCount()
             * .bodyProjectId()
             * .status()
             * .statusMessage()
             * .totalGoalCount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateLastEvaluated: JsonField<OffsetDateTime>? = null
            private var dateLastSampleReceived: JsonField<OffsetDateTime>? = null
            private var dateOfNextEvaluation: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var description: JsonField<String>? = null
            private var failingGoalCount: JsonField<Long>? = null
            private var links: JsonField<Links>? = null
            private var name: JsonField<String>? = null
            private var passingGoalCount: JsonField<Long>? = null
            private var bodyProjectId: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var statusMessage: JsonField<String>? = null
            private var totalGoalCount: JsonField<Long>? = null
            private var dataBackend: JsonField<DataBackend> = JsonMissing.of()
            private var dateLastPolled: JsonField<OffsetDateTime> = JsonMissing.of()
            private var project: JsonField<Project> = JsonMissing.of()
            private var totalRecordsCount: JsonField<Long> = JsonMissing.of()
            private var workspace: JsonField<Workspace> = JsonMissing.of()
            private var workspaceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                dateCreated = body.dateCreated
                dateLastEvaluated = body.dateLastEvaluated
                dateLastSampleReceived = body.dateLastSampleReceived
                dateOfNextEvaluation = body.dateOfNextEvaluation
                dateUpdated = body.dateUpdated
                description = body.description
                failingGoalCount = body.failingGoalCount
                links = body.links
                name = body.name
                passingGoalCount = body.passingGoalCount
                bodyProjectId = body.bodyProjectId
                status = body.status
                statusMessage = body.statusMessage
                totalGoalCount = body.totalGoalCount
                dataBackend = body.dataBackend
                dateLastPolled = body.dateLastPolled
                project = body.project
                totalRecordsCount = body.totalRecordsCount
                workspace = body.workspace
                workspaceId = body.workspaceId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The inference pipeline id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The last test evaluation date. */
            fun dateLastEvaluated(dateLastEvaluated: OffsetDateTime?) =
                dateLastEvaluated(JsonField.ofNullable(dateLastEvaluated))

            /**
             * Alias for calling [Builder.dateLastEvaluated] with `dateLastEvaluated.orElse(null)`.
             */
            fun dateLastEvaluated(dateLastEvaluated: Optional<OffsetDateTime>) =
                dateLastEvaluated(dateLastEvaluated.getOrNull())

            /**
             * Sets [Builder.dateLastEvaluated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateLastEvaluated] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dateLastEvaluated(dateLastEvaluated: JsonField<OffsetDateTime>) = apply {
                this.dateLastEvaluated = dateLastEvaluated
            }

            /** The last data sample received date. */
            fun dateLastSampleReceived(dateLastSampleReceived: OffsetDateTime?) =
                dateLastSampleReceived(JsonField.ofNullable(dateLastSampleReceived))

            /**
             * Alias for calling [Builder.dateLastSampleReceived] with
             * `dateLastSampleReceived.orElse(null)`.
             */
            fun dateLastSampleReceived(dateLastSampleReceived: Optional<OffsetDateTime>) =
                dateLastSampleReceived(dateLastSampleReceived.getOrNull())

            /**
             * Sets [Builder.dateLastSampleReceived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateLastSampleReceived] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dateLastSampleReceived(dateLastSampleReceived: JsonField<OffsetDateTime>) = apply {
                this.dateLastSampleReceived = dateLastSampleReceived
            }

            /** The next test evaluation date. */
            fun dateOfNextEvaluation(dateOfNextEvaluation: OffsetDateTime?) =
                dateOfNextEvaluation(JsonField.ofNullable(dateOfNextEvaluation))

            /**
             * Alias for calling [Builder.dateOfNextEvaluation] with
             * `dateOfNextEvaluation.orElse(null)`.
             */
            fun dateOfNextEvaluation(dateOfNextEvaluation: Optional<OffsetDateTime>) =
                dateOfNextEvaluation(dateOfNextEvaluation.getOrNull())

            /**
             * Sets [Builder.dateOfNextEvaluation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfNextEvaluation] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun dateOfNextEvaluation(dateOfNextEvaluation: JsonField<OffsetDateTime>) = apply {
                this.dateOfNextEvaluation = dateOfNextEvaluation
            }

            /** The last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The inference pipeline description. */
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

            /** The number of tests failing. */
            fun failingGoalCount(failingGoalCount: Long) =
                failingGoalCount(JsonField.of(failingGoalCount))

            /**
             * Sets [Builder.failingGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failingGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failingGoalCount(failingGoalCount: JsonField<Long>) = apply {
                this.failingGoalCount = failingGoalCount
            }

            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** The inference pipeline name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The number of tests passing. */
            fun passingGoalCount(passingGoalCount: Long) =
                passingGoalCount(JsonField.of(passingGoalCount))

            /**
             * Sets [Builder.passingGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passingGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passingGoalCount(passingGoalCount: JsonField<Long>) = apply {
                this.passingGoalCount = passingGoalCount
            }

            /** The project id. */
            fun bodyProjectId(bodyProjectId: String) = bodyProjectId(JsonField.of(bodyProjectId))

            /**
             * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bodyProjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
                this.bodyProjectId = bodyProjectId
            }

            /** The status of test evaluation for the inference pipeline. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The status message of test evaluation for the inference pipeline. */
            fun statusMessage(statusMessage: String?) =
                statusMessage(JsonField.ofNullable(statusMessage))

            /** Alias for calling [Builder.statusMessage] with `statusMessage.orElse(null)`. */
            fun statusMessage(statusMessage: Optional<String>) =
                statusMessage(statusMessage.getOrNull())

            /**
             * Sets [Builder.statusMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusMessage(statusMessage: JsonField<String>) = apply {
                this.statusMessage = statusMessage
            }

            /** The total number of tests. */
            fun totalGoalCount(totalGoalCount: Long) = totalGoalCount(JsonField.of(totalGoalCount))

            /**
             * Sets [Builder.totalGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalGoalCount(totalGoalCount: JsonField<Long>) = apply {
                this.totalGoalCount = totalGoalCount
            }

            fun dataBackend(dataBackend: DataBackend?) =
                dataBackend(JsonField.ofNullable(dataBackend))

            /** Alias for calling [Builder.dataBackend] with `dataBackend.orElse(null)`. */
            fun dataBackend(dataBackend: Optional<DataBackend>) =
                dataBackend(dataBackend.getOrNull())

            /**
             * Sets [Builder.dataBackend] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataBackend] with a well-typed [DataBackend] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataBackend(dataBackend: JsonField<DataBackend>) = apply {
                this.dataBackend = dataBackend
            }

            /** Alias for calling [dataBackend] with `DataBackend.ofBigQuery(bigQuery)`. */
            fun dataBackend(bigQuery: DataBackend.BigQueryDataBackend) =
                dataBackend(DataBackend.ofBigQuery(bigQuery))

            /**
             * Alias for calling [dataBackend] with
             * `DataBackend.ofDefaultDataBackend(defaultDataBackend)`.
             */
            fun dataBackend(defaultDataBackend: DataBackend.DefaultDataBackend) =
                dataBackend(DataBackend.ofDefaultDataBackend(defaultDataBackend))

            /** Alias for calling [dataBackend] with `DataBackend.ofSnowflake(snowflake)`. */
            fun dataBackend(snowflake: DataBackend.SnowflakeDataBackend) =
                dataBackend(DataBackend.ofSnowflake(snowflake))

            /**
             * Alias for calling [dataBackend] with `DataBackend.ofDatabricksDtl(databricksDtl)`.
             */
            fun dataBackend(databricksDtl: DataBackend.DatabricksDtlDataBackend) =
                dataBackend(DataBackend.ofDatabricksDtl(databricksDtl))

            /** Alias for calling [dataBackend] with `DataBackend.ofRedshift(redshift)`. */
            fun dataBackend(redshift: DataBackend.RedshiftDataBackend) =
                dataBackend(DataBackend.ofRedshift(redshift))

            /** Alias for calling [dataBackend] with `DataBackend.ofPostgres(postgres)`. */
            fun dataBackend(postgres: DataBackend.PostgresDataBackend) =
                dataBackend(DataBackend.ofPostgres(postgres))

            /** The last time the data was polled. */
            fun dateLastPolled(dateLastPolled: OffsetDateTime?) =
                dateLastPolled(JsonField.ofNullable(dateLastPolled))

            /** Alias for calling [Builder.dateLastPolled] with `dateLastPolled.orElse(null)`. */
            fun dateLastPolled(dateLastPolled: Optional<OffsetDateTime>) =
                dateLastPolled(dateLastPolled.getOrNull())

            /**
             * Sets [Builder.dateLastPolled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateLastPolled] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateLastPolled(dateLastPolled: JsonField<OffsetDateTime>) = apply {
                this.dateLastPolled = dateLastPolled
            }

            fun project(project: Project?) = project(JsonField.ofNullable(project))

            /** Alias for calling [Builder.project] with `project.orElse(null)`. */
            fun project(project: Optional<Project>) = project(project.getOrNull())

            /**
             * Sets [Builder.project] to an arbitrary JSON value.
             *
             * You should usually call [Builder.project] with a well-typed [Project] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun project(project: JsonField<Project>) = apply { this.project = project }

            /** The total number of records in the data backend. */
            fun totalRecordsCount(totalRecordsCount: Long?) =
                totalRecordsCount(JsonField.ofNullable(totalRecordsCount))

            /**
             * Alias for [Builder.totalRecordsCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalRecordsCount(totalRecordsCount: Long) =
                totalRecordsCount(totalRecordsCount as Long?)

            /**
             * Alias for calling [Builder.totalRecordsCount] with `totalRecordsCount.orElse(null)`.
             */
            fun totalRecordsCount(totalRecordsCount: Optional<Long>) =
                totalRecordsCount(totalRecordsCount.getOrNull())

            /**
             * Sets [Builder.totalRecordsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRecordsCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRecordsCount(totalRecordsCount: JsonField<Long>) = apply {
                this.totalRecordsCount = totalRecordsCount
            }

            fun workspace(workspace: Workspace?) = workspace(JsonField.ofNullable(workspace))

            /** Alias for calling [Builder.workspace] with `workspace.orElse(null)`. */
            fun workspace(workspace: Optional<Workspace>) = workspace(workspace.getOrNull())

            /**
             * Sets [Builder.workspace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspace] with a well-typed [Workspace] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

            /** The workspace id. */
            fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .dateCreated()
             * .dateLastEvaluated()
             * .dateLastSampleReceived()
             * .dateOfNextEvaluation()
             * .dateUpdated()
             * .description()
             * .failingGoalCount()
             * .links()
             * .name()
             * .passingGoalCount()
             * .bodyProjectId()
             * .status()
             * .statusMessage()
             * .totalGoalCount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("id", id),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateLastEvaluated", dateLastEvaluated),
                    checkRequired("dateLastSampleReceived", dateLastSampleReceived),
                    checkRequired("dateOfNextEvaluation", dateOfNextEvaluation),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("description", description),
                    checkRequired("failingGoalCount", failingGoalCount),
                    checkRequired("links", links),
                    checkRequired("name", name),
                    checkRequired("passingGoalCount", passingGoalCount),
                    checkRequired("bodyProjectId", bodyProjectId),
                    checkRequired("status", status),
                    checkRequired("statusMessage", statusMessage),
                    checkRequired("totalGoalCount", totalGoalCount),
                    dataBackend,
                    dateLastPolled,
                    project,
                    totalRecordsCount,
                    workspace,
                    workspaceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            dateCreated()
            dateLastEvaluated()
            dateLastSampleReceived()
            dateOfNextEvaluation()
            dateUpdated()
            description()
            failingGoalCount()
            links().validate()
            name()
            passingGoalCount()
            bodyProjectId()
            status().validate()
            statusMessage()
            totalGoalCount()
            dataBackend().ifPresent { it.validate() }
            dateLastPolled()
            project().ifPresent { it.validate() }
            totalRecordsCount()
            workspace().ifPresent { it.validate() }
            workspaceId()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateLastEvaluated.asKnown().isPresent) 1 else 0) +
                (if (dateLastSampleReceived.asKnown().isPresent) 1 else 0) +
                (if (dateOfNextEvaluation.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (failingGoalCount.asKnown().isPresent) 1 else 0) +
                (links.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (passingGoalCount.asKnown().isPresent) 1 else 0) +
                (if (bodyProjectId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (statusMessage.asKnown().isPresent) 1 else 0) +
                (if (totalGoalCount.asKnown().isPresent) 1 else 0) +
                (dataBackend.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dateLastPolled.asKnown().isPresent) 1 else 0) +
                (project.asKnown().getOrNull()?.validity() ?: 0) +
                (if (totalRecordsCount.asKnown().isPresent) 1 else 0) +
                (workspace.asKnown().getOrNull()?.validity() ?: 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                dateCreated == other.dateCreated &&
                dateLastEvaluated == other.dateLastEvaluated &&
                dateLastSampleReceived == other.dateLastSampleReceived &&
                dateOfNextEvaluation == other.dateOfNextEvaluation &&
                dateUpdated == other.dateUpdated &&
                description == other.description &&
                failingGoalCount == other.failingGoalCount &&
                links == other.links &&
                name == other.name &&
                passingGoalCount == other.passingGoalCount &&
                bodyProjectId == other.bodyProjectId &&
                status == other.status &&
                statusMessage == other.statusMessage &&
                totalGoalCount == other.totalGoalCount &&
                dataBackend == other.dataBackend &&
                dateLastPolled == other.dateLastPolled &&
                project == other.project &&
                totalRecordsCount == other.totalRecordsCount &&
                workspace == other.workspace &&
                workspaceId == other.workspaceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                dateCreated,
                dateLastEvaluated,
                dateLastSampleReceived,
                dateOfNextEvaluation,
                dateUpdated,
                description,
                failingGoalCount,
                links,
                name,
                passingGoalCount,
                bodyProjectId,
                status,
                statusMessage,
                totalGoalCount,
                dataBackend,
                dateLastPolled,
                project,
                totalRecordsCount,
                workspace,
                workspaceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, dateCreated=$dateCreated, dateLastEvaluated=$dateLastEvaluated, dateLastSampleReceived=$dateLastSampleReceived, dateOfNextEvaluation=$dateOfNextEvaluation, dateUpdated=$dateUpdated, description=$description, failingGoalCount=$failingGoalCount, links=$links, name=$name, passingGoalCount=$passingGoalCount, bodyProjectId=$bodyProjectId, status=$status, statusMessage=$statusMessage, totalGoalCount=$totalGoalCount, dataBackend=$dataBackend, dateLastPolled=$dateLastPolled, project=$project, totalRecordsCount=$totalRecordsCount, workspace=$workspace, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
    }

    class Links
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val app: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of()
        ) : this(app, mutableMapOf())

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun app(): String = app.getRequired("app")

        /**
         * Returns the raw JSON value of [app].
         *
         * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

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

            /**
             * Returns a mutable builder for constructing an instance of [Links].
             *
             * The following fields are required:
             * ```java
             * .app()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Links]. */
        class Builder internal constructor() {

            private var app: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                app = links.app
                additionalProperties = links.additionalProperties.toMutableMap()
            }

            fun app(app: String) = app(JsonField.of(app))

            /**
             * Sets [Builder.app] to an arbitrary JSON value.
             *
             * You should usually call [Builder.app] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun app(app: JsonField<String>) = apply { this.app = app }

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
             * Returns an immutable instance of [Links].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .app()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Links =
                Links(checkRequired("app", app), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Links = apply {
            if (validated) {
                return@apply
            }

            app()
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
        @JvmSynthetic internal fun validity(): Int = (if (app.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Links &&
                app == other.app &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(app, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
    }

    /** The status of test evaluation for the inference pipeline. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUEUED = of("queued")

            @JvmField val RUNNING = of("running")

            @JvmField val PAUSED = of("paused")

            @JvmField val FAILED = of("failed")

            @JvmField val COMPLETED = of("completed")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            RUNNING,
            PAUSED,
            FAILED,
            COMPLETED,
            UNKNOWN,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                QUEUED -> Value.QUEUED
                RUNNING -> Value.RUNNING
                PAUSED -> Value.PAUSED
                FAILED -> Value.FAILED
                COMPLETED -> Value.COMPLETED
                UNKNOWN -> Value.UNKNOWN
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
                QUEUED -> Known.QUEUED
                RUNNING -> Known.RUNNING
                PAUSED -> Known.PAUSED
                FAILED -> Known.FAILED
                COMPLETED -> Known.COMPLETED
                UNKNOWN -> Known.UNKNOWN
                else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = DataBackend.Deserializer::class)
    @JsonSerialize(using = DataBackend.Serializer::class)
    class DataBackend
    private constructor(
        private val bigQuery: BigQueryDataBackend? = null,
        private val defaultDataBackend: DefaultDataBackend? = null,
        private val snowflake: SnowflakeDataBackend? = null,
        private val databricksDtl: DatabricksDtlDataBackend? = null,
        private val redshift: RedshiftDataBackend? = null,
        private val postgres: PostgresDataBackend? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bigQuery(): Optional<BigQueryDataBackend> = Optional.ofNullable(bigQuery)

        fun defaultDataBackend(): Optional<DefaultDataBackend> =
            Optional.ofNullable(defaultDataBackend)

        fun snowflake(): Optional<SnowflakeDataBackend> = Optional.ofNullable(snowflake)

        fun databricksDtl(): Optional<DatabricksDtlDataBackend> = Optional.ofNullable(databricksDtl)

        fun redshift(): Optional<RedshiftDataBackend> = Optional.ofNullable(redshift)

        fun postgres(): Optional<PostgresDataBackend> = Optional.ofNullable(postgres)

        fun isBigQuery(): Boolean = bigQuery != null

        fun isDefaultDataBackend(): Boolean = defaultDataBackend != null

        fun isSnowflake(): Boolean = snowflake != null

        fun isDatabricksDtl(): Boolean = databricksDtl != null

        fun isRedshift(): Boolean = redshift != null

        fun isPostgres(): Boolean = postgres != null

        fun asBigQuery(): BigQueryDataBackend = bigQuery.getOrThrow("bigQuery")

        fun asDefaultDataBackend(): DefaultDataBackend =
            defaultDataBackend.getOrThrow("defaultDataBackend")

        fun asSnowflake(): SnowflakeDataBackend = snowflake.getOrThrow("snowflake")

        fun asDatabricksDtl(): DatabricksDtlDataBackend = databricksDtl.getOrThrow("databricksDtl")

        fun asRedshift(): RedshiftDataBackend = redshift.getOrThrow("redshift")

        fun asPostgres(): PostgresDataBackend = postgres.getOrThrow("postgres")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bigQuery != null -> visitor.visitBigQuery(bigQuery)
                defaultDataBackend != null -> visitor.visitDefaultDataBackend(defaultDataBackend)
                snowflake != null -> visitor.visitSnowflake(snowflake)
                databricksDtl != null -> visitor.visitDatabricksDtl(databricksDtl)
                redshift != null -> visitor.visitRedshift(redshift)
                postgres != null -> visitor.visitPostgres(postgres)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): DataBackend = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBigQuery(bigQuery: BigQueryDataBackend) {
                        bigQuery.validate()
                    }

                    override fun visitDefaultDataBackend(defaultDataBackend: DefaultDataBackend) {
                        defaultDataBackend.validate()
                    }

                    override fun visitSnowflake(snowflake: SnowflakeDataBackend) {
                        snowflake.validate()
                    }

                    override fun visitDatabricksDtl(databricksDtl: DatabricksDtlDataBackend) {
                        databricksDtl.validate()
                    }

                    override fun visitRedshift(redshift: RedshiftDataBackend) {
                        redshift.validate()
                    }

                    override fun visitPostgres(postgres: PostgresDataBackend) {
                        postgres.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitBigQuery(bigQuery: BigQueryDataBackend) = bigQuery.validity()

                    override fun visitDefaultDataBackend(defaultDataBackend: DefaultDataBackend) =
                        defaultDataBackend.validity()

                    override fun visitSnowflake(snowflake: SnowflakeDataBackend) =
                        snowflake.validity()

                    override fun visitDatabricksDtl(databricksDtl: DatabricksDtlDataBackend) =
                        databricksDtl.validity()

                    override fun visitRedshift(redshift: RedshiftDataBackend) = redshift.validity()

                    override fun visitPostgres(postgres: PostgresDataBackend) = postgres.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataBackend &&
                bigQuery == other.bigQuery &&
                defaultDataBackend == other.defaultDataBackend &&
                snowflake == other.snowflake &&
                databricksDtl == other.databricksDtl &&
                redshift == other.redshift &&
                postgres == other.postgres
        }

        override fun hashCode(): Int =
            Objects.hash(bigQuery, defaultDataBackend, snowflake, databricksDtl, redshift, postgres)

        override fun toString(): String =
            when {
                bigQuery != null -> "DataBackend{bigQuery=$bigQuery}"
                defaultDataBackend != null -> "DataBackend{defaultDataBackend=$defaultDataBackend}"
                snowflake != null -> "DataBackend{snowflake=$snowflake}"
                databricksDtl != null -> "DataBackend{databricksDtl=$databricksDtl}"
                redshift != null -> "DataBackend{redshift=$redshift}"
                postgres != null -> "DataBackend{postgres=$postgres}"
                _json != null -> "DataBackend{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DataBackend")
            }

        companion object {

            @JvmStatic
            fun ofBigQuery(bigQuery: BigQueryDataBackend) = DataBackend(bigQuery = bigQuery)

            @JvmStatic
            fun ofDefaultDataBackend(defaultDataBackend: DefaultDataBackend) =
                DataBackend(defaultDataBackend = defaultDataBackend)

            @JvmStatic
            fun ofSnowflake(snowflake: SnowflakeDataBackend) = DataBackend(snowflake = snowflake)

            @JvmStatic
            fun ofDatabricksDtl(databricksDtl: DatabricksDtlDataBackend) =
                DataBackend(databricksDtl = databricksDtl)

            @JvmStatic
            fun ofRedshift(redshift: RedshiftDataBackend) = DataBackend(redshift = redshift)

            @JvmStatic
            fun ofPostgres(postgres: PostgresDataBackend) = DataBackend(postgres = postgres)
        }

        /**
         * An interface that defines how to map each variant of [DataBackend] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitBigQuery(bigQuery: BigQueryDataBackend): T

            fun visitDefaultDataBackend(defaultDataBackend: DefaultDataBackend): T

            fun visitSnowflake(snowflake: SnowflakeDataBackend): T

            fun visitDatabricksDtl(databricksDtl: DatabricksDtlDataBackend): T

            fun visitRedshift(redshift: RedshiftDataBackend): T

            fun visitPostgres(postgres: PostgresDataBackend): T

            /**
             * Maps an unknown variant of [DataBackend] to a value of type [T].
             *
             * An instance of [DataBackend] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OpenlayerInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OpenlayerInvalidDataException("Unknown DataBackend: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<DataBackend>(DataBackend::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DataBackend {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BigQueryDataBackend>())?.let {
                                DataBackend(bigQuery = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DefaultDataBackend>())?.let {
                                DataBackend(defaultDataBackend = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SnowflakeDataBackend>())?.let {
                                DataBackend(snowflake = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DatabricksDtlDataBackend>())?.let {
                                DataBackend(databricksDtl = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RedshiftDataBackend>())?.let {
                                DataBackend(redshift = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PostgresDataBackend>())?.let {
                                DataBackend(postgres = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> DataBackend(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<DataBackend>(DataBackend::class) {

            override fun serialize(
                value: DataBackend,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bigQuery != null -> generator.writeObject(value.bigQuery)
                    value.defaultDataBackend != null ->
                        generator.writeObject(value.defaultDataBackend)
                    value.snowflake != null -> generator.writeObject(value.snowflake)
                    value.databricksDtl != null -> generator.writeObject(value.databricksDtl)
                    value.redshift != null -> generator.writeObject(value.redshift)
                    value.postgres != null -> generator.writeObject(value.postgres)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DataBackend")
                }
            }
        }

        class BigQueryDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val bigqueryConnectionId: JsonField<String>,
            private val config: JsonField<Config>,
            private val datasetId: JsonField<String>,
            private val bodyProjectId: JsonField<String>,
            private val tableId: JsonField<String>,
            private val partitionType: JsonField<PartitionType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of(),
                @JsonProperty("bigqueryConnectionId")
                @ExcludeMissing
                bigqueryConnectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("datasetId")
                @ExcludeMissing
                datasetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("projectId")
                @ExcludeMissing
                bodyProjectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tableId")
                @ExcludeMissing
                tableId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("partitionType")
                @ExcludeMissing
                partitionType: JsonField<PartitionType> = JsonMissing.of(),
            ) : this(
                backendType,
                bigqueryConnectionId,
                config,
                datasetId,
                bodyProjectId,
                tableId,
                partitionType,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun bigqueryConnectionId(): Optional<String> =
                bigqueryConnectionId.getOptional("bigqueryConnectionId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun config(): Config = config.getRequired("config")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun datasetId(): String = datasetId.getRequired("datasetId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bodyProjectId(): String = bodyProjectId.getRequired("projectId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tableId(): Optional<String> = tableId.getOptional("tableId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun partitionType(): Optional<PartitionType> =
                partitionType.getOptional("partitionType")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

            /**
             * Returns the raw JSON value of [bigqueryConnectionId].
             *
             * Unlike [bigqueryConnectionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bigqueryConnectionId")
            @ExcludeMissing
            fun _bigqueryConnectionId(): JsonField<String> = bigqueryConnectionId

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [datasetId].
             *
             * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("datasetId")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            /**
             * Returns the raw JSON value of [bodyProjectId].
             *
             * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun _bodyProjectId(): JsonField<String> = bodyProjectId

            /**
             * Returns the raw JSON value of [tableId].
             *
             * Unlike [tableId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tableId") @ExcludeMissing fun _tableId(): JsonField<String> = tableId

            /**
             * Returns the raw JSON value of [partitionType].
             *
             * Unlike [partitionType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("partitionType")
            @ExcludeMissing
            fun _partitionType(): JsonField<PartitionType> = partitionType

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

                /**
                 * Returns a mutable builder for constructing an instance of [BigQueryDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .bigqueryConnectionId()
                 * .config()
                 * .datasetId()
                 * .bodyProjectId()
                 * .tableId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BigQueryDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var bigqueryConnectionId: JsonField<String>? = null
                private var config: JsonField<Config>? = null
                private var datasetId: JsonField<String>? = null
                private var bodyProjectId: JsonField<String>? = null
                private var tableId: JsonField<String>? = null
                private var partitionType: JsonField<PartitionType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bigQueryDataBackend: BigQueryDataBackend) = apply {
                    backendType = bigQueryDataBackend.backendType
                    bigqueryConnectionId = bigQueryDataBackend.bigqueryConnectionId
                    config = bigQueryDataBackend.config
                    datasetId = bigQueryDataBackend.datasetId
                    bodyProjectId = bigQueryDataBackend.bodyProjectId
                    tableId = bigQueryDataBackend.tableId
                    partitionType = bigQueryDataBackend.partitionType
                    additionalProperties = bigQueryDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun bigqueryConnectionId(bigqueryConnectionId: String?) =
                    bigqueryConnectionId(JsonField.ofNullable(bigqueryConnectionId))

                /**
                 * Alias for calling [Builder.bigqueryConnectionId] with
                 * `bigqueryConnectionId.orElse(null)`.
                 */
                fun bigqueryConnectionId(bigqueryConnectionId: Optional<String>) =
                    bigqueryConnectionId(bigqueryConnectionId.getOrNull())

                /**
                 * Sets [Builder.bigqueryConnectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bigqueryConnectionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun bigqueryConnectionId(bigqueryConnectionId: JsonField<String>) = apply {
                    this.bigqueryConnectionId = bigqueryConnectionId
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                /**
                 * Sets [Builder.datasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun bodyProjectId(bodyProjectId: String) =
                    bodyProjectId(JsonField.of(bodyProjectId))

                /**
                 * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyProjectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
                    this.bodyProjectId = bodyProjectId
                }

                fun tableId(tableId: String?) = tableId(JsonField.ofNullable(tableId))

                /** Alias for calling [Builder.tableId] with `tableId.orElse(null)`. */
                fun tableId(tableId: Optional<String>) = tableId(tableId.getOrNull())

                /**
                 * Sets [Builder.tableId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tableId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tableId(tableId: JsonField<String>) = apply { this.tableId = tableId }

                fun partitionType(partitionType: PartitionType?) =
                    partitionType(JsonField.ofNullable(partitionType))

                /** Alias for calling [Builder.partitionType] with `partitionType.orElse(null)`. */
                fun partitionType(partitionType: Optional<PartitionType>) =
                    partitionType(partitionType.getOrNull())

                /**
                 * Sets [Builder.partitionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partitionType] with a well-typed [PartitionType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun partitionType(partitionType: JsonField<PartitionType>) = apply {
                    this.partitionType = partitionType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BigQueryDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .bigqueryConnectionId()
                 * .config()
                 * .datasetId()
                 * .bodyProjectId()
                 * .tableId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BigQueryDataBackend =
                    BigQueryDataBackend(
                        checkRequired("backendType", backendType),
                        checkRequired("bigqueryConnectionId", bigqueryConnectionId),
                        checkRequired("config", config),
                        checkRequired("datasetId", datasetId),
                        checkRequired("bodyProjectId", bodyProjectId),
                        checkRequired("tableId", tableId),
                        partitionType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BigQueryDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
                bigqueryConnectionId()
                config().validate()
                datasetId()
                bodyProjectId()
                tableId()
                partitionType().ifPresent { it.validate() }
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
                (backendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (bigqueryConnectionId.asKnown().isPresent) 1 else 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (datasetId.asKnown().isPresent) 1 else 0) +
                    (if (bodyProjectId.asKnown().isPresent) 1 else 0) +
                    (if (tableId.asKnown().isPresent) 1 else 0) +
                    (partitionType.asKnown().getOrNull()?.validity() ?: 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BIGQUERY = of("bigquery")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    BIGQUERY
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BIGQUERY,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BIGQUERY -> Value.BIGQUERY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BIGQUERY -> Known.BIGQUERY
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groundTruthColumnName: JsonField<String>,
                private val humanFeedbackColumnName: JsonField<String>,
                private val inferenceIdColumnName: JsonField<String>,
                private val latencyColumnName: JsonField<String>,
                private val timestampColumnName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("groundTruthColumnName")
                    @ExcludeMissing
                    groundTruthColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("humanFeedbackColumnName")
                    @ExcludeMissing
                    humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inferenceIdColumnName")
                    @ExcludeMissing
                    inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("latencyColumnName")
                    @ExcludeMissing
                    latencyColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestampColumnName")
                    @ExcludeMissing
                    timestampColumnName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    mutableMapOf(),
                )

                /**
                 * Name of the column with the ground truths.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groundTruthColumnName(): Optional<String> =
                    groundTruthColumnName.getOptional("groundTruthColumnName")

                /**
                 * Name of the column with human feedback.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun humanFeedbackColumnName(): Optional<String> =
                    humanFeedbackColumnName.getOptional("humanFeedbackColumnName")

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inferenceIdColumnName(): Optional<String> =
                    inferenceIdColumnName.getOptional("inferenceIdColumnName")

                /**
                 * Name of the column with the latencies.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun latencyColumnName(): Optional<String> =
                    latencyColumnName.getOptional("latencyColumnName")

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestampColumnName(): Optional<String> =
                    timestampColumnName.getOptional("timestampColumnName")

                /**
                 * Returns the raw JSON value of [groundTruthColumnName].
                 *
                 * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
                fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

                /**
                 * Returns the raw JSON value of [humanFeedbackColumnName].
                 *
                 * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("humanFeedbackColumnName")
                @ExcludeMissing
                fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

                /**
                 * Returns the raw JSON value of [inferenceIdColumnName].
                 *
                 * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

                /**
                 * Returns the raw JSON value of [latencyColumnName].
                 *
                 * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun _latencyColumnName(): JsonField<String> = latencyColumnName

                /**
                 * Returns the raw JSON value of [timestampColumnName].
                 *
                 * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                    private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
                    private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                    private var latencyColumnName: JsonField<String> = JsonMissing.of()
                    private var timestampColumnName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(config: Config) = apply {
                        groundTruthColumnName = config.groundTruthColumnName
                        humanFeedbackColumnName = config.humanFeedbackColumnName
                        inferenceIdColumnName = config.inferenceIdColumnName
                        latencyColumnName = config.latencyColumnName
                        timestampColumnName = config.timestampColumnName
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

                    /** Name of the column with the ground truths. */
                    fun groundTruthColumnName(groundTruthColumnName: String?) =
                        groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

                    /**
                     * Alias for calling [Builder.groundTruthColumnName] with
                     * `groundTruthColumnName.orElse(null)`.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                        groundTruthColumnName(groundTruthColumnName.getOrNull())

                    /**
                     * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groundTruthColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                        this.groundTruthColumnName = groundTruthColumnName
                    }

                    /** Name of the column with human feedback. */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                        humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

                    /**
                     * Alias for calling [Builder.humanFeedbackColumnName] with
                     * `humanFeedbackColumnName.orElse(null)`.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                        humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

                    /**
                     * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.humanFeedbackColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) =
                        apply {
                            this.humanFeedbackColumnName = humanFeedbackColumnName
                        }

                    /**
                     * Name of the column with the inference ids. This is useful if you want to
                     * update rows at a later point in time. If not provided, a unique id is
                     * generated by Openlayer.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                        inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

                    /**
                     * Alias for calling [Builder.inferenceIdColumnName] with
                     * `inferenceIdColumnName.orElse(null)`.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                        inferenceIdColumnName(inferenceIdColumnName.getOrNull())

                    /**
                     * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                        this.inferenceIdColumnName = inferenceIdColumnName
                    }

                    /** Name of the column with the latencies. */
                    fun latencyColumnName(latencyColumnName: String?) =
                        latencyColumnName(JsonField.ofNullable(latencyColumnName))

                    /**
                     * Alias for calling [Builder.latencyColumnName] with
                     * `latencyColumnName.orElse(null)`.
                     */
                    fun latencyColumnName(latencyColumnName: Optional<String>) =
                        latencyColumnName(latencyColumnName.getOrNull())

                    /**
                     * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latencyColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                        this.latencyColumnName = latencyColumnName
                    }

                    /**
                     * Name of the column with the timestamps. Timestamps must be in UNIX sec
                     * format. If not provided, the upload timestamp is used.
                     */
                    fun timestampColumnName(timestampColumnName: String?) =
                        timestampColumnName(JsonField.ofNullable(timestampColumnName))

                    /**
                     * Alias for calling [Builder.timestampColumnName] with
                     * `timestampColumnName.orElse(null)`.
                     */
                    fun timestampColumnName(timestampColumnName: Optional<String>) =
                        timestampColumnName(timestampColumnName.getOrNull())

                    /**
                     * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestampColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                        this.timestampColumnName = timestampColumnName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config =
                        Config(
                            groundTruthColumnName,
                            humanFeedbackColumnName,
                            inferenceIdColumnName,
                            latencyColumnName,
                            timestampColumnName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
                    if (validated) {
                        return@apply
                    }

                    groundTruthColumnName()
                    humanFeedbackColumnName()
                    inferenceIdColumnName()
                    latencyColumnName()
                    timestampColumnName()
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
                    (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                        (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                        (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                        (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                        (if (timestampColumnName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config &&
                        groundTruthColumnName == other.groundTruthColumnName &&
                        humanFeedbackColumnName == other.humanFeedbackColumnName &&
                        inferenceIdColumnName == other.inferenceIdColumnName &&
                        latencyColumnName == other.latencyColumnName &&
                        timestampColumnName == other.timestampColumnName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groundTruthColumnName,
                        humanFeedbackColumnName,
                        inferenceIdColumnName,
                        latencyColumnName,
                        timestampColumnName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
            }

            class PartitionType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DAY = of("DAY")

                    @JvmField val MONTH = of("MONTH")

                    @JvmField val YEAR = of("YEAR")

                    @JvmStatic fun of(value: String) = PartitionType(JsonField.of(value))
                }

                /** An enum containing [PartitionType]'s known values. */
                enum class Known {
                    DAY,
                    MONTH,
                    YEAR,
                }

                /**
                 * An enum containing [PartitionType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PartitionType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DAY,
                    MONTH,
                    YEAR,
                    /**
                     * An enum member indicating that [PartitionType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        YEAR -> Value.YEAR
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        YEAR -> Known.YEAR
                        else -> throw OpenlayerInvalidDataException("Unknown PartitionType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): PartitionType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PartitionType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BigQueryDataBackend &&
                    backendType == other.backendType &&
                    bigqueryConnectionId == other.bigqueryConnectionId &&
                    config == other.config &&
                    datasetId == other.datasetId &&
                    bodyProjectId == other.bodyProjectId &&
                    tableId == other.tableId &&
                    partitionType == other.partitionType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    backendType,
                    bigqueryConnectionId,
                    config,
                    datasetId,
                    bodyProjectId,
                    tableId,
                    partitionType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BigQueryDataBackend{backendType=$backendType, bigqueryConnectionId=$bigqueryConnectionId, config=$config, datasetId=$datasetId, bodyProjectId=$bodyProjectId, tableId=$tableId, partitionType=$partitionType, additionalProperties=$additionalProperties}"
        }

        class DefaultDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of()
            ) : this(backendType, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

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

                /**
                 * Returns a mutable builder for constructing an instance of [DefaultDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DefaultDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(defaultDataBackend: DefaultDataBackend) = apply {
                    backendType = defaultDataBackend.backendType
                    additionalProperties = defaultDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DefaultDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DefaultDataBackend =
                    DefaultDataBackend(
                        checkRequired("backendType", backendType),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DefaultDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
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
            internal fun validity(): Int = (backendType.asKnown().getOrNull()?.validity() ?: 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DEFAULT = of("default")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    DEFAULT
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEFAULT,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DEFAULT -> Value.DEFAULT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DEFAULT -> Known.DEFAULT
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DefaultDataBackend &&
                    backendType == other.backendType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(backendType, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DefaultDataBackend{backendType=$backendType, additionalProperties=$additionalProperties}"
        }

        class SnowflakeDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val config: JsonField<Config>,
            private val database: JsonField<String>,
            private val schema: JsonField<String>,
            private val snowflakeConnectionId: JsonField<String>,
            private val table: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("database")
                @ExcludeMissing
                database: JsonField<String> = JsonMissing.of(),
                @JsonProperty("schema")
                @ExcludeMissing
                schema: JsonField<String> = JsonMissing.of(),
                @JsonProperty("snowflakeConnectionId")
                @ExcludeMissing
                snowflakeConnectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("table") @ExcludeMissing table: JsonField<String> = JsonMissing.of(),
            ) : this(
                backendType,
                config,
                database,
                schema,
                snowflakeConnectionId,
                table,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun config(): Config = config.getRequired("config")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun database(): String = database.getRequired("database")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun schema(): String = schema.getRequired("schema")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun snowflakeConnectionId(): Optional<String> =
                snowflakeConnectionId.getOptional("snowflakeConnectionId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun table(): Optional<String> = table.getOptional("table")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [database].
             *
             * Unlike [database], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("database") @ExcludeMissing fun _database(): JsonField<String> = database

            /**
             * Returns the raw JSON value of [schema].
             *
             * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<String> = schema

            /**
             * Returns the raw JSON value of [snowflakeConnectionId].
             *
             * Unlike [snowflakeConnectionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("snowflakeConnectionId")
            @ExcludeMissing
            fun _snowflakeConnectionId(): JsonField<String> = snowflakeConnectionId

            /**
             * Returns the raw JSON value of [table].
             *
             * Unlike [table], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("table") @ExcludeMissing fun _table(): JsonField<String> = table

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

                /**
                 * Returns a mutable builder for constructing an instance of [SnowflakeDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .database()
                 * .schema()
                 * .snowflakeConnectionId()
                 * .table()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SnowflakeDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var config: JsonField<Config>? = null
                private var database: JsonField<String>? = null
                private var schema: JsonField<String>? = null
                private var snowflakeConnectionId: JsonField<String>? = null
                private var table: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(snowflakeDataBackend: SnowflakeDataBackend) = apply {
                    backendType = snowflakeDataBackend.backendType
                    config = snowflakeDataBackend.config
                    database = snowflakeDataBackend.database
                    schema = snowflakeDataBackend.schema
                    snowflakeConnectionId = snowflakeDataBackend.snowflakeConnectionId
                    table = snowflakeDataBackend.table
                    additionalProperties = snowflakeDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun database(database: String) = database(JsonField.of(database))

                /**
                 * Sets [Builder.database] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.database] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun database(database: JsonField<String>) = apply { this.database = database }

                fun schema(schema: String) = schema(JsonField.of(schema))

                /**
                 * Sets [Builder.schema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schema] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schema(schema: JsonField<String>) = apply { this.schema = schema }

                fun snowflakeConnectionId(snowflakeConnectionId: String?) =
                    snowflakeConnectionId(JsonField.ofNullable(snowflakeConnectionId))

                /**
                 * Alias for calling [Builder.snowflakeConnectionId] with
                 * `snowflakeConnectionId.orElse(null)`.
                 */
                fun snowflakeConnectionId(snowflakeConnectionId: Optional<String>) =
                    snowflakeConnectionId(snowflakeConnectionId.getOrNull())

                /**
                 * Sets [Builder.snowflakeConnectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.snowflakeConnectionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun snowflakeConnectionId(snowflakeConnectionId: JsonField<String>) = apply {
                    this.snowflakeConnectionId = snowflakeConnectionId
                }

                fun table(table: String?) = table(JsonField.ofNullable(table))

                /** Alias for calling [Builder.table] with `table.orElse(null)`. */
                fun table(table: Optional<String>) = table(table.getOrNull())

                /**
                 * Sets [Builder.table] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.table] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun table(table: JsonField<String>) = apply { this.table = table }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SnowflakeDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .database()
                 * .schema()
                 * .snowflakeConnectionId()
                 * .table()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SnowflakeDataBackend =
                    SnowflakeDataBackend(
                        checkRequired("backendType", backendType),
                        checkRequired("config", config),
                        checkRequired("database", database),
                        checkRequired("schema", schema),
                        checkRequired("snowflakeConnectionId", snowflakeConnectionId),
                        checkRequired("table", table),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SnowflakeDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
                config().validate()
                database()
                schema()
                snowflakeConnectionId()
                table()
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
                (backendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (database.asKnown().isPresent) 1 else 0) +
                    (if (schema.asKnown().isPresent) 1 else 0) +
                    (if (snowflakeConnectionId.asKnown().isPresent) 1 else 0) +
                    (if (table.asKnown().isPresent) 1 else 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SNOWFLAKE = of("snowflake")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    SNOWFLAKE
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SNOWFLAKE,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SNOWFLAKE -> Value.SNOWFLAKE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SNOWFLAKE -> Known.SNOWFLAKE
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groundTruthColumnName: JsonField<String>,
                private val humanFeedbackColumnName: JsonField<String>,
                private val inferenceIdColumnName: JsonField<String>,
                private val latencyColumnName: JsonField<String>,
                private val timestampColumnName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("groundTruthColumnName")
                    @ExcludeMissing
                    groundTruthColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("humanFeedbackColumnName")
                    @ExcludeMissing
                    humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inferenceIdColumnName")
                    @ExcludeMissing
                    inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("latencyColumnName")
                    @ExcludeMissing
                    latencyColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestampColumnName")
                    @ExcludeMissing
                    timestampColumnName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    mutableMapOf(),
                )

                /**
                 * Name of the column with the ground truths.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groundTruthColumnName(): Optional<String> =
                    groundTruthColumnName.getOptional("groundTruthColumnName")

                /**
                 * Name of the column with human feedback.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun humanFeedbackColumnName(): Optional<String> =
                    humanFeedbackColumnName.getOptional("humanFeedbackColumnName")

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inferenceIdColumnName(): Optional<String> =
                    inferenceIdColumnName.getOptional("inferenceIdColumnName")

                /**
                 * Name of the column with the latencies.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun latencyColumnName(): Optional<String> =
                    latencyColumnName.getOptional("latencyColumnName")

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestampColumnName(): Optional<String> =
                    timestampColumnName.getOptional("timestampColumnName")

                /**
                 * Returns the raw JSON value of [groundTruthColumnName].
                 *
                 * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
                fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

                /**
                 * Returns the raw JSON value of [humanFeedbackColumnName].
                 *
                 * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("humanFeedbackColumnName")
                @ExcludeMissing
                fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

                /**
                 * Returns the raw JSON value of [inferenceIdColumnName].
                 *
                 * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

                /**
                 * Returns the raw JSON value of [latencyColumnName].
                 *
                 * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun _latencyColumnName(): JsonField<String> = latencyColumnName

                /**
                 * Returns the raw JSON value of [timestampColumnName].
                 *
                 * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                    private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
                    private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                    private var latencyColumnName: JsonField<String> = JsonMissing.of()
                    private var timestampColumnName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(config: Config) = apply {
                        groundTruthColumnName = config.groundTruthColumnName
                        humanFeedbackColumnName = config.humanFeedbackColumnName
                        inferenceIdColumnName = config.inferenceIdColumnName
                        latencyColumnName = config.latencyColumnName
                        timestampColumnName = config.timestampColumnName
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

                    /** Name of the column with the ground truths. */
                    fun groundTruthColumnName(groundTruthColumnName: String?) =
                        groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

                    /**
                     * Alias for calling [Builder.groundTruthColumnName] with
                     * `groundTruthColumnName.orElse(null)`.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                        groundTruthColumnName(groundTruthColumnName.getOrNull())

                    /**
                     * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groundTruthColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                        this.groundTruthColumnName = groundTruthColumnName
                    }

                    /** Name of the column with human feedback. */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                        humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

                    /**
                     * Alias for calling [Builder.humanFeedbackColumnName] with
                     * `humanFeedbackColumnName.orElse(null)`.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                        humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

                    /**
                     * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.humanFeedbackColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) =
                        apply {
                            this.humanFeedbackColumnName = humanFeedbackColumnName
                        }

                    /**
                     * Name of the column with the inference ids. This is useful if you want to
                     * update rows at a later point in time. If not provided, a unique id is
                     * generated by Openlayer.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                        inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

                    /**
                     * Alias for calling [Builder.inferenceIdColumnName] with
                     * `inferenceIdColumnName.orElse(null)`.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                        inferenceIdColumnName(inferenceIdColumnName.getOrNull())

                    /**
                     * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                        this.inferenceIdColumnName = inferenceIdColumnName
                    }

                    /** Name of the column with the latencies. */
                    fun latencyColumnName(latencyColumnName: String?) =
                        latencyColumnName(JsonField.ofNullable(latencyColumnName))

                    /**
                     * Alias for calling [Builder.latencyColumnName] with
                     * `latencyColumnName.orElse(null)`.
                     */
                    fun latencyColumnName(latencyColumnName: Optional<String>) =
                        latencyColumnName(latencyColumnName.getOrNull())

                    /**
                     * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latencyColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                        this.latencyColumnName = latencyColumnName
                    }

                    /**
                     * Name of the column with the timestamps. Timestamps must be in UNIX sec
                     * format. If not provided, the upload timestamp is used.
                     */
                    fun timestampColumnName(timestampColumnName: String?) =
                        timestampColumnName(JsonField.ofNullable(timestampColumnName))

                    /**
                     * Alias for calling [Builder.timestampColumnName] with
                     * `timestampColumnName.orElse(null)`.
                     */
                    fun timestampColumnName(timestampColumnName: Optional<String>) =
                        timestampColumnName(timestampColumnName.getOrNull())

                    /**
                     * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestampColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                        this.timestampColumnName = timestampColumnName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config =
                        Config(
                            groundTruthColumnName,
                            humanFeedbackColumnName,
                            inferenceIdColumnName,
                            latencyColumnName,
                            timestampColumnName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
                    if (validated) {
                        return@apply
                    }

                    groundTruthColumnName()
                    humanFeedbackColumnName()
                    inferenceIdColumnName()
                    latencyColumnName()
                    timestampColumnName()
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
                    (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                        (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                        (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                        (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                        (if (timestampColumnName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config &&
                        groundTruthColumnName == other.groundTruthColumnName &&
                        humanFeedbackColumnName == other.humanFeedbackColumnName &&
                        inferenceIdColumnName == other.inferenceIdColumnName &&
                        latencyColumnName == other.latencyColumnName &&
                        timestampColumnName == other.timestampColumnName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groundTruthColumnName,
                        humanFeedbackColumnName,
                        inferenceIdColumnName,
                        latencyColumnName,
                        timestampColumnName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SnowflakeDataBackend &&
                    backendType == other.backendType &&
                    config == other.config &&
                    database == other.database &&
                    schema == other.schema &&
                    snowflakeConnectionId == other.snowflakeConnectionId &&
                    table == other.table &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    backendType,
                    config,
                    database,
                    schema,
                    snowflakeConnectionId,
                    table,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SnowflakeDataBackend{backendType=$backendType, config=$config, database=$database, schema=$schema, snowflakeConnectionId=$snowflakeConnectionId, table=$table, additionalProperties=$additionalProperties}"
        }

        class DatabricksDtlDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val config: JsonField<Config>,
            private val databricksDtlConnectionId: JsonField<String>,
            private val tableId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("databricksDtlConnectionId")
                @ExcludeMissing
                databricksDtlConnectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tableId")
                @ExcludeMissing
                tableId: JsonField<String> = JsonMissing.of(),
            ) : this(backendType, config, databricksDtlConnectionId, tableId, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun config(): Config = config.getRequired("config")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun databricksDtlConnectionId(): Optional<String> =
                databricksDtlConnectionId.getOptional("databricksDtlConnectionId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tableId(): Optional<String> = tableId.getOptional("tableId")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [databricksDtlConnectionId].
             *
             * Unlike [databricksDtlConnectionId], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("databricksDtlConnectionId")
            @ExcludeMissing
            fun _databricksDtlConnectionId(): JsonField<String> = databricksDtlConnectionId

            /**
             * Returns the raw JSON value of [tableId].
             *
             * Unlike [tableId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tableId") @ExcludeMissing fun _tableId(): JsonField<String> = tableId

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [DatabricksDtlDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .databricksDtlConnectionId()
                 * .tableId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DatabricksDtlDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var config: JsonField<Config>? = null
                private var databricksDtlConnectionId: JsonField<String>? = null
                private var tableId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(databricksDtlDataBackend: DatabricksDtlDataBackend) = apply {
                    backendType = databricksDtlDataBackend.backendType
                    config = databricksDtlDataBackend.config
                    databricksDtlConnectionId = databricksDtlDataBackend.databricksDtlConnectionId
                    tableId = databricksDtlDataBackend.tableId
                    additionalProperties =
                        databricksDtlDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun databricksDtlConnectionId(databricksDtlConnectionId: String?) =
                    databricksDtlConnectionId(JsonField.ofNullable(databricksDtlConnectionId))

                /**
                 * Alias for calling [Builder.databricksDtlConnectionId] with
                 * `databricksDtlConnectionId.orElse(null)`.
                 */
                fun databricksDtlConnectionId(databricksDtlConnectionId: Optional<String>) =
                    databricksDtlConnectionId(databricksDtlConnectionId.getOrNull())

                /**
                 * Sets [Builder.databricksDtlConnectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.databricksDtlConnectionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun databricksDtlConnectionId(databricksDtlConnectionId: JsonField<String>) =
                    apply {
                        this.databricksDtlConnectionId = databricksDtlConnectionId
                    }

                fun tableId(tableId: String?) = tableId(JsonField.ofNullable(tableId))

                /** Alias for calling [Builder.tableId] with `tableId.orElse(null)`. */
                fun tableId(tableId: Optional<String>) = tableId(tableId.getOrNull())

                /**
                 * Sets [Builder.tableId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tableId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tableId(tableId: JsonField<String>) = apply { this.tableId = tableId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DatabricksDtlDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .databricksDtlConnectionId()
                 * .tableId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DatabricksDtlDataBackend =
                    DatabricksDtlDataBackend(
                        checkRequired("backendType", backendType),
                        checkRequired("config", config),
                        checkRequired("databricksDtlConnectionId", databricksDtlConnectionId),
                        checkRequired("tableId", tableId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DatabricksDtlDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
                config().validate()
                databricksDtlConnectionId()
                tableId()
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
                (backendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (databricksDtlConnectionId.asKnown().isPresent) 1 else 0) +
                    (if (tableId.asKnown().isPresent) 1 else 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DATABRICKS_DTL = of("databricks_dtl")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    DATABRICKS_DTL
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DATABRICKS_DTL,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DATABRICKS_DTL -> Value.DATABRICKS_DTL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DATABRICKS_DTL -> Known.DATABRICKS_DTL
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groundTruthColumnName: JsonField<String>,
                private val humanFeedbackColumnName: JsonField<String>,
                private val inferenceIdColumnName: JsonField<String>,
                private val latencyColumnName: JsonField<String>,
                private val timestampColumnName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("groundTruthColumnName")
                    @ExcludeMissing
                    groundTruthColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("humanFeedbackColumnName")
                    @ExcludeMissing
                    humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inferenceIdColumnName")
                    @ExcludeMissing
                    inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("latencyColumnName")
                    @ExcludeMissing
                    latencyColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestampColumnName")
                    @ExcludeMissing
                    timestampColumnName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    mutableMapOf(),
                )

                /**
                 * Name of the column with the ground truths.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groundTruthColumnName(): Optional<String> =
                    groundTruthColumnName.getOptional("groundTruthColumnName")

                /**
                 * Name of the column with human feedback.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun humanFeedbackColumnName(): Optional<String> =
                    humanFeedbackColumnName.getOptional("humanFeedbackColumnName")

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inferenceIdColumnName(): Optional<String> =
                    inferenceIdColumnName.getOptional("inferenceIdColumnName")

                /**
                 * Name of the column with the latencies.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun latencyColumnName(): Optional<String> =
                    latencyColumnName.getOptional("latencyColumnName")

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestampColumnName(): Optional<String> =
                    timestampColumnName.getOptional("timestampColumnName")

                /**
                 * Returns the raw JSON value of [groundTruthColumnName].
                 *
                 * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
                fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

                /**
                 * Returns the raw JSON value of [humanFeedbackColumnName].
                 *
                 * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("humanFeedbackColumnName")
                @ExcludeMissing
                fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

                /**
                 * Returns the raw JSON value of [inferenceIdColumnName].
                 *
                 * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

                /**
                 * Returns the raw JSON value of [latencyColumnName].
                 *
                 * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun _latencyColumnName(): JsonField<String> = latencyColumnName

                /**
                 * Returns the raw JSON value of [timestampColumnName].
                 *
                 * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                    private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
                    private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                    private var latencyColumnName: JsonField<String> = JsonMissing.of()
                    private var timestampColumnName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(config: Config) = apply {
                        groundTruthColumnName = config.groundTruthColumnName
                        humanFeedbackColumnName = config.humanFeedbackColumnName
                        inferenceIdColumnName = config.inferenceIdColumnName
                        latencyColumnName = config.latencyColumnName
                        timestampColumnName = config.timestampColumnName
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

                    /** Name of the column with the ground truths. */
                    fun groundTruthColumnName(groundTruthColumnName: String?) =
                        groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

                    /**
                     * Alias for calling [Builder.groundTruthColumnName] with
                     * `groundTruthColumnName.orElse(null)`.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                        groundTruthColumnName(groundTruthColumnName.getOrNull())

                    /**
                     * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groundTruthColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                        this.groundTruthColumnName = groundTruthColumnName
                    }

                    /** Name of the column with human feedback. */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                        humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

                    /**
                     * Alias for calling [Builder.humanFeedbackColumnName] with
                     * `humanFeedbackColumnName.orElse(null)`.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                        humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

                    /**
                     * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.humanFeedbackColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) =
                        apply {
                            this.humanFeedbackColumnName = humanFeedbackColumnName
                        }

                    /**
                     * Name of the column with the inference ids. This is useful if you want to
                     * update rows at a later point in time. If not provided, a unique id is
                     * generated by Openlayer.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                        inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

                    /**
                     * Alias for calling [Builder.inferenceIdColumnName] with
                     * `inferenceIdColumnName.orElse(null)`.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                        inferenceIdColumnName(inferenceIdColumnName.getOrNull())

                    /**
                     * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                        this.inferenceIdColumnName = inferenceIdColumnName
                    }

                    /** Name of the column with the latencies. */
                    fun latencyColumnName(latencyColumnName: String?) =
                        latencyColumnName(JsonField.ofNullable(latencyColumnName))

                    /**
                     * Alias for calling [Builder.latencyColumnName] with
                     * `latencyColumnName.orElse(null)`.
                     */
                    fun latencyColumnName(latencyColumnName: Optional<String>) =
                        latencyColumnName(latencyColumnName.getOrNull())

                    /**
                     * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latencyColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                        this.latencyColumnName = latencyColumnName
                    }

                    /**
                     * Name of the column with the timestamps. Timestamps must be in UNIX sec
                     * format. If not provided, the upload timestamp is used.
                     */
                    fun timestampColumnName(timestampColumnName: String?) =
                        timestampColumnName(JsonField.ofNullable(timestampColumnName))

                    /**
                     * Alias for calling [Builder.timestampColumnName] with
                     * `timestampColumnName.orElse(null)`.
                     */
                    fun timestampColumnName(timestampColumnName: Optional<String>) =
                        timestampColumnName(timestampColumnName.getOrNull())

                    /**
                     * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestampColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                        this.timestampColumnName = timestampColumnName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config =
                        Config(
                            groundTruthColumnName,
                            humanFeedbackColumnName,
                            inferenceIdColumnName,
                            latencyColumnName,
                            timestampColumnName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
                    if (validated) {
                        return@apply
                    }

                    groundTruthColumnName()
                    humanFeedbackColumnName()
                    inferenceIdColumnName()
                    latencyColumnName()
                    timestampColumnName()
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
                    (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                        (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                        (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                        (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                        (if (timestampColumnName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config &&
                        groundTruthColumnName == other.groundTruthColumnName &&
                        humanFeedbackColumnName == other.humanFeedbackColumnName &&
                        inferenceIdColumnName == other.inferenceIdColumnName &&
                        latencyColumnName == other.latencyColumnName &&
                        timestampColumnName == other.timestampColumnName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groundTruthColumnName,
                        humanFeedbackColumnName,
                        inferenceIdColumnName,
                        latencyColumnName,
                        timestampColumnName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DatabricksDtlDataBackend &&
                    backendType == other.backendType &&
                    config == other.config &&
                    databricksDtlConnectionId == other.databricksDtlConnectionId &&
                    tableId == other.tableId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    backendType,
                    config,
                    databricksDtlConnectionId,
                    tableId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DatabricksDtlDataBackend{backendType=$backendType, config=$config, databricksDtlConnectionId=$databricksDtlConnectionId, tableId=$tableId, additionalProperties=$additionalProperties}"
        }

        class RedshiftDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val config: JsonField<Config>,
            private val redshiftConnectionId: JsonField<String>,
            private val schemaName: JsonField<String>,
            private val tableName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("redshiftConnectionId")
                @ExcludeMissing
                redshiftConnectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("schemaName")
                @ExcludeMissing
                schemaName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tableName")
                @ExcludeMissing
                tableName: JsonField<String> = JsonMissing.of(),
            ) : this(
                backendType,
                config,
                redshiftConnectionId,
                schemaName,
                tableName,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun config(): Config = config.getRequired("config")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun redshiftConnectionId(): Optional<String> =
                redshiftConnectionId.getOptional("redshiftConnectionId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun schemaName(): String = schemaName.getRequired("schemaName")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tableName(): String = tableName.getRequired("tableName")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [redshiftConnectionId].
             *
             * Unlike [redshiftConnectionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("redshiftConnectionId")
            @ExcludeMissing
            fun _redshiftConnectionId(): JsonField<String> = redshiftConnectionId

            /**
             * Returns the raw JSON value of [schemaName].
             *
             * Unlike [schemaName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schemaName")
            @ExcludeMissing
            fun _schemaName(): JsonField<String> = schemaName

            /**
             * Returns the raw JSON value of [tableName].
             *
             * Unlike [tableName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tableName")
            @ExcludeMissing
            fun _tableName(): JsonField<String> = tableName

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

                /**
                 * Returns a mutable builder for constructing an instance of [RedshiftDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .redshiftConnectionId()
                 * .schemaName()
                 * .tableName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RedshiftDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var config: JsonField<Config>? = null
                private var redshiftConnectionId: JsonField<String>? = null
                private var schemaName: JsonField<String>? = null
                private var tableName: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(redshiftDataBackend: RedshiftDataBackend) = apply {
                    backendType = redshiftDataBackend.backendType
                    config = redshiftDataBackend.config
                    redshiftConnectionId = redshiftDataBackend.redshiftConnectionId
                    schemaName = redshiftDataBackend.schemaName
                    tableName = redshiftDataBackend.tableName
                    additionalProperties = redshiftDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun redshiftConnectionId(redshiftConnectionId: String?) =
                    redshiftConnectionId(JsonField.ofNullable(redshiftConnectionId))

                /**
                 * Alias for calling [Builder.redshiftConnectionId] with
                 * `redshiftConnectionId.orElse(null)`.
                 */
                fun redshiftConnectionId(redshiftConnectionId: Optional<String>) =
                    redshiftConnectionId(redshiftConnectionId.getOrNull())

                /**
                 * Sets [Builder.redshiftConnectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.redshiftConnectionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun redshiftConnectionId(redshiftConnectionId: JsonField<String>) = apply {
                    this.redshiftConnectionId = redshiftConnectionId
                }

                fun schemaName(schemaName: String) = schemaName(JsonField.of(schemaName))

                /**
                 * Sets [Builder.schemaName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schemaName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schemaName(schemaName: JsonField<String>) = apply {
                    this.schemaName = schemaName
                }

                fun tableName(tableName: String) = tableName(JsonField.of(tableName))

                /**
                 * Sets [Builder.tableName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tableName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tableName(tableName: JsonField<String>) = apply { this.tableName = tableName }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RedshiftDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .redshiftConnectionId()
                 * .schemaName()
                 * .tableName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RedshiftDataBackend =
                    RedshiftDataBackend(
                        checkRequired("backendType", backendType),
                        checkRequired("config", config),
                        checkRequired("redshiftConnectionId", redshiftConnectionId),
                        checkRequired("schemaName", schemaName),
                        checkRequired("tableName", tableName),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RedshiftDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
                config().validate()
                redshiftConnectionId()
                schemaName()
                tableName()
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
                (backendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (redshiftConnectionId.asKnown().isPresent) 1 else 0) +
                    (if (schemaName.asKnown().isPresent) 1 else 0) +
                    (if (tableName.asKnown().isPresent) 1 else 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val REDSHIFT = of("redshift")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    REDSHIFT
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REDSHIFT,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        REDSHIFT -> Value.REDSHIFT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        REDSHIFT -> Known.REDSHIFT
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groundTruthColumnName: JsonField<String>,
                private val humanFeedbackColumnName: JsonField<String>,
                private val inferenceIdColumnName: JsonField<String>,
                private val latencyColumnName: JsonField<String>,
                private val timestampColumnName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("groundTruthColumnName")
                    @ExcludeMissing
                    groundTruthColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("humanFeedbackColumnName")
                    @ExcludeMissing
                    humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inferenceIdColumnName")
                    @ExcludeMissing
                    inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("latencyColumnName")
                    @ExcludeMissing
                    latencyColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestampColumnName")
                    @ExcludeMissing
                    timestampColumnName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    mutableMapOf(),
                )

                /**
                 * Name of the column with the ground truths.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groundTruthColumnName(): Optional<String> =
                    groundTruthColumnName.getOptional("groundTruthColumnName")

                /**
                 * Name of the column with human feedback.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun humanFeedbackColumnName(): Optional<String> =
                    humanFeedbackColumnName.getOptional("humanFeedbackColumnName")

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inferenceIdColumnName(): Optional<String> =
                    inferenceIdColumnName.getOptional("inferenceIdColumnName")

                /**
                 * Name of the column with the latencies.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun latencyColumnName(): Optional<String> =
                    latencyColumnName.getOptional("latencyColumnName")

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestampColumnName(): Optional<String> =
                    timestampColumnName.getOptional("timestampColumnName")

                /**
                 * Returns the raw JSON value of [groundTruthColumnName].
                 *
                 * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
                fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

                /**
                 * Returns the raw JSON value of [humanFeedbackColumnName].
                 *
                 * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("humanFeedbackColumnName")
                @ExcludeMissing
                fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

                /**
                 * Returns the raw JSON value of [inferenceIdColumnName].
                 *
                 * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

                /**
                 * Returns the raw JSON value of [latencyColumnName].
                 *
                 * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun _latencyColumnName(): JsonField<String> = latencyColumnName

                /**
                 * Returns the raw JSON value of [timestampColumnName].
                 *
                 * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                    private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
                    private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                    private var latencyColumnName: JsonField<String> = JsonMissing.of()
                    private var timestampColumnName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(config: Config) = apply {
                        groundTruthColumnName = config.groundTruthColumnName
                        humanFeedbackColumnName = config.humanFeedbackColumnName
                        inferenceIdColumnName = config.inferenceIdColumnName
                        latencyColumnName = config.latencyColumnName
                        timestampColumnName = config.timestampColumnName
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

                    /** Name of the column with the ground truths. */
                    fun groundTruthColumnName(groundTruthColumnName: String?) =
                        groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

                    /**
                     * Alias for calling [Builder.groundTruthColumnName] with
                     * `groundTruthColumnName.orElse(null)`.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                        groundTruthColumnName(groundTruthColumnName.getOrNull())

                    /**
                     * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groundTruthColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                        this.groundTruthColumnName = groundTruthColumnName
                    }

                    /** Name of the column with human feedback. */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                        humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

                    /**
                     * Alias for calling [Builder.humanFeedbackColumnName] with
                     * `humanFeedbackColumnName.orElse(null)`.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                        humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

                    /**
                     * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.humanFeedbackColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) =
                        apply {
                            this.humanFeedbackColumnName = humanFeedbackColumnName
                        }

                    /**
                     * Name of the column with the inference ids. This is useful if you want to
                     * update rows at a later point in time. If not provided, a unique id is
                     * generated by Openlayer.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                        inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

                    /**
                     * Alias for calling [Builder.inferenceIdColumnName] with
                     * `inferenceIdColumnName.orElse(null)`.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                        inferenceIdColumnName(inferenceIdColumnName.getOrNull())

                    /**
                     * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                        this.inferenceIdColumnName = inferenceIdColumnName
                    }

                    /** Name of the column with the latencies. */
                    fun latencyColumnName(latencyColumnName: String?) =
                        latencyColumnName(JsonField.ofNullable(latencyColumnName))

                    /**
                     * Alias for calling [Builder.latencyColumnName] with
                     * `latencyColumnName.orElse(null)`.
                     */
                    fun latencyColumnName(latencyColumnName: Optional<String>) =
                        latencyColumnName(latencyColumnName.getOrNull())

                    /**
                     * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latencyColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                        this.latencyColumnName = latencyColumnName
                    }

                    /**
                     * Name of the column with the timestamps. Timestamps must be in UNIX sec
                     * format. If not provided, the upload timestamp is used.
                     */
                    fun timestampColumnName(timestampColumnName: String?) =
                        timestampColumnName(JsonField.ofNullable(timestampColumnName))

                    /**
                     * Alias for calling [Builder.timestampColumnName] with
                     * `timestampColumnName.orElse(null)`.
                     */
                    fun timestampColumnName(timestampColumnName: Optional<String>) =
                        timestampColumnName(timestampColumnName.getOrNull())

                    /**
                     * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestampColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                        this.timestampColumnName = timestampColumnName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config =
                        Config(
                            groundTruthColumnName,
                            humanFeedbackColumnName,
                            inferenceIdColumnName,
                            latencyColumnName,
                            timestampColumnName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
                    if (validated) {
                        return@apply
                    }

                    groundTruthColumnName()
                    humanFeedbackColumnName()
                    inferenceIdColumnName()
                    latencyColumnName()
                    timestampColumnName()
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
                    (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                        (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                        (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                        (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                        (if (timestampColumnName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config &&
                        groundTruthColumnName == other.groundTruthColumnName &&
                        humanFeedbackColumnName == other.humanFeedbackColumnName &&
                        inferenceIdColumnName == other.inferenceIdColumnName &&
                        latencyColumnName == other.latencyColumnName &&
                        timestampColumnName == other.timestampColumnName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groundTruthColumnName,
                        humanFeedbackColumnName,
                        inferenceIdColumnName,
                        latencyColumnName,
                        timestampColumnName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RedshiftDataBackend &&
                    backendType == other.backendType &&
                    config == other.config &&
                    redshiftConnectionId == other.redshiftConnectionId &&
                    schemaName == other.schemaName &&
                    tableName == other.tableName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    backendType,
                    config,
                    redshiftConnectionId,
                    schemaName,
                    tableName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RedshiftDataBackend{backendType=$backendType, config=$config, redshiftConnectionId=$redshiftConnectionId, schemaName=$schemaName, tableName=$tableName, additionalProperties=$additionalProperties}"
        }

        class PostgresDataBackend
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val backendType: JsonField<BackendType>,
            private val config: JsonField<Config>,
            private val database: JsonField<String>,
            private val postgresConnectionId: JsonField<String>,
            private val schema: JsonField<String>,
            private val table: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("backendType")
                @ExcludeMissing
                backendType: JsonField<BackendType> = JsonMissing.of(),
                @JsonProperty("config")
                @ExcludeMissing
                config: JsonField<Config> = JsonMissing.of(),
                @JsonProperty("database")
                @ExcludeMissing
                database: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postgresConnectionId")
                @ExcludeMissing
                postgresConnectionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("schema")
                @ExcludeMissing
                schema: JsonField<String> = JsonMissing.of(),
                @JsonProperty("table") @ExcludeMissing table: JsonField<String> = JsonMissing.of(),
            ) : this(
                backendType,
                config,
                database,
                postgresConnectionId,
                schema,
                table,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun backendType(): BackendType = backendType.getRequired("backendType")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun config(): Config = config.getRequired("config")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun database(): String = database.getRequired("database")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun postgresConnectionId(): Optional<String> =
                postgresConnectionId.getOptional("postgresConnectionId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun schema(): String = schema.getRequired("schema")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun table(): Optional<String> = table.getOptional("table")

            /**
             * Returns the raw JSON value of [backendType].
             *
             * Unlike [backendType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendType")
            @ExcludeMissing
            fun _backendType(): JsonField<BackendType> = backendType

            /**
             * Returns the raw JSON value of [config].
             *
             * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

            /**
             * Returns the raw JSON value of [database].
             *
             * Unlike [database], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("database") @ExcludeMissing fun _database(): JsonField<String> = database

            /**
             * Returns the raw JSON value of [postgresConnectionId].
             *
             * Unlike [postgresConnectionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("postgresConnectionId")
            @ExcludeMissing
            fun _postgresConnectionId(): JsonField<String> = postgresConnectionId

            /**
             * Returns the raw JSON value of [schema].
             *
             * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<String> = schema

            /**
             * Returns the raw JSON value of [table].
             *
             * Unlike [table], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("table") @ExcludeMissing fun _table(): JsonField<String> = table

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

                /**
                 * Returns a mutable builder for constructing an instance of [PostgresDataBackend].
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .database()
                 * .postgresConnectionId()
                 * .schema()
                 * .table()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostgresDataBackend]. */
            class Builder internal constructor() {

                private var backendType: JsonField<BackendType>? = null
                private var config: JsonField<Config>? = null
                private var database: JsonField<String>? = null
                private var postgresConnectionId: JsonField<String>? = null
                private var schema: JsonField<String>? = null
                private var table: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(postgresDataBackend: PostgresDataBackend) = apply {
                    backendType = postgresDataBackend.backendType
                    config = postgresDataBackend.config
                    database = postgresDataBackend.database
                    postgresConnectionId = postgresDataBackend.postgresConnectionId
                    schema = postgresDataBackend.schema
                    table = postgresDataBackend.table
                    additionalProperties = postgresDataBackend.additionalProperties.toMutableMap()
                }

                fun backendType(backendType: BackendType) = backendType(JsonField.of(backendType))

                /**
                 * Sets [Builder.backendType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backendType] with a well-typed [BackendType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backendType(backendType: JsonField<BackendType>) = apply {
                    this.backendType = backendType
                }

                fun config(config: Config) = config(JsonField.of(config))

                /**
                 * Sets [Builder.config] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.config] with a well-typed [Config] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun config(config: JsonField<Config>) = apply { this.config = config }

                fun database(database: String) = database(JsonField.of(database))

                /**
                 * Sets [Builder.database] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.database] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun database(database: JsonField<String>) = apply { this.database = database }

                fun postgresConnectionId(postgresConnectionId: String?) =
                    postgresConnectionId(JsonField.ofNullable(postgresConnectionId))

                /**
                 * Alias for calling [Builder.postgresConnectionId] with
                 * `postgresConnectionId.orElse(null)`.
                 */
                fun postgresConnectionId(postgresConnectionId: Optional<String>) =
                    postgresConnectionId(postgresConnectionId.getOrNull())

                /**
                 * Sets [Builder.postgresConnectionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postgresConnectionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun postgresConnectionId(postgresConnectionId: JsonField<String>) = apply {
                    this.postgresConnectionId = postgresConnectionId
                }

                fun schema(schema: String) = schema(JsonField.of(schema))

                /**
                 * Sets [Builder.schema] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schema] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun schema(schema: JsonField<String>) = apply { this.schema = schema }

                fun table(table: String?) = table(JsonField.ofNullable(table))

                /** Alias for calling [Builder.table] with `table.orElse(null)`. */
                fun table(table: Optional<String>) = table(table.getOrNull())

                /**
                 * Sets [Builder.table] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.table] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun table(table: JsonField<String>) = apply { this.table = table }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PostgresDataBackend].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .backendType()
                 * .config()
                 * .database()
                 * .postgresConnectionId()
                 * .schema()
                 * .table()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostgresDataBackend =
                    PostgresDataBackend(
                        checkRequired("backendType", backendType),
                        checkRequired("config", config),
                        checkRequired("database", database),
                        checkRequired("postgresConnectionId", postgresConnectionId),
                        checkRequired("schema", schema),
                        checkRequired("table", table),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PostgresDataBackend = apply {
                if (validated) {
                    return@apply
                }

                backendType().validate()
                config().validate()
                database()
                postgresConnectionId()
                schema()
                table()
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
                (backendType.asKnown().getOrNull()?.validity() ?: 0) +
                    (config.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (database.asKnown().isPresent) 1 else 0) +
                    (if (postgresConnectionId.asKnown().isPresent) 1 else 0) +
                    (if (schema.asKnown().isPresent) 1 else 0) +
                    (if (table.asKnown().isPresent) 1 else 0)

            class BackendType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POSTGRES = of("postgres")

                    @JvmStatic fun of(value: String) = BackendType(JsonField.of(value))
                }

                /** An enum containing [BackendType]'s known values. */
                enum class Known {
                    POSTGRES
                }

                /**
                 * An enum containing [BackendType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [BackendType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POSTGRES,
                    /**
                     * An enum member indicating that [BackendType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        POSTGRES -> Value.POSTGRES
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        POSTGRES -> Known.POSTGRES
                        else -> throw OpenlayerInvalidDataException("Unknown BackendType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OpenlayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        OpenlayerInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): BackendType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
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
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BackendType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Config
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groundTruthColumnName: JsonField<String>,
                private val humanFeedbackColumnName: JsonField<String>,
                private val inferenceIdColumnName: JsonField<String>,
                private val latencyColumnName: JsonField<String>,
                private val timestampColumnName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("groundTruthColumnName")
                    @ExcludeMissing
                    groundTruthColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("humanFeedbackColumnName")
                    @ExcludeMissing
                    humanFeedbackColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("inferenceIdColumnName")
                    @ExcludeMissing
                    inferenceIdColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("latencyColumnName")
                    @ExcludeMissing
                    latencyColumnName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestampColumnName")
                    @ExcludeMissing
                    timestampColumnName: JsonField<String> = JsonMissing.of(),
                ) : this(
                    groundTruthColumnName,
                    humanFeedbackColumnName,
                    inferenceIdColumnName,
                    latencyColumnName,
                    timestampColumnName,
                    mutableMapOf(),
                )

                /**
                 * Name of the column with the ground truths.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun groundTruthColumnName(): Optional<String> =
                    groundTruthColumnName.getOptional("groundTruthColumnName")

                /**
                 * Name of the column with human feedback.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun humanFeedbackColumnName(): Optional<String> =
                    humanFeedbackColumnName.getOptional("humanFeedbackColumnName")

                /**
                 * Name of the column with the inference ids. This is useful if you want to update
                 * rows at a later point in time. If not provided, a unique id is generated by
                 * Openlayer.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun inferenceIdColumnName(): Optional<String> =
                    inferenceIdColumnName.getOptional("inferenceIdColumnName")

                /**
                 * Name of the column with the latencies.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun latencyColumnName(): Optional<String> =
                    latencyColumnName.getOptional("latencyColumnName")

                /**
                 * Name of the column with the timestamps. Timestamps must be in UNIX sec format. If
                 * not provided, the upload timestamp is used.
                 *
                 * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestampColumnName(): Optional<String> =
                    timestampColumnName.getOptional("timestampColumnName")

                /**
                 * Returns the raw JSON value of [groundTruthColumnName].
                 *
                 * Unlike [groundTruthColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("groundTruthColumnName")
                @ExcludeMissing
                fun _groundTruthColumnName(): JsonField<String> = groundTruthColumnName

                /**
                 * Returns the raw JSON value of [humanFeedbackColumnName].
                 *
                 * Unlike [humanFeedbackColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("humanFeedbackColumnName")
                @ExcludeMissing
                fun _humanFeedbackColumnName(): JsonField<String> = humanFeedbackColumnName

                /**
                 * Returns the raw JSON value of [inferenceIdColumnName].
                 *
                 * Unlike [inferenceIdColumnName], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("inferenceIdColumnName")
                @ExcludeMissing
                fun _inferenceIdColumnName(): JsonField<String> = inferenceIdColumnName

                /**
                 * Returns the raw JSON value of [latencyColumnName].
                 *
                 * Unlike [latencyColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latencyColumnName")
                @ExcludeMissing
                fun _latencyColumnName(): JsonField<String> = latencyColumnName

                /**
                 * Returns the raw JSON value of [timestampColumnName].
                 *
                 * Unlike [timestampColumnName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timestampColumnName")
                @ExcludeMissing
                fun _timestampColumnName(): JsonField<String> = timestampColumnName

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

                    /** Returns a mutable builder for constructing an instance of [Config]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Config]. */
                class Builder internal constructor() {

                    private var groundTruthColumnName: JsonField<String> = JsonMissing.of()
                    private var humanFeedbackColumnName: JsonField<String> = JsonMissing.of()
                    private var inferenceIdColumnName: JsonField<String> = JsonMissing.of()
                    private var latencyColumnName: JsonField<String> = JsonMissing.of()
                    private var timestampColumnName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(config: Config) = apply {
                        groundTruthColumnName = config.groundTruthColumnName
                        humanFeedbackColumnName = config.humanFeedbackColumnName
                        inferenceIdColumnName = config.inferenceIdColumnName
                        latencyColumnName = config.latencyColumnName
                        timestampColumnName = config.timestampColumnName
                        additionalProperties = config.additionalProperties.toMutableMap()
                    }

                    /** Name of the column with the ground truths. */
                    fun groundTruthColumnName(groundTruthColumnName: String?) =
                        groundTruthColumnName(JsonField.ofNullable(groundTruthColumnName))

                    /**
                     * Alias for calling [Builder.groundTruthColumnName] with
                     * `groundTruthColumnName.orElse(null)`.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: Optional<String>) =
                        groundTruthColumnName(groundTruthColumnName.getOrNull())

                    /**
                     * Sets [Builder.groundTruthColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groundTruthColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groundTruthColumnName(groundTruthColumnName: JsonField<String>) = apply {
                        this.groundTruthColumnName = groundTruthColumnName
                    }

                    /** Name of the column with human feedback. */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: String?) =
                        humanFeedbackColumnName(JsonField.ofNullable(humanFeedbackColumnName))

                    /**
                     * Alias for calling [Builder.humanFeedbackColumnName] with
                     * `humanFeedbackColumnName.orElse(null)`.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: Optional<String>) =
                        humanFeedbackColumnName(humanFeedbackColumnName.getOrNull())

                    /**
                     * Sets [Builder.humanFeedbackColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.humanFeedbackColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun humanFeedbackColumnName(humanFeedbackColumnName: JsonField<String>) =
                        apply {
                            this.humanFeedbackColumnName = humanFeedbackColumnName
                        }

                    /**
                     * Name of the column with the inference ids. This is useful if you want to
                     * update rows at a later point in time. If not provided, a unique id is
                     * generated by Openlayer.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: String?) =
                        inferenceIdColumnName(JsonField.ofNullable(inferenceIdColumnName))

                    /**
                     * Alias for calling [Builder.inferenceIdColumnName] with
                     * `inferenceIdColumnName.orElse(null)`.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: Optional<String>) =
                        inferenceIdColumnName(inferenceIdColumnName.getOrNull())

                    /**
                     * Sets [Builder.inferenceIdColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceIdColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceIdColumnName(inferenceIdColumnName: JsonField<String>) = apply {
                        this.inferenceIdColumnName = inferenceIdColumnName
                    }

                    /** Name of the column with the latencies. */
                    fun latencyColumnName(latencyColumnName: String?) =
                        latencyColumnName(JsonField.ofNullable(latencyColumnName))

                    /**
                     * Alias for calling [Builder.latencyColumnName] with
                     * `latencyColumnName.orElse(null)`.
                     */
                    fun latencyColumnName(latencyColumnName: Optional<String>) =
                        latencyColumnName(latencyColumnName.getOrNull())

                    /**
                     * Sets [Builder.latencyColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latencyColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun latencyColumnName(latencyColumnName: JsonField<String>) = apply {
                        this.latencyColumnName = latencyColumnName
                    }

                    /**
                     * Name of the column with the timestamps. Timestamps must be in UNIX sec
                     * format. If not provided, the upload timestamp is used.
                     */
                    fun timestampColumnName(timestampColumnName: String?) =
                        timestampColumnName(JsonField.ofNullable(timestampColumnName))

                    /**
                     * Alias for calling [Builder.timestampColumnName] with
                     * `timestampColumnName.orElse(null)`.
                     */
                    fun timestampColumnName(timestampColumnName: Optional<String>) =
                        timestampColumnName(timestampColumnName.getOrNull())

                    /**
                     * Sets [Builder.timestampColumnName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestampColumnName] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestampColumnName(timestampColumnName: JsonField<String>) = apply {
                        this.timestampColumnName = timestampColumnName
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Config].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Config =
                        Config(
                            groundTruthColumnName,
                            humanFeedbackColumnName,
                            inferenceIdColumnName,
                            latencyColumnName,
                            timestampColumnName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Config = apply {
                    if (validated) {
                        return@apply
                    }

                    groundTruthColumnName()
                    humanFeedbackColumnName()
                    inferenceIdColumnName()
                    latencyColumnName()
                    timestampColumnName()
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
                    (if (groundTruthColumnName.asKnown().isPresent) 1 else 0) +
                        (if (humanFeedbackColumnName.asKnown().isPresent) 1 else 0) +
                        (if (inferenceIdColumnName.asKnown().isPresent) 1 else 0) +
                        (if (latencyColumnName.asKnown().isPresent) 1 else 0) +
                        (if (timestampColumnName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Config &&
                        groundTruthColumnName == other.groundTruthColumnName &&
                        humanFeedbackColumnName == other.humanFeedbackColumnName &&
                        inferenceIdColumnName == other.inferenceIdColumnName &&
                        latencyColumnName == other.latencyColumnName &&
                        timestampColumnName == other.timestampColumnName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        groundTruthColumnName,
                        humanFeedbackColumnName,
                        inferenceIdColumnName,
                        latencyColumnName,
                        timestampColumnName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Config{groundTruthColumnName=$groundTruthColumnName, humanFeedbackColumnName=$humanFeedbackColumnName, inferenceIdColumnName=$inferenceIdColumnName, latencyColumnName=$latencyColumnName, timestampColumnName=$timestampColumnName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostgresDataBackend &&
                    backendType == other.backendType &&
                    config == other.config &&
                    database == other.database &&
                    postgresConnectionId == other.postgresConnectionId &&
                    schema == other.schema &&
                    table == other.table &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    backendType,
                    config,
                    database,
                    postgresConnectionId,
                    schema,
                    table,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostgresDataBackend{backendType=$backendType, config=$config, database=$database, postgresConnectionId=$postgresConnectionId, schema=$schema, table=$table, additionalProperties=$additionalProperties}"
        }
    }

    class Project
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val developmentGoalCount: JsonField<Long>,
        private val goalCount: JsonField<Long>,
        private val inferencePipelineCount: JsonField<Long>,
        private val links: JsonField<Links>,
        private val monitoringGoalCount: JsonField<Long>,
        private val name: JsonField<String>,
        private val source: JsonField<Source>,
        private val taskType: JsonField<TaskType>,
        private val versionCount: JsonField<Long>,
        private val workspaceId: JsonField<String>,
        private val description: JsonField<String>,
        private val gitRepo: JsonField<GitRepo>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("developmentGoalCount")
            @ExcludeMissing
            developmentGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("goalCount")
            @ExcludeMissing
            goalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inferencePipelineCount")
            @ExcludeMissing
            inferencePipelineCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
            @JsonProperty("monitoringGoalCount")
            @ExcludeMissing
            monitoringGoalCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("taskType")
            @ExcludeMissing
            taskType: JsonField<TaskType> = JsonMissing.of(),
            @JsonProperty("versionCount")
            @ExcludeMissing
            versionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("workspaceId")
            @ExcludeMissing
            workspaceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitRepo") @ExcludeMissing gitRepo: JsonField<GitRepo> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            developmentGoalCount,
            goalCount,
            inferencePipelineCount,
            links,
            monitoringGoalCount,
            name,
            source,
            taskType,
            versionCount,
            workspaceId,
            description,
            gitRepo,
            mutableMapOf(),
        )

        /**
         * The project id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The project creator id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

        /**
         * The project creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The project last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The number of tests in the development mode of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun developmentGoalCount(): Long = developmentGoalCount.getRequired("developmentGoalCount")

        /**
         * The total number of tests in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun goalCount(): Long = goalCount.getRequired("goalCount")

        /**
         * The number of inference pipelines in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inferencePipelineCount(): Long =
            inferencePipelineCount.getRequired("inferencePipelineCount")

        /**
         * Links to the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun links(): Links = links.getRequired("links")

        /**
         * The number of tests in the monitoring mode of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun monitoringGoalCount(): Long = monitoringGoalCount.getRequired("monitoringGoalCount")

        /**
         * The project name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The source of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * The task type of the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taskType(): TaskType = taskType.getRequired("taskType")

        /**
         * The number of versions (commits) in the project.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun versionCount(): Long = versionCount.getRequired("versionCount")

        /**
         * The workspace id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceId(): Optional<String> = workspaceId.getOptional("workspaceId")

        /**
         * The project description.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gitRepo(): Optional<GitRepo> = gitRepo.getOptional("gitRepo")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creatorId].
         *
         * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [developmentGoalCount].
         *
         * Unlike [developmentGoalCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("developmentGoalCount")
        @ExcludeMissing
        fun _developmentGoalCount(): JsonField<Long> = developmentGoalCount

        /**
         * Returns the raw JSON value of [goalCount].
         *
         * Unlike [goalCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("goalCount") @ExcludeMissing fun _goalCount(): JsonField<Long> = goalCount

        /**
         * Returns the raw JSON value of [inferencePipelineCount].
         *
         * Unlike [inferencePipelineCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inferencePipelineCount")
        @ExcludeMissing
        fun _inferencePipelineCount(): JsonField<Long> = inferencePipelineCount

        /**
         * Returns the raw JSON value of [links].
         *
         * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

        /**
         * Returns the raw JSON value of [monitoringGoalCount].
         *
         * Unlike [monitoringGoalCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monitoringGoalCount")
        @ExcludeMissing
        fun _monitoringGoalCount(): JsonField<Long> = monitoringGoalCount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [taskType].
         *
         * Unlike [taskType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskType") @ExcludeMissing fun _taskType(): JsonField<TaskType> = taskType

        /**
         * Returns the raw JSON value of [versionCount].
         *
         * Unlike [versionCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("versionCount")
        @ExcludeMissing
        fun _versionCount(): JsonField<Long> = versionCount

        /**
         * Returns the raw JSON value of [workspaceId].
         *
         * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspaceId")
        @ExcludeMissing
        fun _workspaceId(): JsonField<String> = workspaceId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [gitRepo].
         *
         * Unlike [gitRepo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo(): JsonField<GitRepo> = gitRepo

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

            /**
             * Returns a mutable builder for constructing an instance of [Project].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .developmentGoalCount()
             * .goalCount()
             * .inferencePipelineCount()
             * .links()
             * .monitoringGoalCount()
             * .name()
             * .source()
             * .taskType()
             * .versionCount()
             * .workspaceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Project]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var developmentGoalCount: JsonField<Long>? = null
            private var goalCount: JsonField<Long>? = null
            private var inferencePipelineCount: JsonField<Long>? = null
            private var links: JsonField<Links>? = null
            private var monitoringGoalCount: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var source: JsonField<Source>? = null
            private var taskType: JsonField<TaskType>? = null
            private var versionCount: JsonField<Long>? = null
            private var workspaceId: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var gitRepo: JsonField<GitRepo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(project: Project) = apply {
                id = project.id
                creatorId = project.creatorId
                dateCreated = project.dateCreated
                dateUpdated = project.dateUpdated
                developmentGoalCount = project.developmentGoalCount
                goalCount = project.goalCount
                inferencePipelineCount = project.inferencePipelineCount
                links = project.links
                monitoringGoalCount = project.monitoringGoalCount
                name = project.name
                source = project.source
                taskType = project.taskType
                versionCount = project.versionCount
                workspaceId = project.workspaceId
                description = project.description
                gitRepo = project.gitRepo
                additionalProperties = project.additionalProperties.toMutableMap()
            }

            /** The project id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The project creator id. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

            /**
             * Sets [Builder.creatorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The project creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The project last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The number of tests in the development mode of the project. */
            fun developmentGoalCount(developmentGoalCount: Long) =
                developmentGoalCount(JsonField.of(developmentGoalCount))

            /**
             * Sets [Builder.developmentGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.developmentGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun developmentGoalCount(developmentGoalCount: JsonField<Long>) = apply {
                this.developmentGoalCount = developmentGoalCount
            }

            /** The total number of tests in the project. */
            fun goalCount(goalCount: Long) = goalCount(JsonField.of(goalCount))

            /**
             * Sets [Builder.goalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.goalCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun goalCount(goalCount: JsonField<Long>) = apply { this.goalCount = goalCount }

            /** The number of inference pipelines in the project. */
            fun inferencePipelineCount(inferencePipelineCount: Long) =
                inferencePipelineCount(JsonField.of(inferencePipelineCount))

            /**
             * Sets [Builder.inferencePipelineCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inferencePipelineCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inferencePipelineCount(inferencePipelineCount: JsonField<Long>) = apply {
                this.inferencePipelineCount = inferencePipelineCount
            }

            /** Links to the project. */
            fun links(links: Links) = links(JsonField.of(links))

            /**
             * Sets [Builder.links] to an arbitrary JSON value.
             *
             * You should usually call [Builder.links] with a well-typed [Links] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun links(links: JsonField<Links>) = apply { this.links = links }

            /** The number of tests in the monitoring mode of the project. */
            fun monitoringGoalCount(monitoringGoalCount: Long) =
                monitoringGoalCount(JsonField.of(monitoringGoalCount))

            /**
             * Sets [Builder.monitoringGoalCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monitoringGoalCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monitoringGoalCount(monitoringGoalCount: JsonField<Long>) = apply {
                this.monitoringGoalCount = monitoringGoalCount
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

            /** The source of the project. */
            fun source(source: Source?) = source(JsonField.ofNullable(source))

            /** Alias for calling [Builder.source] with `source.orElse(null)`. */
            fun source(source: Optional<Source>) = source(source.getOrNull())

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** The task type of the project. */
            fun taskType(taskType: TaskType) = taskType(JsonField.of(taskType))

            /**
             * Sets [Builder.taskType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskType] with a well-typed [TaskType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskType(taskType: JsonField<TaskType>) = apply { this.taskType = taskType }

            /** The number of versions (commits) in the project. */
            fun versionCount(versionCount: Long) = versionCount(JsonField.of(versionCount))

            /**
             * Sets [Builder.versionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.versionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun versionCount(versionCount: JsonField<Long>) = apply {
                this.versionCount = versionCount
            }

            /** The workspace id. */
            fun workspaceId(workspaceId: String?) = workspaceId(JsonField.ofNullable(workspaceId))

            /** Alias for calling [Builder.workspaceId] with `workspaceId.orElse(null)`. */
            fun workspaceId(workspaceId: Optional<String>) = workspaceId(workspaceId.getOrNull())

            /**
             * Sets [Builder.workspaceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspaceId(workspaceId: JsonField<String>) = apply {
                this.workspaceId = workspaceId
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

            fun gitRepo(gitRepo: GitRepo?) = gitRepo(JsonField.ofNullable(gitRepo))

            /** Alias for calling [Builder.gitRepo] with `gitRepo.orElse(null)`. */
            fun gitRepo(gitRepo: Optional<GitRepo>) = gitRepo(gitRepo.getOrNull())

            /**
             * Sets [Builder.gitRepo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitRepo] with a well-typed [GitRepo] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitRepo(gitRepo: JsonField<GitRepo>) = apply { this.gitRepo = gitRepo }

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
             * Returns an immutable instance of [Project].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .developmentGoalCount()
             * .goalCount()
             * .inferencePipelineCount()
             * .links()
             * .monitoringGoalCount()
             * .name()
             * .source()
             * .taskType()
             * .versionCount()
             * .workspaceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Project =
                Project(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("developmentGoalCount", developmentGoalCount),
                    checkRequired("goalCount", goalCount),
                    checkRequired("inferencePipelineCount", inferencePipelineCount),
                    checkRequired("links", links),
                    checkRequired("monitoringGoalCount", monitoringGoalCount),
                    checkRequired("name", name),
                    checkRequired("source", source),
                    checkRequired("taskType", taskType),
                    checkRequired("versionCount", versionCount),
                    checkRequired("workspaceId", workspaceId),
                    description,
                    gitRepo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Project = apply {
            if (validated) {
                return@apply
            }

            id()
            creatorId()
            dateCreated()
            dateUpdated()
            developmentGoalCount()
            goalCount()
            inferencePipelineCount()
            links().validate()
            monitoringGoalCount()
            name()
            source().ifPresent { it.validate() }
            taskType().validate()
            versionCount()
            workspaceId()
            description()
            gitRepo().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (creatorId.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (developmentGoalCount.asKnown().isPresent) 1 else 0) +
                (if (goalCount.asKnown().isPresent) 1 else 0) +
                (if (inferencePipelineCount.asKnown().isPresent) 1 else 0) +
                (links.asKnown().getOrNull()?.validity() ?: 0) +
                (if (monitoringGoalCount.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (taskType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (versionCount.asKnown().isPresent) 1 else 0) +
                (if (workspaceId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (gitRepo.asKnown().getOrNull()?.validity() ?: 0)

        /** Links to the project. */
        class Links
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val app: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of()
            ) : this(app, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun app(): String = app.getRequired("app")

            /**
             * Returns the raw JSON value of [app].
             *
             * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

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

                /**
                 * Returns a mutable builder for constructing an instance of [Links].
                 *
                 * The following fields are required:
                 * ```java
                 * .app()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Links]. */
            class Builder internal constructor() {

                private var app: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(links: Links) = apply {
                    app = links.app
                    additionalProperties = links.additionalProperties.toMutableMap()
                }

                fun app(app: String) = app(JsonField.of(app))

                /**
                 * Sets [Builder.app] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.app] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun app(app: JsonField<String>) = apply { this.app = app }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Links].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .app()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Links =
                    Links(checkRequired("app", app), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Links = apply {
                if (validated) {
                    return@apply
                }

                app()
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
            @JvmSynthetic internal fun validity(): Int = (if (app.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Links &&
                    app == other.app &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(app, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Links{app=$app, additionalProperties=$additionalProperties}"
        }

        /** The source of the project. */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WEB = of("web")

                @JvmField val API = of("api")

                @JvmField val NULL = of("null")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                WEB,
                API,
                NULL,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WEB,
                API,
                NULL,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WEB -> Value.WEB
                    API -> Value.API
                    NULL -> Value.NULL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WEB -> Known.WEB
                    API -> Known.API
                    NULL -> Known.NULL
                    else -> throw OpenlayerInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Source = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The task type of the project. */
        class TaskType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LLM_BASE = of("llm-base")

                @JvmField val TABULAR_CLASSIFICATION = of("tabular-classification")

                @JvmField val TABULAR_REGRESSION = of("tabular-regression")

                @JvmField val TEXT_CLASSIFICATION = of("text-classification")

                @JvmStatic fun of(value: String) = TaskType(JsonField.of(value))
            }

            /** An enum containing [TaskType]'s known values. */
            enum class Known {
                LLM_BASE,
                TABULAR_CLASSIFICATION,
                TABULAR_REGRESSION,
                TEXT_CLASSIFICATION,
            }

            /**
             * An enum containing [TaskType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TaskType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LLM_BASE,
                TABULAR_CLASSIFICATION,
                TABULAR_REGRESSION,
                TEXT_CLASSIFICATION,
                /**
                 * An enum member indicating that [TaskType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LLM_BASE -> Value.LLM_BASE
                    TABULAR_CLASSIFICATION -> Value.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Value.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Value.TEXT_CLASSIFICATION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LLM_BASE -> Known.LLM_BASE
                    TABULAR_CLASSIFICATION -> Known.TABULAR_CLASSIFICATION
                    TABULAR_REGRESSION -> Known.TABULAR_REGRESSION
                    TEXT_CLASSIFICATION -> Known.TEXT_CLASSIFICATION
                    else -> throw OpenlayerInvalidDataException("Unknown TaskType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): TaskType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TaskType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class GitRepo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val dateConnected: JsonField<OffsetDateTime>,
            private val dateUpdated: JsonField<OffsetDateTime>,
            private val gitAccountId: JsonField<String>,
            private val gitId: JsonField<Long>,
            private val name: JsonField<String>,
            private val private_: JsonField<Boolean>,
            private val bodyProjectId: JsonField<String>,
            private val slug: JsonField<String>,
            private val url: JsonField<String>,
            private val branch: JsonField<String>,
            private val rootDir: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dateConnected")
                @ExcludeMissing
                dateConnected: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dateUpdated")
                @ExcludeMissing
                dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("gitAccountId")
                @ExcludeMissing
                gitAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gitId") @ExcludeMissing gitId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("private")
                @ExcludeMissing
                private_: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("projectId")
                @ExcludeMissing
                bodyProjectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("branch")
                @ExcludeMissing
                branch: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rootDir")
                @ExcludeMissing
                rootDir: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                dateConnected,
                dateUpdated,
                gitAccountId,
                gitId,
                name,
                private_,
                bodyProjectId,
                slug,
                url,
                branch,
                rootDir,
                mutableMapOf(),
            )

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateConnected(): OffsetDateTime = dateConnected.getRequired("dateConnected")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gitAccountId(): String = gitAccountId.getRequired("gitAccountId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun gitId(): Long = gitId.getRequired("gitId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun private_(): Boolean = private_.getRequired("private")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bodyProjectId(): String = bodyProjectId.getRequired("projectId")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun slug(): String = slug.getRequired("slug")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun branch(): Optional<String> = branch.getOptional("branch")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun rootDir(): Optional<String> = rootDir.getOptional("rootDir")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [dateConnected].
             *
             * Unlike [dateConnected], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateConnected")
            @ExcludeMissing
            fun _dateConnected(): JsonField<OffsetDateTime> = dateConnected

            /**
             * Returns the raw JSON value of [dateUpdated].
             *
             * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

            /**
             * Returns the raw JSON value of [gitAccountId].
             *
             * Unlike [gitAccountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gitAccountId")
            @ExcludeMissing
            fun _gitAccountId(): JsonField<String> = gitAccountId

            /**
             * Returns the raw JSON value of [gitId].
             *
             * Unlike [gitId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gitId") @ExcludeMissing fun _gitId(): JsonField<Long> = gitId

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [private_].
             *
             * Unlike [private_], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("private") @ExcludeMissing fun _private_(): JsonField<Boolean> = private_

            /**
             * Returns the raw JSON value of [bodyProjectId].
             *
             * Unlike [bodyProjectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun _bodyProjectId(): JsonField<String> = bodyProjectId

            /**
             * Returns the raw JSON value of [slug].
             *
             * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [branch].
             *
             * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

            /**
             * Returns the raw JSON value of [rootDir].
             *
             * Unlike [rootDir], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rootDir") @ExcludeMissing fun _rootDir(): JsonField<String> = rootDir

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

                /**
                 * Returns a mutable builder for constructing an instance of [GitRepo].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .dateConnected()
                 * .dateUpdated()
                 * .gitAccountId()
                 * .gitId()
                 * .name()
                 * .private_()
                 * .bodyProjectId()
                 * .slug()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GitRepo]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var dateConnected: JsonField<OffsetDateTime>? = null
                private var dateUpdated: JsonField<OffsetDateTime>? = null
                private var gitAccountId: JsonField<String>? = null
                private var gitId: JsonField<Long>? = null
                private var name: JsonField<String>? = null
                private var private_: JsonField<Boolean>? = null
                private var bodyProjectId: JsonField<String>? = null
                private var slug: JsonField<String>? = null
                private var url: JsonField<String>? = null
                private var branch: JsonField<String> = JsonMissing.of()
                private var rootDir: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gitRepo: GitRepo) = apply {
                    id = gitRepo.id
                    dateConnected = gitRepo.dateConnected
                    dateUpdated = gitRepo.dateUpdated
                    gitAccountId = gitRepo.gitAccountId
                    gitId = gitRepo.gitId
                    name = gitRepo.name
                    private_ = gitRepo.private_
                    bodyProjectId = gitRepo.bodyProjectId
                    slug = gitRepo.slug
                    url = gitRepo.url
                    branch = gitRepo.branch
                    rootDir = gitRepo.rootDir
                    additionalProperties = gitRepo.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun dateConnected(dateConnected: OffsetDateTime) =
                    dateConnected(JsonField.of(dateConnected))

                /**
                 * Sets [Builder.dateConnected] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateConnected] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun dateConnected(dateConnected: JsonField<OffsetDateTime>) = apply {
                    this.dateConnected = dateConnected
                }

                fun dateUpdated(dateUpdated: OffsetDateTime) =
                    dateUpdated(JsonField.of(dateUpdated))

                /**
                 * Sets [Builder.dateUpdated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                    this.dateUpdated = dateUpdated
                }

                fun gitAccountId(gitAccountId: String) = gitAccountId(JsonField.of(gitAccountId))

                /**
                 * Sets [Builder.gitAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gitAccountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gitAccountId(gitAccountId: JsonField<String>) = apply {
                    this.gitAccountId = gitAccountId
                }

                fun gitId(gitId: Long) = gitId(JsonField.of(gitId))

                /**
                 * Sets [Builder.gitId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gitId] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun gitId(gitId: JsonField<Long>) = apply { this.gitId = gitId }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun private_(private_: Boolean) = private_(JsonField.of(private_))

                /**
                 * Sets [Builder.private_] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.private_] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun private_(private_: JsonField<Boolean>) = apply { this.private_ = private_ }

                fun bodyProjectId(bodyProjectId: String) =
                    bodyProjectId(JsonField.of(bodyProjectId))

                /**
                 * Sets [Builder.bodyProjectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyProjectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyProjectId(bodyProjectId: JsonField<String>) = apply {
                    this.bodyProjectId = bodyProjectId
                }

                fun slug(slug: String) = slug(JsonField.of(slug))

                /**
                 * Sets [Builder.slug] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slug] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun slug(slug: JsonField<String>) = apply { this.slug = slug }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun branch(branch: String) = branch(JsonField.of(branch))

                /**
                 * Sets [Builder.branch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.branch] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun branch(branch: JsonField<String>) = apply { this.branch = branch }

                fun rootDir(rootDir: String) = rootDir(JsonField.of(rootDir))

                /**
                 * Sets [Builder.rootDir] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rootDir] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rootDir(rootDir: JsonField<String>) = apply { this.rootDir = rootDir }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [GitRepo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .dateConnected()
                 * .dateUpdated()
                 * .gitAccountId()
                 * .gitId()
                 * .name()
                 * .private_()
                 * .bodyProjectId()
                 * .slug()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): GitRepo =
                    GitRepo(
                        checkRequired("id", id),
                        checkRequired("dateConnected", dateConnected),
                        checkRequired("dateUpdated", dateUpdated),
                        checkRequired("gitAccountId", gitAccountId),
                        checkRequired("gitId", gitId),
                        checkRequired("name", name),
                        checkRequired("private_", private_),
                        checkRequired("bodyProjectId", bodyProjectId),
                        checkRequired("slug", slug),
                        checkRequired("url", url),
                        branch,
                        rootDir,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GitRepo = apply {
                if (validated) {
                    return@apply
                }

                id()
                dateConnected()
                dateUpdated()
                gitAccountId()
                gitId()
                name()
                private_()
                bodyProjectId()
                slug()
                url()
                branch()
                rootDir()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (dateConnected.asKnown().isPresent) 1 else 0) +
                    (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                    (if (gitAccountId.asKnown().isPresent) 1 else 0) +
                    (if (gitId.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (private_.asKnown().isPresent) 1 else 0) +
                    (if (bodyProjectId.asKnown().isPresent) 1 else 0) +
                    (if (slug.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (branch.asKnown().isPresent) 1 else 0) +
                    (if (rootDir.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GitRepo &&
                    id == other.id &&
                    dateConnected == other.dateConnected &&
                    dateUpdated == other.dateUpdated &&
                    gitAccountId == other.gitAccountId &&
                    gitId == other.gitId &&
                    name == other.name &&
                    private_ == other.private_ &&
                    bodyProjectId == other.bodyProjectId &&
                    slug == other.slug &&
                    url == other.url &&
                    branch == other.branch &&
                    rootDir == other.rootDir &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    dateConnected,
                    dateUpdated,
                    gitAccountId,
                    gitId,
                    name,
                    private_,
                    bodyProjectId,
                    slug,
                    url,
                    branch,
                    rootDir,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GitRepo{id=$id, dateConnected=$dateConnected, dateUpdated=$dateUpdated, gitAccountId=$gitAccountId, gitId=$gitId, name=$name, private_=$private_, bodyProjectId=$bodyProjectId, slug=$slug, url=$url, branch=$branch, rootDir=$rootDir, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Project &&
                id == other.id &&
                creatorId == other.creatorId &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                developmentGoalCount == other.developmentGoalCount &&
                goalCount == other.goalCount &&
                inferencePipelineCount == other.inferencePipelineCount &&
                links == other.links &&
                monitoringGoalCount == other.monitoringGoalCount &&
                name == other.name &&
                source == other.source &&
                taskType == other.taskType &&
                versionCount == other.versionCount &&
                workspaceId == other.workspaceId &&
                description == other.description &&
                gitRepo == other.gitRepo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creatorId,
                dateCreated,
                dateUpdated,
                developmentGoalCount,
                goalCount,
                inferencePipelineCount,
                links,
                monitoringGoalCount,
                name,
                source,
                taskType,
                versionCount,
                workspaceId,
                description,
                gitRepo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Project{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, developmentGoalCount=$developmentGoalCount, goalCount=$goalCount, inferencePipelineCount=$inferencePipelineCount, links=$links, monitoringGoalCount=$monitoringGoalCount, name=$name, source=$source, taskType=$taskType, versionCount=$versionCount, workspaceId=$workspaceId, description=$description, gitRepo=$gitRepo, additionalProperties=$additionalProperties}"
    }

    class Workspace
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creatorId: JsonField<String>,
        private val dateCreated: JsonField<OffsetDateTime>,
        private val dateUpdated: JsonField<OffsetDateTime>,
        private val inviteCount: JsonField<Long>,
        private val memberCount: JsonField<Long>,
        private val name: JsonField<String>,
        private val periodEndDate: JsonField<OffsetDateTime>,
        private val periodStartDate: JsonField<OffsetDateTime>,
        private val projectCount: JsonField<Long>,
        private val slug: JsonField<String>,
        private val status: JsonField<Status>,
        private val inviteCode: JsonField<String>,
        private val monthlyUsage: JsonField<List<MonthlyUsage>>,
        private val samlOnlyAccess: JsonField<Boolean>,
        private val wildcardDomains: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creatorId")
            @ExcludeMissing
            creatorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateCreated")
            @ExcludeMissing
            dateCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dateUpdated")
            @ExcludeMissing
            dateUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inviteCount")
            @ExcludeMissing
            inviteCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("memberCount")
            @ExcludeMissing
            memberCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("periodEndDate")
            @ExcludeMissing
            periodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("periodStartDate")
            @ExcludeMissing
            periodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("projectCount")
            @ExcludeMissing
            projectCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("inviteCode")
            @ExcludeMissing
            inviteCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("monthlyUsage")
            @ExcludeMissing
            monthlyUsage: JsonField<List<MonthlyUsage>> = JsonMissing.of(),
            @JsonProperty("samlOnlyAccess")
            @ExcludeMissing
            samlOnlyAccess: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("wildcardDomains")
            @ExcludeMissing
            wildcardDomains: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            id,
            creatorId,
            dateCreated,
            dateUpdated,
            inviteCount,
            memberCount,
            name,
            periodEndDate,
            periodStartDate,
            projectCount,
            slug,
            status,
            inviteCode,
            monthlyUsage,
            samlOnlyAccess,
            wildcardDomains,
            mutableMapOf(),
        )

        /**
         * The workspace id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The workspace creator id.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creatorId(): Optional<String> = creatorId.getOptional("creatorId")

        /**
         * The workspace creation date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateCreated(): OffsetDateTime = dateCreated.getRequired("dateCreated")

        /**
         * The workspace last updated date.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateUpdated(): OffsetDateTime = dateUpdated.getRequired("dateUpdated")

        /**
         * The number of invites in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inviteCount(): Long = inviteCount.getRequired("inviteCount")

        /**
         * The number of members in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memberCount(): Long = memberCount.getRequired("memberCount")

        /**
         * The workspace name.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The end date of the current billing period.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodEndDate(): Optional<OffsetDateTime> = periodEndDate.getOptional("periodEndDate")

        /**
         * The start date of the current billing period.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodStartDate(): Optional<OffsetDateTime> =
            periodStartDate.getOptional("periodStartDate")

        /**
         * The number of projects in the workspace.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun projectCount(): Long = projectCount.getRequired("projectCount")

        /**
         * The workspace slug.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The workspace invite code.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inviteCode(): Optional<String> = inviteCode.getOptional("inviteCode")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun monthlyUsage(): Optional<List<MonthlyUsage>> = monthlyUsage.getOptional("monthlyUsage")

        /**
         * Whether the workspace only allows SAML authentication.
         *
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun samlOnlyAccess(): Optional<Boolean> = samlOnlyAccess.getOptional("samlOnlyAccess")

        /**
         * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wildcardDomains(): Optional<List<String>> =
            wildcardDomains.getOptional("wildcardDomains")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creatorId].
         *
         * Unlike [creatorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("creatorId") @ExcludeMissing fun _creatorId(): JsonField<String> = creatorId

        /**
         * Returns the raw JSON value of [dateCreated].
         *
         * Unlike [dateCreated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateCreated")
        @ExcludeMissing
        fun _dateCreated(): JsonField<OffsetDateTime> = dateCreated

        /**
         * Returns the raw JSON value of [dateUpdated].
         *
         * Unlike [dateUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateUpdated")
        @ExcludeMissing
        fun _dateUpdated(): JsonField<OffsetDateTime> = dateUpdated

        /**
         * Returns the raw JSON value of [inviteCount].
         *
         * Unlike [inviteCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inviteCount")
        @ExcludeMissing
        fun _inviteCount(): JsonField<Long> = inviteCount

        /**
         * Returns the raw JSON value of [memberCount].
         *
         * Unlike [memberCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memberCount")
        @ExcludeMissing
        fun _memberCount(): JsonField<Long> = memberCount

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [periodEndDate].
         *
         * Unlike [periodEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("periodEndDate")
        @ExcludeMissing
        fun _periodEndDate(): JsonField<OffsetDateTime> = periodEndDate

        /**
         * Returns the raw JSON value of [periodStartDate].
         *
         * Unlike [periodStartDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("periodStartDate")
        @ExcludeMissing
        fun _periodStartDate(): JsonField<OffsetDateTime> = periodStartDate

        /**
         * Returns the raw JSON value of [projectCount].
         *
         * Unlike [projectCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectCount")
        @ExcludeMissing
        fun _projectCount(): JsonField<Long> = projectCount

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [inviteCode].
         *
         * Unlike [inviteCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inviteCode")
        @ExcludeMissing
        fun _inviteCode(): JsonField<String> = inviteCode

        /**
         * Returns the raw JSON value of [monthlyUsage].
         *
         * Unlike [monthlyUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("monthlyUsage")
        @ExcludeMissing
        fun _monthlyUsage(): JsonField<List<MonthlyUsage>> = monthlyUsage

        /**
         * Returns the raw JSON value of [samlOnlyAccess].
         *
         * Unlike [samlOnlyAccess], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("samlOnlyAccess")
        @ExcludeMissing
        fun _samlOnlyAccess(): JsonField<Boolean> = samlOnlyAccess

        /**
         * Returns the raw JSON value of [wildcardDomains].
         *
         * Unlike [wildcardDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("wildcardDomains")
        @ExcludeMissing
        fun _wildcardDomains(): JsonField<List<String>> = wildcardDomains

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

            /**
             * Returns a mutable builder for constructing an instance of [Workspace].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .inviteCount()
             * .memberCount()
             * .name()
             * .periodEndDate()
             * .periodStartDate()
             * .projectCount()
             * .slug()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Workspace]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creatorId: JsonField<String>? = null
            private var dateCreated: JsonField<OffsetDateTime>? = null
            private var dateUpdated: JsonField<OffsetDateTime>? = null
            private var inviteCount: JsonField<Long>? = null
            private var memberCount: JsonField<Long>? = null
            private var name: JsonField<String>? = null
            private var periodEndDate: JsonField<OffsetDateTime>? = null
            private var periodStartDate: JsonField<OffsetDateTime>? = null
            private var projectCount: JsonField<Long>? = null
            private var slug: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var inviteCode: JsonField<String> = JsonMissing.of()
            private var monthlyUsage: JsonField<MutableList<MonthlyUsage>>? = null
            private var samlOnlyAccess: JsonField<Boolean> = JsonMissing.of()
            private var wildcardDomains: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(workspace: Workspace) = apply {
                id = workspace.id
                creatorId = workspace.creatorId
                dateCreated = workspace.dateCreated
                dateUpdated = workspace.dateUpdated
                inviteCount = workspace.inviteCount
                memberCount = workspace.memberCount
                name = workspace.name
                periodEndDate = workspace.periodEndDate
                periodStartDate = workspace.periodStartDate
                projectCount = workspace.projectCount
                slug = workspace.slug
                status = workspace.status
                inviteCode = workspace.inviteCode
                monthlyUsage = workspace.monthlyUsage.map { it.toMutableList() }
                samlOnlyAccess = workspace.samlOnlyAccess
                wildcardDomains = workspace.wildcardDomains.map { it.toMutableList() }
                additionalProperties = workspace.additionalProperties.toMutableMap()
            }

            /** The workspace id. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The workspace creator id. */
            fun creatorId(creatorId: String?) = creatorId(JsonField.ofNullable(creatorId))

            /** Alias for calling [Builder.creatorId] with `creatorId.orElse(null)`. */
            fun creatorId(creatorId: Optional<String>) = creatorId(creatorId.getOrNull())

            /**
             * Sets [Builder.creatorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creatorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creatorId(creatorId: JsonField<String>) = apply { this.creatorId = creatorId }

            /** The workspace creation date. */
            fun dateCreated(dateCreated: OffsetDateTime) = dateCreated(JsonField.of(dateCreated))

            /**
             * Sets [Builder.dateCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateCreated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateCreated(dateCreated: JsonField<OffsetDateTime>) = apply {
                this.dateCreated = dateCreated
            }

            /** The workspace last updated date. */
            fun dateUpdated(dateUpdated: OffsetDateTime) = dateUpdated(JsonField.of(dateUpdated))

            /**
             * Sets [Builder.dateUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dateUpdated(dateUpdated: JsonField<OffsetDateTime>) = apply {
                this.dateUpdated = dateUpdated
            }

            /** The number of invites in the workspace. */
            fun inviteCount(inviteCount: Long) = inviteCount(JsonField.of(inviteCount))

            /**
             * Sets [Builder.inviteCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteCount(inviteCount: JsonField<Long>) = apply { this.inviteCount = inviteCount }

            /** The number of members in the workspace. */
            fun memberCount(memberCount: Long) = memberCount(JsonField.of(memberCount))

            /**
             * Sets [Builder.memberCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberCount(memberCount: JsonField<Long>) = apply { this.memberCount = memberCount }

            /** The workspace name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The end date of the current billing period. */
            fun periodEndDate(periodEndDate: OffsetDateTime?) =
                periodEndDate(JsonField.ofNullable(periodEndDate))

            /** Alias for calling [Builder.periodEndDate] with `periodEndDate.orElse(null)`. */
            fun periodEndDate(periodEndDate: Optional<OffsetDateTime>) =
                periodEndDate(periodEndDate.getOrNull())

            /**
             * Sets [Builder.periodEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodEndDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodEndDate(periodEndDate: JsonField<OffsetDateTime>) = apply {
                this.periodEndDate = periodEndDate
            }

            /** The start date of the current billing period. */
            fun periodStartDate(periodStartDate: OffsetDateTime?) =
                periodStartDate(JsonField.ofNullable(periodStartDate))

            /** Alias for calling [Builder.periodStartDate] with `periodStartDate.orElse(null)`. */
            fun periodStartDate(periodStartDate: Optional<OffsetDateTime>) =
                periodStartDate(periodStartDate.getOrNull())

            /**
             * Sets [Builder.periodStartDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStartDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodStartDate(periodStartDate: JsonField<OffsetDateTime>) = apply {
                this.periodStartDate = periodStartDate
            }

            /** The number of projects in the workspace. */
            fun projectCount(projectCount: Long) = projectCount(JsonField.of(projectCount))

            /**
             * Sets [Builder.projectCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectCount(projectCount: JsonField<Long>) = apply {
                this.projectCount = projectCount
            }

            /** The workspace slug. */
            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** The workspace invite code. */
            fun inviteCode(inviteCode: String) = inviteCode(JsonField.of(inviteCode))

            /**
             * Sets [Builder.inviteCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inviteCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inviteCode(inviteCode: JsonField<String>) = apply { this.inviteCode = inviteCode }

            fun monthlyUsage(monthlyUsage: List<MonthlyUsage>) =
                monthlyUsage(JsonField.of(monthlyUsage))

            /**
             * Sets [Builder.monthlyUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyUsage] with a well-typed `List<MonthlyUsage>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun monthlyUsage(monthlyUsage: JsonField<List<MonthlyUsage>>) = apply {
                this.monthlyUsage = monthlyUsage.map { it.toMutableList() }
            }

            /**
             * Adds a single [MonthlyUsage] to [Builder.monthlyUsage].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMonthlyUsage(monthlyUsage: MonthlyUsage) = apply {
                this.monthlyUsage =
                    (this.monthlyUsage ?: JsonField.of(mutableListOf())).also {
                        checkKnown("monthlyUsage", it).add(monthlyUsage)
                    }
            }

            /** Whether the workspace only allows SAML authentication. */
            fun samlOnlyAccess(samlOnlyAccess: Boolean) =
                samlOnlyAccess(JsonField.of(samlOnlyAccess))

            /**
             * Sets [Builder.samlOnlyAccess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samlOnlyAccess] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samlOnlyAccess(samlOnlyAccess: JsonField<Boolean>) = apply {
                this.samlOnlyAccess = samlOnlyAccess
            }

            fun wildcardDomains(wildcardDomains: List<String>) =
                wildcardDomains(JsonField.of(wildcardDomains))

            /**
             * Sets [Builder.wildcardDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wildcardDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun wildcardDomains(wildcardDomains: JsonField<List<String>>) = apply {
                this.wildcardDomains = wildcardDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [wildcardDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWildcardDomain(wildcardDomain: String) = apply {
                wildcardDomains =
                    (wildcardDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("wildcardDomains", it).add(wildcardDomain)
                    }
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

            /**
             * Returns an immutable instance of [Workspace].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .creatorId()
             * .dateCreated()
             * .dateUpdated()
             * .inviteCount()
             * .memberCount()
             * .name()
             * .periodEndDate()
             * .periodStartDate()
             * .projectCount()
             * .slug()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Workspace =
                Workspace(
                    checkRequired("id", id),
                    checkRequired("creatorId", creatorId),
                    checkRequired("dateCreated", dateCreated),
                    checkRequired("dateUpdated", dateUpdated),
                    checkRequired("inviteCount", inviteCount),
                    checkRequired("memberCount", memberCount),
                    checkRequired("name", name),
                    checkRequired("periodEndDate", periodEndDate),
                    checkRequired("periodStartDate", periodStartDate),
                    checkRequired("projectCount", projectCount),
                    checkRequired("slug", slug),
                    checkRequired("status", status),
                    inviteCode,
                    (monthlyUsage ?: JsonMissing.of()).map { it.toImmutable() },
                    samlOnlyAccess,
                    (wildcardDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Workspace = apply {
            if (validated) {
                return@apply
            }

            id()
            creatorId()
            dateCreated()
            dateUpdated()
            inviteCount()
            memberCount()
            name()
            periodEndDate()
            periodStartDate()
            projectCount()
            slug()
            status().validate()
            inviteCode()
            monthlyUsage().ifPresent { it.forEach { it.validate() } }
            samlOnlyAccess()
            wildcardDomains()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (creatorId.asKnown().isPresent) 1 else 0) +
                (if (dateCreated.asKnown().isPresent) 1 else 0) +
                (if (dateUpdated.asKnown().isPresent) 1 else 0) +
                (if (inviteCount.asKnown().isPresent) 1 else 0) +
                (if (memberCount.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (periodEndDate.asKnown().isPresent) 1 else 0) +
                (if (periodStartDate.asKnown().isPresent) 1 else 0) +
                (if (projectCount.asKnown().isPresent) 1 else 0) +
                (if (slug.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inviteCode.asKnown().isPresent) 1 else 0) +
                (monthlyUsage.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (samlOnlyAccess.asKnown().isPresent) 1 else 0) +
                (wildcardDomains.asKnown().getOrNull()?.size ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTIVE = of("active")

                @JvmField val PAST_DUE = of("past_due")

                @JvmField val UNPAID = of("unpaid")

                @JvmField val CANCELED = of("canceled")

                @JvmField val INCOMPLETE = of("incomplete")

                @JvmField val INCOMPLETE_EXPIRED = of("incomplete_expired")

                @JvmField val TRIALING = of("trialing")

                @JvmField val PAUSED = of("paused")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                PAST_DUE,
                UNPAID,
                CANCELED,
                INCOMPLETE,
                INCOMPLETE_EXPIRED,
                TRIALING,
                PAUSED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                PAST_DUE,
                UNPAID,
                CANCELED,
                INCOMPLETE,
                INCOMPLETE_EXPIRED,
                TRIALING,
                PAUSED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    PAST_DUE -> Value.PAST_DUE
                    UNPAID -> Value.UNPAID
                    CANCELED -> Value.CANCELED
                    INCOMPLETE -> Value.INCOMPLETE
                    INCOMPLETE_EXPIRED -> Value.INCOMPLETE_EXPIRED
                    TRIALING -> Value.TRIALING
                    PAUSED -> Value.PAUSED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    PAST_DUE -> Known.PAST_DUE
                    UNPAID -> Known.UNPAID
                    CANCELED -> Known.CANCELED
                    INCOMPLETE -> Known.INCOMPLETE
                    INCOMPLETE_EXPIRED -> Known.INCOMPLETE_EXPIRED
                    TRIALING -> Known.TRIALING
                    PAUSED -> Known.PAUSED
                    else -> throw OpenlayerInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws OpenlayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    OpenlayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class MonthlyUsage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val executionTimeMs: JsonField<Long>,
            private val monthYear: JsonField<LocalDate>,
            private val predictionCount: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("executionTimeMs")
                @ExcludeMissing
                executionTimeMs: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("monthYear")
                @ExcludeMissing
                monthYear: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("predictionCount")
                @ExcludeMissing
                predictionCount: JsonField<Long> = JsonMissing.of(),
            ) : this(executionTimeMs, monthYear, predictionCount, mutableMapOf())

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun executionTimeMs(): Optional<Long> = executionTimeMs.getOptional("executionTimeMs")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun monthYear(): Optional<LocalDate> = monthYear.getOptional("monthYear")

            /**
             * @throws OpenlayerInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun predictionCount(): Optional<Long> = predictionCount.getOptional("predictionCount")

            /**
             * Returns the raw JSON value of [executionTimeMs].
             *
             * Unlike [executionTimeMs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("executionTimeMs")
            @ExcludeMissing
            fun _executionTimeMs(): JsonField<Long> = executionTimeMs

            /**
             * Returns the raw JSON value of [monthYear].
             *
             * Unlike [monthYear], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("monthYear")
            @ExcludeMissing
            fun _monthYear(): JsonField<LocalDate> = monthYear

            /**
             * Returns the raw JSON value of [predictionCount].
             *
             * Unlike [predictionCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("predictionCount")
            @ExcludeMissing
            fun _predictionCount(): JsonField<Long> = predictionCount

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

                /** Returns a mutable builder for constructing an instance of [MonthlyUsage]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MonthlyUsage]. */
            class Builder internal constructor() {

                private var executionTimeMs: JsonField<Long> = JsonMissing.of()
                private var monthYear: JsonField<LocalDate> = JsonMissing.of()
                private var predictionCount: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(monthlyUsage: MonthlyUsage) = apply {
                    executionTimeMs = monthlyUsage.executionTimeMs
                    monthYear = monthlyUsage.monthYear
                    predictionCount = monthlyUsage.predictionCount
                    additionalProperties = monthlyUsage.additionalProperties.toMutableMap()
                }

                fun executionTimeMs(executionTimeMs: Long?) =
                    executionTimeMs(JsonField.ofNullable(executionTimeMs))

                /**
                 * Alias for [Builder.executionTimeMs].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun executionTimeMs(executionTimeMs: Long) =
                    executionTimeMs(executionTimeMs as Long?)

                /**
                 * Alias for calling [Builder.executionTimeMs] with `executionTimeMs.orElse(null)`.
                 */
                fun executionTimeMs(executionTimeMs: Optional<Long>) =
                    executionTimeMs(executionTimeMs.getOrNull())

                /**
                 * Sets [Builder.executionTimeMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.executionTimeMs] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun executionTimeMs(executionTimeMs: JsonField<Long>) = apply {
                    this.executionTimeMs = executionTimeMs
                }

                fun monthYear(monthYear: LocalDate) = monthYear(JsonField.of(monthYear))

                /**
                 * Sets [Builder.monthYear] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.monthYear] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun monthYear(monthYear: JsonField<LocalDate>) = apply {
                    this.monthYear = monthYear
                }

                fun predictionCount(predictionCount: Long) =
                    predictionCount(JsonField.of(predictionCount))

                /**
                 * Sets [Builder.predictionCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.predictionCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun predictionCount(predictionCount: JsonField<Long>) = apply {
                    this.predictionCount = predictionCount
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [MonthlyUsage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MonthlyUsage =
                    MonthlyUsage(
                        executionTimeMs,
                        monthYear,
                        predictionCount,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MonthlyUsage = apply {
                if (validated) {
                    return@apply
                }

                executionTimeMs()
                monthYear()
                predictionCount()
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
                (if (executionTimeMs.asKnown().isPresent) 1 else 0) +
                    (if (monthYear.asKnown().isPresent) 1 else 0) +
                    (if (predictionCount.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MonthlyUsage &&
                    executionTimeMs == other.executionTimeMs &&
                    monthYear == other.monthYear &&
                    predictionCount == other.predictionCount &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(executionTimeMs, monthYear, predictionCount, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MonthlyUsage{executionTimeMs=$executionTimeMs, monthYear=$monthYear, predictionCount=$predictionCount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Workspace &&
                id == other.id &&
                creatorId == other.creatorId &&
                dateCreated == other.dateCreated &&
                dateUpdated == other.dateUpdated &&
                inviteCount == other.inviteCount &&
                memberCount == other.memberCount &&
                name == other.name &&
                periodEndDate == other.periodEndDate &&
                periodStartDate == other.periodStartDate &&
                projectCount == other.projectCount &&
                slug == other.slug &&
                status == other.status &&
                inviteCode == other.inviteCode &&
                monthlyUsage == other.monthlyUsage &&
                samlOnlyAccess == other.samlOnlyAccess &&
                wildcardDomains == other.wildcardDomains &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creatorId,
                dateCreated,
                dateUpdated,
                inviteCount,
                memberCount,
                name,
                periodEndDate,
                periodStartDate,
                projectCount,
                slug,
                status,
                inviteCode,
                monthlyUsage,
                samlOnlyAccess,
                wildcardDomains,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Workspace{id=$id, creatorId=$creatorId, dateCreated=$dateCreated, dateUpdated=$dateUpdated, inviteCount=$inviteCount, memberCount=$memberCount, name=$name, periodEndDate=$periodEndDate, periodStartDate=$periodStartDate, projectCount=$projectCount, slug=$slug, status=$status, inviteCode=$inviteCode, monthlyUsage=$monthlyUsage, samlOnlyAccess=$samlOnlyAccess, wildcardDomains=$wildcardDomains, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferencePipelineCreateParams &&
            pathProjectId == other.pathProjectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(pathProjectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InferencePipelineCreateParams{pathProjectId=$pathProjectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
