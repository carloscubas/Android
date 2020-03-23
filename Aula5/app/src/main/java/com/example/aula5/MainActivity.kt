package com.example.aula5

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gasolina * 0.7 < Alcool = Gasolina é melhor
        // senão, alcool é melhor

        botao.setOnClickListener{
            val valorGasolina = gasolina.text.toString().toDouble()
            val valorAlcool = alcool.text.toString().toDouble()
            var calculo = if(valorGasolina * 0.7 < valorAlcool){"Gasolina é melhor"} else {"Alcool é melhor"}
            Toast.makeText(this@MainActivity, calculo, Toast.LENGTH_LONG).show();
        }
    }
}
