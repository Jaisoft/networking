package com.jaisoft.feigneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudFeignEurekaServerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignEurekaServerPocApplication.class, args);
	}

}
