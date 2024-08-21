// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.openlayer.api.services.blocking

import com.openlayer.api.services.blocking.storage.PresignedUrlService

interface StorageService {

    fun presignedUrl(): PresignedUrlService
}
