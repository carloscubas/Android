package com.example.aula6

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if(intent != null){
            val valorGasolina = intent.getStringExtra("vrGasolina")
            val valorAlcool = intent.getStringExtra("vrAlcool")

            if(valorGasolina.toDouble() * 0.7 < valorAlcool.toDouble()){
                resultado.text = "Gasolina é melhor"
            } else {
                resultado.text = "Alcool é melhor"
            }
        }
    }

}
