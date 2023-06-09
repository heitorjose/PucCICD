package com.example.service.impl

import com.example.service.Calc
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class CalcImplTest() {
    // Atualização de versão
    @Test
    fun sum() {
        val calc = mock<Calc>()
        Mockito.`when`(calc. sum(1,2)).thenReturn(3)
        assertEquals(calc.sum(1,2),4)
    }
}