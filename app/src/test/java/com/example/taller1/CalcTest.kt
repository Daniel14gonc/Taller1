package com.example.taller1

import org.junit.Test

import org.junit.Assert.*

class CalcTest {

    @Test
    fun calcular() {
        var calculadora: Calc = Calc()
        var converter: Converter = Converter()
        var conv = converter.convert("5-6+2")
        var res = calculadora.calcular(conv)
        assertEquals("No funciono calcular", res, "1.0")
    }
}