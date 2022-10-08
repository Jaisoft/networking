package com.jaisoft.zuultesting

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import java.util.*


@RestController
@SpringBootApplication
class SayHelloController {

    private val log = LoggerFactory.getLogger(SpringCloudZuulTestingPocApplication::class.java)

    @RequestMapping(value = "/greeting")
    fun greet(): String {
        log.info("Access /greeting")

        val greetings = Arrays.asList("Hi there", "Greetings", "Salutations")
        val rand = Random()

        val randomNum = rand.nextInt(greetings.size)
        return greetings.get(randomNum)
    }

    @RequestMapping(value = "/")
    fun home(): String {
        log.info("Access /")
        return "Hi!"
    }

}