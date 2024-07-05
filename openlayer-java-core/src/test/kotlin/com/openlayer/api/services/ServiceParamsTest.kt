// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.jsonMapper
import com.openlayer.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OpenlayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OpenlayerOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun projectsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
            ProjectCreateParams.builder()
                .name("My Project")
                .taskType(ProjectCreateParams.TaskType.LLM_BASE)
                .description("My project description.")
                .gitRepo(
                    ProjectCreateParams.GitRepo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dateConnected(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gitAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .gitId(123L)
                        .name("string")
                        .private_(true)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .slug("string")
                        .url("string")
                        .branch("string")
                        .rootDir("string")
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            ProjectCreateResponse.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                .developmentGoalCount(123L)
                .goalCount(123L)
                .inferencePipelineCount(123L)
                .links(
                    ProjectCreateResponse.Links.builder()
                        .app(
                            "https://app.openlayer.com/myWorkspace/3fa85f64-5717-4562-b3fc-2c963f66afa6"
                        )
                        .build()
                )
                .monitoringGoalCount(123L)
                .name("My Project")
                .source(ProjectCreateResponse.Source.WEB)
                .taskType(ProjectCreateResponse.TaskType.LLM_BASE)
                .versionCount(123L)
                .workspaceId("055fddb1-261f-4654-8598-f6347ee46a09")
                .description("My project description.")
                .gitRepo(
                    ProjectCreateResponse.GitRepo.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dateConnected(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gitAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .gitId(123L)
                        .name("string")
                        .private_(true)
                        .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .slug("string")
                        .url("string")
                        .branch("string")
                        .rootDir("string")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.projects().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}
