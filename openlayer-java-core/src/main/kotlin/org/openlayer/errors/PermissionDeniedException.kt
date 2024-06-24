package org.openlayer.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: OpenlayerError,
) : OpenlayerServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403

    fun error(): OpenlayerError = error
}
