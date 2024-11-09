package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(statusCode, headers, body, error)
