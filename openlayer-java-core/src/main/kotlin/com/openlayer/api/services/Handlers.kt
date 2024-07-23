@file:JvmName("Handlers")

package com.openlayer.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openlayer.api.core.http.BinaryResponseContent
import com.openlayer.api.core.http.HttpResponse
import com.openlayer.api.core.http.HttpResponse.Handler
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
import java.io.InputStream
import java.io.OutputStream

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandler

@JvmSynthetic internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return BinaryResponseContentImpl(response)
    }
}

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw OpenlayerException("Error reading response", e)
            }
        }
    }
}

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<OpenlayerError> {
    val handler = jsonHandler<OpenlayerError>(jsonMapper)

    return object : Handler<OpenlayerError> {
        override fun handle(response: HttpResponse): OpenlayerError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return OpenlayerError.builder().build()
            }
        }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<OpenlayerError>): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}

class BinaryResponseContentImpl
constructor(
    private val response: HttpResponse,
) : BinaryResponseContent {
    override fun contentType(): String? {
        return response.headers().get("Content-Type").firstOrNull()
    }

    override fun body(): InputStream {
        return response.body()
    }

    override fun writeTo(outputStream: OutputStream) {
        response.body().copyTo(outputStream)
    }

    override fun close() {
        response.body().close()
    }
}
