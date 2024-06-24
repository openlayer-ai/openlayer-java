// File generated from our OpenAPI spec by Stainless.

package org.openlayer.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.openlayer.TestServerExtension
import org.openlayer.client.okhttp.OpenlayerOkHttpClient
import org.openlayer.models.*

@ExtendWith(TestServerExtension::class)
class ProjectServiceTest {

    @Test
    fun callList() {
        val client =
            OpenlayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.projects()
        val projectListResponse =
            projectService.list(
                ProjectListParams.builder()
                    .name("string")
                    .page(123L)
                    .perPage(100L)
                    .taskType(ProjectListParams.TaskType.LLM_BASE)
                    .build()
            )
        println(projectListResponse)
        projectListResponse.validate()
    }
}
