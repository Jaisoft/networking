package com.jaisoft.eurekaclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class EurekaclientApplication

fun main(args: Array<String>) {
	runApplication<EurekaclientApplication>(*args)
}
