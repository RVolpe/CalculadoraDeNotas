package com.example.calculadoradenotas

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados

        btCalcular.setOnClickListener{
            val nota1 :Int = parseInt(nota1.toString())
             val nota2 :Int = parseInt(nota2.toString())
            val media = (nota1 + nota2) / 2
            val faltas :Int = parseInt(faltas.toString())

            if (media >= 6 && faltas <= 10) {
                resultado.setText("Aluno foi Aprovado!" + "/n" + "Nota Final: " + media + "/n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno foi Reprovado!" + "/n" + "Nota Final: "+ media + "/n" + "Faltas: "+ faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }
}