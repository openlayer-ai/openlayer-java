// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.models.governance.frameworks.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
        val documentListResponse =
            DocumentListResponse.builder()
                .addItem(
                    DocumentListResponse.Item.builder()
                        .id("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .title("EU AI Act -- Regulation (EU) 2024/1689")
                        .addSection(
                            DocumentListResponse.Item.Section.builder()
                                .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                                .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .number("Article 9")
                                .sortOrder(0L)
                                .title("Risk management system")
                                .ruleCount(0L)
                                .addRule(
                                    DocumentListResponse.Item.Section.Rule.builder()
                                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                        .name("Monitoring enabled")
                                        .scope(DocumentListResponse.Item.Section.Rule.Scope.PROJECT)
                                        .type(DocumentListResponse.Item.Section.Rule.Type.PLATFORM)
                                        .automationParams(
                                            DocumentListResponse.Item.Section.Rule.AutomationParams
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
                                            DocumentListResponse.Item.Section.Rule.EvidenceType
                                                .DOCUMENT
                                        )
                                        .immutable(true)
                                        .renewalCadenceDays(90L)
                                        .build()
                                )
                                .addSubsection(
                                    DocumentListResponse.Item.Section.Subsection.builder()
                                        .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                                        .number("9.2")
                                        .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sortOrder(0L)
                                        .title("Identification of known and foreseeable risks")
                                        .ruleCount(0L)
                                        .addRule(
                                            DocumentListResponse.Item.Section.Subsection.Rule
                                                .builder()
                                                .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                                .name("Monitoring enabled")
                                                .scope(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .Scope
                                                        .PROJECT
                                                )
                                                .type(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .Type
                                                        .PLATFORM
                                                )
                                                .automationParams(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .AutomationParams
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
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
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
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
                )
                .build()

        assertThat(documentListResponse.items())
            .containsExactly(
                DocumentListResponse.Item.builder()
                    .id("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
                    .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .title("EU AI Act -- Regulation (EU) 2024/1689")
                    .addSection(
                        DocumentListResponse.Item.Section.builder()
                            .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                            .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .number("Article 9")
                            .sortOrder(0L)
                            .title("Risk management system")
                            .ruleCount(0L)
                            .addRule(
                                DocumentListResponse.Item.Section.Rule.builder()
                                    .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                    .name("Monitoring enabled")
                                    .scope(DocumentListResponse.Item.Section.Rule.Scope.PROJECT)
                                    .type(DocumentListResponse.Item.Section.Rule.Type.PLATFORM)
                                    .automationParams(
                                        DocumentListResponse.Item.Section.Rule.AutomationParams
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
                                        DocumentListResponse.Item.Section.Rule.EvidenceType.DOCUMENT
                                    )
                                    .immutable(true)
                                    .renewalCadenceDays(90L)
                                    .build()
                            )
                            .addSubsection(
                                DocumentListResponse.Item.Section.Subsection.builder()
                                    .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                                    .number("9.2")
                                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .sortOrder(0L)
                                    .title("Identification of known and foreseeable risks")
                                    .ruleCount(0L)
                                    .addRule(
                                        DocumentListResponse.Item.Section.Subsection.Rule.builder()
                                            .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                            .name("Monitoring enabled")
                                            .scope(
                                                DocumentListResponse.Item.Section.Subsection.Rule
                                                    .Scope
                                                    .PROJECT
                                            )
                                            .type(
                                                DocumentListResponse.Item.Section.Subsection.Rule
                                                    .Type
                                                    .PLATFORM
                                            )
                                            .automationParams(
                                                DocumentListResponse.Item.Section.Subsection.Rule
                                                    .AutomationParams
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
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
                                                DocumentListResponse.Item.Section.Subsection.Rule
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentListResponse =
            DocumentListResponse.builder()
                .addItem(
                    DocumentListResponse.Item.builder()
                        .id("4a6c8e0f-1b2d-4e3f-9a5b-6c7d8e9f0a1b")
                        .dateCreated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .dateUpdated(OffsetDateTime.parse("2026-03-22T11:31:01.185Z"))
                        .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .title("EU AI Act -- Regulation (EU) 2024/1689")
                        .addSection(
                            DocumentListResponse.Item.Section.builder()
                                .id("2e4f6a8c-9b1d-4c3e-8f5a-7b9c0d1e2f3a")
                                .documentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .number("Article 9")
                                .sortOrder(0L)
                                .title("Risk management system")
                                .ruleCount(0L)
                                .addRule(
                                    DocumentListResponse.Item.Section.Rule.builder()
                                        .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                        .name("Monitoring enabled")
                                        .scope(DocumentListResponse.Item.Section.Rule.Scope.PROJECT)
                                        .type(DocumentListResponse.Item.Section.Rule.Type.PLATFORM)
                                        .automationParams(
                                            DocumentListResponse.Item.Section.Rule.AutomationParams
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
                                            DocumentListResponse.Item.Section.Rule.EvidenceType
                                                .DOCUMENT
                                        )
                                        .immutable(true)
                                        .renewalCadenceDays(90L)
                                        .build()
                                )
                                .addSubsection(
                                    DocumentListResponse.Item.Section.Subsection.builder()
                                        .id("1d3f5a7b-8c9e-4b2d-9f6a-0c1e2d3f4a5b")
                                        .number("9.2")
                                        .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .sortOrder(0L)
                                        .title("Identification of known and foreseeable risks")
                                        .ruleCount(0L)
                                        .addRule(
                                            DocumentListResponse.Item.Section.Subsection.Rule
                                                .builder()
                                                .id("7c9a1e2b-3d4f-4a5b-8c6d-7e8f9a0b1c2d")
                                                .name("Monitoring enabled")
                                                .scope(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .Scope
                                                        .PROJECT
                                                )
                                                .type(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .Type
                                                        .PLATFORM
                                                )
                                                .automationParams(
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
                                                        .AutomationParams
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
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
                                                    DocumentListResponse.Item.Section.Subsection
                                                        .Rule
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
                )
                .build()

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
