package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {

    lateinit var txtResultado: TextView
    lateinit var txtRes: TextView
    lateinit var btnCero: Button
    lateinit var btnUno: Button
    lateinit var btnDos: Button
    lateinit var btnTres: Button
    lateinit var btnCuatro: Button
    lateinit var btnCinco: Button
    lateinit var btnSeis: Button
    lateinit var btnSiete: Button
    lateinit var btnOcho: Button
    lateinit var btnNueve: Button
    lateinit var btnMas: Button
    lateinit var btnMenos: Button
    lateinit var btnDivide: Button
    lateinit var btnMultip: Button
    lateinit var btnPoint: Button
    lateinit var btnAC: Button
    lateinit var btnEquals: Button
    lateinit var converter: Converter
    lateinit var calculadora:Calc

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)
        btnCero = findViewById(R.id.btnCero)
        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnCuatro = findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve= findViewById(R.id.btnNueve)
        btnMas = findViewById(R.id.btnPlus)
        btnMultip = findViewById(R.id.btnMultip)
        btnDivide = findViewById(R.id.btnDivide)
        btnMenos = findViewById(R.id.btnMinus)
        btnPoint = findViewById(R.id.btnPoint)
        btnAC = findViewById(R.id.AC)
        btnEquals = findViewById(R.id.btnEquals)
        txtRes = findViewById(R.id.res)
        converter = Converter()
        calculadora = Calc()

        var exp: String = ""

        btnCero.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "0"
            txtResultado.text = exp
        }

        btnUno.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "1"
            txtResultado.text = exp
        }

        btnDos.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "2"
            txtResultado.text = exp
        }

        btnTres.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "3"
            txtResultado.text = exp
        }
        btnCuatro.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "4"
            txtResultado.text = exp
        }

        btnCinco.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "5"
            txtResultado.text = exp
        }

        btnSeis.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "6"
            txtResultado.text = exp
        }

        btnSiete.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "7"
            txtResultado.text = exp
        }

        btnOcho.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "8"
            txtResultado.text = exp
        }

        btnNueve.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "9"
            txtResultado.text = exp
        }



        btnMas.setOnClickListener{
            exp = txtResultado.text.toString()
            var exp1 = txtRes.text.toString()
            if(!(exp.isBlank() and exp.isEmpty())){
                exp1 += exp + "+"
                txtRes.text = exp1
                txtResultado.text=""
            }
        }

        btnMenos.setOnClickListener{
            exp = txtResultado.text.toString()
            var exp1 = txtRes.text.toString()
            if(!(exp.isBlank() and exp.isEmpty())){
                exp1 += exp + "-"
                txtRes.text = exp1
                txtResultado.text=""
            }
        }

        btnMultip.setOnClickListener{
            exp = txtResultado.text.toString()
            var exp1 = txtRes.text.toString()
            if(!(exp.isBlank() and exp.isEmpty())){
                exp1 += exp + "x"
                txtRes.text = exp1
                txtResultado.text=""
            }
        }

        btnDivide.setOnClickListener{
            exp = txtResultado.text.toString()
            var exp1 = txtRes.text.toString()
            if(!(exp.isBlank() and exp.isEmpty())){
                exp1 += exp + "÷"
                txtRes.text = exp1
                txtResultado.text=""
            }
        }

        btnPoint.setOnClickListener{
            exp = txtResultado.text.toString()
            exp += "."
            txtResultado.text = exp
        }

        btnAC.setOnClickListener{
            txtResultado.text = ""
            txtRes.text = ""
        }

        btnEquals.setOnClickListener{
            exp = txtResultado.text.toString()
            var exp1 = txtRes.text.toString()
            if(!(exp.isBlank() and exp.isEmpty())){
                exp1 += exp
                txtRes.text = exp1
            }
            print(exp1)
            var infixToPostfix = converter.convert(exp1)
            var temp = calculadora.calcular(infixToPostfix)
            txtResultado.text = temp
            txtRes.text = ""
        }

    }
}