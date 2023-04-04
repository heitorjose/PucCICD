package com.example.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class PucController {

    @RequestMapping("/api/hello", method = [RequestMethod.GET])
    fun hello(): String {
        return "Hello CI/CD PUC 04/04/2023"
    }
}