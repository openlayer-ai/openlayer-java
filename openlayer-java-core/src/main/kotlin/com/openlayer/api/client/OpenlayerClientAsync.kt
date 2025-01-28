// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.client

import com.openlayer.api.services.async.CommitServiceAsync
import com.openlayer.api.services.async.InferencePipelineServiceAsync
import com.openlayer.api.services.async.ProjectServiceAsync
import com.openlayer.api.services.async.StorageServiceAsync

interface OpenlayerClientAsync {

    fun sync(): OpenlayerClient

    fun projects(): ProjectServiceAsync

    fun commits(): CommitServiceAsync

    fun inferencePipelines(): InferencePipelineServiceAsync

    fun storage(): StorageServiceAsync

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
