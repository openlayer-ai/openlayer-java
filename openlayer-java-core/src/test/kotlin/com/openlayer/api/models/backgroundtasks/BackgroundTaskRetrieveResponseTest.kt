// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.backgroundtasks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BackgroundTaskRetrieveResponseTest {

    @Test
    fun create() {
        val backgroundTaskRetrieveResponse =
            BackgroundTaskRetrieveResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .complete(true)
                .dateCreated(OffsetDateTime.parse("2026-09-15T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-09-15T11:33:47.902Z"))
                .name(
                    "ExportFrameworkRunner(framework_id=9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70, project_id=None)"
                )
                .progress(95.0f)
                .error("error")
                .outputs(
                    JsonValue.from(
                        mapOf(
                            "storageUri" to "s3://openlayer-storage/exports/soc2-2026-09-15.zip",
                            "filename" to "soc2-2026-09-15.zip",
                            "controlCount" to 64,
                            "evidenceCount" to 51,
                            "missingEvidenceCount" to 13,
                        )
                    )
                )
                .build()

        assertThat(backgroundTaskRetrieveResponse.id())
            .isEqualTo("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(backgroundTaskRetrieveResponse.complete()).isEqualTo(true)
        assertThat(backgroundTaskRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-09-15T11:31:01.185Z"))
        assertThat(backgroundTaskRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-09-15T11:33:47.902Z"))
        assertThat(backgroundTaskRetrieveResponse.name())
            .isEqualTo(
                "ExportFrameworkRunner(framework_id=9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70, project_id=None)"
            )
        assertThat(backgroundTaskRetrieveResponse.progress()).isEqualTo(95.0f)
        assertThat(backgroundTaskRetrieveResponse.error()).contains("error")
        assertThat(backgroundTaskRetrieveResponse._outputs())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "storageUri" to "s3://openlayer-storage/exports/soc2-2026-09-15.zip",
                        "filename" to "soc2-2026-09-15.zip",
                        "controlCount" to 64,
                        "evidenceCount" to 51,
                        "missingEvidenceCount" to 13,
                    )
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val backgroundTaskRetrieveResponse =
            BackgroundTaskRetrieveResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .complete(true)
                .dateCreated(OffsetDateTime.parse("2026-09-15T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-09-15T11:33:47.902Z"))
                .name(
                    "ExportFrameworkRunner(framework_id=9f1b3c2d-4e5a-4f60-8a71-2b3c4d5e6f70, project_id=None)"
                )
                .progress(95.0f)
                .error("error")
                .outputs(
                    JsonValue.from(
                        mapOf(
                            "storageUri" to "s3://openlayer-storage/exports/soc2-2026-09-15.zip",
                            "filename" to "soc2-2026-09-15.zip",
                            "controlCount" to 64,
                            "evidenceCount" to 51,
                            "missingEvidenceCount" to 13,
                        )
                    )
                )
                .build()

        val roundtrippedBackgroundTaskRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(backgroundTaskRetrieveResponse),
                jacksonTypeRef<BackgroundTaskRetrieveResponse>(),
            )

        assertThat(roundtrippedBackgroundTaskRetrieveResponse)
            .isEqualTo(backgroundTaskRetrieveResponse)
    }
}
