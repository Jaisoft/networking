package com.jaime.zuul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@SpringBootApplication
class SpringCloudZuulProxyApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudZuulProxyApplication>(*args)
}
