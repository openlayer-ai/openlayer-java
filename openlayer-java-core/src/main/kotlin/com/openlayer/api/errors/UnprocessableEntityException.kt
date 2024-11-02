package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(422, headers, body, error)
