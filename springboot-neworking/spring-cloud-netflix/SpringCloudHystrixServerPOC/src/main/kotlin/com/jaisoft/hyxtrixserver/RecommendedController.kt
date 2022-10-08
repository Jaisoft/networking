package com.jaisoft.hyxtrixserver

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping



@RestController
class RecommendedController {

    @RequestMapping(value = "/recommended")
    fun readingList(): String {
        return "Hystrix Server"
    }
}
