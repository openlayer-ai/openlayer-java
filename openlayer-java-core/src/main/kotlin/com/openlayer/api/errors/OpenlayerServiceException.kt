package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

abstract class OpenlayerServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: OpenlayerError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OpenlayerException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): OpenlayerError = error
}
