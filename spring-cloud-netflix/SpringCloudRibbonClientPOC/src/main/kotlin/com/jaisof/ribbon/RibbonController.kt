package com.jaisof.ribbon


import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate


@RestController
class RibbonController(val restTemplate: RestTemplate)  {

    @RequestMapping("/hi")
    fun hi(@RequestParam(value = "name", defaultValue = "Artaban") name: String): String {
        val greeting = this.restTemplate.getForObject("http://SpringCloudRibbonTestingPOC/greeting", String::class.java)
        return String.format("%s, %s!", greeting, name)
    }
}