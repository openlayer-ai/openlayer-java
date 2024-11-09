package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(404, headers, body, error)
