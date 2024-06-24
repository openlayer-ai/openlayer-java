package org.openlayer.errors

open class OpenlayerException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
