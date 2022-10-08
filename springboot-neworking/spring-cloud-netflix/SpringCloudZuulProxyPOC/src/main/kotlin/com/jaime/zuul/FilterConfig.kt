package com.jaime.zuul

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FilterConfig {


    @Bean
    fun simpleFilter(): SimpleFilter {
        return SimpleFilter()
    }
}