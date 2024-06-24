package org.openlayer.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: OpenlayerError,
) : OpenlayerServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404

    fun error(): OpenlayerError = error
}
