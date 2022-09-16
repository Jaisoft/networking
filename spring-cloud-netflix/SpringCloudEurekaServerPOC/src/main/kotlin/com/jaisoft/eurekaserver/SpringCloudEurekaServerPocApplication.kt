package com.jaisoft.eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringCloudEurekaServerPocApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudEurekaServerPocApplication>(*args)
}
