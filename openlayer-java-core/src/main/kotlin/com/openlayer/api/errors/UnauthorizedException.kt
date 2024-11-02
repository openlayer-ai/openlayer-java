package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(401, headers, body, error)
