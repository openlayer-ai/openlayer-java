// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.async.governance.FrameworkServiceAsync
import com.openlayer.api.services.async.governance.RuleResultServiceAsync
import com.openlayer.api.services.async.governance.RuleServiceAsync
import com.openlayer.api.services.async.governance.RuleStatServiceAsync
import com.openlayer.api.services.async.governance.RuleTagServiceAsync
import java.util.function.Consumer

interface GovernanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceServiceAsync

    fun frameworks(): FrameworkServiceAsync

    fun rules(): RuleServiceAsync

    fun ruleResults(): RuleResultServiceAsync

    fun ruleStats(): RuleStatServiceAsync

    fun ruleTags(): RuleTagServiceAsync

    /**
     * A view of [GovernanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceServiceAsync.WithRawResponse

        fun frameworks(): FrameworkServiceAsync.WithRawResponse

        fun rules(): RuleServiceAsync.WithRawResponse

        fun ruleResults(): RuleResultServiceAsync.WithRawResponse

        fun ruleStats(): RuleStatServiceAsync.WithRawResponse

        fun ruleTags(): RuleTagServiceAsync.WithRawResponse
    }
}
