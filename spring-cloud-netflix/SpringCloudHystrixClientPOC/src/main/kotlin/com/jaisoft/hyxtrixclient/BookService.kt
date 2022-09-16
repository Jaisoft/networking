package com.jaisoft.hyxtrixclient

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.net.URI

@Service
class BookService(val restTemplate : RestTemplate) {

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    fun readingList(): String? {
        val uri = URI.create("http://localhost:8090/recommended")

        return this.restTemplate.getForObject(uri, String::class.java)
    }

    fun fallbackMethod(): String {
        return "Cloud Native Java (O'Reilly)"
    }

}
