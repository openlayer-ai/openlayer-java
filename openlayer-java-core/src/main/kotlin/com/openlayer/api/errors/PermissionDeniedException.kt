package com.openlayer.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OpenlayerError,
) : OpenlayerServiceException(403, headers, body, error)
