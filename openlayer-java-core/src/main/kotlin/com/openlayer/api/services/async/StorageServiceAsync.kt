// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.services.async.storage.PresignedUrlServiceAsync

interface StorageServiceAsync {

    fun presignedUrl(): PresignedUrlServiceAsync
}
