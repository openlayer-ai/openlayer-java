// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.services.blocking.CommitService
import com.openlayer.api.services.blocking.InferencePipelineService
import com.openlayer.api.services.blocking.ProjectService
import com.openlayer.api.services.blocking.StorageService

interface OpenlayerClient {

    fun async(): OpenlayerClientAsync

    fun projects(): ProjectService

    fun commits(): CommitService

    fun inferencePipelines(): InferencePipelineService

    fun storage(): StorageService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
