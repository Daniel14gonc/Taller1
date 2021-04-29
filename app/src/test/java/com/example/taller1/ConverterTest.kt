package com.example.taller1

import org.junit.Test

import org.junit.Assert.*

class ConverterTest {

    @Test
    fun convert() {
        var converter: Converter = Converter()

        var res = converter.convert("5+2x6")
        print(res)
    }
}