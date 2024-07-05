package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

abstract class OpenlayerServiceException
@JvmOverloads
constructor(
    private val headers: ListMultimap<String, String>,
    message: String? = null,
    cause: Throwable? = null
) : OpenlayerException(message, cause) {
    abstract fun statusCode(): Int

    fun headers(): ListMultimap<String, String> = headers
}
