// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.services.blocking.storage.PresignedUrlService

interface StorageService {

    fun presignedUrl(): PresignedUrlService
}
