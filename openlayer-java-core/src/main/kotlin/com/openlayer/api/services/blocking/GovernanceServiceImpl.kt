// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.blocking

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.blocking.governance.FrameworkService
import com.openlayer.api.services.blocking.governance.FrameworkServiceImpl
import com.openlayer.api.services.blocking.governance.RuleResultService
import com.openlayer.api.services.blocking.governance.RuleResultServiceImpl
import com.openlayer.api.services.blocking.governance.RuleService
import com.openlayer.api.services.blocking.governance.RuleServiceImpl
import com.openlayer.api.services.blocking.governance.RuleStatService
import com.openlayer.api.services.blocking.governance.RuleStatServiceImpl
import com.openlayer.api.services.blocking.governance.RuleTagService
import com.openlayer.api.services.blocking.governance.RuleTagServiceImpl
import java.util.function.Consumer

class GovernanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GovernanceService {

    private val withRawResponse: GovernanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val frameworks: FrameworkService by lazy { FrameworkServiceImpl(clientOptions) }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptions) }

    private val ruleResults: RuleResultService by lazy { RuleResultServiceImpl(clientOptions) }

    private val ruleStats: RuleStatService by lazy { RuleStatServiceImpl(clientOptions) }

    private val ruleTags: RuleTagService by lazy { RuleTagServiceImpl(clientOptions) }

    override fun withRawResponse(): GovernanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceService =
        GovernanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun frameworks(): FrameworkService = frameworks

    override fun rules(): RuleService = rules

    override fun ruleResults(): RuleResultService = ruleResults

    override fun ruleStats(): RuleStatService = ruleStats

    override fun ruleTags(): RuleTagService = ruleTags

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GovernanceService.WithRawResponse {

        private val frameworks: FrameworkService.WithRawResponse by lazy {
            FrameworkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleResults: RuleResultService.WithRawResponse by lazy {
            RuleResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleStats: RuleStatService.WithRawResponse by lazy {
            RuleStatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleTags: RuleTagService.WithRawResponse by lazy {
            RuleTagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceService.WithRawResponse =
            GovernanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun frameworks(): FrameworkService.WithRawResponse = frameworks

        override fun rules(): RuleService.WithRawResponse = rules

        override fun ruleResults(): RuleResultService.WithRawResponse = ruleResults

        override fun ruleStats(): RuleStatService.WithRawResponse = ruleStats

        override fun ruleTags(): RuleTagService.WithRawResponse = ruleTags
    }
}
