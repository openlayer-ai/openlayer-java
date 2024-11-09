package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(422, headers, body, error)
