// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentRetrieveResponseTest {

    @Test
    fun create() {
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .id("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .title("EU AI Act -- Regulation (EU) 2024/1689")
                .addSection(
                    DocumentRetrieveResponse.Section.builder()
                        .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .number("Article 9")
                        .sortOrder(0L)
                        .title("Risk management system")
                        .ruleCount(0L)
                        .addRule(
                            DocumentRetrieveResponse.Section.Rule.builder()
                                .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                .name("Monitoring enabled")
                                .scope(DocumentRetrieveResponse.Section.Rule.Scope.PROJECT)
                                .type(DocumentRetrieveResponse.Section.Rule.Type.PLATFORM)
                                .automationParams(
                                    DocumentRetrieveResponse.Section.Rule.AutomationParams.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .automationType("monitoring_mode_enabled")
                                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .deactivated(true)
                                .description(
                                    "Each project must have Openlayer monitoring mode enabled."
                                )
                                .evidenceType(
                                    DocumentRetrieveResponse.Section.Rule.EvidenceType.DOCUMENT
                                )
                                .immutable(true)
                                .renewalCadenceDays(90L)
                                .build()
                        )
                        .addSubsection(
                            DocumentRetrieveResponse.Section.Subsection.builder()
                                .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                                .number("9.2")
                                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .sortOrder(0L)
                                .title("Identification of known and foreseeable risks")
                                .ruleCount(0L)
                                .addRule(
                                    DocumentRetrieveResponse.Section.Subsection.Rule.builder()
                                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                        .name("Monitoring enabled")
                                        .scope(
                                            DocumentRetrieveResponse.Section.Subsection.Rule.Scope
                                                .PROJECT
                                        )
                                        .type(
                                            DocumentRetrieveResponse.Section.Subsection.Rule.Type
                                                .PLATFORM
                                        )
                                        .automationParams(
                                            DocumentRetrieveResponse.Section.Subsection.Rule
                                                .AutomationParams
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .automationType("monitoring_mode_enabled")
                                        .dateCreated(
                                            OffsetDateTime.parse("2026-03-22T11:31:01.185Z")
                                        )
                                        .dateUpdated(
                                            OffsetDateTime.parse("2026-03-22T11:31:01.185Z")
                                        )
                                        .deactivated(true)
                                        .description(
                                            "Each project must have Openlayer monitoring mode enabled."
                                        )
                                        .evidenceType(
                                            DocumentRetrieveResponse.Section.Subsection.Rule
                                                .EvidenceType
                                                .DOCUMENT
                                        )
                                        .immutable(true)
                                        .renewalCadenceDays(90L)
                                        .build()
                                )
                                .text("text")
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .build()

        assertThat(documentRetrieveResponse.id()).isEqualTo("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
        assertThat(documentRetrieveResponse.dateCreated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(documentRetrieveResponse.dateUpdated())
            .isEqualTo(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
        assertThat(documentRetrieveResponse.frameworkId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(documentRetrieveResponse.title())
            .isEqualTo("EU AI Act -- Regulation (EU) 2024/1689")
        assertThat(documentRetrieveResponse.sections().getOrNull())
            .containsExactly(
                DocumentRetrieveResponse.Section.builder()
                    .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                    .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .number("Article 9")
                    .sortOrder(0L)
                    .title("Risk management system")
                    .ruleCount(0L)
                    .addRule(
                        DocumentRetrieveResponse.Section.Rule.builder()
                            .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                            .name("Monitoring enabled")
                            .scope(DocumentRetrieveResponse.Section.Rule.Scope.PROJECT)
                            .type(DocumentRetrieveResponse.Section.Rule.Type.PLATFORM)
                            .automationParams(
                                DocumentRetrieveResponse.Section.Rule.AutomationParams.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .automationType("monitoring_mode_enabled")
                            .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                            .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                            .deactivated(true)
                            .description(
                                "Each project must have Openlayer monitoring mode enabled."
                            )
                            .evidenceType(
                                DocumentRetrieveResponse.Section.Rule.EvidenceType.DOCUMENT
                            )
                            .immutable(true)
                            .renewalCadenceDays(90L)
                            .build()
                    )
                    .addSubsection(
                        DocumentRetrieveResponse.Section.Subsection.builder()
                            .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                            .number("9.2")
                            .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .sortOrder(0L)
                            .title("Identification of known and foreseeable risks")
                            .ruleCount(0L)
                            .addRule(
                                DocumentRetrieveResponse.Section.Subsection.Rule.builder()
                                    .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                    .name("Monitoring enabled")
                                    .scope(
                                        DocumentRetrieveResponse.Section.Subsection.Rule.Scope
                                            .PROJECT
                                    )
                                    .type(
                                        DocumentRetrieveResponse.Section.Subsection.Rule.Type
                                            .PLATFORM
                                    )
                                    .automationParams(
                                        DocumentRetrieveResponse.Section.Subsection.Rule
                                            .AutomationParams
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .automationType("monitoring_mode_enabled")
                                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                    .deactivated(true)
                                    .description(
                                        "Each project must have Openlayer monitoring mode enabled."
                                    )
                                    .evidenceType(
                                        DocumentRetrieveResponse.Section.Subsection.Rule
                                            .EvidenceType
                                            .DOCUMENT
                                    )
                                    .immutable(true)
                                    .renewalCadenceDays(90L)
                                    .build()
                            )
                            .text("text")
                            .build()
                    )
                    .text("text")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentRetrieveResponse =
            DocumentRetrieveResponse.builder()
                .id("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .title("EU AI Act -- Regulation (EU) 2024/1689")
                .addSection(
                    DocumentRetrieveResponse.Section.builder()
                        .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                        .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .number("Article 9")
                        .sortOrder(0L)
                        .title("Risk management system")
                        .ruleCount(0L)
                        .addRule(
                            DocumentRetrieveResponse.Section.Rule.builder()
                                .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                .name("Monitoring enabled")
                                .scope(DocumentRetrieveResponse.Section.Rule.Scope.PROJECT)
                                .type(DocumentRetrieveResponse.Section.Rule.Type.PLATFORM)
                                .automationParams(
                                    DocumentRetrieveResponse.Section.Rule.AutomationParams.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .automationType("monitoring_mode_enabled")
                                .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                                .deactivated(true)
                                .description(
                                    "Each project must have Openlayer monitoring mode enabled."
                                )
                                .evidenceType(
                                    DocumentRetrieveResponse.Section.Rule.EvidenceType.DOCUMENT
                                )
                                .immutable(true)
                                .renewalCadenceDays(90L)
                                .build()
                        )
                        .addSubsection(
                            DocumentRetrieveResponse.Section.Subsection.builder()
                                .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                                .number("9.2")
                                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .sortOrder(0L)
                                .title("Identification of known and foreseeable risks")
                                .ruleCount(0L)
                                .addRule(
                                    DocumentRetrieveResponse.Section.Subsection.Rule.builder()
                                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                        .name("Monitoring enabled")
                                        .scope(
                                            DocumentRetrieveResponse.Section.Subsection.Rule.Scope
                                                .PROJECT
                                        )
                                        .type(
                                            DocumentRetrieveResponse.Section.Subsection.Rule.Type
                                                .PLATFORM
                                        )
                                        .automationParams(
                                            DocumentRetrieveResponse.Section.Subsection.Rule
                                                .AutomationParams
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .automationType("monitoring_mode_enabled")
                                        .dateCreated(
                                            OffsetDateTime.parse("2026-03-22T11:31:01.185Z")
                                        )
                                        .dateUpdated(
                                            OffsetDateTime.parse("2026-03-22T11:31:01.185Z")
                                        )
                                        .deactivated(true)
                                        .description(
                                            "Each project must have Openlayer monitoring mode enabled."
                                        )
                                        .evidenceType(
                                            DocumentRetrieveResponse.Section.Subsection.Rule
                                                .EvidenceType
                                                .DOCUMENT
                                        )
                                        .immutable(true)
                                        .renewalCadenceDays(90L)
                                        .build()
                                )
                                .text("text")
                                .build()
                        )
                        .text("text")
                        .build()
                )
                .build()

        val roundtrippedDocumentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentRetrieveResponse),
                jacksonTypeRef<DocumentRetrieveResponse>(),
            )

        assertThat(roundtrippedDocumentRetrieveResponse).isEqualTo(documentRetrieveResponse)
    }
}
