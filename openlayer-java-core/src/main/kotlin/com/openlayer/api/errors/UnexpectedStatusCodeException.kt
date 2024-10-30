package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(statusCode, headers, body, error)
