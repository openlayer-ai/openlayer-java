package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException
constructor(
    headers: ListMultimap<String, String>,
    private val error: OpenlayerError,
) : OpenlayerServiceException(headers, "${error}") {
    override fun statusCode(): Int = 429

    fun error(): OpenlayerError = error
}
