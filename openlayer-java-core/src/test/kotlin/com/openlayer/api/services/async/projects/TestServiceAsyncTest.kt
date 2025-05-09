// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async.projects

import com.openlayer.api.TestServerExtension
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClientAsync
import com.openlayer.api.core.JsonValue
import com.openlayer.api.models.projects.tests.TestCreateParams
import com.openlayer.api.models.projects.tests.TestListParams
import com.openlayer.api.models.projects.tests.TestUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.projects().tests()

        val testFuture =
            testServiceAsync.create(
                TestCreateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .commentCount(0L)
                    .creatorId("589ece63-49a2-41b4-98e1-10547761d4b0")
                    .dateArchived(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateCreated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .dateUpdated(OffsetDateTime.parse("2024-03-22T11:31:01.185Z"))
                    .description(
                        JsonValue.from("This test checks for duplicate rows in the dataset.")
                    )
                    .name("No duplicate rows")
                    .number(1L)
                    .originProjectVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .subtype(TestCreateParams.Subtype.DUPLICATE_ROW_COUNT)
                    .suggested(false)
                    .addThreshold(
                        TestCreateParams.Threshold.builder()
                            .insightName(TestCreateParams.Threshold.InsightName.DUPLICATE_ROW_COUNT)
                            .addInsightParameter(
                                TestCreateParams.Threshold.InsightParameter.builder()
                                    .name("column_name")
                                    .value(JsonValue.from("Age"))
                                    .build()
                            )
                            .measurement("duplicateRowCount")
                            .operator(TestCreateParams.Threshold.Operator.LESS_OR_EQUALS)
                            .thresholdMode(TestCreateParams.Threshold.ThresholdMode.AUTOMATIC)
                            .value(0.0)
                            .build()
                    )
                    .type(TestCreateParams.Type.INTEGRITY)
                    .archived(false)
                    .delayWindow(0.0)
                    .evaluationWindow(3600.0)
                    .usesMlModel(false)
                    .usesProductionData(false)
                    .usesReferenceDataset(false)
                    .usesTrainingDataset(false)
                    .usesValidationDataset(true)
                    .build()
            )

        val test = testFuture.get()
        test.validate()
    }

    @Test
    fun update() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.projects().tests()

        val testFuture =
            testServiceAsync.update(
                TestUpdateParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPayload(
                        TestUpdateParams.Payload.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .archived(false)
                            .description(
                                JsonValue.from(
                                    "This test checks for duplicate rows in the dataset."
                                )
                            )
                            .name("No duplicate rows")
                            .suggested(TestUpdateParams.Payload.Suggested.FALSE)
                            .addThreshold(
                                TestUpdateParams.Payload.Threshold.builder()
                                    .insightName(
                                        TestUpdateParams.Payload.Threshold.InsightName
                                            .DUPLICATE_ROW_COUNT
                                    )
                                    .addInsightParameter(
                                        TestUpdateParams.Payload.Threshold.InsightParameter
                                            .builder()
                                            .name("column_name")
                                            .value(JsonValue.from("Age"))
                                            .build()
                                    )
                                    .measurement("duplicateRowCount")
                                    .operator(
                                        TestUpdateParams.Payload.Threshold.Operator.LESS_OR_EQUALS
                                    )
                                    .thresholdMode(
                                        TestUpdateParams.Payload.Threshold.ThresholdMode.AUTOMATIC
                                    )
                                    .value(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val test = testFuture.get()
        test.validate()
    }

    @Test
    fun list() {
        val client =
            OpenlayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testServiceAsync = client.projects().tests()

        val testsFuture =
            testServiceAsync.list(
                TestListParams.builder()
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeArchived(true)
                    .originVersionId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .page(1L)
                    .perPage(1L)
                    .suggested(true)
                    .type(TestListParams.Type.INTEGRITY)
                    .usesProductionData(true)
                    .build()
            )

        val tests = testsFuture.get()
        tests.validate()
    }
}
