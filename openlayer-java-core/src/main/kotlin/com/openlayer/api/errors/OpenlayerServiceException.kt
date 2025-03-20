// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.errors

import com.openlayer.api.core.JsonValue
import com.openlayer.api.core.http.Headers

abstract class OpenlayerServiceException
protected constructor(message: String, cause: Throwable? = null) :
    OpenlayerException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
