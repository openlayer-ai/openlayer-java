package com.openlayer.api.errors

open class OpenlayerException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
