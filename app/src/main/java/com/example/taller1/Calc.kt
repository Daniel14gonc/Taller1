package com.example.taller1

import java.util.*

class Calc(
    val operands: String = "+-x÷",
    val numbers:String = "0123456789"

) {
    private lateinit var stack: Stack<Double>

    public fun calcular(exp: String): String{
        stack = Stack<Double>()
        var acu = ""
        for (c in exp) {
            var element: String = c.toString()
            if(numbers.contains(element) or element.equals(".")){
                acu+= element
            }
            else if(operands.contains(element)){
                postFixEvaluation(element)
            }
            else if(element.isBlank()){
                if(!(acu.isBlank() or acu.isEmpty())){
                    var temp = acu.toDouble()
                    stack.push(temp)
                    acu = ""
                }
            }
        }

        return stack.pop().toString()
    }

    public fun postFixEvaluation(item: String){
        var op2 = stack.pop()
        val op1 = stack.pop()
        when(item){
            "+" ->{
                stack.push(op1+op2)
            }
            "-" ->{
                stack.push(op1-op2)
            }
            "x" ->{
                stack.push(op1*op2)
            }
            "÷" -> {
                stack.push(op1 / op2)
            }
        }
    }
}