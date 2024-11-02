package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

abstract class OpenlayerServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OpenlayerError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OpenlayerException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OpenlayerError = error
}
