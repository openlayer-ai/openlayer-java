package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException
constructor(
        headers: ListMultimap<String, String>,
        private val error: OpenlayerError,
) : OpenlayerServiceException(headers, "${error}") {
    override fun statusCode(): Int = 422
    fun error(): OpenlayerError = error
}
