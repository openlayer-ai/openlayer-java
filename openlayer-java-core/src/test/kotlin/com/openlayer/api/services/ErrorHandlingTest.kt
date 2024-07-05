// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.openlayer.api.client.OpenlayerClient
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.JsonString
import com.openlayer.api.core.jsonMapper
import com.openlayer.api.errors.BadRequestException
import com.openlayer.api.errors.InternalServerException
import com.openlayer.api.errors.NotFoundException
import com.openlayer.api.errors.OpenlayerError
import com.openlayer.api.errors.OpenlayerException
import com.openlayer.api.errors.PermissionDeniedException
import com.openlayer.api.errors.RateLimitException
import com.openlayer.api.errors.UnauthorizedException
import com.openlayer.api.errors.UnexpectedStatusCodeException
import com.openlayer.api.errors.UnprocessableEntityException
import com.openlayer.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val OPENLAYER_ERROR: OpenlayerError =
        OpenlayerError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: OpenlayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun projectsCreate200() {
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
                .build()

        val expected =
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

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.projects().create(params)).isEqualTo(expected)
    }

    @Test
    fun projectsCreate400() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun projectsCreate401() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun projectsCreate403() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun projectsCreate404() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun projectsCreate422() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    OPENLAYER_ERROR
                )
            })
    }

    @Test
    fun projectsCreate429() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun projectsCreate500() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), OPENLAYER_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(OPENLAYER_ERROR)))
        )

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(OPENLAYER_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OpenlayerException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.projects().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), OpenlayerError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OpenlayerError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
