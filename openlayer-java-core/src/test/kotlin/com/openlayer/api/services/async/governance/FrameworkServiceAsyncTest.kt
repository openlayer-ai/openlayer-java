// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.governance

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.governance.frameworks.FrameworkCreateParams
import com.openlayer.api.models.governance.frameworks.FrameworkExportParams
import com.openlayer.api.models.governance.frameworks.FrameworkListParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectRuleStatsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListProjectsParams
import com.openlayer.api.models.governance.frameworks.FrameworkListRulesParams
import com.openlayer.api.models.governance.frameworks.FrameworkUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FrameworkServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val frameworkFuture =
            frameworkServiceAsync.create(
                FrameworkCreateParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("EU AI Act")
                    .description("Requirements for high-risk AI systems under the EU AI Act.")
                    .enabled(true)
                    .projectSelector(
                        FrameworkCreateParams.ProjectSelector.builder()
                            .addMatch(
                                FrameworkCreateParams.ProjectSelector.Match.builder()
                                    .property(
                                        FrameworkCreateParams.ProjectSelector.Match.Property
                                            .RISK_LEVEL
                                    )
                                    .value(JsonValue.from(listOf("high", "critical")))
                                    .operator("operator")
                                    .build()
                            )
                            .build()
                    )
                    .addTag("regulation")
                    .addTag("eu")
                    .build()
            )

        val framework = frameworkFuture.get()
        framework.validate()
    }

    @Test
    fun retrieve() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val frameworkFuture = frameworkServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val framework = frameworkFuture.get()
        framework.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val frameworkFuture =
            frameworkServiceAsync.update(
                FrameworkUpdateParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .avatar(
                        FrameworkUpdateParams.Avatar.builder()
                            .type(FrameworkUpdateParams.Avatar.Type.EMOJI)
                            .value("🧭")
                            .build()
                    )
                    .description("Requirements for high-risk AI systems under the EU AI Act.")
                    .enabled(true)
                    .extendedDescription(
                        FrameworkUpdateParams.ExtendedDescription.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .href("href")
                    .name("EU AI Act")
                    .projectSelector(
                        FrameworkUpdateParams.ProjectSelector.builder()
                            .addMatch(
                                FrameworkUpdateParams.ProjectSelector.Match.builder()
                                    .property(
                                        FrameworkUpdateParams.ProjectSelector.Match.Property
                                            .RISK_LEVEL
                                    )
                                    .value(JsonValue.from(listOf("high", "critical")))
                                    .operator("operator")
                                    .build()
                            )
                            .build()
                    )
                    .addTag("regulation")
                    .addTag("eu")
                    .build()
            )

        val framework = frameworkFuture.get()
        framework.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val frameworksFuture =
            frameworkServiceAsync.list(
                FrameworkListParams.builder()
                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .completionOperator(FrameworkListParams.CompletionOperator.IS)
                    .completionValue(0L)
                    .enabled(true)
                    .includeRuleStats(true)
                    .page(1L)
                    .perPage(1L)
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .searchQuery("searchQuery")
                    .sortColumn(FrameworkListParams.SortColumn.NAME)
                    .addTag("string")
                    .build()
            )

        val frameworks = frameworksFuture.get()
        frameworks.validate()
    }

    @Test
    fun export() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val responseFuture =
            frameworkServiceAsync.export(
                FrameworkExportParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listProjectRuleStats() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val responseFuture =
            frameworkServiceAsync.listProjectRuleStats(
                FrameworkListProjectRuleStatsParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asc(true)
                    .page(1L)
                    .perPage(1L)
                    .sortColumn(FrameworkListProjectRuleStatsParams.SortColumn.PROJECT_NAME)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listProjects() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val responseFuture =
            frameworkServiceAsync.listProjects(
                FrameworkListProjectsParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listRules() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val frameworkServiceAsync = client.governance().frameworks()

        val responseFuture =
            frameworkServiceAsync.listRules(
                FrameworkListRulesParams.builder()
                    .frameworkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
