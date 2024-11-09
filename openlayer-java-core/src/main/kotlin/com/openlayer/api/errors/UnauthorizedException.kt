package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(401, headers, body, error)
