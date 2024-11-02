package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class BadRequestException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(400, headers, body, error)
