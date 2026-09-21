// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.blocking.governance.FrameworkService
import com.openlayer.api.services.blocking.governance.RuleResultService
import com.openlayer.api.services.blocking.governance.RuleService
import com.openlayer.api.services.blocking.governance.RuleStatService
import com.openlayer.api.services.blocking.governance.RuleTagService
import java.util.function.Consumer

interface GovernanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceService

    fun frameworks(): FrameworkService

    fun rules(): RuleService

    fun ruleResults(): RuleResultService

    fun ruleStats(): RuleStatService

    fun ruleTags(): RuleTagService

    /** A view of [GovernanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceService.WithRawResponse

        fun frameworks(): FrameworkService.WithRawResponse

        fun rules(): RuleService.WithRawResponse

        fun ruleResults(): RuleResultService.WithRawResponse

        fun ruleStats(): RuleStatService.WithRawResponse

        fun ruleTags(): RuleTagService.WithRawResponse
    }
}
