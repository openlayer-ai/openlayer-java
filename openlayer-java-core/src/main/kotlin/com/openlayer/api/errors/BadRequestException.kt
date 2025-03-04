package com.openlayer.api.errors

import com.openlayer.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: OpenlayerError) :
    OpenlayerServiceException(400, headers, body, error)
