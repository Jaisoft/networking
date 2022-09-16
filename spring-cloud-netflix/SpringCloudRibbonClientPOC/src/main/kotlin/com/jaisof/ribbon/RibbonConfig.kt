package com.jaisof.ribbon

import org.springframework.context.annotation.Bean
import com.netflix.client.config.IClientConfig
import com.netflix.loadbalancer.IPing
import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.PingUrl
import com.netflix.loadbalancer.AvailabilityFilteringRule


import org.springframework.context.annotation.Configuration
import com.netflix.loadbalancer.WeightedResponseTimeRule
import com.netflix.loadbalancer.NoOpPing







@Configuration
class RibbonConfig {



    @Bean
    fun ribbonPing(): IPing {
        return NoOpPing()
    }

    @Bean
    fun ribbonRule(): IRule {
        return WeightedResponseTimeRule()
    }

}