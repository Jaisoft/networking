package com.jaisoft.feignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/feign-server")
@EnableDiscoveryClient
public class SpringCloudFeignServerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignServerPocApplication.class, args);
	}

	@GetMapping(value = "/posts", produces = "application/json")
	ResponseEntity<List<Post>> getPosts(){

		ArrayList<Post> nombreArrayList = new ArrayList<>();

		for (int i=1; i<=10; i++){
			Post post = new Post();
			post.setId(i);
			 nombreArrayList.add(post);
		}

		return ResponseEntity.ok(nombreArrayList);
	}

}
