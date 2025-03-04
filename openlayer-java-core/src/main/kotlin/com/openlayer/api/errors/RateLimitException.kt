package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: OpenlayerError) :
    OpenlayerServiceException(429, headers, body, error)
