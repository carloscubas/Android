package com.example.aula6

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao.setOnClickListener{
            val intencao = Intent(this@MainActivity, ResultadoActivity::class.java)
            intencao.putExtra("vrGasolina",gasolina.text.toString() )
            intencao.putExtra("vrAlcool",alcool.text.toString() )
            startActivity(intencao)
        }

        site.setOnClickListener{
            val url = Uri.parse("https://google.com.br")
            val intencao = Intent(Intent.ACTION_VIEW, url)
            startActivity(intencao)
        }

        ligacao.setOnClickListener{
            val telefone = Uri.parse("tel:99999999")
            val intencao = Intent(Intent.ACTION_VIEW, telefone)
            startActivity(intencao)
        }
    }
}
