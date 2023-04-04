package com.example.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
class PucController {

    @RequestMapping("/api/hello", method = [RequestMethod.GET])
    fun hello(): String {
        return "Heitor José de Andrade Lira - Cultura e Práticas Devops - Turma IEC_ASD_O3_T1_Online - CI/CD PUC 04/04/2023"
    }
}