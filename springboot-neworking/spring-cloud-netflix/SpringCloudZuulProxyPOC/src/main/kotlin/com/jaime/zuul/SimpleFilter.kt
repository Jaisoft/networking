package com.jaime.zuul

import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.ZuulFilter
import org.slf4j.LoggerFactory

class SimpleFilter : ZuulFilter() {

    override fun filterType(): String {
        return "pre"
    }

    override fun filterOrder(): Int {
        return 1
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun run(): Any? {

        val ctx = RequestContext.getCurrentContext()
        val request = ctx.request

        log.info(String.format("%s request to %s", request.method, request.requestURL.toString()))

        return null
    }

    companion object {

        private val log = LoggerFactory.getLogger(SimpleFilter::class.java)
    }

}