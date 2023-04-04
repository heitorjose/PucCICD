package com.example.service.impl

import com.example.service.Calc
import org.springframework.stereotype.Service

@Service
class CalcImpl: Calc {
    override fun sum(x: Int, y: Int): Int {
       return x+y
    }
}