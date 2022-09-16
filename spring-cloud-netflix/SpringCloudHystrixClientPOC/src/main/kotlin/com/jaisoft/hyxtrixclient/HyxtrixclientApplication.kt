package com.jaisoft.hyxtrixclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

@SpringBootApplication
@EnableCircuitBreaker
class HyxtrixclientApplication

fun main(args: Array<String>) {
	runApplication<HyxtrixclientApplication>(*args)
}
