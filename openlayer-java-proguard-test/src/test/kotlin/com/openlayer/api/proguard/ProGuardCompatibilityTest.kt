// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.client.okhttp.OpenlayerOkHttpClient
import com.openlayer.api.core.jsonMapper
import com.openlayer.api.models.inferencepipelines.data.DataStreamResponse
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/openlayer-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = OpenlayerOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.projects()).isNotNull()
        assertThat(client.commits()).isNotNull()
        assertThat(client.inferencePipelines()).isNotNull()
        assertThat(client.storage()).isNotNull()
    }

    @Test
    fun dataStreamResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val dataStreamResponse =
            DataStreamResponse.builder().success(DataStreamResponse.Success.TRUE).build()

        val roundtrippedDataStreamResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataStreamResponse),
                jacksonTypeRef<DataStreamResponse>(),
            )

        assertThat(roundtrippedDataStreamResponse).isEqualTo(dataStreamResponse)
    }
}
