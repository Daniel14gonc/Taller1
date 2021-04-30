package com.example.taller1

import java.util.Stack;

class Converter(
    val operands: String = "+-x÷",
    val numbers:String = "0123456789"
) {

    private lateinit var stack:Stack<String>

    public fun convert(exp: String):String{
        stack = Stack<String>()
        var acu: String = ""
        for (c in exp){
            var element:String = c.toString()
            if(numbers.contains(element) or element.equals(".")){
                acu += element;
            }
            else if(operands.contains(element)){
                var temp = false
                while(!stack.isEmpty() and !temp){
                    if(checkPrecedence(element) <= checkPrecedence(stack.peek())){
                        acu += " " + stack.pop()
                    }
                    else{
                        temp = true
                    }
                }
                stack.push(element)
                acu += " "
            }
        }
        while (!stack.isEmpty()){
            acu += " " +stack.pop()
        }

        return acu
    }

    private fun checkPrecedence(item: String): Int{
        var pr1 = "+-"
        return if(pr1.contains(item)) 1 else 2

    }

}