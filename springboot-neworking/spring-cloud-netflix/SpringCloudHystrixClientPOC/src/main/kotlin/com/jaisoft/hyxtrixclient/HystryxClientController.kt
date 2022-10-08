package com.jaisoft.hyxtrixclient

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HystryxClientController(val bookService: BookService) {

    @RequestMapping("/to-read")
    fun toRead(): String? {
        return bookService.readingList()
    }
}