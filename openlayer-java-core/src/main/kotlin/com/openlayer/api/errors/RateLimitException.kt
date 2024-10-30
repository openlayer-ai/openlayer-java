package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(429, headers, body, error)
