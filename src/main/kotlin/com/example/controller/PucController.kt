package com.example.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class PucController {

    @RequestMapping("/api/hello", method = [RequestMethod.GET])
    fun hello(): String {
        return "Hello CI/CD PUC Falhou"
    }
}