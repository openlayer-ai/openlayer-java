package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: OpenlayerError) :
    OpenlayerServiceException(403, headers, body, error)
