package com.jaisoft.zuultesting

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class BookController {

    @RequestMapping(value = "/available")
    fun available(): String {
        return "Spring in Action"
    }

    @RequestMapping(value = "/checked-out")
    fun checkedOut(): String {
        return "Spring Boot in Action"
    }

}