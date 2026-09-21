// File generated from our OpenAPI spec by Stainless.

package com.openlayer.api.services.async

import com.openlayer.api.core.ClientOptions
import com.openlayer.api.services.async.governance.FrameworkServiceAsync
import com.openlayer.api.services.async.governance.FrameworkServiceAsyncImpl
import com.openlayer.api.services.async.governance.RuleResultServiceAsync
import com.openlayer.api.services.async.governance.RuleResultServiceAsyncImpl
import com.openlayer.api.services.async.governance.RuleServiceAsync
import com.openlayer.api.services.async.governance.RuleServiceAsyncImpl
import com.openlayer.api.services.async.governance.RuleStatServiceAsync
import com.openlayer.api.services.async.governance.RuleStatServiceAsyncImpl
import com.openlayer.api.services.async.governance.RuleTagServiceAsync
import com.openlayer.api.services.async.governance.RuleTagServiceAsyncImpl
import java.util.function.Consumer

class GovernanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GovernanceServiceAsync {

    private val withRawResponse: GovernanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val frameworks: FrameworkServiceAsync by lazy {
        FrameworkServiceAsyncImpl(clientOptions)
    }

    private val rules: RuleServiceAsync by lazy { RuleServiceAsyncImpl(clientOptions) }

    private val ruleResults: RuleResultServiceAsync by lazy {
        RuleResultServiceAsyncImpl(clientOptions)
    }

    private val ruleStats: RuleStatServiceAsync by lazy { RuleStatServiceAsyncImpl(clientOptions) }

    private val ruleTags: RuleTagServiceAsync by lazy { RuleTagServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GovernanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GovernanceServiceAsync =
        GovernanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun frameworks(): FrameworkServiceAsync = frameworks

    override fun rules(): RuleServiceAsync = rules

    override fun ruleResults(): RuleResultServiceAsync = ruleResults

    override fun ruleStats(): RuleStatServiceAsync = ruleStats

    override fun ruleTags(): RuleTagServiceAsync = ruleTags

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GovernanceServiceAsync.WithRawResponse {

        private val frameworks: FrameworkServiceAsync.WithRawResponse by lazy {
            FrameworkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleResults: RuleResultServiceAsync.WithRawResponse by lazy {
            RuleResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleStats: RuleStatServiceAsync.WithRawResponse by lazy {
            RuleStatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleTags: RuleTagServiceAsync.WithRawResponse by lazy {
            RuleTagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GovernanceServiceAsync.WithRawResponse =
            GovernanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun frameworks(): FrameworkServiceAsync.WithRawResponse = frameworks

        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        override fun ruleResults(): RuleResultServiceAsync.WithRawResponse = ruleResults

        override fun ruleStats(): RuleStatServiceAsync.WithRawResponse = ruleStats

        override fun ruleTags(): RuleTagServiceAsync.WithRawResponse = ruleTags
    }
}
