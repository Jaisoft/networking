package com.jaisof.ribbon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@RibbonClient(name = "SpringCloudRibbonServerPOC", configuration = arrayOf(RibbonConfig::class))
class RibbonApplication

fun main(args: Array<String>) {
	runApplication<RibbonApplication>(*args)
}


