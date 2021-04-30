package com.example.taller1

import org.junit.Test

import org.junit.Assert.*

class CalcTest {

    @Test
    fun calcular() {
        var calculadora: Calc = Calc()
        var converter: Converter = Converter()
        var conv = converter.convert("5-6x2")
        println(conv)
        var res = calculadora.calcular(conv)
        assertEquals("No funciono calcular", res, "-7.0")
    }
}